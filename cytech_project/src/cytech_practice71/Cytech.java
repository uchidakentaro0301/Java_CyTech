package cytech_practice71;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cytech {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("好きなPCを入力してください>");
		// 入力待ち
		String input = reader.readLine();
		// クラス名を通してクラスメソッドを参照(staticメソッド)
		Pc.check(input);
	}
}


