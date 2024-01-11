package java8;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println("selfAid");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		
		System.out.println("this.mp:" + this.mp);
		System.out.println("==============================");
	}
	
	public int pray(int sec) {
		System.out.println("pray");
		Random rand = new java.util.Random();
		int prayMp = rand.nextInt(3) + sec;
		System.out.println("sec:" + sec + " prayMp:" + prayMp);
		int recoveryMp = 0;
		
		if ((this.mp + prayMp) <= this.MAX_MP) {
			this.mp += prayMp;
			recoveryMp = prayMp;
			System.out.println("===== if =====");
			System.out.println("this.mp:" + this.mp + " prayMp:" + prayMp + " recoveryMp:" + recoveryMp);
		} else {
			System.out.println("===== else =====");
			recoveryMp = this.MAX_MP - this.mp;
			System.out.println("this.mp:" + this.mp + " recoveryMp:" + recoveryMp);
		}
		
		return recoveryMp;
	}
}
