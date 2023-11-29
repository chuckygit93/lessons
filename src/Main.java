public class Main {
     //Если number == 40, то вывести в консоль "number = 40"
    public static void main(String[] args) {
        System.out.println("Hello");
        int number = 6;
        if (number > 0 && number != 40 && number < 100) {
            System.out.println("!!!!");
        } else if (number == 40) {
            System.out.println("number ="+ number);

        }
    }
}