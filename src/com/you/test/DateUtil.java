package com.you.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class DateUtil {
	public static String DATE_PATTERN_GMT ="yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
	public static String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static String DATE_PATTERN3 = "yyyyMMdd";
	public static String DATE_PATTERN4 = "yyyyMMddHHmmss";
	public static String DATE_PATTERN5 = "yyyy-MM-dd";
	public static String formatDate(Date date) {
		return formatDateByFormat(date, "yyyy-MM-dd");
	}
	/**
	 * 时间戳转换成日期格式字符串
	 * @param miliSeconds 精确到毫秒秒的字符串
	 * @return
	 */
	public static String timeStamp2Date(String miliSeconds,String format) {
		if(miliSeconds == null || miliSeconds.isEmpty() || miliSeconds.equals("null")){
			return "";
		}
		if(format == null || format.isEmpty()) format = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(miliSeconds)));
	}
	/**
	 *
	 * Description: 将日期字符串解析为Date对象
	 *
	 * @Version1.0 2014年12月17日 上午11:08:26 by 吕翔 (lvxiang@dangdang.com) 创建
	 * @param dateStr
	 * @return
	 */
	public static Date parseStringToDate(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			date = new Date();
		}
		return date;
	}
	
	public static Date parseStringToDate2(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN5);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			date = new Date();
		}
		return date;
	}

	public static String formatDateByFormat(Date date, String format) {
		String result = "";
		if (date != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				result = sdf.format(date);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public static Date getDateByFormat(String date, String format) {
		Date result = null;
		if (date != null && !date.trim().equals("")) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				return sdf.parse(date);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public static String format(Date date, String format) {
		String result = "";
		try {
			if (date != null) {
				java.text.DateFormat df = new SimpleDateFormat(format);
				result = df.format(date);
			}
		} catch (Exception e) {
		}
		return result;
	}

	public static String format1(Date date) {
		try {
			return format(date, "yyyy-MM-dd");
		} catch (Exception e) {
			return null;
		}

	}

	public static Date getOnlyDay(Date date) {
		try {
			String pattern = "yyyy-MM-dd";
			String formatted = format(date, pattern);
			Date onlyDay = getDateByFormat(formatted, pattern);
			return onlyDay;
		} catch (Exception e) {
			return null;
		}
	}

	public static int getYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.YEAR);
	}

	public static int getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.MONTH) + 1;
	}

	public static int getDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_MONTH);
	}

	public static int getHour(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY);
	}

	public static int getMinute(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.MINUTE);
	}

	public static int getSecond(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.SECOND);
	}

	public static long getMillis(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.getTimeInMillis();
	}

	public static int getWeek(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	public static String getDate(Date date, String formatStr) {
		try {
			return format(date, formatStr);
		} catch (Exception e) {
			return null;
		}
	}

	public static String getTime(Date date) {
		try {
			return format(date, "HH:mm:ss");
		} catch (Exception e) {
			return null;
		}

	}

	public static String getDateTime(Date date) {
		try {
			return format(date, "yyyy-MM-dd HH:mm:ss");
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * 日期相加
	 *
	 * @param date
	 *            Date
	 * @param day
	 *            int
	 * @return Date
	 */
	public static Date addDate(Date date, int day) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(getMillis(date) + ((long) day) * 24 * 3600 * 1000);
		return c.getTime();
	}

	/**
	 *
	 * Description:
	 *
	 * @Version1.0 2014年12月2日 下午3:15:50 by 魏嵩（weisong@dangdang.com）创建
	 * @param date
	 * @param minute
	 * @return
	 */
	public static Date addMinute(Date date, int minute) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(getMillis(date) + ((long) minute) * 60 * 1000);
		return c.getTime();
	}

	/**
	 *
	 * Description:
	 *
	 * @Version1.0 2014年12月2日 下午3:15:50 by 魏嵩（weisong@dangdang.com）创建
	 * @param date
	 * @return
	 */
	public static Date addMillSecond(Date date, long millSecond) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(getMillis(date) + millSecond);
		return c.getTime();
	}

	/**
	 * 日期相减
	 *
	 * @param date
	 *            Date
	 * @param date1
	 *            Date
	 * @return int
	 */
	public static int diffDate(Date date, Date date1) {
		return (int) ((getMillis(date) - getMillis(date1)) / (24 * 3600 * 1000));
	}

	/**
	 * 日期相减(返回秒值)
	 *
	 * @param date
	 *            Date
	 * @param date1
	 *            Date
	 * @return int
	 * @author
	 */
	public static Long diffDateTime(Date date, Date date1) {
		return (Long) ((getMillis(date) - getMillis(date1)) / 1000);
	}

	public static Date getdate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date resultDate = null;
		try{
			resultDate = sdf.parse(date);
		}catch(Exception e){
		}
		return resultDate;
	}

	public static Date getPayDate(String date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date1 = null;
		try {
			date1 = sdf.parse(date);
		} catch (Exception e) {
			try {
				sdf = new SimpleDateFormat("yyyyMMdd");
				date1 = sdf.parse(date);
			} catch (Exception e1) {
				try {
					date1 = getdateFromString(date, DATE_PATTERN);
				} catch (Exception e2) {

				}
			}
		}
		return date1;
	}

	public static Date getMaxTimeByStringDate(String date) throws Exception {
		String maxTime = date + " 23:59:59";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.parse(maxTime);
	}

	public static Date getMinTimeByStringDate(String date) throws Exception {
		String maxTime = date + " 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.parse(maxTime);
	}

	/**
	 * 获得当前时间
	 * 
	 * @return
	 */
	public static Date getCurrentDateTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = DateUtil.getDateTime(date);
		try {
			return sdf.parse(result);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String getCurrentDateTimeToStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(getCurrentDateTime());
	}

	public static String getCurrentDateTimeToStr2() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(getCurrentDateTime());
	}

	/**
	 * Description: 获取 yyyy-MM-dd
	 * 
	 * @Version1.0 2014年12月24日 下午4:12:02 by 周伟洋（zhouweiyang@dangdang.com）创建
	 * @return
	 */
	public static String getCurrentSimpleDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(getCurrentDateTime());
	}

	public static Long getWmsupdateDateTime() {
		Calendar cl = Calendar.getInstance();

		return cl.getTimeInMillis();
	}

	public static Integer getLeftSeconds(String date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date condition = sdf.parse(date);
		long n = condition.getTime();
		long s = sdf.parse(getCurrentDateTimeToStr2()).getTime();
		return (int) ((s - n) / 1000);
	}

	/**
	 * Description:当前天数+days
	 * 
	 * @Version1.0 2014年12月4日 下午4:04:58 by 周伟洋（zhouweiyang@dangdang.com）创建
	 * @return
	 */
	public static Date addDaysOnToday(Date date, int days) {
		Calendar calendar = new java.util.GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);// 把日期往后增加一天.整数往后推,负数往前移动
		date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		return date;
	}

	/**
	 * Description: 计算当前时间与当天结束时间相差的秒数
	 * 
	 * @Version1.0 2014年12月24日 下午3:54:31 by 周伟洋（zhouweiyang@dangdang.com）创建
	 * @return
	 * @throws Exception
	 */
	public static int getSecondsToNextDay() throws Exception {
		String simpleDate = getCurrentSimpleDate();
		Date maxDate = getMaxTimeByStringDate(simpleDate);
		return (int) ((maxDate.getTime() - System.currentTimeMillis()) / 1000);

	}
	/**
	 * "yyyyMMdd"
	 * @param date              开始时间
	 * @param startAfterDays    时间区开始时间与开始时间
	 * @param endAfterDays
	 * e.g: LocalDate.now()=20170907
	 * getDayRangList(LocalDate.now(),1,3,"yyyyMMdd") = [20170908, 20170909]
	 * @return List<String> [(startDay+startAfterDays), (startDay+endAfterDays) )
	 */

	/**
	 * 
	 * @param startDateStr 例如: 20161118
	 * @param endDateStr 例如：20161120
	 * @return 20161118,20161119 注意 不包括20161120
	 */
	public static List<String> getDateRange(String startDateStr, String endDateStr) {
		
		List<String> dateStrList = new ArrayList<String>();
		Date startDate = DateUtil.getOnlyDay(getdateFromString(startDateStr, DATE_PATTERN3));
		Date endDate = DateUtil.getOnlyDay(getdateFromString(endDateStr, DATE_PATTERN3)); 
		
		for(Date date = startDate; date.getTime()< endDate.getTime(); date= DateUtil.addDate(date, 1)){
			dateStrList.add(DateUtil.getDate(date, DATE_PATTERN3));
		}
		return dateStrList;
	}
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return 20161118,20161119 注意 不包括20161120
	 */
	public static List<String> getDateRange(Date startDate, Date endDate) {
		startDate = getOnlyDay(startDate);
		endDate = getOnlyDay(endDate);
		List<String> dateStrList = new ArrayList<String>();
		
		for(Date date = startDate; date.getTime()< endDate.getTime(); date= DateUtil.addDate(date, 1)){
			dateStrList.add(DateUtil.getDate(date, DATE_PATTERN3));
		}
		return dateStrList;
	}
	/**
	 * 
	 * @param startDateStr 例如: 20161118
	 * @param endDateStr 例如：20161120
	 * @return 20161118,20161119 注意 不包括20161120
	 */
	public static List<String> getDateRange(String startDateStr, String endDateStr,String format) {
		List<String> dateStrList = new ArrayList<String>();
		Date startDate = DateUtil.getOnlyDay(getdateFromString(startDateStr, format));
		Date endDate = DateUtil.getOnlyDay(getdateFromString(endDateStr, format)); 
		
		for(Date date = startDate; date.getTime()< endDate.getTime(); date= DateUtil.addDate(date, 1)){
			dateStrList.add(DateUtil.getDate(date, format));
		}
		return dateStrList;
	}
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return 20161118,20161119 注意 不包括20161120
	 */
	public static List<String> getDateRange(Date startDate, Date endDate,String format) {
		startDate = getOnlyDay(startDate);
		endDate = getOnlyDay(endDate);
		List<String> dateStrList = new ArrayList<String>();
		for(Date date = startDate; date.getTime()< endDate.getTime(); date= DateUtil.addDate(date, 1)){
			dateStrList.add(DateUtil.getDate(date, format));
		}
		return dateStrList;
	}
	
	public static java.util.Date getdateFromString(String dateString, String format) {
		Date date = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			date = dateFormat.parse(dateString);
		} catch (Exception e) {
			
		}
		return date;
	}
	
	/**
	 * 
	 * Description: 1：周一，2：周二，3：周三，4：周四，5：周五，6：周六，7：周日
	 * @Version1.0 2016年7月28日 下午3:34:38 by 张宪斌（zhangxianbin@dangdang.com）创建
	 * @param date
	 * @return
	 */
	public static int getDayOfWeek(java.util.Date date) {
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.setTime(date);
		int day = c.get(java.util.Calendar.DAY_OF_WEEK);
		return day > 1 ? day - 1 : 7;
	}
	

	
	
	/**
	 * 
	 * @author 许文轩
	 * @comment 获取从某一时间开始，一定时间内随机的几个时间
	 * @param second 时间范围，单位秒
	 * @param times 获取随机时间的个数
	 * @param startDate 开始时间，可以为空，默认当前时间
	 * @date 2017年3月24日 上午11:03:44
	 */
	public static List<Date> getRandomDate(Integer second, Integer times, Date startDate) {
		if (second == null || second <= 0) {
			return null;
		}
		if (times == null || times <= 0) {
			return null;
		}
		if (startDate == null) {
			startDate = new Date();
		}
		List<Date> randomDateList = new ArrayList<Date>();
		while (times > 1) {
			Random random = new Random();
			int thisSecond = 2 * second / times;
			int randomSecond = random.nextInt(thisSecond);
			Date randomDate = new Date(startDate.getTime() + randomSecond * 1000);
			randomDateList.add(randomDate);
			startDate = randomDate;
			second = second - randomSecond;
			times--;
		}
		Random random = new Random();
		randomDateList.add(new Date(startDate.getTime() + random.nextInt(second) * 1000));
		return randomDateList;
	}
} 
