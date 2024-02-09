package com.tcs.inv;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Servlet implementation class TransactionServlet
 */
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//step 1 create and configure the config object
		Configuration config = new Configuration();
		config.configure();
		
		//step 2 create session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//step 3 create session from factory
		Session session =  factory.openSession();
		
		//step 4 create transaction object
		Transaction trans = session.beginTransaction();
		
		//step 5 create objects and save into session
		Transactions tr= new Transactions( Integer.parseInt(request.getParameter("transaction-id")), 
					request.getParameter("transaction-date"), 
					Double.parseDouble(request.getParameter("transaction-amount")),
					Integer.parseInt(request.getParameter("trans-investor-id")));
		
		if(InvestorServlet.isInvestorExist(session,tr.getInvestorId())!=null)
		{
			//step6 save object in session
			session.save(tr);
			response.getWriter().append("Successfully added Transaction");
		}
		else
		{
			response.getWriter().append("Investor does not exist");
		}
		
		response.getWriter().append("\n\n List of Transactions");
		List<Transactions> ls = getTransactions(session);
		for(Transactions i : ls)
		{
			response.getWriter().append("\n"+i);
		}
		
		//step 7 commit transaction
		trans.commit();
		
		//step8 close session
		session.close();
	
	}


	 public static List<Transactions> getTransactions(Session session)
	 {
		 Query<Transactions> qry=  session.createQuery("select i from Transactions i");
		 return qry.list();
	 }


}

