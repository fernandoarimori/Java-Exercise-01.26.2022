package Ex8;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double cf, a, b, cfinal;
		
		System.out.print("Quanto � o custo de fabrica��o do carro? \n");
		cf = inp.nextDouble();
		
		a=(cf*28)/100;
		b=(cf*45)/100;
		
		cfinal=cf+a+b;
		
		System.out.print("O custo do consumidor ser� de: \n"+cfinal);
		inp.close();
		
	}

}
