public class DataStore {
    private static int progresoComer = 0;
    private static int progresoBeber = 0;
    private static int progresoDormir = 0;

    public static int getProgresoComer() {
        return progresoComer;
    }

    public static void setProgresoComer(int progreso) {
        progresoComer = progreso;
    }

    public static int getProgresoBeber() {
        return progresoBeber;
    }

    public static void setProgresoBeber(int progreso) {
        progresoBeber = progreso;
    }

    public static int getProgresoDormir() {
        return progresoDormir;
    }

    public static void setProgresoDormir(int progreso) {
        progresoDormir = progreso;
    }
}

