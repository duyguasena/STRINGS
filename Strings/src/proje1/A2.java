package proje1;

public class A2 {

	public static void main(String[] args) {
		String s="data mining ";
		System.out.println(s.concat("weka"));               //stringlerde ekleme yapmak için concat kullanılır
		System.out.println(s.toString());
		
		
		s=s.concat("weka");                          //artık s nin değeri data mining weka
		System.out.println(s.toString());
		//string immutable değişmez

		StringBuffer buffer=new StringBuffer("java ");
		System.out.println(buffer.append("eclipse"));  //bufferlarda eklemek için append kullanılır
		System.out.println(buffer.toString());    //eşitlemeye gerek olmadan değer değişti
		//buffer ve builder mutable yani değiştirilebilir
		//bellek daha verimli kullanılır
	}

}
