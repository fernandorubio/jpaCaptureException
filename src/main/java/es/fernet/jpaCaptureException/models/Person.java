package es.fernet.jpaCaptureException.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

	@Id
	@GeneratedValue
	private Long personId;

	@Column(name = "te_name")
	private String name;

	@Column(name = "te_surname")
	private String surname;

	@Column(name = "te_nif", unique = true)
	private String nif;

	@Column(name = "cn_age")
	private Integer age;
}
