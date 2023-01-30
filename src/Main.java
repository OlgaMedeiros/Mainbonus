public class Main {
    public static void main(String[] args) {

        int x1 =100; // на счету клиента
        int add = 1400; // пополнение счета

        int bonus;
        if (add > 1000){
            bonus = add / 100; // 1 бонус за каждые 100р при пополнении более чем на 1000р
        } else {
            bonus = 0;
        }
        System.out.println("Всего на счете:");
        int sum = x1 + add + bonus; // Итоговая сумма на счете
        System.out.println((sum) + ("руб."));
        System.out.println((bonus) + (" руб. в том числе бонусы"));

    }
}