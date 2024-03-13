package cytech_practice58;

/*
 *PCクラス 
 */

public class Windows01 {
	/*値段*/
	int price;
	
	/*容量*/
	double data;
	
	/*
	 * コンストラクタ
	 * 
	 * @param price 
	 * @param data
	 */
	public Windows01(int price, double data) {
		System.out.println("Windowsクラスのコンストラクタ（引数）が呼び出されます。");
		
		this.price = price;
		this.data = data;
	}
}


