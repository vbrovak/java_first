-- Пример 1 Запрос списка ответов по вопросу 1
select * from answers a 
where a.id_quest = 1
order by id_answer asc

-- Пример 2 Запрос для получения правильного ответа по вопросу 2
select * from answers a 
where a.id_quest = 1 and a.pr_correct = 1
order by id_answer asc

-- Пример 3 Запрос для получения списка вопросов с правильными ответами правильного ответа по вопросу 2 вместе с полями первой таблицы
select q.*, a.vl_answer
from questions q
join answers a on a.id_quest = q.id_quest
where  a.pr_correct = 1
order by id_answer asc