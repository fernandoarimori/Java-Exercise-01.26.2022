package Ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in); 
		double a, b ,c ,med;
		System.out.print("Espera as tr�s notas tiradas em ordem e respectivamente: ");
		a= inp.nextInt();
		b= inp.nextInt();
		c= inp.nextInt();
		
		
		med= ((a*2)+(b*3)+(c*5))/10;
				
		System.out.print("Sua m�dia ponderada � de: "+med+".");
		inp.close();
	}

}
