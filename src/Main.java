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
    public static void task1 () {
        System.out.println("Задача 1");
        int q = 2000000;
        byte w = 125;
        short e = 27500;
        long r = 99_999_999_999L;
        float t = 1.123f;
        double y = 1.2131111111;
        System.out.println("Значение переменной q с типом int равно " + q);
        System.out.println("Значение переменной w с типом byte равно " + w);
        System.out.println("Значение переменной e с типом short равно " + e);
        System.out.println("Значение переменной r с типом long равно " + r);
        System.out.println("Значение переменной t с типом float равно " + t);
        System.out.println("Значение переменной y с типом double равно " + y);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549l;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte Lud = 23;
        byte Anna = 27;
        byte Kate = 30;
        short paper = 480;
        int calculated = paper / (Lud + Anna + Kate);
        System.out.println("На каждого ученика рассчитано " + calculated + " листов бумаги");

    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte minute = 2;
        float bottle2 = bottle / minute;
        System.out.println(bottle2);
        byte twenty = 20;
        short minute2 = (short) (bottle2 * twenty);
        System.out.println("За " + twenty + " минут машина произвела " + minute2 + " штук бутылок");
        byte day1 = 1;
        short day = 24 * 60;
        short bottleDay = (short) (day * bottle2);
        System.out.println("За " + day1 + " день машина произвела " + bottleDay + " штук бутылок");
        byte days3 = 3;
        short minute3Day = 24 * 3 * 60;
        int bottle3Day = (int) (minute3Day * bottle2);
        System.out.println("За " + days3 + " дня машина произвела " + bottle3Day + " штук бутылок");
        byte month = 1;
        int minuteMonth = 30 * 24 * 60;
        int bottleMonth = (int) (minuteMonth * bottle2);
        System.out.println("За " + month + "  месяц машина произвела " + bottleMonth + " штук бутылок");
    }

        public static void task5 () {
            System.out.println("Задача 5");
        byte color = 120;
        byte white = 2;
        byte brown = 4;
        int totalClass = 120 / (white + brown);
        int totalWhite = totalClass * 2;
        int totalBrown = totalClass * 4;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");


        }

    public static void task6 () {
        System.out.println("Задача 6");
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceWeight = 2 * 100;
        short eggWeight = 4 * 70;
        int totalWeight = bananaWeight + milkWeight + iceWeight + eggWeight;
        System.out.println(totalWeight);
        int grPerKg = 1000;
        float weightKg = totalWeight / (float)  grPerKg;
        System.out.println(weightKg);
    }


    public static void task7 () {
        System.out.println("Задача 7");
        short grPerKg = 7 * 1000;
        short gr250 = 250;
        short gr500 = 500;
        int daysGr250 = grPerKg / gr250;
        int daysGr500 = grPerKg / gr500;
        int totalDays = (daysGr500 + daysGr250) / 2;
        System.out.println(daysGr250);
        System.out.println(daysGr500);
        System.out.println(totalDays);
    }


    public static void task8 () {
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int payMasha = (Masha * 10 / 100);
        int payDenis = Denis * 10 / 100;
        int payKristina = Kristina * 10 / 100;
        int salaryMasha = Masha + payMasha;
        int salaryDenis = Denis + payDenis;
        int salaryKristina = Kristina + payKristina;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + payMasha + " рублей" );
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + payDenis + " рублей" );
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + payKristina + " рублей" );
    }
}