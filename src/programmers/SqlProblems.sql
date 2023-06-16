SELECT OUTS.ANIMAL_ID, OUTS.NAME
FROM ANIMAL_OUTS OUTS
         LEFT JOIN ANIMAL_INS INS ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE INS.ANIMAL_ID IS NOT NULL
ORDER BY TIMESTAMPDIFF(DAY, INS.DATETIME, OUTS.DATETIME) DESC
LIMIT 2;

SELECT HOUR(OUTS.DATETIME), COUNT(*) AS count
FROM ANIMAL_OUTS OUTS
WHERE HOUR(OUTS.DATETIME) > 8
  AND HOUR(OUTS.DATETIME) < 20
GROUP BY HOUR(OUTS.DATETIME)
ORDER BY HOUR(OUTS.DATETIME);

WITH RECURSIVE AHOURS AS (SELECT 0 AS hour
                          UNION ALL
                          SELECT hour + 1
                          FROM AHOURS
                          WHERE hour < 23)

SELECT AHOURS.hour, COUNT(HOUR(OUTS.DATETIME))
FROM AHOURS
         LEFT JOIN ANIMAL_OUTS OUTS ON AHOURS.hour = HOUR(OUTS.DATETIME)
GROUP BY HOUR(OUTS.DATETIME), AHOURS.hour;

SELECT INS.ANIMAL_ID, INS.NAME, IF(INS.SEX_UPON_INTAKE REGEXP "(Neutered|Spayed)", 'O', 'X') AS 중성화
FROM ANIMAL_INS INS
ORDER BY INS.ANIMAL_ID;

SELECT INS.ANIMAL_TYPE, IFNULL(INS.NAME, 'No name'), INS.SEX_UPON_INTAKE
FROM ANIMAL_INS INS;

SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS INS
WHERE INS.NAME IS NOT NULL;

SELECT INS.ANIMAL_ID, INS.NAME, DATE_FORMAT(INS.DATETIME, '%Y-%m-%d') AS 날짜
FROM ANIMAL_INS INS;

SELECT INS.DATETIME
FROM ANIMAL_INS INS
ORDER BY INS.DATETIME DESC
LIMIT 1;

SELECT INS.ANIMAL_ID
FROM ANIMAL_INS INS
WHERE INS.NAME IS NOT NULL;

SELECT COUNT(INS.ANIMAL_ID)
FROM ANIMAL_INS INS;

SELECT INS.NAME
FROM ANIMAL_INS INS
ORDER BY DATETIME
LIMIT 1;

SELECT INS.ANIMAL_ID, INS.NAME, INS.DATETIME
FROM ANIMAL_INS INS
ORDER BY INS.NAME, INS.DATETIME DESC;

SELECT INS.ANIMAL_ID, INS.NAME
FROM ANIMAL_INS INS
ORDER BY INS.ANIMAL_ID;

SELECT INS.ANIMAL_ID, INS.NAME
FROM ANIMAL_INS INS
WHERE INS.ANIMAL_TYPE = 'Dog'
  AND INS.NAME REGEXP "(el)"
ORDER BY INS.NAME;

SELECT INS.ANIMAL_ID, INS.NAME, INS.SEX_UPON_INTAKE
FROM ANIMAL_INS INS
WHERE INS.NAME REGEXP "^(Lucy|Ella|Pickle|Rogan|Sabrina|Mitty)$"
ORDER BY INS.ANIMAL_ID;

SELECT OUTS.ANIMAL_ID, OUTS.ANIMAL_TYPE, OUTS.NAME
FROM ANIMAL_OUTS OUTS
         LEFT JOIN ANIMAL_INS INS ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE OUTS.SEX_UPON_OUTCOME != INS.SEX_UPON_INTAKE
  AND INS.SEX_UPON_INTAKE LIKE 'Intact%';

SELECT INS.NAME, INS.DATETIME
FROM ANIMAL_INS INS
         LEFT JOIN ANIMAL_OUTS OUTS ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE OUTS.ANIMAL_ID IS NULL
ORDER BY INS.DATETIME
LIMIT 3;

SELECT ai.ANIMAL_ID, ai.NAME
FROM ANIMAL_INS ai
         LEFT JOIN ANIMAL_OUTS ao ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ai.DATETIME > ao.DATETIME
ORDER BY ai.DATETIME;

SELECT ao.ANIMAL_ID, ao.NAME
FROM ANIMAL_OUTS ao
         LEFT JOIN ANIMAL_INS ai ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ai.ANIMAL_ID IS NULL;

SELECT INS.NAME, COUNT(INS.NAME) AS count
FROM ANIMAL_INS INS
WHERE INS.NAME IS NOT NULL
GROUP BY INS.NAME
HAVING count > 1
ORDER BY INS.NAME;

SELECT INS.ANIMAL_TYPE, COUNT(*) as count
FROM ANIMAL_INS INS
GROUP BY INS.ANIMAL_TYPE
ORDER BY INS.NAME DESC;

SELECT INS.ANIMAL_ID
FROM ANIMAL_INS INS
WHERE INS.NAME IS NULL;

SELECT MIN(INS.DATETIME)
FROM ANIMAL_INS INS;

SELECT INS.ANIMAL_ID, INS.NAME
FROM ANIMAL_INS INS
WHERE INS.INTAKE_CONDITION != 'Aged';

SELECT INS.ANIMAL_ID, INS.NAME
FROM ANIMAL_INS INS
WHERE INS.INTAKE_CONDITION = 'Sick'
ORDER BY INS.ANIMAL_ID;

SELECT ai.NAME, ai.DATETIME
FROM ANIMAL_INS ai
ORDER BY ai.ANIMAL_ID DESC;

SELECT *
FROM ANIMAL_INS ai
ORDER BY ai.ANIMAL_ID;