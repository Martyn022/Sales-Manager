public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
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

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        int total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return (total - (min() + max())) / (sales.length - 2);
    }

}
