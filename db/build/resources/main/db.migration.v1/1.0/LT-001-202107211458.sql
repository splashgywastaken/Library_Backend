ALTER TABLE library.authors
    DROP CONSTRAINT authors_author_sex_key;

ALTER TABLE library.users
    DROP CONSTRAINT users_user_role_key;

ALTER TABLE library.books
    DROP CONSTRAINT books_language_key,
    DROP CONSTRAINT books_age_rating_key;
