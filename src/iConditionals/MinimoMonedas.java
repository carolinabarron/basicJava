package iConditionals;
import libs.Input;

public class MinimoMonedas {

    public static void main(String[] args) {
      System.out.println("Introduce el cambio a devolver: ");
     double cambiod = Input.get_double();
     int cambio= (int) (cambiod * 100);
      calculaMonedas(cambio);

    }

    private static void calculaMonedas(int cambio) {

        int mon25 = 0;
        int mon10 = 0;
        int mon5 = 0;
        int mon1 = 0;
        int centavosSobrantes=0;
        int numMonedas = 0;

        if (cambio >= 25) {
            mon25 = cambio / 25;
            centavosSobrantes = cambio % 25;
            numMonedas = mon25;
        }

        if (centavosSobrantes >= 10) {
            mon10 = centavosSobrantes / 10;
            centavosSobrantes = centavosSobrantes % 10;
            numMonedas = numMonedas + mon10;
        }
        if (centavosSobrantes >= 5) {
            mon5 = centavosSobrantes / 5;
            centavosSobrantes = centavosSobrantes % 5;
            numMonedas = numMonedas + mon5;
        }
        if (centavosSobrantes >= 1) {
            mon1 = centavosSobrantes / 1;
            //int resto1 = mon1 % 1;
            numMonedas = numMonedas + mon1;
        }

        System.out.println("Numero de monedas de cambio = " + numMonedas);
        System.out.println("Numero de monedas de $25c = " + mon25);
        System.out.println("Numero de monedas de $10c = " + mon10);
        System.out.println("Numero de monedas de $5c = " + mon5);
        System.out.println("Numero de monedas de $1c = " + mon1);

    }
    }

