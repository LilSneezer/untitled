package lesson225;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainDateLesson {
    public static void main(String[] args) {

        //задание 1
        long time = System.currentTimeMillis(); //время начала выполнения кода ниже, задание 3
        long timeForDate = System.currentTimeMillis();
        Date birthDate = new Date("Feb 17 10:00:00 1996");
        System.out.println("Date: ДР в формате dd-MM-yyyy: " + new SimpleDateFormat("dd-MM-yyyy").format(birthDate));
        System.out.println("Date: ДР в формате yyyy-MM-dd: " + new SimpleDateFormat("yyyy-MM-dd").format(birthDate));
        System.out.println("Date: ДР в формате dd-MM-yyyy HH:mm: " + new SimpleDateFormat("dd-MM-yyyy HH:mm").format(birthDate));
        System.out.println("Date: ДР в формате dd-MM-yyyy HH:mm:ss: " + new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(birthDate));
        System.out.println("Date: ДР в формате dd-MM-yyyy HH:mm:ss Z: " + new SimpleDateFormat("dd-MM-yyyy HH:mm:ss Z").format(birthDate));
        System.out.printf("Время выполнения класса Date - %s ms \n", System.currentTimeMillis() - timeForDate); //задание 4

        long timeForLocalDate = System.currentTimeMillis();
        String date = "1996-02-17";
        LocalDate birthDate1 = LocalDate.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("y/M/d");
        System.out.println("LocalDate: ДР в формате yyyy-MM-dd: " + birthDate1);
        System.out.println("LocalDate: ДР в формате dd-MM-yyyy: " + formatter.format(birthDate1));
        System.out.println("LocalDate: ДР в формате dd-MMMM-yyyy: " + formatter1.format(birthDate1));
        System.out.println("LocalDate: ДР в формате dd-MMM-yy: " + formatter2.format(birthDate1));
        System.out.println("LocalDate: ДР в формате dd-MMM-yy: " + formatter3.format(birthDate1));
        System.out.printf("Время выполнения класса LocalDate - %s ms \n", System.currentTimeMillis() - timeForLocalDate); //задание 4

        long timeForLocalDateTime = System.currentTimeMillis();
        String date1 = "1996-02-17T10:00:00";
        LocalDateTime birthDate2 = LocalDateTime.parse(date1);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd-MMM-yy E");
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("y/M/d EEEE");
        System.out.println("LocalDateTime: ДР в формате yyyy-MM-ddTHH:mm:ss: " + birthDate2);
        System.out.println("LocalDateTime: ДР в формате dd-MM-yyyy HH:mm: " + formatter4.format(birthDate2));
        System.out.println("LocalDateTime: ДР в формате dd-MM-yyyy HH:mm:ss: " + formatter5.format(birthDate2));
        System.out.println("LocalDateTime: ДР в формате dd-MM-yyyy E: " + formatter6.format(birthDate2));
        System.out.println("LocalDateTime: ДР в формате dd-MM-yyyy EEEE: " + formatter7.format(birthDate2));
        System.out.printf("Время выполнения класса LocalDateTime - %s ms \n", System.currentTimeMillis() - timeForLocalDateTime); //задание 4

        long timeForZonedDateTime = System.currentTimeMillis();
        ZonedDateTime birthDate3 = ZonedDateTime.parse("1996-02-17T07:00:00Z[Europe/Moscow]");
        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm z");
        DateTimeFormatter formatter9 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm a");
        DateTimeFormatter formatter10 = DateTimeFormatter.ofPattern("dd-MMM-yy W E");
        DateTimeFormatter formatter11 = DateTimeFormatter.ofPattern("y/MM/d EEEE");
        System.out.println("ZonedDateTime: ДР в формате yyyy-MM-ddTHH:mm:ss: " + birthDate3);
        System.out.println("ZonedDateTime: ДР в формате dd-MM-yyyy HH:mm z: " + formatter8.format(birthDate3));
        System.out.println("ZonedDateTime: ДР в формате dd-MM-yyyy HH:mm AM: " + formatter9.format(birthDate3));
        System.out.println("ZonedDateTime: ДР в формате dd-MM-yyyy W E: " + formatter10.format(birthDate3));
        System.out.println("ZonedDateTime: ДР в формате y/MM/d EEEE: " + formatter11.format(birthDate3));
        System.out.printf("Время выполнения класса ZonedDateTime - %s ms \n", System.currentTimeMillis() - timeForZonedDateTime); //задание 4

        long timeForCalendar = System.currentTimeMillis();
        Calendar birthDate4 = new GregorianCalendar(1996, 1, 17, 10, 0, 0);
        SimpleDateFormat formatter12 = new SimpleDateFormat("dd-MM-yyyy HH:mm z");
        SimpleDateFormat formatter13 = new SimpleDateFormat("dd-MMMM-yyyy HH:mm a");
        SimpleDateFormat formatter14 = new SimpleDateFormat("dd-MMM-yy W E");
        SimpleDateFormat formatter15 = new SimpleDateFormat("y/MM/d EEEE");
        System.out.println("GregorianCalendar: ДР в формате E MM dd HH:mm:ss z yyyy: " + birthDate4.getTime());
        System.out.println("GregorianCalendar: ДР в формате dd-MM-yyyy HH:mm z: " + formatter12.format(birthDate4.getTime()));
        System.out.println("GregorianCalendar: ДР в формате dd-MMMM-yyyy HH:mm a: " + formatter13.format(birthDate4.getTime()));
        System.out.println("GregorianCalendar: ДР в формате dd-MMM-yy W E: " + formatter14.format(birthDate4.getTime()));
        System.out.println("GregorianCalendar: ДР в формате y/MM/d EEEE: " + formatter15.format(birthDate4.getTime()));
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
                        "Количество месяцев: %d \n" +
                        "Количество дней: %d \n",
                durationLocalDate.abs().toDays() / 365,
                durationLocalDate.abs().toDays() % 365 / 30,
                durationLocalDate.abs().toDays() % 365 % 30
        );

        //разница для класса LocalDateTime
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Duration duration = Duration.between(localDateTimeNow, birthDate2);

        System.out.printf("Разница для класса LocalDateTime: \n" +
                        "Количество лет: %d \n" +
                        "Количество месяцев: %d \n" +
                        "Количество дней: %d \n",
                duration.abs().toDays() / 365,
                duration.abs().toDays() % 365 / 30,
                duration.abs().toDays() % 365 % 30
        );

        //разница для класса ZonedDateTime
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        Duration durationZonedDateTime = Duration.between(zonedDateTimeNow, birthDate3);

        System.out.printf("Разница для класса ZonedDateTime: \n" +
                        "Количество лет: %d \n" +
                        "Количество месяцев: %d \n" +
                        "Количество дней: %d \n",
                durationZonedDateTime.abs().toDays() / 365,
                durationZonedDateTime.abs().toDays() % 365 / 30,
                durationZonedDateTime.abs().toDays() % 365 % 30
        );

//        разница для класса GregorianCalendar
        Calendar calendarNow = GregorianCalendar.getInstance();

        long dateDiff = calendarNow.getTimeInMillis() - birthDate4.getTimeInMillis();

        System.out.printf("Разница для класса Calendar: \n" +
                        "Количество лет: %d \n" +
                        "Количество месяцев: %d \n" +
                        "Количество дней: %d \n",
                dateDiff / 31536000000L,
                dateDiff % 31536000000L / 2678400000L,
                dateDiff % 31536000000L % 2678400000L / 86400000
        );
    }
}
