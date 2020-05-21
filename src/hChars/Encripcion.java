package hChars;

public class Encripcion {

    public static void main(String[] args) {
        char inicial = 'a';
        int x = 12;

        String numero1 = "45";
        System.out.println(Integer.parseInt(numero1));

        String numero2 = "23.45";
        System.out.println(Double.parseDouble(numero2));

        double domingo = 45.89;
        System.out.println((int) domingo);
        System.out.println((char)(x + inicial));
    }
}
