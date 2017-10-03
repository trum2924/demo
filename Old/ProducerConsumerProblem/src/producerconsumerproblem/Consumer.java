
package producerconsumerproblem;

/**
 *
 * @author oV nauT
 */
public class Consumer extends Thread{
    Store store = null;

    public Consumer(Store s) {
    store = s;
    }
    @Override
    public  void run(){
        while(true){
            try{
                long x = store.get();
                if(x>0)System.out.println("Product "+x+" is bought");
                else System.out.println("Waiting for new product");
            }catch(Exception e){
                
            }
        }
    }
}
