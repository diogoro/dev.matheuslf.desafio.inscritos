CREATE TABLE project
(
  id BIGINT NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR,
  startDate TIMESTAMP NOT NULL,
  endDate TIMESTAMP,
  CONSTRAINT pk_project PRIMARY KEY (id)
);

CREATE UNIQUE INDEX idx_project_name ON project (name);