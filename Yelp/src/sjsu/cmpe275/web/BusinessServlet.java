package sjsu.cmpe275.web;

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

import org.codehaus.jackson.map.ObjectMapper;

import com.yelp.YelpDataSet1;
import com.yelp.YelpDataSet3;

/**
 * Servlet implementation class BusinessServlet
 */
@WebServlet("/BusinessServlet")
public class BusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String filename = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\yelpdataset3.txt";
		
		
		ObjectMapper mapper = new ObjectMapper();
		List<YelpDataSet3> data = new ArrayList<YelpDataSet3>();
		try 
		{
			
			Iterator<YelpDataSet3> it = mapper.reader(YelpDataSet3.class).readValues(new File(filename));
			while (it.hasNext())
			{
				YelpDataSet3 d = it.next();
				data.add(d);
			}
			// request.getSession().setAttribute("allusers", data); did not work.....
			request.setAttribute("business", data);
			
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
