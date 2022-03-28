import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void quickSort_UnsortedArray(){
        try {
            Integer[] arr = new Integer[]{2,1};
            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1, 2}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void quickSort_Unsorted_GetSortedArray(){
        try {
            Integer[] arr = new Integer[]{6, 1,5,1};
            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,1,5,6}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void quickSort_UnsortedArray_GetSortedArray(){
        try {
            Integer[] arr = new Integer[]{2,9,2,4,3};
            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{2,2,3,4,9}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_GetSortedArray(){
        try {
            Integer[] arr = new Integer[]{2,1};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1, 2}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_GetSortedOnlyFirstElements(){
        try {
            Integer[] arr = new Integer[]{2,1,2,3};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1, 2,2,3}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray1(){
        try {
            Integer[] arr = new Integer[]{3,2,6,2};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{2, 2,3,6}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray2(){
        try {
            Integer[] arr = new Integer[]{10,5,0,5};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0, 5,5,10}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray3(){
        try {
            Integer[] arr = new Integer[]{1,1,6,7,7,6,1,7};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,1,1,6,6,7,7,7}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_ArrayContainsTwoNumbers(){
        try {
            Integer[] arr = new Integer[]{1,1};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,1}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_SortedArrayLengthTwo(){
        try {
            Integer[] arr = new Integer[]{1,2};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,2}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_SortedArrayLengthThree(){
        try {
            Integer[] arr = new Integer[]{1,2,3};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,2,3}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_UnsortedArray1(){
        try {
            Integer[] arr = new Integer[]{8,3,5,4,3,8};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{3,3,4,5,8,8}, arr);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_UnsortedArray2(){
        try {
            Integer[] arr = new Integer[]{79,78,75,76,75,76,80,77,78,75,82,80};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{75,75,75,76,76,77,78,78,79,80,80,82}, arr);
        }catch (Exception e){
            fail();
        }
    }
}
