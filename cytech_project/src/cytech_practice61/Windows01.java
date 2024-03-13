package cytech_practice61;

/*
 * Windowsクラス
 */
public class Windows01 {
	/*値段*/
	protected int price;
	/*容量*/
	protected double data;
	
	/*
	 * コンストラクタ
	 */
	public Windows01() {
		price = 700;
		data = 9.0;
	}
	
	/*
	 * 値段と容量表示
	 */
	public void show() {
		System.out.println("PCの値段は" + price + "万円です。");
		System.out.println("データの容量は" + data + "TBです。");
	}
}

