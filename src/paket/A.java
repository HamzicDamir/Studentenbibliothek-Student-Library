package paket;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.joda.time.Days;
import org.joda.time.ReadableInstant;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Calendar calendar1 = Calendar.getInstance();
	      Calendar calendar2 = Calendar.getInstance();
	      java.util.Date date1 = calendar1.getTime();
	      java.util.Date date2 = calendar2.getTime();
	      java.util.Date trenutniDat =  Calendar.getInstance().getTime();
	      //calendar1.set(2012, 04, 02);
	     // calendar2.set(2012, 04, 04);
	     /* long milsecs1= calendar1.getTimeInMillis();
	      long milsecs2 = calendar2.getTimeInMillis();
	      long diff = milsecs2 - milsecs1;
	      long dsecs = diff / 1000;
	      long dminutes = diff / (60 * 1000);
	      long dhours = diff / (60 * 60 * 1000);*/
	      //long ddays =calendar1.getTime() / (24 * 60 * 60 * 1000);
	      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	      Calendar cal = Calendar.getInstance();
		  //System.out.println(dateFormat.format(cal.getTime()));

	     // System.out.println(ddays);
	      //System.out.println( Calendar.getInstance().getTime() );
	     /* static long getDateDiff(date1,date2, TimeUnit timeUnit) {
	    	    long diffInMillies = date2.getTime() - date1.getTime();
	    	   timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	    	}*/
	     /* ReadableInstant instant;
	      Date date = new Date(instant.getMillis());
	      DateTime dateTime = new DateTime(date1);
	      DateTime dateTime1 = new DateTime(date2);
	      int days = Days.day
	    		  .daysBetween(date1, date2).getDays();
	      System.out.println(days);
*/
	}

}