public class Main {
    public static void main(String[] args) {
        CreditCalcService service = new CreditCalcService();

        double percent = 0.0999;
        long credit = 1_000_000;
        double periodInMonths = 12;

        double payment = service.calculate(percent, credit, 12); // вызов функции
        System.out.println(String.format("%.2f", payment)); //форматирование и вывод результата
        double payment1 = service.calculate(percent, credit, 24); // вызов функции
        System.out.println(String.format("%.2f", payment1)); //форматирование и вывод результата
        double payment2 = service.calculate(percent, credit, 36); // вызов функции
        System.out.println(String.format("%.2f", payment2)); //форматирование и вывод результата
    }
}