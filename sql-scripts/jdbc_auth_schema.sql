DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;


CREATE TABLE users (
    username VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY,
    password VARCHAR(68) COLLATE utf8mb4_unicode_ci NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
    username VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
    authority VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username ON authorities (username, authority);
