package cytech_practice37;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		Computer01 computer = new Computer01();
		
		//実引数を渡してメソッドを呼び出す
		computer.cytechName("じゃば君");
		computer.cytechName("言語君");
		computer.cytechName("システム君");
		computer.cytechName("エンジ君");
		
		computer.search(987654321);
		computer.search(123456789);
	}
}


