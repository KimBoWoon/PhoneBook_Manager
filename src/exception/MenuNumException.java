package exception;

public class MenuNumException extends Exception {
    private int choice;

    public MenuNumException(int c) {
        choice = c;
    }

    public String getMessage() {
        return choice + "에 해당하는 메뉴가 없습니다.";
    }
}