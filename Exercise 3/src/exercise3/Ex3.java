package exercise3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tm= new Scanner(System.in);
		int segt, segu, minu, hr;
		
		System.out.print("Escreva o tempo de processo da máquiona em seg: ");
		segt= tm.nextInt();
		
		minu= segt/60;
		segu= segt%60;
		hr= minu/60;
		minu= minu%60;
		
		System.out.print("O tempo do evento da máquina é de "+ hr+" horas, "+minu+"minutos e "+segu+" segundos.");
		tm.close();

	}

}
