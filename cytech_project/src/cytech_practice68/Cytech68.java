package cytech_practice68;

public class Cytech68 {

	public static void main(String[] args) {
		try {
			tng();
		}catch (ArithmeticException e) {
			System.out.println("例外が発生しました。");
		}finally {
			System.out.println("終了しました。");
		}
	}
	public static void tng() {
		int c = 100/0;
		System.out.println("中身は" + c + "です。");
	}
}

