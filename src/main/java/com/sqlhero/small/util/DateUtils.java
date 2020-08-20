package com.sqlhero.small.util;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 类描述：时间操作定义类
 *
 * @date 2020/8/20 17:10
 * @author sqlhero
 * @version 1.0
 * */
public class DateUtils extends PropertyEditorSupport {

    /**
     * 获取当天结束最后一秒字符串表示
     * @date 2020/6/9 14:44
     * @return java.lang.String
     */
    public static String getTodayEndTime() {
        // 当前时间毫秒数
        long current = System.currentTimeMillis();
        // 今天零点零分零秒的毫秒数
        long zeroT = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        // 今天23点59分59秒的毫秒数
        long endT = zeroT + 24 * 60 * 60 * 1000 - 1;
        String end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endT);
        return end;
    }

    /**
     * 获取当天开始字符串表示
     * @date 2020/6/9 14:45
     * @return java.lang.String
     */
    public static String getTodayStartTime() {
        //当前时间毫秒数
        long current = System.currentTimeMillis();
        //今天零点零分零秒的毫秒数
        long zeroT = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        String zero = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(zeroT);
        return zero;
    }

}
