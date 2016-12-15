package iristk.app.fridge;

import java.util.ArrayList;
import java.util.List;

public class CookBook extends ArrayList<Recipe> {
	public String getGrammar() {
		StringBuilder grammar = new StringBuilder();

		grammar.append("<grammar xml:lang=\"en-US\" version=\"1.0\" root=\"root\" xmlns=\"http://www.w3.org/2001/06/grammar\" tag-format=\"semantics/1.0\">");
		grammar.append("<rule id=\"root\" scope=\"public\"><one-of>");

		for (int i = 0; i < size(); i++)
			grammar.append("<item>" + get(i).getName().toLowerCase() + "<tag>out.recipe=\"" + i + "\"</tag></item>");

		grammar.append("</one-of></rule></grammar>");	

		return grammar.toString();
	}

	public Recipe lookup(Object o) {
		if (o == null || !(o instanceof String))
			return null;

		return get(Integer.parseInt(o.toString()));
	}

	/**
	 * Add all available recipes to the default cook-book.
	 */
	public static CookBook factory() {
		CookBook cb = new CookBook();

		List<Ingredient> i1 = new ArrayList<Ingredient>();
		i1.add(new Ingredient("Toast", 1, Unit.ENUMERABLE));
		i1.add(new Ingredient("Cheese", 1, Unit.ENUMERABLE));
		i1.add(new Ingredient("Tomato", 1, Unit.ENUMERABLE));
		cb.add(new Recipe("Toast", i1));

		List<Ingredient> i2 = new ArrayList<Ingredient>();
		i2.add(new Ingredient("Soup", 1, Unit.ENUMERABLE));
		i2.add(new Ingredient("Toast", 1, Unit.ENUMERABLE));
		cb.add(new Recipe("Tomato Soup", i2));

		return cb;
	}
}