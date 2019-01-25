package com.tfernando;

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DateUtilTests {

	@Test
	public void testForYearDifference() {

		int expectedAge = 2;

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -2);

		DateUtil dateutil = new DateUtil();
		int actualAge = dateutil.calculateAge(calendar.getTime());

		assertEquals(expectedAge, actualAge);
	}

	@Test
	public void testForMothDifference() {

		int expectedAge = 2;

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -2);
		calendar.add(Calendar.MONTH, -2);

		DateUtil dateutil = new DateUtil();
		int actualAge = dateutil.calculateAge(calendar.getTime());

		assertEquals(expectedAge, actualAge);
	}
	
	@Test
	public void testForDateDifference() {

		int expectedAge = 2;

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -2);
		calendar.add(Calendar.DAY_OF_MONTH, -2);

		DateUtil dateutil = new DateUtil();
		int actualAge = dateutil.calculateAge(calendar.getTime());

		assertEquals(expectedAge, actualAge);
	}
}
