package a09.iterator_pattern;

import java.util.Iterator;
import java.util.ArrayList;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // --- added 12/30/2016 - not in original code
    public void printMenu(int withNewConstructs) {
        ArrayList<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        //pMenu.forEach(m -> printMenuItem(m));
        for (MenuItem m : breakfastItems) {
            printMenuItem(m);
        }

        MenuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
        for (MenuItem m : lunchItems) {
            printMenuItem(m);
        }
    }

    public void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
    // ---

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\n아침 메뉴");
        printMenu(pancakeIterator);
        System.out.println("\n점심 메뉴");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----\n아침 메뉴");
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        System.out.println("\n점심 메뉴");
        printVegetarianMenu(dinerMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        if (isVegetarian(name, pancakeIterator)) {
            return true;
        }
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        if (isVegetarian(name, dinerIterator)) {
            return true;
        }
        return false;
    }


    private void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }

    private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
