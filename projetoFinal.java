/**
 * @author Pedro Henrique Souza Pe�anha
 */
package parte1;

import java.util.Random;
import java.util.Scanner;

public class projetoFinal {
	
	static Scanner input = new Scanner(System.in);
	static int vida, mana, ouro, dano, vidaM, danoM, vidaA;
	static String nomeP;
	static Random danoA = new Random();
	
	static int menuInicial() {
		int escolha = 1;
		System.out.println("COVIB: A extin��o.");
		for (int i = 0; i < 3;) {
			System.out.println("Pressione:");
			System.out.println(" 1 - Jogar \n 2 - Instru��es \n 3 - Cr�ditos \n 4 - Sair");
			escolha = input.nextInt();
			switch(escolha) {
			case 1:
				i = 3;
				break;
			case 2:
				instrucoes();
				break;
			case 3:
				creditos();
				break;
			case 4:
				i = 3;
				saida();
				break;
				default:
					break;
			}
		}
		return escolha;
	}
	
	static void saida() { //BOTAO SAIR DO JOGO
		System.out.println("At� mais, guerreiro.");
		System.exit(0);
	}

	static String instrucoes() { //BOTAO DE INSTRU��ES
		String inst;
		inst = "INSTRU��ES PARA O JOGO: "
				+ "\n Bot�es do teclado para selecionar os personagem: �1� (Poseidon),�2� (�rtemis),�3� (Apolo),�4� (Ares) e �enter�).\r\n" + 
				"Bot�es para continuar no jogo: �1� (sim), �2� (n�o) e �enter�.\r\n" + 
				"Bot�es do teclado para distribuir golpes e defesa: �1� (ataque de dano),�2� (ataque especial 1),�3� (ataque especial 2), \n "
				+ "�4�(defesa) e �enter�. \r\n" + 
				"\r\n" + 
				"   Este jogo de a��o possui 4 deuses: Poseidon, �rtemis, Apolo e Ares, cada um com uma passiva �nica. \r\n" + 
				"  Enigmas ser�o explorados e desvendados, dependendo da escolha inicial do personagem. \r\n" + 
				"   No decorrer do jogo ter�o v�rios desafios enigm�ticos contra os monstros da mitologia: Minotauro, Centauro e Quimera \n "
				+ "aparecendo nas fases para diminur os pontos de vida do aventureiro. Caso n�o consiga vencer o inimigo voc� vai ser punido com GAME OVER.\r\n" + 
				"   Os enigmas consistem em escolher a melhor solu��o para derrotar o inimigo �CoviB� baseando-se na for�a de cada personagem que ter� como \n "
				+ "base a: �VIDA (� definido como ponto de vida do jogador)�, �MANA (energia para invocar as habilidades de ataque ao inimigo)� e �OURO (para comprar vida e mana)�.\r\n" + 
				"   No andamento dos desafios voc� dever� ser capaz de adivinhar um n�mero de 0 � 100, para ganhar ouro, lembre-se voc� ter� apenas 5 tentativas.\r\n" + 
				"    O guerreiro passar� por esses desafios que consistir�o fundamentalmente em atacar o CoviB atr�ves das habilidades. Algumas das habilidades ser�o: \n "
				+ "ataques b�sicos que prometem causar bons danos ao inimigo. \r\n" + 
				"   Sem perder naturalmente a vida para os monstros, voc�, jovem jogador, ser� o respons�vel por trazer a  paz ao universo na cidade do Olimpo.\r\n" + 
				"" + 
				"     Caro jogador, a sua aventura n�o termina por aqui! vamos ajudar o personagem a escolher a alternativa correta para por fim ao inimigo CoviB, nesta fase o jogador dever� responder 5 quest�es cruciais, propostas pelo mercador da cidade, essas perguntas consistem na mat�ria de Conceito de Computa��o e, com o seu vasto repert�rio, guerreiro, voc� precisar� por em pr�tica todos esses conhecimentos em prol de salvar     \r\n" + 
				"o universo.\r\n" + 
				"" 
				+"\n Ap�s completar o game, voc� ir� receber uma medalha de acordo com o desempenho nas perguntas finais.\r\n" + 
				" Neste jogo voc� tem suas estat�sticas que s�o: Vida, Mana e Ouro. O jogo � feito para que voc� administre bem essas \n"
				+ "estat�sticas. \n A partir destes conhecimentos, aproveite o jogo  :)  \r\n" + 
				""
				;
		System.out.println(inst);
		return inst;
	}

