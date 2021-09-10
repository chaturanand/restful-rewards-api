package com.example.service.springbootrewards.model;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author chaturanand yadav
 * @since 2021-10-10
 * This is abstract class of rewars which have reward points
 *
 */
public abstract class Reward {

	@JsonInclude  //include in Jackson serialization
	@Transient    //marking a field as not persistable
	protected Long points;

	public abstract Long getPoints();

}
