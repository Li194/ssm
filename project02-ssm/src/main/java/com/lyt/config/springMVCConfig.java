package com.lyt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @version 1.0
 * @Date 2022/6/7
 */

@Configuration
@ComponentScan({"com.lyt.controller","com.lyt.config"})
@EnableWebMvc
public class springMVCConfig {
}
