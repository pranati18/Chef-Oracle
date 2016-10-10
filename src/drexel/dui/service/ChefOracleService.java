/**
 * 
 */
/**
 * @author pranatishrivastava
 *
 */
package drexel.dui.service;

import java.util.ArrayList;

import drexel.dui.dao.ChefOracleDao;
import drexel.dui.dao.IChefOracleDao;
import drexel.dui.dto.Cuisine;
import drexel.dui.dto.Dish;
import drexel.dui.dto.Ingredients;
import drexel.dui.dto.LookupWorkout;
import drexel.dui.dto.MealType;
import drexel.dui.dto.Selects;
import drexel.dui.dto.UserProfile;
import drexel.dui.exception.ChefOracleException;

public class ChefOracleService implements IChefOracleService{

	IChefOracleDao dao= new ChefOracleDao();
	@Override
	public boolean validateUser(String login, String password) throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.validateUser(login, password);
	}
	@Override
	public boolean insertUserProfile(UserProfile userprofile) throws ChefOracleException {
		// TODO Auto-generated method stub
		boolean flag=dao.insertUserProfile(userprofile);
		return flag;
	}
	@Override
	public ArrayList<Ingredients> viewIngredients() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewIngredients();
	}
	
	@Override
	public ArrayList<MealType> viewMealType() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewMealType();
	}
	@Override
	public boolean insertIntoSelects(Selects selects) throws ChefOracleException {
		// TODO Auto-generated method stub
		boolean flag=dao.insertIntoSelects(selects);
		return flag;
	}
	@Override
	public ArrayList<Selects> viewSelectedItems() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewSelectedItems();
	}
	@Override
	public boolean updateSelection(Selects selects, String uname) throws ChefOracleException {
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
		return dao.viewDish(ingredients, cuisine, mealType, cookingExperience, foodPreference);
	}
	@Override
	public int getCalories() throws ChefOracleException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<LookupWorkout> viewWorkout(String dname) throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewWorkout(dname);
	}
	@Override
	public ArrayList<Ingredients> viewIngredientsVeg() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewIngredientsVeg();
	}
	@Override
	public ArrayList<Ingredients> viewIngredientMeat() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewIngredientMeat();
	}
	@Override
	public ArrayList<Ingredients> viewIngredientsProteins() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewIngredientsProteins();
	}
	@Override
	public ArrayList<Ingredients> viewIngredientsSauce() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewIngredientsSauce();
	}
	@Override
	public ArrayList<Cuisine> viewOrientalCuisines() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewOrientalCuisines();
	}
	@Override
	public ArrayList<Cuisine> viewContinentalCuisines() throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewContinentalCuisines();
	}
	@Override
	public String viewRecipe(String dname) throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewRecipe(dname);
	}
	@Override
	public String viewWorkoutInstructions(String wname) throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewWorkoutInstructions(wname);
	}
	@Override
	public boolean insertUserProfileSkip(UserProfile userprofile) throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.insertUserProfileSkip(userprofile);
	}
	@Override
	public int viewRating(String dname) throws ChefOracleException {
		// TODO Auto-generated method stub
		return dao.viewRating(dname);
	}
	
	
}