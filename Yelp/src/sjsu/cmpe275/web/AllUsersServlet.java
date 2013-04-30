package sjsu.cmpe275.web;

import com.yelp.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Servlet implementation class VoteSevlet
 */
@WebServlet("/AllUsersServlet")
public class AllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String filename = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\yelpdataset1.txt";
		
		
		ObjectMapper mapper = new ObjectMapper();
		List<YelpDataSet1> data = new ArrayList<YelpDataSet1>();
		try 
		{
			
			Iterator<YelpDataSet1> it = mapper.reader(YelpDataSet1.class).readValues(new File(filename));
			while (it.hasNext())
			{
				YelpDataSet1 d = it.next();
				data.add(d);
			}
			// request.getSession().setAttribute("allusers", data); did not work.....
			request.setAttribute("allusers", data);
			
			RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
			try 
			{
				rd.forward(request, response);
			} 
			catch (ServletException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
