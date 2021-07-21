------------------------------------------
--Таблица reading states
------------------------------------------
CREATE TABLE library.reading_states
(
    reading_state_id INTEGER PRIMARY KEY,
    state_name       VARCHAR(20) NOT NULL UNIQUE
);

INSERT INTO library.reading_states
VALUES (1, 'IS_IN_LINE'),
       (2, 'IS_READING'),
       (3, 'IS_GOING_TO_READ'),
       (4, 'IS_GAVE_UP'),
       (5, 'FINISHED');


------------------------------------------
--Таблица achievements
------------------------------------------
CREATE TABLE library.achievements
(
    achievement_id   SERIAL PRIMARY KEY,
    achievement_name VARCHAR(50) NOT NULL UNIQUE
);


------------------------------------------
--Таблица genre
------------------------------------------
CREATE TABLE library.genres
(
    genre_id   SERIAL PRIMARY KEY,
    genre_name VARCHAR(50) NOT NULL UNIQUE
);


------------------------------------------
--Таблица authors
------------------------------------------
CREATE TABLE library.authors
(
    author_id          SERIAL PRIMARY KEY,
    author_first_name  VARCHAR(60) NOT NULL,
    author_last_name   VARCHAR(60) NOT NULL,
    author_middle_name VARCHAR(60),
    pseudonym          VARCHAR(60),
    author_birthday    DATE,
    author_sex         VARCHAR(20) UNIQUE
);


------------------------------------------
--Таблица books
------------------------------------------
CREATE TABLE library.books
(
    book_id            SERIAL PRIMARY KEY,
    book_name          VARCHAR(100) NOT NULL,
    year_of_publishing INTEGER      NOT NULL,
    quantity           INTEGER      NOT NULL,
    isbn               VARCHAR(20)  NOT NULL UNIQUE,
    age_rating         VARCHAR(20)  NOT NULL UNIQUE,
    language           VARCHAR(30)  NOT NULL UNIQUE
);
