import org.junit.*;

public class Task1_tests extends Assert {

    @Test
    public void pushFront_ToEmptyList_False() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        assertFalse(list.isEmpty());
    }

    @Test
    public void pushFront_ToEmptyList_Error() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        try {
            list.get(1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void PushFrontThreeItems() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(5);
        assertEquals(3, ((Node<Integer>)list.get(1)).getData().intValue());
    }


    @Test
    public void pushItems_TailEnd() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(6);
        list.pushFront(5);
        list.pushFront(4);
        assertEquals(4, ((Node<Integer>)list.getTail()).getData().intValue());
    }

    @Test
    public void pushFrontThreeItems_H() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        assertEquals(2, ((Node<Integer>)list.getHead()).getData().intValue());
    }
    @Test
    public void pushBack_SecondItem() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        assertEquals(4, ((Node<Integer>)list.get(1)).getData().intValue());
    }


    @Test
    public void removeItem_RemoveFirstItem_SizeIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(9);
        list.pushFront(8);
        list.pushFront(7);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }

    @Test
    public void removeFirstItem() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.remove(list.get(0));
        assertEquals(3, ((Node<Integer>)list.get(0)).getData().intValue());
    }
    @Test
    public void insertListAfter_FirstItem_Size() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(3);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }

    @Test
    public void insertList_AfterFirstItem() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(0), list2);

        assertEquals(1, ((Node<Integer>)list1.get(0)).getData().intValue());
        assertEquals(4, ((Node<Integer>)list1.get(1)).getData().intValue());
        assertEquals(5, ((Node<Integer>)list1.get(2)).getData().intValue());
        assertEquals(6, ((Node<Integer>)list1.get(3)).getData().intValue());
        assertEquals(2, ((Node<Integer>)list1.get(4)).getData().intValue());
        assertEquals(3, ((Node<Integer>)list1.get(5)).getData().intValue());
    }

    @Test
    public void insertListBefore_FirstItem_Size() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }

    @Test
    public void insertList_BeforeFirstItem() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListBefore(list1.get(0), list2);

        assertEquals(4, ((Node<Integer>)list1.get(0)).getData().intValue());
        assertEquals(5, ((Node<Integer>)list1.get(1)).getData().intValue());
        assertEquals(6, ((Node<Integer>)list1.get(2)).getData().intValue());
        assertEquals(1, ((Node<Integer>)list1.get(3)).getData().intValue());
        assertEquals(2, ((Node<Integer>)list1.get(4)).getData().intValue());
        assertEquals(3, ((Node<Integer>)list1.get(5)).getData().intValue());
    }

    @Test
    public void createArray_DefaultSize() {
        DynamicArray<Integer> array = new DynamicArray<>();

        assertEquals(1024, array.getSize());
    }

    @Test
    public void createArray_toSetValue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.set(10, 1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }

    @Test
    public void createArray_toGetValue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.get(10);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }



    @Test
    public void SetThreeValues_Correct() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 0);
        array.set(1, 1);
        array.set(2, 2);
        assertEquals(0, array.get(0).intValue());
        assertEquals(1, array.get(1).intValue());
        assertEquals(2, array.get(2).intValue());
    }

    @Test
    public void insert_toInsertValue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.insert(10, 1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }

    @Test
    public void resize_Array_NewSize() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(10);

            array.resize(20);
            assertEquals(20, array.getSize());

            array.resize(10);
            assertEquals(10, array.getSize());
        } catch (Exception e) {
            fail();
        }
    }


    @Test
    public void insert_InsertValues_() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(10);
            array.set(0, 0);
            array.set(1, 1);
            array.set(2, 2);
            array.insert(1, 5);

            assertEquals(0, array.get(0).intValue());
            assertEquals(5, array.get(1).intValue());
            assertEquals(1, array.get(2).intValue());
            assertEquals(2, array.get(3).intValue());
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void pushBack_CorrectValues() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.pushBack(5);

        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(5, array.get(10).intValue());
    }

    @Test
    public void popBackFromEmptyArray_Unsupported() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(0);
            array.popBack();
            fail();
        } catch (Exception e) {
            assertEquals("Array is empty", e.getMessage());
        }
    }

    @Test
    public void removeIndexOutOfBounds() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(3);
            array.set(0, 1);
            array.set(1, 2);
            array.set(2, 3);
            array.remove(3);
            fail();
        } catch (Exception e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }
}