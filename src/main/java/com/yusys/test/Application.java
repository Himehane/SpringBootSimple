/**
 * 
 */
package com.yusys.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @author: Himehane Ryuu
 * @createDate: 2018年1月31日
 * @version
 */
@SpringBootApplication
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 第一种方式，运行SpringBoot项目
		// SpringApplication.run(Application.class, args);
		// 第二种方式，运行SpringBoot项目
		SpringApplication springApplication = new SpringApplication(Application.class);
		// 设置关闭Banner横幅
		springApplication.setBannerMode(Banner.Mode.CONSOLE);
		springApplication.run(args);
	}

}
