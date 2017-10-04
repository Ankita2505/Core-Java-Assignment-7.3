package capacity;
/*
 * program to show how the capacity is changing in StringBuffer or in StringBuilder
 *  if we append the string.
 */

public class Assignment7_3 
{	
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer(); //Creating object of string buffer class
		System.out.println("Showing Capacity changing for String Buffer");
		System.out.println(sb.capacity());//default Capacity is 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());  //Printing Capacity after appending value
		sb.append("My favourite language is Java");  
		System.out.println(sb.capacity());//Capacity changes formula =(initial_capacity*2)+2 
		StringBuilder sb1=new StringBuilder();  //Creating object of string builder class
		System.out.println("Showing Capacity changing for String Builder");
		System.out.println(sb1.capacity());//default capacity is 16  
		sb1.append("Hello");  //Printing Capacity after appending value
		System.out.println(sb1.capacity());  
		sb1.append("My favourite language is JAVA");  
		System.out.println(sb1.capacity());//Capacity changes formula=(initial_capacity*2)+2  
		  
	}//Close of Main Class

}
