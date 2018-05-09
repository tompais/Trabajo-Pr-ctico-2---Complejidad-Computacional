package main;
import matriz.MostrarDiagPpalDeMatriz;
public class Main {

	public static void main(String[] args) {
	
		int tam=25000;
		int [][] m= new int [tam][tam];
		MostrarDiagPpalDeMatriz mat= new MostrarDiagPpalDeMatriz(m,tam);
		long inicio1 =System.nanoTime();
		mat.evaluarConFor();
		long fin1 =System.nanoTime();
		double dif1 = (double)(fin1-inicio1)* 1e-9;
		System.out.println("La ejecucion con CC=N dura :" +dif1+ " segundos");
		inicio1 =System.nanoTime();
		mat.evaluarCon2For();
		fin1 =System.nanoTime();
		dif1= (double)(fin1-inicio1)* 1e-9;
		System.out.println("La ejecucion con CC=N^2 dura :" +dif1+ " segundos");
		inicio1 =System.nanoTime();
		mat.evaluarRecursiva(0);
		fin1 =System.nanoTime();
		dif1= (double)(fin1-inicio1)* 1e-9;
		System.out.println("La ejecucion con CC=recursiva dura :" +dif1+ " segundos");
		
	}

}
