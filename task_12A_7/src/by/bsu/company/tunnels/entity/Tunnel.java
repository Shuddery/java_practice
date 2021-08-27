package by.bsu.company.tunnels.entity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Tunnel {
    private boolean direction;
    private AtomicBoolean isBusyFlag = new AtomicBoolean(false);
    private AtomicInteger trainCount = new AtomicInteger(0);
    private Queue<Train> trainsInTunnel = new LinkedList<>();

    public Tunnel(boolean direction) {
        this.direction = direction;
    }

    public boolean isBusyFlag() {
        return isBusyFlag.get();
    }

    public void setBusyFlag(boolean isBusyFlag) {
        this.isBusyFlag.set(isBusyFlag);
    }

    public boolean getDirection() {
        return direction;
    }

    public int getTrainCount() {
        return trainCount.get();
    }

    public void incrementTrainCount(){
        trainCount.incrementAndGet();
    }

    public void decrementTrainCount(){
        trainCount.decrementAndGet();
    }

    public void addTrain(Train train){
        trainsInTunnel.add(train);
    }

    public void removeTrain(){
        trainsInTunnel.poll();
    }
}
