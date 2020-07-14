package assignment1;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ConsecutiveCount23 {
	private String str;
	public ConsecutiveCount23(String s) {
		str = s;
	}
	private List<String> generateList(String str)
	{
		List<String> l = new LinkedList<String>();
		String s ="";
		//String str="ABCXYZACCD";
		int i=0;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)+1==str.charAt(i+1))
				s+=str.charAt(i);
			else
			{
			    //if(i==str.length()-2) s+=str.charAt(i+1);
			    s+=str.charAt(i);
			    if(s.length()>1)
				    l.add(s);
				s="";
			}
			if(i==str.length()-2){ s+=str.charAt(i+1);
			    if(s.length()>1)
				    l.add(s);
			}
		}
		return l;
	}
	private String stringLower()
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				s+=Character.toString((char) (str.charAt(i)-'A'+'a'));
			else
				s+=Character.toString(str.charAt(i));
		}
		return s;
	}
	private int findFrequency(String s,String str)
	{
		int f=0;
		int j=0,k=s.length(),i;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==s.charAt(j))
				j++;
			if(j==k)
			{
				f++;
				j=0;
			}
		}
		return f;
	}
	private void printCount(List<String> list,String str) {
		//System.out.println(list);
		for(String s : list)
		{
			System.out.println(s +"  "+ findFrequency(s,str));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :");
		String str=sc.nextLine();
		sc.close();
		ConsecutiveCount23 c = new ConsecutiveCount23(str);
		String s = c.stringLower();
		//System.out.println(s);
		List<String> l = c.generateList(s);
		//System.out.println(l);
		c.printCount(l,s);
		//System.out.println(l);
	}
}
