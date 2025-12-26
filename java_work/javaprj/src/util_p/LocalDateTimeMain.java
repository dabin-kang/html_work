package util_p;


import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		
//		불변데이터
		LocalDateTime nn = LocalDateTime.now();
		System.out.println(nn);
//		2025-12-18T14:13:43.223915700 : 중간에 T가 있음
		
//		os/jvm의 TimeZone 기준
		nn = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(nn);
		
		
		nn = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(nn);
		System.out.println(LocalDateTime.now(ZoneId.of("Europe/London")));
		System.out.println(LocalDateTime.now(ZoneId.of("Europe/Rome")));
		System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));
		System.out.println(LocalDateTime.now(ZoneId.of("America/Los_Angeles")));
		
//		월 표시를 일반상태로 입력
		nn = LocalDateTime.of(2025,12,10,16,23);
		System.out.println(nn);
		nn = LocalDateTime.of(2025,12,10,16,23,56);
		System.out.println(nn);
		nn = LocalDateTime.of(2025,12,10,16,23,56,12345674);
		System.out.println(nn);
		
//		문자열로 생성(파싱)
		nn = LocalDateTime.parse("2002-06-02T19:43:58.9874564");
		System.out.println(nn);
		
//		Month  = Enum이다
		System.out.println(nn.getYear());
		System.out.println(nn.getMonthValue());// 1~12
		Month mm = nn.getMonth();
		System.out.println(mm);
		DayOfWeek dd = nn.getDayOfWeek();
		System.out.println(dd);
		
//		일년 중 몇 일이다
		System.out.println(nn.getDayOfYear());
		
		
		System.out.println(nn.getHour());
		System.out.println(nn.getMinute());
		System.out.println(nn.getSecond());
		System.out.println(nn.getNano());
		
//		불변데이터라서 Set이 없다
//		nn.setYear(2005);
		
//		withxxx() 자신을 바꾸는 것이 아니라 바뀐 날씨데이터를 리턴
		LocalDateTime aa = nn.withYear(2005);
		System.out.println(aa);
		System.out.println(nn.withMonth(4));
		System.out.println(nn.withDayOfMonth(17));
		System.out.println(nn.withDayOfYear(100));
		
		
		System.out.println(nn.withHour(21));
		System.out.println(nn.withMinute(37));
		System.out.println(nn.withSecond(21));
		System.out.println(nn.withNano(192837465));
		
//		여러 개 한번에 만들기
		aa = nn.withYear(2005)
				.withMonth(4)
				.withDayOfMonth(17)
				.withDayOfYear(100)
				.withHour(21)
				.withSecond(21);
				System.out.println(aa);
				
//		chronoField : enum
		System.out.println(nn.with(ChronoField.YEAR,1988));
		System.out.println(nn.with(ChronoField.MONTH_OF_YEAR,9));
		System.out.println(nn.with(ChronoField.DAY_OF_MONTH,13));
		System.out.println(nn.with(ChronoField.HOUR_OF_DAY,16));
		System.out.println(nn.with(ChronoField.MINUTE_OF_HOUR,36));
		System.out.println(nn.with(ChronoField.SECOND_OF_MINUTE,24));
		System.out.println(nn.with(ChronoField.NANO_OF_SECOND,1988789));
		
		
		
		System.out.println(nn.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(nn.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println(nn.with(TemporalAdjusters.lastDayOfYear()));
		
		System.out.println(nn.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfNextMonth()));
		
//		다음에 나오는 요일
		System.out.println(nn.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
		System.out.println(nn.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		
		System.out.println("plusXXX >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(nn);
		System.out.println(nn.plusYears(5));
		System.out.println(nn.plusMonths(5));
		System.out.println(nn.plusWeeks(5));
		System.out.println(nn.plusDays(5));
		System.out.println(nn.plusHours(5));
		System.out.println(nn.plusMinutes(5));
		System.out.println(nn.plusSeconds(5));
		System.out.println(nn.plusNanos(5));
		
		
		System.out.println("minusXXX >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(nn);
		System.out.println(nn.minusYears(5));
		System.out.println(nn.minusMonths(5));
		System.out.println(nn.minusWeeks(5));
		System.out.println(nn.minusDays(5));
		System.out.println(nn.minusHours(5));
		System.out.println(nn.minusMinutes(5));
		System.out.println(nn.minusSeconds(5));
		System.out.println(nn.minusNanos(5));
		
		
		
		
		
		LocalDateTime n1 = LocalDateTime.of(2025,10,10,10,10);
		LocalDateTime n2 = LocalDateTime.of(2025,11,11,11,11);
		LocalDateTime n3 = LocalDateTime.of(2025,11,11,11,11);
		LocalDateTime n4 = LocalDateTime.of(2025,12,12,12,12);
		
		System.out.println("isAfterXXX >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(n2.isAfter(n1));
		System.out.println(n2.isAfter(n3));
		System.out.println(n2.isAfter(n4));
		System.out.println("isBeforeXXX >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(n2.isBefore(n1));
		System.out.println(n2.isBefore(n3));
		System.out.println(n2.isBefore(n4));
		System.out.println("isEqualXXX >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(n2.isEqual(n1));
		System.out.println(n2.isEqual(n3));
		System.out.println(n2.isEqual(n4));
		System.out.println("iscompaetToXXX >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(n2.compareTo(n1));
		System.out.println(n2.compareTo(n3));
		System.out.println(n2.compareTo(n4));
		
		
		
		System.out.println("LocalDate >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		LocalDate ld1 = LocalDate.now();
		LocalTime lt1 = LocalTime.now();
		System.out.println(ld1);
		System.out.println(lt1);
		ld1 = LocalDate.of(2013, 10, 11);
		lt1 = LocalTime.of(15, 14, 13,111222333);
		ZoneId zone = ZoneId.of("Asia/Seoul");
		ZonedDateTime zt = nn.atZone(zone);
		System.out.println(ld1);
		System.out.println(lt1);
		
		nn = LocalDateTime.of(ld1, lt1);
		System.out.println(nn);
		
		nn = LocalDateTime.of(2009,9,9,8,8,8,888777666);
		System.out.println(nn);
		ld1 = nn.toLocalDate();
		lt1 = nn.toLocalTime();
		System.out.println(ld1);
		System.out.println(lt1);
		
		
		System.out.println("formatter >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		DateTimeFormatter dtf;
		dtf = DateTimeFormatter.ofPattern("yyyy년mm월dd일 HH:mm:ss");
		String ttt = nn.format(dtf);
		System.out.println(ttt);
		
		String [] ppArr = {
			"y","yy","yyy","yyyy",
			"u","uuuu", // ISO 연도
			"M","MM","MMM","MMM",
			"d","dd",
			"D","DD",
			
//			요일 숫자 1~7
			"e","ee",
			"E","EE","EEE","EEEE",
			

			"w","ww",//	년 단위 주
			"W",//	월 단위 주
			"H","HH",//0~23
			"h","hh",
			"m","mm",
			"s","ss",
			"S","SS","SSS",//밀리초, 나노초
			"n", // 나노초
			"a",//am/pm
			"z", //timeZone
			"Z","X",
		};
		
		for (String pp : ppArr) {
//			dtf = DateTimeFormatter.ofPattern(pp);
//			dtf = DateTimeFormatter.ofPattern(pp,Locale.KOREAN);
			dtf = DateTimeFormatter.ofPattern(pp,Locale.ENGLISH);
			System.out.println(pp+":"+zt.format(dtf));
		}
		
		String asdf = "2015-08-26 10:23:49";
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		nn = LocalDateTime. parse(asdf , dtf);
		System.out.println(nn);
	}
}
