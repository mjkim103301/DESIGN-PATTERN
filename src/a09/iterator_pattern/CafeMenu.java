package a09.iterator_pattern;

import java.util.*;

public class CafeMenu implements Menu {
    private HashMap<String, MenuItem> menuItems = new HashMap();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "통밀빵에 야채버거, 양상추, 토마토, 감자튀김",
                true, 3.99);
        addItem("Soup of the day",
                "오늘의 스프와 샐러드",
                false, 3.69);
        addItem("Burrito",
                "큰 부리토, 콩, 살사, 과카몰리",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
