import java.util.Scanner;

public class Miopi extends Lens {
    private float scale;
    private Scanner sc = new Scanner(System.in);

    public void show(){
        System.out.println("Skala Miopi anda " +scale);
    }
    public void setScale(){
        System.out.println("Masukkan skala : ");
        scale = sc.nextFloat();

    }
    public float getScale(){
        return scale;
    }
    
}