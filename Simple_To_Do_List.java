import java.util.*;

class Simple_To_Do_List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("**** Rule For To Do List ****");
        System.out.println("1.Add in List\n2.Remove from List\n3.View List\n4.Exit\n");

        while (true) {
            System.out.print("What You Want: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Adding Item = ");
                    String newAdd = sc.next();
                    list.add(newAdd);
                    System.out.println("Item Added Succesfully!\n");
                    break;

                case 2:
                    System.out.print("Remove Item No. = ");
                    int removeIdx = sc.nextInt();
                    list.remove(removeIdx - 1);
                    System.out.println("Item Removed Succesfully!\n");
                    break;

                case 3:
                    System.out.print("List : ");
                    System.out.println(list + "\n");
                    break;

                case 4:
                    return;
            }
        }
    }
}