package cytech_practice30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice30 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i =0;
		int chooseflg = 0;
		System.out.println("PCを購入します。");
		
		do {
			i++;
			System.out.println("購入するPCを1つ増やしますか？");
			System.out.println("Yes：0、No:1");
			String choose = br.readLine();
			chooseflg = Integer.parseInt(choose);
		}while (chooseflg ==0);
			System.out.println("購入したPCの数は" + i + "個です。");
	}
}


