package org.bot.download;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class Download {
	static URL url;
	BufferedInputStream bf;
	static FileOutputStream fout;
	static InputStream is;
	static URLConnection uc;
	static BufferedReader br;
	static ByteArrayOutputStream bo;
	
	/**
	 * 
	 * Download the .jar
	 * 
	 * @param args
	 */
	
	private static void Download(){
		try{
			//url = new URL("https://dl.dropboxusercontent.com/s/e1ohm9wal055vfd/2014-12-30_17-22-35.png?dl=0");
			url = new URL("https://dl.dropboxusercontent.com/u/100076103/AllstarLegends.jar");
			uc = url.openConnection();
			bo = new ByteArrayOutputStream();
			
			String filename = "AllClient.jar";
			
			is = uc.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			String line;
			
			byte[] buf = new byte[1024];
			
			while((line = br.readLine()) != null){
				int n = 0;
				bo.write(buf, 0, n);
			}
			
			bo.close();
			is.close();
			
			byte[] response = bo.toByteArray();
			
			fout = new FileOutputStream(filename);
			fout.write(response);
			fout.close();
			
			System.out.println("Finished");

			
			
		} catch (Exception e){
			System.out.println("Unable to visit: " + url);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Download();
	}

}

/**

package org.bot.download;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class Download {
	static URL url;
	BufferedInputStream bf;
	static FileOutputStream fout;
	static InputStream is;
	static URLConnection uc;
	static BufferedReader br;
	static ByteArrayOutputStream bo;
	
	/**
	 * 
	 * Download the .jar
	 * 
	 * @param args
	 */
	
	private static void Download(){
		try{
			url = new URL("https://dl.dropboxusercontent.com/u/100076103/AllstarLegends.jar");
			uc = url.openConnection();
			bo = new ByteArrayOutputStream();
		
			is = uc.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			String line;
			
			byte[] buf = new byte[1024];
			
			while((line = br.readLine()) != null){
				int n = 0;
				bo.write(buf, 0, n);
			}
			
			bo.close();
			is.close();
			
			byte[] response = bo.toByteArray();
			
			try{
				OutputStream out = new FileOutputStream(new File("Allstar.jar"));
				//nog doen
			} catch(Exception e){
				System.out.println("unable to make the .jar file: " + e.getMessage());
			}
			
			fout = new FileOutputStream(filename);
			fout.write(response);
			fout.close();
			
			
			
			System.out.println("Finished");

			
			
		} catch (Exception e){
			System.out.println("Unable to visit: " + url);
			e.printStackTrace();
		}
	}
	
	public void downloadFile(){
		
	}
	
	public static void main(String[] args){
		Download();
	}

}


