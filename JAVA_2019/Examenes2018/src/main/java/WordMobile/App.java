package WordMobile;

public class App {
    public static Dispositivo[] dispositivos = new Dispositivo[5];
    public static final int MAX_DISPO = 5;
    public static int guardado;

    public static void addDispositivo(Dispositivo dispo) {
        for (int i = guardado; i < dispositivos.length; i++) {
            if (dispositivos[i] == null) {
                dispositivos[i] = dispo;
                guardado++;
                break;
            }
        }
    }

    private static boolean isGamaAlta(Dispositivo dispo) {
        return (dispo instanceof Smartphones && dispo.getPrecioFinal() > 600) || (dispo instanceof Tablets && dispo.getPrecioFinal() > 850);
    }

    public static void GammaAlta(Tablets dispositivo) {
        if (isGamaAlta(dispositivo)) {
            System.out.println("Es de gama alta");
        } else {
            System.out.println("No es gama alta");
        }

    }

    public static void GammaAlta(Smartphones dispositivo) {
        if (isGamaAlta(dispositivo)) {
            System.out.println("Es de gama alta");
        } else {
            System.out.println("No es gama alta");
        }

    }

    public static void main(String[] args) {
        Dispositivo relojInteligente = new GenericDispositivo("Xiaomi", "miband4", 100, "Reloj Inteligente");
        Dispositivo movil = new Smartphones("Xiaomi", "Redminote 8", 200, "Android", null, null);
        Dispositivo iphone = new Smartphones("Iphone", "Iphone 10", 300, "IOS", Hardware.gps, Hardware.accelerometre);
        Dispositivo tablet = new Tablets("Samsum", "7000", 400, 17);
        Dispositivo bascula = new GenericDispositivo("Xiaomi", "balcula 700", 302, "Bascula inteligente");

        addDispositivo(relojInteligente);
        addDispositivo(movil);
        addDispositivo(iphone);
        addDispositivo(tablet);
        addDispositivo(bascula);
        for (int i = 0; i < MAX_DISPO; i++) {
            System.out.println(dispositivos[i]);
        }

        GammaAlta((Smartphones) iphone);
        System.out.println(isGamaAlta(iphone));
        GammaAlta((Tablets) tablet);
    }
}
