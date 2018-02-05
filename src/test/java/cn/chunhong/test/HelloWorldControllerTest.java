package cn.chunhong.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cn.chunhong.controller.HelloWorldController;

public class HelloWorldControllerTest {
	@Test
    public void testSayHello() {
		
        assertEquals("hello world",new HelloWorldController().sayHello());
        
    }
}
