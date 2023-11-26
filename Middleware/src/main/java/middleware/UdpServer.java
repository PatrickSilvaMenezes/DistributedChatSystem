package middleware;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UdpServer {

    private int contador = 0;

    public void startAdServer() throws SocketException, IOException {
        System.out.println("Hello World!");

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    String diretorio = "C:/8_periodo/SD/ChatSystem/Middleware/src/main/java/middleware/Repository/ads";
                    File folder = new File(diretorio);

                    if (folder.exists() && folder.isDirectory()) {
                        File[] arquivos = folder.listFiles();

                        if (arquivos != null) {
                            if (contador < arquivos.length) {
                                File arquivo = arquivos[contador];
                                if (arquivo.isFile()) {
                                    String nomeArquivo = arquivo.getName();
                                    if (nomeArquivo.toLowerCase().endsWith(".jpg")) {
                                        String adsemextensao = nomeArquivo.substring(0, nomeArquivo.length() - 4);

                                        enviarNomeViaUDP(adsemextensao);
                                    }
                                }
                                contador = (contador + 1) % arquivos.length;
                            } else {
                                System.out.println("O diretório está vazio ou não contém arquivos .jpg.");
                            }
                        }
                    } else {
                        System.out.println("O diretório não existe ou não é um diretório válido.");
                    }
                } catch (UnknownHostException e) {
                    e.printStackTrace(); // Trate a exceção adequadamente
                } catch (IOException ex) {
                    Logger.getLogger(UdpServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }, 0, 3000); // Executa a cada 3 segundos
    }

    private void enviarNomeViaUDP(String nome) throws IOException {
        InetAddress addr = InetAddress.getByName("localhost");
        byte[] msg = nome.getBytes();
        DatagramPacket pkg = new DatagramPacket(msg, msg.length, addr, 2020);
        DatagramSocket ds = new DatagramSocket();
        ds.send(pkg);
        ds.close();
    }
}
