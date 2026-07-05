public class Main {

    public static void main(String[] args) {
        //ЗАДАНИЕ 1
        int integerVar = 500000;
        byte byteVar = 127;
        short shortVar = 32676;
        long longVar = 12345678L;
        float floatVar = 32.6f;
        double doubleVar = 1.1234567899876543;
        System.out.println("Значение переменной с типом int равно " + integerVar);
        System.out.println("Значение переменной с типом byte равно " + byteVar);
        System.out.println("Значение переменной с типом short равно " + shortVar);
        System.out.println("Значение переменной с типом long равно " + longVar);
        System.out.println("Значение переменной с типом float равно " + floatVar);
        System.out.println("Значение переменной с типом double равно " + doubleVar);
        //ЗАДАНИЕ 2
        float valueFloat = 27.12F;
        long valueLong = 987678965549L;
        double valueDouble = 2.786;
        short valueShort = 569;
        int valueIntNegative = -159;
        int valueIntPositive = 27897;
        byte valueByte = 67;
        //ЗАДАНИЕ 3
        int ludmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalPaperSheets = 480;
        int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        int sheetsPerStudent = totalPaperSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
        //ЗАДАНИЕ 4
        int bottlesPerTwoMin = 16;
        int periodMin = 2;
        int productionPerMin = bottlesPerTwoMin / periodMin;
        int time20Min = 20;
        int bottlesIn20Min = productionPerMin * time20Min;
        System.out.println("За " + time20Min + " минут машина произвела " + bottlesIn20Min + " штук бутылок");
        int time24HoursInMin = 24 * 60;
        int bottlesInDay = productionPerMin * time24HoursInMin;
        System.out.println("За 1 день машина произвела " + bottlesInDay + " штук бутылок");
        int time3DaysInMin = 3 * time24HoursInMin;
        int bottlesIn3Days = productionPerMin * time3DaysInMin;
        System.out.println("За 3 дней машина произвела " + bottlesIn3Days + " штук бутылок");
        int time30DaysInMin = 30 * time24HoursInMin;
        int bottlesInMonth = productionPerMin * time30DaysInMin;
        System.out.println("За 30 дней машина произвела " + bottlesInMonth + " штук бутылок");
        // ЗАДАНИЕ 5
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalCansPurchased = 120;
        int totalCansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClasses = totalCansPurchased / totalCansPerClass;
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
        //ЗАДАНИЕ 6
        int bananasWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 100 * 2;
        int eggsWeight = 70 * 4;
        int totalBreakfastWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalBreakfastWeightKilos = totalBreakfastWeightGrams / 1000f;
        System.out.println("Общий вес спортзавтрака: " + totalBreakfastWeightGrams + " грамм");
        System.out.println("Общий вес спортзавтрака в килограммах: " + totalBreakfastWeightKilos + " кг");
        //ЗАДАНИЕ 7
        int totalWeightToLoseKg = 7;
        int totalWeightToLoseGrams = totalWeightToLoseKg * 1000;
        int dietLowLossGrams = 250;
        int dietHighLossGrams = 500;
        int daysWithLowLoss = totalWeightToLoseGrams / dietLowLossGrams;
        int daysWithHighLoss = totalWeightToLoseGrams / dietHighLossGrams;
        int averageDays = (daysWithLowLoss + daysWithHighLoss) / 2;
        System.out.println("Дней для похудения, если терять по 250г: " + daysWithLowLoss);
        System.out.println("Дней для похудения, если терять по 500г: " + daysWithHighLoss);
        System.out.println("В среднем понадобится дней: " + averageDays);
        //ЗАДАНИЕ 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mashaNewSalary = mashaSalary * 1.1;
        double denisNewSalary = denisSalary * 1.1;
        double kristinaNewSalary = kristinaSalary * 1.1;
        double mashaAnnualDifference = (mashaNewSalary - mashaSalary) * 12;
        double denisAnnualDifference = (denisNewSalary - denisSalary) * 12;
        double kristinaAnnualDifference = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей");
    }
}
