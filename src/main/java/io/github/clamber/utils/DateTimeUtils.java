package io.github.clamber.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTimeUtils {

    /**
     * 某月第一天
     * @param localDateTime 当月日期
     * @return LocalDateTime
     */
    private static LocalDateTime firstOfMonth(LocalDateTime localDateTime) {
        return LocalDateTime.of(localDateTime.toLocalDate().with(TemporalAdjusters.firstDayOfMonth()), LocalTime.MIN);
    }

    /**
     * 某月第一天
     * @param localDate 当月日期
     * @return LocalDateTime
     */
    private static LocalDateTime firstOfMonth(LocalDate localDate) {
        return LocalDateTime.of(localDate.with(TemporalAdjusters.firstDayOfMonth()), LocalTime.MIN);
    }

    /**
     * 本月第一天
     * @return LocalDateTime
     */
    public static LocalDateTime firstDatetimeOfThisMonth() {
        return firstOfMonth(LocalDateTime.now());
    }

    /**
     * 某月最后一天
     * @param localDateTime 当前日期
     * @return LocalDateTime
     */
    public static LocalDateTime lastOfMonth(LocalDateTime localDateTime) {
        return LocalDateTime.of(localDateTime.toLocalDate().with(TemporalAdjusters.lastDayOfMonth()), LocalTime.MAX);
    }

    /**
     * 某月最后一天
     * @param localDate 当前日期
     * @return LocalDateTime
     */
    public static LocalDateTime lastOfMonth(LocalDate localDate) {
        return LocalDateTime.of(localDate.with(TemporalAdjusters.lastDayOfMonth()), LocalTime.MAX);
    }

    /**
     * 当月最后一天
     * @return LocalDateTime
     */
    private static LocalDateTime lastOfThisMonth() {
        return lastOfMonth(LocalDateTime.now());
    }


    /**
     * 日期的周一
     * @param localDateTime 日期
     * @return LocalDateTime
     */
    public static LocalDateTime firstOfWeek(LocalDateTime localDateTime) {
        return localDateTime.with(DayOfWeek.MONDAY);
    }

    /**
     * 本周的周一
     * @return LocalDateTime
     */
    public static LocalDateTime firstOfThisWeek() {
        return firstOfWeek(LocalDateTime.now());
    }

    /**
     * 日期的周末
     * @param localDateTime 日期
     * @return LocalDateTime
     */
    public static LocalDateTime lastOfWeek(LocalDateTime localDateTime) {
        return localDateTime.with(DayOfWeek.SUNDAY);
    }

    /**
     * 本周的周末
     * @return LocalDateTime
     */
    private static LocalDateTime lastOfThisWeek() {
        return lastOfWeek(LocalDateTime.now());
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

    /**
     * 特定日期，格式，格式化
     * @param localDateTime 日期
     * @param patten 格式
     * @return String
     */
    private static String datetimeFormat(LocalDateTime localDateTime, String patten) {
        return localDateTime.format(DateTimeFormatter.ofPattern(patten));
    }
}
