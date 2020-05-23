package iLoops;

import libs.Input;

public class DibujarGatitos {

    public static void main(String[] args) {
        System.out.println("Pirámide altura 3: ");
        dibujarPiramide(3);
        System.out.println("Pirámide altura 5: ");
        dibujarPiramide(5);
        System.out.println("Pirámide altura 10: ");
        dibujarPiramide(10);

    }
    private static void dibujarPiramide(int altura) {
        for(int i =1; i <= altura; i++) {
            int numGatitos = i + 1;
            int numEspacios = altura+1-numGatitos;
            dibujarLinea(numEspacios, numGatitos);
        }
    }

    private static void dibujarLinea(int numEspacios, int numGatitos) {

        for(int i =0; i < numEspacios; i++) {
            Input.print(" ");
        }

        for(int i =0; i < numGatitos; i++) {
            Input.print("#");
        }
        System.out.println();
    }





  }
