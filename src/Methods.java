import java.util.*;


public class Methods {

    public void array(int[] array) {
        ArrayList<Numbers> lista = new ArrayList<>();
        int suma=0;

        if (array.length == 0) {
            throw new NoSuchElementException();
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                       suma++;
                    }
                }
                lista.add(new Numbers(array[i],suma));
                compareArrayElements(lista);

            }
        }
    }
    static void compareArrayElements(List<Numbers>list){

        Collections.sort(list);
        compareBySum(list);

        System.out.println(list);
    }
    static void compareBySum(List<Numbers>list){
        Collections.sort(list, new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {
              return o1.getSum().compareTo(o2.getSum());
            }
        });

    }
}


















