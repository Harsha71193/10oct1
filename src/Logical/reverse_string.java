package Logical;

public class reverse_string {
	
	public static void main(String[] args)
	{
		String org="Viraj";
		String Rev="";
		
		// i=4    i<=0
		
		for(int i=org.length()-1;i>=0;i--)
		{
						Rev=Rev+org.charAt(i);  //""+j= j
		}
		
		System.out.println(Rev);
		
	}
	
	

}
