package Aug.ex_11082024.Interface.ex2;

public interface Engine {
    void startEngine();

    void stopEngine();

    //you can't create concrete method inside interface ,if you want to create method body then
    // you have to use default or static keyword with method.

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();
//   void m4(){
//       System.out.println("Not possible");
//   }
}
