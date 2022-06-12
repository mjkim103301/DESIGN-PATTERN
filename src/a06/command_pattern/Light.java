package a06.command_pattern;

/**
 * 재료
 */
public class Light {

	public Light() {
	}

	public void on() {
		System.out.println("조명이 켜졌습니다.");
	}

	public void off() {
		System.out.println("조명이 꺼졌습니다.");
	}
}
