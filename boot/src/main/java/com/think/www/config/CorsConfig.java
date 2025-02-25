package com.think.www.config;

import com.think.www.mybean.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 代码不写注释，编程不打日志，像极了你和别人吹NB的样子。
 *
 * @author 北桥南望
 * @since 2021-05-25 13:01
 */

@Configuration
public class CorsConfig {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许任何域名
        corsConfiguration.addAllowedOrigin("*");
        // 允许任何头
        corsConfiguration.addAllowedHeader("*");
        // 允许任何方法
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 注册
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

    @Bean
    public Dog dog(){

        return new Dog();

    }



    @Component
    public static class DogBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
        @Override
        public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("postProcessBeanDefinitionRegistry 执行结束");

            System.out.println();
            System.out.println();
            System.out.println();

        }

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {


            //这里回到导致Bean的过早实例化
//            Dog bean = beanFactory.getBean(Dog.class);
//
//            System.out.println(bean);
//
//            bean.setName("dddd");

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("postProcessBeanFactory 执行结束");

            System.out.println();
            System.out.println();
            System.out.println();

        }
    }

    @Component
    public static class DogBeanPostProcessor implements BeanPostProcessor {

        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {



            if(bean instanceof Dog){
                Dog dog = (Dog)bean;
                dog.setName("postProcessAfterInitialization");

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println(dog.getName());
                System.out.println("postProcessAfterInitialization 执行结束");

                System.out.println();
                System.out.println();
                System.out.println();
            }



            return bean;
        }

        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {



            if(bean instanceof Dog){
                Dog dog = (Dog)bean;
                dog.setName("postProcessBeforeInitialization");

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println(dog.getName());
                System.out.println("postProcessBeforeInitialization 执行结束----");

                System.out.println();
                System.out.println();
                System.out.println();
            }



            return bean;
        }
    }

}