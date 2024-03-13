package cytech_practice69;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cytech {

	public static void main(String[] args) {
		try {
			String[] pc = new String[2];
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1つ目のPC名を入力してください。");
			pc[0] = reader.readLine();
			System.out.println("2つ目のPC名を入力してください。");
			pc[1] = reader.readLine();
			System.out.println("1つ目のPCは" + pc[0] + "です。");
			System.out.println("2つ目のPCは" + pc[1] + "です。");
			System.out.println("3つ目のPCは" + pc[2] + "です。");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("配列のインデックスが不正。");
		} catch (IOException e) {
			System.out.println("入出力処理で問題が発生。");
		}
	}
}


