public class SalesManager {
    protected int[] sales;
    int total;
    int category;
    int average;
    int count;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public SalesManager(int total, int category, int average, int count) {
        this.total = total;
        this.category = category;
        this.average = average;
        this.count = count;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public void counter() {
        total = total + category;
        count++;
        average = total / 9;
        System.out.println("Средний показатель равен: " + average);
    }

}
