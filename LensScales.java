import java.util.Scanner;

public class LensScales extends LensAdjustment {
    public float SkalaMiopi;
    public float SkalaPresmiopi;
    public float SkalaSlindris;

    public LensScales(Miopi adjustedMiopi,Presmiopi adjustedPresmiopi,Slindris adjustedSlindris){
        super(adjustedMiopi,adjustedPresmiopi,adjustedSlindris);
    }
    public void show(){
        adjustedMiopi.show();
        adjustedPresmiopi.show();
        adjustedSlindris.show();
    }
    public void setMiopi(){
        adjustedMiopi.setScale();
    }
    public void setPresmiopi(){
        adjustedPresmiopi.setScale();
    }
    public void setSlindris(){
        adjustedSlindris.setScale();
    }
    public void Combination(){
        System.out.println("Skala Miopi anda : "+adjustedMiopi.getScale()+"| Skala Presmiopi anda : "+ adjustedPresmiopi.getScale()+ "| Skala Slindris anda : "+ adjustedSlindris.getScale());
    }
    public Miopi getMiopi(){
        return adjustedMiopi;
    }
    public Presmiopi getPresmiopi(){
        return adjustedPresmiopi;
    }
    public Slindris getSlindris(){
        return adjustedSlindris;
    }
}