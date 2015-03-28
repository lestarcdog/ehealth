package hu.bme.aut.diploma.cep;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class CEPTest {

	public static void main(String[] args) {
		KieBaseConfiguration kconf = KieServices.Factory.get().newKieBaseConfiguration();
		kconf.setOption(EventProcessingOption.STREAM);

		KieContainer container = KieServices.Factory.get().getKieClasspathContainer();
		KieBase kbase = container.newKieBase(kconf);
		KieSession ks = kbase.newKieSession();
		
		ks.fireAllRules();
	}

}
