public class Main {
    public static void main(String[] args) {
        LazyWayOfSingleton singleton = LazyWayOfSingleton.getSingleton();
        System.out.println(singleton.hashCode());

        LazyWayOfSingleton singleton1 = LazyWayOfSingleton.getSingleton();
        System.out.println(singleton1.hashCode());

        EagerWayOfSingleton singleton2 = EagerWayOfSingleton.getSingleton();
        System.out.println(singleton2.hashCode());

        EagerWayOfSingleton singleton3 = EagerWayOfSingleton.getSingleton();
        System.out.println(singleton3.hashCode());

        Builder builder = new Builder.UserBuilder()
                .setAge(22)
                .setName("Farookh")
                .setPhone("8824679007")
                .setStudent_id(1)
                .setStandard(12)
                .build();
        System.out.println(builder.toString());
    }
}
