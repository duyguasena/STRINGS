package proje1;

public class A9 {

	public static void main(String[] args) {
//		String firstname="zehra";
//		System.out.println(validateFirstName(firstname));
		
//		String lastname="Cicek";
//		System.out.println(validatedlastname(lastname));
		
//		String adress="12";
//		System.out.println(validatedadress(adress));
		
//		String zip="12345";
//		System.out.println(validatezip(zip));
		
		String phone="0212-450-10-14";
		String phone1="0212-212-212";
		validatephone(phone1);
		System.out.println(validatephone(phone1));



	}
	
	public static boolean validateFirstName (String firstname) 
	{
		return firstname.matches("[A-Z][a-z]+");                     //ifade edilen model
	}
	
	public static boolean validatedlastname(String lastname)
	{
		return lastname.matches("[a-zA-Z]+");                        //büyük küçük kabul eder en az bir tane olmalı
	}

	public static boolean validatedadress(String adress)
	{
		return adress.matches("\\d+\\s+[a+zA-Z]+");                  //herhangi bir sayı kabul ediyor
	}
	public static boolean validatezip(String zip)
	{
		return zip.matches("\\d{5}");                                //5 digit yazılmalı         
	}
	public static boolean validatephone(String phone)
	{
		return phone.matches("[0]\\d{3}-\\d{3}-\\d{3}");                                //5 digit yazılmalı         
	}
}

