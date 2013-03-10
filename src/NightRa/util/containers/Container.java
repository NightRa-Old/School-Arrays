// Created by Ilan Godik
package NightRa.util.containers;

public class Container<T> implements IContainer{
    protected T data;

    public Container(T data){
        this.data = data;
    }

    public T get() {
        return data;
    }
}
