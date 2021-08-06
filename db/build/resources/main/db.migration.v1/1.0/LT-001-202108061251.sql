ALTER TABLE library.users
    DROP COLUMN user_role;

ALTER TABLE library.users
    ADD COLUMN user_role INTEGER;
