public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 10;
        if (age>=18) {
            System.out.println("Если тебе " + age + " ты достиг совершеннолетия");
        }
        if (age<18) {
            System.out.println("Если тебе " + age + " ты не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int temperature = 3;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println("Задание 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то прийдется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
        System.out.println("Задание 4");
        int people = 30;
        if (people > 2 && people < 6) {
            System.out.println("Если возраст человека равен " + people + " ,то ему нужно ходить в детский садик");
        }
        if (people > 7 && people < 17) {
            System.out.println("Если возраст человека равен " + people + " ,то ему нужно ходить в школу");
        }
        if (people > 18 && people < 24) {
            System.out.println("Если возраст человека равен " + people + " ,то ему нужно ходить в университет");
        }
        if (people > 24) {
            System.out.println("Если возраст человека равен " + people + " ,то ему пора ходить на работу");
        }
    }



    }



