package cytech_practice11;

public class practice11 {

	public static void main(String[] args) {
		//変数の定義
		double cytech1 = 150.5;
		double cytech2 = 40.5;
		
		//出力
		System.out.println("身長は" +  cytech1 +"cmです。");
		System.out.println("体重は" +  cytech2 +"kgです。");
		
		//明示的な型変換　「()」を使用
		int tng1 = (int)cytech1;
		int tng2 = (int)cytech2;
		
		//出力
		System.out.println("身長は" +  tng1 +"cmです。");
		System.out.println("体重は" +  tng2 +"kgです。");
		
	}
}


