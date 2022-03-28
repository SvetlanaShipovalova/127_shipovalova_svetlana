import org.junit.*;

public class Task2_Tests extends Assert{
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void bubbleSort_ContainsOnlyNumbers(){
        try {
            BubbleSort<Integer> bubbleSort = new BubbleSort<>();
            Integer[] arr = {3, 3, 3};
            bubbleSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{3, 3, 3}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void bubbleSort_TheBiggestElement(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {8, 5, 4, 9};
        bubbleSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{4, 5, 8, 9}, arr);
    }

    @Test
    public void bubbleSort_InvertedArray_GetSortedArray(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {33, 24, 15};
        bubbleSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{15, 24, 33}, arr);
    }

    @Test
    public void bubbleSort_UnsortedArray(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {8,16,3,1};
        bubbleSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1, 3, 8, 16}, arr);
    }

    @Test
    public void selectionSort_InvertedArray(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arr = {2, 1};
        selectionSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    public void selectionSort_UnsortedArray(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arr = {4, 3, 44, 1};
        selectionSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1, 3, 4, 44}, arr);
    }

    @Test
    public void insertionSort_ContainsOnlyNumbers(){
        try {
            InsertionSort<Integer> insertionSort = new InsertionSort<>();
            Integer[] arr = {5, 5};
            insertionSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{5, 5}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void insertionSort_SortedArray_ArrayHasNotChanged(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] arr = {1,2};
        insertionSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1,2}, arr);
    }
}
