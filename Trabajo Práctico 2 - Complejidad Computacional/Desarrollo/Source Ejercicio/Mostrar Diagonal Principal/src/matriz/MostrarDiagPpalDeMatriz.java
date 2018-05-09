package matriz;

public class MostrarDiagPpalDeMatriz {
	private int [][] m;
	private int tam;
	public MostrarDiagPpalDeMatriz() {
		
	}
	public MostrarDiagPpalDeMatriz(int [][]matriz,int tamanio) {
		this.m=matriz;
		this.tam=tamanio;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				m[i][j]=i;
			}
		}
	}
	
	public void evaluarConFor() {
		for (int i = 0; i < tam ; i++) {

			System.out.print("");
			//System.out.println("Posicion "+i+" "+i+": "+m[i][i]);

		}
	}

	public void evaluarCon2For() {
		for (int i = 0; i < tam ; i++) {

			for (int j = 0; j < tam ; j++) {
				if(j==i)
					System.out.print("");

//					System.out.println("Posicion "+i+" "+j+": "+m[i][j]);
				
			}
	
		}
	}
	public int evaluarRecursiva(int i) {
		System.out.print("");
		//System.out.println("Posicion "+i+" "+i+": "+m[i][i]);
		if(i<tam-1)
			return evaluarRecursiva(i+1);
		return 0;

	}
}
