ALTER TABLE library.messages
    ADD COLUMN message_id SERIAL;

ALTER TABLE library.messages
    ADD PRIMARY KEY (message_id);

ALTER TABLE library.messages
    ADD COLUMN user_id INTEGER;

ALTER TABLE library.messages
    ADD CONSTRAINT messages_user_id_fkey
        FOREIGN KEY (user_id)
            REFERENCES library.users(user_id) ON DELETE CASCADE;


ALTER TABLE library.messages
    ADD COLUMN book_id INTEGER;

ALTER TABLE library.messages
    ADD CONSTRAINT messages_book_id_fkey
        FOREIGN KEY (book_id)
            REFERENCES library.books(book_id) ON DELETE CASCADE;
