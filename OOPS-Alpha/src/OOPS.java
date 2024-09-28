public class OOPS {
    public static void main(String[] args) {
        
        pen p1 = new pen();
       p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(7);
        System.out.println(p1.tip);

    }
} 

class pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip (int newTip){
        tip = newTip;
    }

}