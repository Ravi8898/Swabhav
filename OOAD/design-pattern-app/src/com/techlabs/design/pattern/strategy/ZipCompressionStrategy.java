package com.techlabs.design.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("Zip files are compressed...!!!");
		
	}

}
