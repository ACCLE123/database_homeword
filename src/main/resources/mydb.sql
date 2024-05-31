CREATE TABLE db_student
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
CREATE TABLE db_student_course
(
    id         SERIAL PRIMARY KEY,
    student_id INT NOT NULL,
    course_id  INT NOT NULL,
    grade      INT NOT NULL,
    FOREIGN KEY (student_id) REFERENCES db_student(id),
    FOREIGN KEY (course_id) REFERENCES db_course(id)
);
CREATE TABLE db_course
(
    id           SERIAL PRIMARY KEY,
    name         VARCHAR(255) NOT NULL,
    weekday      INT          NOT NULL,
    start_hour   INT          NOT NULL,
    start_minute INT          NOT NULL,
    end_hour     INT          NOT NULL,
    end_minute   INT          NOT NULL
);

-- 插入数据到 db_course 表
INSERT INTO db_course (name, weekday, start_hour, start_minute, end_hour, end_minute)
VALUES ('Mathematics', 1, 9, 0, 10, 30),          -- Monday
       ('English Literature', 2, 10, 45, 12, 15), -- Tuesday
       ('Physics', 3, 13, 0, 14, 30),             -- Wednesday
       ('Chemistry', 4, 14, 45, 16, 15),          -- Thursday
       ('Biology', 5, 16, 30, 18, 0),             -- Friday
       ('History', 0, 9, 0, 10, 30),              -- Sunday
       ('Geography', 6, 11, 0, 12, 30);
-- Saturday

-- 插入数据到 db_student 表
INSERT INTO db_student (name)
VALUES ('Alice Johnson'),
       ('Bob Smith'),
       ('Charlie Brown'),
       ('Diana Prince'),
       ('Edward Elric');

-- 插入数据到 db_student_course 表
INSERT INTO db_student_course (student_id, course_id, grade)
VALUES (1, 1, 90), -- Alice Johnson takes Mathematics on Monday
       (1, 2, 85), -- Alice Johnson takes English Literature on Tuesday
       (2, 3, 88), -- Bob Smith takes Physics on Wednesday
       (3, 4, 92), -- Charlie Brown takes Chemistry on Thursday
       (4, 5, 87), -- Diana Prince takes Biology on Friday
       (5, 6, 93), -- Edward Elric takes History on Sunday
       (5, 7, 78), -- Edward Elric takes Geography on Saturday
       (1, 5, 80), -- Alice Johnson also takes Biology on Friday
       (2, 4, 70), -- Bob Smith also takes Chemistry on Thursday
       (3, 1, 60); -- Charlie Brown also takes Mathematics on Monday

