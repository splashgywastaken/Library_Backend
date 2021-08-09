------------------------------------------
--Таблица book_authors
------------------------------------------
CREATE TABLE library.book_authors
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    author_id INTEGER NOT NULL REFERENCES library.authors (author_id) ON DELETE CASCADE,
    PRIMARY KEY (book_id, author_id)
);


------------------------------------------
--Таблица book_genres
------------------------------------------
CREATE TABLE library.book_genres
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    genre_id INTEGER NOT NULL REFERENCES library.genres (genre_id) ON DELETE CASCADE,
    PRIMARY KEY (book_id, genre_id)
);


------------------------------------------
--Таблица messages
------------------------------------------
CREATE TABLE library.messages
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    user_id INTEGER NOT NULL REFERENCES library.users (user_id) ON DELETE CASCADE,
    message_title VARCHAR(100) NOT NULL,
    message_body  VARCHAR(250) NOT NULL,
    message_post_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (book_id, user_id)
);


------------------------------------------
--Таблица lines
------------------------------------------
CREATE TABLE library.lines
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    user_id INTEGER NOT NULL REFERENCES library.users (user_id) ON DELETE CASCADE,
    number_in_line INTEGER NOT NULL,
    PRIMARY KEY (book_id, user_id)
);


------------------------------------------
--Таблица reading_lists
------------------------------------------
CREATE TABLE library.reading_lists
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    user_id INTEGER NOT NULL REFERENCES library.users (user_id) ON DELETE CASCADE,
    reading_started_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    reading_finished_at TIMESTAMP NOT NULL,
    PRIMARY KEY (book_id, user_id)
);


------------------------------------------
--Таблица reviews
------------------------------------------
CREATE TABLE library.reviews
(
    book_id INTEGER NOT NULL REFERENCES library.books (book_id) ON DELETE CASCADE,
    user_id INTEGER NOT NULL REFERENCES library.users (user_id) ON DELETE CASCADE,
    reading_state_id INTEGER NOT NULL REFERENCES library.reading_states (reading_state_id),
    review_rating INTEGER NOT NULL,
    review_post_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    review_title VARCHAR(100),
    review_body  VARCHAR(250),
    PRIMARY KEY (book_id, user_id)
);


------------------------------------------
--Таблица notes
------------------------------------------
CREATE TABLE library.notes
(
    note_id SERIAL PRIMARY KEY,
    note_body  VARCHAR(250) NOT NULL,
    book_id INTEGER NOT NULL REFERENCES library.books (book_id)
);
