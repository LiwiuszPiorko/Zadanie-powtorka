public class Numbers implements Comparable<Numbers> {
   private int number;
    private int sum;

    public Numbers(int number, int sum) {
        this.number = number;
        this.sum = sum;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public int compareTo(Numbers o) {
            return 0;
    }

    @Override
    public String toString() {
        return "" + number +", "+ sum +
                "";
    }
}

