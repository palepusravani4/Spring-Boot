package com.example.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="MTOM_Faculty")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Faculty {
	@Id
	@SequenceGenerator(name="g1",sequenceName = "f_sid",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy = GenerationType.SEQUENCE)
	private Integer fid;
	@NonNull
	@Column(length=30)
	private String fname;
	@NonNull
	@Column(length=30)
	private String faddrs;
	@ManyToMany(targetEntity = Student.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="MTOM_F_S",joinColumns = @JoinColumn(name="faculty_id",referencedColumnName = "fid"),
	inverseJoinColumns = @JoinColumn(name="student_id",referencedColumnName = "sid"))
	private Set<Student> student=new HashSet();
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", faddrs=" + faddrs + "]";
	}
    
	
}
