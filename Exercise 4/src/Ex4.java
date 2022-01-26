import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp= new Scanner(System.in);
		int a, b, c;
		double d, r, s;
		System.out.print("Digite os números A, B e C. respectivamente");
		a=inp.nextInt();
		b=inp.nextInt();
		c=inp.nextInt();
		
		r= Math.pow((a+b), 2);
		s= Math.pow((b+c), 2);
		d= (r+s)/2;

		System.out.print("O resultado de R, S e D, são, respectivamente"+r+" e "+s+" e "+d+".");
		inp.close();
	}

}
