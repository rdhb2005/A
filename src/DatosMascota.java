public class DatosMascota {
    private static String nombreMascota;
    private static String rutaImagen;

    public static void setNombreMascota(String nombre) {
        nombreMascota = nombre;
    }

    public static String getNombreMascota() {
        return nombreMascota;
    }

    public static void setRutaImagen(String ruta) {
        rutaImagen = ruta;
    }

    public static String getRutaImagen() {
        return rutaImagen;
    }

}