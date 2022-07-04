package a09.iterator_pattern;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\nCustomer asks, 채식주의자용 핫도그가 있나요?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("핫도그")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, 채식주의자용 와플이 있나요?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("와플")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
