ALTER TABLE library.messages
    ALTER COLUMN user_id DROP NOT NULL,
    ALTER COLUMN book_id DROP NOT NULL;
