/*
This is a simple java http server
after running this file open localhost:9999 in browser.
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {

        // Socket for server created
        final ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("Server listening at port 9999");

        Socket client = serverSocket.accept();

        while(client != null){
            try {
                // client
                System.out.println("Connected to: "+client.getRemoteSocketAddress());

                // a simple response
                String httpResponse = "HTTP/1.1\r\n\r\n"+"Hey there ";
                client.getOutputStream().write(httpResponse.getBytes("UTF-8"));


            }catch (Exception e){
                System.out.print(e);
            }
        }
    }
}
