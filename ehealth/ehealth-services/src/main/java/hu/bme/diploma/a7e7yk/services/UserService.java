package hu.bme.diploma.a7e7yk.services;

import hu.bme.diploma.a7e7yk.dao.web.UserDao;
import hu.bme.diploma.a7e7yk.datamodel.entity.WebUser;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.commons.codec.digest.DigestUtils;

@Stateless
@LocalBean
public class UserService {

  @EJB
  UserDao userDao;

  public WebUserDto loginUser(String username, String password) throws EhealthException {
    WebUser user = userDao.findWebUserByName(username);
    String sha1Pass = DigestUtils.sha1Hex(password);
    if (!sha1Pass.equals(user.getPassword())) {
      throw new EhealthException("User not found");
    }
    return convert(user);
  }

  public WebUserDto findUserById(Integer id) throws EhealthException {
    return convert(userDao.find(WebUser.class, id));
  }

  private WebUserDto convert(WebUser user) throws EhealthException {
    if (user == null) {
      throw new EhealthException("User not exists");
    }
    WebUserDto dto = new WebUserDto();
    dto.setUserGroup(user.getUserGroup().name());
    dto.setUserId(user.getUserId());
    dto.setId(user.getId());
    switch (user.getUserGroup()) {
      case Citizen:
        dto.setSsn(user.getCitizen().getSsn());
        dto.setName(user.getCitizen().getName());
        break;
      case ClinicalPersonal:

        break;
      default:
        throw new EhealthException("Not valid user group");
    }
    return dto;
  }
}
