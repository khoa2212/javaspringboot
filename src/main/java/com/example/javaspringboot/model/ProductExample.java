package com.example.javaspringboot.model;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public ProductExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
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

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(String value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(String value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(String value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(String value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(String value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(String value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLike(String value) {
			addCriterion("product_id like", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotLike(String value) {
			addCriterion("product_id not like", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<String> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<String> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(String value1, String value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(String value1, String value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductImageIsNull() {
			addCriterion("product_image is null");
			return (Criteria) this;
		}

		public Criteria andProductImageIsNotNull() {
			addCriterion("product_image is not null");
			return (Criteria) this;
		}

		public Criteria andProductImageEqualTo(String value) {
			addCriterion("product_image =", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageNotEqualTo(String value) {
			addCriterion("product_image <>", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageGreaterThan(String value) {
			addCriterion("product_image >", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageGreaterThanOrEqualTo(String value) {
			addCriterion("product_image >=", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageLessThan(String value) {
			addCriterion("product_image <", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageLessThanOrEqualTo(String value) {
			addCriterion("product_image <=", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageLike(String value) {
			addCriterion("product_image like", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageNotLike(String value) {
			addCriterion("product_image not like", value, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageIn(List<String> values) {
			addCriterion("product_image in", values, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageNotIn(List<String> values) {
			addCriterion("product_image not in", values, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageBetween(String value1, String value2) {
			addCriterion("product_image between", value1, value2, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductImageNotBetween(String value1, String value2) {
			addCriterion("product_image not between", value1, value2, "productImage");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionIsNull() {
			addCriterion("product_description is null");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionIsNotNull() {
			addCriterion("product_description is not null");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionEqualTo(String value) {
			addCriterion("product_description =", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionNotEqualTo(String value) {
			addCriterion("product_description <>", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionGreaterThan(String value) {
			addCriterion("product_description >", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("product_description >=", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionLessThan(String value) {
			addCriterion("product_description <", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
			addCriterion("product_description <=", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionLike(String value) {
			addCriterion("product_description like", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionNotLike(String value) {
			addCriterion("product_description not like", value, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionIn(List<String> values) {
			addCriterion("product_description in", values, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionNotIn(List<String> values) {
			addCriterion("product_description not in", values, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionBetween(String value1, String value2) {
			addCriterion("product_description between", value1, value2, "productDescription");
			return (Criteria) this;
		}

		public Criteria andProductDescriptionNotBetween(String value1, String value2) {
			addCriterion("product_description not between", value1, value2, "productDescription");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table products
	 * @mbg.generated  Thu Nov 03 12:08:44 GMT+07:00 2022
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table products
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 03 12:02:10 GMT+07:00 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}