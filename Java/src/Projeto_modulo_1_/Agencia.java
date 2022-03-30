package Projeto_modulo_1_;
import java.util.Scanner;

public class Agencia {

	private String nome[] = new String[2];
	private String cpf[] = new String[nome.length];
	private String email[] = new String[nome.length];
	private String destino[] = new String[nome.length];
	private String nomeVerificacao;
	private String destinoVerificacao;
	private String numeroCont[] = new String[nome.length];
	private int escolhaMenu;

	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public String[] getCpf() {
		return cpf;
	}

	public void setCpf(String[] cpf) {
		this.cpf = cpf;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getDestino() {
		return destino;
	}

	public void setDestino(String[] destino) {
		this.destino = destino;
	}

	public String getNomeVerificacao() {
		return nomeVerificacao;
	}

	public void setNomeVerificacao(String nomeVerificacao) {
		this.nomeVerificacao = nomeVerificacao;
	}

	public String getDestinoVerificacao() {
		return destinoVerificacao;
	}

	public void setDestinoVerificacao(String destinoVerificacao) {
		this.destinoVerificacao = destinoVerificacao;
	}

	public String[] getNumeroCont() {
		return numeroCont;
	}

	public void setNumeroCont(String[] numeroCont) {
		this.numeroCont = numeroCont;
	}

	public int getEscolhaMenu() {
		return escolhaMenu;
	}

	public void setEscolhaMenu(int escolhaMenu) {
		this.escolhaMenu = escolhaMenu;
	}

	public void menu(Scanner in) {
		this.setNomeVerificacao("");
		this.setDestinoVerificacao("");
		do {
			System.out.println(
					"========================== Menu Agência  ==========================================================================");
			System.out.println();
			System.out.println("Qual a operação deseja realizar?");
			System.out.println();
			System.out.println("SELECIONE UMA OPÇÃO   0 - Desligar o programa.");
			System.out.println("                      1 - Cadastrar Clientes.");
			System.out.println("                      2 - Cadastrar Destinos.");
			System.out.println("                      3 - Consultar Clientes e Destinos.");
			System.out.println();
			System.out.println(
					"===================================================================================================================");
			System.out.println();
			this.setEscolhaMenu(in.nextInt());
			in.nextLine();

			

			
			switch (this.getEscolhaMenu()) {
			
			case 0:
				break;
			
			case 1:
				this.cadastrarCliente(in);
				break;

			case 2:
				if (this.getNomeVerificacao() == "") {
					System.out.println();
					System.out.println(
							"Nenhum Cliente cadastrado! Por Favor Primeiro realize o cadastro do Cliente para depois cadastrar o Destino.");
					System.out.println();
				} else {
					this.cadastrarDestino(in);
				}
				break;

			case 3:
				if ((this.getNomeVerificacao() == "") && (this.getDestinoVerificacao() == "")) {
					System.out.println();
					System.out.println(
							"Nenhum Cliente e Destino cadastrado! Por Favor  realize Primeiro o Cadastro de Clientes e o cadastro de Destinos.");
					System.out.println();
				} else if ((this.getNomeVerificacao() != "") && (this.getDestinoVerificacao() =="")){
					System.out.println();
					System.out.println("Nenhum Destino cadastrado! Por Favor  realize  o cadastro de Destinos.");
					System.out.println();
				} else {
					this.consultar();
				}
				break;

			default:
				System.out.println();
				System.out.println("Opção Inválida ,Por Favor escolha alguma das opções do Menu.");
				System.out.println();
				
			}

		} while (this.getEscolhaMenu() != 0);
		System.out.println();
		System.out.println("Obrigado pela preferência !!. ");
		System.out.println("Volte  Sempre.");
		System.out.println(
				"**********************************************************************************************************************");
		System.out.println();
		System.out.println("FIM DO PROGRAMA");

	}

	public void cadastrarCliente(Scanner in) {

		System.out.println(
				"================= Cadastro de ==================================================================================");
		System.out.println(
				"================== Clientes ====================================================================================");
		System.out.println();
		for (int i = 0; i < this.nome.length; i++) {
			System.out.println("CLIENTE DE NÚMERO " + (i + 1));
			System.out.println();
			System.out.println("Digite seu nome:");
			System.out.println();
			this.nome[i] = in.nextLine();
			this.setNomeVerificacao(nome[i]);

			if (this.nome[i].equals("")) {
				while (this.nome[i].equals("")) {
					System.out.println();
					System.out.println("O Nome não foi Informado, Por Favor informe seu nome.");
					System.out.println();
					System.out.println("CLIENTE DE NÚMERO " + (i + 1));
					System.out.println();
					System.out.println("Digite seu nome:");
					System.out.println();
					this.nome[i] = in.nextLine();
					this.setNomeVerificacao(nome[i]);
					System.out.println();

				}
			}

			System.out.println();
			System.out.println("Digite seu CPF:");
			System.out.println();
			this.cpf[i] = in.nextLine();

			if (this.cpf[i].equals("")) {
				while (this.cpf[i].equals("")) {
					System.out.println();
					System.out.println("O CPF não foi Informado, Por Favor informe seu CPF.");
					System.out.println();
					System.out.println("CLIENTE DE NÚMERO " + (i + 1));
					System.out.println();
					System.out.println("Digite seu CPF:");
					System.out.println();
					this.cpf[i] = in.nextLine();
					System.out.println();

				}
			}
			System.out.println();
			System.out.println("Digite seu E-mail:");
			System.out.println();
			this.email[i] = in.nextLine();

			if (this.email[i].equals("")) {
				while (this.email[i].equals("")) {
					System.out.println();
					System.out.println("O E-mail não foi Informado, Por Favor informe seu E-mail.");
					System.out.println();
					System.out.println("CLIENTE DE NÚMERO " + (i + 1));
					System.out.println();
					System.out.println("Digite seu E-mail:");
					System.out.println();
					this.email[i] = in.nextLine();
					System.out.println();

				}
			}
			System.out.println();
			System.out.println("Digite seu Número para Contato:");
			System.out.println();
			this.numeroCont[i] = in.nextLine();
			System.out.println();

			if (this.numeroCont[i].isEmpty()) {
				while (this.numeroCont[i].isEmpty()) {
					System.out.println();
					System.out.println(
							"O Número para Contato não foi Informado, Por Favor informe seu Número para Contato.");
					System.out.println();
					System.out.println("CLIENTE DE NÚMERO " + (i + 1));
					System.out.println();
					System.out.println("Digite seu Número para Contato:");
					System.out.println();
					this.numeroCont[i] = in.nextLine();
					System.out.println();

				}
			}

		}

	}

	public void cadastrarDestino(Scanner in) {
		System.out.println();
		System.out.println(
				"================= Cadastro de ==================================================================================");
		System.out.println(
				"================== Destinos ====================================================================================");
		System.out.println();

		for (int i = 0; i < this.nome.length; i++) {
			System.out.println();
			System.out.println("CLIENTE DE NÚMERO " + (i + 1));
			System.out.println();
			System.out.println("Digite o destino de Sua Preferência: \n");
			this.destino[i] = in.nextLine();
			this.setDestinoVerificacao(destino[i])  ;

			if (this.destino[i].isEmpty()) {
				while (this.destino[i].isEmpty()) {
					System.out.println();
					System.out.println("O Destino não foi Informado, Por Favor informe um Destino.");
					System.out.println();
					System.out.println("CLIENTE DE NÚMERO " + (i + 1));
					System.out.println();
					System.out.println("Digite o destino de Sua Preferência: \n");
					System.out.println();
					this.destino[i] = in.nextLine();
					this.setDestinoVerificacao(destino[i])  ;
					System.out.println();

				}
			}

		}

	}

	public void consultar() {
		System.out.println();
		System.out.println(
				"============= Dados dos Clientes ===============================================================================");
		System.out.println(
				"================ E Destinos ==================================================================================== \n");

		for (int i = 0; i < this.nome.length; i++) {
			System.out.println(" CLIENTE DE NÚMERO " + (i + 1));
			System.out.println();
			System.out.println(" NOME : " + this.nome[i]);
			System.out.println();
			System.out.println(" CPF : " + this.cpf[i]);
			System.out.println();
			System.out.println(" E-MAIL :" + this.email[i]);
			System.out.println();
			System.out.println(" NÚMERO DE CONTATO : " + this.numeroCont[i]);
			System.out.println();
			System.out.println(" DESTINO : " + this.destino[i] + "\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------");

		}

	}
}
