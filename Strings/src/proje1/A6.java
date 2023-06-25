package proje1;

public class A6 {

	public static void main(String[] args) {
		char[] charArray= {' ','a','b','c','d','e','f'};
		boolean booleanValue=true;
		char charValue='a';
		int intValue=14;
		long longValue=10000000;
		float flotValue=2.5f; 
		double doubleValue=33.3333;
		
		StringBuilder lastbuffer=new StringBuilder("\nlast buffer");
		StringBuilder buffer=new StringBuilder("java");
		
//		Object[] obj= {booleanValue,intValue,doubleValue,lastbuffer};  //kısa yol
//		for(int i=0;i<obj.length;i++)
//		{
//			buffer.append(obj[i]);
//			System.out.println(buffer.toString());
//		}
		
		
//		buffer.append(charValue);   her zaman sonuna ekleme yapar
//		buffer.append(intValue);
//		buffer.append(doubleValue);
//		buffer.append(lastbuffer);
//		System.out.println(buffer.toString());
		
		buffer.insert(0, booleanValue);            //sıfırıncı indise true yazdır
		buffer.insert(7, intValue);
		System.out.println(buffer.toString());
		
		buffer.deleteCharAt(2);
		System.out.println(buffer.toString());
		
		buffer.deleteCharAt(buffer.length()-1);
		System.out.println(buffer.toString());

	}

}
