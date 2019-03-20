
public class Sorting {
    /**
     * Simple method used in Quick Sort algorithm to swap elements in array.
     * @param array array which is going to be sorted. This array can only store Integer, Double etc. objects, primitive types not allowed.
     * @param begin index of element from which swap range starts. Must be Integer type.
     * @param end index of element from which swap range ends. Must be Integer type.
     * @return
     * @author Konrad
     * @author Kręt
     */
    private static Integer partition(Object[] array, Integer begin, Integer end) {
        Object pivot = array[end];
        Integer i = (begin - 1);

        for (Integer j = begin; j < end; j++) {
            if (array[j].hashCode() <= pivot.hashCode()) {
                i++;
                Object swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        Object swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }

    /**
     * Quick Sort algorithm.
     * To call the method in code just use: Sorting.quickSort(array of elements, begin index, end index);
     * Example:
     * Integer array with values like this:
     * Integer[] tab = new Integer[6];
     * tab[0] = 10;
     * tab[1] = 9;
     * tab[2] = 8;
     * tab[3] = 7;
     * tab[4] = 6;
     * tab[5] = 12;
     * To sort tab array call the quickSort method from Sorting class:
     * Sorting.quickSort(tab,0,5);
     * Where 0 is index from which sorting starts and the 5 is index on which sorting ends.
     * @param array array which is going to be sorted. This array can only store Integer, Double etc. objects, primitive types not allowed.
     * @param begin index of element from which sorting range starts. Must be Integer type.
     * @param end index of element from which sorting range ends. Must be Integer type.
     * @author Konrad
     * @author Kręt
     */
    public static void quickSort(Object[] array, Integer begin, Integer end) {
        if (begin < end) {
            Integer partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }
}

