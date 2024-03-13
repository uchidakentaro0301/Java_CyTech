package cytech_practice28;

public class practice28 {

	public static void main(String[] args) {
		//for文ネスト
		for(int i = 1; i <= 20; i++) {
			for(int j = 1; j<= 20; j++ ) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			//改行
			System.out.println(" ");
		}
	}
}


