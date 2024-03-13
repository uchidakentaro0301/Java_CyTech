package cytech_practice61;

public class Cytech01 {

	public static void main(String[] args) {
		//スーパークラスの配列作成
		Windows01[] win = new Windows01[2];
		
		//スーパークラスのオブジェクトを配列に追加
		win[0] = new Windows01();
		
		//サブクラスのオブジェクトを配列に追加
		win[1] = new Mac01();
		
		for(Windows01 dows : win) {
			//各オブジェクトのshow()メソッド実行
			dows.show();
		}
	}
}


