package com.sid.DesignPatterns.Structural.Facade;

import java.io.File;

import com.sid.DesignPatterns.Structural.Facade.VideoLib.AudioFixer;
import com.sid.DesignPatterns.Structural.Facade.VideoLib.BitrateReader;
import com.sid.DesignPatterns.Structural.Facade.VideoLib.Codec;
import com.sid.DesignPatterns.Structural.Facade.VideoLib.CodecFactory;
import com.sid.DesignPatterns.Structural.Facade.VideoLib.MPEG4CompressionCodec;
import com.sid.DesignPatterns.Structural.Facade.VideoLib.OggCompressionCodec;
import com.sid.DesignPatterns.Structural.Facade.VideoLib.VideoFile;

public class VideoConversionFacade {
	
	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		
		Codec destinationCodec;
		
		if(format.equals("mp4")) {
			destinationCodec = new OggCompressionCodec();
		}else {
			destinationCodec = new MPEG4CompressionCodec();
		}
		
		VideoFile buffer = BitrateReader.convert(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioFixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacase: conversion complete.");
		return result;
	}
}
