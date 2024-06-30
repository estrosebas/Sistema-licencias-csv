/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaGenerica;

import java.util.Comparator;

/**
 *
 * @author Sebas
 */
public class MergeSort<T> {

    private Comparator<T> comparator;

    public MergeSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public Nodo<T> mergeSort(Nodo<T> head) {
        if (head == null || head.getSiguiente() == null) {
            return head;
        }

        Nodo<T> middle = getMiddle(head);
        Nodo<T> nextOfMiddle = middle.getSiguiente();
        middle.setSiguiente(null);

        Nodo<T> left = mergeSort(head);
        Nodo<T> right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    private Nodo<T> merge(Nodo<T> left, Nodo<T> right) {
        Nodo<T> result;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (comparator.compare(left.getData(), right.getData()) <= 0) {
            result = left;
            result.setSiguiente(merge(left.getSiguiente(), right));
        } else {
            result = right;
            result.setSiguiente(merge(left, right.getSiguiente()));
        }

        return result;
    }

    private Nodo<T> getMiddle(Nodo<T> head) {
        if (head == null) {
            return head;
        }

        Nodo<T> slow = head;
        Nodo<T> fast = head.getSiguiente();

        while (fast != null) {
            fast = fast.getSiguiente();
            if (fast != null) {
                slow = slow.getSiguiente();
                fast = fast.getSiguiente();
            }
        }

        return slow;
    }
}