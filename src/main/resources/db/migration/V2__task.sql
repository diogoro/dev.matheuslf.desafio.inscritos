CREATE TYPE status_type AS ENUM ('TODO', 'DOING', 'DONE');
CREATE TYPE priority_type AS ENUM ('LOW', 'MEDIUM', 'HIGH');

CREATE TABLE task
(
  id BIGINT NOT NULL,
  title VARCHAR(150) NOT NULL,
  description VARCHAR NOT NULL,
  status status_type NOT NULL,
  priority priority_type NOT NULL,
  dueDate TIMESTAMP NOT NULL,
  project_id BIGINT NOT NULL,

  CONSTRAINT pk_task PRIMARY KEY (id),
  CONSTRAINT fk_project
    FOREIGN KEY(project_id)
     REFERENCES project(id)
);

CREATE UNIQUE INDEX idx_task_title ON task (title);