package _student;


public class CryptoManager {
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	public static boolean stringInBounds (String plainText) {
		for(int i=0;i<plainText.length();i++)
		{
			if(plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) >
					UPPER_BOUND )
				return false;
		}
		return true;
	}

	public static String encryptCaesar(String plainText, int key) {
		String enc="";
		if(key > RANGE)
		{
			while(key>UPPER_BOUND)
				key=key-RANGE-1;
		}
		for(int i=0;i<plainText.length();i++)
		{
			enc=enc+(char)(plainText.charAt(i)+key);
		}

		return enc;
	}

	public static String encryptBellaso(String plainText, String bellasoStr) {
		String key="";
		String enc="";

		int j=0;
		while(key.length()!=plainText.length())
		{
			key=key+bellasoStr.charAt(j);
			j++;
			if(j==bellasoStr.length())
				j=0;
		}
		for(int i=0;i<plainText.length();i++)
		{

			int res=plainText.charAt(i)+key.charAt(i);
			if(res>UPPER_BOUND)
			{
				while(res>UPPER_BOUND)
					res=res-RANGE;
			}

			enc=enc+(char)res;
		}


		return enc;
	}

	public static String decryptCaesar(String encryptedText, int key) {
		String dec="";

		if(key>RANGE)
		{
			while(key>UPPER_BOUND)
				key=key-RANGE-1;
		}
		for(int i=0;i<encryptedText.length();i++)
		{
			dec=dec+(char)(encryptedText.charAt(i)-key);
		}

		return dec;
	}

	public static String decryptBellaso(String encryptedText, String
			bellasoStr) {
		String key="";
		String dec="";
		int j=0;



		while(key.length()!=encryptedText.length())
		{
			key=key+bellasoStr.charAt(j);
			j++;
			if(j==bellasoStr.length())
				j=0;
		}

		for(int i=0;i<encryptedText.length();i++)
		{
			int res=encryptedText.charAt(i)-key.charAt(i);
			if(res<LOWER_BOUND)
			{
				while(res<LOWER_BOUND)
					res=res+RANGE;
			}
			dec=dec+(char)res;
		}

		return dec;
	}
}
