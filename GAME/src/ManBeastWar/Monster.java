package ManBeastWar;

public class Monster{
    private String name;
    private int lifeValue;
    private int attack;
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length()>=0 && name.length()<=50){
            this.name=name;
        }
    }
    public int getLifeValue(){
        return lifeValue;
    }
    public void setLifeValue(int lifeValue){
        if(lifeValue>=0 && lifeValue<=999){
            this.lifeValue=lifeValue;
        }
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        if(attack>=0 && attack<=999){
            this.attack=attack;
        }
    }
}