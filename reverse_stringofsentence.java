/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str;
		String[] s;
		str=sc.nextLine();
		s=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
	    System.out.print(s[i]+" ");
	    //System.out.print(" ");
		}
	}
}
