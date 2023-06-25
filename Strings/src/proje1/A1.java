package proje1;

public class A1 {

	public static void main(String[] args) {
		
		String r="java";
		String z="table";
		String a="java";
		String c="rain";
		
		System.out.println(r.compareTo(z));   //ilk string alfabetik olarak küçük
		System.out.println(r.compareTo(a));  //içerikler eşitse 0 döndürür
		System.out.println(c.compareTo(a));   //alfabetik büyükse pozitif döndürür
		
		String word="Linux";
		System.out.println(word.substring(0, 3));
		
		int e=5;
		double d=5.14;
		char f='r';
		
		System.out.printf("%s\n",String.valueOf(e));
		System.out.printf("%s\n",String.valueOf(d));
		System.out.printf("%s\n",String.valueOf(f));
		
	}

}
