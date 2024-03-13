package cytech_practice60;

/*
 * Windowsクラス
 */
public class Windows01 {
	/*値段*/
	private int price;
	
	/*容量*/
	private double data;

	/*
	 * コンストラクタ
	 */
	public Windows01() {
		System.out.println("Windowsを生成しました。");
		price = 100;
		data = 40.0;
	}
	
	/*
	 * 料金と容量を表示
	 */
	public void show() {
		System.out.println("Macの料金は" + price + "万円です。");
		System.out.println("データ容量は" + data + "TBです。");
	}
}


