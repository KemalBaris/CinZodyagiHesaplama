import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int birthday,mod;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your birthday year: ");
        birthday = input.nextInt();
        mod = birthday % 12;
        switch (mod) {
            case 0:
                System.out.print("Your Chinese Zodiac Sign: Monkey");
                break;
            case 1:
                System.out.print("Your Chinese Zodiac Sign: Rooster");
                break;
            case 2:
                System.out.print("Your Chinese Zodiac Sign: Dog");
                break;
            case 3:
                System.out.print("Your Chinese Zodiac Sign: Pig");
                break;
            case 4:
                System.out.print("Your Chinese Zodiac Sign: Rat");
                break;
            case 5:
                System.out.print("Your Chinese Zodiac Sign: Taurus");
                break;
            case 6:
                System.out.print("Your Chinese Zodiac Sign: Tiger");
                break;
            case 7:
                System.out.print("Your Chinese Zodiac Sign: Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiac Sign: Dragon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiac Sign: Snake");
                break;
            case 10:
                System.out.print("Your Chinese Zodiac Sign: Horse");
            case 11:
                System.out.print("Your Chinese Zodiac Sign: Sheep");
                break;

        }
    }
}