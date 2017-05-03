package br.com.github.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class UseDateTimeFormatter {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(df.format(currentDate));

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
        System.out.println(tf.format(currentTime));

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dtf.format(currentDateTime));

        DateTimeFormatter dfLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(dfLong.format(currentDate));

        DateTimeFormatter dfShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dfShort.format(currentDate));

        String enLong = dfLong.withLocale(Locale.ENGLISH).format(currentDateTime);
        String enShort = dfShort.withLocale(Locale.ENGLISH).format(currentDateTime);

        System.out.println(enLong);
        System.out.println(enShort);

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral("||")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("||")
                .appendValue(ChronoField.DAY_OF_WEEK);

        System.out.println(dtfb.toFormatter().format(currentDateTime));
    }
}
