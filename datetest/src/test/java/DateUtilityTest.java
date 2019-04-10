import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilityTest {

    @Test
    public void getToday() {
        Date result = DateUtility.getToday();

        Calendar calculatedToday = new GregorianCalendar();
        calculatedToday.setTime(result);
        int calculatedDay = calculatedToday.get(Calendar.DAY_OF_MONTH);
        int calculatedMonth = calculatedToday.get(Calendar.MONTH);
        int calculatedYear = calculatedToday.get(Calendar.YEAR);

        Calendar realToday = new GregorianCalendar();

        int currentDay = realToday.get(Calendar.DAY_OF_MONTH);
        int currentMonth = realToday.get(Calendar.MONTH);
        int currentYear = realToday.get(Calendar.YEAR);


        assertThat(calculatedDay, is(currentDay));
        assertThat(calculatedMonth, is(currentMonth));
        assertThat(calculatedYear, is(currentYear));
    }

    @Test
    public void addThreeMonths() {
        Date result = DateUtility.addThreeMonths(new Date());

        Calendar calculatedDate = new GregorianCalendar();
        calculatedDate.setTime(result);
        int calculatedDay = calculatedDate.get(Calendar.DAY_OF_MONTH);
        int calculatedMonth = calculatedDate.get(Calendar.MONTH);
        int calculatedYear = calculatedDate.get(Calendar.YEAR);

        Calendar realDate = new GregorianCalendar();

        realDate.add(Calendar.MONTH, 3);
        int currentDay = realDate.get(Calendar.DAY_OF_MONTH);
        int currentMonth = realDate.get(Calendar.MONTH);
        int currentYear = realDate.get(Calendar.YEAR);


        assertThat(calculatedDay, is(currentDay));
        assertThat(calculatedMonth, is(currentMonth));
        assertThat(calculatedYear, is(currentYear));
    }

}
