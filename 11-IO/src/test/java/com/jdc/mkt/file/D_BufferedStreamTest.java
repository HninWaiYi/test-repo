package com.jdc.mkt.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.OwnerFile;

public class D_BufferedStreamTest extends OwnerFile {

	@Test
	void readAndWriteTest() {
		File file = getFile("buffer-data.txt");
		writeFile(file);
		readFile(file);
	}

	private void writeFile(File file) {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {

			out.write("Hello");
			out.append(" Java ");
			out.append(" Developer");
			out.newLine();
			out.write("Welcome to java");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void readFile(File file) {
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {

			while(in.ready()) {
				System.out.println(in.readLine());
			}
			
//			String str = "";
//			while ((str = in.readLine()) != null) {
//				System.out.println(str);
//			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
