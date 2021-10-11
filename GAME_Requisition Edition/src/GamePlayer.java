import java.util.Scanner;

public class GamePlayer  {

    Scanner input=new Scanner(System.in);

    private String player;
    private int lifeValuePlayer;                  //生命力
    private int attackPlayer;                     //攻击力
    private int defensePlayer;                    //防御力

    public String getPlayer() {                //取得姓名
        return player;
    }

    public void setPlayer(String player) {       //设置姓名及约束
        if (player.length() >= 0 && player.length() <= 50) {
            this.player = player;
        }
    }

    public int getLifeValuePlayer() {
        return lifeValuePlayer;
    }

    public void setLifeValuePlayer(int lifeValuePlayer) {
        if (lifeValuePlayer >= 0 && lifeValuePlayer <= 999) {
            this.lifeValuePlayer = lifeValuePlayer;
        }
    }

    public int getAttackPlayer() {
        return attackPlayer;
    }

    public void setAttackPlayer(int attackPlayer) {
        if (attackPlayer >= 0 && attackPlayer <= 999) {
            this.attackPlayer = attackPlayer;
        }
    }

    public int getDefensePlayer() {
        return defensePlayer;
    }

    public void setDefensePlayer(int defensePlayer) {
        if (defensePlayer >= 0 && defensePlayer <= 999) {
            this.defensePlayer = defensePlayer;
        }
    }

    public int attack(int hurt){
        System.out.println("玩家造成了"+hurt+"点伤害");
        return hurt;
    }

    public int defense(int defense){
        System.out.println("玩家使用盾牌进行防御");
        return defense;
    }

}