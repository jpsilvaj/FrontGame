package br.edu.ifce.ppd.networking.protocol;

import java.util.Arrays;

public class Frame {
	private byte[] header;
	private byte[] payload;
	private Integer checksum = null;
	
	public Frame(byte[] header, byte[] payload){
		
	}
	public byte calculateChecksum(Frame frame){
		int checksum = 0;
		for(byte value : frame.getPayload()){
			checksum += value; 
		}
		return (byte)checksum;
	}
	
	private byte[] getPayload() {
		return payload;
	}
	@Override
	public String toString() {
		return Arrays.toString(this.header)+"," + Arrays.toString(this.payload) + "," + this.checksum.toString();
	}
	
}
