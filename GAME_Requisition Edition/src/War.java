import java.util.Scanner;

public class War {
    Scanner input = new Scanner(System.in);
    private String war;
    private int lifeValueWar;
    private int attackWar;

    public String getWar() {
        return war;
    }

    public void setWar(String war) {
        if (war.length() >= 0 && war.length() <= 50) {
            this.war = war;
        }
    }

    public int getLifeValueWar() {
        return lifeValueWar;
    }

    public void setLifeValueWar(int lifeValueWar) {
        if (lifeValueWar >= 0 && lifeValueWar <= 999) {
            this.lifeValueWar = lifeValueWar;
        }
    }

    public int getAttackWar() {
        return attackWar;
    }

    public void setAttackWar(int attackWar) {
        if (attackWar >= 0 && attackWar <= 999) {
            this.attackWar = attackWar;
        }
    }

    public void war() {
    }

    public int attack(int hurt) {
        System.out.println(war + "对玩家造成了" + hurt + "点伤害");
        return hurt;
    }
}