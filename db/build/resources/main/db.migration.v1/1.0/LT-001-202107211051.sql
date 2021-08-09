ALTER TABLE library.users
    RENAME COLUMN id TO user_id;

ALTER TABLE library.users
    RENAME COLUMN first_name TO user_first_name;

ALTER TABLE library.users
    RENAME COLUMN last_name TO user_last_name;

ALTER TABLE library.users
    ADD COLUMN user_middle_name VARCHAR(50) NULL,
    ADD COLUMN user_birthday    DATE      DEFAULT CURRENT_DATE,
    ADD COLUMN user_sex         VARCHAR(20) NULL,
    ADD COLUMN user_role        VARCHAR(20) NULL UNIQUE,
    ADD COLUMN email            VARCHAR(50) NULL UNIQUE,
    ADD COLUMN username         VARCHAR(50) NULL,
    ADD COLUMN password         CHAR(64)    NULL,
    ADD COLUMN created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ADD COLUMN achievement_id   INTEGER     NULL REFERENCES library.achievements (achievement_id);
