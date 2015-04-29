package Pack1;

import java.util.Scanner;

public class Hack
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cadena:");
		String s2 = scanner.nextLine();
		
		//String s2 = "0x58 0x79 0x70 0x75 0x4d 0x48 0x6e 0x73 0x49 0x78 0x48 0x52 0x77 0x4a 0x78 0x6c 0x51 0x69 0x79 0x71 0x65 0x4d 0x6c 0x58 0x46 0x6d 0x63 0x59 0x62 0x53 0x42 0x55 0x43 0x6c 0x6c 0x46 0x4c 0x53 0x65 0x57 0x76 0x66 0x53 0x48 0x6e 0x52 0x62 0x72 0x68 0x62 0x74 0x62 0x67 0x74 0x45 0x6d 0x62 0x73 0x71 0x4c 0x52 0x62 0x73 0x55 0x6a 0x45 0x64 0x6f 0x73 0x6b 0x4a 0x50 0x72 0x71 0x67 0x78 0x6f 0x56 0x6f 0x75 0x6f 0x62 0x49 0x67 0x51 0x45 0x77 0x72 0x79 0x46 0x78 0x48 0x79 0x4a 0x56 0x67";
		
		String[] tokens=s2.split("[ ]");
		char arr[]= new char[tokens.length];
		
		for(int i=0; i<tokens.length; i++)
		{
			String aux= tokens[i].substring(2);
			
			int intAux= hex2decimal(aux);
			if((i+1)%2==0)//es par
			{
				intAux++;
			}
			else
			{
				intAux--;
			}
			arr[i]= (char) intAux;
		}
		
		for(int i=0; i<tokens.length; i++)
		{
			System.out.print(arr[i]);
		}
		
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