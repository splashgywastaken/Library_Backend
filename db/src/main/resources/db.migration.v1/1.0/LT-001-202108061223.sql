ALTER TABLE library.users
    ALTER COLUMN password TYPE varchar(64);
UPDATE library.users SET password = trim(password) WHERE password IS NOT NULL;
ALTER TABLE library.users
    ALTER COLUMN password TYPE char(60);