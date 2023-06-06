package com.example.melodyhub.Server.loXdy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Main {
    private static int PORT=8090;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            Thread clientThread = new Thread(new Session(clientSocket));
            System.out.println("Client connected."+clientSocket.getLocalSocketAddress());
            clientThread.start();
        }
        //serverSocket.close();*/
    }
}
