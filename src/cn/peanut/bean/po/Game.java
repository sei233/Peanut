package cn.peanut.bean.po;

public class Game {
    private Integer gameId;

    private String gameName;

    private String gameTitle;

    private Integer gameDownload;

    private Integer gameSize;

    private Byte gameStatus;

    private Byte gameType;

    private Byte gameOperation;

    private Byte gameAdviseType;

    private String gameIcon;

    private String gamePic;

    private String gameIosaddress;

    private String gameAndroidaddress;

    private String gameDescription;

    private Integer gameYear;

    private Integer gameMonth;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle == null ? null : gameTitle.trim();
    }

    public Integer getGameDownload() {
        return gameDownload;
    }

    public void setGameDownload(Integer gameDownload) {
        this.gameDownload = gameDownload;
    }

    public Integer getGameSize() {
        return gameSize;
    }

    public void setGameSize(Integer gameSize) {
        this.gameSize = gameSize;
    }

    public Byte getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Byte gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Byte getGameType() {
        return gameType;
    }

    public void setGameType(Byte gameType) {
        this.gameType = gameType;
    }

    public Byte getGameOperation() {
        return gameOperation;
    }

    public void setGameOperation(Byte gameOperation) {
        this.gameOperation = gameOperation;
    }

    public Byte getGameAdviseType() {
        return gameAdviseType;
    }

    public void setGameAdviseType(Byte gameAdviseType) {
        this.gameAdviseType = gameAdviseType;
    }

    public String getGameIcon() {
        return gameIcon;
    }

    public void setGameIcon(String gameIcon) {
        this.gameIcon = gameIcon == null ? null : gameIcon.trim();
    }

    public String getGamePic() {
        return gamePic;
    }

    public void setGamePic(String gamePic) {
        this.gamePic = gamePic == null ? null : gamePic.trim();
    }

    public String getGameIosaddress() {
        return gameIosaddress;
    }

    public void setGameIosaddress(String gameIosaddress) {
        this.gameIosaddress = gameIosaddress == null ? null : gameIosaddress.trim();
    }

    public String getGameAndroidaddress() {
        return gameAndroidaddress;
    }

    public void setGameAndroidaddress(String gameAndroidaddress) {
        this.gameAndroidaddress = gameAndroidaddress == null ? null : gameAndroidaddress.trim();
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription == null ? null : gameDescription.trim();
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public void setGameYear(Integer gameYear) {
        this.gameYear = gameYear;
    }

    public Integer getGameMonth() {
        return gameMonth;
    }

    public void setGameMonth(Integer gameMonth) {
        this.gameMonth = gameMonth;
    }
}