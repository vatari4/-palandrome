public class Main {
    public static void main(String[] args) {
        String str = "madam";
        LinkedList<Character> list = new LinkedList<>();
        for (char ch: str.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalilandrom = true;
        int i = 0;

        while (iterator.hasNext() && reverseIterator.hasPrevious() && i <= list.size() / 2) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalilandrom = false;
                break;
            }
            i++;
        }

        if(isPalilandrom) {
            System.out.println("Palilandrome");
        } else {
            System.out.println("Not palilandrome");
        }
    }
}
