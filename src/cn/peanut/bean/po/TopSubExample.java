package cn.peanut.bean.po;

import java.util.ArrayList;
import java.util.List;

public class TopSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopSubExample() {
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

        public Criteria andTopCtgyIdIsNull() {
            addCriterion("top_ctgy_id is null");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdIsNotNull() {
            addCriterion("top_ctgy_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdEqualTo(Integer value) {
            addCriterion("top_ctgy_id =", value, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdNotEqualTo(Integer value) {
            addCriterion("top_ctgy_id <>", value, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdGreaterThan(Integer value) {
            addCriterion("top_ctgy_id >", value, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_ctgy_id >=", value, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdLessThan(Integer value) {
            addCriterion("top_ctgy_id <", value, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdLessThanOrEqualTo(Integer value) {
            addCriterion("top_ctgy_id <=", value, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdIn(List<Integer> values) {
            addCriterion("top_ctgy_id in", values, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdNotIn(List<Integer> values) {
            addCriterion("top_ctgy_id not in", values, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdBetween(Integer value1, Integer value2) {
            addCriterion("top_ctgy_id between", value1, value2, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andTopCtgyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("top_ctgy_id not between", value1, value2, "topCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdIsNull() {
            addCriterion("sub_ctgy_id is null");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdIsNotNull() {
            addCriterion("sub_ctgy_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdEqualTo(Integer value) {
            addCriterion("sub_ctgy_id =", value, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdNotEqualTo(Integer value) {
            addCriterion("sub_ctgy_id <>", value, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdGreaterThan(Integer value) {
            addCriterion("sub_ctgy_id >", value, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_ctgy_id >=", value, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdLessThan(Integer value) {
            addCriterion("sub_ctgy_id <", value, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_ctgy_id <=", value, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdIn(List<Integer> values) {
            addCriterion("sub_ctgy_id in", values, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdNotIn(List<Integer> values) {
            addCriterion("sub_ctgy_id not in", values, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_ctgy_id between", value1, value2, "subCtgyId");
            return (Criteria) this;
        }

        public Criteria andSubCtgyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_ctgy_id not between", value1, value2, "subCtgyId");
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