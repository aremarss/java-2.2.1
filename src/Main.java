public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bonusOne = service.calculate(8000, 20);
        System.out.println("От 8000 руб. бонус: " + bonusOne + " миль.");

        int bonusTwo = service.calculate(10_000, 20);
        System.out.println("От 10 000 руб. бонус: " + bonusTwo + " миль.");

        int bonusThree = service.calculate(12_000, 20);
        System.out.println("От 12 000 руб. бонус: " + bonusThree + " миль.");

        int bonusFour = service.calculate(14_000, 20);
        System.out.println("От 14 000 руб. бонус: " + bonusFour + " миль.");
    }
}