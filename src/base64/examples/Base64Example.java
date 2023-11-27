package base64.examples;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Example {
	public static void main(String[] args) {
		
		try {
			String text = "The class Base64 in Java8";
			System.out.println(text);
			
			String textEncoded = Base64.getEncoder().encodeToString(text.getBytes("utf-8"));
			System.out.println(textEncoded);
			
			String textDecoded = new String(Base64.getDecoder().decode(textEncoded), "utf-8");
			System.out.println(textDecoded);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
