package com.sid.DesignPatterns.Structural.Proxy;

import com.sid.DesignPatterns.Structural.Proxy.CachingProxy.YoutubeCacheProxy;
import com.sid.DesignPatterns.Structural.Proxy.ThirdPartyLib.ThirdPartyYoutubeClass;

public class Client {
	public static void main(String[] args) {
		YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
		YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		
		System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
	}
	
	private static long test(YoutubeDownloader downloader) {
		long startTime = System.currentTimeMillis();
		
		// User behavior in our app:
		downloader.renderPopularVideos();
		downloader.renderVideoPage("UFCvideo1");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancesvideoo");
		
		// Users might visit the same page quite often
		downloader.renderVideoPage("UFCvideo1");
		downloader.renderVideoPage("someothervid");
		
		long estimatedTime = (System.currentTimeMillis() - startTime);
		System.out.println("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}
}
