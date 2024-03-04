package az.edu.turing.turing_tasks;

import java.util.Scanner;

public class CreatingShapesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count of the Rows:" + " ");
        int k = in.nextInt();
        int col = 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("x");
            }
            col++;
            System.out.println();
        }
    }
}

/*public class CreatingShapesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count of the Rows:" + " ");
        int k = in.nextInt();
        int col = 1;
        int space;
        space = k-1;
        for (int i = 0; i < k; i++) {
            for (int z = 0; z < space; z++){
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("x");
            }
            col++;
            space--;
            System.out.println();
        }
    }
}


public class CreatingShapesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count of the Rows:" + " ");
        int k = in.nextInt();
        int col = 1;
        int space;
        space = k-1;
        for (int i = 0; i < k; i++) {
            for (int z = 0; z < space; z++){
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("x");
            }
            col+=2;
            space--;
            System.out.println();
        }
    }
}

public class CreatingShapesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count of the Rows:" + " ");
        int k = in.nextInt();
        int col = 1;
        int space;
        space = k-1;
        for (int i = 0; i < k; i++) {
            for (int z = 0; z < space; z++){
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("x");
            }
            col+=2;
            space--;
            System.out.println();
        }
        col-=4;
        space=1;
        for (int i = 0; i < k; i++) {
            for (int z = 0; z < space; z++){
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("x");
            }
            col-=2;
            space++;
            System.out.println();
        }
    }
}*/
