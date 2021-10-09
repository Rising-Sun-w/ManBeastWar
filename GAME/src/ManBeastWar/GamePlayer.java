package ManBeastWar;

public class GamePlayer implements LifeValue {
    private String name;
    private int lifeValue;                  //生命力
    private int attack;                     //攻击力
    private int defense;                    //防御力

    public void existence() {

    }

    public String getName() {                //取得姓名
        return name;
    }

    public void setName(String name) {       //设置姓名及约束
        if (name.length() >= 0 && name.length() <= 50) {
            this.name = name;
        }
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue >= 0 && lifeValue <= 999) {
            this.lifeValue = lifeValue;
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack >= 0 && attack <= 999) {
            this.attack = attack;
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense >= 0 && defense <= 999) {
            this.defense = defense;
        }
    }

}