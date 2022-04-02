import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Куда тебе нужно приехать? ");
        String text1 = "Школа";
        String text2 = "Дом";
        String text3 = "Парк";
        String text4 = "да";
        String text5 = "нет";
        String answer = in.nextLine();


        if (Objects.equals(answer, text3)) {
            System.out.print("Стоимость поездки: 100 рублей");
        } else if (Objects.equals(answer, text1)) {
            System.out.print("Стоимость поездки: 50 рублей");
        } else if (Objects.equals(answer, text2)) {
            System.out.print("Стоимость поездки: 10 рублей. Вы сегодня кушали?");
            String answer1 = in.nextLine();

            if (Objects.equals(answer1, text4))
                System.out.print("Надеюсь вы сыты");
            else if (Objects.equals(answer1, text5))
                System.out.print("Советую вам заехать в столовую");

        } else {
            System.out.println("Не могу сказать стоимость поездки");

        }
        in.close();
    }
}