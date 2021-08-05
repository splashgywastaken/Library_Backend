ALTER TABLE library.messages
    DROP CONSTRAINT messages_book_id_fkey,
    DROP CONSTRAINT messages_user_id_fkey,
    DROP CONSTRAINT messages_pkey;

ALTER TABLE library.messages
    DROP COLUMN user_id,
    DROP COLUMN book_id;
