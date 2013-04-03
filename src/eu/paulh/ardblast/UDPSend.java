package eu.paulh.ardblast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class UDPSend extends Activity {
    
	public void SendPower() throws java.io.IOException{
	DatagramSocket socket = new DatagramSocket();
    InetAddress serverIP = InetAddress.getByName("192.168.0.22");
    byte[] outData = ("Ping").getBytes();
    DatagramPacket out = new DatagramPacket(outData,outData.length, serverIP,9090);
    socket.send(out);
    socket.close();
	}
}
