package information;

import java.io.*;

public class PhoneInfo implements Serializable {
    public String name, phoneNumber;

    public PhoneInfo(String n, String p) {
        name = n;
        phoneNumber = p;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object o) {
        PhoneInfo p = (PhoneInfo) o;

        if (name.compareTo(p.name) == 0)
            return true;
        else
            return false;
    }

    public String toString() {
        String result = "";
        result += "이름 : " + name + "\n";
        result += "전화번호 : " + phoneNumber + "\n";
        return result;
    }
}