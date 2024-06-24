package com.moretolearn.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.moretolearn.util.ThreadUtil;

@Service
public class HomeService {
	
	@Async("virtualExecutor")
	public void goHomeVirtually() {
		ThreadUtil.dumpInvocation();
	}

	@Async("platformExecutor")
	public void goHome() {
		ThreadUtil.dumpInvocation();
	}

}
