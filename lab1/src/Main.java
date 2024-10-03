import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero(0, 0); // Герой начинается с координат (0, 0)

        // Бесконечный цикл для выбора перемещения
        while (true) {
            hero.getCoordinates();

            System.out.println("Выберите способ перемещения:");
            System.out.println("1 - Пешком");
            System.out.println("2 - На лошади");
            System.out.println("3 - Лететь");
            System.out.println("0 - Выйти");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            // Выбор стратегии в зависимости от ввода пользователя
            switch (choice) {
                case 1:
                    hero.setMoveStrategy(new WalkStrategy());
                    break;
                case 2:
                    hero.setMoveStrategy(new HorseRideStrategy());
                    break;
                case 3:
                    hero.setMoveStrategy(new FlyStrategy());
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
                    continue;
            }

            // Ввод новых координат
            System.out.println("Введите координаты, куда переместить героя:");
            System.out.print("X: ");
            int newX = scanner.nextInt();
            System.out.print("Y: ");
            int newY = scanner.nextInt();

            // Перемещаем героя
            hero.move(newX, newY);
        }

        scanner.close();
    }
}