package br.edu.ifce.ppd.networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	private Socket socket;
	private ServerSocket serverSocket;
	public SocketServer(int port, int timeout){
		try{
			this.serverSocket = new ServerSocket(port, timeout);
			this.socket = serverSocket.accept();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void closeSocketServer(){
		try{
        	if(this.socket != null){
        		this.socket.close();
        	}
        	
        	if(this.serverSocket != null){
        		this.serverSocket.close();
        	}
        }
        catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
