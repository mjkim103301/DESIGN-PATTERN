package a08.template_method_pattern;

import a08.template_method_pattern.base_template.Coffee;
import a08.template_method_pattern.base_template.Tea;
import a08.template_method_pattern.hook.CoffeeWithHook;
import a08.template_method_pattern.hook.TeaWithHook;

public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n홍차 준비중...");
        tea.prepareRecipe();

        System.out.println("\n커피 준비중...");
        coffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n홍차 준비중...");
        teaHook.prepareRecipe();

        System.out.println("\n커피 준비중...");
        coffeeHook.prepareRecipe();
    }
}
