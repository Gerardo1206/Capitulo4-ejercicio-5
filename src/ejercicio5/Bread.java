package ejercicio5;

public class Bread {
    private String tipoPan;
    private Integer calorias;
    
    public Bread(String tipoPan, Integer calorias){
        this.calorias=calorias;
        this.tipoPan=tipoPan;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public Integer getCalorias() {
        return calorias;
    }
    public String toString(){
        String a="Tipo de pan:" + tipoPan +" "+"Calorias:"+calorias;
        return a;
    }
    public final static String MOTTO="The staff of life.";
    
}
