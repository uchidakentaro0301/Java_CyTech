package cytech_practice60;

/*
 * Macクラス
 */
public class Mac01 extends Windows01 {
	/*サイズ*/
	private int size;
	
	/*
	 * コンストラクタ
	 */
	public Mac01() {
		System.out.println("Macを生成しました。");
		size = 100;
	}
	
	/*
	 * サイズ表示
	 */
	@Override
	public void show() {
		System.out.println("画面サイズは" + size + "インチです。");
	}
}


