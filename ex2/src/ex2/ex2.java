package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		System.out.println("请输入要转换的进制：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("请输入要转换的十进制数：");
		int b = input.nextInt();
		int i;int c=b;
		for(i=0;b>=1;i++) {
			b=b/a;
		}
			System.out.println(i);
		for(;i>=0;i--) {
			if(c/(Math.pow(a,i-1))==1) {
				System.out.println(1);
			}
			else System.out.println(0);
			c=c-(int)(Math.pow(a,i-1));
		}
			
			
		
	}

}
