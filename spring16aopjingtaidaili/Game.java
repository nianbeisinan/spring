package spring16aopjingtaidaili;
//目标对象，他的方法不行，想让另一个对象帮她
public class Game {
    private int wangsu=460;
    public int getWangsu(){
        return wangsu;
    }

    public void setWangsu(int wangsu) {
        this.wangsu = wangsu;
    }

    //目标对象的目的:   目标对象自身的方法.是不行的，想要在不改变这个源代码的基础上..增强这个方法

    public void conNet(){
        System.out.println("游戏本身的网速是:" +getWangsu());
    }
}
