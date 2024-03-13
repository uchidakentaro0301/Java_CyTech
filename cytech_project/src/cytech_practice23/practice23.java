package cytech_practice23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice23 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);
		
		if(100 < tng && tng <=300) {
			//①tngが100より大きく、300より小さい場合の処理
			System.out.println(tng + "は100より大きく300以下の数字です。");
		} else if(tng <= 100) {
			//②tngが100より小さい場合の処理
			System.out.println(tng + "は100以下の数字です。");
		}else {
			//③それ以外の場合の処理
			System.out.println(tng + "は300より大きい数字です。");
		}
	}
}


