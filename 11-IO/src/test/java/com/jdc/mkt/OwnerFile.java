package com.jdc.mkt;

import java.io.File;
import java.io.IOException;

public class OwnerFile {

	protected File getFile(String name) {
		return createFile(name);
	}

	private File createFile(String name) {
		try {
			File path = new File("./testing");
			path.mkdir();

			File file = new File(path, name);

			if (!file.exists()) {
				file.createNewFile();
			}

			return file;

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
}
