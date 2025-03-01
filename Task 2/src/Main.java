public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        for (int i = 2; i <= 100; i+=2) {
                System.out.println("IT specialist with id: " + i + " is fired!");
        }

        int workerCounter = 2;
        while (workerCounter <= 100) {
            System.out.println("IT specialist with id: " + workerCounter + " is fired!");
            workerCounter += 2;

        }
    }
}
