package br.edu.ifce.ppd.networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient{
	private Socket socket;
	public SocketClient(String host, int port){
		try {
			this.socket = new Socket(host,port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public SocketClient(int port){
		try {
			this.socket = new Socket("127.0.0.1",port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Socket getSocket(){
		return this.socket;
	}
	public void closeSocketClient(){
		if(this.socket != null){
			try {
				this.socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}