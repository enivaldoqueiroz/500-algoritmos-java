package algoritmos.resolvidos;

import java.text.DecimalFormat;

public class Algoritmo19 {

	public static void main(String[] args) {
		// Algoritmo19
		
		/*
		import java.lang.Math (Funções Matemáticas)
			Programação de Computadores I
			import java.lang.Math (Funções Matemáticas)
			
		Funções : Math.sqrt(a) - retorna a raiz quadrada de a.
			Math.ceil(a) - retorna o valor double maior e mais próximo de a ("arredonda pra cima").
			Math.floor(a) - retorna o valor double menor e mais próximo de a ("arredonda pra baixo").
			Math.rint(a) - retorna o valor mais próximo de a (arredondamento normal).
			Math.atan2(x, y) - converte as coordenadas retangulares (x, y) em coordenadas polares (r, θ).
			Math.pow(x, y) - retorna o valor x elevado à potência y.
			Math.round(a) - retorna o valor mais próximo de a.
			Math.random() - retorna um valor "aleatório" entre 0 e 1**.
			Math.abs(a) - retorna o valor absoluto de a ( |a| )***.
			Math.max(a, b) - retorna o maior valor entre a e b.
			Math.min(a, b) - retorna o menor valor entre a e b.
			
		Funções : Math.sqrt(a) - retorna a raiz quadrada de a.
			Math.ceil(a) - retorna o valor double maior e mais próximo de a ("arredonda pra cima").
			Math.floor(a) - retorna o valor double menor e mais próximo de a ("arredonda pra baixo").
			Math.rint(a) - retorna o valor mais próximo de a (arredondamento normal).
			Math.atan2(x, y) - converte as coordenadas retangulares (x, y) em coordenadas polares (r, θ).
			Math.pow(x, y) - retorna o valor x elevado à potência y.
			Math.round(a) - retorna o valor mais próximo de a.
			Math.random() - retorna um valor "aleatório" entre 0 e 1**.
			Math.abs(a) - retorna o valor absoluto de a ( |a| )***.
			Math.max(a, b) - retorna o maior valor entre a e b.
			Math.min(a, b) - retorna o menor valor entre a e b.
			
		Constantes: Math.PI - equivale à constante pi (π)
			Math.E - equivale à constante e, a base dos logaritmos naturais.

		*/
		
		//Variaveis
		int x = 64;
		String padrao = "###,####.###";
		DecimalFormat p = new DecimalFormat(padrao);
		
		//Saidas
		System.out.println("Raiz de 64: " + Math.sqrt(x));
		System.out.println("\nRaiz com exp e log (Transformando real em inteiro): " + (int)Math.pow((Math.sqrt(Math.log(x))), 3));
		System.out.println("\nRaiz com exp e log (Transformando real em inteiro): " + (int)Math.exp((Math.sqrt(Math.log(x)))));
		//System.out.println("\nRaiz com exp e log (Transformando real em inteiro): " + (int)Math.pow((1%2*(Math.log(x))), 3));
		//System.out.println("\nRaiz com exp e log (Sem Transformar real em inteiro): " + Math.pow((Math.sqrt(Math.log(x))), 3));
		System.out.println("\nRaiz com exp e log (Sem Transformar real em inteiro): " + Math.exp((Math.sqrt(Math.log(x)))));
		System.out.print(p.format(Math.asin(45*Math.PI/180)+0.0001)+3);
		System.out.println("\nRaiz cubica: " + Math.log(8));
		System.out.println("\nRaiz cubica: " + Math.cbrt(8));
		System.out.println("\nAboluto: " + Math.abs(-8));
		System.out.println("\nAboluto: " + Math.abs(8));
		System.out.println("\nConvertendo para inteiro 5.5: " + (int)5.5);
		System.out.println("\nConvertendo para inteiro 6.5: " + (int)6.5);
		System.out.println("\nConvertendo para inteiro 6.5 + 0.000.1: " + (int)(6.5 + 0.0001));
		System.out.println("\nConvertendo para inteiro 5.45: " + (int)5.45);
		System.out.println("\nConvertendo para inteiro 5.51: " + (int)5.51);
		System.out.println("\nConvertendo para real 87: " + (float)87);
		System.out.println("\nConvertendo para inteiro 3/4: " + (3/4) + "\n");
		System.out.println("\n");
	}

}
