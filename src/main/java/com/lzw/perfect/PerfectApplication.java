package com.lzw.perfect;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerfectApplication {

	public static void main(String[] args) {
		//		System.out.println(SpringExploreApplication.class.getClassLoader());
		SpringApplication.run(PerfectApplication.class, args);


//		SpringApplication application = new SpringApplication(PerfectApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);//启动后不会打印Banner：spring
//		application.run(args);


	}

}
