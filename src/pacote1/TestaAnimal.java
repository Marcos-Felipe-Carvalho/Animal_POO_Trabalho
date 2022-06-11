package pacote1;

import java.util.Scanner;

public class TestaAnimal {
	static Scanner entrada = new Scanner(System.in); // Variável para obter as informações do teclado

	public static void main(String[] args) {
		/* Variáveis */
		boolean sair = false;
		int opcao, evergaduraAsa, nrDentes;
		String nome, especie, cor;

		/* Menu de opções */
		while (sair != true) {
			System.out.println("***** TRABALHO POO - ANIMAL *****");
			System.out.println("1) Incluir arara");
			System.out.println("2) Incluir jacaré");
			System.out.println("3) Incluir lagarto");
			System.out.println("4) Mostrar quantidade de animais");
			System.out.println("5) Listar animais");
			System.out.println("6) Sair");

			System.out.println("Selecione uma opção(número):");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(" --- Nova arara: --- ");

				nome = obtemNome("arara");

				especie = obtemEspecie("arara");

				Arara arara = new Arara(nome, especie);

				defineCor("arara", arara);

				System.out.println("Digite a envergadura da asa da arara:");
				evergaduraAsa = entrada.nextInt();
				arara.setEvergaduraAsa(evergaduraAsa);

				break;

			case 2:
				System.out.println(" --- Novo jacaré: --- ");

				nome = obtemNome("jacaré");

				especie = obtemEspecie("jacaré");

				Jacare jacare = new Jacare(nome, especie);

				defineCor("jacaré", jacare);

				System.out.println("Digite a quantidade de dentes do jacaré:");
				nrDentes = entrada.nextInt();
				jacare.setNrDentes(nrDentes);
				break;

			case 3:
				System.out.println(" --- Novo lagarto: --- ");

				nome = obtemNome("lagarto");

				especie = obtemEspecie("lagarto");

				Lagarto lagarto = new Lagarto(nome, especie);

				defineCor("lagarto", lagarto);

				System.out.println("Digite a quantidade de dentes do lagarto:");
				nrDentes = entrada.nextInt();
				lagarto.setNrDentes(nrDentes);
				break;

			case 4:
				System.out.println(Animal.getNrAnimais() + " animal(is) foram instanciados");
				break;
			case 5:
				Animal.exibeAnimais();
				break;
			case 6:
				sair = true;
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		}

	}

	/* Métodos para obter informações comum dos animais */
	public static String obtemNome(String animal) {
		System.out.println("Digite o nome do(a) " + animal + ":");
		return entrada.next();
	}

	public static String obtemEspecie(String animal) {
		System.out.println("Digite a espécie do(a) " + animal + ":");
		return entrada.next();
	}

	public static void defineCor(String animal, Animal tipoAnimal) {
		while (tipoAnimal.getCor() == "") {
			System.out.println("Digite a cor da arara:");
			tipoAnimal.setCor(entrada.next());
		}
	}
}
