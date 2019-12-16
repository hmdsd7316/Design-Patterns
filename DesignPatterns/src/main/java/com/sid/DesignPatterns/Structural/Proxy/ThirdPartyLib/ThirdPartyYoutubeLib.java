package com.sid.DesignPatterns.Structural.Proxy.ThirdPartyLib;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
	HashMap<String, Video> popularVideos();
	Video getVideo(String vedeoId);
}
