package proje1;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("enter a word: ");
		String input=scanner.next();
		
		System.out.println(input);//girilen değerin baş harfini al ve yazdır
		char r=input.charAt(1);
		System.out.println(r);
		
		//%s string,%f ondalıklı sayı,%b boolean
		
		System.out.printf("is digit %b\n",Character.isDigit(r));// sayı mı
		System.out.printf("is letter %b\n",Character.isLetter(r));//harf mi
		System.out.printf("is letter or digit %b\n",Character.isLetterOrDigit(r));
		System.out.printf("is lower case %b\n",Character.isLowerCase(r));
		System.out.printf("is upper case %b\n",Character.isUpperCase(r));
		System.out.printf("is first character in java identifier %b\n",Character.isJavaIdentifierStart(r));
		
		System.out.printf("to lower case:%s ",Character.toLowerCase(r));
		System.out.printf("to upper case:%s ",Character.toUpperCase(r));
		
		
	}

}
