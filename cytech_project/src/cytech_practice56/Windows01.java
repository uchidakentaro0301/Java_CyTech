package cytech_practice56;

/*
 * Windowsクラス
 */
public class Windows01 {
	/*値段*/
	private int price;
	
	/*
	 * 値段を設定
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * 値段の表示
	 */
	public void showPrice() {
		System.out.println("料金は" + price + "万円になります。");
	}
}


