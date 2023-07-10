package com.foodexpress.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;

	@NonNull
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 10, message = "first name should 3 to 10")
	private String firstName;

	@NonNull
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 10, message = "last name should 3 to 10")
	private String lastName;

//	@NonNull
//	@NotBlank
//	@NotEmpty
//	@Min(value = 10, message = "minimum age required 10 for registration")
	private Integer age;

	@NotBlank
	@NotEmpty
	private String gender;

	@NonNull
	@NotBlank
	@NotEmpty
	@Size(min = 10, max = 10, message = "mobile number must be 10 digit only")
	private String mobileNumber;
	@NotBlank
	@NotNull
	@NotEmpty
	@Email(message = "email put in proper")

	private String email;
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 6,max = 10 , message = "password should be 6 to 10 digit only")
	private String password;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	public FoodCart fcart;
//	

	@Embedded
	private Address address;

}
