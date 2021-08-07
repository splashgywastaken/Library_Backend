ALTER TABLE library.messages
    ALTER COLUMN user_id SET NOT NULL,
    ALTER COLUMN book_id SET NOT NULL;
