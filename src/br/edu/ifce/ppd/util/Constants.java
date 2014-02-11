package br.edu.ifce.ppd.util;

public class Constants {
	public static final String URL_IMAGES = "C:\\sandbox\\FrontGame\\rsc\\";
	public static final String URL_BLUE_IMAGES = URL_IMAGES+"blue\\";
	public static final String URL_RED_IMAGES = URL_IMAGES+"red\\";
	public static final int MAX_SPY = 1;
	public static final int MAX_SCOUT = 8;
	public static final int MAX_MINER = 5;
	public static final int MAX_SERGEANT = 4;
	public static final int MAX_LIEUTENANT = 4;
	public static final int MAX_CAPTAIN = 4;
	public static final int MAX_MAJOR = 3;
	public static final int MAX_COLONEL = 2;
	public static final int MAX_GENERAL = 1;	
	public static final int MAX_FLAG = 1;	
	public static final int MAX_BOMB = 6;	
	
	public static final String ABOUT = 	  "Front Game\n\n" +
										  "Autor: Jo�o Paulo da Silva J�nior\n" +
										  "email: jpsilvaj@gmail.com\n" +
										  "Data: 2014/02/10\n"+
										  "Version: 0.1";
	
	public static final String RULES = "Regras de Movimenta��o\n"+
			"\n"+
			"- As pe�as se movem uma casa por vez, horizontalmente ou verticalmente. (Exce��o: Soldado)\n"+
			"- Nenhuma pe�a pode se mover na diagonal, pular sobre outras pe�as, nem se mover para um espa�o j� ocupado por outra pe�a.\n"+
			"- N�o � permitido pular sobre os lagos, nem se mover dentro dele.\n"+
			"- Somente uma pe�a pode se mover em cada turno.\n"+
			"- O Soldado(2) pode andar quantas casas livres quiser, na horizontal ou na vertical. Ele tamb�m pode andar e atacar no mesmo turno.\n"+
			"- Uma pe�a n�o pode se mover mais do que 5 vezes, sem parar, entre 2 casas.\n"+
			"\n"+
			"Regras de Ataque\n"+
			"\n"+
			"- Quando uma pe�a sua e uma de seu advers�rio est�o encostadas, horizontalmente ou verticalmente, elas est�o em posi��o de ataque.\n"+
			"- A pe�a com o valor menor � capturada e removida do tabuleiro. Se a pe�a vencedora foi a atacante, ent�o ela se move para a posi��o da pe�a capturada. Se a pe�a - Vencedora foi a atacada, ela fica na posi��o que est�.\n"+
			"- Quando duas pe�as de mesmo valor se atacam, as duas s�o removidas do tabuleiro.\n"+
			"- O ataque � sempre opcional.\n"+
			"\n"+
			"Regras Especiais de Ataque\n"+
			"\n"+
			"- Bomba e Desarmadora(3): Todas as pe�as que atacam uma bomba, s�o removidas do tabuleiro. Exceto a desarmadora, que desarma e captura a bomba.\n"+
			"- Marechal(10) e Espi�(1): O Marechal ganha de todas as outras pe�as de valor menor, s� pode ser capturado se for atacado pela Espi�. Caso o Marechal ataque a Espi� primeiro, ele vence.\n";
}
