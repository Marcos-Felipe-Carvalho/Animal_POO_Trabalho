package pacote1;

import java.util.ArrayList;

public abstract class Animal {

	/* Atributos da classe animal */
	protected String especie;
	protected String nome;
	private static String[] cores = { "verde", "vermelha", "amarela", "azul", "preta", "branca" };
	private String cor = "";
	private static int nrAnimais = 0;
	private static ArrayList<Animal> animais = new ArrayList();

	/* M�todo construtor */
	public Animal(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
		this.nrAnimais++;

		animais.add(this);
	}

	/* Getters e Setters */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		/* Valida cores */

		String msg = ""; // vari�vel para informar a mensagem conforme a valida��o

		for (String i : Animal.cores) { // Verifica se a cor est� definida na lista
			if (i.equals(cor)) {
				this.cor = cor;
				msg = "A cor do animal foi definida com sucesso! A cor �: " + cor;
				break;
			} else {
				msg = "Erro ao definir cor";
			}
		}
		System.out.println(msg);
	}

	/* Retorna o n�mero de animais*/
	public static int getNrAnimais() {
		return nrAnimais;
	}
	

	/* M�todos da classe */
	public void movimentar() {

	}

	public void alimentar() {

	}

	/*M�todos para exibir os animais instaciados*/
	public static void exibeAnimais() {
		for (Animal animal : animais) { //animais: lista que cont�m os animais instaciados
			System.out.println(animal.toString());
		}
	}
}
