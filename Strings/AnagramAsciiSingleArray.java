package Strings;

public class AnagramAsciiSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "@daa1d";
		String b = "aa@dd1";
		
		boolean isAnagram= true;
		int al[] =  new int[256];
		
		
		for(char c : a.toCharArray())
		{
			int index = (int) c;
			al[index]++;
		}
		for(char c : b.toCharArray())
		{
			int index = (int) c;
			al[index]--;
		}
		for(int i=0 ; i<256 ; i++)
		{
			if(al[i] != 0)
			{
				isAnagram =  false;
				break;
			}
		}
		
		if(isAnagram)
		{ 
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}


//output
//string is anagram