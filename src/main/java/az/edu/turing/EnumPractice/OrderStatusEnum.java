package az.edu.turing.EnumPractice;

public enum OrderStatusEnum {
    ACCEPTED, SHIPPED, DELIVERED, CANCELED;

    public static /*final*/ OrderStatusEnum findStatusV2(String status) {
        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (value.name().equals(status)) {
                return value;
            }
        }
        return null;
    }
}
