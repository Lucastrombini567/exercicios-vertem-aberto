//teste Vertem Aberto
/*
 * problema: Atingir valor alvo, escrever algoritimo  que encontre todas as combinacoes de dois numeros que somados seem valor alvo.
 * quando uma combinaçao for encontrada, imprimir os numeros e os indices correspondentes.
 * não somar o numero de uma posição do array com ele mesmo 
 * 1 array: [1,2,3,4,5,6,7,8,9] valor alvo 10
 * 2 array: [3,8,9,6,8,5] valor alvo 10
 * 3 array: [4,8,6,1,3,7] valor alvo 7
 */
package exerciciosjava;

public class vetores_aberto {

	public static void main(String[] args) {
	 //declarando variaveis e preenchendo arrays
	 int[]numeros = {3, 8, 9, 6, 8, 5,};
	 int[]numeros1= {3, 8, 9, 6, 8, 5,};
	 //criando variavel soma
	 int soma = 0;  
	 //criando laço de repetiçao enquanto a variavel "i"  nao for igual a length "i++" adicione mais 
	 for(int i = 0; i < numeros.length; i++) {
		 for(int a = 0; a < numeros1.length; a++) {
	 //se numeros[i] for diferente de numeros1[a] somar, se for igual não somar 
			 if(numeros[i] != numeros1[a]) {
	 //soamando variaveis
	 			 soma = numeros[i] + numeros1[a];
	//se a soma for igual a 10 imprima resultados
	 			 if(soma == 10) {
					 System.out.println("indice1  " + numeros[i] + " indice2: " + numeros1[a] + 
							 " o resultado da soma desses indices é " + soma);
				 }
	// se a soma for diferente imprima valor alvo nao alcançado
	 			 if(soma != 10) {
					 System.out.println("Valor alvo não alcançado");
				 }
	 
		 }		 
		 }
	   }
	 
	 
	}

}
