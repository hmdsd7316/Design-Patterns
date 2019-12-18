package com.sid.DesignPatterns.Structural.Facade.VideoLib;

import java.io.File;

public class AudioFixer {

	public File fix(VideoFile result) {
		System.out.println("AudioMixer: fixing audio...");
		return new File("tmp");
	}
}
