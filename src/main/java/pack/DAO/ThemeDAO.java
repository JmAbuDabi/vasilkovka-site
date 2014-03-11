package pack.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import pack.entities.Theme;
import converters.fromEntityToDtoConverter;
import dtos.ThemeDto;

@Repository (value = "themeDao")
public class ThemeDAO {

	private HibernateTemplate template;
	
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	

	@SuppressWarnings("unchecked")
	public List<ThemeDto> getAllThemes() {
		List<Theme> list = template.findByNamedQuery("SelectAllTheme");
		List<ThemeDto> dtolist = new ArrayList<ThemeDto>();
		for (int i = 0; i<list.size(); i++){
			dtolist.add(fromEntityToDtoConverter.convertFromThemeToThemeDto( list.get(i)));
		}
		
		return dtolist;
	}

	
	
	
	
	

}
