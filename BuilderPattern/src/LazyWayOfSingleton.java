public class LazyWayOfSingleton {
    private static LazyWayOfSingleton singleton;
     private LazyWayOfSingleton(){}


    //lazy initialization
    public static LazyWayOfSingleton getSingleton(){

         if(singleton==null){
                singleton = new LazyWayOfSingleton();
         }

         return singleton;
    }
}
