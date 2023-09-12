public class Chat {
    public static void main(String[] args) {
        User a = new User("Bob");
        User b = new User("Carter");
        User c = new User("John");
        a.addObserver(b);
        a.addObserver(c);
        b.addObserver(a);
        b.addObserver(c);
        c.addObserver(b);
        c.addObserver(a);
    }
}
