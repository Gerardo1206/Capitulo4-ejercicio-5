package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        Bread pan = new Bread("germinado",10);
        Bread pan1 = new Bread("de maiz",100);
        Bread pan2 = new Bread("de trigo",50);
        SandwichFilling filling= new SandwichFilling("egg salad",50);
        SandwichFilling filling1= new SandwichFilling("salad",5);
        SandwichFilling filling2= new SandwichFilling("egg ",100);
        Sandwich s1=new Sandwich("germinado",20,"egg salad",100);
        System.out.println(pan.toString());
        System.out.println(pan.MOTTO);
        System.out.println(pan1.toString());
        System.out.println(pan1.MOTTO);
        System.out.println(pan2.toString());
        System.out.println(pan2.MOTTO);
        System.out.println(filling.toString());
        System.out.println(filling1.toString());
        System.out.println(filling2.toString());
        System.out.println(s1.toString());
    }
    
}
