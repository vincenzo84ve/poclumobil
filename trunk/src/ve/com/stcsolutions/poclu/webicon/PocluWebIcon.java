package ve.com.stcsolutions.poclu.webicon;

public class PocluWebIcon extends WebIcon {
	
	public static void main(String[] args)
    {
        PocluWebIcon webIcon = new PocluWebIcon();
        webIcon.launchBrowser(DEFAULT_BROWSER, "http://www.poclu.com/mobil/");
        webIcon.close();
    }
}
