package drexel.dui.dao;

import java.util.ArrayList;

import drexel.dui.dto.Cuisine;
import drexel.dui.dto.Dish;
import drexel.dui.dto.Ingredients;
import drexel.dui.dto.LookupWorkout;
import drexel.dui.dto.MealType;
import drexel.dui.dto.Selects;
import drexel.dui.dto.UserProfile;
import drexel.dui.exception.ChefOracleException;

public interface IChefOracleDao {
	public boolean validateUser(String login,String password) throws ChefOracleException;
	//public boolean insertUser(User user) throws ChefOracleException;
	public boolean insertUserProfile(UserProfile userprofile) throws ChefOracleException;
	public ArrayList<Ingredients> viewIngredients( ) throws ChefOracleException;
	public ArrayList<Ingredients> viewIngredientsVeg( ) throws ChefOracleException;
	public ArrayList<Ingredients> viewIngredientMeat( ) throws ChefOracleException;
	public ArrayList<Ingredients> viewIngredientsProteins( ) throws ChefOracleException;
	public ArrayList<Ingredients> viewIngredientsSauce( ) throws ChefOracleException;
	public ArrayList<Cuisine> viewOrientalCuisines( ) throws ChefOracleException;
	public ArrayList<Cuisine> viewContinentalCuisines( ) throws ChefOracleException;
	public ArrayList<MealType> viewMealType() throws ChefOracleException;
	public boolean insertIntoSelects(Selects selects) throws ChefOracleException;
	public ArrayList<Selects> viewSelectedItems() throws ChefOracleException;
	public boolean updateSelection(Selects selects, String uname) throws ChefOracleException;//to update user selections
	public boolean deleteSelections(String uname) throws ChefOracleException;
	public ArrayList<Dish> viewDish(String[] ingredients,String[] cuisine,String[] mealType,String  cookingExperience,String foodPreference)  throws ChefOracleException;
	public String viewRecipe(String dname)  throws ChefOracleException;
	public int getCalories() throws ChefOracleException;
	public ArrayList<LookupWorkout> viewWorkout(String dname)  throws ChefOracleException;
	public String viewWorkoutInstructions(String wname) throws ChefOracleException;
	//public ArrayList<Dish> viewDish(Dish dishes,MealType mealtype,Cuisine cuisine, Ingredients ingredients)  throws ChefOracleException;
	public boolean insertUserProfileSkip(UserProfile userprofile) throws ChefOracleException;
	public int viewRating(String dname) throws ChefOracleException;
}
