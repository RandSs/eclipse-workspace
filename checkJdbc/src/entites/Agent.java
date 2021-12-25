package entites;

public class Agent {
  
	private int id;
	
	private String username;
	private String password;

	
	
	
	
	public Agent() {
		
		
	}
	
	
public Agent(String user, String pass) {
	setUsername(user);
	setPassword(pass);
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String toString() {
		return "Agent [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
