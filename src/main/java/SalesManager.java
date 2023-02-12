public class SalesManager {
    protected long[] sales;
    long category;
    long total;
    long average;
    long count;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public SalesManager(long category, long total, long average, long count) {
        this.category = category;
        this.total = total;
        this.average = average;
        this.count = count;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
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
