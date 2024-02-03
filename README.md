# Простой список задач, который использует базу данных postgres:

-- Database: toDoList

-- DROP DATABASE IF EXISTS "toDoList";

CREATE DATABASE "toDoList"
    WITH
    OWNER = root
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Russia.1251'
    LC_CTYPE = 'Russian_Russia.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

# Таблица:

-- Table: public.task

-- DROP TABLE IF EXISTS public.task;

CREATE TABLE IF NOT EXISTS public.task
(
    id integer NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    text text COLLATE pg_catalog."default",
    is_completed boolean NOT NULL,
    CONSTRAINT task_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.task
    OWNER to root;
# Чтобы воспользоваться нужно запустить исполнямый файл и перейти по:
localhost:8080/
