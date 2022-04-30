import org.junit.*;

public class SimpleBinarySearchTreeTests extends Assert {
    class Comparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void creation_NewTree_SizeEqualsZero() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        assertEquals(0, tree.size());
    }
    @Test
    public void min_InsertAscendingThreeItems_ReturnMin() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        assertEquals(2, tree.min().intValue());
    }
    @Test
    public void min_InsertDescendingThreeItems_ReturnMin() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(6);
        tree.insert(4);
        tree.insert(2);
        assertEquals(2, tree.min().intValue());
    }
    @Test
    public void min_InsertUnorderedFourItems_ReturnMin() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(8);
        assertEquals(2, tree.min().intValue());
    }
    @Test
    public void getOrderedItems_InsertUnorderedFourItems_ReturnCorrectOrder() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(8);
        assertArrayEquals(new Integer[] {2, 4, 6, 8}, tree.getOrderedItems().toArray());
    }

    @Test
    public void delete_DeleteOnlyOneElement_TreeIsEmpty() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(4);
        tree.delete(4);
        assertArrayEquals(new Integer[] {}, tree.getOrderedItems().toArray());
        assertEquals(true, tree.isEmpty());
    }
    @Test
    public void delete_DeleteHalfElements_TreeStructureIsCorrect() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(4);
        tree.insert(1);
        tree.insert(5);
        tree.insert(8);
        tree.insert(0);
        tree.insert(-1);

        tree.delete(4);
        tree.delete(8);
        tree.delete(0);

        assertArrayEquals(new Integer[] {-1, 1, 5}, tree.getOrderedItems().toArray());
        assertEquals(3, tree.size());
    }
    @Test
    public void delete_DeleteHalfElements_TreeStructureIsCorrec() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert (96);
        tree.insert (96);
        tree.insert (52);
        tree.insert (10);
        tree.insert (80);
        tree.insert (46);
        tree.insert (43);
        tree.insert (38);
        tree.insert (57);
        tree.insert (78);
        tree.insert (26);
        tree.insert (9);
        tree.delete (52);
        tree.delete (43);
        tree.delete (96);
        tree.insert (64);
        tree.insert (29);
        tree.insert (88);
        tree.delete (46);
        tree.delete (80);
        tree.insert (30);
        tree.insert (27);
        tree.insert (68);
        tree.delete (64);
        tree.delete (29);
        tree.delete (88);
        tree.delete (26);
        tree.delete (9);

        System.out.println();
    }
}
