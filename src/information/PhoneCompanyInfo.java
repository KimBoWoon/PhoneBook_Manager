package information;

public class PhoneCompanyInfo extends PhoneInfo {
    private String company;

    public PhoneCompanyInfo(String n, String p, String c) {
        super(n, p);
        company = c;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("회사 : " + company);
    }

    public String toString() {
        super.showInfo();
        return "회사 : " + company + "\n";
    }
}