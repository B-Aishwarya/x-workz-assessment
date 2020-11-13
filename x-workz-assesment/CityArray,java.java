 public class CityArray
 {
	 public static void main(String[] city)
	 {
		 System.out.println("This method is invoked by JVM");
		 String[] cityNames={"gadag",
		 "laxmeshwar",
		 "hubli", 
		 "Bangalore"};
		 
		 nameOfCity(cityNames);
		 
		 System.out.println("main exit");
	 }
		 
	 
	 public static void nameOfState(String[] names)
	 {
		 System.out.println("Method invoked by main");
		 
		 int SizeOfCity=names.length;
		 System.out.println("No of city are :"+SizeOfCity);
		 
		 String indexname1=names[1];
		 System.out.println(" The index one is :"+indexname1);
		  
		 String indexname2=names[2];
		 System.out.println(" The index two is :"+indexname2);
		  
		 String indexname3=names[3];
		 System.out.println(" The index three is :"+indexname3);
		  
		 String indexname4=names[4];
		 System.out.println(" The index four is :"+indexname4);
		  
		
		 	 
	 }	 

	 
 }