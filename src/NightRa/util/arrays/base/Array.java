// Created by Ilan Godik
package NightRa.util.arrays.base;

public class Array<T> implements IArrayContainer<T>{
    private T[] array;

    @SafeVarargs
    public Array(T... array) {
        this.array = array;
    }

    public Array(IArrayContainer<T> container){
        this.array = container.getArray();
    }

    public void set(int index, T data){
        array[index] = data;
    }

    public T get(int index){
        return array[index];
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int length(){
        return array.length;
    }
}
