package cytech_practice59;

/*
 * Windowsクラス
 */
public class Window01 {
	/*データ容量*/
	protected double data;
	
	/*
	 * データ容量設定
	 * @param　adta
	 */
	public void setData(double data) {
		this.data = data;
	}
	
	/*
	 * データ容量表示
	 */
	public void checkData() {
		System.out.println("データの容量は" + data + "TBです。");
	}
}


