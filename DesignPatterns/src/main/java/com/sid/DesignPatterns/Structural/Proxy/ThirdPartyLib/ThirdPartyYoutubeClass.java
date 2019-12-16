package com.sid.DesignPatterns.Structural.Proxy.ThirdPartyLib;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

	public HashMap<String, Video> popularVideos() {
		connectToServer("https://www.youtube.com");
		return getRandomVideos();
	}

	public Video getVideo(String videoId) {
		connectToServer("https://www.youtube.com/"+ videoId);
		return getSomeVideo(videoId);
	}
	
	 // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

	private int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	private void experienceNetworkLatency() {
		int randomLatency = random(5, 10);
		for(int i = 0; i < randomLatency; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void connectToServer(String server) {
		System.out.println("Connecting to " + server + "...");
		experienceNetworkLatency();
		System.out.println("Connected!" + "\n");
	}
	
	private HashMap<String, Video> getRandomVideos(){
		System.out.println("Downloading Populars... ");
		experienceNetworkLatency();
		
		HashMap<String, Video> hMap = new HashMap<String, Video>();
		hMap.put("UFCvideo1", new Video("Descaription", "videoFile.avi"));		
		hMap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
		hMap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
		hMap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
		hMap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Done!" + "\n");
        return hMap;
	}
	
	private Video getSomeVideo(String videoId) {
		System.out.println("Downloading video...");
		
		experienceNetworkLatency();
		Video video = new Video(videoId, "Some video title");
		
		System.out.println("Done!" + "\n");
		return video;
	}
}
