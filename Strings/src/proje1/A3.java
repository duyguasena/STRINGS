package proje1;

public class A3 {

	public static void main(String[] args) {
		
		StringBuffer buffer1=new StringBuffer();                            //arg yok capasite 16
		StringBuffer buffer2=new StringBuffer(14);                          //kapasiteye 14 verilidi kendimiz atadık              
		StringBuffer buffer3=new StringBuffer("hello123456789");             //kapasite 30
		StringBuffer buffer5=new StringBuffer("table");
		
		
		System.out.println("buffer3 lenght:"+buffer3.length());
		
		System.out.println("buffer1 capacity :"+buffer1.capacity());
		System.out.println("buffer2 capacity :"+buffer2.capacity());
		System.out.println("buffer3 capacity :"+buffer3.capacity());
		System.out.println("buffer5 capacity :"+buffer5.capacity());
		
		System.out.println("buffer1:"+buffer1.toString());
		System.out.println("buffer2:"+buffer2.toString());
		System.out.println("buffer3:"+buffer3.toString());
		System.out.println("buffer5:"+buffer5.toString());
		
		StringBuilder a=new StringBuilder("hello,how are you?");
		System.out.println("lenght:"+a.length()+"\nCapacity:"+a.capacity()+"\ntext:"+a.toString());
		
		System.out.println(a.length());
		a.setLength(15);
		System.out.println(a.length());
		}

}
