
import java.util.Scanner;
public class next_prime
{
	public static void main(String[] args) {
	    int n,i,j,m=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=n;i<=Integer.MAX_VALUE;i++)
	{
	    if((prime(i))&&(palin(i)))
	    {
	     m=i;
	     break;
	    }
	}

		System.out.println(m);
	}
	static boolean prime(int n)
{
    int c=1,i;
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
        c=0;
        break;
        }
    }
    if(c==1)
    return true;
    else
    return false;
}

static boolean palin( int n)
{
    int sum=0,i,num=n;
    while(n>0)
    {
        sum=sum*10+n%10;
        n=n/10;
    }
    if(sum==num)
    return true;
    else 
    return false;
}
}
