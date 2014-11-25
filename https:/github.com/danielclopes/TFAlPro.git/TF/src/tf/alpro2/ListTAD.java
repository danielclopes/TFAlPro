package tf.alpro2;

import java.util.Iterator;

public interface ListTAD<E> {
	void add(E element);
	void add(int index, E element);
	void clear();
	boolean contains(E element);
	E get(int index);
	int indexOf(E element);
	boolean isEmpty();
	boolean remove(E element);
	E remove(int index);
	int size();
	E set(int index, E element);
	Iterator<E> iterator();
}
