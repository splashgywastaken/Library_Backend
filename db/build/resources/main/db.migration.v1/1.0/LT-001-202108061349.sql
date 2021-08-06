DROP TABLE library.lines;

ALTER TABLE library.reading_states
    ADD COLUMN reading_list_id INTEGER NULL REFERENCES library.reading_lists (reading_list_id) ON DELETE CASCADE;
