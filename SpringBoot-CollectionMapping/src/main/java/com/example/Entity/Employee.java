package com.example.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="Employee_Details")
public class Employee {
	@Id
	@SequenceGenerator(name="g1",sequenceName = "e_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy =GenerationType.SEQUENCE )
	private Integer eid;
	@Column(length = 25)
	@NonNull
	private String ename;
	@Column(length = 25)
	@NonNull
	private String eaddrs;
	
	@NonNull
	
	@ElementCollection
	@CollectionTable(name="friends",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eid"))
	private List<String> friends;
	@NonNull
	@ElementCollection
	@CollectionTable(name="phones",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eid"))
	private Set<Long> phones;
	@NonNull
	@ElementCollection
	@CollectionTable(name="IDDetails",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eid"))
	@MapKeyColumn(name="id_type")
	private Map<String,String> idDetails;

}
