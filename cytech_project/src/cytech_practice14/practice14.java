package cytech_practice14;

public class practice14 {

	public static void main(String[] args) {
		//配列を初期化
		int[] cytech1 = {20, 25, 28, 32};
		
		//別の配列変数を準備
		int[] cytech2;
		
		//配列変数cytech1を配列変数2に代入
		cytech2 = cytech1;
		
		cytech1[0] = 40;
		
		//出力
		System.out.println("一人目の年齢は" +cytech2[0]+ "歳です。");
	}
}

