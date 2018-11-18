import java.util.Comparator;

public class Comp implements Comparator<Numbers> {
    @Override
    public int compare(Numbers o1, Numbers o2) {
        if (o1.getSum() == o2.getSum()) {
            if (o1.getNumber() > o2.getNumber()) {
                return 1;
            } else {
                return -1;
            }
        } else if (o1.getSum() > o2.getSum()) {
            return -1;
        } else {
            return 1;
        }

    }
}

