package com.sid.DesignPatterns.Structural.Facade.VideoLib;

public class BitrateReader {
	
	public static VideoFile read(VideoFile file, Codec codec) {
		System.out.println("BitrateReader: reading file");
		return file;
	}
	
	public static VideoFile convert(VideoFile buffer, Codec codec) {
		System.out.println("BitrateReader: Writing file...");
		return buffer;
	}
}
