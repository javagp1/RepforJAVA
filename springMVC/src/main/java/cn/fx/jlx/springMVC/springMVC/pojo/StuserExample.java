package cn.fx.jlx.springMVC.springMVC.pojo;

import java.util.ArrayList;
import java.util.List;

public class StuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuserExample() {
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

        public Criteria andStuseridIsNull() {
            addCriterion("stuserid is null");
            return (Criteria) this;
        }

        public Criteria andStuseridIsNotNull() {
            addCriterion("stuserid is not null");
            return (Criteria) this;
        }

        public Criteria andStuseridEqualTo(Integer value) {
            addCriterion("stuserid =", value, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridNotEqualTo(Integer value) {
            addCriterion("stuserid <>", value, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridGreaterThan(Integer value) {
            addCriterion("stuserid >", value, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuserid >=", value, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridLessThan(Integer value) {
            addCriterion("stuserid <", value, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridLessThanOrEqualTo(Integer value) {
            addCriterion("stuserid <=", value, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridIn(List<Integer> values) {
            addCriterion("stuserid in", values, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridNotIn(List<Integer> values) {
            addCriterion("stuserid not in", values, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridBetween(Integer value1, Integer value2) {
            addCriterion("stuserid between", value1, value2, "stuserid");
            return (Criteria) this;
        }

        public Criteria andStuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("stuserid not between", value1, value2, "stuserid");
            return (Criteria) this;
        }

        public Criteria andSlognameIsNull() {
            addCriterion("slogname is null");
            return (Criteria) this;
        }

        public Criteria andSlognameIsNotNull() {
            addCriterion("slogname is not null");
            return (Criteria) this;
        }

        public Criteria andSlognameEqualTo(String value) {
            addCriterion("slogname =", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameNotEqualTo(String value) {
            addCriterion("slogname <>", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameGreaterThan(String value) {
            addCriterion("slogname >", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameGreaterThanOrEqualTo(String value) {
            addCriterion("slogname >=", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameLessThan(String value) {
            addCriterion("slogname <", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameLessThanOrEqualTo(String value) {
            addCriterion("slogname <=", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameLike(String value) {
            addCriterion("slogname like", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameNotLike(String value) {
            addCriterion("slogname not like", value, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameIn(List<String> values) {
            addCriterion("slogname in", values, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameNotIn(List<String> values) {
            addCriterion("slogname not in", values, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameBetween(String value1, String value2) {
            addCriterion("slogname between", value1, value2, "slogname");
            return (Criteria) this;
        }

        public Criteria andSlognameNotBetween(String value1, String value2) {
            addCriterion("slogname not between", value1, value2, "slogname");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("spassword is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("spassword is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("spassword =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("spassword <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("spassword >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("spassword >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("spassword <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("spassword <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("spassword like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("spassword not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("spassword in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("spassword not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("spassword between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("spassword not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
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