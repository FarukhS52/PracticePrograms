public class EagerWayOfSingleton {
    private static EagerWayOfSingleton singleton = new EagerWayOfSingleton();

    private EagerWayOfSingleton(){}

    public static EagerWayOfSingleton getSingleton(){
        return singleton;
    }

}
