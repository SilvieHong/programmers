-- https://school.programmers.co.kr/learn/courses/30/lessons/276013
SELECT ID
     , EMAIL
     , FIRST_NAME
     , LAST_NAME
FROM DEVELOPER_INFOS
WHERE SKILL_3="Python" OR SKILL_2="Python" OR SKILL_1="Python"
ORDER BY ID;
