package java8;

public class Hero {
	String name;	// 名前の宣言
	int hp;			// HPの宣言
	
	public void sleep() {
		this.hp = 100;
		System.out.printf("%sは、眠って回復した！\n", this.name);
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.printf("%sは、%d秒座った！\n", this.name, sec);
		System.out.printf("HPが%dポイント回復した\n", sec);
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.printf("%sは転んだ！\n", this.name);
		System.out.printf("5のダメージ！\n");
	}
	
	public void run() {
		System.out.printf("%sは、逃げだした！\n", this.name);
		System.out.printf("GAMEOVER\n");
		System.out.printf("最終HPは%dでした！\n", this.hp);
	}
}
