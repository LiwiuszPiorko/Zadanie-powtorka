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
            }
        }
    }
    static void compareArrayElements(List<Numbers>list){

        Collections.sort(list);
    }
}


















