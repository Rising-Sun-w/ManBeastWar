import java.util.*;


public class Game {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.println("START THE GAME ");

        GamePlayer gamePlayer=new GamePlayer();         //输入玩家信息
        System.out.println("请输入玩家名称：");
        String player=input.next();
        gamePlayer.setPlayer(player);
        System.out.println("请输入玩家生命力：");
        int lifeValuePlayer=input.nextInt();
        gamePlayer.setLifeValuePlayer(lifeValuePlayer);
        System.out.println("请输入玩家攻击力：");
        int attackPlayer=input.nextInt();
        gamePlayer.setAttackPlayer(attackPlayer);
        System.out.println("请输入玩家防御力：");
        int defensePlayer=input.nextInt();
        gamePlayer.setDefensePlayer(defensePlayer);

        War war=new War();                              //输入怪兽信息
        System.out.println("请输入怪兽名称：");
        String warname=input.next();
        war.setWar(warname);
        System.out.println("请输入怪兽生命力：");
        int lifeValueWar=input.nextInt();
        war.setLifeValueWar(lifeValuePlayer);
        System.out.println("请输入怪兽攻击力：");
        int attackWar=input.nextInt();
        war.setAttackWar(attackWar);

        System.out.println("怪兽攻击力："+war.getAttackWar());

        int hurt = 10;
        Round round=new Round(hurt);

        System.out.println("GAME OVER");

    }
}