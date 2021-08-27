package spring16aopjingtaidaili;

import org.junit.Test;

public class GameTest {
    //测试静态代理
    @Test
    public void test01(){
        Game yongjiewujian=new Game();
        JiaSuqi wangyi=new JiaSuqi();
        wangyi.setGame(yongjiewujian);//set 注入，..王者注入了迅游，.迅游依赖了王者，迅游包含了王者，迅游才是主体类
        wangyi.conNet();//调用﹒都用调用﹑主体类.

    }
}
