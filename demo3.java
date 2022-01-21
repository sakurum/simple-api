
/**
 * 指定された日付が今日(システム年月日)以降かどうか
 * @param date
 * @return
 */
public static boolean isTodayOrFreshnessSystemDate(final Date date) {
    if (date != null
            && DateUtils.isSameYearMonthDate(date, DateUtils.getSystemDate())
            || DateUtils.isFreshnessThanOrEqualToBaseDate(DateUtils.getSystemDate(), date)) {
        return true;
    } else {
        return false;
    }
}
