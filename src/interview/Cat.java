package interview;


public class Cat {

	protected static String color = "random";

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public void showCatColor() {
		System.out.println("Cat:" + color);
	}

	public static void showColor() {
		System.out.println("Cat:" + color);
	}

	public static void main(String[] args) {
		//		WhiteCat whiteCat = new WhiteCat();
		//		Cat cat = whiteCat;//干扰项
		//		cat.showColor();//Cat:random
		//		cat.showCatColor();//white:white
		//运行时异常，类型转换失败
		//		Cat cat = new Cat();
		//		WhiteCat whiteCat = (WhiteCat) cat;
		//		cat.showColor();
		//		cat.showCatColor();
		///////////////////////////////////////////
		//		Cat cat = new WhiteCat();
		//		WhiteCat whiteCat = (WhiteCat) cat;//干扰项
		//		cat.showColor();//Cat:random
		//		cat.showCatColor();//white:white

	}
}

class WhiteCat extends Cat {
	protected static String color = "white";

	public WhiteCat() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void showCatColor() {
		System.out.println("White:" + color);
	}

	public static void showColor() {
		System.out.println("White:" + color);
	}
}
