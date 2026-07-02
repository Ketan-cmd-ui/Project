class Computer 
{
    public void playMusic()
    {
        System.out.println("hello i am music");
    }
    public String getAPen (int cost)
    {   if(cost >=10)
           return "pen";
        return "nothing";
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
       String str = obj.getAPen(11);
       System.out.println(str);
    }
}
