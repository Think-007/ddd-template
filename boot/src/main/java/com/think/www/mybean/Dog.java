package com.think.www.mybean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 代码不写注释，编程不打日志，像极了你和别人吹NB的样子。
 *
 * @author 北桥南望
 * @since 2021-07-02 17:30
 */
public class Dog implements InitializingBean, DisposableBean {

    private int age=100;

    private String name="aaa";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {


        this.name = "InitializingBean";

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(name);
        System.out.println("InitializingBean 执行结束");

        System.out.println();
        System.out.println();
        System.out.println();

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("DisposableBean 执行结束");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
