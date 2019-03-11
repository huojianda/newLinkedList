package linkList;

public class NewLinkedList<T> {

    Ring<T> first;
    int size;
    public NewLinkedList(){

    }
    public void add(T newT){
        Ring<T> ring =  new Ring<T>();
        ring.data = newT;
        if(size == 0){
            first = ring;
        }else{
            Ring<T> end = first;
            while(end.next != null){
                end = end.next;
            }
            end.next = ring;
        }
        size ++;
    }
    public T get(int index){
        Ring<T> target = first;
        for(int i = 1;i<= index;i=i+1){
            target = target.next;
        }
        return target.data;
    }
}
