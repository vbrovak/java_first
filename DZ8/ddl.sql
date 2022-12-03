
CREATE TABLE public.questions(
	id_quest smallint NOT NULL,
	vl_quest varchar(100) NOT NULL,
	CONSTRAINT quest_pk PRIMARY KEY (id_quest),
	CONSTRAINT quest_uk UNIQUE (vl_quest)

);
COMMENT ON TABLE public.questions IS 'Таблица вопросов';
COMMENT ON COLUMN public.questions.id_quest IS 'Порядковый номер вопроса';
COMMENT ON COLUMN public.questions.vl_quest IS 'Текст вопроса';

CREATE TABLE public.answers(
	id_answer smallint NOT NULL,
	id_quest smallint,
	vl_answer varchar(100) NOT NULL DEFAULT 0,
	pr_correct smallint NOT NULL DEFAULT 0,
	CONSTRAINT answer_pk PRIMARY KEY (id_answer)

);

COMMENT ON TABLE public.answers IS 'Таблица ответов';
COMMENT ON COLUMN public.answers.id_answer IS 'Ид ответа (сквозной)';
COMMENT ON COLUMN public.answers.id_quest IS 'Ссылка на вопрос родительской таблицы';
COMMENT ON COLUMN public.answers.vl_answer IS 'Текст ответа';
COMMENT ON COLUMN public.answers.pr_correct IS 'Признак правильного ответа. (0-некорректный, 1-корректный)';


ALTER TABLE public.answers ADD CONSTRAINT answer_fk FOREIGN KEY (id_quest)
REFERENCES public.questions (id_quest) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION NOT DEFERRABLE;



