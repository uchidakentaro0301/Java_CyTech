package cytech_practice63;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		Mac01 mac1 = new Mac01();
		//オブジェクトの生成
		Mac01 mac2 = new Mac01();
		//Macクラスのクラス型の変数にオブジェクト1を代入
		Mac01 mac3 = mac1;
		
		boolean tng1 = mac1.equals(mac2);
		boolean tng2 = mac1.equals(mac3);
		System.out.println("mac1とmac2が同じオブジェクトか調べた結果：" +tng1);
		System.out.println("mac1とmac3が同じオブジェクトか調べた結果：" +tng2);
	}
}


