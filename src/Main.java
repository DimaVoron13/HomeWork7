public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int amountOfSavings = 2_459_000;
        int cashPerMonth = 15_000;
        int total = 0;
        int monthNumber = 0;
        while (total < amountOfSavings) {
            total = total += cashPerMonth;
            monthNumber = monthNumber += 1;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 2");

        int forward = 1;
        while (forward <= 10) {
            System.out.print(forward + " ");
            forward = forward += 1;
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
            totalPeople = totalPeople += (totalPeople /= 1000 * (birthRateInYear -= mortalityInYear));
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople + " человек");
        }

        System.out.println("Задание 4");

        int depositAmount = 15_000;
        int needCash = 12_000_000;
        int initialMonth = 0;
        while (depositAmount < needCash) {
            depositAmount = depositAmount += depositAmount /= 100 * 7;
            initialMonth = initialMonth += 1;
            System.out.println("Месяц " + initialMonth + ", сумма накоплений равна " + depositAmount + " рублей");
        }

        System.out.println("Задание 5");

        int initialAmount = 15_000;
        int initialCash = 12_000_000;
        int finalMonth = 0;
        while (initialAmount < initialCash) {
            initialAmount = initialAmount += initialAmount /= 100 * 7;
            finalMonth = finalMonth + 1;
            if (finalMonth % 6 == 0) {
                System.out.println("Месяц " + finalMonth + ", сумма накоплений равна " + initialAmount + " рублей");
            }
        }

        System.out.println("Задание 6");

        int finalAmount = 15_000;
        int timeInYear = 9;
        int monthNumberAgain = 0;
        int timeInMonth = timeInYear *= 12;
        while (monthNumberAgain <= timeInMonth) {
            finalAmount = finalAmount += finalAmount /= 100 * 7;
            monthNumberAgain = monthNumberAgain + 1;
            if (monthNumberAgain % 6 == 0) {
                System.out.println("Месяц " + monthNumberAgain + ", сумма накоплений равна " + finalAmount + " рублей");
            }
        }

        System.out.println("Задание 7");
        int firstFriday = 5;
        int week = 7;
        int month = 31;
        while (firstFriday <= month) {
            System.out.println("Сегодня пятница, " + firstFriday + " -е число.Необходимо подготовить отчет");
            firstFriday += week;
        }

        System.out.println("Задание 8");
        int year = 2024;
        int oneFlyComet = 79;
        for (int comet = 0; comet < year + 100; comet += oneFlyComet) {
            if (comet > year - 200) {
                System.out.println(comet);
            }
        }
    }
}