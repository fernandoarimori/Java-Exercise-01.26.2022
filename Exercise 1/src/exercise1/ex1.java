package exercise1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int ano, mes, dia;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos anos, meses e dias voc� tem de vida, respectivamente?");
		ano = input.nextInt();
		mes = input.nextInt();
		dia = input.nextInt();
		
		ano = ano*365;
		mes = mes*30;
		dia = dia+ano+mes;
		
		System.out.print("Voc� tem "+ dia + " dias de vida");
		input.close();
		
		
		
		

	}

}
