public class Main {
    public static void main(String[] args) {
        System.out.println("Perfectly Normal Dice.");
        Die dice6 = new Die(6);
        dice6.roll();
        System.out.println(dice6.value);

        System.out.println("Twenty Sided Dice.");
        Die dice20 = new Die(20);
        dice20.roll();
        System.out.println(dice20.value);

        System.out.println("Weighted Dice.");
        Die weighted = new Die(6, new int[]{1, 1, 1, 1, 1, 2});
        weighted.roll();
        System.out.println(weighted.value);
    }
}