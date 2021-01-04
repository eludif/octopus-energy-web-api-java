package com.wrapper.octopusenergy.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ISODateFormatter {
    public static String getFormattedDateTimeString(LocalDateTime availableAt) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");
        ZonedDateTime zonedDateTime = availableAt.atZone(ZoneId.of("UTC"));
        return zonedDateTime.format(df);
    }
}
