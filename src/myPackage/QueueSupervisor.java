package myPackage;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

public class QueueSupervisor {
    
    Queue<DataSupervisor> dataQS1 = new PriorityBlockingQueue<DataSupervisor>();

    public void tambahData(DataSupervisor NewData){
        this.dataQS1.add(NewData);
    }

    public void panggilAntrian(){
        this.dataQS1.peek();
    }

    public void hapusData(){
        this.dataQS1.poll();
    }

}
