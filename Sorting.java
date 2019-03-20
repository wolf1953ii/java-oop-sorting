
public class Sorting
{
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
     * @param array Array which is going to be sorted. This array can only store Integer, Double etc. objects, primitive types not allowed.
     * @param begin Index of element from which sorting range starts. Must be Integer type.
     * @param end Index of element from which sorting range ends. Must be Integer type.
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

    /**
     * @author Konrad
     * @author Kręt
     * Method used to get the size of objects array given as a parameter.
     * @param array An array of objects which size is needed. This array can only store Integer, Double etc. objects, primitive types not allowed.
     * @return Return Integer object which value is a size of objects array.
     */

    private static Integer getSize(Object[] array)
    {
        Integer size = 0;
        for(Object e : array)
        {
            size++;
        }
        return size;
    }

    /**
     * @author Konrad
     * @author Kręt
     * Bubble Sort algorithm.
     * To call the method in code just use: Sorting.bubbleSort(array of elements);
     * @param array Array which is going to be sorted. This array can only store Integer, Double etc. objects, primitive types not allowed.
     */
    public static void bubbleSort(Object[] array)
    {
        Integer size = getSize(array);
        Boolean swapped;

        for(Integer i = 0; i < size -1; i++)
        {
            swapped = false;
            for(Integer j = 0; j < size - i - 1; j++)
            {
                if(array[j].hashCode() > array[j+1].hashCode())
                {
                    Object swapTemp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swapTemp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }

    /**
     * @author Konrad
     * @author Kręt
     * Insertion sort algorithm.
     * @param array Array which is going to be sorted. This array can only store Integer, Double etc. objects, primitive types not allowed.
     */
    public static void insertionSort(Object[] array)
    {
        Integer size = getSize(array);
        for(Integer i = 1; i < size; ++i)
        {
            Object key = array[i];
            Integer j = i - 1;

            while(j >= 0 && array[j].hashCode() > key.hashCode())
            {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
    }
}

