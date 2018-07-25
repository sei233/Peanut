package cn.peanut.bean.po;

import java.util.ArrayList;
import java.util.List;

public class GameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNull() {
            addCriterion("game_name is null");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNotNull() {
            addCriterion("game_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameNameEqualTo(String value) {
            addCriterion("game_name =", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotEqualTo(String value) {
            addCriterion("game_name <>", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThan(String value) {
            addCriterion("game_name >", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_name >=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThan(String value) {
            addCriterion("game_name <", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThanOrEqualTo(String value) {
            addCriterion("game_name <=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLike(String value) {
            addCriterion("game_name like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotLike(String value) {
            addCriterion("game_name not like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameIn(List<String> values) {
            addCriterion("game_name in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotIn(List<String> values) {
            addCriterion("game_name not in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameBetween(String value1, String value2) {
            addCriterion("game_name between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotBetween(String value1, String value2) {
            addCriterion("game_name not between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameTitleIsNull() {
            addCriterion("game_title is null");
            return (Criteria) this;
        }

        public Criteria andGameTitleIsNotNull() {
            addCriterion("game_title is not null");
            return (Criteria) this;
        }

        public Criteria andGameTitleEqualTo(String value) {
            addCriterion("game_title =", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleNotEqualTo(String value) {
            addCriterion("game_title <>", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleGreaterThan(String value) {
            addCriterion("game_title >", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleGreaterThanOrEqualTo(String value) {
            addCriterion("game_title >=", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleLessThan(String value) {
            addCriterion("game_title <", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleLessThanOrEqualTo(String value) {
            addCriterion("game_title <=", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleLike(String value) {
            addCriterion("game_title like", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleNotLike(String value) {
            addCriterion("game_title not like", value, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleIn(List<String> values) {
            addCriterion("game_title in", values, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleNotIn(List<String> values) {
            addCriterion("game_title not in", values, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleBetween(String value1, String value2) {
            addCriterion("game_title between", value1, value2, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameTitleNotBetween(String value1, String value2) {
            addCriterion("game_title not between", value1, value2, "gameTitle");
            return (Criteria) this;
        }

        public Criteria andGameDownloadIsNull() {
            addCriterion("game_download is null");
            return (Criteria) this;
        }

        public Criteria andGameDownloadIsNotNull() {
            addCriterion("game_download is not null");
            return (Criteria) this;
        }

        public Criteria andGameDownloadEqualTo(Integer value) {
            addCriterion("game_download =", value, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadNotEqualTo(Integer value) {
            addCriterion("game_download <>", value, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadGreaterThan(Integer value) {
            addCriterion("game_download >", value, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_download >=", value, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadLessThan(Integer value) {
            addCriterion("game_download <", value, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("game_download <=", value, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadIn(List<Integer> values) {
            addCriterion("game_download in", values, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadNotIn(List<Integer> values) {
            addCriterion("game_download not in", values, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadBetween(Integer value1, Integer value2) {
            addCriterion("game_download between", value1, value2, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("game_download not between", value1, value2, "gameDownload");
            return (Criteria) this;
        }

        public Criteria andGameSizeIsNull() {
            addCriterion("game_size is null");
            return (Criteria) this;
        }

        public Criteria andGameSizeIsNotNull() {
            addCriterion("game_size is not null");
            return (Criteria) this;
        }

        public Criteria andGameSizeEqualTo(Integer value) {
            addCriterion("game_size =", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotEqualTo(Integer value) {
            addCriterion("game_size <>", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeGreaterThan(Integer value) {
            addCriterion("game_size >", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_size >=", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLessThan(Integer value) {
            addCriterion("game_size <", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLessThanOrEqualTo(Integer value) {
            addCriterion("game_size <=", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeIn(List<Integer> values) {
            addCriterion("game_size in", values, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotIn(List<Integer> values) {
            addCriterion("game_size not in", values, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeBetween(Integer value1, Integer value2) {
            addCriterion("game_size between", value1, value2, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("game_size not between", value1, value2, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameStatusIsNull() {
            addCriterion("game_status is null");
            return (Criteria) this;
        }

        public Criteria andGameStatusIsNotNull() {
            addCriterion("game_status is not null");
            return (Criteria) this;
        }

        public Criteria andGameStatusEqualTo(Byte value) {
            addCriterion("game_status =", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotEqualTo(Byte value) {
            addCriterion("game_status <>", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusGreaterThan(Byte value) {
            addCriterion("game_status >", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("game_status >=", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusLessThan(Byte value) {
            addCriterion("game_status <", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusLessThanOrEqualTo(Byte value) {
            addCriterion("game_status <=", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusIn(List<Byte> values) {
            addCriterion("game_status in", values, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotIn(List<Byte> values) {
            addCriterion("game_status not in", values, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusBetween(Byte value1, Byte value2) {
            addCriterion("game_status between", value1, value2, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("game_status not between", value1, value2, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNull() {
            addCriterion("game_type is null");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNotNull() {
            addCriterion("game_type is not null");
            return (Criteria) this;
        }

        public Criteria andGameTypeEqualTo(Byte value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(Byte value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(Byte value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(Byte value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(Byte value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<Byte> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<Byte> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(Byte value1, Byte value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("game_type not between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameOperationIsNull() {
            addCriterion("game_operation is null");
            return (Criteria) this;
        }

        public Criteria andGameOperationIsNotNull() {
            addCriterion("game_operation is not null");
            return (Criteria) this;
        }

        public Criteria andGameOperationEqualTo(Byte value) {
            addCriterion("game_operation =", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotEqualTo(Byte value) {
            addCriterion("game_operation <>", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationGreaterThan(Byte value) {
            addCriterion("game_operation >", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationGreaterThanOrEqualTo(Byte value) {
            addCriterion("game_operation >=", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationLessThan(Byte value) {
            addCriterion("game_operation <", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationLessThanOrEqualTo(Byte value) {
            addCriterion("game_operation <=", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationIn(List<Byte> values) {
            addCriterion("game_operation in", values, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotIn(List<Byte> values) {
            addCriterion("game_operation not in", values, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationBetween(Byte value1, Byte value2) {
            addCriterion("game_operation between", value1, value2, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotBetween(Byte value1, Byte value2) {
            addCriterion("game_operation not between", value1, value2, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeIsNull() {
            addCriterion("game_advise_type is null");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeIsNotNull() {
            addCriterion("game_advise_type is not null");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeEqualTo(Byte value) {
            addCriterion("game_advise_type =", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotEqualTo(Byte value) {
            addCriterion("game_advise_type <>", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeGreaterThan(Byte value) {
            addCriterion("game_advise_type >", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("game_advise_type >=", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeLessThan(Byte value) {
            addCriterion("game_advise_type <", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("game_advise_type <=", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeIn(List<Byte> values) {
            addCriterion("game_advise_type in", values, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotIn(List<Byte> values) {
            addCriterion("game_advise_type not in", values, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeBetween(Byte value1, Byte value2) {
            addCriterion("game_advise_type between", value1, value2, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("game_advise_type not between", value1, value2, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameIconIsNull() {
            addCriterion("game_icon is null");
            return (Criteria) this;
        }

        public Criteria andGameIconIsNotNull() {
            addCriterion("game_icon is not null");
            return (Criteria) this;
        }

        public Criteria andGameIconEqualTo(String value) {
            addCriterion("game_icon =", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconNotEqualTo(String value) {
            addCriterion("game_icon <>", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconGreaterThan(String value) {
            addCriterion("game_icon >", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconGreaterThanOrEqualTo(String value) {
            addCriterion("game_icon >=", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconLessThan(String value) {
            addCriterion("game_icon <", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconLessThanOrEqualTo(String value) {
            addCriterion("game_icon <=", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconLike(String value) {
            addCriterion("game_icon like", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconNotLike(String value) {
            addCriterion("game_icon not like", value, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconIn(List<String> values) {
            addCriterion("game_icon in", values, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconNotIn(List<String> values) {
            addCriterion("game_icon not in", values, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconBetween(String value1, String value2) {
            addCriterion("game_icon between", value1, value2, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGameIconNotBetween(String value1, String value2) {
            addCriterion("game_icon not between", value1, value2, "gameIcon");
            return (Criteria) this;
        }

        public Criteria andGamePicIsNull() {
            addCriterion("game_pic is null");
            return (Criteria) this;
        }

        public Criteria andGamePicIsNotNull() {
            addCriterion("game_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGamePicEqualTo(String value) {
            addCriterion("game_pic =", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicNotEqualTo(String value) {
            addCriterion("game_pic <>", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicGreaterThan(String value) {
            addCriterion("game_pic >", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicGreaterThanOrEqualTo(String value) {
            addCriterion("game_pic >=", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicLessThan(String value) {
            addCriterion("game_pic <", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicLessThanOrEqualTo(String value) {
            addCriterion("game_pic <=", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicLike(String value) {
            addCriterion("game_pic like", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicNotLike(String value) {
            addCriterion("game_pic not like", value, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicIn(List<String> values) {
            addCriterion("game_pic in", values, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicNotIn(List<String> values) {
            addCriterion("game_pic not in", values, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicBetween(String value1, String value2) {
            addCriterion("game_pic between", value1, value2, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGamePicNotBetween(String value1, String value2) {
            addCriterion("game_pic not between", value1, value2, "gamePic");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressIsNull() {
            addCriterion("game_iosAddress is null");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressIsNotNull() {
            addCriterion("game_iosAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressEqualTo(String value) {
            addCriterion("game_iosAddress =", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressNotEqualTo(String value) {
            addCriterion("game_iosAddress <>", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressGreaterThan(String value) {
            addCriterion("game_iosAddress >", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressGreaterThanOrEqualTo(String value) {
            addCriterion("game_iosAddress >=", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressLessThan(String value) {
            addCriterion("game_iosAddress <", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressLessThanOrEqualTo(String value) {
            addCriterion("game_iosAddress <=", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressLike(String value) {
            addCriterion("game_iosAddress like", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressNotLike(String value) {
            addCriterion("game_iosAddress not like", value, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressIn(List<String> values) {
            addCriterion("game_iosAddress in", values, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressNotIn(List<String> values) {
            addCriterion("game_iosAddress not in", values, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressBetween(String value1, String value2) {
            addCriterion("game_iosAddress between", value1, value2, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameIosaddressNotBetween(String value1, String value2) {
            addCriterion("game_iosAddress not between", value1, value2, "gameIosaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressIsNull() {
            addCriterion("game_androidAddress is null");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressIsNotNull() {
            addCriterion("game_androidAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressEqualTo(String value) {
            addCriterion("game_androidAddress =", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressNotEqualTo(String value) {
            addCriterion("game_androidAddress <>", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressGreaterThan(String value) {
            addCriterion("game_androidAddress >", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressGreaterThanOrEqualTo(String value) {
            addCriterion("game_androidAddress >=", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressLessThan(String value) {
            addCriterion("game_androidAddress <", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressLessThanOrEqualTo(String value) {
            addCriterion("game_androidAddress <=", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressLike(String value) {
            addCriterion("game_androidAddress like", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressNotLike(String value) {
            addCriterion("game_androidAddress not like", value, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressIn(List<String> values) {
            addCriterion("game_androidAddress in", values, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressNotIn(List<String> values) {
            addCriterion("game_androidAddress not in", values, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressBetween(String value1, String value2) {
            addCriterion("game_androidAddress between", value1, value2, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameAndroidaddressNotBetween(String value1, String value2) {
            addCriterion("game_androidAddress not between", value1, value2, "gameAndroidaddress");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionIsNull() {
            addCriterion("game_description is null");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionIsNotNull() {
            addCriterion("game_description is not null");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionEqualTo(String value) {
            addCriterion("game_description =", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionNotEqualTo(String value) {
            addCriterion("game_description <>", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionGreaterThan(String value) {
            addCriterion("game_description >", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("game_description >=", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionLessThan(String value) {
            addCriterion("game_description <", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionLessThanOrEqualTo(String value) {
            addCriterion("game_description <=", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionLike(String value) {
            addCriterion("game_description like", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionNotLike(String value) {
            addCriterion("game_description not like", value, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionIn(List<String> values) {
            addCriterion("game_description in", values, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionNotIn(List<String> values) {
            addCriterion("game_description not in", values, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionBetween(String value1, String value2) {
            addCriterion("game_description between", value1, value2, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameDescriptionNotBetween(String value1, String value2) {
            addCriterion("game_description not between", value1, value2, "gameDescription");
            return (Criteria) this;
        }

        public Criteria andGameYearIsNull() {
            addCriterion("game_year is null");
            return (Criteria) this;
        }

        public Criteria andGameYearIsNotNull() {
            addCriterion("game_year is not null");
            return (Criteria) this;
        }

        public Criteria andGameYearEqualTo(Integer value) {
            addCriterion("game_year =", value, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearNotEqualTo(Integer value) {
            addCriterion("game_year <>", value, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearGreaterThan(Integer value) {
            addCriterion("game_year >", value, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_year >=", value, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearLessThan(Integer value) {
            addCriterion("game_year <", value, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearLessThanOrEqualTo(Integer value) {
            addCriterion("game_year <=", value, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearIn(List<Integer> values) {
            addCriterion("game_year in", values, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearNotIn(List<Integer> values) {
            addCriterion("game_year not in", values, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearBetween(Integer value1, Integer value2) {
            addCriterion("game_year between", value1, value2, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameYearNotBetween(Integer value1, Integer value2) {
            addCriterion("game_year not between", value1, value2, "gameYear");
            return (Criteria) this;
        }

        public Criteria andGameMonthIsNull() {
            addCriterion("game_month is null");
            return (Criteria) this;
        }

        public Criteria andGameMonthIsNotNull() {
            addCriterion("game_month is not null");
            return (Criteria) this;
        }

        public Criteria andGameMonthEqualTo(Integer value) {
            addCriterion("game_month =", value, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthNotEqualTo(Integer value) {
            addCriterion("game_month <>", value, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthGreaterThan(Integer value) {
            addCriterion("game_month >", value, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_month >=", value, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthLessThan(Integer value) {
            addCriterion("game_month <", value, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthLessThanOrEqualTo(Integer value) {
            addCriterion("game_month <=", value, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthIn(List<Integer> values) {
            addCriterion("game_month in", values, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthNotIn(List<Integer> values) {
            addCriterion("game_month not in", values, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthBetween(Integer value1, Integer value2) {
            addCriterion("game_month between", value1, value2, "gameMonth");
            return (Criteria) this;
        }

        public Criteria andGameMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("game_month not between", value1, value2, "gameMonth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}