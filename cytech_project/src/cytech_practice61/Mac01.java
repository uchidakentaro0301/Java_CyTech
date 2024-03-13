package cytech_practice61;

/**
 *Macクラス
 */
public class Mac01 extends Windows01{
	/*サイズ*/
	private int size;
	
	/**
	 *コンストラクタ
	 */
	public Mac01() {
		super.price = 90;
		super.data = 10.0;
		this.size = 100;
	}
	
	/**
	 *サイズの表示
	 */
	@Override
	public void show() {
		System.out.println("購入したMACの色はダークブラックです。");
		System.out.println("PCのサイズは" + size + "インチです。");
		super.show();
	}
}

