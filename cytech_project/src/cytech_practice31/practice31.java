package cytech_practice31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice31 {

	public static void main(String[] args) throws IOException {
		System.out.println("何回繰り返して中断をしますか？");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tng = br.readLine();
		int cytech = Integer.parseInt(tng);
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i + "回繰り返しました。");
			if(i == cytech) {
				break;
			}
		}
		System.out.println("繰り返し処理を中断する。");
	}
}


