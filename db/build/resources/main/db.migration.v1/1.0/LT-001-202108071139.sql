TRUNCATE TABLE library.reading_states;

ALTER TABLE library.reading_states
    ALTER COLUMN state_name TYPE VARCHAR(64);

INSERT INTO library.reading_states(reading_state_id, state_name)
VALUES (1, 'I_WANT_TO_READ'),
       (2, 'I_AM_READING_NOW'),
       (3, 'I_FINISHED_READING'),
       (4, 'I_HAVE_NOT_RETURNED_THE_BOOK');
