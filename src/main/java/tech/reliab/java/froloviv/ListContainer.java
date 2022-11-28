package tech.reliab.java.froloviv;

import java.util.Arrays;
import java.util.Objects;

public class ListContainer<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;
    private int index;

    public ListContainer() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ListContainer(T... value) {
        elementData = new Object[value.length];
        for (int i = 0; i < value.length; i++) {
            elementData[i] = value[i];
            index++;
        }
        size = index;
    }

    public T get(int index) {
        indexCheck(index);
        return (T) elementData[index];
    }

    public int get(T t) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == t)
                return i;
        }
        return -1;
    }

    public boolean add(T t) {
        if (elementData.length == index) {
            Object[] temp = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = elementData[i];
            }
            elementData = temp;
        }
        elementData[index] = t;
        index++;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean addAll(ListContainer list) {
        for (int i = 0; i < list.size(); i++) {
            this.add((T) list.get(i));
        }
        return true;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException();
        }
    }

    public boolean remove(int index) {
        indexCheck(index);
        Object[] temp = new Object[elementData.length];
        for (int i = 0, k = 0; i < size; i++, k++) {
            if (index == i) {
                k--;
            } else {
                temp[k] = elementData[i];
            }
        }
        elementData = temp;
        size--;
        this.index--;
        return true;
    }

    public boolean compareTo(ListContainer<T> listContainer) {
        if (this.size != listContainer.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.elementData[i] != listContainer.elementData[i]) {
                return false;
            }
        }
        return true;
    }

    public ListContainer<T> subList(int firstIndex, int lastIndex) {
        indexCheck(firstIndex);
        indexCheck(lastIndex);
        SubList<T> temp = new SubList<T>(this, 0, firstIndex, lastIndex);
        return temp;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elementData[i] + " ";
        }
        return "List { " + result + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListContainer<?> arrayList = (ListContainer<?>) o;
        if (size == arrayList.size) {
            for (int i = 0; i < size; i++) {
                if (!elementData.equals(arrayList.elementData)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elementData);
        return result;
    }
}

class SubList<T> extends ListContainer {
    Object[] elementData;
    private ListContainer parent;
    private int offset;
    int size;

    SubList(ListContainer parent, int offset, int fromIndex, int toIndex) {
        this.parent = parent;
        this.offset = offset + fromIndex;
        this.size = toIndex - fromIndex;
        elementData = new Object[toIndex - fromIndex];
        for (int i = fromIndex, k = 0; i < toIndex; i++, k++) {
            elementData[k] = parent.get(i);
        }
    }

    public Object get(int index) {
        indexCheck(index);
        return parent.get(index + offset);
    }

    public int size() {
        return this.size;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elementData[i] + " ";
        }
        return "List { " + result + "}";
    }
}
