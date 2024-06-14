public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int amountOfSavings = 2_459_000;
        int cashPerMonth = 15_000;
        int total = 0;
        int monthNumber = 0;
        while (total < amountOfSavings) {
            total = total + cashPerMonth;
            monthNumber = monthNumber + 1;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 2");

        int forward = 1;
        while (forward <= 10) {
            System.out.print(forward + " ");
            forward = forward + 1;
        }
        System.out.println();
        for (int backward = 10; backward >= 1; backward--) {
            System.out.print(backward + " ");
        }
        System.out.println();


        System.out.println("Задание 3");

        int totalPeople = 12_000_000;
        int birthRateInYear = 17;
        int mortalityInYear = 8;
        for (int year = 1; year <= 10; year++) {
            totalPeople = totalPeople + (totalPeople / 1000 * (birthRateInYear - mortalityInYear));
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople + " человек");
        }

        System.out.println("Задание 4");

        int depositAmount = 15_000;
        int needCash = 12_000_000;
        int monthNumber1 = 0;
        while (depositAmount < needCash) {
            depositAmount = depositAmount + depositAmount / 100 * 7;
            monthNumber1 = monthNumber1 + 1;
            System.out.println("Месяц " + monthNumber1 + ", сумма накоплений равна " + depositAmount + " рублей");
        }

        System.out.println("Задание 5");

        int depositAmount1 = 15_000;
        int needCash1 = 12_000_000;
        int monthNumber2 = 0;
        while (depositAmount1 < needCash1) {
            depositAmount1 = depositAmount1 + depositAmount1 / 100 * 7;
            monthNumber2 = monthNumber2 + 1;
            if (monthNumber2 % 6 == 0) {
                System.out.println("Месяц " + monthNumber2 + ", сумма накоплений равна " + depositAmount1 + " рублей");
            }
        }

        System.out.println("Задание 6");

        int depositAmount2 = 15_000;
        int timeInYear = 9;
        int monthNumber3 = 0;
        int timeInMonth = timeInYear * 12;
        while (monthNumber3 <= timeInMonth) {
            depositAmount2 = depositAmount2 + depositAmount2 / 100 * 7;
            monthNumber3 = monthNumber3 + 1;
            if (monthNumber3 % 6 == 0) {
                System.out.println("Месяц " + monthNumber3 + ", сумма накоплений равна " + depositAmount2 + " рублей");
            }
        }

        System.out.println("Задание 7");
        int firstFriday = 5;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + " -е число.Необходимо подготовить отчет");
            firstFriday += 7;
        }

        System.out.println("Задание 8");
        int Year = 2024;
        for (int comet = 0; comet < Year + 100; comet += 79) {
            if (comet > Year - 200) {
                System.out.println(comet);
            }
        }
    }
}