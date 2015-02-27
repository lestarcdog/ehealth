package test;

import java.util.Calendar;

public class Timeconversion {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    long modhour = 3600;
    long seconds = c.getTimeInMillis() / 1000;
    long mins = seconds / 60;
    long hours = mins / 60;
    System.out.println("Hours: " + hours % 24 + " Mins: " + mins % 60 + " Secs: " + seconds % 60);

    long millis = c.getTimeInMillis() / 1000;

    int base = (int) (millis / (3600));
    int hour = (int) (millis % (3600));
    System.out.println(millis);
    System.out.println("Base: " + base);
    System.out.println("Hour: " + hour);

    System.out.println(1 << 10);



  }

}
