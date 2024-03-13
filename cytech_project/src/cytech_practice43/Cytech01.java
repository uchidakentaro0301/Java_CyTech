package cytech_practice43;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		People01 people = new People01();
		
		//setterを呼び出す
		people.setName("じゃば太郎");
		people.setGender("女性");
		
		//getterを呼び出す
		System.out.println(people.getName());
		System.out.println(people.getGender());
	}
}


