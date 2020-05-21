package gNumericTypes;
import libs.Input;

public class BotellasAgua {

    public static void main (String[] args){

        int minutos = get_positive_int();

        int botellas= minutos * 12;

        System.out.println("El número de botellas que gastas al bañarte son: " + botellas) ;
    }

    public static int get_positive_int()
    {
        int n;

        do
        {
            System.out.println("Introduce el número de minutos que tardas en bañarte: ");
            n = Input.get_int();
        }
        while (n <= 0);
        return n;
    }
}
