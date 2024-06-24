package com.moretolearn.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
@ComponentScan({ "com.moretolearn" })
public class AppConfig {

	@Bean
	public TaskExecutor platformExecutor() {
	    return new ThreadPoolTaskExecutor();
	}

	@Bean
	public TaskExecutor virtualExecutor() {
	    SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
	    executor.setVirtualThreads(true);
	    return executor;
	}
}
