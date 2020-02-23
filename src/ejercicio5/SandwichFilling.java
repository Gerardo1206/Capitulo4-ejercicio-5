package ejercicio5;

public class SandwichFilling {
    private String fillingType;
    private Integer caloriesInAServing;
    
    public SandwichFilling(String fillingType, Integer caloriesInAServing){
        this.fillingType=fillingType;
        this.caloriesInAServing=caloriesInAServing;
    }

    public String getFillingType() {
        return fillingType;
    }

    public Integer getCaloriesInAServing() {
        return caloriesInAServing;
    }
    public String toString(){
        String a="Relleno:" + fillingType +" "+"Calorias:"+caloriesInAServing;
        return a;
    }
    
}
