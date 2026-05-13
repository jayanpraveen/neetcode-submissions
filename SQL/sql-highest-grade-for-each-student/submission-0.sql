-- Write your query below
select 
student_id, exam_id, score
from (select 
student_id, exam_id, score,
ROW_NUMBER() OVER(PARTITION by student_id order by score desc, exam_id asc) as rnk
from exam_results)
where rnk = 1;