package Ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double x1, x2, y1, y2, xt, yt, d;
		System.out.print("Digite as 2 coordenadas (x, y) do ponto X: ");
		x1= inp.nextDouble();
		x2= inp.nextDouble();
		
		
		System.out.print("Digite as 2 coordenadas (x, y) do ponto Y: ");
		y1= inp.nextDouble();
		y2= inp.nextDouble();
		
		xt= Math.pow(y1+x1, 2);
		yt= Math.pow(y2-x2, 2);
		
		d = Math.sqrt(xt+yt);
		
		inp.close();
		
		System.out.print("A resposta de d ? igual a: "+d);
		

	}

}
