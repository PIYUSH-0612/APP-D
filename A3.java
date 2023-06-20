class DOMINOS
{
    int price ;
    String taste,size;

}
class pizza extends DOMINOS
{
    String toppings;
}
class burger extends DOMINOS
{
    int patty;
}
class ice_cream extends DOMINOS
{
    String flavour;
}

class A3
{
    public static void main(String[]args)
    {
        pizza P=new pizza();
        P.price=500;
        P.size="large";
        P.taste="DELICIOUS";
        P.toppings="CORN & ONIONS";
        System.out.println(P.price+P.size+P.taste+P.toppings);
    }
}