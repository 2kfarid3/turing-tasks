CREATE TABLE users (
                       id bigserial PRIMARY KEY,
                       user_name VARCHAR(255) NOT NULL UNIQUE,
                       passwordd VARCHAR(255) NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL CHECK (email like '%_@_.%_'),
                       birth DATE CHECK (birth <= CURRENT_DATE),
                       status VARCHAR(20) DEFAULT 'active',
                       role VARCHAR(50) DEFAULT 'user',
                       createdBy VARCHAR(255) NOT NULL DEFAULT current_user,
                       updatedBy VARCHAR(255) NOT NULL DEFAULT current_user,
                       createdAt TIMESTAMP NOT NULL DEFAULT NOW(),
                       updatedAt TIMESTAMP NOT NULL DEFAULT NOW()
);

select * from users;


INSERT INTO users (user_name, passwordd, email, birth)
VALUES ('Test 2', '0000', 'usertest2@gmail.com', '2000-12-12');

--ALTER TABLE users ALTER COLUMN email VARCHAR(255) UNIQUE NOT NULL CHECK (email ~* '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$')

ALTER TABLE users
DROP CONSTRAINT IF EXISTS users_email_check;

ALTER TABLE users
    ADD CONSTRAINT users_email_check
        CHECK (email ~* '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$');

--ALTER TABLE users DROP CONSTRAINT IF EXISTS users_createdBy_default;

--ALTER TABLE users ADD CONSTRAINT users_createdBy_check DEFAULT 'user'

ALTER TABLE users
    ALTER COLUMN createdBy DROP DEFAULT;

ALTER TABLE users
    ALTER COLUMN createdBy SET DEFAULT 'user';

ALTER TABLE users
    ALTER COLUMN updatedBy DROP DEFAULT;

ALTER TABLE users
    ALTER COLUMN updatedBy SET DEFAULT 'user';

UPDATE users
SET createdBy = 'user', updatedBy = 'user';

CREATE TABLE post (
                      id bigserial PRIMARY KEY,
                      user_id bigserial NOT NULL,
                      title VARCHAR(255) NOT NULL,
                      text TEXT NOT NULL,
                      status VARCHAR(20) DEFAULT 'active',
                      likes_count integer DEFAULT 0,
                      comments_count integer DEFAULT 0,
                      createdAt TIMESTAMP NOT NULL DEFAULT NOW(),
                      updatedAt TIMESTAMP NOT NULL DEFAULT NOW(),
                      FOREIGN KEY (user_id) REFERENCES users(id)
);


INSERT INTO post (user_id,title,text)
VALUES (5,'Post 1', 'This is my new post');

select * from post;

CREATE TABLE comment_post (
                              id bigserial PRIMARY KEY,
                              user_id bigserial NOT NULL,
                              post_id bigserial NOT NULL,
                              text TEXT NOT NULL,
                              status VARCHAR(20) DEFAULT 'active',
                              likes_count integer DEFAULT 0,
                              createdAt TIMESTAMP NOT NULL DEFAULT NOW(),
                              updatedAt TIMESTAMP NOT NULL DEFAULT NOW(),
                              FOREIGN KEY (user_id) REFERENCES users(id),
                              FOREIGN KEY (post_id) REFERENCES post(id)
);

CREATE TABLE comment_comment (
                                 id bigserial PRIMARY KEY,
                                 user_id bigserial NOT NULL,
                                 comment_id bigserial NOT NULL,
                                 text TEXT NOT NULL,
                                 status VARCHAR(20) DEFAULT 'active',
                                 likes_count integer DEFAULT 0,
                                 createdAt TIMESTAMP NOT NULL DEFAULT NOW(),
                                 updatedAt TIMESTAMP NOT NULL DEFAULT NOW(),
                                 FOREIGN KEY (user_id) REFERENCES users(id),
                                 FOREIGN KEY (comment_id) REFERENCES comment_post(id)
);

CREATE TABLE likes_post (
                            id bigserial PRIMARY KEY,
                            user_id bigserial NOT NULL,
                            post_id bigserial NOT NULL,
                            createdAt TIMESTAMP NOT NULL DEFAULT NOW(),
                            FOREIGN KEY (user_id) REFERENCES users(id),
                            FOREIGN KEY (post_id) REFERENCES post(id)
);

CREATE TABLE likes_comment (
                               id bigserial PRIMARY KEY,
                               user_id bigserial NOT NULL,
                               comment_id bigserial NOT NULL,
                               createdAt TIMESTAMP NOT NULL DEFAULT NOW(),
                               FOREIGN KEY (user_id) REFERENCES users(id),
                               FOREIGN KEY (comment_id) REFERENCES comment_post(id)
);

INSERT INTO comment_post (user_id,post_id,text)
VALUES (6,1,'Nice viewwwww!');


INSERT INTO comment_comment (user_id,comment_id,text)
VALUES (5,1, 'Thanksss!');


INSERT INTO likes_post (user_id,post_id)
VALUES (6,1);


INSERT INTO likes_comment (user_id,comment_id)
VALUES (5,1);

--Hansi user hansi post atib
select users.id,user_name,email,post.title,post.text from post
                                                              inner join users on post.user_id = users.id;

--Hansi user hansi posta ne comment atib
SELECT users.id, users.user_name, users.email, post.title, comment_post.text AS comment_text
FROM comment_post
         INNER JOIN users ON comment_post.user_id = users.id
         INNER JOIN post ON comment_post.post_id = post.id;

--Hansi user hansi comment ne reply edib
SELECT users.id, users.user_name, users.email, comment_post.text AS original_comment_text, comment_comment.text AS reply_comment_text
FROM comment_comment
         INNER JOIN users ON comment_comment.user_id = users.id
         INNER JOIN comment_post ON comment_comment.comment_id = comment_post.id;

--Hansi user hansi postu beyenib
select users.id,user_name,email,post.title as liked_post from likes_post
                                                                  inner join users on likes_post.user_id = users.id
                                                                  inner join post on likes_post.post_id = post.id;

--Hansi user hansi commenti beyenib
select users.id,user_name,email,comment_post.text as liked_comment from likes_comment
                                                                            inner join users on likes_comment.user_id = users.id
                                                                            inner join comment_post on likes_comment.comment_id = comment_post.id;




