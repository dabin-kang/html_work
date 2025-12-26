package util_p;

import java.time.LocalDateTime;

public class DateJuminMain {

    public static void main(String[] args) {

        String jumin = "681129-1921564";

        // 1️⃣ 주민번호에서 년/월/일 추출
        int yy = Integer.parseInt(jumin.substring(0, 2));
        int mm = Integer.parseInt(jumin.substring(2, 4));
        int dd = Integer.parseInt(jumin.substring(4, 6));

        // 2️⃣ 7번째 자리로 세기 판별
        char code = jumin.charAt(7);

        int birthYear;
        if (code == '1' || code == '2') {
            birthYear = 1900 + yy;
        } else {
            birthYear = 2000 + yy;
        }

        // 3️⃣ 현재 날짜/시간
        LocalDateTime now = LocalDateTime.now();
        int thisYear = now.getYear();

        // 4️⃣ 나이 계산
        int age = thisYear - birthYear;

        // 5️⃣ 내 생년월일 (시간 0시 0분 0초)
        LocalDateTime birthDateTime =
                LocalDateTime.of(birthYear, mm, dd, 0, 0, 0);

        // 6️⃣ 올해 생일
        LocalDateTime thisYearBirthDay =
                LocalDateTime.of(thisYear, mm, dd, 0, 0, 0);

        // 7️⃣ 출력
        System.out.println("출생년도 : " + birthYear);
        System.out.println("생월 : " + mm);
        System.out.println("생일 : " + dd);
        System.out.println("나이 : " + age);
        System.out.println("내 생년월일 : " + birthDateTime);
        System.out.println("올해 생일 : " + thisYearBirthDay);
    }
}
