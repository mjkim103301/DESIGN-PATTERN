package a08.template_method_pattern.base_template;

public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("찻잎을 우려낸는 중");
	}
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중");
	}
}
