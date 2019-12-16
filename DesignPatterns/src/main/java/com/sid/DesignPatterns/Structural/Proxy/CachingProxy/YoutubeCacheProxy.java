package com.sid.DesignPatterns.Structural.Proxy.CachingProxy;

import java.util.HashMap;

import com.sid.DesignPatterns.Structural.Proxy.ThirdPartyLib.ThirdPartyYoutubeClass;
import com.sid.DesignPatterns.Structural.Proxy.ThirdPartyLib.ThirdPartyYoutubeLib;
import com.sid.DesignPatterns.Structural.Proxy.ThirdPartyLib.Video;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {

	private ThirdPartyYoutubeLib youtubeService;
	private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
	private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

	public YoutubeCacheProxy() {
		this.youtubeService = new ThirdPartyYoutubeClass();
	}

	public HashMap<String, Video> popularVideos() {
		if (cachePopular.isEmpty()) {
			cachePopular = youtubeService.popularVideos();
		} else {
			System.out.println("Retrieved list from cache.");
		}
		return cachePopular;
	}

	public Video getVideo(String vedeoId) {
		Video video = cacheAll.get(vedeoId);
		if (video == null) {
			video = youtubeService.getVideo(vedeoId);
			cacheAll.put(vedeoId, video);
		}
		return video;
	}
	
	public void reset() {
		cachePopular.clear();
		cacheAll.clear();
	}

}
