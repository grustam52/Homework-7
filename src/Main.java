public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");

        int amountPurpose = 2_459_000;
        int mouthAmount = 15000;
        double mouthPercent = 0.01;
        float total = 0;
        int month = 1;
        while (total <= amountPurpose) {
            total += mouthAmount + total * mouthPercent;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, total);
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int population = 12_000_000;
        float birthCount = (float) 17 / 1000;
        float deathCount = (float) 8 / 1000;
        for (int year = 1; year < 11; year++) {
            population = (int) (population + (population * birthCount) - (population * deathCount));
            System.out.printf("Год %d, численность насселения составляет %d %n", year, population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12_000_000;
        int month = 1;
        while (depositAmount <= totalAmount) {
            depositAmount += depositAmount * monthlyPercent;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, depositAmount);
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12_000_000;
        int month = 1;
        while (depositAmount <= totalAmount) {
            depositAmount += depositAmount * monthlyPercent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, depositAmount);
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12_000_000;
        int month = 1;
        int monthPurpose = 9 * 12;

        while (month <= monthPurpose) {
            depositAmount += depositAmount * monthlyPercent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, depositAmount);
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int friday = 7;
        int dayTotal = 31;

        while (friday <= dayTotal) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчёт.%n", friday);
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}