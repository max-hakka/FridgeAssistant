package iristk.app.fridge;

import java.util.ArrayList;

public class CookBook {
	ArrayList<Recipe> recipes = new ArrayList<Recipe>();

	public void addRecipe(Recipe r) {
		recipes.add(r);
	}

	public Recipe search(String str) {
		String query = str.toLowerCase();
		Recipe candidate = null;
		for (Recipe r : recipes) {
			if (r.getName().toLowerCase().contains(query)) {
				if (candidate == null)
					candidate = r;
				else if (candidate.getName().length() > r.getName().length())
					candidate = r;
			}
		}

		return candidate;
	}
}