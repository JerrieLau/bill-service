package cn.lefull.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.lefull.bill.dao")
public class BillServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillServiceApplication.class, args);
	}

}
