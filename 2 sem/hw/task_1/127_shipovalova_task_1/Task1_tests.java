import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task1_tests {
    @Test
    public void testDummyNode() {
        DummyNode<Integer> node = new DummyNode<>();
        assertTrue("Default node prev incorrect", node.getPrev() == node);
        assertTrue("Default node next incorrect", node.getNext() == node);

        DummyNode<Integer> a = new DummyNode<>();
        DummyNode<Integer> b = new DummyNode<>();

        node.setPrev(a);
        node.setNext(b);
        a.setNext(node);
        b.setPrev(node);

        assertTrue("Dummy prev node prev value changed", a.getPrev() == a);
        assertTrue("Dummy next node next value changed", b.getNext() == b);
        assertTrue("Dummy prev node didn't point to next node", a.getNext() == node);
        assertTrue("Dummy next node didnt point to prev node", b.getPrev() == node);
    }

    @Test
    public void testNode() {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3, a, b);
        assertTrue(c.getNext() == a);
        assertTrue(c.getPrev() == b);
        assertTrue(a.getPrev() == c);
        assertTrue(b.getNext() == c);
    }

    @Test
    public void testEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testPushBack() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertTrue("List is empty 1", !list.isEmpty());
        assertTrue("Wrong size 1", list.getSize() == 1);
        assertTrue("Wrong tail 1", ((Node<Integer>)list.getTail()).getData() == 1);
        assertTrue("Wrong head 1", ((Node<Integer>)list.getHead()).getData() == 1);
        Node<Integer> toRemove = list.pushBack(2);
        assertTrue("List is empty 2", !list.isEmpty());
        assertTrue("Wrong size 2", list.getSize() == 2);
        assertTrue("Wrong tail 2", ((Node<Integer>)list.getTail()).getData() == 2);
        assertTrue("Wrong head 2", ((Node<Integer>)list.getHead()).getData() == 1);
        list.pushBack(3);
        assertTrue("List is empty 3", !list.isEmpty());
        assertTrue("Wrong size 3", list.getSize() == 3);
        assertTrue("Wrong tail 3", ((Node<Integer>)list.getTail()).getData() == 3);
        assertTrue("Wrong head 3", ((Node<Integer>)list.getHead()).getData() == 1);
        assertTrue("Wrong element 0", ((Node<Integer>)list.get(0)).getData() == 1);
        assertTrue("Wrong element 1", ((Node<Integer>)list.get(1)).getData() == 2);
        assertTrue("Wrong element 2", ((Node<Integer>)list.get(2)).getData() == 3);

        list.remove(toRemove);
        assertTrue("List is empty 4", !list.isEmpty());
        assertTrue("Wrong size after removal", list.getSize() == 2);
        assertTrue("Wrong tail after removal", ((Node<Integer>)list.getTail()).getData() == 3);
        assertTrue("Wrong head after removal", ((Node<Integer>)list.getHead()).getData() == 1);
        assertTrue("Wrong element 0 (After removal)", ((Node<Integer>)list.get(0)).getData() == 1);
        assertTrue("Wrong element 1 (After removal)", ((Node<Integer>)list.get(1)).getData() == 3);
    }

    @Test
    public void testPushFront() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.pushFront(3);
        assertTrue("List is empty 1", !list.isEmpty());
        assertTrue("Wrong size 1", list.getSize() == 1);
        assertTrue("Wrong tail 1", ((Node<Integer>)list.getTail()).getData() == 3);
        assertTrue("Wrong head 1", ((Node<Integer>)list.getHead()).getData() == 3);

        Node<Integer> toRemove = list.pushFront(2);
        assertTrue("List is empty 2", !list.isEmpty());
        assertTrue("Wrong size 2", list.getSize() == 2);
        assertTrue("Wrong tail 2", ((Node<Integer>)list.getTail()).getData() == 3);
        assertTrue("Wrong head 2", ((Node<Integer>)list.getHead()).getData() == 2);

        list.pushFront(1);
        assertTrue("List is empty 3", !list.isEmpty());
        assertTrue("Wrong size 3", list.getSize() == 3);
        assertTrue("Wrong tail 3", ((Node<Integer>)list.getTail()).getData() == 3);
        assertTrue("Wrong head 3", ((Node<Integer>)list.getHead()).getData() == 1);
        assertTrue("Wrong element 0", ((Node<Integer>)list.get(0)).getData() == 1);
        assertTrue("Wrong element 1", ((Node<Integer>)list.get(1)).getData() == 2);
        assertTrue("Wrong element 2", ((Node<Integer>)list.get(2)).getData() == 3);

        list.remove(toRemove);
        assertTrue("List is empty after removal", !list.isEmpty());
        assertTrue("Wrong size after removal", list.getSize() == 2);
        assertTrue("Wrong tail after removal", ((Node<Integer>)list.getTail()).getData() == 3);
        assertTrue("Wrong head after removal", ((Node<Integer>)list.getHead()).getData() == 1);
        assertTrue("Wrong element 0 (After removal)", ((Node<Integer>)list.get(0)).getData() == 1);
        assertTrue("Wrong element 1 (After removal)", ((Node<Integer>)list.get(1)).getData() == 3);
    }

    @Test
    public void testInsertListAfter() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();

        list1.pushBack(1);
        list1.pushBack(2);
        list2.pushBack(3);
        list2.pushBack(4);

        list1.insertListAfter(list1.getTail(), list2);

        assertTrue("Wrong size", list1.getSize() == 4);
        assertTrue("Element 1 does not match", ((Node<Integer>)list1.get(0)).getData() == 1);
        assertTrue("Element 2 does not match", ((Node<Integer>)list1.get(1)).getData() == 2);
        assertTrue("Element 3 does not match", ((Node<Integer>)list1.get(2)).getData() == 3);
        assertTrue("Element 4 does not match", ((Node<Integer>)list1.get(3)).getData() == 4);
        assertTrue("Other list is not empty after insertion", list2.isEmpty());
    }

    @Test
    public void testInsertListBefore() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();

        list1.pushBack(1);
        list1.pushBack(2);
        list2.pushBack(3);
        list2.pushBack(4);

        list1.insertListBefore(list1.getHead(), list2);
        assertTrue("Wrong size", list1.getSize() == 4);
        assertTrue("Element 1 does not match", ((Node<Integer>)list1.get(0)).getData() == 3);
        assertTrue("Element 2 does not match", ((Node<Integer>)list1.get(1)).getData() == 4);
        assertTrue("Element 3 does not match", ((Node<Integer>)list1.get(2)).getData() == 1);
        assertTrue("Element 4 does not match", ((Node<Integer>)list1.get(3)).getData() == 2);
        assertTrue("Other list is not empty after inesrtion", list2.isEmpty());
    }

    @Test
    public void testPushPop() {
        DynamicArray<Integer> arr = new DynamicArray<>();

        assertTrue("New array is not empty?!?", arr.getSize() == 0);

        for (int i=0; i<1025; i++) {
            arr.pushBack(i);
            assertTrue("Incorrect size after inserting " + (i+1) + " elements (size is " + arr.getSize() + ")", arr.getSize()==i+1);
            assertTrue("Pushed element incorrect (arr[" + i + "] = " + arr.get(i) + ")", arr.get(i) == i);
        }

        for (int i=1024; i>=0; i--) {
            arr.popBack();
            assertTrue("Incorrect size after popping " + (1025 - i) + " elements (size is " + arr.getSize() + ")", arr.getSize() == i);
            if (i>0) assertTrue("Element incorrect after pushing (arr[" + (i-1) + "] = " + arr.get(i-1) + ")", arr.get(i-1) == i-1);
        }

        assertTrue("Array should be empty after popping", arr.getSize() == 0);
    }

    @Test
    public void testInsert() {
        DynamicArray<Integer> arr = new DynamicArray<>();

        for (int i=0; i<1024; i++) arr.pushBack(i);

        arr.insert(0, 123456);

        assertTrue("Wrong size after insertion (size == " + arr.getSize() + ")", arr.getSize() == 1025);
        assertTrue("Incorect value after insertion", arr.get(0) == 123456);

        for (int i=1; i<=1024; i++) {
            assertTrue("Element incorrect after insertion (arr[" + i + "] = " + arr.get(i) + ")", arr.get(i) == i-1);
        }
    }

    @Test
    public void testSet() {
        DynamicArray<Integer> arr = new DynamicArray<>();

        for (int i=0; i<3; i++) arr.pushBack(i);

        arr.set(0, 3);
        assertTrue("Element 0 is not 3", arr.get(0) == 3);
        assertTrue("Element 1 is not 1", arr.get(1) == 1);
        assertTrue("Element 2 is not 2", arr.get(2) == 2);
    }

    @Test
    public void testRemove() {
        DynamicArray<Integer> arr = new DynamicArray<>();

        for (int i=0; i<3; i++) arr.pushBack(i);

        arr.remove(1);
        assertTrue("Array size is not 2 after removal", arr.getSize() == 2);
        assertTrue("arr[0] != 0 after removal", arr.get(0) == 0);
        assertTrue("arr[1] != 2 after removal", arr.get(1) == 2);
    }

    @Test
    public void testResize() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        for (int i=0; i<3; i++) arr.pushBack(i);
        assertTrue("Array initial size is not 3", arr.getSize() == 3);
        arr.resize(2);
        assertTrue("Array size after resizing is not 2", arr.getSize() == 2);
        arr.resize(3);
        assertTrue("Array size after second resize is not 3", arr.getSize() == 3);
        assertTrue("Array new object is not null", arr.get(2) == null);
    }
}
