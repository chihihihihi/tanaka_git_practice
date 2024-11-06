package tanaka_git_practice;

public class UseCar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Car c1;
		c1 = new Car();

		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";

		c1.start();
		c1.curve();
		c1.stop();

		System.out.println("c1のメーカーは" + c1.maker + "です");
		System.out.println("c1の色は" + c1.color + "です");
	}
}
