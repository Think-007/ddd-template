package com.think.www.loader;

/**
 * 代码不写注释，编程不打日志，像极了你和别人吹NB的样子。
 *
 * @author 北桥南望
 * @since 2021-07-07 10:55
 */
public class MyExtClassLoader extends ClassLoader {


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
