package cytech_practice32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice32 {

	public static void main(String[] args) throws IOException {
		System.out.println("何回繰り返しを中断をしますか？");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String tng = reader.readLine();
		int cytech = Integer.parseInt(tng);

		for (int i = 1; i <= 10; i++) {
			if (i == cytech) {
				continue;
			}
			System.out.println(i + "回繰り返しました。");
		}
	}
}


