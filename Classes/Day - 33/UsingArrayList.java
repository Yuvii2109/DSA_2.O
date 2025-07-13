import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // ===== Creation / Adding =====
        al.add(23); // add(E e)
        al.add(21);
        al.add(16); 
        al.add(null); // null is allowed
        System.out.println("After add - " + al);

        al.add(1, 99); // add(index, E element)
        System.out.println("After add at 1 - " + al);

        List<Integer> more = Arrays.asList(7, 8, 9);
        al.addAll(more); // addAll(Collection<? extends E> c)
        System.out.println("After addAll - " + al);

        al.addAll(2, Arrays.asList(100, 200)); 
        // addAll(index, Collection)
        System.out.println("After addAll at 2 - " + al);

        // ===== Reading =====
        System.out.println("get(1) - " + al.get(1)); 
        System.out.println("first element - " + al.get(0));
        System.out.println("last element - " + al.get(al.size() - 1));
        System.out.println("contains 21? " + al.contains(21)); // contains(Object o)
        System.out.println("indexOf 21 - " + al.indexOf(21)); // indexOf(Object o)
        System.out.println("lastIndexOf null - " + al.lastIndexOf(null));

        // ===== Updating =====
        al.set(2, 16); // set(index, E element)
        System.out.println("After set at 2 - " + al);

        al.replaceAll(i -> (i == null ? null : i * 2)); // replaceAll(UnaryOperator)
        System.out.println("After replaceAll (×2) - " + al);

        // ===== Iteration =====
        System.out.print("Iteration with Iterator - ");
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Iteration with for-each - ");
        for(Integer x : al) System.out.print(x + " ");
        System.out.println();

        System.out.print("ListIterator backwards - ");
        ListIterator<Integer> lit = al.listIterator(al.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // ===== Removing =====
        al.remove((Integer) null); // remove(Object o)
        System.out.println("After remove(null) - " + al);

        al.remove(0); // remove(index)
        System.out.println("After remove(0) - " + al);

        al.removeAll(Arrays.asList(16, 18)); 
        // removeAll(Collection<?> c)
        System.out.println("After removeAll [16,18] - " + al);

        // Conditional remove
        al.removeIf(new Predicate<Integer>() { 
            // removeIf(Predicate<? super E>)
            @Override public boolean test(Integer i) {
                return i != null && i % 4 == 0;
            }
        });
        System.out.println("After removeIf divisible by 4 - " + al);

        // ===== Bulk and utility =====
        System.out.println("isEmpty? " + al.isEmpty()); // isEmpty()
        System.out.println("size - " + al.size()); // size()

        Integer[] arr = al.toArray(new Integer[0]); // toArray(T[] a)
        // No value in the ArrayList should be null while undergoing this step
        System.out.println("toArray - " + Arrays.toString(arr));

        al.trimToSize(); // trimToSize()
        al.ensureCapacity(20);                                 // ensureCapacity(int)

        al.sort(Collections.reverseOrder()); // sort(Comparator)
        System.out.println("After sort (reverse) - " + al);

        List<Integer> sub = al.subList(1, 3);                  // subList(from, to)
        System.out.println("subList(1,3) - " + sub);

        al.clear(); // clear()
        System.out.println("After clear - " + al);
        System.out.println("isEmpty after clear? " + al.isEmpty());
    }
}