SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS 
WHERE HOUR(DATETIME) BETWEEN 9 AND 19  -- 9이상 19이하 전체 범위 지정
GROUP BY HOUR                          -- 추출한 '시간'으로 그룹화
ORDER BY HOUR;                         -- 시간순 정렬