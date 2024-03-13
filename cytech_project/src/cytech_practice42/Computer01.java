package cytech_practice42;

/**
 * PCクラス
 */
public class Computer01 {

	/**値段 */
	private int price;
	
	/**データ容量 */
	private double data;
	
	/**
	 * 値段の設定
	 * 
	 * ＠param p　値段
	 */
	public void setPrice(int p) {
		//値段の値チェック
		if(0 <= p) {
			price = p;
			System.out.println("値段を" + price + "万円にします。");
		}else {
			System.out.println(p + "万は正しい値段ではありません。");
		}
	}
	
	/**
	 * データ容量の設定
	 * 
	 * ＠param d　値段
	 */
	public void setData(double d) {
		//データ容量のチェック
		if(0.0 <= d && d <= 99.99) {
			data = d;
			System.out.println("データ容量を" + data + "TBに設定しました");
		}else {
			System.out.println(d + "は正しい値段ではありません。");
		}
	}
}


