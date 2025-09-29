SELECT * FROM onop_db.per2;

select 10+20;

select kor,kor+20 from stud;
-- 산술연산자 +-*/%
-- as 별칭을 주는 것
select *, kor+10,eng-20,mat*2 ,eng/3, kor+eng+mat as tot from stud;

-- 문자열 결합으로 + 사용불가
select*,'이름'+ pnamefrom per2;

-- 비교 : return 1: ture , 0 : 
select*,concat(hakgi,'학기') as hg from stud;
select kor, 
kor > 70,
kor > 70,
kor >= 70,
kor <= 70,
kor = 70, -- 같다
kor != 70, -- 다르다
kor <> 70, -- 다르다
from stud;

-- 비교 불가
select kor , kor - null from stud;

select kor , kor is null from stud;
select kor , kor is not null from stud;

-- ifnull(컬럼, 대체값)
select kor , ifnull(kor,-5)from stud;

-- 논리연산자

select * from stud where hakgi=1 and name = 'semi';
select * from stud where hakgi=1 && name = 'semi';

select * from stud where pid='aaa' or name = 'semi';
select * from stud where pid='aaa' || name = 'semi';

select * from stud where !('semi');