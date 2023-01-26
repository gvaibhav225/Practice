import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());//shows millisec passed since 1jan 1970
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);//gives yaer passed 
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		Calendar c=Calendar.getInstance();
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeInMillis());
		System.out.println(c.getTimeZone());
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		GregorianCalendar cal=new GregorianCalendar();
		System.out.println(cal.isLeapYear(2020));
		LocalDate e=LocalDate.now();	
		System.out.println(e);
		LocalTime ef=LocalTime.now();	
		System.out.println(ef);
		LocalDateTime eefe=LocalDateTime.now();	
		System.out.println(eefe);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String q=eefe.format(dtf);
		System.out.println(q);
		LocalDate yest=e.minusDays(1);
		System.out.println(yest);  //similarly can do for month,year, and also use plus instead of minus
		LocalDate date1=LocalDate.of(2020, 10, 10);
		System.out.println(date1.isLeapYear());
		ZoneId z=ZoneId.of("Asia/Calcutta");
		LocalTime t3=LocalTime.now(z);
		System.out.println(t3);
		String g="2020-11-10";
LocalDate t4=LocalDate.parse(g);
		System.out.println(t4);

	}

}
