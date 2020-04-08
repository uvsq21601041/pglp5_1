package pglp5_1.pglp5_1;
import java.util.List;


public interface PersonnelDao {
	
	public void add(Personnel per); 
	
	public void update(Personnel per);
	
	public void delete(int isbn);
	
	public List<Personnel> getAll();
	
	
	



}
