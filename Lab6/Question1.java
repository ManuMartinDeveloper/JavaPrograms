package Lab6;
//You are provided with an integer array `coins[]` of size N, representing different denominations
// of currency, and an integer `sum`. The task is to find the number of ways you can make the given
// sum by using different combinations from the coins[] array. Assume that you have an infinite
// supply of each type of coin, and you can use any coin as many times as needed.Incorporate
// multithreading concepts to optimize the computation of different combinations. Design a
// concurrent solution that utilizes multiple threads to explore and calculate the various
// combinations efficiently.

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of Array : ");
        int n = input.nextInt();
        int[] coins = new int[n];

        System.out.println("Please enter the sum value : ");
        int sum = input.nextInt();
        Thread t1 = new Thread(() -> {
            synchronized (coins) {
                System.out.print("Please enter the coins value: ");
                for (int i = 0; i < n; i++) {
                    coins[i] = input.nextInt();
                }
            }
        });
        List<List<Integer>> v = new ArrayList<>();
        Thread t2 = new Thread(() -> {
            synchronized (coins) {
                combiFunction(coins, sum, 0, new ArrayList<>(), v);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        for (List<Integer> combination : v) {
            System.out.println(combination);
        }
    }

    static void combiFunction(int[] array, int target, int start, List<Integer> current,
            List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < array.length; i++) {
            if (array[i] <= target) {
                current.add(array[i]);
                combiFunction(array, target - array[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

}
