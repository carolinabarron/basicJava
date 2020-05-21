package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1;  // Inicializa la variable n en 1
	    for (int i = 0; i < 64; i++) //Ciclo for inicializando el contador en 0 hasta increementar menor a 64, incrementa i en 1 cada ciclo
	    {
	    	System.out.print("n: " + n + "\n"); //Imprime el valor de n cada que entra al ciclo
	        n = n * 2; // el valor de n lo multiplica por 2
	    }
	}
}
//el ciclo for llegó hasta la iteración de i = 30 pues el valor calculado para n excedió el valor de almacenamiento de un int (entero)


