
package producerconsumerproblem;

public class Producer extends Thread{
    Store store = null;
    long index = 1;

    public Producer(Store s) {
    store=s;
    }
    @Override
    public void run(){
        while(true){
            try{
                boolean result = store.put(index);
                if(result)System.out.println("Product "+(index++)+" is made");
                else System.out.println("Store is full");
            }catch(Exception e){
                
            }
        }
    }
}
