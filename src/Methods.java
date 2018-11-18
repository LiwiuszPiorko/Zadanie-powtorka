import java.util.*;


public class Methods {

    public int array(int[] array) {
        ArrayList<Numbers> list = new ArrayList<>();

        if (array.length == 0) {
            throw new NoSuchElementException("Tablica jest pusta!");
        } else {
            for (int i = 0; i < array.length; i++) {
                int suma = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        suma++;
                    }
                }
                list.add(new Numbers(array[i], suma));
            }
            Comp comp = new Comp();
            Collections.sort(list, comp);
            return list.get(0).getNumber();
        }
    }
}



















