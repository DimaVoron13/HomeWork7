public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int amountOfSavings = 2_459_000;
        int cashPerMonth = 15_000;
        int total = 0;
        int monthNumber = 1;
        while (total < amountOfSavings) {
            total += cashPerMonth;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
            monthNumber++;
            if (total >= amountOfSavings) {
                break;
            }
        }

        System.out.println("Задание 2");

        int forward = 1;
        while (forward <= 10) {
            System.out.print(forward + " ");
            forward += 1;
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
            totalPeople += (totalPeople / 1000 * (birthRateInYear - mortalityInYear));
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople + " человек");
        }

        System.out.println("Задание 4");

        float depositAmount = 15_000f;
        int needCash = 12_000_000;
        int initialMonth = 0;
        float bankPercent = 0.07f;
        while (depositAmount < needCash) {
            initialMonth++;
            depositAmount *= (1 + bankPercent);
            System.out.printf("Месяц %d. Сумма накоплений равна %,.2f.%n", initialMonth, depositAmount);
        }

        System.out.println("Задание 5");

        float initialAmount = 15_000f;
        int initialCash = 12_000_000;
        int finalMonth = 0;
        float bankSecondPercent = 0.07f;
        while (initialAmount < initialCash) {
            finalMonth++;
            initialAmount *= (1 + bankSecondPercent);
            if (finalMonth % 6 == 0) {
                System.out.printf("Месяц %d. Сумма накоплений равна %,.2f.%n", finalMonth, initialAmount);
            }
        }

        System.out.println("Задание 6");

        float finalAmount = 15_000f;
        int timeInYear = 9;
        int monthNumberAgain = 0;
        int timeInMonth = timeInYear * 12;
        float percentToNineYears = 0.07f;
        while (monthNumberAgain <= timeInMonth) {
            monthNumberAgain++;
            finalAmount *= (1 + percentToNineYears);
            if (monthNumberAgain % 6 == 0) {
                System.out.printf("Месяц %d. Сумма накоплений равна %,.2f.%n", monthNumberAgain, finalAmount);
            }
        }

        System.out.println("Задание 7");
        int firstFriday = 5;
        final int DAYS_IN_WEEK = 7;
        final int DAYS_IN_MONTH = 31;
        while (firstFriday <= DAYS_IN_MONTH) {
            System.out.println("Сегодня пятница, " + firstFriday + " -е число.Необходимо подготовить отчет");
            firstFriday += DAYS_IN_WEEK;
        }

        System.out.println("Задание 8");
        int year = 2024;
        final int CYCLE_PERIOD = 79;
        final int START_YEAR = 200;
        final int END_YEAR = 100;
        int beginning = year - START_YEAR;
        int ending = year + END_YEAR;
        for (int comet = beginning; comet < ending; comet++) {
            if (comet % CYCLE_PERIOD == 0) {
                System.out.println(comet);
            }
        }
    }
}