package com.jdc.mkt.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.OwnerFile;

public class E_DataStreamTest extends OwnerFile {

	@Test
	void readAndWriteTest() {
		File file = getFile("data.dat");
		writeFile(file);
		readFile(file);		
	}

	private void writeFile(File file) {
		try (DataOutputStream out = 
				new DataOutputStream(
				 new FileOutputStream(file))) {

			out.writeUTF("Hello");
			out.writeInt(23);
			out.writeBoolean(true);
			out.writeDouble(34.21);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void readFile(File file) {
		try (DataInputStream in = 
				new DataInputStream(
						new FileInputStream(file))) {
			
			System.out.println(in.readUTF());
			System.out.println(in.readInt());
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			
						
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
