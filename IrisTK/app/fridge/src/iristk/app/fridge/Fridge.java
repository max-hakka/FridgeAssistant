package iristk.app.fridge;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Fridge {
	Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

	public List<Ingredient> canCook(Recipe r) {
		System.out.println("canCook: " + r.getName());
		System.out.println("canCook: " + r.getIngredients().size());
		List<Ingredient> missing = new ArrayList<Ingredient>();
		for (Ingredient i : r.getIngredients()) {
			System.out.println("canCook: ingredient=" + i.getName());
			Ingredient inFridge = ingredients.get(i.getName());
			if (inFridge == null)
				missing.add(i);
			else if (!inFridge.hasEnough(i))
				missing.add(i);
		}

		return missing;
	}
	
	public Fridge addIngredients(List<Ingredient> list) {
		for (Ingredient i : list) {
			Ingredient inFridge = ingredients.get(i.getName());
			if (inFridge == null)
				ingredients.put(i.getName(), i);
			else
				ingredients.get(i.getName()).merge(i);
		}

		return this;
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
			if (inFridge.updateQuantity(i.getQuantity()) == 0)
				ingredients.remove(i.getName());
		}

		return true;
	}

	public static Fridge factory() {
		Fridge f = new Fridge();
		List<Ingredient> ingredients = new ArrayList<Ingredient>();

		ingredients.add(new Ingredient("Tomato", 10, Unit.ENUMERABLE));
		ingredients.add(new Ingredient("Toast", 1, Unit.ENUMERABLE));
		ingredients.add(new Ingredient("Cheese", 1, Unit.ENUMERABLE));

		return f.addIngredients(ingredients);
	}
}