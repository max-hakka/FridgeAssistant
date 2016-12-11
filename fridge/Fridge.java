package iristk.app.fridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fridge {
	Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

	public ArrayList<Ingredient> canCook(Recipe r) {
		ArrayList<Ingredient> missing = new ArrayList<Ingredient>();
		for (Ingredient i : r.getIngredients()) {
			Ingredient inFridge = ingredients.get(i.getName());
			if (inFridge == null)
				missing.add(i);
			else if (!inFridge.hasEnough(i))
				missing.add(i);
		}

		return missing;
	}
	
	public void addIngredients(ArrayList<Ingredient> list) {
		for (Ingredient i : list) {
			Ingredient inFridge = ingredients.get(i.getName());
			if (inFridge == null)
				ingredients.put(i.getName(), i);
			else
				ingredients.get(i.getName()).merge(i);
		}
	}

	public Map<String, Ingredient> getIngredients() {
		return ingredients;
	}
	
	public boolean consume(Recipe r) {
		if(canCook(r).size() != 0) 
			return false;
		for (Ingredient i : r.getIngredients()) {
			Ingredient inFridge = ingredients.get(i.getName());
			assert(inFridge != null);
			if(inFridge.updateQuantity(i.getQuantity()) == 0)
				ingredients.remove(i.getName());
		}
		return true;
	}
}