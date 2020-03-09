package chat;

import java.net.*;
import java.io.*;


public class Servidor {
    
    public static void main(String[] args) {
        ServerSocket socket = null;
        Socket csocket = null;
        BufferedReader is = null;
        int porta = 4444;
        PrintWriter os = null;
    
        try{
            socket = new ServerSocket(porta);
            System.out.println("Aguardando uma conexão");
            
            csocket = socket.accept();
            System.out.println("Recebi " + csocket.getInetAddress() + "" + csocket.getPort());
            is = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
            os = new PrintWriter(csocket.getOutputStream());
            
        }catch(IOException e){
            System.out.println("Erro" + e);
            System.exit(1);
        }
        
        os.println("Você esta conectado em " + csocket.getLocalAddress());
        os.flush();
        String msg;
        try{
            while((msg = is.readLine()) != null){
                System.out.println(msg);
                if(msg.equalsIgnoreCase("bye")){
                    os.println("Adeus");
                    os.flush();
                    break;
                }
            }
            os.close();
        }catch(IOException e){
            System.out.println("Erro" + e);
            System.exit(1);
        }
    }
}
