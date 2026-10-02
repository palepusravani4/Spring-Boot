package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Student {
	@Id
     @SequenceGenerator(name="gen1",initialValue = 100,sequenceName = "s_id",allocationSize = 1)
	@GeneratedValue(generator = "gen1" ,strategy = GenerationType.SEQUENCE)
	private Integer sid;
	@NonNull
	private String sname;
	@NonNull
	private String address;
	@NonNull
	private Double avg;

}
