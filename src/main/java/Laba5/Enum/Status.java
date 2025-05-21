package Laba5.Enum;

public enum Status {
    ALLOWED("Разрешено"),
    BY_PRESCRIPTION("По рецепту"),
    PROHIBITED("Запрещено");

    private String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
