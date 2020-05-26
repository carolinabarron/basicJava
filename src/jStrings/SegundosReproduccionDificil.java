package jStrings;
import libs.Input;

public class SegundosReproduccionDificil {
    public static void main(String[] args) {
        do {
            System.out.println("Introduce el número de segundos: ");
            int numero = Input.get_int();
            if (numero > 0) {
                calculaMinSeg(numero);
                break;
            }

            else  {
                System.out.println("Introduce número de segundos mayor a cero por favor");
            }

        } while (true);
    }

        private static void calculaMinSeg(int numero) {
            int min = 0;
            int seg = 0;
            int segundosSobrantes=0;

            if (numero >= 60) {
                min = numero / 60;
                segundosSobrantes = numero % 60;

            }

            if (segundosSobrantes <=60) {
               seg = segundosSobrantes ;
            }
            System.out.println(numero + " segundos es igual a : " + min + " minutos y " + seg + " segundos");

    }
}
