package navi.common.connector.client;

public interface ClientListener {

    void notifyReceived(byte[] object);

    void notifyDisconnected();
}
