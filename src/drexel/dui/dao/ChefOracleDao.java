	/**
	 * 
	 */
	/**
	 * @author pranatishrivastava
	 *
	 */
	package drexel.dui.dao;
	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;

	import drexel.dui.dto.Cuisine;
	import drexel.dui.dto.Dish;
	import drexel.dui.dto.Ingredients;
	import drexel.dui.dto.LookupWorkout;
	import drexel.dui.dto.MealType;
	import drexel.dui.dto.Selects;
	import drexel.dui.dto.UserProfile;
	import drexel.dui.exception.ChefOracleException;
	
	public class ChefOracleDao implements IChefOracleDao  {
	
		@Override
		public boolean validateUser(String login, String password) throws ChefOracleException{
			// TODO Auto-generated method stub
	        
			Connection con=null;
			PreparedStatement pst=null;
			ResultSet rs=null;
			String usertype=null;
			boolean status=false;
			
			try {
				con= DBUtil.openDBConnectionSQL();
				
				
				pst = con.prepareStatement("select uname, upass from cheforacle.user_profile where uname=? and upass=?");
	            pst.setString(1, login);
	            pst.setString(2, password);
	
	            rs = pst.executeQuery();
	            status = rs.next();
	            System.out.println("It worked!!!");
				} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				throw new ChefOracleException(e.getMessage());
			}
			finally{
	
				DBUtil.closeDBConnection(con);
	
	
	
			}
	
			return status;
	
		}

		

		@Override
		
		public boolean insertUserProfile(UserProfile userprofile) throws ChefOracleException {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String usertype=null;
		Statement st=null;
		boolean status=false;
		int count;

		try {
		con= DBUtil.openDBConnectionSQL();

		 String query = " insert into cheforacle.user_profile (uname,upass,utype,fpref,cpref)"
			        + " values (?, ?, ?, ?, ?)";
		pst = con.prepareStatement(query);
		pst.setString(1,userprofile.getUname());
		pst.setString(2,userprofile.getUpass());
		pst.setString(3,userprofile.getUtype());
		pst.setString(4,userprofile.getFpref());
		pst.setString(5,userprofile.getCpref());

		           count = pst.executeUpdate();
		           if(count>0){
		System.out.println("inserted successfully....");
		status=true;
		}
		else
		{
		throw new ChefOracleException("Error While Performing insert DB operation");
		}
		           
		} catch (SQLException e) 
		{
		// TODO Auto-generated catch block
		throw new ChefOracleException(e.getMessage());
		}
		finally{

		DBUtil.closeDBConnection(con);

		}

		return status;


		}
		
		public boolean insertUserProfileSkip(UserProfile userprofile) throws ChefOracleException {

			// TODO Auto-generated method stub
			Connection con=null;
			PreparedStatement pst=null;
			ResultSet rs=null;
			String usertype=null;
			Statement st=null;
			boolean status=false;
			int count;

			try {
			con= DBUtil.openDBConnectionSQL();

			 String query = " insert into cheforacle.user_profile (uname,upass,utype,fpref,cpref)"
				        + " values (?, ?, ?, ?, ?)";
			pst = con.prepareStatement(query);
			pst.setString(1,userprofile.getUname());
			pst.setString(2,userprofile.getUpass());
			pst.setString(3,userprofile.getUtype());
			pst.setString(4,userprofile.getFpref());
			pst.setString(5,userprofile.getCpref());

			           count = pst.executeUpdate();
			           if(count>0){
			System.out.println("inserted successfully....");
			status=true;
			}
			else
			{
			throw new ChefOracleException("Error While Performing insert DB operation");
			}
			           
			} catch (SQLException e) 
			{
			// TODO Auto-generated catch block
			throw new ChefOracleException(e.getMessage());
			}
			finally{

			DBUtil.closeDBConnection(con);

			}

			return status;


			
		}
	
		@Override
		public ArrayList<Ingredients> viewIngredients() throws ChefOracleException {
			// TODO Auto-generated method stub
			ArrayList<Ingredients> list=new ArrayList<Ingredients>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
					
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT * FROM cheforacle.ingredients;");
				
				while(rs.next()){
					list.add(new Ingredients(rs.getInt(1),rs.getString(2),rs.getString(3)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list;
		}
	
	
		@Override
		public ArrayList<MealType> viewMealType() throws ChefOracleException {
			// TODO Auto-generated method stub
			
			ArrayList<MealType> list_mealType=new ArrayList<MealType>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT mtype FROM cheforacle.meal;");
				
				while(rs.next()){
					list_mealType.add(new MealType(rs.getString(1)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list_mealType;
			
		}
	
		
		
		
		@Override
		public boolean insertIntoSelects(Selects selects) throws ChefOracleException {
			// TODO Auto-generated method stub
			Connection con=null;
			PreparedStatement pst=null;
			ResultSet rs=null;
			String usertype=null;
			Statement st=null;
			boolean status=false;
			int count;

			try {
			con= DBUtil.openDBConnectionSQL();

			 String query = " insert into cheforacle.selects (iid,cid,uname,mid)"
				        + " values (?, ?, ?, ?)";
			pst = con.prepareStatement(query);
			pst.setInt(1,selects.getIid());
			pst.setInt(2,selects.getCid());
			pst.setString(3,selects.getUname());
			pst.setInt(4,selects.getMid());
			

			           count = pst.executeUpdate();
			           if(count>0){
			System.out.println("inserted successfully....");
			status=true;
			}
			else
			{
			throw new ChefOracleException("Error While Performing insert DB operation");
			}
			           
			} catch (SQLException e) 
			{
			// TODO Auto-generated catch block
			throw new ChefOracleException(e.getMessage());
			}
			finally{

			DBUtil.closeDBConnection(con);



			}

			return status;


		}
	
		@Override
		public ArrayList<Selects> viewSelectedItems() throws ChefOracleException {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public boolean updateSelection(Selects selects, String uname) throws ChefOracleException{
			// TODO Auto-generated method stub
			
			
			
			
			return false;
		}
	
		@Override
		public boolean deleteSelections(String uname) throws ChefOracleException {
			// TODO Auto-generated method stub
			return false;
		}
	
		@Override
		public ArrayList<Dish> viewDish(String[] ingredients,String[] cuisine,String[] mealType,String  cookingExperience,String foodPreference) throws ChefOracleException {
			// TODO Auto-generated method stub
			
			
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			PreparedStatement pst=null;
			boolean status=false;
			 
			ArrayList<Dish> list_work= new ArrayList<Dish>();
			
			try {
				con=DBUtil.openDBConnectionSQL();
				//st=con.createStatement();
				
				String query="SELECT Distinct did, dname FROM cheforacle.dish d, cheforacle.ingredients i, cheforacle.cusine c, cheforacle.meal m where d.iid=i.iid and d.cid=c.cid and d.mid=m.mid and cpref='"+cookingExperience+"' and fpref='"+foodPreference+"' ";
				
				if(ingredients.length!=0 && (!ingredients.equals(null))){
					query +=" and ( ";
					for(int i=0;i<ingredients.length-1;i++){
					query +=" i.inname=? or ";
					}
					query +="i.inname=? ) ";
				}
			
				if(cuisine.length!=0 && (!cuisine.equals(null))){
					query +=" and ( ";
					for(int i=0;i<cuisine.length-1;i++){
						query +="c.cname=? or ";
						}
					query +="c.cname=? ) ";
				}
				
				
				if(mealType.length!=0 && (!mealType.equals(null))){
					query +=" and ( ";
					for(int i=0;i<mealType.length-1;i++){
						query +="m.mtype=? or ";
						}
					query +="m.mtype=? ) ";
				}
				
				query +=" ;";
				System.out.println(query);
				
				
				
				pst=con.prepareStatement(query);
				
				System.out.println(""+ingredients.length);
				System.out.println(cuisine.length);
				System.out.println(mealType.length);
					int count=0;
					int index=0;
					if(ingredients.length!=0 && (!ingredients.equals(null))){
						for(count=1;count<=ingredients.length;count++){
						pst.setString(count, ingredients[index]);
							System.out.println(count+" "+ ingredients[index]);
							index++;
						}
						System.out.println(count);
					}
					if(cuisine.length!=0 && (!cuisine.equals(null))){
						index=0;
						for(count=ingredients.length+1;count<=(cuisine.length+ingredients.length);count++){
						pst.setString(count, cuisine[index]);
							System.out.println(count+" "+ cuisine[index]);
							index++;
						}
						System.out.println(count);
					}
					if(mealType.length!=0 && (!mealType.equals(null))){
						index=0;
						for(count=(cuisine.length+ingredients.length+1);count<=(cuisine.length+ingredients.length+mealType.length);count++){
							pst.setString(count, mealType[index]);
							System.out.println(count+" " +mealType[index]);
							index++;
						}
				}
		
				rs=pst.executeQuery();
				
				//status=rs.next();
				System.out.println("pleaseeee:  "+status);
				
				
				/*while(rs.next()){
					System.out.println("entering while");
					list_work.add(rs.getString("Dname"));
				}*/
				
				while(rs.next()){
					System.out.println("entering while dish");
					list_work.add(new Dish(rs.getInt("DID"),rs.getString("DNAME")));
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list_work;
			
		}
	
		@Override
		public int getCalories() throws ChefOracleException {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public ArrayList<LookupWorkout> viewWorkout(String dname) throws ChefOracleException {
			// TODO Auto-generated method stub
			
			System.out.println("dname in dao:"+dname);
			ArrayList<LookupWorkout> list_workout= new ArrayList<LookupWorkout>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			PreparedStatement pst=null;
			boolean status=false;
			System.out.println("dname in dao:"+dname);
			try {
				con=DBUtil.openDBConnectionSQL();
				pst=con.prepareStatement("select distinct l.wname from cheforacle.lookup_workout l ,dish d, calories c where d.calorie=c.calorie and c.wname=l.wname and d.dname=?;");
			    pst.setString(1, dname);
				rs=pst.executeQuery();
				//status=rs.next();
				System.out.println("status work out :"+status);
				//System.out.println("gjhgjhgjhjhjhg:****"+rs.getString("l.wname"));
				
				
				while(rs.next()){
					
					System.out.println("hello there");
					
					list_workout.add(new LookupWorkout(rs.getString("l.wname")));
					//add(rs.getString("l.wname"));
				}
				System.out.println("list workout after while:"+list_workout);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			return list_workout;
		}
	
		@Override
		public ArrayList<Ingredients> viewIngredientsVeg() throws ChefOracleException {
			// TODO Auto-generated method stub
			ArrayList<Ingredients> list1=new ArrayList<Ingredients>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT inname FROM cheforacle.ingredients where intype='veg';");
				
				while(rs.next()){
					list1.add(new Ingredients(1,rs.getString(1),"not"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list1;
		}
	
		@Override
		public ArrayList<Ingredients> viewIngredientMeat() throws ChefOracleException {
			// TODO Auto-generated method stub
			ArrayList<Ingredients> list2=new ArrayList<Ingredients>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT inname FROM cheforacle.ingredients where intype='meat';");
				
				while(rs.next()){
					list2.add(new Ingredients(1,rs.getString(1),"not"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list2;
		}
	
		@Override
		public ArrayList<Ingredients> viewIngredientsProteins() throws ChefOracleException {
			// TODO Auto-generated method stub
			ArrayList<Ingredients> list3=new ArrayList<Ingredients>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT inname FROM cheforacle.ingredients where intype='carb';");
				
				while(rs.next()){
					list3.add(new Ingredients(1,rs.getString(1),"not"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list3;
		}
	
		@Override
		public ArrayList<Ingredients> viewIngredientsSauce() throws ChefOracleException {
			// TODO Auto-generated method stub
			ArrayList<Ingredients> list4=new ArrayList<Ingredients>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT inname FROM cheforacle.ingredients where intype='sauces';");
				
				while(rs.next()){
					list4.add(new Ingredients(1,rs.getString(1),"not"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list4;
		}
	
		@Override
		public ArrayList<Cuisine> viewOrientalCuisines() throws ChefOracleException {
			// TODO Auto-generated method stub
			ArrayList<Cuisine> list_oriental=new ArrayList<Cuisine>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT cname FROM cheforacle.cusine where ctype='oriental';");
				
				while(rs.next()){
					list_oriental.add(new Cuisine(rs.getString(1)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list_oriental;
		}
	
		@Override
		public ArrayList<Cuisine> viewContinentalCuisines() throws ChefOracleException {
			// TODO Auto-generated method stub
			
			
			
			ArrayList<Cuisine> list_continental=new ArrayList<Cuisine>();
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try {
				con=DBUtil.openDBConnectionSQL();
				st=con.createStatement();
				rs=st.executeQuery("SELECT cname FROM cheforacle.cusine where ctype='continental';");
				
				while(rs.next()){
					list_continental.add(new Cuisine(rs.getString(1)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtil.closeDBConnection(con);
			}
			
			return list_continental;
		}


		@Override
		public String viewRecipe(String dname) throws ChefOracleException {
			// TODO Auto-generated method stub
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			String recipe="No results. Try some other recipe";
			PreparedStatement pst;
			int rating;
		    Dish dish=new Dish();
		    System.out.println("dname))))):"+dname);
			try {
				con=DBUtil.openDBConnectionSQL();
				System.out.println(":<<<<<<");
				pst=con.prepareStatement("SELECT ddirections FROM cheforacle.dish where dname=?;");
				pst.setString(1, dname);
				//pst.setString(1,dname);

				System.out.println(":>>>>>>>");
				rs=pst.executeQuery();

				System.out.println(":DDDDDDD");
				while(rs.next()){
					//recipe=rs.getString(1);
					dish.setDirections(rs.getString("ddirections"));
					recipe=dish.getDirections();
				}
				System.out.println("ghghjhgv: "+recipe);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rating=viewRating(dname);
			
			return recipe;
		}



		@Override
		public String viewWorkoutInstructions(String wname) throws ChefOracleException {
			// TODO Auto-generated method stub
			Connection con=null;
			ResultSet rs=null;
			Statement st=null;
			String workout="No results. Try some other recipe";
			PreparedStatement pst;
			LookupWorkout lookup= new LookupWorkout();
			
			try {
				con=DBUtil.openDBConnectionSQL();
				
				pst=con.prepareStatement("SELECT instruction FROM cheforacle.lookup_workout where wname=?;");
				pst.setString(1, wname);
				rs=pst.executeQuery();
				
				
				while(rs.next()){
					//recipe=rs.getString(1);
					lookup.setInstructions(rs.getString("instruction"));
					workout=lookup.getInstructions();
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return workout;
		}



		@Override
		public int viewRating(String dname) throws ChefOracleException {
			// TODO Auto-generated method stub
			int rating=0;
			Connection con=null;
			ResultSet rs=null;
			PreparedStatement pst;
			
			try {
				
				con=DBUtil.openDBConnectionSQL();
				pst=con.prepareStatement("Select stars from cheforacle.has_ratings r, cheforacle.dish d where d.did=r.did and dname=?  ");
				pst.setString(1, dname);
				rs=pst.executeQuery();
				if(rs.next()){
				rating=rs.getInt(1);
				}
				System.out.println("rating in dao:"+rating);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return rating;
		}


		}