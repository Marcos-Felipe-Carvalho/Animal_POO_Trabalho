package pacote1;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		boolean sair = false;
		int opcao, evergaduraAsa, nrDentes;
		String nome, especie, cor;

		Scanner entrada = new Scanner(System.in);

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

				System.out.println("Digite o nome da arara:");
				nome = entrada.next();

				System.out.println("Digite a especie da arara:");
				especie = entrada.next();

				Arara arara = new Arara(nome, especie);

				while (arara.getCor() == "") {
					System.out.println("Digite a cor da arara:");
					cor = entrada.next();
					arara.setCor(cor);
				}

				System.out.println("Digite a envergadura da asa da arara:");
				evergaduraAsa = entrada.nextInt();
				arara.setEvergaduraAsa(evergaduraAsa);

				break;

			case 2:
				System.out.println(" --- Novo jacaré: --- ");

				System.out.println("Digite o nome do jacaré:");
				nome = entrada.next();

				System.out.println("Digite a especie do jacaré:");
				especie = entrada.next();

				Jacare jacare = new Jacare(nome, especie);

				while (jacare.getCor() == "") {
					System.out.println("Digite a cor do jacaré:");
					cor = entrada.next();
					jacare.setCor(cor);
				}

				System.out.println("Digite a quantidade de dentes do jacaré:");
				nrDentes = entrada.nextInt();
				jacare.setNrDentes(nrDentes);
				break;

			case 3:
				System.out.println(" --- Novo lagarto: --- ");

				System.out.println("Digite o nome do lagarto:");
				nome = entrada.next();

				System.out.println("Digite a especie do lagarto:");
				especie = entrada.next();

				Lagarto lagarto = new Lagarto(nome, especie);

				while (lagarto.getCor() == "") {
					System.out.println("Digite a cor do lagarto:");
					cor = entrada.next();
					lagarto.setCor(cor);
				}

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

}
