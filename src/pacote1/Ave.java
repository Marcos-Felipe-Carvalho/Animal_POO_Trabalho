package pacote1;

public abstract class Ave extends Animal {
	/* Atributos da classe Ave */
	private int evergaduraAsa;

	/* Construtor da classe Ave */
	public Ave(String nome, String especie) {
		super(nome, especie); // Referência os atributos da classe pai(Animal)
		// TODO Auto-generated constructor stub
	}

	// Getters e Setters
	public int getEvergaduraAsa() {
		return evergaduraAsa;
	}

	public void setEvergaduraAsa(int evergaduraAsa) {
		this.evergaduraAsa = evergaduraAsa;
	}

	/*
	 * Sobreescreve o método toString para mostrar as informações conforme a classe
	 * Ave
	 */
	@Override
	public String toString() {
		String resultado;

		resultado = String.format("Animal..............: " + this.getClass().getSimpleName() + "\n")
				+ String.format("Nome da ave.........: " + this.getNome() + "\n")
				+ String.format("Especie da ave......: " + this.getEspecie() + "\n")
				+ String.format("Cor da ave..........: " + this.getCor() + "\n")
				+ String.format("Evergadura asa......: " + this.evergaduraAsa + "\n")
				+ String.format("***************************************************************");

		return resultado;
	}

}
