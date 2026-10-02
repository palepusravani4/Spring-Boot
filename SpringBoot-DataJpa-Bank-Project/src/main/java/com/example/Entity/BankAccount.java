package com.example.Entity;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class BankAccount {
	@Id
	@SequenceGenerator(name="gen",initialValue=100000,allocationSize = 1)
	@GeneratedValue(generator="gen",strategy = GenerationType.SEQUENCE)
	private Long accno;
	@NonNull
	@Column(length=30)
	private String holderName;
	@NonNull
	@Column(length=30)
	private String addrs;
	@NonNull
	private Double balance;
	//meta data
	@Version
	private Integer updationCount;
	@CreationTimestamp
	@Column(insertable=true,updatable=false)
	private LocalDateTime creationTime;
	@UpdateTimestamp
	@Column(insertable=false,updatable=true)
	private LocalDateTime lastAccessTime;
	@Column(length=30)
	private String createBy;
	@Column(length=30)
	private String updateBy;
	@Column(length=10)
	private String active_sw="active";
	
	

}
