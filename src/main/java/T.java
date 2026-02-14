interface Itr{
    int a(int i);
    default void aa(){}


}
public class T implements Itr {

    public int a(int i) {
        return 0;
    }
}
