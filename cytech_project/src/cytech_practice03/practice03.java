package cytech_practice03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice03 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine(); 
		
		//入力した文字列を数値に変換
		int num= Integer.parseInt(str);
		System.out.println(num + "が入力されました。");
	}

}

