package cytech_practice29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i =0;
		System.out.println("PCを購入されますか？");
		System.out.println("Yes：0、No：1");
		
		String whichone = br.readLine();
		int tng = Integer.parseInt(whichone);
		
		//tngが0の場合繰り返す
		while(tng == 0) {
			i++;
			System.out.println("購入するPCを一個増やしますか？");
			System.out.println("Yes：0、No：1");
			whichone = br.readLine();
			tng = Integer.parseInt(whichone);
		}
		System.out.println("購入したPCの数は" + i + "個です。");
	}
}


