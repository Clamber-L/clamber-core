package io.github.clamber.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

    /**
     * 当前时间格式化(默认格式：yyyy-MM-dd HH:mm:ss)
     * @return String
     */
    public static String datetimeFormatOfDefault() {
        return DateTimeUtils.datetimeFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 当前时间格式化(特定格式)
     * @param patten 时间格式
     * @return String
     */
    public static String datetimeFormat(String patten) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patten));
    }
}
