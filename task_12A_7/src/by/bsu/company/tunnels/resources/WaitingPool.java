package by.bsu.company.tunnels.resources;

import by.bsu.company.tunnels.entity.Train;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaitingPool implements Iterable<Train>{
    private List<Train> listOfTrains;

    public WaitingPool() {
        listOfTrains = new ArrayList<>();
    }

    public Train getTrain(int i){
        Train train = listOfTrains.get(i);
        return train;
    }

    public Train obtainTrain(int i){
        Train train = listOfTrains.get(i);
        listOfTrains.remove(i);
        return train;
    }

    public void addTrain(Train train){
        listOfTrains.add(train);
    }

    public int getSize(){
        return listOfTrains.size();
    }

    @Override
    public Iterator<Train> iterator() {
        return listOfTrains.iterator();
    }
}
