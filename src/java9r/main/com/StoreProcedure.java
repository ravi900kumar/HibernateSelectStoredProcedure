package java9r.main.com;
 
import java.util.*;

import java9r.dao.com.*;
import java9r.entites.com.*;
public class StoreProcedure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	StoreProcedureDAO spo=new StoreProcedureDAO();
	
/////////////////////////////////////// get all records StoreProcedureDAO start /////////////
	List<Product> result=spo.findAllSP();
	
	System.out.println("get all records StoreProcedure");
	for(Product p:result){
		System.out.println("Id " + p.getId());
		System.out.println("Name " + p.getName());
		System.out.println("Price " + p.getPrice());
		System.out.println("--------------------");
	}
	}
 

}