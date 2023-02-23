/* Um dos sistemas de encriptação mais antigos é atribuído a Júlio César: se uma
letra a ser encriptada é a letra de número N do alfabeto, substitua-a com a letra
(N+K), onde K é um número inteiro constante (César utilizava K = 3).
Usualmente consideramos o espaço como zero e todos os cálculos são
realizados com módulo-27. Dessa forma, para K = 1 a mensagem “Ataque ao
amanhecer” se torna “bubrfabpabnboifdfs”. Faça um programa que receba como
entrada uma mensagem e um valor de J e retorne a mensagem criptografada
pelo código de César. Fraquezas: apenas 26 chaves possíveis. É possível utilizar
conhecimento da linguagem para facilitar a busca.*/

package application;

import java.util.Scanner;

import entities.Criptografia;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a mensagem que deseja encriptografar.");
		String mensagem = sc.nextLine();
		String mensagemCriptografada = Criptografia.criptografia(mensagem);
		System.out.println(mensagemCriptografada);
		String mensagemDescriptografada = Criptografia.descriptografia(mensagemCriptografada);
		System.out.println(mensagemDescriptografada);
		
		sc.close();
	}

}
