package cytech_practice70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cytech {
	public static void main(String[] args) {
		try {
			// staticメソッド
			inputPC();
			
		// マルチキャッチ
		} catch (ArrayIndexOutOfBoundsException | IOException e) {
			e.printStackTrace();
			System.out.println("例外が発生,はじめからやり直してください。");
		}
	}

	/**
	* 入力した文字列をString型の配列に格納
	*
	* @throws IOException
	* @throws ArrayIndexOutOfBoundsException
	*/
	public static void inputPC() throws IOException, ArrayIndexOutOfBoundsException {
		String[] pc = new String[2];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目のPC名を入力してください。");
		pc[0] = reader.readLine();
		System.out.println("2つ目のPC名を入力してください。");
		pc[1] = reader.readLine();
		
		System.out.println("1つ目のPCは" + pc[0] + "です。");
		System.out.println("2つ目のPCは" + pc[1] + "です。");
		System.out.println("3つ目のPCは" + pc[2] + "です。");
	}
}


