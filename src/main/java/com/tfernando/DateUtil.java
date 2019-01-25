/* Util class will parse the date of birth, format the date for display,
 * and calculate the age
 */

package com.tfernando;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	// parse the date
	public Date parseDate(String birthdayString) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date birthDate = formatter.parse(birthdayString);

			return birthDate;
		} catch (ParseException parseEx) {
			parseEx.printStackTrace();
			Date date = new Date();
			return date;
		}
	}

	// format the date
	public String FormatBithDate(String birthdayString) {

		Date birthday = parseDate(birthdayString);
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		return formatter.format(birthday);
	}

	// calculate age
	public int calculateAge(Date dateOfBirth) {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		birthDate.setTime(dateOfBirth);

		if (birthDate.after(today)) {
			throw new IllegalArgumentException("You don't exist yet");
		}

		int todayYear = today.get(Calendar.YEAR);
		int birthYear = birthDate.get(Calendar.YEAR);
		int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
		int birthDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
		int todayMonth = today.get(Calendar.MONTH);
		int birthMonth = birthDate.get(Calendar.MONTH);
		int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
		int birthDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
		int age = todayYear - birthYear;

		// If birth date is greater than today's date (after 2 days adjustment of leap
		// year) then decrement age by one year
		if ((birthDayOfYear - todayDayOfYear > 3) || (birthMonth > todayMonth)) {
			age--;
			// If birth date and todays date are of same month and birth day of month is
			// greater than todays day of month then decrement age
		} else if ((birthMonth == todayMonth) && (birthDayOfMonth > todayDayOfMonth)) {
			age--;
		}

		return age;
	}

}
