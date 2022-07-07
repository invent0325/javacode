public class Screen {
    boolean colorYesNo;
    String ScreenSize;
    String hasSpeaker;
    int screenPrize;

    public Screen() {
    }

    public Screen(boolean colorYesNo, String screenSize, String hasSpeaker, int screenPrize) {
        this.colorYesNo = colorYesNo;
        ScreenSize = screenSize;
        this.hasSpeaker = hasSpeaker;
        this.screenPrize = screenPrize;
    }

    public boolean isColorYesNo() {
        return colorYesNo;
    }

    public void setColorYesNo(boolean colorYesNo) {
        this.colorYesNo = colorYesNo;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getHasSpeaker() {
        return hasSpeaker;
    }

    public void setHasSpeaker(String hasSpeaker) {
        this.hasSpeaker = hasSpeaker;
    }

    public int getScreenPrize() {
        return screenPrize;
    }

    public void setScreenPrize(int screenPrize) {
        this.screenPrize = screenPrize;
    }
}