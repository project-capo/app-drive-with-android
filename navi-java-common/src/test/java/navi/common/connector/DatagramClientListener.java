package navi.common.connector;

import java.util.Arrays;

/**
 * Created by paoolo on 26.03.14.
 */
class DatagramClientListener implements DatagramListener {

    @Override
    public void notifyReceived(byte[] object) {
        System.err.println("received " + Arrays.toString(object));
    }

    @Override
    public void notifyDisconnected() {
        System.err.println("disconnected");
    }
}
