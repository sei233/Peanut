package cn.peanut.bean.vo;

public class GameVo {

    private Integer gameId;

    private String gameName;

    private String gameTitle;

    private Integer gameDownload;

    private Integer gameSize;

    private String gameStatus;

    private String gameType;

    private String gameOperation;

    private String gameAdviseType;

    private String gameIcon;

    private String gamePic;

    private String gameIosaddress;

    private String gameAndroidaddress;

    private String gameDescription;

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

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameOperation() {
        return gameOperation;
    }

    public void setGameOperation(String gameOperation) {
        this.gameOperation = gameOperation;
    }

    public String getGameAdviseType() {
        return gameAdviseType;
    }

    public void setGameAdviseType(String gameAdviseType) {
        this.gameAdviseType = gameAdviseType;
    }


    public String getGameIcon() {
        return gameIcon;
    }

    public void setGameIcon(String gameIcon) {
        this.gameIcon = gameIcon;
    }

    public String getGamePic() {
        return gamePic;
    }

    public void setGamePic(String gamePic) {
        this.gamePic = gamePic;
    }

    public String getGameIosaddress() {
        return gameIosaddress;
    }

    public void setGameIosaddress(String gameIosaddress) {
        this.gameIosaddress = gameIosaddress;
    }

    public String getGameAndroidaddress() {
        return gameAndroidaddress;
    }

    public void setGameAndroidaddress(String gameAndroidaddress) {
        this.gameAndroidaddress = gameAndroidaddress;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }
}