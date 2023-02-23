/* Um dos sistemas de encripta��o mais antigos � atribu�do a J�lio C�sar: se uma
letra a ser encriptada � a letra de n�mero N do alfabeto, substitua-a com a letra
(N+K), onde K � um n�mero inteiro constante (C�sar utilizava K = 3).
Usualmente consideramos o espa�o como zero e todos os c�lculos s�o
realizados com m�dulo-27. Dessa forma, para K = 1 a mensagem �Ataque ao
amanhecer� se torna �bubrfabpabnboifdfs�. Fa�a um programa que receba como
entrada uma mensagem e um valor de J e retorne a mensagem criptografada
pelo c�digo de C�sar. Fraquezas: apenas 26 chaves poss�veis. � poss�vel utilizar
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
