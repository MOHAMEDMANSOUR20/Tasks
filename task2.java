import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		             Scanner scan = new Scanner (System.in)                       ;
		             System.out.println("Please enter the text !")                ;
	                 String input = scan .nextLine()                              ;
	                  input = input.replace(" ","")                               ;
	                 String reverse= ""                                           ;
	                 boolean palindrome = false ;
	                 for (int i = input.length()-1;i>=0;i--) 
	                 
	                   {  reverse += input.charAt(i)  ; }                          
	                  for (int x=0; x< input.length(); x++) 
	                  {
		               if (input.charAt(x)!=reverse.charAt(x))
		                  {
			                System.out.println("This is not a palindrome !!")     ;
			                          break ;
			                                                                   }
			           else {  palindrome = true ;}
		                                    }
		              if (palindrome) { System.out.println("This is a palindrome !!!");}
	                                                                                   }
                                                                                       }
