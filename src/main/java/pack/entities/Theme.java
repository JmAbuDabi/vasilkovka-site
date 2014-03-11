package pack.entities;

import java.io.Serializable;
import javax.persistence.*;




@Entity
@Table(name="theme")

@NamedQueries({
	@NamedQuery (name = "SelectAllTheme", query = "Select c FROM Theme c"),
	@NamedQuery (name = "SelectOneTheme", query = "Select c FROM Theme c WHERE c.id =:themeId")
})
public class Theme implements Serializable {
	
	private static final long serialVersionUID = -6096401967620272515L;

	@Id
	@Column(name = "idTheme", unique = true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nameOfTheme")
	private String nameOfTheme;

	public Theme() {
	}
	public int getId() {
		return id;
	}
	public String getNameOfTheme() {
		return nameOfTheme;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setNameOfTheme(String nameOfTheme) {
		this.nameOfTheme = nameOfTheme;
	}
	 
}
