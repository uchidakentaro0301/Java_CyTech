package cytech_practice55;

/*
 * バスクラス
 */
public class Bus01 {
	/*値段*/
	private int price;

	/*定員*/
	private int capacity;

	/*
	 *初期値の設定
	 */
	public Bus01() {

		price = 0;
		capacity = 0;
	}
		
	/*
	 * 情報の設定
	 * @param price
	 * @param capacity 
	 */
	public void setBus(int price, int capacity) {
		this.price = price;
		this.capacity = capacity;
	}
	
	/*
	 * 情報の表示
	 */
	public void showBus() {
		System.out.println("バス一回利用した値段は" + price + "円です。");
		System.out.println("バスの定員は" + capacity + "人です。");
	}
}


