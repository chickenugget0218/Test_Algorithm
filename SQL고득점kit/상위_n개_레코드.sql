-- 코드를 입력하세요
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME ASC
limit 1;

-- ORACLE, LIMIT 없음
SELECT NAME
FROM (select * from ANIMAL_INS ORDER BY DATETIME ASC)
WHERE rownum =1 ;