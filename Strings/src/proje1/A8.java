package proje1;

import java.util.Scanner;
import java.util.StringTokenizer;



public class A8 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a sentence");
		
		//belirtmezsek boşluğa göre böler
		
		String sentence=scanner.nextLine();
		StringTokenizer token=new StringTokenizer(sentence,", ");//virgüle göre böl
		
		System.out.println(token.countTokens());//kaç token olduğunu bulur
		
		while(token.hasMoreElements())//okunacak elemanın varsa bloğa gir
		{
			System.out.println(token.nextToken());
		}

	}

}