	static String creditos() { //BOTAO DE CR�DITOS
		String credito;
		credito = " CR�DITOS: \r\n"
				+ "Produ��o: \r\n" + 
				"Pedro Henrique\r\n" + 
				"Rafael\r\n" + 
				"\r\n" + 
				"Design de personagem: \r\n" + 
				"Rafael\r\n"
				+ "Pedro Henrique\r\n" + 
				"\r\n" + 
				"Produtores executivos:\r\n" + 
				"Pedro Henrique\r\n" + 
				"Rafael\r\n" + 
				"\r\n" + 
				"Testers: \r\n"+ 
				"Pedro Henrique\r\n" + 
				"\r\n" + 
				"Enredo:\r\n" + 
				"Rafael\r\n"
				+ "Pedro Henrique\r\n" + 
				"\r\n" + 
				"Idealizadores:\r\n" + 
				"Pedro Henrique\r\n" + 
				"Rafael\r\n" +  
				"";
		System.out.println(credito);
		return credito;
	}

	static int Jogarperso() { //ESCOLHER PERSONAGEM.
		System.out.println("Escolha seu personagem.");
		int personagem = 1;
		int opcao;
		for (int i = 0; i < 3;) {
			System.out.println("Pressione para visualizar a descri��o:");
			System.out.println(" 1 - Poseidon \n 2 - �rtemis \n 3 - Apolo \n 4 - Ares");
			personagem = input.nextInt();
				switch(personagem) {
				case 1:
					System.out.println("POSEIDON - O Deus dos mares");
					System.out.println(" Sendo um homem forte, imbat�vel, de temperamento vingativo e inst�vel, � sempre representado com barbas e com \n "
							+ "o seu o tridente na m�o. Com a sua ira inconstante utilizava-se do tridente para provocar maremotos e tremores no fundo do mar."
							+ "\n PASSIVA: Chance de cr�tico. ");
					vida = 120;
					mana = 180;
					ouro = 100;
					System.out.printf("\n VIDA: %d \n MANA: %d \n OURO: %d", vida, mana, ouro);
					nomeP = "Poseidon";
					break;
				case 2:
					System.out.println("�rtemis - A Deusa da lua");
					System.out.println(" Ela sempre tinha um animal por perto, e � representada utilizando uma t�nica na altura dos joelhos e armada com arco\n"
							+ " e flecha, e n�o temia utiliz�-las para punir quem agia contra os animais."
							+ "\n PASSIVA: Sempre ataca primeiro o inimigo.");
					vida = 80;
					mana = 300;
					ouro = 100;
					System.out.printf("\n VIDA: %d \n MANA: %d \n OURO: %d", vida, mana, ouro);
					nomeP = "�rtemis";
					break;
				case 3:
					System.out.println("APOLO - O Deus do Sol");
					System.out.println(" Seu arco lan�ava dardos mortais que atingiam os homens com doen�as ou ent�o com mortes s�bitas. Tendo um ano de idade \n"
							+ " ele conseguiu derrotar a cobra P�ton que tentou atacar a sua m�e. "
							+ "\n PASSIVA: Adiciona 10 de ouro a cada ataque.");
					vida = 90;
					mana = 250;
					ouro = 100;
					System.out.printf("\n VIDA: %d \n MANA: %d \n OURO: %d", vida, mana, ouro);
					nomeP = "Apolo";
					break;
				case 4:
					System.out.println("ARES - O Deus da guerra");
					System.out.println(" Ares tinha uma quadriga desenhada com r�deas de ouro para quatro garanh�es imortais que cuspiam fogo.\n"
							+ " Entre os deuses, Ares era reconhecido pela sua armadura de lat�o; ele brandia uma lan�a ou uma espada na batalha. \n"
							+ " PASSIVA �NICA: Ganha 10 de mana a cada ataque.");
					vida = 200;
					mana = 90;
					ouro = 100;
					System.out.printf("\n VIDA: %d \n MANA: %d \n OURO: %d", vida, mana, ouro);
					nomeP = "Ares";
					break;
					default:
						break;
			    }
			for (int o = 0; o < 1;) {
				System.out.println("\n\n Deseja continuar (1) - SIM  (2) - N�O");
				opcao = input.nextInt();
				switch(opcao) {
				case 1:
					i=3;
					o=3;
					break;
				case 2:
					o=3;
					break;
					default:
						System.out.println("Digite novamente.");
						break;
				}
			}
		}
		return personagem;
	}
	
