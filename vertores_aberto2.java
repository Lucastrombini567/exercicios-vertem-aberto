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

public class vertores_aberto2 {

	public static void main(String[] args) {
		
	//criando arrays, variaveis e iniciando com valores nas arrays
		int[]numeros = {4,8,6,1,3,7,};
		int[]numeros1 = {4,8,6,1,3,7,};
		
    //criando variavel tipo inteiro soma 
		int soma = 0;  
	//criando laço de repetição enquanto i nao alcançar length adicionar mais 1
		 for(int i = 0; i < numeros.length; i++) {
			 for(int a = 0; a < numeros1.length; a++) {
	//se numeros[i] for diferente de numeros1[a] somar, se for igual não somar
				 if(numeros[i] != numeros1[a]) {
	//somando variaveis
					 soma = numeros[i] + numeros1[a];
	//se soma for igual a 7 imprima os resultados
					 if(soma == 7) {
						 System.out.println("indice1  " + numeros[i] + " indice2: " + numeros1[a] + 
								 " o resultado da soma desses indices é " + soma);
						 
						 
					 }
			      }		 
			
			 }
			 
		   }
		 
		 
		}

	

		
		
	}


