/*
 * Author:Pranati Shrivastava
 * Class: Controller
 * */

package drexel.dui.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ContainerServlet;

import drexel.dui.dto.Cuisine;
import drexel.dui.dto.Dish;
import drexel.dui.dto.Ingredients;
import drexel.dui.dto.LookupWorkout;
import drexel.dui.dto.MealType;
import drexel.dui.dto.UserProfile;
import drexel.dui.exception.ChefOracleException;
import drexel.dui.service.ChefOracleService;
import drexel.dui.service.IChefOracleService;

public class Servlet extends HttpServlet {

	String foodpreference;	
	String[] cuisine= new String[]{};
	String cookingExperience;
	String[] cookingTime= new String[]{"30 min and less"};
	String[] mealType= new String[]{};
	String[] ingredients=new String[]{}; 
	String calorie="200";
	String other= null;
	boolean food=false;
	boolean cookex=false;
	boolean cuisinecheck=false;
	boolean cooktimecheck=false;
	boolean mealcheck=false;
	boolean v1,v2,v3,v4,v5=false;
	boolean nv=false;
	HttpSession session;
	UserProfile userprofile;
	RequestDispatcher rd;
	
	
	ArrayList<Ingredients> list1;
	ArrayList<Ingredients> list2;
	ArrayList<Ingredients> list3;
	ArrayList<Ingredients> list4;
	ArrayList<Cuisine> list_oriental;
	ArrayList<Cuisine> list_continental;
	ArrayList<MealType> list_mealType;
	ArrayList<Dish> list_dish;
	ArrayList<LookupWorkout> list_workout;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);



		IChefOracleService service=new ChefOracleService();

		String result=req.getParameter("action");
		if("Skip".equalsIgnoreCase(result)){
			RequestDispatcher rd=req.getRequestDispatcher("page1.html");
			rd.forward(req, resp);
			
		}


		if("SignIn".equalsIgnoreCase(result))
		{System.out.print("hiiiii");
		   String username=req.getParameter("username");  
		   String password=req.getParameter("userpass"); 

		   HttpSession session = req.getSession(false);
		   if(session!=null){
		    session.setAttribute("name", username);
		   }
		   else
		   {
		    System.out.println("session is null");
		   }
		   try {
		    if(service.validateUser(username, password)){
		     rd=req.getRequestDispatcher("page1.html");  
		     rd.forward(req,resp); 
		    }
		    else{

		     resp.sendRedirect("Error.jsp");
		    }
		   } catch (ChefOracleException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		}

		if("SignUp".equalsIgnoreCase(result))
		{

			userprofile=new UserProfile();
			userprofile.setUname(req.getParameter("username"));
			userprofile.setUpass(req.getParameter("userpass"));
			userprofile.setUtype(req.getParameter("usertype"));
			userprofile.setFpref(req.getParameter("foodpreference"));
			userprofile.setCpref(req.getParameter("cookingExperience"));

			System.out.println(req.getParameter("username")+
					req.getParameter("userpass")+
					req.getParameter("usertype")+
					req.getParameter("foodpreference")+
					req.getParameter("cookingExperience"));

			try {
				System.out.println("in try");
				if(service.insertUserProfile(userprofile))

					System.out.println("after calling");
				rd=req.getRequestDispatcher("index.jsp");  
				rd.forward(req,resp);

			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("in catch");
			}
		}


		if("Next".equalsIgnoreCase(result)){
			
			double count=Math.random();
			userprofile=new UserProfile();
			userprofile.setUname(String.valueOf(count));
			userprofile.setUpass("unregistered");
			userprofile.setUtype("unregistered");
			userprofile.setFpref(req.getParameter("foodpreference"));
			userprofile.setCpref(req.getParameter("cookingExperience"));
			
			System.out.println("print 1"+req.getParameter("foodpreference")+"print 1"+
					req.getParameter("cookingExperience"));
			
			try {
				service.insertUserProfileSkip(userprofile);
			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 list1=new ArrayList<Ingredients>();
			 list2=new ArrayList<Ingredients>();
			 list3=new ArrayList<Ingredients>();
			 list4=new ArrayList<Ingredients>();
			 list_oriental=new ArrayList<Cuisine>();
			 list_continental=new ArrayList<Cuisine>();
			 list_mealType=new ArrayList<MealType>();

			 foodpreference=req.getParameter("foodpreference");
				cookingExperience=req.getParameter("cookingExperience");

			try {
				list1=service.viewIngredientsVeg();
				list2=service.viewIngredientMeat();
				list3=service.viewIngredientsProteins();
				list4=service.viewIngredientsSauce();
				list_oriental=service.viewOrientalCuisines();
				list_continental=service.viewContinentalCuisines();
				list_mealType=service.viewMealType();

				
			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.setAttribute("list1", list1);
			req.setAttribute("list2", list2);
			req.setAttribute("list3", list3);
			req.setAttribute("list4", list4);
			req.setAttribute("list_oriental", list_oriental);
			req.setAttribute("list_continental", list_continental);
			req.setAttribute("list_mealType", list_mealType);
			RequestDispatcher rd=req.getRequestDispatcher("page2.jsp");
			rd.forward(req, resp);
			session.setAttribute("list1", list1);
			session.setAttribute("list2", list2);
			session.setAttribute("list3", list3);
			session.setAttribute("list4", list4);
			session.setAttribute("list_oriental", list_oriental);
			session.setAttribute("list_continental", list_continental);
			session.setAttribute("list_mealType", list_mealType);
			
			
			
		}



		else if("Back".equalsIgnoreCase(result))
		{
			resp.sendRedirect("index.jsp");
		}

		if("Ask Chef Oracle".equalsIgnoreCase(result))
		{
			String [] ingredients1=new String[]{"Tomatoes"};
			String [] cuisine1=new String[]{"French"};
			String [] mealType1=new String[]{"Lunch"};
			
			
			System.out.println("foodpref:"+foodpreference);
			System.out.println("cookex:"+cookingExperience);
//		if(req.getParameterValues("ingredients").length>0)
//			{
				ingredients1=req.getParameterValues("ingredients");
				if(null!=ingredients1 && ingredients1.length>0){
					for(int i=0; i< ingredients1.length ;i++)
					{
						System.out.println("ingrediets:  "+ingredients1[i]);
					}
				}
//			}
//			if(req.getParameterValues("cuisines").length>0)
//			{
				cuisine1=req.getParameterValues("cuisines");
				if(null!=cuisine1 && cuisine1.length>0){
					for(int i=0; i< cuisine1.length ;i++)
					{
						System.out.println("cuisine :  "+cuisine1[i]);
					}
				}
//			}
//			if(req.getParameterValues("mealtype").length>0)
//			{
				mealType1=req.getParameterValues("mealtype");
				if(null!=mealType1 && mealType1.length>0){
					for(int i=0; i< mealType1.length ;i++)
					{
						System.out.println("mealtype :  "+mealType1[i]);
					}
				}
//			}
				 list_dish=new ArrayList<Dish>();
			
			try {
					list_dish=service.viewDish(ingredients1, cuisine1, mealType1, cookingExperience, foodpreference);
				

				System.out.println("servlet list:"+list_dish);

				

			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.setAttribute("list_dish", list_dish);
			RequestDispatcher rd=req.getRequestDispatcher("dishlist.jsp");
			rd.forward(req, resp);
			session.setAttribute("list_dish", list_dish);
		}
		if("View Recipe".equalsIgnoreCase(result))
		{
			String dname=req.getParameter("index");
			System.out.println("dname *****"+dname);
			String recipe="No results found";
			int rating=0;
			try {

				recipe=service.viewRecipe(dname);
				rating=service.viewRating(dname);
				System.out.println(recipe);
				System.out.println("rating:"+rating);
			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.setAttribute("list_dish", list_dish);
			req.setAttribute("dname", dname);
			req.setAttribute("recipe", recipe);
			req.setAttribute("rating", rating);
			RequestDispatcher rd=req.getRequestDispatcher("viewrecipe.jsp");
			rd.forward(req, resp);
			session.setAttribute("dname", dname);
			session.setAttribute("recipe", recipe);
			session.setAttribute("rating", rating);
		}
		if("Check Work Out".equalsIgnoreCase(result)){
			String dname=req.getParameter("dindex");
			list_workout=new ArrayList<LookupWorkout>();
			//String list="something again";
			try {
				list_workout=service.viewWorkout(dname);
				System.out.println("workout list:"+list_workout);
			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
			
		 req.setAttribute("list_workout", list_workout);
			RequestDispatcher rd=req.getRequestDispatcher("workoutlist.jsp");
			rd.forward(req, resp);
			
			session.setAttribute("list_workout", list_workout);
		}
		if("View Workout".equalsIgnoreCase(result)){
			String wname=req.getParameter("workoutname");
			String workouti="No results found";
			try {

				workouti=service.viewWorkoutInstructions(wname);
				System.out.println("workout:"+workouti);
			} catch (ChefOracleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			req.setAttribute("wname", wname);
			req.setAttribute("workouti", workouti);
			RequestDispatcher rd=req.getRequestDispatcher("viewworkout.jsp");
			rd.forward(req, resp);
			session.setAttribute("wname", wname);
			session.setAttribute("workouti", workouti);
		}
		
	}

}

