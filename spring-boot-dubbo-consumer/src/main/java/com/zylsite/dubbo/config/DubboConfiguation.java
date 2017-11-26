package com.zylsite.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration  
@PropertySource("classpath:config/dubbo/dubbo.properties")  
@ImportResource({ "classpath:config/dubbo/dubbo-consume.xml" }) 
public class DubboConfiguation {

}
