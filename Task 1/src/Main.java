import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. Let's create some Elixirs.\nTo create Elixir, you should input count of ingreedients: ");
        System.out.println();
        boolean isCanCook = false;

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Enter Toad eyes Count: ");
        int toadEyesCount = new Scanner(System.in).nextInt(); //Жабьи глаза
        System.out.println("Enter Ghoul tears Count: ");
        int ghoulTearsCount = new Scanner(System.in).nextInt(); //Слезы вурдалака
        System.out.println("Enter Raven bones Count: ");
        int ravenBonesCount = new Scanner(System.in).nextInt();//Кости ворона
        System.out.println("Enter Dumplings Count: ");
        int dumplingsCount = new Scanner(System.in).nextInt(); //Пельмени(а почему, собственно нет? xD )

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("You can create - Эликсир зоркости");
            isCanCook = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("You can create - Эликсир стойкости");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("You can create - Эликсир скрытности");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("You can create - Запретный эликсир");
            isCanCook = true;
        }
        if (!isCanCook) {
            System.out.println("You can't cook anything!");
        }
    }
}
