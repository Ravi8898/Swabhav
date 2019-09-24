package com.techlabs.design.pattern.strategy.test;

import java.io.File;
import java.util.ArrayList;

import com.techlabs.design.pattern.strategy.CompressContext;
import com.techlabs.design.pattern.strategy.ZipCompressionStrategy;

public class CompressionStrategyTest {

	public static void main(String[] args) {
		
		CompressContext context=new CompressContext();
		
		context.setStrategy(new ZipCompressionStrategy());
		ArrayList<File> fileList = null;
		context.createArchive(fileList);
	}

}
