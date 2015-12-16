package com.memory.gecco;

import com.memory.gecco.annotation.RenderType;
import com.memory.gecco.downloader.Downloader;
import com.memory.gecco.scheduler.Scheduler;
import com.memory.gecco.spider.render.Render;

public class GeccoEngineThreadLocal {
	
	private static ThreadLocal<GeccoEngine> engineThreadLocal = new ThreadLocal<GeccoEngine>();
	
	public static void set(GeccoEngine engine) {
		engineThreadLocal.set(engine);
	}
	
	public static GeccoEngine get() {
		return engineThreadLocal.get();
	}
	
	public static Scheduler getScheduler() {
		return get().getScheduler();
	}
	
	public static Downloader getDownloader() {
		return get().getDownloader();
	}
	
	public static Render getRender(RenderType type) {
		return get().getSpiderBeanFactory().getRenderFactory().getRender(type);
	}

}
