CREATE TABLE project
(
  id serial NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR,
  start_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP,
  CONSTRAINT pk_project PRIMARY KEY (id)
);

CREATE UNIQUE INDEX idx_project_name ON project (name);