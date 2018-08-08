package cn.peanut.bean.vo;

import cn.peanut.bean.po.Game;
import cn.peanut.util.StringUtil;

public class GameVo {
    private Game game;
    private String gameStatus;
    private String gameType;
    private String gameOperation;
    private String gameAdviseType;
    private String gameUpdateDate;

    public String getGameUpdateDate() {
        return gameUpdateDate;
    }

    public void setGameUpdateDate() {
        this.gameUpdateDate = game.getGameYear()+"-"+game.getGameMonth();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus() {
        if (game.getGameStatus() != null) {
            switch (game.getGameStatus()) {
                case 1:
                    this.gameStatus = "启用";
                    break;
                default:
                    this.gameStatus = "下线";
            }
        }
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType() {
        if (game.getGameType() != null) {
            switch (game.getGameType()) {
                case 0:
                    this.gameType = "休闲益智";
                    break;
                case 1:
                    this.gameType = "网络游戏";
                    break;
                case 2:
                    this.gameType = "动作冒险";
                    break;
                case 3:
                    this.gameType = "棋牌中心";
                    break;
                case 4:
                    this.gameType = "飞行射击";
                    break;
                case 5:
                    this.gameType = "经营策略";
                    break;
                case 6:
                    this.gameType = "角色扮演";
                    break;
                case 7:
                    this.gameType = "体育竞技";
                    break;
                default:
                    this.gameType = "未知";
            }
        }

    }

    public String getGameOperation() {
        return gameOperation;
    }

    public void setGameOperation() {
        if (game.getGameOperation() != null) {
            switch (game.getGameOperation()) {
                case 0:
                    this.gameOperation = "all";
                    break;
                case 1:
                    this.gameOperation = "ios";
                    break;
                case 2:
                    this.gameOperation = "android";
                    break;
                default:
                    this.gameOperation = "unknown";
            }
        }
    }

    public String getGameAdviseType() {
        return gameAdviseType;
    }

    public void setGameAdviseType() {
        if (game.getGameAdviseType() != null) {
            switch (game.getGameAdviseType()) {
                case 0:
                    this.gameAdviseType = "普通";
                    break;
                case 1:
                    this.gameAdviseType = "最新";
                    break;
                case 2:
                    this.gameAdviseType = "精选";
                    break;
                case 3:
                    this.gameAdviseType = "首页推荐";
                    break;
                default:
                    this.gameAdviseType = "未知";
            }
        }
    }
}