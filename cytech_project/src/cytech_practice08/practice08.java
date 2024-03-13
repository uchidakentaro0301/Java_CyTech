package cytech_practice08;

public class practice08 {

	public static void main(String[] args) {
		//変数の定義
		int cytech1 = 100;
		int cytech2 = 0;
		
		//後置インクリメント
		cytech2 = cytech1++;
		
		System.out.println("cytech2の値は" + cytech2 + "になります。");
		
		//前置インクリメント
		cytech2 = ++cytech1;
		
		System.out.println("cytech2の値は" + cytech2 + "になります。");
	}
}


