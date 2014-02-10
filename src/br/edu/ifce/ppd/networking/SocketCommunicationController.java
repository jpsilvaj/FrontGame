package br.edu.ifce.ppd.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketCommunicationController extends Thread{
	private Boolean run;
	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public SocketCommunicationController(Socket socket){
		this.run = true;
		this.socket = socket;
	}
	
	@Override
	public void run() {
		 super.run();

		 try {
			 dataInputStream = new DataInputStream(socket.getInputStream());
			 dataOutputStream = new DataOutputStream(socket.getOutputStream());

			 while (run && this.isAlive()) {
				 if(dataInputStream.available() > 0){
					 byte[] messageReceiver = new byte[dataInputStream.available()];
					 dataInputStream.read(messageReceiver, 0, dataInputStream.available());
				 }
			 }
		 } catch (IOException e) {
			 e.printStackTrace(); 
			 stopSocketComunication();
		 }
	}

	public void sendMessage(byte[] command){
		try {
			if(dataOutputStream != null){
				dataOutputStream.write(command);
				dataOutputStream.flush();
			}else{
				//Do nothing
			}

		} catch (IOException e) {
			e.printStackTrace(); 
			stopSocketComunication();
		}
	}

	 public void stopSocketComunication(){ 
		try {
			if(dataInputStream != null && dataOutputStream != null){
				dataInputStream.close();
				dataOutputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			run = false;
		}
	 }
}
