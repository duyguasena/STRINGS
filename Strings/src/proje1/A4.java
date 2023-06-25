package proje1;

public class A4 {

	public static void main(String[] args) {
		
		StringBuilder buffer=new StringBuilder("hello there");
		System.out.println("text:"+buffer.toString());
		
		System.out.println("character 0:"+buffer.charAt(0)+"\nCharacter 7:"+buffer.charAt(7));
		
		
		char[] charArray=new char[buffer.length()];
		buffer.getChars(0, 3, charArray, 0);   //kelimenin 3 indisi chararraye kopyalandı
		
		for(char value:charArray)              //for each ile okundu
		{
			System.out.println(value);
		}
	
		
		buffer.setCharAt(0, 'z');//sıfırıncı indisi z yap
		System.out.println(buffer.toString());
		System.out.println(buffer.reverse());
	}

}
