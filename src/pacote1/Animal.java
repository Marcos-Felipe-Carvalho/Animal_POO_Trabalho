package pacote1;

import java.util.ArrayList;

public abstract class Animal {
	
	/*Atributos da classe animal*/
	protected String especie;
	protected String nome;
	private static String[] cores = {"verde", "vermelha", "amarela", "azul", "preta", "branca"};
	private String cor = "";
	private static int nrAnimais = 0;
	private static ArrayList<Animal> animais = new ArrayList();
	
	/*Método construtor*/
	public Animal(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
		this.nrAnimais++;
		
		animais.add(this);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*Getters e Setters*/
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
		/*Valida cores*/
		
		String msg = ""; //variável para informar a mensagem conforme a validação
		
		for(String i : Animal.cores) { //Verifica se a cor está definida na lista
			if(i.equals(cor)) {
				this.cor = cor;
				msg = "A cor do animal foi definida com sucesso! A cor é: " + cor;
				break;
			}else {
				msg = "Erro ao definir cor";
			}
		}
		System.out.println(msg);
	}

	public static int getNrAnimais() {
		return nrAnimais;
	}

	public static void setNrAnimais(int nrAnimais) {
		Animal.nrAnimais = nrAnimais;
	}

	/*Métodos da classe*/
	public void movimentar() {
		
	}	
	
	public void alimentar() {
		
	}
	
	public static void exibeAnimais() {
		for(Animal animal : animais) {
			System.out.println(animal.toString());
		}
	}
}	
