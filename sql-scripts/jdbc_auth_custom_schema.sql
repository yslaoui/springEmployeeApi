DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS members;


CREATE TABLE members (
    user_id VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY,
    pw VARCHAR(68) COLLATE utf8mb4_unicode_ci NOT NULL,
    active BOOLEAN NOT NULL
);

CREATE TABLE roles (
    user_id VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
    role VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
    CONSTRAINT fk_role_members FOREIGN KEY (user_id) REFERENCES members(user_id)
);

CREATE UNIQUE INDEX ix_auth_user_id ON roles (user_id, role);
