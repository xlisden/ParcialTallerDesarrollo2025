package unu.MsMovimiento.utils;

public class ApiRoutes {

    public static class MovimientoRoutes {
        private MovimientoRoutes() {
            throw new UnsupportedOperationException();
        }

        public static final String BASE = "/api/movimientos";
        public static final String actualizarEstado = "/actualizar-estado/{idMovimiento}";
    }
}
