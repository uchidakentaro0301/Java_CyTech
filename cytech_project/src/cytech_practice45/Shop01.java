package cytech_practice45;

/**
 *Shopクラス
 */
public class Shop01 {

	private String type;
	private int price;
	
	/**
	 * コンストラクタ
	 * @param type
	 * @param price
	 * 引数ありのコンストラクタ
	 */
	public Shop01(String type, int price) {
		this.type = type;
		this.price = price;
		
		System.out.println("ショップを作りました。");
	}
	
	/**
	 *出力
	 */
	public void show() {
		System.out.println("種類は" + type + "です。");
		System.out.println("平均の値段は" + price + "円です。");
	}
}


