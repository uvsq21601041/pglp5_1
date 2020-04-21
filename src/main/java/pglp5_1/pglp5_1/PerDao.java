package pglp5_1.pglp5_1;


import pglp5_1.pglp5_1.PersonnelDao;
import java.util.List;
import java.util.ArrayList;

import java.util.Map;




public class PerDao  implements PersonnelDao{

	public void add(Personnel per) {
		
		
	}

	public void update(Personnel per) {
		
		
	}

	public void delete(int isbn) {
		
		
	}

	public List<Personnel> getAll() {
		return null;
		
		
	}

	private List<Personnel> convert(List<Map<String,Object>> list){
		List<Personnel> bList=new ArrayList<Personnel>();
		for(Map<String,Object> map:list) {
			Personnel p=new Personnel();
			p.setIsbn((Integer)map.get("isbn"));
			p.setNom(map.get("Nom").toString());
		
			bList.add(p);
		}
		return bList;
	}


}
