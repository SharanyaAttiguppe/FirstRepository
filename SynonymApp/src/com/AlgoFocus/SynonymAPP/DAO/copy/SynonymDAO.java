package com.AlgoFocus.SynonymAPP.DAO.copy;

public interface SynonymDAO 
{
	
	SynonymJavaBean wordSearch(String word);
	boolean Save(String Word, String Synonyms);
}
