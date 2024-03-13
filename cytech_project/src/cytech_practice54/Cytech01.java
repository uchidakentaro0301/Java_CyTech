package cytech_practice54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cytech01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("郵便番号を入力してください。");
		System.out.println("入力例：×××-××××");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String tng = reader.readLine();
		
		//パターンの指定
		Pattern t = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
		
		//パターンがあっているか比較
		Matcher m = t.matcher(tng);
		System.out.println(m.find());
	}
}


