package cytech_practice22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2202 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);

		//breakなしのswitch文
		switch(tng) {
		case 10:
			//変数tngが10の場合
			System.out.println("100が入力されました。");
			
		case 20:
			//変数tngが20の場合
			System.out.println("200が入力されました。");
			
		default:
			//変数tngが10と20の場合
			System.out.println("100と200以外の数値が入力されました。");
		}
	}

}

