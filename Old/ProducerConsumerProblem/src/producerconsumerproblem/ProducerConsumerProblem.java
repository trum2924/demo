package producerconsumerproblem;

/**
 *
 * @author oV nauT
 */
public class ProducerConsumerProblem {

    Store store;
    Producer pro;
    Consumer con;

    public ProducerConsumerProblem() {
        store = new Store();
        pro = new Producer(store);
        con = new Consumer(store);
        con.start();
        pro.start();
    }

    public static void main(String[] args) {
        ProducerConsumerProblem p = new ProducerConsumerProblem();
    }

}
