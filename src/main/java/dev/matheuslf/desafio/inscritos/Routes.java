package dev.matheuslf.desafio.inscritos;

public class Routes {
    public static final String ROOT = "api/v1";

    public static class Project {
        public static final String PATH = ROOT + "/projects";
    }

    public static class Task {
        public static final String PATH = ROOT + "/tasks";
        public static final String DELETE = PATH + "/{id}";
        public static final String UPDATE_STATUS = PATH + "/{id}/status";

    }
}
