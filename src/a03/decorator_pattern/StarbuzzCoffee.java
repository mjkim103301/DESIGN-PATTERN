package a03.decorator_pattern;

import a03.decorator_pattern.beverage.Beverage;
import a03.decorator_pattern.beverage.CaramelMacchiato;
import a03.decorator_pattern.beverage.Espresso;
import a03.decorator_pattern.beverage.HouseBlend;
import a03.decorator_pattern.beverage.Size;
import a03.decorator_pattern.condiment.Ice;
import a03.decorator_pattern.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        StringBuilder sb = new StringBuilder();
        sb.append(beverage.getDescription()).append(", ").append(beverage.cost() + "원").append("\n");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Ice(beverage2);
        sb.append(beverage2.getDescription()).append(", ").append(beverage2.cost() + "원").append("\n");

        Beverage beverage3 = new CaramelMacchiato();
        beverage3 = new Whip(beverage3);
        beverage3 = new Ice(beverage3);
        sb.append(beverage3.getDescription()).append(", ").append(beverage3.cost() + "원").append("\n");

        Beverage beverage4=new Espresso(Size.GRANDE);
        beverage4=new Ice(beverage4);
        beverage4=new Ice(beverage4);
        sb.append(beverage4.getDescription()).append(", ").append(beverage4.cost() + "원").append("\n");
        System.out.println(sb);

    }
}
