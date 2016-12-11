package iristk.app.fridge;

import java.util.ArrayList;

/*
import iristk.situated.SituatedDialogSystem;
import iristk.situated.SystemAgentFlow;
import iristk.speech.SpeechGrammarContext;
import iristk.speech.Voice.Gender;
import iristk.speech.windows.WindowsRecognizerFactory;
import iristk.speech.windows.WindowsSynthesizer;
import iristk.util.Language;
import iristk.app.quiz.src.Question;
import iristk.app.quiz.src.QuestionSet;
import iristk.app.quiz.src.QuizFlow;
import iristk.cfg.SRGSGrammar;
import iristk.flow.FlowModule;
*/

public class FridgeSystem {

	public FridgeSystem() throws Exception {
		CookBook cb = new CookBook();
		Fridge f = new Fridge();

		// Add ingredients to fridge and later update one of them.
		{
			ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
			ingredients.add(new Ingredient("Banana", 10, Unit.ENUMERABLE));
			ingredients.add(new Ingredient("Sugar", 0.1, Unit.LIQUID));
			f.addIngredients(ingredients);
			assert(f.getIngredients().size() == 2);
			assert(f.getIngredients().get("Banana").getQuantity() == 10);
			assert(f.getIngredients().get("Sugar").getQuantity() == 0.1);

			ingredients.clear();
			ingredients.add(new Ingredient("Sugar", 0.1, Unit.LIQUID));
			f.addIngredients(ingredients);
			assert(f.getIngredients().size() == 2);
			assert(f.getIngredients().get("Sugar").getQuantity() == 0.2);
		}

		// Add recipe and assert missing ingredients in fridge.
		{
			ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
			ingredients.add(new Ingredient("Banana", 11, Unit.ENUMERABLE));
			ingredients.add(new Ingredient("Sugar", 0.1, Unit.LIQUID));
			Recipe r = new Recipe("Banana cake fruit sallad intensive taste DOT com", ingredients);
			cb.addRecipe(r);

			ArrayList<Ingredient> missing = f.canCook(r);
			assert(missing.size() == 1);
			assert(missing.get(0).getName().equals("Banana"));
		}

		// Add another recipe, requiring an extra ingredient namely cheese.
		{
			ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
			ingredients.add(new Ingredient("Banana", 11, Unit.ENUMERABLE));
			ingredients.add(new Ingredient("Cheese", 0.1, Unit.WEIGHT));
			ingredients.add(new Ingredient("Sugar", 0.1, Unit.LIQUID));
			Recipe r = new Recipe("Banana cake", new ArrayList<Ingredient>(ingredients));
			
			ArrayList<Ingredient> missing = f.canCook(r);
			assert(missing.size() == 2);
			assert(missing.get(0).getName().equals("Banana"));
			assert(missing.get(1).getName().equals("Cheese"));
			
			cb.addRecipe(r);
		}

		// Search for a recipe containing the term Banana, shortest match should be favored.
		{
			Recipe r = cb.search("Banana");
			assert(r.getName().equals("Banana cake"));
			assert(r.getIngredients().size() == 3);
		}
		
		{
			ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
			ingredients.add(new Ingredient("Banana", 2, Unit.ENUMERABLE));
			ingredients.add(new Ingredient("Cheese", 0.1, Unit.WEIGHT));
			f.addIngredients(ingredients);
			assert(f.getIngredients().get("Banana").getQuantity() == 12);
			assert(f.getIngredients().get("Cheese").getQuantity() == 0.1);

			Recipe r = cb.search("Banana");
			assert(r != null);
			assert(f.consume(r));
			assert(f.getIngredients().size() == 2);
			assert(f.getIngredients().get("Banana").getQuantity() == 1);
			assert(f.getIngredients().get("Sugar").getQuantity() == 0.1);
			assert(f.getIngredients().get("Cheese") == null);
		}

		/*
		SituatedDialogSystem system = new SituatedDialogSystem(this.getClass());
		SystemAgentFlow systemAgentFlow = system.addSystemAgent();
		
		system.setLanguage(Language.ENGLISH_US);
		
		//system.setupLogging(new File("c:/iristk_logging"), true);
		
		system.setupGUI();
		
		//system.setupKinect();
		
		//system.setupMonoMicrophone(new WindowsRecognizerFactory());
		system.setupStereoMicrophones(new WindowsRecognizerFactory());
		//system.setupKinectMicrophone(new KinectRecognizerFactory());
		
		//system.connectToBroker("furhat", "127.0.0.1");
		system.setupFace(new WindowsSynthesizer(), Gender.FEMALE);
		
		QuestionSet questions = new QuestionSet(system.getPackageFile("questions.txt"));
		system.addModule(new FlowModule(new QuizFlow(questions, systemAgentFlow)));
		
		system.loadContext("default", new SpeechGrammarContext(new SRGSGrammar(system.getPackageFile("QuizGrammar.xml"))));
		for (Question q : questions) {
			system.loadContext(q.getId(), new SpeechGrammarContext(q.getGrammar()));
		}
		system.setDefaultContext("default");
		
		system.loadPositions(system.getPackageFile("situation.properties"));		
		system.sendStartSignal();
		*/
	}
	
	public static void main(String[] args) throws Exception {
		new FridgeSystem();
	}

}
