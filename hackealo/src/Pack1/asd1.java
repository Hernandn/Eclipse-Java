package Pack1;

import java.util.StringTokenizer;

public class asd1
{
	public static void main(String[] args)
	{
		String s1="42";

		int aux1=hex2decimal(s1);

		System.out.println(aux1);

	}

	int htod(String hexadecimal)
	{
		int h=hexadecimal.length()-1;
		int d=0;
		int n=0;
		for(int i=0; i<hexadecimal.length(); i++)
		{
			char ch=hexadecimal.charAt(i);
			boolean flag=false;

			switch(ch)
			{
				case '1':
					n=1;
					break;
				case '2':
					n=2;
					break;
				case '3':
					n=3;
					break;
				case '4':
					n=4;
					break;
				case '5':
					n=5;
					break;
				case '6':
					n=6;
					break;
				case '7':
					n=7;
					break;
				case '8':
					n=8;
					break;
				case '9':
					n=9;
					break;
				case 'A':
					n=10;
					break;
				case 'B':
					n=11;
					break;
				case 'C':
					n=12;
					break;
				case 'D':
					n=13;
					break;
				case 'E':
					n=14;
					break;
				case 'F':
					n=15;
					break;
				default:
					flag=true;
			}
			if(flag)
			{
				System.out.println("Wrong Entry");
				break;
			}
			d=(int)(n*(Math.pow(16,h)))+(int)d;
			h--;

		}
		return d;
	}

	public static int hex2decimal(String s)
	{
		String digits="0123456789ABCDEF";
		s=s.toUpperCase();
		int val=0;
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			int d=digits.indexOf(c);
			val=16*val+d;
		}
		return val;
	}
}
