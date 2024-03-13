package cytech_practice50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cytech01 {

	public static void main(String[] args) throws IOException {
		//追加される文字列を入力
		System.out.println("文字を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String tng1 = reader.readLine();

		//追加される文字列を入力
		System.out.println("2つ目の文字列を入力。");
		String tng2 = reader.readLine();
		StringBuilder builder = new StringBuilder(tng1);
		
		//文字列を追加
		builder.append(tng2);
		System.out.println("2つの文字列を繋げた結果は" + builder + "です。");
	}
}


