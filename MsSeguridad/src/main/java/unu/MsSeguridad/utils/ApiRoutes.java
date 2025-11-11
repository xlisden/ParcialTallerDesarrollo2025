package unu.MsSeguridad.utils;

public class ApiRoutes {

    public static class SeguridadRoutes {
        private SeguridadRoutes() {
            throw new UnsupportedOperationException();
        }

        public static final String BASE = "/api/auth";
        public static final String login = "/login";

    }
}
