package Class32;

public enum CrunchifyEnumCompany {
    GOOGLE("G"), YAHOO("Y"), EBAY("E"), PAYPAL("P");

    private String companyLetter;

    private CrunchifyEnumCompany(String s) {
        companyLetter = s;
    }

    public String getCompanyLetter() {
        return companyLetter;
    }
}
