
package producerconsumerproblem;
public class Store {
    int maxN=50;
    long [] a;
    int n;

    public Store() {
        this.a = new long [maxN];
        this.n = 0;
    }
    private boolean empty(){
        return n==0;
    }
    
    private boolean full(){
        return n==maxN;
    }
    public boolean put(long x){
        if(full())
        return false; 
        a[n++]=x;
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            
        }
        return true;
    }
    public long get(){
        long result=0;
        if(!empty()){
            result = a[0];
            for (int i = 0; i < n-1; i++) {
                a[i]=a[i+1];
            }
            n--;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        return result;
    }
}
