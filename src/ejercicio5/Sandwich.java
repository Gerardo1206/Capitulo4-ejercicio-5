package ejercicio5;

public class Sandwich {
    private Bread pan;
    private SandwichFilling relleno;
    private Integer sanwichCalories;
    public Sandwich(String tipoPan, Integer calorias,String fillingType, Integer caloriesInAServing){
        this.pan=new Bread(tipoPan,calorias); 
        this.relleno=new SandwichFilling(fillingType,caloriesInAServing);
        this.sanwichCalories=(calorias*2)+caloriesInAServing;
    }

    @Override
    public String toString() {
        return "Sandwich: " + pan +" "+ relleno + ", calorias del sandwich=" + sanwichCalories;
    }
    
    public Bread getPan() {
        return pan;
    }

    public SandwichFilling getRelleno() {
        return relleno;
    }

    public Integer getSanwichCalories() {
        return sanwichCalories;
    }
    
    
}
