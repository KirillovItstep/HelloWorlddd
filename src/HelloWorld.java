public class HelloWorld {

    public static void main(String[] args) {
        System.out.print("Hello, world!");
        System.out.println("Привет, мир!");
        for (int i=0; i< args.length; i++)
            System.out.println(args[i]);
        run();
    }

    private static void run(){
        System.out.println("sdfds");
    }
}

