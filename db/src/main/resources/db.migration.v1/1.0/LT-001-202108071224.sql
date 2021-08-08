ALTER TABLE library.reviews
    DROP CONSTRAINT reviews_review_id_fkey;

ALTER TABLE library.reading_lists
    ADD COLUMN review_id INTEGER NULL REFERENCES library.reviews (review_id);
