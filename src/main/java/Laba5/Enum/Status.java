package Laba5.Enum;

public enum Status {
    ALLOWED("���������"),
    BY_PRESCRIPTION("�� �������"),
    PROHIBITED("���������");

    private String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
