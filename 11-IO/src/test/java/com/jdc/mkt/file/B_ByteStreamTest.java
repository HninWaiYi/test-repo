package com.jdc.mkt.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.OwnerFile;

public class B_ByteStreamTest extends OwnerFile {

	@Test
	void readAndWriteTest() {
		File file = getFile("byte-data.txt");
		writeFile(file);
		readFile(file);		
	}

	private void writeFile(File file) {
		try (FileOutputStream out = new FileOutputStream(file)) {

			out.write("Hello".getBytes());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void readFile(File file) {
		try (FileInputStream in = new FileInputStream(file)) {
			
			int i = 0;
			while((i = in.read()) != -1) {
				System.out.print((char)i+"\t");
			}
						
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
