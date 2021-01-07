public class VisionGlassClient {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject= new ConcreteSubject();
        CurrentLightIntensity currentLightIntensity= new CurrentLightIntensity(concreteSubject);

        /* lazy instatiaton */
        VisionGlass visionGlass = VisionGlass.getInstance();
        visionGlass.showMenu();
        visionGlass.lensAdjustment();
        concreteSubject.setMeasurements(30);
    }
}
