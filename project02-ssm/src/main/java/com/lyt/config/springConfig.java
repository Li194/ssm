package com.lyt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version 1.0
 * @Date 2022/6/7
 * Spring配置类
 *
 * Configuration注解：将一个普通的类标记为 Spring 的配置类
 * ComponentScan：开启组件扫描
 * PropertySource：导入properties文件
 * Import：导入其他配置类
 */
@Configuration
@ComponentScan({"com.lyt.service"})
@PropertySource("classpath:jdbc.properties")
@Import({jdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class springConfig {
}
