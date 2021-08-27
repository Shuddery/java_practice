package by.bsu.company.tunnels.runner;

import by.bsu.company.tunnels.entity.Tunnel;
import by.bsu.company.tunnels.exception.IllegalTunnelDirectionsException;
import by.bsu.company.tunnels.resources.WaitingPool;
import by.bsu.company.tunnels.threads.CreatorThread;
import by.bsu.company.tunnels.threads.DispatcherThread;
import by.bsu.company.tunnels.threads.WaitingPoolMonitorThread;

public class Main {
    public static void main(String[] args) throws IllegalTunnelDirectionsException {

        Tunnel tunnelTrue = new Tunnel(true);
        Tunnel tunnelFalse = new Tunnel(false);
        WaitingPool waitingPool = new WaitingPool();

        CreatorThread creator = new CreatorThread(waitingPool);
        creator.start();

        WaitingPoolMonitorThread poolMonitor = new WaitingPoolMonitorThread(waitingPool);
        poolMonitor.setDaemon(true);
        poolMonitor.start();

        DispatcherThread dispatcher = new DispatcherThread(waitingPool, tunnelTrue, tunnelFalse);
        dispatcher.setDaemon(true);
        dispatcher.start();


    }
}
