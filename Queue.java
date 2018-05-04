
public class Queue <E>{
    int rear=-1;
    int front=0;
    int items=0;
    int maxSize=10;
    E x[]=(E[]) new Object[maxSize];
    Order req[];
    
    public Queue(int size) {
        maxSize = size;
        req = new Order[size];
    }
    
    public void inQueue(E newValue){
        if(isFull()){
            System.out.println("the queue is full!! "); 
        }
        else {if(rear==maxSize-1)
            rear=-1;
            x[++rear]=newValue;
            items++;
        }
        
    }
    
    public E deQueue(){
        if(isEmpty()){
            System.out.println("the queue is empty!! ");
        }
        else{ if(front==maxSize-1)
            front=0;
            x[front]=null;
            items--;
            front++;
        }
        return x[front++];
    }
    public boolean isFull(){        
        return items==maxSize;   
                
    }
    public boolean isEmpty(){        
        return items==0;
    }
    public Object getFront(){
        return x[front];
    }
    public Object getRear(){
        return x[rear];
    }
//    public String toString() {
//        String queue = "------------\n";
//        for (int i = 0; i < items + 1; i++) {
//            queue += x[i].toString() + "\n";
//        }
//        queue += "------------";
//        return queue;
//    }
    
    
    
}
