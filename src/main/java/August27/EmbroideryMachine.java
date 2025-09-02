package August27;

public class EmbroideryMachine {

    public static void main(String[] args) {

// Creating an object to represent a thread
        // 2 objects = 2 threads
MultiThreadThing multiThreadThing1 = new MultiThreadThing();
MultiThreadThing multiThreadThing2 = new MultiThreadThing();

/*
        multiThreadThing1.run();
        multiThreadThing2.run();
        .run() works in sequence, which defeats the purpose of concurrent threads
*/
        multiThreadThing1.start();
        multiThreadThing2.start();
/*
        use .start() for concurrent threads, works independently at once,
        no guarantee which thread will run
*/

    }


}
