import java.util.Scanner;
import java.util.Iterator;
class DynamicArray <T> implements Iterable<T>{//generic coding
    private static final int initalCapacity=8;
    private T arr[];
    private int size;
    private int cap;
    @SuppressWarnings("unchecked")//Annotation
    DynamicArray(){
        size=0;
        arr = (T[])new Object[initalCapacity];
        cap=initalCapacity;
    }
    
    public void append(T element){
        if (size==cap)
            expandArray();
        arr[size++]=element;
    }
    
    public void disp(){
        System.out.println("Element At the list:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public void insert(T element, int pos){
        if (size==cap)
            expandArray();
        for(int i=size-1;i>=pos;i--)
            arr[i+1]=arr[i];
        arr[pos]=element;
        size++;
    }
    
    public void del(int pos){
        for(int i=pos+1;i<size;i++)
            arr[i-1]=arr[i];
        size--; 
        if (cap>initalCapacity && cap>3*size)
            shrinkArray();
    }
    
    public void len(){
        System.out.println(size);
    }
    
    public void delEnd(){
        del(size-1);
        size--;
    }
    public void delBig(){
        del(0);
        size--;
    }
    public void insertBig(T element){
        insert( element,0);
        size++;
    }
    public void get(int pos){
        System.out.println(arr[pos]);
    }
    public void update(int pos,T element){
        arr[pos]=element;
    }
    public void search(T element){
        for(int i=0;i<size;i++)
            if (arr[i]==element)
                System.out.println(i);
    }
    public void clear(){
        size=0;
        
    }
    
    public void contain(T element){
    for(int i=0;i<size;i++)
            if (arr[i]== element)
                System.out.println("True"); 
            else
                System.out.println("False");
        
    }
    
    private void shrinkArray(){
        cap=cap/2;
        arr=java.util.Arrays.copyOf(arr,cap);
    }
    
    private void expandArray(){
        cap=cap*2;
        arr=java.util.Arrays.copyOf(arr,cap);
    }
    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int index=0;
            public T next(){
                return arr[index++];
            }
            public boolean hasNext(){
                return index<size;
            }    
            };
    }       
    
}
