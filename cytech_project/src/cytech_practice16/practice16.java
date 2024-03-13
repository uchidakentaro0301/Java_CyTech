package cytech_practice16;

public class practice16 {

	public static void main(String[] args) {
		//配列を初期化
		int[][] cytech = {{20, 40, 60}, {10, 30, 50}};
		
		//要素の長さを調べる
		System.out.println("カリキュラムを受けた人数は" + cytech.length + "人です。");
		System.out.println("カリキュラムを受けた人数は" + cytech[0].length + "人です。");
		System.out.println("カリキュラムを受けた人数は" + cytech[1].length + "人です。");
		
		//配列要素の出力
		System.out.println("テストの合計点は" + cytech[0][0] + "点です。");
		System.out.println("テストの合計点は" + cytech[0][2] + "点です。");
		System.out.println("テストの合計点は" + cytech[1][1] + "点です。");
		System.out.println("テストの合計点は" + cytech[1][2] + "点です。");
	}
}

