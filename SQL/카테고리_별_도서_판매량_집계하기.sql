-- https://school.programmers.co.kr/learn/courses/30/lessons/144855
SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A JOIN BOOK_SALES B
WHERE A.BOOK_ID = B.BOOK_ID
    AND YEAR(B.SALES_DATE)='2022'
    AND MONTH(B.SALES_DATE)='1'
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY ASC;
