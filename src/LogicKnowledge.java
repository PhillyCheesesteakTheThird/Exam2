public class LogicKnowledge {
    public static void main(String[] args) {
        System.out.println(greenTicket(1, 1, 2));
        System.out.println(makeChocolate(4, 2, 7));
    }

    public static int greenTicket(int a, int b, int c) {
        //Question 3
        if ((a == b) && (b == c)) {
            return 20;
        } else if ((a == b) || (b == c)) {
            return 10;
        }
        return 0;
    }

    public static int makeChocolate(int smallChoc, int largeChoc, int goalChoc) {
        //Question 4
        if ((smallChoc + (largeChoc * 5)) < goalChoc) {
            return -1;
        }
        return goalChoc % 5;
    }
}
