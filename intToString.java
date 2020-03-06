import java.util.Scanner;

public class intToString {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the intiger number");
		int userInput = input.nextInt() ;
		String str= "";
		String r = "";
		 while (userInput>=0)
		{
			
			str+= userInput % 10   ;
			  
			userInput /= 10  ;
			if (userInput==0)
			{ break;}
		}
		 for (int i = str.length()-1;i>=0;i--) 
             
         {  r += str.charAt(i)  ; }  
		 System.out.println(r);
	}
}
