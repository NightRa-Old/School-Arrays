// Created by Ilan Godik
package NightRa.util.containers;

public class MutableContainer<T> extends Container<T>{

    public MutableContainer(T data) {
        super(data);
    }

    public void set(T data){
        this.data = data;
    }
}
