import java.util.Scanner;

public class VisionGlass {
    private Scanner sc = new Scanner(System.in);
    private String Username;
    private String Email;
    private String Password;
    private float Skala;
    private String Warna;
    public int userAge;
    public Miopi miopi=new Miopi();
    public Presmiopi presmiopi=new Presmiopi();
    public Slindris slindris=new Slindris();


    private static VisionGlass uniqueInstance;

    private VisionGlass() {
    }

    public static VisionGlass getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new VisionGlass();
        }
        return uniqueInstance;
    }

    public void showMenu() {
        System.out.println("1.Register");
        System.out.println("2.Login");
        int pilihan=sc.nextInt();
        if(pilihan==1){
            Register();
        }else{
            Login();
        }
    }
    public void Register(){
        System.out.println("\tRegister");
        System.out.print("Username : ");
        sc.nextLine();
            Username = sc.nextLine();
        System.out.print("Email : ");
            Email = sc.nextLine();
        System.out.print("Password : ");
            Password = sc.nextLine();
        System.out.print("\n");
    }
    public void Login(){
        System.out.println("\tLogin");
        System.out.print("Username : ");
        sc.nextLine();
            Username = sc.nextLine();
        System.out.print("Password : ");
            Password = sc.nextLine();
        System.out.print("\n");
    }
    public void lensAdjustment(){
        int pilihan=0;
        LensScales lensScales=new LensScales(miopi,presmiopi,slindris);
        do{
            System.out.println("1.Miopi");
            System.out.println("2.Presmiopi");
            System.out.println("3.Slindris");
            System.out.println("4.Exit");
            pilihan=sc.nextInt();
            if(pilihan==1){
                lensScales.setMiopi();
   
            }else if(pilihan==2){
                lensScales.setPresmiopi();
            }
            else if(pilihan==3){
                lensScales.setSlindris();
            }  
        }while(pilihan!=4);
       lensScales.Combination();
    }
   
}
