package proje1;

public class A10 {

	public static void main(String[] args) {
		
		String a1="a";
		String b1=new String("a");            //tekrardan a yı tutmaz
		
		if (a1==b1) 
			System.out.println("eşit");
		else {
			System.out.println("eşit değil");
		}	
		
		if(a1.equals(b1))                     //içerik olrak kontrol eder
			System.out.println("content same");
		else {
			System.out.println("not same");
		}
		

	}

}
