import java.util.Scanner;

public class StringsTurningOver {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();//input https://domen.ru/about/reviews

        int index = path.indexOf("//");
        int index2 = path.indexOf("/", index + 2);

        String first = path.substring(0, index + 1);
        String last = path.substring(index2);

        String result = first + "javarush.ru" + last;
        System.out.println(result);
    }
}
