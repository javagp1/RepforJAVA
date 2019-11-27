package cn.fx.jlx.springMVC.springMVC.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarouselimgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarouselimgExample() {
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

        public Criteria andCimgidIsNull() {
            addCriterion("cimgid is null");
            return (Criteria) this;
        }

        public Criteria andCimgidIsNotNull() {
            addCriterion("cimgid is not null");
            return (Criteria) this;
        }

        public Criteria andCimgidEqualTo(Integer value) {
            addCriterion("cimgid =", value, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidNotEqualTo(Integer value) {
            addCriterion("cimgid <>", value, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidGreaterThan(Integer value) {
            addCriterion("cimgid >", value, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cimgid >=", value, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidLessThan(Integer value) {
            addCriterion("cimgid <", value, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidLessThanOrEqualTo(Integer value) {
            addCriterion("cimgid <=", value, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidIn(List<Integer> values) {
            addCriterion("cimgid in", values, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidNotIn(List<Integer> values) {
            addCriterion("cimgid not in", values, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidBetween(Integer value1, Integer value2) {
            addCriterion("cimgid between", value1, value2, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgidNotBetween(Integer value1, Integer value2) {
            addCriterion("cimgid not between", value1, value2, "cimgid");
            return (Criteria) this;
        }

        public Criteria andCimgurlIsNull() {
            addCriterion("cimgurl is null");
            return (Criteria) this;
        }

        public Criteria andCimgurlIsNotNull() {
            addCriterion("cimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andCimgurlEqualTo(String value) {
            addCriterion("cimgurl =", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlNotEqualTo(String value) {
            addCriterion("cimgurl <>", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlGreaterThan(String value) {
            addCriterion("cimgurl >", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("cimgurl >=", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlLessThan(String value) {
            addCriterion("cimgurl <", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlLessThanOrEqualTo(String value) {
            addCriterion("cimgurl <=", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlLike(String value) {
            addCriterion("cimgurl like", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlNotLike(String value) {
            addCriterion("cimgurl not like", value, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlIn(List<String> values) {
            addCriterion("cimgurl in", values, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlNotIn(List<String> values) {
            addCriterion("cimgurl not in", values, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlBetween(String value1, String value2) {
            addCriterion("cimgurl between", value1, value2, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andCimgurlNotBetween(String value1, String value2) {
            addCriterion("cimgurl not between", value1, value2, "cimgurl");
            return (Criteria) this;
        }

        public Criteria andGdidIsNull() {
            addCriterion("gdid is null");
            return (Criteria) this;
        }

        public Criteria andGdidIsNotNull() {
            addCriterion("gdid is not null");
            return (Criteria) this;
        }

        public Criteria andGdidEqualTo(Integer value) {
            addCriterion("gdid =", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotEqualTo(Integer value) {
            addCriterion("gdid <>", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThan(Integer value) {
            addCriterion("gdid >", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdid >=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThan(Integer value) {
            addCriterion("gdid <", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThanOrEqualTo(Integer value) {
            addCriterion("gdid <=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidIn(List<Integer> values) {
            addCriterion("gdid in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotIn(List<Integer> values) {
            addCriterion("gdid not in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidBetween(Integer value1, Integer value2) {
            addCriterion("gdid between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotBetween(Integer value1, Integer value2) {
            addCriterion("gdid not between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Double value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Double value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Double value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Double value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Double value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Double value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Double> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Double> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Double value1, Double value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Double value1, Double value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeIsNull() {
            addCriterion("cimgshowtime is null");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeIsNotNull() {
            addCriterion("cimgshowtime is not null");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeEqualTo(Double value) {
            addCriterion("cimgshowtime =", value, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeNotEqualTo(Double value) {
            addCriterion("cimgshowtime <>", value, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeGreaterThan(Double value) {
            addCriterion("cimgshowtime >", value, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeGreaterThanOrEqualTo(Double value) {
            addCriterion("cimgshowtime >=", value, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeLessThan(Double value) {
            addCriterion("cimgshowtime <", value, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeLessThanOrEqualTo(Double value) {
            addCriterion("cimgshowtime <=", value, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeIn(List<Double> values) {
            addCriterion("cimgshowtime in", values, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeNotIn(List<Double> values) {
            addCriterion("cimgshowtime not in", values, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeBetween(Double value1, Double value2) {
            addCriterion("cimgshowtime between", value1, value2, "cimgshowtime");
            return (Criteria) this;
        }

        public Criteria andCimgshowtimeNotBetween(Double value1, Double value2) {
            addCriterion("cimgshowtime not between", value1, value2, "cimgshowtime");
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