package spring10Zuoye03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KeyboardTest {
    @Test
    public void test01(){
        String xml="spring10Zuoye03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        Keyboard keyboard=ac.getBean("keyboard",Keyboard.class);
        keyboard.Dazi();
    }
}
