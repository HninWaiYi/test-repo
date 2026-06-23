package com.jdc.mkt.file;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class A_FileTest {

//	Absolute path(root directory) is start with / or drive letter
//  Relative path(current directory) is not start with /

	@Test
	void useMethodTest() {
		try {
			File path = new File("./testing/testOne");
			assertTrue(path.mkdirs());// multi path

			File file = new File(path, "test.txt");
			file.createNewFile();

			assertTrue(file.exists());
			assertTrue(file.isFile());

			assertTrue(path.isDirectory());
			assertFalse(file.isHidden());

			assertEquals("test.txt", file.getName());

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

	@Test
	@SuppressWarnings("unused")
	void createFileObject() {
		try {
			File path = new File("./");
//			File file = new File(path, "test.txt");

//			File file = new File("./","test.txt");

			URI uri = new URI(
					"file:///Users/MKT/Documents/JDC_WorkSpace/Eclipse_Projects/weekday/17-onestop-weekday/11-IO/test.txt");
			File file = new File(uri);

			file.createNewFile();
			assertTrue(file.exists());

		} catch (IOException e) {
			System.err.println(e.getMessage());

		} catch (URISyntaxException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	@Disabled
	void createAndCheckTest() {
		try {
//		Create File Object
			File file = new File("test.txt");
			assertFalse(file.exists());

//		Creat Text.txt file
			file.createNewFile();
			assertTrue(file.exists());

//			file.delete();
//			assertFalse(file.exists());

			file.deleteOnExit();
			assertTrue(file.exists());

			System.out.println(file.getAbsolutePath());

		} catch (IOException e) {
			System.err.println(e.getMessage());

		}
	}
}
