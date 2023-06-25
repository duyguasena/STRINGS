package proje1;

public class A5 {

	public static void main(String[] args) {
		char[] charArray= {' ','a','b','c','d','e','f'};
		boolean booleanValue=true;
		char charValue='a';
		int intValue=7;
		long longValue=10000000;
		float flotValue=2.5f; 
		double doubleValue=33.3333;
		
		StringBuilder lastbuffer=new StringBuilder("\nlast buffer");
		StringBuilder buffer=new StringBuilder();
		
		Object[] obj= {booleanValue,intValue,doubleValue,lastbuffer};           //kısa yol
		for(int i=0;i<obj.length;i++)                                        //tek tek eklemek yerine döngüyle ekledik
		{
			buffer.append(obj[i]);
			System.out.println(buffer.toString());
		}
		
		
//		buffer.append(charValue);
//		buffer.append(intValue);
//		buffer.append(doubleValue);
//		buffer.append(lastbuffer);
//		System.out.println(buffer.toString());
		
	}

}
