package birthday;

import java.util.Scanner;

public class birthday {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		System.out.println("以下列表是否包含您的生日（包含输入1，不包含输入0）:");
 	System.out.println("1  3  5  7");
 	System.out.println("9  11 13 15");
 	System.out.println("17 19 21 23");
 	System.out.println("25 27 29 31");
 	Scanner input = new Scanner(System.in);
 	int a=input.nextInt();
 	int b=0;
 	b=a;
 	System.out.println("以下列表是否包含您的生日（包含输入1，不包含输入0）:");
 	System.out.println("2  3  6  7");
 	System.out.println("10 11 14 15");
 	System.out.println("18 19 22 23");
 	System.out.println("26 27 30 31");
 	a=input.nextInt();
 	b=b+a*2;
 	System.out.println("以下列表是否包含您的生日（包含输入1，不包含输入0）:");
 	System.out.println("4  5  6  7");
   	System.out.println("12 13 14 15");
 	System.out.println("20 21 22 23");
 	System.out.println("28 29 30 31");
 	a=input.nextInt();
 	b=b+a*2*2;
 	System.out.println("以下列表是否包含您的生日（包含输入1，不包含输入0）:");
 	System.out.println("8  9  10 11");
 	System.out.println("12 13 14 15");
 	System.out.println("24 25 26 27");
 	System.out.println("28 29 30 31"); 
 	a=input.nextInt();
 	b=b+a*2*2*2;
 	System.out.println("以下列表是否包含您的生日（包含输入1，不包含输入0）:");
 	System.out.println("16 17 18 19");
 	System.out.println("20 21 22 23");
 	System.out.println("24 25 26 27");
 	System.out.println("28 29 30 31");
 	a=input.nextInt();
 	b=b+a*2*2*2*2;
 	System.out.println(b);
	}

}
