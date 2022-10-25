public class SortArray {

    /**
     * Bubble sorting of array
     * @param array with positive/negative ints
     * @return sorted array
     */
    public static int [] bubbleSortArray(int[] array) {
        int tmp;

        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }

            return array;
        }

        return new int[]{};
    }

    /**
     * Bubble sorting of array in descending order
     * @param array of numbers
     * @return sorted array
     */
    public static int [] bubbleSortArrayReverse(int[] array) {
        if (array != null || array.length >0) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        return array;
    }
    /**
     * Selecting sorting of array
     * @param array of ints
     * @return sorted array
     */
    public static int [] sortArray(int[] array) {

        if (array != null || array.length >0) {

            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minId = i;

                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }
                // replacing
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }
        }

        return array;
    }

}
