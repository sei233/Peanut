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

        public Criteria andGameTypeEqualTo(String value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(String value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(String value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(String value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(String value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLike(String value) {
            addCriterion("game_type like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotLike(String value) {
            addCriterion("game_type not like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<String> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<String> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(String value1, String value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(String value1, String value2) {
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

        public Criteria andGameOperationEqualTo(String value) {
            addCriterion("game_operation =", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotEqualTo(String value) {
            addCriterion("game_operation <>", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationGreaterThan(String value) {
            addCriterion("game_operation >", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationGreaterThanOrEqualTo(String value) {
            addCriterion("game_operation >=", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationLessThan(String value) {
            addCriterion("game_operation <", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationLessThanOrEqualTo(String value) {
            addCriterion("game_operation <=", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationLike(String value) {
            addCriterion("game_operation like", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotLike(String value) {
            addCriterion("game_operation not like", value, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationIn(List<String> values) {
            addCriterion("game_operation in", values, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotIn(List<String> values) {
            addCriterion("game_operation not in", values, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationBetween(String value1, String value2) {
            addCriterion("game_operation between", value1, value2, "gameOperation");
            return (Criteria) this;
        }

        public Criteria andGameOperationNotBetween(String value1, String value2) {
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

        public Criteria andGameAdviseTypeEqualTo(String value) {
            addCriterion("game_advise_type =", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotEqualTo(String value) {
            addCriterion("game_advise_type <>", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeGreaterThan(String value) {
            addCriterion("game_advise_type >", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("game_advise_type >=", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeLessThan(String value) {
            addCriterion("game_advise_type <", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeLessThanOrEqualTo(String value) {
            addCriterion("game_advise_type <=", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeLike(String value) {
            addCriterion("game_advise_type like", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotLike(String value) {
            addCriterion("game_advise_type not like", value, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeIn(List<String> values) {
            addCriterion("game_advise_type in", values, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotIn(List<String> values) {
            addCriterion("game_advise_type not in", values, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeBetween(String value1, String value2) {
            addCriterion("game_advise_type between", value1, value2, "gameAdviseType");
            return (Criteria) this;
        }

        public Criteria andGameAdviseTypeNotBetween(String value1, String value2) {
            addCriterion("game_advise_type not between", value1, value2, "gameAdviseType");
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