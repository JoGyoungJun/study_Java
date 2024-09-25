package custom;

import java.util.Arrays;

public class CustomArrayList implements CustomList{
    private Object[] arr;
    private int size;

    public static void main(String[] args) {
        CustomList<String> strs = new CustomArrayList();
        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add(i+"index");
        }
        System.out.println(strs);
        System.out.println(strs.get(0));
        strs.remove(0);
        System.out.println(strs);
        strs.remove(0);
        System.out.println(strs);
        strs.remove(0);
        System.out.println(strs);
        strs.remove(0);
        System.out.println(strs);
    }

    public CustomArrayList() {
        arr = new Object[10];
        size = 0;
    }

    @Override
    public String toString() {
        return "arr = " + Arrays.toString(arr) + ", size = " + size;
    }

    @Override
    public void add(Object item) {
        Object[] before = arr;
        if(size == arr.length) arr = new Object[arr.length+1];
        arr[size++] = item;
        for (int i = 0; i < before.length; i++) arr[i] = before[i];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= size) return;
        Object[] before = arr;
        if(arr.length > 10){size--;}
        arr = new Object[size];
        for (int i = 0, j = 0; i < size; i++, j++) {
            if(j == index) {i--; continue;}
            if(j > size-1){ arr[i] = null;}
            else arr[i] = before[j];
        }
    }

    @Override
    public void remove(Object item) {
        int removeIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(item)) {
                removeIndex = i;
            }
        }
        if(removeIndex == -1) { return;}
        Object[] before = arr;
        size--;
        arr = new Object[size];
        for (int i = 0, j = 0; i < size; i++, j++) {
            if(j == removeIndex) {i--; continue;}
            arr[i] = before[j];
        }
    }

    @Override
    public Object get(int index) {
        if(size <= index) return null;
        return arr[index];
    }
}
