package com.AlgoFocus.SynonymAPP.DAO.copy;



public class DAOFactory
{
	
	private  static String dbInteractionType="jdbc";
	
	public static SynonymDAO getDAOInstance()
	{
	SynonymDAO ref=null;
	if(dbInteractionType.equals("jdbc"))
	{
		ref=new JDBCImplementation();
	}
	return ref;
	
	}
}

