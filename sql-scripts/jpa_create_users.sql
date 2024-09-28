-- Insert users into the authorities table
USE employee_directory;
-- Insert users with bcrypt encoded passwords
-- The passwords below are encrypted with bcrypt; the plain password is 'password'.
INSERT INTO users (username, password, enabled) VALUES
('john', '$2a$10$2NFYV6jMcrVgbp56bw2cieGLqCAawQpGxkIBOdsvYmGIG.GYwuZCa', TRUE),
('mary', '$2a$10$2NFYV6jMcrVgbp56bw2cieGLqCAawQpGxkIBOdsvYmGIG.GYwuZCa', TRUE),
('susan', '$2a$10$2NFYV6jMcrVgbp56bw2cieGLqCAawQpGxkIBOdsvYmGIG.GYwuZCa', TRUE);

