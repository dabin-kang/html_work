SELECT * FROM onop_db.autobike;
/*
insert into  테이블명alter
(컬럼1,컬럼2,....)
values
(컬럼1값 , 컬럼2값,....)
*/
insert into per2 (pid, pname, age, height) value('ddd','손예진','42',158);

insert into per2 (pid, pname,  height) value
('ddd','손예진',172),
('eee','월예진',162),
('fff','눈예진',162),
('ggg','화예진',182);

-- 조회
/*
select 컬럼1,컬럼2,... from 테이블명;
select * from 테이블명; 모든 컬럼
*/
select*from per2;

select pid , age from per2;

-- 변경
/*update 테이블명 set 컬럼명 = 값 */
/*update 테이블명 set 컬럼명 = 값 where 조건 */
update per2 set age = 45;

update per2 set age = 36 where pid = 'ddd';

-- 삭제
/*delete from 테이블명 where 조건*/
delete from per2 where height <= 160;