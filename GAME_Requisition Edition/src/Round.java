public abstract class Round  implements RoundNum {

    GamePlayer gamePlayer=new GamePlayer();
    War war=new War();

    String player=gamePlayer.getPlayer();
    String wars=war.getWar();
    int lifeValuePlayer= gamePlayer.getLifeValuePlayer();
    int attackPlayer= gamePlayer.getAttackPlayer();
    int defensePlayer= gamePlayer.getDefensePlayer();
    int lifeValueWar=war.getLifeValueWar();
    int attackWar=war.getAttackWar();

    public int attackPlayer(int attackPlayer){

        return lifeValuePlayer;
    }

    public void defensePlayer(){

    }

    public void attackWar(){

    }

    public  Round(){}
    public  Round(int hurt){
        for(int i=1,j=1;i<=roundNum;i++){
            if(i%2!=0){
                System.out.println("Round"+j);

                System.out.println(player +"对"+wars+"造成"+hurt+"点伤害");
                j++;
            }else{


                System.out.println(wars+"对"+player+"造成"+hurt+"点伤害");
            }
        }
        System.out.println("回合已结束");
    }
}
