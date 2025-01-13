package com.jun.estudo.Date4u;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.unit.DataSize;
import com.jun.estudo.Date4u.core.FileSystem;

@SpringBootApplication
public class Date4uApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext appContexto = SpringApplication.run(Date4uApplication.class, args);
	
	FileSystem fs = appContexto.getBean(FileSystem.class);
	System.out.println(DataSize.ofBytes(fs.getFreeDiskSpace()).toGigabytes()+ " GB");
		
	}

}
