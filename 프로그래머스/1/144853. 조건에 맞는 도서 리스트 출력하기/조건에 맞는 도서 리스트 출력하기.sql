
SELECT book_id,PUBLISHED_DATE
from book
where category = '인문' and YEAR(PUBLISHED_DATE) = 2021;
