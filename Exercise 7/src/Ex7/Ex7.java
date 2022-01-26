package Ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp= new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		System.out.print("Digite 6 números que serão as váriasveis de a-f, respectivamente: ");
		a= inp.nextDouble();
		b= inp.nextDouble();
		c= inp.nextDouble();
		d= inp.nextDouble();
		e= inp.nextDouble();
		f= inp.nextDouble();
		
		
		x=((c*e)-(b*f))/((a*e)-(d*b));
		
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.print("Os resultados de x e y são respectivamentes: x= "+x+" e y= "+y+".");
		inp.close();
		

	}

}
