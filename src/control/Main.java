package control;

import phoneBookManager.PhoneBookManager;

import java.util.*;

import exception.MenuNumException;

interface MenuNum {
    int INPUT = 1, SEARCH = 2, DELETE = 3, PRINT = 4, EXIT = 5;
}

class MenuViewer {
    public static void showMenu() {
        System.out.println("선택하세요.");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 입력된 데이터 출력");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 : ");
    }
}

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBookManager manager = PhoneBookManager.createManagerInst();
        int choice;

        while (true) {
            try {
                MenuViewer.showMenu();
                choice = input.nextInt();
                input.nextLine();

                if (choice < MenuNum.INPUT || choice > MenuNum.EXIT)
                    throw new MenuNumException(choice);

                switch (choice) {
                    case MenuNum.INPUT:
                        manager.inputData();
                        break;
                    case MenuNum.SEARCH:
                        manager.searchData();
                        break;
                    case MenuNum.DELETE:
                        manager.deleteData();
                        break;
                    case MenuNum.PRINT:
                        manager.print();
                        break;
                    case MenuNum.EXIT:
                        manager.storeToFile();
                        System.out.print("프로그램이 종료 됩니다.");
                        return;
                }
            } catch (MenuNumException e) {
                System.out.println(e.getMessage());
                System.out.println("처음부터 다시 진행합니다.");
            }
        }
    }
}