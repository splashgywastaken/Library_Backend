------------------------------------------
--Таблица tags
------------------------------------------
CREATE TABLE library.tags
(
    tag_id   SERIAL PRIMARY KEY,
    tag_name VARCHAR(100) NOT NULL UNIQUE
);

------------------------------------------
--Таблица book_tags для связи many-to-many
------------------------------------------
CREATE TABLE library.book_tags
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    tag_id INTEGER NOT NULL REFERENCES library.tags (tag_id) ON DELETE CASCADE,
    PRIMARY KEY (book_id, tag_id)
);
