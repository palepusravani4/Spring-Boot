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
public class BankAccountDetails {
	@Id
	@SequenceGenerator(name="gen1" ,initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	Integer accountId;
	@NonNull
	Double balance;
	// meta data
	@Version
	Integer updationCount;
	@CreationTimestamp
	@Column(insertable = true,updatable = false)
	LocalDateTime createdAt;
	@UpdateTimestamp
	@Column(insertable = false,updatable = true)
	LocalDateTime updatedAt;
	
	String createBy;
	String updateBy;
	

}
