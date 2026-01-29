package reg_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {
	public void execute (HttpServletRequest request , HttpServletResponse response); 
}
