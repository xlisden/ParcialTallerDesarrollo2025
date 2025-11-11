package unu.MsArticulo.utils;

public class ApiRoutes {

    public static class ArticuloRoutes {
        private ArticuloRoutes() {
            throw new UnsupportedOperationException();
        }

        public static final String BASE = "/api/articulos";
        public static final String add = "/add";
    }
}
