SELECT 'create database desafio'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'desafio')
\gexec

SELECT 'create user postgres with encrypted password ''password'''
WHERE NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'postgres')
\gexec

GRANT ALL PRIVILEGES ON database desafio to postgres;