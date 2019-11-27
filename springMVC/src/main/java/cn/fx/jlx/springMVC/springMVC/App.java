package cn.fx.jlx.springMVC.springMVC;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages="cn.fx.jlx.springMVC.springMVC")
@MapperScan(value="cn.fx.jlx.springMVC.springMVC.mapper")
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	
		
	}

}
