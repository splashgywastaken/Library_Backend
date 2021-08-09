ALTER TABLE library.users
    DROP CONSTRAINT users_achievement_id_fkey,
    DROP CONSTRAINT users_note_id_fkey;

ALTER TABLE library.users
    DROP COLUMN achievement_id,
    DROP COLUMN note_id;

ALTER TABLE library.notes
    ADD COLUMN user_id INTEGER NULL REFERENCES library.users (user_id) ON DELETE CASCADE;

ALTER TABLE library.achievements
    ADD COLUMN user_id INTEGER NULL REFERENCES library.users (user_id) ON DELETE CASCADE;
