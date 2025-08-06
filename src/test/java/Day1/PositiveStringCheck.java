package Day1;

public class PositiveStringCheck {
	public static boolean PositiveString(String temp)
	{
		for(int i=0;i<temp.length()-1;i++)
		{
			if(temp.charAt(i)>temp.charAt(i+1))
			{
				return false;
			}
				
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "cAB";
        String b = "Eijk";
        String c = "bdfkn";

        System.out.println(PositiveString(a));
        System.out.println(PositiveString(b));
        System.out.println(PositiveString(c));
 

	}

}
