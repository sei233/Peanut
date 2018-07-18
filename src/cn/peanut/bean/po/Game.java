package cn.peanut.bean.po;


public class Game {
    private Integer gameId;

    private String gameName;

    private String gameTitle;

    private Integer gameDownload;

    private Integer gameSize;

    private Byte gameStatus;

    private String gameType;

    private String gameOperation;

    private String gameAdviseType;

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

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public String getGameOperation() {
        return gameOperation;
    }

    public void setGameOperation(String gameOperation) {
        this.gameOperation = gameOperation == null ? null : gameOperation.trim();
    }

    public String getGameAdviseType() {
        return gameAdviseType;
    }

    public void setGameAdviseType(String gameAdviseType) {
        this.gameAdviseType = gameAdviseType == null ? null : gameAdviseType.trim();
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameTitle='" + gameTitle + '\'' +
                ", gameDownload=" + gameDownload +
                ", gameSize=" + gameSize +
                ", gameStatus=" + gameStatus +
                ", gameType='" + gameType + '\'' +
                ", gameOperation='" + gameOperation + '\'' +
                ", gameAdviseType='" + gameAdviseType + '\'' +
                '}';
    }
}