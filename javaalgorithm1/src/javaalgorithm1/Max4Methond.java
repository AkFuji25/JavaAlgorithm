package javaalgorithm1;

import java.util.Scanner;

public class Max4Methond {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max ;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("四つの整数の最大値を求めます。");
		System.out.println("aの値："); int a = stdIn.nextInt();
		System.out.println("bの値："); int b = stdIn.nextInt();
		System.out.println("cの値："); int c = stdIn.nextInt();
		System.out.println("cの値："); int d = stdIn.nextInt();
		
		int max =  max4(a,b,c,d);
		
		System.out.println("最大値" + "は" + max);
	}

}
