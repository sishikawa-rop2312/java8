package java8;

public class Hero {
	String name;	// 名前の宣言
	int hp;			// HPの宣言
	
	public void sleep() {
		this.hp = 100;
		System.out.printf("%sは、眠って回復した！\n", this.name);
	}
}
