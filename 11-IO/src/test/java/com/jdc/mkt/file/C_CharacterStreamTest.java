package com.jdc.mkt.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.OwnerFile;

public class C_CharacterStreamTest extends OwnerFile {

	@Test
	void readAndWriteTest() {
		File file = getFile("character-data.txt");
		writeFile(file);
		readFile(file);		
	}

	private void writeFile(File file) {
		try (FileWriter out = new FileWriter(file)) {

			out.write("Hello");
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void readFile(File file) {
		try (FileReader in = new FileReader(file)) {
			
			while(in.ready()) {
				System.out.println((char)in.read());
			}
			
//			int i = 0;
//			while((i = in.read()) != -1) {
//				System.out.print((char)i);
//			}
						
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
