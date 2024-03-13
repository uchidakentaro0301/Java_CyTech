package cytech_practice40;

public class Cytech01 {

	public static void main(String[] args) {
		People01 people = new People01();
		
		//戻り値を持つメソッドを呼び出し、戻り値を変数に代入
		String fullName = people.tellFullName("じゃば", "一郎");
		double allSize = people.footSize(27.5, 20.5);
		
		System.out.println(fullName + "の完璧な足のサイズは" + allSize + "です。(計算は何も関係していません。)");

	}
}


