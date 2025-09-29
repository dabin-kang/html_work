SELECT * FROM onop_db.stud;

-- 테이블 생성 : 대소문자 구분 안함
/*
create table 테이블명(
칼럼1 타입,
칼럼2 타입,
);

타입 
정수 : int
실수 : double
문자열 : varchar
시간 : time
날짜 : date
날짜+ 시간 : datetime
*/

create table bike(
	title varchar(100),
    engine int,
    reg_date datetime,
    start_date date,
    run_time time
);


-- 컬럼 추가 "size" 라는 컬럼 추가
alter table bike add size int;

-- 컬럼 자료형 변형
alter table bike modify engine varchar(10);

-- 컬럼 이름,자료형 변형
alter table bike change engine eg int;

-- 컬럼 삭제
alter table bike drop size;

-- 테이블 목록 보기
show tables;

-- 테이블 확인
desc bike;

-- 테이블명 변경
alter table bike rename autobike;

-- 테이블 복사
create table per2 as select * from person;

-- 테이블 삭제
drop table person;


create table  mm(
mmnm int,
mmname varchar(10),
mmmy double,
mmst date,
mmlt datetime,
mmbig int
);

desc mm;


create table stud(
id int,
hakgi int,
name varchar(100),
pid varchar(100),
reg_date date,
kor int,
eng int,
mat int
);




insert into stud 
(id,hakgi,name,pid,reg_date,kor,eng,mat) 
value
(1,1,'semi','aaa','2025-09-07',70,80,90),
(2,1,'semi','bbb','2025-09-07',10,60,20),
(3,1,'semi','ccc','2025-09-07',80,90,5),
(4,1,'semi','ddd','2025-09-07',7,60,45),

(5,2,'final','장동건','2025-09-10',70,80,90),
(6,2,'final','중동건','2025-09-10',15,60,3),
(7,2,'final','대동건','2025-09-11',87,90,5),
(8,2,'final','소동건','2025-09-10',2,60,45);
