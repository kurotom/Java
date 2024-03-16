package com.battleships.app.UnaAPPSocket.SocketsExChapter17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ServerChat_ExChap17 {
	private final List<PrintWriter> clientWriters = new ArrayList<>();
	
	public static void main(String[] args) {
		new ServerChat_ExChap17().go();
	}
	
	public void go() {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		try {
			ServerSocketChannel serverChannelSocket = ServerSocketChannel.open();
			serverChannelSocket.bind(new InetSocketAddress(5000));
			
			while (serverChannelSocket.isOpen()) {
				SocketChannel clientSocket = serverChannelSocket.accept();
				PrintWriter writer = new PrintWriter(Channels.newWriter(clientSocket, UTF_8));
				clientWriters.add(writer);
				threadPool.submit(new ClientHandler(clientSocket));
				System.out.println("Nueva conexión establecida.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void tellEveryone(String message) {
		for (PrintWriter writer: clientWriters) {
			writer.println(message);
			writer.flush();
		}
	}
	
	
	public class ClientHandler implements Runnable {
		BufferedReader reader;
		SocketChannel socket;
	
		public ClientHandler(SocketChannel clientSocket) {
			socket = clientSocket;
			reader = new BufferedReader(Channels.newReader(socket, UTF_8));
		}
		
		public void run() {
			String message;
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("read " + message);
					tellEveryone(message);
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

