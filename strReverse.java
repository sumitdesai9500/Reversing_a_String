public class strReverse {
    public static void main(String args[]) {
        // reverse using forloop()

        StringBuilder sn = new StringBuilder("hello");

        for (int i = 0; i < sn.length() / 2; i++) {
            int front = i;
            int back = sn.length() - 1 - i;
            // Assigning the char on particular index to its variables
            char frontChar = sn.charAt(front);
            char backChar = sn.charAt(back);
            // replacing || Swapping
            sn.setCharAt(front, backChar);
            sn.setCharAt(back, frontChar);
        }

        System.out.println("Reverse:" + sn);

    }
}
