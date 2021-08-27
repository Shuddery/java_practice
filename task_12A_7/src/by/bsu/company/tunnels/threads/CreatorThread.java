package by.bsu.company.tunnels.threads;

import by.bsu.company.tunnels.entity.Train;
import by.bsu.company.tunnels.resources.WaitingPool;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CreatorThread extends Thread{
    private final Lock lock = new ReentrantLock();
    private WaitingPool pool;

    public CreatorThread(WaitingPool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 100){

            try {
                Thread.sleep(new Random().nextInt(12_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Train train = new Train(new Random().nextBoolean());

            try {
                lock.lock();
                pool.addTrain(train);

            }  finally {
                lock.unlock();
            }

            i++;

        }

    }
}
