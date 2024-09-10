
class Carta
{
    String naipe;
    String rank;
        
    static String [] arraynaipes = {"Espadas", "Paus", "Copas", "Ouros"};
    static String [] arrayrank = {"Ás"," 2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

    
        
    Carta()
    {
    //naipe = "ouros";
    //rank ="7";
    
    
    }
    //Assinatura 
    Carta(String paramNaipe, String paramRank){
        naipe = paramNaipe;
        rank = paramRank;
    
}
Carta(int inteiroNaipe, int inteiroRank) 
{
    naipe= arraynaipes[ inteiroNaipe];
    rank = arrayrank[inteiroRank];
    

}
}
