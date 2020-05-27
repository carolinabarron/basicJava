package jStrings;
import libs.Input;

public class InicialesFacil {
    public static void main(String[] args) {
        System.out.println("Introduce el nombre completo de la persona dando un espacio entre cada nombre y apellido ");
        String nombre=Input.get_string();

        String[] nombres=nombre.split(" ");

            for(int i=0; i<nombres.length; i++) {
                  if (nombres[i].charAt(0) >= 'A' && nombres[i].charAt(0) <= 'Z') {
                    System.out.print(nombres[i].charAt(0));
                }
            }
    }
}
