package io.github.clamber.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeUtils {

    /**
     * 本月第一天
     * @return LocalDateTime
     */
    public static LocalDateTime firstDateTimeOfMonth() {
        return LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()), LocalTime.MIN);
    }

    /**
     * 本月最后一天
     * @return LocalDateTime
     */
    public static LocalDateTime lastDateTimeOfMonth() {
        return LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()), LocalTime.MAX);
    }

    /**
     * 本周第一天
     * @return LocalDateTime
     */
    public static LocalDateTime firstDateTimeOfWeek() {
        return LocalDateTime.now().with(DayOfWeek.MONDAY);
    }

    /**
     * 本周最后一天
     * @return LocalDateTime
     */
    public static LocalDateTime lastDateTimeOfWeek() {
        return LocalDateTime.now().with(DayOfWeek.SUNDAY);
    }
}
