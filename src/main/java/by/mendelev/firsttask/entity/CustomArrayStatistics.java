package by.mendelev.firsttask.entity;

public class CustomArrayStatistics {
    private int max;
    private int min;
    private double average;

    public CustomArrayStatistics(int min, int max, double average) {
        this.max = max;
        this.min = min;
        this.average = average;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayStatistics that = (CustomArrayStatistics) o;

        if (max != that.max) return false;
        if (min != that.min) return false;
        return Double.compare(that.average, average) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = max;
        result = 31 * result + min;
        temp = Double.doubleToLongBits(average);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArrayStatistics{");
        sb.append("max=").append(max);
        sb.append(", min=").append(min);
        sb.append(", average=").append(average);
        sb.append('}');
        return sb.toString();
    }

}
