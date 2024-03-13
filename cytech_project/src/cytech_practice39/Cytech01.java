package cytech_practice39;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		People01 people = new People01();
		
		//オブジェクトの生成
		Computer01 computer1 = new Computer01();
		computer1.cytechName = "javaコース";
		
		//オブジェクトの生成
		Computer01 computer2 = new Computer01();
		computer2.cytechName = "HTML&CSSコース";
		
		//参照型を引数に持つメソッドの呼び出し
		people.takeCytech(computer1);
		people.takeCytech(computer2);
	}
}


