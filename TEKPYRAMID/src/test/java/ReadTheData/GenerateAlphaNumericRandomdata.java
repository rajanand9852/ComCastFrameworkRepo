package ReadTheData;

public class GenerateAlphaNumericRandomdata {

	public static void main(String[] args) {
		int n=20;
		
		//choose a character random from this string
		String alphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		//create StringBuffer size of AlphaNumericstring
		StringBuffer sb=new StringBuffer(n);
		
		for(int i=0;i< n;i++) {
			
			//generate a random number between 0 To AlphanumericString variable
			int index=(int ) (alphaNumericString.length()* Math.random());
			
			//add character one by one in end of sab
			sb.append
		}
		

	}

}
