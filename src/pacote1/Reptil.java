package pacote1;

public class Reptil extends Animal {
	// Atributos da classe Animal
	private int nrDentes;

	/* Construtor da classe Reptil */
	public Reptil(String nome, String especie) {
		super(nome, especie); // Referência os atributos da classe pai(Animal)
		// TODO Auto-generated constructor stub
	}

	/* Getters e Setters */
	public int getNrDentes() {
		return nrDentes;
	}

	public void setNrDentes(int nrDentes) {
		this.nrDentes = nrDentes;
	}

	// Métodos da classe Reptil
	@Override
	public void alimentar() { // sobreescreve o método da classe Animal

	}

	/*
	 * Sobreescreve o método toString para mostrar as informações conforme a classe
	 * Reptil
	 */
	@Override
	public String toString() {
		String resultado;

		resultado = String.format("Animal..............: " + this.getClass().getSimpleName() + "\n")
				+ String.format("Nome do Reptil......: " + this.getNome() + "\n")
				+ String.format("Especie do reptil...: " + this.getEspecie() + "\n")
				+ String.format("Cor do reptil.......: " + this.getCor() + "\n")
				+ String.format("Número de dentes....: " + this.getNrDentes() + "\n")
				+ String.format("***************************************************************");

		return resultado;
	}
}
