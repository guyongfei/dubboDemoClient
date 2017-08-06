package com.example.dubboclient;

import com.example.dubboserver.demo.DubboDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gutianzi on 2017/8/7.
 */
public class App {
//    @Autowired
//    DubboDemoService dubboService;

    public App() {

    }


    public static void main(String[] args) {
        System.out.println("sabc");

        new App().test1();
    }

    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:applicationContext.xml");
        DubboDemoService dubboService = (DubboDemoService) context
                .getBean("dubboService"); // 获取远程服务代理
        //        context.start();
        System.out.println("abcd");
        String s = (String)dubboService.getAppInfo("myakaaa");
        System.out.println(s);


    }
}
