package eu.paulh.ardblast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import android.os.Bundle;
import android.os.StrictMode;
import android.annotation.TargetApi;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class RemoteActivity extends UDPSend {

    @TargetApi(9)
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote);
    	StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_remote, menu);
        return true;
    }
    
    public void Power(View clickedButton) throws java.io.IOException{
    	Toast.makeText(this, "Turning Power On", Toast.LENGTH_SHORT).show();
    	DatagramSocket socket = new DatagramSocket();
        InetAddress serverIP = InetAddress.getByName("192.168.1.22");
        byte[] outData = ("POWER").getBytes();
        DatagramPacket out = new DatagramPacket(outData,outData.length, serverIP,9090);
        socket.send(out);
        socket.close();
    }
    
    public void Volup(View clickedButton) throws java.io.IOException{
    	Toast.makeText(this, "Turning Volume Up", Toast.LENGTH_SHORT).show();
    	DatagramSocket socket = new DatagramSocket();
        InetAddress serverIP = InetAddress.getByName("192.168.1.22");
        byte[] outData = ("VOLUP").getBytes();
        DatagramPacket out = new DatagramPacket(outData,outData.length, serverIP,9090);
        socket.send(out);
        socket.close();
    }
    
    public void Voldown(View clickedButton) throws java.io.IOException{
    	Toast.makeText(this, "Turning Volume Down", Toast.LENGTH_SHORT).show();
    	DatagramSocket socket = new DatagramSocket();
        InetAddress serverIP = InetAddress.getByName("192.168.1.22");
        byte[] outData = ("VOLDOWN").getBytes();
        DatagramPacket out = new DatagramPacket(outData,outData.length, serverIP,9090);
        socket.send(out);
        socket.close();
    }
    
    public void Mute(View clickedButton) throws java.io.IOException{
    	Toast.makeText(this, "Muting/Unmuting", Toast.LENGTH_SHORT).show();
    	DatagramSocket socket = new DatagramSocket();
        InetAddress serverIP = InetAddress.getByName("192.168.1.22");
        byte[] outData = ("MUTE").getBytes();
        DatagramPacket out = new DatagramPacket(outData,outData.length, serverIP,9090);
        socket.send(out);
        socket.close();
    }
    
}
