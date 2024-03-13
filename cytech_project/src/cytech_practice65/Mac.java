package cytech_practice65;

/*
 * Macクラス（抽象クラス）
 */
public abstract class Mac {

	/*使い方メソッド*/
	abstract void use();
	
	/*挨拶メソッド（具象クラス）*/
	public void communication() {
		System.out.println("Hello");
	}
}

