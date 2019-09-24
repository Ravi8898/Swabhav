package com.techlabs.design.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressContext {

	private CompressionStrategy strategy;

	public void setStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void createArchive(ArrayList<File> files) {
		strategy.compressFiles(files);
	}
}
