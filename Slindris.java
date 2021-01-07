import java.util.Scanner;

public class Slindris extends Lens {
    private float scale;
    private Scanner sc = new Scanner(System.in);

    public void show(){
        System.out.println("Skala Slindris anda " +scale);
    }
    public void setScale(){
        System.out.println("Masukkan skala : ");
        scale = sc.nextFloat();

    }
    public float getScale(){
        return scale;
    }
    
}