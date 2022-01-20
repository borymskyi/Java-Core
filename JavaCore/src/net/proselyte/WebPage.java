package net.proselyte;

public class WebPage {
    public static final String WEBSITE = "https://proselyte.net/";
    private String url;
    private String content;

    public WebPage() {
    }

    public WebPage(String id, String content) {
        this.url = id;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "\n=================\n" +
                "WebSite: " + WEBSITE +
                "\nPage Info: " +
                "\nurl:" + url +
                "\ncontent:\n" + content +
                "\n=================\n";
    }
}