CREATE TABLE tbl_user
(
    u_id_pk    INTEGER AUTO_INCREMENT PRIMARY KEY,
    u_name     VARCHAR(100) NOT NULL,
    u_username VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE tbl_post
(
    p_id_pk     INTEGER AUTO_INCREMENT PRIMARY KEY,
    p_user_fk   INT          NOT NULL,
    p_caption   VARCHAR(100) NOT NULL,
    p_media_url VARCHAR(200) NOT NULL
);

ALTER TABLE tbl_post
    ADD FOREIGN KEY (p_user_fk) REFERENCES tbl_user (u_id_pk) ON DELETE CASCADE;

