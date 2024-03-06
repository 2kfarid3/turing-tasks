package az.edu.turing.EnumPractice;

import java.util.Scanner;

import static az.edu.turing.EnumPractice.OrderStatusEnum.*;

public class StatusCheckingApp {
    public static void main(String[] args) {
        final String status = new Scanner(System.in).nextLine();
        OrderStatusEnum statusEnum = OrderStatusEnum.findStatusV2(status.toUpperCase());
        System.out.println(statusEnum);
        if (statusEnum != null) {
            sendEmail(statusEnum);
        } else {
            System.out.println("Invalid status! Please enter a valid status.");
        }
    }

    private static void sendEmail(OrderStatusEnum status) {
        if (status == ACCEPTED) {
            System.out.println("Your order accepted!");
        } else if (status == SHIPPED) {
            System.out.println("Your order has shipped!");
        } else if (status == DELIVERED) {
            System.out.println("Your order has delivered!");
        } else {
            System.out.println("System error!");
        }
    }
}
