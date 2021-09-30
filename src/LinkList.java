public class LinkList {

    public static void main(String[] ar) {
        /*
        2->3->4           (432)
	5->6->7           (765)
	7->9->3->1
         */
       /* Node head1 = new Node(2);
        head1.next = new Node(3);
        head1.next.next = new Node(6);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(7);

        Node newHead = sum(head1, head2);

        for (Node node = newHead; node != null; node = node.next) {
            System.out.print(node.value + "->");
        }*/
        System.out.println(isPalindrome("a a/bcb b!a_a"));
    }

    public static Node sum(Node head1, Node head2) {
        Node newHead = null;
        Node tempNode3 = newHead;
        for (Node tempNode1 = head1, tempNode2 = head2; tempNode1 != null; tempNode1 = tempNode1.next, tempNode2 = tempNode2.next) {
            int sum = tempNode1.value + tempNode2.value;
            if (sum > 9) {
                while (sum > 0) {
                    int rem = sum % 10;

                    tempNode3.next = new Node(rem);
                    tempNode3 = tempNode3.next;

                    sum = sum / 10;
                }

            } else {
                tempNode3.next = new Node(sum);
                tempNode3 = tempNode3.next;
            }
        }

        return newHead;

    }


    public static class Node {
        public Node(int value) {
            this.value = value;
        }

        int value;
        Node next;
    }

    public static boolean isPalindrome(String str) {
        boolean isP = true;
        int lef = -1, right = -1;
        for (int i = 0, j = str.length() - 1; i < j; ) {
            if (Character.isAlphabetic(str.charAt(i))) {
                lef = i;
            } else {
                i++;
            }
            if (Character.isAlphabetic(str.charAt(j))) {
                right = j;
            } else {
                j--;
            }
            if (lef != -1 && right != -1) {
                if (Character.isAlphabetic(str.charAt(lef)) && Character.isAlphabetic(str.charAt(right))) {
                    if (Character.toLowerCase(str.charAt(lef)) != Character.toLowerCase(str.charAt(right))) {
                        isP = false;
                        break;
                    } else {
                        lef = -1;
                        right = -1;
                        i++;
                        j--;
                    }
                }
            }

        }
        return isP;
    }
}
