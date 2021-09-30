package mmt;

public class MainClass {
    public static void main(String[] args) {
        //10101= 1+0+1*2(2)+0+1*2(4)=21
        // System.out.println(BinToDec(110010));
        //"abc": abc,acb,bac,bca,cab,cba
        //Node node = new Node(10, null);
        //LinkList linkList = new LinkList(node);
        //linkList.insert(20);
        //linkList.insert(30);
        // linkList.insert(40);
        // linkList.print();
        // linkList.print();
        // linkList.printReverse(node);
        printPerm("abc", "");
    }

    public static double BinToDec(int num) {
        double res = 0;
        int pow = 0;
        //get the remainder
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            if (remainder != 0) {
                res += Math.pow(2, pow);
            }
            pow++;
        }
        return res;
    }

    static void printPerm(String str, String ans) {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPerm(ros, ans + ch);
        }
    }


}
