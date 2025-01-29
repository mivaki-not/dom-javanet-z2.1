//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int bilet = 2;
        int price = 12000; // стоимости билета
        int mili = 20; // рублей для одной бонусной мили

        System.out.println((bilet * price ) + " Цена за два билета ");
        System.out.println(((bilet * (price / mili)) + " Получено бонусов "));

    }
}