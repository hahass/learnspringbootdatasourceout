package com.hs.learnspringbootdatasourcerout;

import com.hs.learnspringbootdatasourcerout.annontion.RoutingDataSource;
import com.hs.learnspringbootdatasourcerout.bean.User;
import com.hs.learnspringbootdatasourcerout.common.DataSources;
import com.hs.learnspringbootdatasourcerout.dao.SysUserMapper;
import com.hs.learnspringbootdatasourcerout.services.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LearnspringbootdatasourceroutApplication {



	public static void main(String[] args) {
		SpringApplication.run(LearnspringbootdatasourceroutApplication.class, args);
	}
}
