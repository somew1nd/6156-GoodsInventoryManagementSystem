package top.faquan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.faquan.controller.interceptors.interceptors;

@Configuration
@ComponentScan("top.faquan.controller")
@EnableWebMvc
public class mvcConfig implements WebMvcConfigurer {
    interceptors interceptors;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptors).addPathPatterns("/clients","/clients/*");
    }
}
