public class Main {
    public static void main(String[] args) {

        long[] sales = new long[]{5, 20, 40, 10};

        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();
        long min = salesManager.min();
        long average = salesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println("Средний показатель равен: " + average);

    }

}
