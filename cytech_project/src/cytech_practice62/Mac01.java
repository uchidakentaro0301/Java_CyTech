package cytech_practice62;

/*
 * MACクラス
 */
public class Mac01 {
	/*料金*/
	private int price;
	/*容量*/
	private double data;
	
	/*
	 * コンストラクタ
	 */
	public Mac01(){
		price = 30;
		data = 90.0;
		
		System.out.println("MACを購入しました");
	}
	
	/*
	 * 値段と容量を表示
	 * 
	 * ＠param t
	 * ＠param c
	 */
	public void setMac(int t, double c) {
		price = t;
		data = c;
		
		System.out.println("値段は" + t + "万円で、データ容量は"  + c + "TBです。");
	}
	
	/*
	 * 文字列を戻り値として返す
	 * @return 文字列
	 */
	@Override
	public String toString() {
		String ct = "値段:" + price + "万円" + "　データ容量:" + data + "TB";
		
		return ct;
	}
}


