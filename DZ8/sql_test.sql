-- ������ 1 ������ ������ ������� �� ������� 1
select * from answers a 
where a.id_quest = 1
order by id_answer asc

-- ������ 2 ������ ��� ��������� ����������� ������ �� ������� 2
select * from answers a 
where a.id_quest = 1 and a.pr_correct = 1
order by id_answer asc

-- ������ 3 ������ ��� ��������� ������ �������� � ����������� �������� ����������� ������ �� ������� 2 ������ � ������ ������ �������
select q.*, a.vl_answer
from questions q
join answers a on a.id_quest = q.id_quest
where  a.pr_correct = 1
order by id_answer asc