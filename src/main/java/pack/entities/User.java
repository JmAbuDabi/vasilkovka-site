package pack.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * Class {@code User} is an ordinary user defined Java class whose instances
 * can be stored in the database and save information about Users in this system.
 *
 * @author Alexandr Sizov
 * @author Ivan Guravel
 * @date April 6,2013
 */

@Entity
@Table(name = "user")
@NamedQuery(name = "User.getAllUsers", query = "select u from User u")
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "usersId", unique = true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
    
	@Column(name = "userName")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "passwd")
	private String passwd;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}