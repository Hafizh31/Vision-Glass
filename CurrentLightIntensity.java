public class CurrentLightIntensity implements Observer, DisplayElement {
    private float LightIntensity;
    private Subject ConcreteSubject;
 
    public CurrentLightIntensity(Subject ConcreteSubject) {
        this.ConcreteSubject = ConcreteSubject;
        ConcreteSubject.registerObserver(this);
    }

    public void update(float LightIntensity) {
        this.LightIntensity = LightIntensity;
        display();
    }

    public void display() {
        if (LightIntensity>=30){
            System.out.println("warna lensa : Gelap");
        }else if(LightIntensity<30){
            System.out.println("warna lensa : Transparan");
        }
        System.out.println("Intensitas cahaya sementara : " + LightIntensity);
 
    }
}