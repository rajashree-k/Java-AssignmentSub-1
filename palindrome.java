import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,reverse=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		while(n!=0)
		{
		    num=n%10;
		    reverse=reverse*10+num;
		    n=n/10;
		 
		}
		
		if(n==reverse){
		System.out.println("Its a palindrome");
		}
		else{
		System.out.println("Its a not palindrome");
		}
		
	}
}
