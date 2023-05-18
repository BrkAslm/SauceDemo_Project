package enums;

public enum LINKS {
    BASEURL("")
    ;
    private String getLink;

    LINKS(String getLink) {
        this.getLink = getLink;
    }

    public String getLink() {
        return getLink;
    }
}
