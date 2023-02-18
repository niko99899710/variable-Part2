public class Main {
    public static void main (String[] args) {
        byte cannon = 99;
        System.out.println("Подушек " + cannon + " штук ");
        short bed = 150;
        System.out.println("Кроватей " + bed + " штук ");
        int burger = 3;
        System.out.println("Бургеров " + burger + " штуки ");
        long allCoffee = 84654L;
        System.out.println("Все кофе " + allCoffee + " мое ");

        float a = 27.12F;
        System.out.println("А = " + a);
        long b = 987678965549L;
        System.out.println("Б = " + b);
        float c = 2.786F;
        System.out.println("В = " + c);
        short d = 569;
        System.out.println("Г = " + d);
        short e = -159;
        System.out.println("Д = " + e);
        short f = 27897;
        System.out.println("Е = " + f);
        byte g = 67;
        System.out.println("Ж = " + g);

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short allPaper = 480;
        byte students = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("Количество учеников = " + students);
        short paper = (short) (allPaper / 80);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги ");

        byte nBottle = 16;
        byte m = 2;
        byte minute = (byte) (nBottle / m);
        System.out.println("За 1 минуту машина произвела " + minute + " штук бутылок ");
        byte i = 20;
        short n = (short) (i * minute);
        System.out.println("За 20 минут машина произвела " + n + " штук бутылок ");
        byte day = 24;
        short days = (short) (day * 480);
        System.out.println("За сутки машина произвела " + days + " штук бутылок ");
        byte moment = 3;
        int moments = (int) (days * 3);
        System.out.println("За трое суток машина произвела " + moments + " штук бутылок ");
        byte month = 30;
        int months = (int) (days * month);
        System.out.println("За месяц машина произвела " + months + " штук бутылок ");

        byte color = 120;
        byte brown = 4;
        byte white = 2;
        byte room = (byte) (brown + white);
        System.out.println("на 1 класс будет потраченно " + room + " банок краски ");
        byte classroom = (byte) (color / room);
        System.out.println("Всего " + classroom + " классов в школе ");
        byte browns = (byte) (classroom * 4);
        byte whites = (byte) (classroom * 2);
        System.out.println("В школе, где " + classroom + " классов, нужно " + whites + " банок белой краски и " + browns + " банок коричневой краски ");

        short banana = 400;
        short milk = 210;
        short ice = 200;
        short age = 280;
        short kilogram = 1000;
        short product = (short) (banana + milk + ice + age);
        float productKilogram = (float) (product / kilogram);
        System.out.println("Вес спортзавтрака в грамммах = " + product + " а вес в килограммах = " + productKilogram);

        short sportsman = 7000;
        short oneWeight = 250;
        short twoWieght = 500;
        byte one = (byte) (sportsman / oneWeight);
        byte two = (byte) (one / 2);
        System.out.println(one + "  дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм и " + two + " если каждый день будет худеть на 500 грамм");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        short oneMasha = (short) ((masha * 10) / 100);
        short oneDenis = (short) ((denis * 10) / 100);
        short oneKristina = (short) ((kristina * 10) / 100);
        int twoMasha = (int) (masha + oneMasha);
        int twoDenis = (int) (denis + oneDenis);
        int twoKristina = (int) (kristina + oneKristina);
        int threeMasha = (int) (twoMasha * 12);
        int threeDenis = (int) (twoDenis * 12);
        int threeKristina = (int) (twoKristina * 12);
        System.out.println("ЗП сотрудников за год после повышения на 10 %. Маша = " + threeMasha + " Денис = " + threeDenis + " Кристина = " + threeKristina);
        int forMasha = (int) (threeMasha - (masha * 12));
        int forDenis = (int) (threeDenis - (denis * 12));
        int forKristina = (int) (threeKristina - (kristina * 12));
        System.out.println("Годовой доход вырос у Маши = " + forMasha + " у Дениса = " + forDenis + " у Кристины = " + forKristina + "руб.");












    }
}
