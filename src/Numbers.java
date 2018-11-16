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
        if (this.number > o.number)
            return 1;
        else if (this.number == o.number)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return ""+number+"";
    }
}

