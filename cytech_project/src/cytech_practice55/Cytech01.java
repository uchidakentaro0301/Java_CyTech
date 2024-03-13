package cytech_practice55;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		Bus01 bus1 = new Bus01();
		bus1.setBus(120,50);
		
		//変数Bus1の値を代入
		Bus01 bus2 = new Bus01();
		
		bus2.setBus(220,70);

		//表示
		bus1.showBus();
		bus2.showBus();
	}
}

