package br.com.github.java8.time;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class UseZoneDateTime {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dtf.format(LocalDateTime.now()));

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
        System.out.println(dtf.format(gmt));

        ZonedDateTime americaSp = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(dtf.format(americaSp));

        Predicate<String> zonePredicate = zone -> zone.contains("Sao_Paulo");
        Set<String> availableZones = ZoneId.getAvailableZoneIds();

        availableZones.stream().filter(zonePredicate).forEach(System.out::println);
     }
}
