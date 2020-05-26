package jStrings;

import libs.Input;

public class SegundosReproduccion {
    public static void main(String[] args) {

        //Ciclo hasta que de un valor correcto
        //1. Tiene 2 valores el split
        //2. Minutos y segundos deben ser enteros
        //3. Los segundos deben ser 0 y 59
        do {
            System.out.println("Introduce la duración del video (en el formato mm:ss): ");
            String s = Input.get_string();

            int min = 0;
            int seg = 0;

            String[] arreglo = s.split(":");
            if(arreglo.length==2) {
                try {
                    min = Integer.parseInt(arreglo[0]);
                    seg = Integer.parseInt(arreglo[1]);
                    if(seg<0 || seg>=60){
                        System.out.println("Cantidad de segundos incorrecta, debe ser igual o menor a 59");
                    }
                    else {
                        int duracion = (min * 60) + seg;
                        System.out.println("El video dura: " + duracion + "segundos");
                        break;
                    }
                } catch (Exception ex) {
                    // ex.printStackTrace();
                    System.out.println("Error en el valor introducido- Formato mm:ss");


                    /* Programa de Omar
                    package jStrings;

import libs.Input;

public class ConversionSegundos {

    public static void main(String[] args) {

    do{
        System.out.println("duracion del video: (mm:ss)");
        String duracionVideo = Input.get_string();


        int min = 0;
        int seg = 0;
        String[] minutos = duracionVideo.split(":");
        if(minutos.length==2){
            try {
                min = Integer.parseInt(minutos[0]);
                seg = Integer.parseInt(minutos[1]);
                if(seg < 0 || seg>=60){
                    System.out.println("Cantidad incorrecta de segundos..");
                } else {
                    System.out.println("El total del video en segundos es: " + (min*60 + seg));
                 break;
                }

            } catch(NumberFormatException ex) {
                System.out.println("Error en la recepcion de datos. el formato correcto es mm:ss");
            }
        }
        else{
            System.out.println("Formato incorrecto...");

        }


    }while(true);
        //ciclo hasta que de un valor correcto.
        //1.  tiene dos valores el split
        //2.  tanto minutos como segundos deben ser enteros
        //3.  los segundos deben ser 0 y 59
                     */

                }

            }
            else{
                System.out.println("formato incorrecto .. ");
            }
        }while(true);



    }
}
