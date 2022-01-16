/*
 * PROBLEMA: dado um array de numeros e um alvo, escever um algoritimo que encontre todas as combinações de dois numeros que somados deem o valor alvo
 * quando uma combinação for encontrada , imprimir os numeros e os indices correspondentes.
 * não somar o numero de uma posição do array com ele mesmo 
 * executar algoritimo com as seguintes entradas
 * array:[1, 2, 3, 4, 5, 6, 7, 8, 9] / valor alvo 10 
 * array:[3, 8, 9, 6, 8, 5,] valor alvo 10
 * array: [4, 8, 6, 1, 3, 7] valor alvo 7
 */


package exerciciosjava;

public class vertores_aberto1 {

	public static void main(String[] args) {
		
		//criando vetores
		int[]numeros;
		int[]numeros2;
		
		//inciando vetores e dando tamanho a eles
		 for(int i = 1; i < 10; i++) {
    	//criando variavel [i]	
			 
			 numeros = new int[i];
		//enquanto a for menor que 10 adicionar mais um 
			 for(int a = 1; a < 10; a++) {
		    		numeros2 = new int[a];
		//criando variavel soma 		 
			 int soma;
		//somar somente quando i for diferente de a	 
			 if (i!=a) {
		//somando vetores i + a
				 soma = i + a;
	    // se a soma for 10 imprima resultados
				 if (soma == 10) {
					 System.out.println("vetor i = " + i + " + " + "vetor a = " + a + " = " + soma);
					
					
				 }
			 
			  }
			 }

		 }
		
	}

}
//criando vetores
//inciando vetores e dando tamanho a eles
//criando variavel [i]	
//enquanto a for menor que 10 adicionar mais um 
//criando variavel soma
//somar somente quando i for diferente de a	 
//somando vetores i + a
// se a soma for 10 imprima resultados