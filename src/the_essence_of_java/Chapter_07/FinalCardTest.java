package the_essence_of_java.Chapter_07;

class Card7 {
	final int NUMBER;		// 상수지만 선언과 함께 초기화 하지 않고
	final String KIND;		// 생성자에서 단 한번만 초기화할 수 있다.
	static int width  = 100;
	static int height = 250;

	Card7(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}

	Card7() {
		this("HEART", 1);
	}

	public String toString() {
		return KIND +" "+ NUMBER;
	}
}

class FinalCardTest {
	public static void main(String args[]) {
		Card7 c = new Card7("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}