package exercise2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int totaldia, ano, mes, dia;
		System.out.print("Digite quantos dias voc? tem de vida: ");
		totaldia = leia.nextInt();

		mes = totaldia / 30;
		dia = totaldia % 30;
		ano = mes / 12;
		mes = mes % 12;

		System.out.print("Voc? tem " + ano + " anos, " + mes + " meses e " + dia + " dias de vida.");
		leia.close();
	}

}
