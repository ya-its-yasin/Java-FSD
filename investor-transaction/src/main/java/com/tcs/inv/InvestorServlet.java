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
 * Servlet implementation class InvestorServlet
 */
public class InvestorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvestorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init()
    {
    	
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
		Investor inv1= new Investor( Integer.parseInt(request.getParameter("investor-id")), 
					request.getParameter("investor-name"), 
					Double.parseDouble(request.getParameter("investor-amount")) );
		
		if(isInvestorExist(session,inv1.getId())==null)
		{
			//step6 save object in session
			session.save(inv1);
			response.getWriter().append("Successfully added Investor");
		}
		else
		{
			response.getWriter().append("Duplicate Investor");
		}
		
		response.getWriter().append("\n\n List of Investors");
		List<Investor> ls = getInvestors(session);
		for(Investor i : ls)
		{
			response.getWriter().append("\n"+i);
		}
		
		//step 7 commit transaction
		trans.commit();
		
		//step8 close session
		session.close();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure();
		
		//step 2 create session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//step 3 create session from factory
		Session session =  factory.openSession();
		int invId = Integer.parseInt(req.getParameter("investor-id"));
		resp.getWriter().append(""+isInvestorExist(session, invId));
		
		resp.getWriter().append("\n\n\nTransactions made by this investor are: \n");
		
		List<Transactions> trls = TransactionServlet.getTransactions(session);
		for(Transactions trs : trls)
		{
			if(trs.getInvestorId()==invId)
				resp.getWriter().append("\n"+trs);
		}
		
	}
	
	 public static Investor isInvestorExist(Session session, int invId) {
		// TODO Auto-generated method stub
		List<Investor> list = getInvestors(session);
		for(Investor inves: list)
		{
			if(inves.getId()==invId)
			{
				return inves;
			}
		}
		
		return null;
	}
	 
	 public static List<Investor> getInvestors(Session session)
	 {
		 Query<Investor> qry=  session.createQuery("select i from Investor i");
		 return qry.list();
	 }

}
