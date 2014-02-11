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
										  "Autor: João Paulo da Silva Júnior\n" +
										  "email: jpsilvaj@gmail.com\n" +
										  "Data: 2014/02/10\n"+
										  "Version: 0.1";
	
	public static final String RULES = "Regras de Movimentação\n"+
			"\n"+
			"- As peças se movem uma casa por vez, horizontalmente ou verticalmente. (Exceção: Soldado)\n"+
			"- Nenhuma peça pode se mover na diagonal, pular sobre outras peças, nem se mover para um espaço já ocupado por outra peça.\n"+
			"- Não é permitido pular sobre os lagos, nem se mover dentro dele.\n"+
			"- Somente uma peça pode se mover em cada turno.\n"+
			"- O Soldado(2) pode andar quantas casas livres quiser, na horizontal ou na vertical. Ele também pode andar e atacar no mesmo turno.\n"+
			"- Uma peça não pode se mover mais do que 5 vezes, sem parar, entre 2 casas.\n"+
			"\n"+
			"Regras de Ataque\n"+
			"\n"+
			"- Quando uma peça sua e uma de seu adversário estão encostadas, horizontalmente ou verticalmente, elas estão em posição de ataque.\n"+
			"- A peça com o valor menor é capturada e removida do tabuleiro. Se a peça vencedora foi a atacante, então ela se move para a posição da peça capturada. Se a peça - Vencedora foi a atacada, ela fica na posição que está.\n"+
			"- Quando duas peças de mesmo valor se atacam, as duas são removidas do tabuleiro.\n"+
			"- O ataque é sempre opcional.\n"+
			"\n"+
			"Regras Especiais de Ataque\n"+
			"\n"+
			"- Bomba e Desarmadora(3): Todas as peças que atacam uma bomba, são removidas do tabuleiro. Exceto a desarmadora, que desarma e captura a bomba.\n"+
			"- Marechal(10) e Espiã(1): O Marechal ganha de todas as outras peças de valor menor, só pode ser capturado se for atacado pela Espiã. Caso o Marechal ataque a Espiã primeiro, ele vence.\n";
}
