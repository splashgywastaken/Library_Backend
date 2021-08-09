ALTER TABLE library.users
    ADD COLUMN note_id INTEGER NULL REFERENCES library.notes (note_id) ON DELETE CASCADE;

ALTER TABLE library.notes
    DROP CONSTRAINT notes_book_id_fkey,
    ADD CONSTRAINT notes_book_id_fkey
        FOREIGN KEY (book_id) REFERENCES library.books (book_id) ON DELETE CASCADE;