	static int poseidonSkills() { //HABILIDADES DE POSEIDON
		int skill;
		System.out.printf("\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		System.out.println("\nDigite:");
		System.out.println("(1) ATAQUE B�SICO: 20 de DANO - Custo: 30 de MANA \n");
		System.out.println("(2) TSUNAMI DE POSEIDON: 40 de DANO - Custo: 70 de MANA \n");
		System.out.println("(3) F�RIA DOS MARES: 60 de Dano - Custo: 100 de MANA \n");
		System.out.println("(4) N�O ATACA. (Ganha 20 de mana apenas.)");
		for(int i=0; i<1;) {
		skill = input.nextInt();
		dano = danoA.nextInt(3);
		switch(skill) {
		case 1:
			if((mana>=30)&&(dano<2)) { 
			System.out.println("Poseidon com seu tridente, acerta o inimigo.");
			mana = mana - 30;
			dano = 20;
			}
			else if((mana>=30)&&(dano==2)) {
				System.out.println("Poseidon com seu tridente, acerta o inimigo. (CR�TICO)");
				mana = mana - 30;
				dano = 35;
			}
			else {
				System.out.println("Voc� n�o tem mana o suficiente!");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			}
			i++;
			break;
		case 2:
			if((mana>=70)&&(dano<2)) {
			System.out.println("Poseidon aciona os mares e emana um tsunami.");
			mana = mana - 70;
			dano = 40;
			}
			else if((mana>=70)&&(dano==2)) {
			System.out.println("Poseidon aciona os mares e emana um tsunami. (CR�TICO)");
			mana = mana - 70;
			dano = 60;
			}
			else {
				System.out.println("Voc� n�o tem mana o suficiente!");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			}
			i++;
			break;
		case 3:
			if((mana>=100)&&(dano<2)) {
			System.out.println("Poseidon fica furioso e emana um drag�o de �gua e ataca o inimigo.");
			mana = mana - 100;
			dano = 70;
			}
			else if((mana>=100)&&(dano==2)) {
			System.out.println("Poseidon fica furioso e emana um drag�o de �gua e ataca o inimigo. (CR�TICO)");
			mana = mana - 100;
			dano = 90;
			}
			else {
				System.out.println("Voc� n�o tem mana o suficiente!");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			}
			i++;
			break;
		case 4:
				System.out.println("Voc� n�o atacou o inimigo.");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			i++;
			break;
			default:
				System.out.println("N�mero inv�lido.");
			break;	
		    }
		}
		return dano;
	}
	
	static int artemisSkills() { //HABILIDADES DE ARTEMIS
		int skill;
		System.out.printf("\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		System.out.println("\n Digite:");
		System.out.println("(1) ATAQUE B�SICO: 20 de DANO - Custo: 30 de MANA");
		System.out.println("(2) FLECHA DE ZERO GRAVITY: 45 de DANO - Custo: 70");
		System.out.println("(3) RAIO LUNAR: 80 de DANO - Custo 110 de MANA");
		System.out.println("(4) N�O ATACA. (Ganha 20 de mana apenas.)");
		for(int i=0; i<1;) {
			skill = input.nextInt();
			switch(skill) {
			case 1:
				if(mana>=30) {
					System.out.println("�rtemis com seu arco e flecha, acerta um golpe simples no inimigo.");
				mana = mana - 30;
				dano = 20;
				}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 2:
				if(mana>=70) {
					System.out.println("�rtemis coloca sua flecha de anti-gravidade e acerta o inimigo causando dano.");
				mana = mana - 70;
				dano = 45;
				}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 3:
				if(mana>=110) {
					System.out.println("�rtemis acertou o inimigo com a flecha de poder e fez um raio de luz cair sobre o inimigo.");
				mana = mana - 110;
				dano = 80;
				}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 4:
				System.out.println("Voc� n�o atacou o inimigo.");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			i++;
			break;
				default:
					System.out.println("N�mero inv�lido.");
				break;	
			    }
			}
		return dano;
	}
	
	static int apoloSkills() { //HABILIDADES DE APOLO
		System.out.printf("\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		int skill;
		System.out.println("\n Digite:");
		System.out.println("(1) ATAQUE B�SICO: 20 de DANO - Custo: 30 de MANA");
		System.out.println("(2) ESCUDO DE APOLO: 50 de DANO - Custo: 85 de MANA");
		System.out.println("(3) FOGO SOLAR: 80 de DANO - Custo: 120 de MANA");
		System.out.println("(4) N�O ATACA. (Ganha 20 de mana apenas.)");
		ouro = ouro +10;
		for(int i=0; i<1;) {
			skill = input.nextInt();
			switch(skill) {
			case 1:
				if(mana>=30) {
					System.out.println("Apolo com seu arco e flecha simples, acerta o inimigo.");
				mana = mana - 30;
				dano = 20;
				}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 2:
				if(mana>=50) {
					System.out.println("Apolo lan�a seu ecudo em dire��o ao inimigo lhe empurrando e causando dano.");
				mana = mana - 85;
				dano = 50;
				}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 3:
				if(mana>=120) {
					System.out.println("Apolo emana um raio de fogo vindo do sol acertando de forma violenta o inimigo.");
				mana = mana - 120;
				dano = 80;
				}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 4:
				System.out.println("Voc� n�o atacou o inimigo.");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			i++;
			break;
				default:
					System.out.println("N�mero inv�lido.");
				break;	
			    }
			}
		return dano;
	}
	
	static int aresSkills() { //HABILIDADES DE ARES
		int skill;
		System.out.printf("\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		System.out.println("\n Digite:");
		System.out.println("(1) ATAQUE B�SICO: 20 de DANO - Custo: 30 de MANA");
		System.out.println("(2) ESP�RITO DE BATALHA: 40 de DANO - Custo: 40 de MANA");
		System.out.println("(3) �DIO DE ESPARTA: 70 de DANO - Custo: 70 de MANA");
		System.out.println("(4) N�O ATACA. (Ganha 20 de mana apenas.)");
		for(int i=0; i<1;) {
			skill = input.nextInt();
			switch(skill) {
			case 1:
				if(mana>=30) {
					System.out.println("Ares ataca o inimigo com sua espada.");
				mana = mana - 30;
				dano = 20;}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					System.out.println("Voc� recebeu 20 de mana. --*");
					dano = 0;
				}
				i++;
				break;
			case 2:
				if(mana>=40) {
					System.out.println("Ares com sua f�ria ataca o inimigo diversas vezes.");
				mana = mana - 40;
				dano = 40;}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 3:
				if(mana>=70) {
					System.out.println("Ares invoca os 300 homens de esparta para um ataque de ex�rcito causando muito dano.");
				mana = mana - 70;
				dano = 70;}
				else {
					System.out.println("Voc� n�o tem mana o suficiente!");
					System.out.println("O inimigo te atacar�.");
					mana = mana +20;
					dano = 0;
					System.out.println("Voc� recebeu 20 de mana. --*");
				}
				i++;
				break;
			case 4:
				System.out.println("Voc� n�o atacou o inimigo.");
				System.out.println("O inimigo te atacar�.");
				mana = mana +20;
				dano = 0;
				System.out.println("Voc� recebeu 20 de mana. --*");
			i++;
			break;
				default:
					System.out.println("N�mero inv�lido.");
				break;	
			    }
			}
		return dano;
	}
	
	/*
	 * DEFINIR ALEATORIEDADE DOS ATAQUES DOS MONSTROS
	 */
	
	static int monstro1(int personagem) { //recebe como parametro o personagem!!!
		int danoR = 0;
		vidaM = 50;
		System.out.println("Voc� est� de frente com um Minotauro!");
		for(int i = 0; i<1;){
		switch(personagem) {
		case 1:
			danoM = danoA.nextInt(3);
			if((danoM == 0)||(danoM ==1)) {
				danoM = 15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
			}
			else {
				danoM=15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
			}
			vida = vida - danoM;
			
			if(vida<=0) { // CONDI��O PARA MORTE
				System.out.println("\n*-- VOC� MORREU PARA O MINOTAURO --*");
				System.out.println("GAMER OVER!!!");
				saida();
			}
			System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
			danoR = poseidonSkills();
			vidaM = vidaM - danoR;
			break;
		case 2:
			System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
			danoR = artemisSkills();
			vidaM = vidaM - danoR;
			danoM = danoA.nextInt(3);
			if(vidaM>0) {
			if((danoM == 0)||(danoM ==1)) {
				danoM = 15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
			}
			else {
				danoM=15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
			}
			}
			vida = vida - danoM;
			if(vida<=0) { // CONDI��O PARA MORTE
				System.out.println("\n*-- VOC� MORREU PARA O MINOTAURO --*");
				System.out.println("GAMER OVER!!!");
				saida();
			}
			break;
		case 3:
			danoM = danoA.nextInt(3);
			if((danoM == 0)||(danoM ==1)) {
				danoM = 15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
			}
			else {
				danoM=25;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
			}
			vida = vida - danoM;
			if(vida<=0) { // CONDI��O PARA MORTE
				System.out.println("*-- VOC� MORREU PARA O MINOTAURO --*");
				System.out.println("GAMER OVER!!!");
				saida();
			}
			System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
			danoR = apoloSkills();
			vidaM = vidaM - danoR;
			break;
		case 4:
			danoM = danoA.nextInt(3);
			if((danoM == 0)||(danoM ==1)) {
				danoM = 15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
			}
			else {
				danoM=15;
				System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
			}
			vida = vida - danoM;
			if(vida<=0) { // CONDI��O PARA MORTE
				System.out.println("\n*-- VOC� MORREU PARA O MINOTAURO --*");
				System.out.println("GAMER OVER!!!");
				saida();
			}
			System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
			danoR = aresSkills();
			vidaM = vidaM - danoR;
			mana = mana + 10;
			break;
		}
		if(vidaM<=0) {
			break;
		  }
		}
		vidaA = 25;
		vida = vida + vidaA; //VIDA ADICIONAL RECEBIDA AP�S DERROTAR O MONSTRO
		System.out.println("Parab�ns! Voc� derrotou o inimigo e como recompensa recebeu "+vidaA+" de vida adicional.");
		System.out.printf(" VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		return vidaA;
	}
	
	static int monstro2(int personagem) { //recebe como parametro o personagem!!!
		int danoR = 0;
		vidaM = 70;
		System.out.println("Voc� est� de frente com um Centauro!");
		for(int i = 0; i<1;){
			switch(personagem) {
			case 1:
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 25;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=30;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA O CENTAURO --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = poseidonSkills();
				vidaM = vidaM - danoR;
				break;
			case 2:
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = artemisSkills();
				vidaM = vidaM - danoR;
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 25;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=30;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA O CENTAURO --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				break;
			case 3:
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 25;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=30;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA O CENTAURO --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = apoloSkills();
				vidaM = vidaM - danoR;
				break;
			case 4:
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 25;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=30;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA O CENTAURO --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = aresSkills();
				vidaM = vidaM - danoR;
				mana = mana + 10;
				break;
			}
			if(vidaM<=0) {
				break;
			  }
			}
		    vidaA = 30;
			vida = vida + vidaA;
			System.out.println("Parab�ns! Voc� derrotou o inimigo e como recompensa recebeu "+vidaA+" de vida adicional.");
			System.out.printf(" VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
			return vidaA;
	}
	
	static int monstro3(int personagem) { //recebe como parametro o personagem!!!
		int danoR = 0;
		vidaM = 130;
		System.out.println("Voc� est� de frente com uma Quimera!");
		for(int i = 0; i<1;){
			switch(personagem) {
			case 1:
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 35;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=50;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA A QUIMERA --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = poseidonSkills();
				vidaM = vidaM - danoR;
				break;
			case 2:
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = artemisSkills();
				vidaM = vidaM - danoR;
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 35;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=50;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA A QUIMERA --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				break;
			case 3:
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 35;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=50;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA A QUIMERA --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = apoloSkills();
				vidaM = vidaM - danoR;
				break;
			case 4:
				danoM = danoA.nextInt(2);
				if(danoM == 0) {
					danoM = 35;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=50;
					System.out.println("\nAh n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("\n*-- VOC� MORREU PARA A QUIMERA --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = aresSkills();
				vidaM = vidaM - danoR;
				mana = mana + 10;
				break;
			}
			if(vidaM<=0) {
				break;
			  }
			}
		    vidaA = 50;
			vida = vida + vidaA;
			System.out.println("Parab�ns! Voc� derrotou o inimigo e como recompensa recebeu "+vidaA+" de vida adicional.");
			System.out.printf(" VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
			return vidaA;
	}
	
	static void monstroCovib(int personagem) { // CHEF�O FINAL DO JOGO
		int danoR = 0;
		vidaM = 300;
		System.out.println("Voc� est� de frente com o CoviB!");
		for(int i = 0; i<1;){
			switch(personagem) {
			case 1:
				danoM = danoA.nextInt(3);
				if((danoM == 0)||(danoM ==1)) {
					danoM = 50;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=90;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("*-- VOC� MORREU PARA O COVIB --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = poseidonSkills();
				vidaM = vidaM - danoR;
				break;
			case 2:
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = artemisSkills();
				vidaM = vidaM - danoR;
				danoM = danoA.nextInt(3);
				if((danoM == 0)||(danoM ==1)) {
					danoM = 50;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=90;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("*-- VOC� MORREU PARA O COVIB --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				break;
			case 3:
				danoM = danoA.nextInt(3);
				if((danoM == 0)||(danoM ==1)) {
					danoM = 50;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=90;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("*-- VOC� MORREU PARA O COVIB --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = apoloSkills();
				vidaM = vidaM - danoR;
				break;
			case 4:
				danoM = danoA.nextInt(3);
				if((danoM == 0)||(danoM ==1)) {
					danoM = 50;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.");
				}
				else {
					danoM=90;
					System.out.println("Ah n�o, o inimigo acertou voc� e te causou "+danoM+" de dano.(CR�TICO)");
				}
				vida = vida - danoM;
				if(vida<=0) { // CONDI��O PARA MORTE
					System.out.println("*-- VOC� MORREU PARA O COVIB --*");
					System.out.println("GAMER OVER!!!");
					saida();
				}
				System.out.println("Ele possui "+vidaM+" de vida. Hora de atacar!");
				danoR = aresSkills();
				vidaM = vidaM - danoR;
				mana = mana + 10;
				break;
			}
			if(vidaM<=0) {
				break;
			  }
			}
			System.out.println("Parab�ns! Voc� derrotou o inimigo e acaba de salvar o mundo da extin��o humana. \n"
					+ "Ap�s essa longa jornada, voc� � considerado como salvador da terra e ganha admira��o por todo os seres existentes."
					+ " \n SUAS ESTAT�STICAS FINAIS: \n");
			System.out.printf(" VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
	}
	
	static void venda() { //VENDA PARA FAZER COMPRAS COM O OURO.
		int item;
		System.out.println("Voc� encontrou um Bazar!");
		System.out.println("O que deseja comprar? ");
		for(int i = 0; i<1;) {
			System.out.printf(" VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
			System.out.println("\n (1) POTE DE VIDA (p): +30 de vida - Custo: 40 de ouro. \n (2) POTE DE VIDA (g): +80 de vida - Custo: 100 de ouro.");
			System.out.println(" (3) PO��O DE MANA (p): +50 de mana - Custo: 40 de ouro. \n (4) PO��O DE MANA (g): 120 de mana - Custo: 100 de ouro. \n (5) SAIR");
		item = input.nextInt();
		switch(item) {
		case 1:
			if(ouro>=40) {
				System.out.println("Voc� obteve +30 de vida!");
				vida = vida + 30;
				ouro = ouro - 40;
			}
			else {
				System.out.println("Voc� n�o tem ouro o suficiente!");
			}
			break;
		case 2:
			if(ouro>=100) {
				System.out.println("Voc� obteve +80 de vida!");
				vida = vida + 80;
				ouro = ouro - 100;
			}
			else {
				System.out.println("Voc� n�o tem ouro o suficiente!");
			}
			break;
		case 3:
			if(ouro>=40) {
				System.out.println("Voc� obteve +50 de mana!");
				mana = mana + 50;
				ouro = ouro - 40;
			}
			else {
				System.out.println("Voc� n�o tem ouro o suficiente!");
			}
			break;
		case 4:
			if(ouro>=100) {
				System.out.println("Voc� obteve +120 de mana!");
				mana = mana+120;
				ouro = ouro - 100;
			}
			else {
				System.out.println("Voc� n�o tem ouro o suficiente!");
			}
			break;
		case 5:
			break;
		}
		for(int o = 0; o<1;) {
		System.out.println("Deseja sair do bazar? (1) SIM  (2) N�O");
		item = input.nextInt();
		switch(item) {
		case 1:
			System.out.printf("ESTAT�STICAS:\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
			i++;
			o++;
			break;
		case 2:
			o++;
			break;
			default:
				System.out.println("N�mero inv�lido, digite novamente por favor.");
				break;
		     }
		   }
		}
	}
	
	static void minigame() { // desafio do jogo
		Scanner kib = new Scanner(System.in);
		Random numer = new Random();
		int N = 0;
		int num;
		num = numer.nextInt(101);
		System.out.println("Voc� encontrou um mercante e este te prop�s um desafio.");
		System.out.println("Ele escolheu um n�mero e quer que voc� advinhe, se acertar voc� ganha 250 de ouro!!");
		System.out.println("Digite um n�mero entre 0 e 100 para adivinhar qual � o que o mercante escolheu. (5 tentativas)");

		for (int o = 1; o < 6; o++) {
			System.out.println("Tentativa "+o+": ");
			N = kib.nextInt();
			if (N == num) {
				ouro = ouro + 250;
				System.out.println("Parab�ns, voc� venceu o desafio e recebeu 100 de ouro.");
				break;
			} else if (N == num - 1) {
				System.out.println("TA QUENTE! ----> maior");
			} else if (N == num + 1) {
				System.out.println("TA QUENTE! ----> menor");
			} else if (N < num) {
				System.out.println("----> maior");
			} else if (N > num) {
				System.out.println("----> menor");
			}
		}
		if(N!=num) {
			System.out.println("A resposta era "+num);
			System.out.println("O mercante n�o te enivou a recompensa.");
			System.out.printf("ESTAT�STICAS:\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		}
		else {
			System.out.printf("ESTAT�STICAS:\n VIDA: %d\n MANA: %d\n OURO: %d\n",vida , mana, ouro);
		}
	}
	
	static int perguntas() { //5 perguntas de conceitos de computa��o
		int medalha = 0;
		Scanner kib = new Scanner(System.in);
		Random danoA = new Random();
		int ouro = 0;
		
		int res;
		int[] p = new int[5];

		for (int o = 0; o < 5;) {
			int alePerg = danoA.nextInt(5);
			switch (alePerg) {
			case 0:
				if (p[0] == 1) {
					break;
				}
				o++;
				p[0] = 1;
				for (int i = 0; i < 1; i++) {
					System.out.println("\nPergunta " + o);
					System.out.println(" O n�mero bin�rio 101010 representa qual n�mero decimal? ");
					System.out.println(" (1): 98 \n (2): 42 \n (3): 20 \n (4): 33");
					res = kib.nextInt();
					switch (res) {
					case 1:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					case 2:
						System.out.println("RESPOSTA CERTA! Voc� ganhou 100 de ouro");
						medalha++;
						ouro = ouro + 100;
						break;
					case 3:
						System.out.println("REPOSTA ERRADA!!");
						break;
					case 4:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					default:
						System.out.println("N�mero inv�lido, digite novamente!");
						i--;
						break;
					}
				}
				break;

			case 1:
				if (p[1] == 2) {
					break;
				}
				o++;
				p[1] = 2;
				for (int i = 0; i < 1; i++) {
					System.out.println("\nPergunta " + o);
					System.out.println(" Quem inventou o JAVA e a �lgebra booleana respectivamente? ");
					System.out.println(" (1): Larry Page e Sergey Brin \n "
							+ "(2): Takeo Ueda e Carl Adam Petri \n "
							+ "(3): James Gosling e George Boole \n "
							+ "(4): Steven Paul Jobs e Jeff Bezos");
					res = kib.nextInt();
					switch (res) {
					case 1:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					case 2:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					case 3:
						System.out.println("RESPOSTA CERTA! Voc� ganhou 100 de ouro");
						medalha++;
						ouro = ouro + 100;
						break;
					case 4:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					default:
						System.out.println("N�mero inv�lido, digite novamente!");
						i--;
						break;
					}
				}
				break;

			case 2:
				if (p[2] == 3) {
					break;
				}
				p[2] = 3;
				o++;
				for (int i = 0; i < 1; i++) {
					System.out.println("\nPergunta " + o);
					System.out.println(" Defina o Mapa de Veitch-Karnaugh. ");
					System.out.println(" (1): Controle de acesso baseado em papeis."
							+ " \n (2): simplificar uma equa��o l�gica."
							+ " \n (3): O mapa define o desempenho de dados. \n "
							+ "(4): � um sistema para integrar aparelho Raspberry PI.");
					res = kib.nextInt();
					switch (res) {
					case 1:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					case 2:
						System.out.println("RESPOSTA CERTA! Voc� ganhou 100 de ouro");
						medalha++;
						ouro = ouro + 100;
						break;
					case 3:
						System.out.println("REPOSTA ERRADA!!");
						break;
					case 4:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					default:
						System.out.println("N�mero inv�lido, digite novamente!");
						i--;
						break;
					}
				}
				break;

			case 3:
				if (p[3] == 4) {
					break;
				}
				p[3] = 4;
				o++;
				for (int i = 0; i < 1; i++) {
					System.out.println("\nPergunta " + o);
					System.out.println(" O que � um circuito l�gico?");
					System.out.println(" (1): � um jogo de verdadeiro e falso."
							+ " \n (2): Serve para separar as extens�es. "
							+ "\n (3): Faz calculos de pot�ncias decimais."
							+ " \n (4): S�o componentes de opera��es bin�rias 0 e 1");
					res = kib.nextInt();
					switch (res) {
					case 1:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					case 2:
						System.out.println("REPOSTA ERRADA!!");
						break;
					case 3:
						System.out.println("REPOSTA ERRADA!!");
						break;
					case 4:
						System.out.println("RESPOSTA CERTA! Voc� ganhou 100 de ouro");
						medalha++;
						ouro = ouro + 100;
						break;
					default:
						System.out.println("N�mero inv�lido, digite novamente!");
						i--;
						break;
					}
				}
				break;

			case 4:
				if (p[4] == 5) {
					break;
				}
				p[4] = 5;
				o++;
				for (int i = 0; i < 1; i++) {
					System.out.println("\nPergunta " + o);
					System.out.println(" Para que serve HyperText Transfer Protocol (HTTP)?");
					System.out.println(" (1): Um protocolo de comunica��o entre sistemas de informa��o que permite a transfer�ncia de dados entre redes de computadores. "
							+ "\n (2): � utilizada para rede local de computador se conectar com servidor atr�ves senha. "
							+ "\n (3): � a transfer�ncia de texto por e-mail via satelite. "
							+ "\n (4): O HTTP possibilita a conex�o entre computadores e faz transfer�ncia de dados somente em PDF.");
					res = kib.nextInt();
					switch (res) {
					case 1:
						System.out.println("RESPOSTA CERTA! Voc� ganhou 100 de ouro");
						medalha++;
						ouro = ouro + 100;
						break;
					case 2:
						System.out.println("REPOSTA ERRADA!!");
						break;
					case 3:
						System.out.println("REPOSTA ERRADA!!");
						break;
					case 4:
						System.out.println("RESPOSTA ERRADA!!");
						break;
					default:
						System.out.println("N�mero inv�lido, digite novamente!");
						i--;
						break;
					}
				}
				break;
			}

		}
		System.out.println(" \n Voc� acertou "+medalha+" das perguntas propostas.");
		return medalha;
	}
	
	static void medalhas(int medal) {
		String medalha = "Bronze";
		
		if(medal<3) {
			medalha = "Bronze";
		}
		else if((medal==3)||(medal==4)) {
			medalha = "Prata";
			}
		else if(medal==5) {
			medalha = "Ouro";
		}
		System.out.println("Voc� recebeu a medalha de "+medalha+" por ter acertado "+medal+" das quest�es.");
		System.out.println("Agredecemos por jogar o game.");
		creditos();
		saida();
	}
	
	static void historia1() {
		System.out.println("O supremo Zeus, O Deus dos Deuses vive na sua eterna morada no Olimpo, descansando e sem \n"
				+ " preocupa��es universais, ele vive dos maiores prazeres que a terra pode proporcionar.\r\n" + 
				"\r\n" + 
				" De repente, ele ouve um grito.\r\n" + 
				"\r\n" + 
				"- Ares: Est� havendo desaven�a no universo. � o fim de tudo! \r\n" + 
				"\r\n" + 
				"� Apolo: Venha depressa, ZEUS!\r\n" + 
				"\r\n" + 
				"Pela primeira vez ZEUS n�o esperava ter que intervir na salva��o do Universo.\r\n" + 
				"\r\n"
				+ "\n -�rtemis: O sacril�gio est� prestes a acontecer." + 
				"   Zeus precisa encontrar o ant�doto para derrotar o inimigo CoviB, um v�rus que se alastra na terra, \n "
				+ "para isso, ele precisa invocar os espiritos guerreiros dos Deuses da Gr�cia antiga. Utilizando-se do \n "
				+ "poder de cada um: Poseidon, �rtemis, Apolo e Ares.\r\n" + 
				"");
	}
	
	static void historia2() {
		System.out.println(" Zeus ser� o seu mentor, use "+nomeP+" administrando bem suas estat�sticas e golpes para \n obter sucesso no final.");
		System.out.println(" -Zeus: O Olimpo est� prestes a sofrer uma devasta��o, o mundo est� em meio a um caos.");
		System.out.println("- "+nomeP+": Guerreiros do  Olimpo, eu irei descer at� a terra para assim tentar acabar com o mau\n "
				+ "que nos atormenta e descobrir um jeito de extermin�-lo.");
		System.out.println(" -Zeus: Muito bem! Eu posso ser o seu guia nesta miss�o comandando e mantendo a paz aqui do olimpo.\n "
				+ "o que eu sei, � que o inimigo se chama CoviB e ter a capacidade de infectar pessoas mortais pulverizando instantaneamente."
				+ "\n J� deuses como n�s, conseguimos ter alguma chance contra este monstro que tamb�m controla Quimeras e Minotauros!! "
				+ "\n Tome cuidado "+nomeP+", ser� um grande desafio."
				+ "\n Voc� chegou ao caos que acontece na terra, passando atualmente na cidade de Hamburgo que � \\n \"\r\n" + 
				"				+ \"uma zona cheia de monstros implantados pelo CoviB.");
	}
	
	static void historia3() {
		System.out.println(" Ap�s derrotar os Minotauros, agora dever� continuar com o seu objetivo atravessando a cidade.");
	}

	static void historia4() {
		System.out.println(" Voc� eliminou um polo da concentra��o de monstros, est� na hora de seguir viagem e ir para a cidade \n"
				+ "de T�quio."
				+ "\n Zeus te ajuda e pelos c�us, voc� chega em seu destino, assim, tendo que derrotar mais monstros.");
	}
	
	static void historia5() {
		System.out.println(" Ainda em T�quio, encontraste uma venda para recompor seus �nimos e nesta venda, algu�m misterioso aparece. \n"
				+ " ");
	}
	
	static void historia6() {
		System.out.println(" Para exterminar o CoviB, Zeus ajuda entao e leva para a cidade de Nova York com o polo de monstros final. \n"
				+ " Facilmente "+nomeP+ " percebe que h� um clima estranho e monstros aparecem.");
	}
	
	static void historia7() {
		System.out.println(" Ap�s derrotar todos os mosntros, "+nomeP+" encontra um caminho que leva a um portal, na qual s� poderia \n"
				+ " entrar quem soubesse responder �s 5 perguntas porpostas, mesmo se errar, poder� atravessar, por�m com menos recursos."
				+ " \n "+nomeP+" pede ajuda a Zeus que tentar� responder �s quest�es.");
	}
	
	static void historia8() {
		System.out.println(" Voc� conseguiu entrar no portal!! "
				+ " \n CoviB est� em sua espera para enfrent�-lo com todo seu poder e f�ria."
				+ " CoviB mostra sua face, sendo ela desmanchada e com �cidos saindo de seu corpo e com sangue nos olhos para te matar.");
	}
	
	public static void main(String[] args) {
			int escolha = menuInicial();
			historia1();
			//escolha do personagem
			int personagem = Jogarperso();
		    // JOGO
			historia2();
			monstro1(personagem);
			monstro1(personagem);
			historia3();
			venda();
			historia4();
			monstro2(personagem);	
			monstro2(personagem);
			historia5();
			minigame();
			venda();
			historia6();
			monstro3(personagem);
			monstro3(personagem);
			minigame();
			historia7();
			int medal = perguntas();
			venda();
			historia8();
			monstroCovib(personagem);
			medalhas(medal);
	}
}
