public class StringKnowledge {
    public static void main(String[] args) {

        if (endOther("KERR", "hi my name is jadn kerr")) {
            System.out.println("The method evaluated to true");
        } else {
            System.out.println("The method evaluated to false");
        }
    }

    public static boolean endOther(String a, String b) {
        //Question 1
        if (a.toLowerCase().contains(b.toLowerCase())) {
            return a.toLowerCase().indexOf(b.toLowerCase()) == (a.length() - b.length());
        }
        if (b.toLowerCase().contains(a.toLowerCase())) {
            return b.toLowerCase().indexOf(a.toLowerCase()) == (b.length() - a.length());
        }
        return false;
    }

}
