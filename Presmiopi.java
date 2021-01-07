import java.util.Scanner;

public class Presmiopi extends Lens {
    private float scale;
    private Scanner sc = new Scanner(System.in);

    public void show(){
        System.out.println("Skala Presmiopi anda " +scale);
    }
    public void setScale(){
        System.out.println("Masukkan skala : ");
        scale = sc.nextFloat();

    }
    public float getScale(){
        return scale;
    }
    
}
