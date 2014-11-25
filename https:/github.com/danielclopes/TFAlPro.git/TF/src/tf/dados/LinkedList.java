package tf.dados;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements ListTAD<E> {
	private class Node<E> {
		public E element;
		public Node<E> next;

		public Node(E e) {
			element = e;
			next = null;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	private int count;

	@Override
	public void add(E e) {
		Node<E> newNode = new Node<E>(e);
		Node<E> t = tail;
		tail = newNode;
		count++;
		if (t == null)
			head = newNode;
		else
			t.next = newNode;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E set(int index, E element) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean remove(E e) {
		// Se a lista for vazia
		if (head == null) {
			return (false);
		}
		// Se for o primeiro da lista
		if (e.equals(head.element)) {
			if (tail == head) {
				tail = null;
			}
			head = head.next;
			count--;
			return (true);
		}
		// Procura o elemento a ser removido
		Node<E> ant = head;
		Node<E> aux = head.next;
		while (aux != null) {
			if (aux.element.equals(e)) {
				if (aux == tail) {
					tail = ant;
				}
				ant.next = aux.next;
				count--;
				return (true);
			} else {
				ant = aux;
				aux = aux.next;
			}
		}
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int from, int to) {
		Node<E> de = head;
		Node<E> ate = head;

		if ((head == null) || (from < 0 || to >= count))
			throw new IndexOutOfBoundsException();

		for (int i = 0; i < from - 1; i++) {
			de = de.next;
		}
		for (int i = 0; i < to; i++) {
			ate = ate.next;
		}

		if (from == 0)
			// ate=head;
			head = ate.next;
		de.next = ate.next;
		count = count - (to - from) - 1;
	}

	public void splitReverse(int pos) {
		Node<E> antHead = head;
		Node<E> antTail = tail;
		Node<E> aux = head;
		for (int i = 0; i < pos - 1; i++) {
			aux = aux.next;
		}
		head = aux.next;
		// tail.next = antHead;
		// tail = aux;
		antTail.next = antHead;
		tail = aux;
		// tail.next = antHead;
	}

	public void invertList() {
		Node<E> aux = head;
		Node<E> novo = new Node(aux.element);
		LinkedList<E> nova = new LinkedList();
		while (aux != null) {
			novo.next = head;
			head = novo;
			nova.addFirst(aux.element);
			aux = aux.next;
		}
		head = nova.head;
		tail = nova.tail;
	}

	public void addFirst(Object e) {
		// Exercicio 1
		Node novo = new Node(e);
		novo.next = head;
		head = novo;
		if (count == 0)
			tail = novo;
		count++;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		head = tail = null;
		count = 0;
	}

	public String toString() {
		String s = "[";
		Node<E> n = head;
		if (n == null) {
			return "[]";
		}
		s += n.element;
		n = n.next;
		while (n != null) {
			s += ", " + n.element;
			n = n.next;
		}
		s += "]";
		return s;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {

            private Node<E> current = head;
                       
            public boolean hasNext() {
                return current != null;
            }

            public E next() {
                if(current == null)
                    throw new NoSuchElementException();
                E item = current.element;
                current = current.next;
                return item;
            }

            public void remove() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
	}

//	private class ListSimpleLinkedIterator<E> implements Iterator<E> {
//		return new Iterator<E>() {
//
//            private Node<E> current = head;
//                       
//            public boolean hasNext() {
//                return current != null;
//            }
//
//            public E next() {
//                if(current == null)
//                    throw new NoSuchElementException();
//                E item = current.element;
//                current = current.next;
//                return item;
//            }
//
//            public void remove() {
//                throw new UnsupportedOperationException("Not supported yet.");
//            }
//        };
//	}

}
