ALTER TABLE library.reading_lists
    DROP CONSTRAINT reading_lists_pkey;

ALTER TABLE library.reading_lists
    ALTER COLUMN reading_finished_at DROP NOT NULL;

ALTER TABLE library.reading_lists
    ADD COLUMN reading_list_id SERIAL;

ALTER TABLE library.reading_lists
    ADD PRIMARY KEY (reading_list_id);
