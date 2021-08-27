package by.bsu.company.tunnels.exception;

public class IllegalTunnelDirectionsException extends Exception{
    private static final long serialVersionUID = 1L;

    public IllegalTunnelDirectionsException() {
    }

    public IllegalTunnelDirectionsException(String msg){
        super(msg);
    }
}
