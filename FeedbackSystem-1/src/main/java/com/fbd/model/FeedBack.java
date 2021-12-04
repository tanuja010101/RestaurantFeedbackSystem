package com.fbd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedBack 
{
	@Id
	private int customerId;
	private String customerName;
	private double rating;

}
