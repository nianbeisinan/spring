package spring16aopjingtaidaili;
/*
* 代理对象，用于增强目标对象的方法
* 游戏 迅游加速器
* 王宝强   经纪人宋吉吉
* 浏览器    vpn
* 被告人   律师
* */
public class JiaSuqi {
    private Game game;//代理类才主体类，代理对象依赖了目标对象，..代理对象包含了目标对象
    private int ws;

    //代理对象的方法，.而且必须和.目标对象一样，因为代理对象也要目标对象的方法，不然.怎么加强
    public void conNet(){
        //这个方法要承接目标对象的方法
        int wangsu = game.getWangsu();//.目标对象的.网速方法
        this.ws=wangsu-400;
        System.out.println("现在打游戏的网速 = " + this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWangsu() {
        return ws;
    }

    public void setWangsu(int wangsu) {
        this.ws = wangsu;
    }
}
