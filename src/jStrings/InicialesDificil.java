package jStrings;
import libs.Input;

public class InicialesDificil {
    public static void main(String[] args) {
        System.out.println("Introduce el nombre completo ");
        String nomTrim = Input.get_string().trim();

        String[] nombres = nomTrim.split("\\s+");

        for (int i = 0; i < nombres.length; i++) {
            String upperNombre = nombres[i].toUpperCase();
      //      if (upperNombre.charAt(0) >= 'A' && upperNombre.charAt(0) <= 'Z') {
                System.out.print(upperNombre.charAt(0));
      //      }
        }
    }
}

