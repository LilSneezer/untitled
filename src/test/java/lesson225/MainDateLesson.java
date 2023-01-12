package lesson225;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainDateLesson {
    public static void main(String[] args) {

        //задание 1
        long time = System.currentTimeMillis(); //время начала выполнения кода ниже, задание 3
        long timeForDate = System.currentTimeMillis();
        Date birthDate = new Date("Feb 17 10:00:00 1996");
        System.out.println("ДР с помощью класса Date: " + birthDate);
        System.out.printf("Время выполнения класса Date - %s ms \n", System.currentTimeMillis() - timeForDate); //задание 4

        long timeForLocalDate = System.currentTimeMillis();
        LocalDate birthDate1 = LocalDate.of(1996, 2, 17);
        System.out.println("ДР с помощью класса: " + birthDate1);
        System.out.printf("Время выполнения класса LocalDate - %s ms \n", System.currentTimeMillis() - timeForLocalDate); //задание 4

        long timeForLocalDateTime = System.currentTimeMillis();
        LocalDateTime birthDate2 = LocalDateTime.of(1996, 2, 17, 10, 0, 0);
        System.out.println("ДР с помощью класса LocalDateTime: " + birthDate2);
        System.out.printf("Время выполнения класса LocalDateTime - %s ms \n", System.currentTimeMillis() - timeForLocalDateTime); //задание 4

        long timeForZonedDateTime = System.currentTimeMillis();
        ZonedDateTime birthDate3 = ZonedDateTime.parse("1996-02-17T07:00:00Z[Europe/Moscow]");
        System.out.println("ДР с помощью класса ZonedDateTime: " + birthDate3);
        System.out.printf("Время выполнения класса ZonedDateTime - %s ms \n", System.currentTimeMillis() - timeForZonedDateTime); //задание 4

        long timeForCalendar = System.currentTimeMillis();
        Calendar birthDate4 = new GregorianCalendar(1996, 1, 17);
        System.out.println("ДР с помощью класса Calendar: " + birthDate4.getTime());
        System.out.printf("Время выполнения класса Calendar - %s ms \n", System.currentTimeMillis() - timeForCalendar); //задание 4
        System.out.printf("Alltime - %s ms \n", System.currentTimeMillis() - time); //подсчет времени выполнения кода, задание 3

        //задание 2
        //разница для класса Date
        Date dateNow = new Date();
        long diff = dateNow.getTime() - birthDate.getTime();
        int yearsCount = (int) (diff / 86400000 / 365);
        int monthCount = (int) (diff / 86400000 % 365 / 30);
        int daysCount = yearsCount % 30;
        System.out.printf("Разница для класса Date: \n" +
                        "Количество лет: %d \n" +
                        "Количество месяцев: %d \n" +
                        "Количество дней: %d \n",
                yearsCount, monthCount, daysCount
        );

        //разница для класса LocalDate
        LocalDate localDateNow = LocalDate.now();

        Duration durationLocalDate = Duration.between(localDateNow.atStartOfDay(), birthDate1.atStartOfDay());

        System.out.printf("Разница для класса LocalDate: \n" +
                        "Количество лет: %d \n" +
                        "Количество дней: %d \n" +
                        "Количество часов: %d \n" +
                        "Количество минут: %d \n",
                durationLocalDate.abs().toDays() / 365,
                durationLocalDate.abs().toDays() % 365,
                durationLocalDate.abs().toHours() % 24,
                durationLocalDate.abs().toMinutes() % 60
        );

        //разница для класса LocalDateTime
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Duration duration = Duration.between(localDateTimeNow, birthDate2);

        System.out.printf("Разница для класса LocalDateTime: \n" +
                        "Количество лет: %d \n" +
                        "Количество дней: %d \n" +
                        "Количество часов: %d \n" +
                        "Количество минут: %d \n",
                duration.abs().toDays() / 365,
                duration.abs().toDays() % 365,
                duration.abs().toHours() % 24,
                duration.abs().toMinutes() % 60
        );

        //разница для класса ZonedDateTime
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        Duration durationZonedDateTime = Duration.between(zonedDateTimeNow, birthDate3);

        System.out.printf("Разница для класса ZonedDateTime: \n" +
                        "Количество лет: %d \n" +
                        "Количество дней: %d \n" +
                        "Количество часов: %d \n" +
                        "Количество минут: %d \n",
                durationZonedDateTime.abs().toDays() / 365,
                durationZonedDateTime.abs().toDays() % 365,
                durationZonedDateTime.abs().toHours() % 24,
                durationZonedDateTime.abs().toMinutes() % 60
        );

//        разница для класса GregorianCalendar
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendarNow = GregorianCalendar.getInstance();
        int calYear = calendarNow.get(Calendar.YEAR);
        int calMonth = calendarNow.get(Calendar.MONTH) + 1;
        int calDay = calendarNow.get(Calendar.DAY_OF_YEAR);
        int calYear1 = birthDate4.get(Calendar.YEAR);
        int calMonth1 = birthDate4.get(Calendar.MONTH) + 1;
        int calDay1 = birthDate4.get(Calendar.DAY_OF_YEAR);
        System.out.printf("Разница для класса GregorianCalendar: \n" + "Количество лет: %d \n" +
                        "Количество месяцев: %d \n" +
                        "Количество дней: %d \n",
                calYear - calYear1,
                calMonth - calMonth1,
                calDay - calDay1);
//        System.out.println("monthDiff " + monthDiff(calYear, calYear1, calMonth, calMonth1, calDay, calDay1));
    }

//    public static int monthDiff(int startYear, int endYear, int startMonth, int endMonth, int startDay, int endDay) {
//        int dayDiff;
//        int monthDiff;
//        if (startDay > endDay) {
//            dayDiff = startDay - endDay;
//            return dayDiff;
//        } else if (startDay < endDay) {
//            startMonth -= 1;
//            dayDiff = startDay + 30 - endDay;
//            return dayDiff;
//            }
//        if (startMonth > endMonth) {
//            monthDiff = startMonth - endMonth;
//            return monthDiff;
//        } else if (startMonth < endMonth) {
//            startYear -= 1;
//            monthDiff = startMonth + 12 - endMonth;
//            return monthDiff;
//        }
//        return startYear - endYear;
//    }
}
