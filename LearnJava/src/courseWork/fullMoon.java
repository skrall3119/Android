/* Variables:
 * - todaysDate, LocalDateTime: Gets current date.
 * - dtf, DateTimeFormatter: formats times nicely.
 * - lastFullMoon, LocalDateTime: date of the last full moon.
 * - nextFullMoon, LocalDateTime: date of the next full moon.
 * Process:
 * - Print Current day.
 * - Print next day of full moon.
 */

package courseWork;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class fullMoon {

	public static void main(String[] args) {
		LocalDateTime todaysDate = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Todays date is: " + dtf.format(todaysDate));
		LocalDateTime lastFullMoon = LocalDateTime.of(2018, Month.AUGUST, 26, 4, 58);
		LocalDateTime nextFullMoon = lastFullMoon.plusDays(29).plusHours(12).plusMinutes(44);
		System.out.println("The next full moon will be approximately on: " + dtf.format(nextFullMoon));
	} 

}
