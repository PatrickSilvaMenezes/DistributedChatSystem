import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpClient {

    private String adName;

    public void receiveMessage() {
        try (DatagramSocket ds = new DatagramSocket(2020)) {
            byte[] msg = new byte[256];
            DatagramPacket pkg = new DatagramPacket(msg, msg.length);
            ds.receive(pkg);
            adName = new String(pkg.getData()).trim();
        } catch (IOException e) {
            e.printStackTrace(); // Trate a exceção adequadamente
        }
    }

    public String getAdName() {
        return adName;
    }

}
