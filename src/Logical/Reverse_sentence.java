package Logical;

public class Reverse_sentence {
	
	public static void main(String[] args)
	{
		String org="I am Playing";
	
		
	    String S1=reverseString(org);
	    
	    System.out.println(S1);
	}
	
	public static String reverseString(String sentence)
	{
		String[] text=sentence.split(" ");
		String Rev="";
		for(int i=text.length-1;i>=0;i--)
		{
		           Rev=Rev+text[i]+" ";
		}
		
		
		return Rev;
	}
	

}
