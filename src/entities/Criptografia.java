
package entities;

public class Criptografia {

	public static String criptografia(String mensagem) {
		String mensagemCriptografada = "";
		String alfabeto = " abcdefghijklmnopqrstuvwxyz";
		int chave = 3;

		for (int i = 0; i < mensagem.length(); i++) {
			char letra = mensagem.charAt(i);
			int indice = alfabeto.indexOf(Character.toLowerCase(letra));
			int indiceCriptografado = (indice + chave) % 27;
			char letraCriptografada = alfabeto.charAt(indiceCriptografado);
			mensagemCriptografada += letraCriptografada;
		}
		return mensagemCriptografada;
	}

	public static String descriptografia(String mensagem) {
		String mensagemDescriptografada = "";
		String alfabeto = " abcdefghijklmnopqrstuvwxyz";
		int chave = 3;

		for (int i = 0; i < mensagem.length(); i++) {
			char letra = mensagem.charAt(i);
			int indice = alfabeto.indexOf(Character.toLowerCase(letra));
			int indiceDescriptografado = (indice - chave + 27) % 27;
			char letraDescriptografada = alfabeto.charAt(indiceDescriptografado);
			mensagemDescriptografada += letraDescriptografada;
		}
		return mensagemDescriptografada;
	}

}
