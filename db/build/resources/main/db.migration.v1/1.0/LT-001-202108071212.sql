ALTER TABLE library.reading_lists
    ADD COLUMN reading_state_id INTEGER NOT NULL REFERENCES library.reading_states (reading_state_id) default 1;

ALTER TABLE library.reading_states
    DROP CONSTRAINT reading_states_reading_list_id_fkey;

ALTER TABLE library.reading_states
    DROP COLUMN reading_list_id;
