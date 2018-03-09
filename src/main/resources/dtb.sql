/*CREATE TABLE students (

  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

  student_name VARCHAR (50) NOT NULL DEFAULT 'none',

  student_last_name VARCHAR (50) NOT NULL DEFAULT 'none'

)
  ENGINE = InnoDB;

CREATE TABLE sections (

  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

  section_name VARCHAR (50) NOT NULL,

  section_description VARCHAR (220) NOT NULL DEFAULT 'NONE'

)
  ENGINE = InnoDB;

CREATE TABLE student_sections (
  student_id INT NOT NULL,
  section_id INT NOT NULL,

  FOREIGN KEY (student_id) REFERENCES students (id),
  FOREIGN KEY (section_id) REFERENCES sections (id),

  UNIQUE (student_id, section_id)
)
  ENGINE = InnoDB;*/

/*INSERT INTO students VALUES (1, 'David', 'Karchikyan');
INSERT INTO students VALUES (2, 'Narine', 'Aleksanyan');
INSERT INTO students VALUES (3, 'Ruben', 'Simonyan');

INSERT INTO sections VALUES (1, 'Math', 'Learn Geometry');
INSERT INTO sections VALUES (2, 'History', 'Learn after 1941 year history');
INSERT INTO sections VALUES (3, 'Chimic', 'Learn industrial chemics');

INSERT INTO student_sections VALUES (1, 1);
INSERT INTO student_sections VALUES (1, 3);
INSERT INTO student_sections VALUES (2, 1);
INSERT INTO student_sections VALUES (2, 2);
INSERT INTO student_sections VALUES (3, 1);
INSERT INTO student_sections VALUES (3, 2);
INSERT INTO student_sections VALUES (3, 3);*/
