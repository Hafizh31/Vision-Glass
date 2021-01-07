import java.util.Scanner;

public class LensAdjustment extends Lens {
    public Miopi adjustedMiopi;
    public Presmiopi adjustedPresmiopi;
    public Slindris adjustedSlindris;
    private Scanner sc = new Scanner(System.in);

    public LensAdjustment(Miopi adjustedMiopi,Presmiopi adjustedPresmiopi,Slindris adjustedSlindris){
        this.adjustedMiopi=adjustedMiopi;
        this.adjustedPresmiopi=adjustedPresmiopi;
        this.adjustedSlindris=adjustedSlindris;
    }
    public void show(){
        adjustedMiopi.show();
        adjustedPresmiopi.show();
        adjustedSlindris.show();
    }
    
}