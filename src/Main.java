public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 10;
        if (age>=18) {
            System.out.println("Ты достиг совершеннолетия");
        }
        if (age<18) {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int temperature = 3;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

    }
}