package iristk.app.fridge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ingredient {
	private double quantity;
	private Unit unit;
	private String name;

	public Ingredient(String name, double quantity, Unit unit) {
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void merge(Ingredient other) {
		assert(getName().equals(other.getName()));

		quantity += other.quantity;
	}

	public boolean hasEnough(Object o) {
		if (o instanceof Ingredient) {
			Ingredient i = (Ingredient) o;

			return name.equals(i.name) && quantity >= i.quantity && unit == i.unit;
		}

		return false;
	}
	
	public double updateQuantity(double q) {
		quantity -= q;

		return quantity;
	}
	
	public String toNaturalLanguage() {
		StringBuilder sb = new StringBuilder();

		sb.append(unit.toNaturalLanguage(quantity))
		  .append(" ")
		  .append(name);

		return sb.toString();
	}

	public static String concat(List<Ingredient> ingredients) {
		StringBuilder sb = new StringBuilder();

		for (Ingredient i : ingredients)
			sb.append(i.toNaturalLanguage()).append(", ");

		return sb.toString();
	}

	public static String getGrammar() {
		List<Ingredient> ingredients = factory();
		StringBuilder sb = new StringBuilder();

		sb.append("<grammar xml:lang=\"en-US\" version=\"1.0\" root=\"root\" xmlns=\"http://www.w3.org/2001/06/grammar\" tag-format=\"semantics/1.0\">");
		sb.append("<rule id=\"root\" scope=\"public\"><one-of>");

		for (int i = 0; i < ingredients.size(); i++)
			sb.append("<item>" + ingredients.get(i).getName() + "<tag>out.ingredient=\"" + i + "\"</tag></item>");

		sb.append("</one-of></rule></grammar>");	

		return sb.toString();
	}

	public static List<Ingredient> factory() {
		try {
			List<Ingredient> ingredients = new ArrayList<Ingredient>();
			InputStream in = new FileInputStream("C:\\Users\\antoli\\IrisTK\\ingredients.txt");
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);

			String line;
			while ((line = br.readLine()) != null)
				ingredients.add(new Ingredient(line, 1, Unit.ENUMERABLE));
			br.close();

			return ingredients;
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException: " + e);
		} catch (IOException e) {
			System.err.println("IOException : " + e);
		}

		return null;
	}
}