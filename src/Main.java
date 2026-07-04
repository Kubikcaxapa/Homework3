public class Main {

    static void main(String[] args) {
        //задача 1
        int n = 500000;
        System.out.println("Значение переменной с типом int равно " + n);
        byte m = 127;
        System.out.println("Значение переменной с типом byte равно " + m);
        short v = 32676;
        System.out.println("Значение перменной с типом short равно " + v);
        long s = 12345678;
        System.out.println("Значение переменной с типом long равно " + s);
        float l = 32.6f;
        System.out.println("Значние переменной с типом float равно " + l);
        double k = 1.123456789987654321;
        System.out.println("Значение переменной с типом double равно " + k);
        //Задача 2
        float aA = 27.12F;
        long aS = 987678965549L;
        double aF = 2.786;
        short aH = 569;
        int aJ = -159;
        int aK = 27897;
        byte aL = 67;
        // Задача 3
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int LB = 480;
        double x = LB / (LP + AS + EA);
        System.out.println("на каждого ученика рассчитано " + x + " листов бумаги");
        // Задача 4
        int xX = 16;
        int xC = 2;
        int xV = 20;
        int xB = xV / xC * xX;
        System.out.println("За " + xV + " минут машина произвела " + xB + " штук бутылок");
        int xZ = 24;
        int xW = 60;
        int xY = xZ * xW / xC * xX;
        System.out.println("За " + xZ + " часа машина произвела " +  xY + " штук бутылок");
        int xM = 3;
        int xQ = xM * xZ * xW / xC * xX;
        System.out.println("За " + xM + " дней машина произвела " + xQ + " штук бутылок");
        int xO = 30; // тут непонятно за сколько мне брать 1 месяц
        int xP = xO * xZ * xW / xC * xX;
        System.out.println("За " + xO + " дней машина произвела " + xP + " штук бутылок");
        //Задача 5
        int zX = 2;
        int zC = 4;
        int zB = 120;
        int zV = zX + zC;
        int zN = zB / zV; // сколько классов
        int zM = zN * zX; // белая краска
        int zA = zC * zN; // коричневая краска
        System.out.println("В школе, где " + zN + " классов, нужно " + zM + " банок белой краски и " + zA + " банок коричневой краски.");
        // Задача 6
        int cZ = 80;
        int cX = 105;
        int cC = 100;
        int cV = 70;
        int cB = cZ * 5 + cX * 2 + cC * 2 + cV * 4;
        float cN = cB / 1000F;
        System.out.println(cB + " грамм");
        System.out.println(cN + " килограмм");
        // Задача 7
        int vZ = 7;
        int vX = 250;
        int vC = 500;
        int vV = vZ * 1000 / vX;
        int vB = vZ * 1000 / vC;
        int vN = vV + vB / 2;
        System.out.println(vV + " дней по 250 грамм в день. "
                + vB + " дней по 500 грам в день. "
                + vN + " дней в среднем." );
        // Задача 8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        double zP1 = masha * 0.1 + masha;
        double zP2 = denis * 0.1 + denis;
        double zP3 = kris * 0.1 + kris;
        int rE = masha * 12;
        double rQ = zP1 * 12;
        int rD = denis * 12;
        double rF = zP2 * 12;
        int rG = kris * 12;
        double rH = zP3 * 12;
        double rJ = rQ - rE; // разница г.д. маши
        double rK = rF - rD; // разница г.д. дениса
        double rL = rH - rG; // разница г.д. кристины
        System.out.println("Маша теперь получает " + zP1 + " рублей. Годовой доход вырос на " + rJ + " рублей");
        System.out.println("Денис теперь получает " + zP2 + " рублей. Годовой доход вырос на " + rK + " рублей");
        System.out.println("Кристина теперь получает " + zP3 + " рублей. Годовой доход вырос на " + rL + " рублей");
        ; }
}