ALTER TABLE library.reviews
    DROP CONSTRAINT reviews_pkey,
    DROP CONSTRAINT reviews_reading_state_id_fkey,
    DROP CONSTRAINT reviews_user_id_fkey,
    DROP CONSTRAINT reviews_book_id_fkey;

ALTER TABLE library.reviews
    DROP COLUMN reading_state_id,
    DROP COLUMN user_id,
    DROP COLUMN book_id;

ALTER TABLE library.reviews
    ADD COLUMN review_id SERIAL;

ALTER TABLE library.reviews
    ADD PRIMARY KEY (review_id);

ALTER TABLE library.reviews
    ADD CONSTRAINT reviews_review_id_fkey
        FOREIGN KEY (review_id) REFERENCES library.reading_lists(reading_list_id);
