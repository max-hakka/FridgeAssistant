package iristk.app.fridge;

import java.util.List;
import java.io.File;
import iristk.xml.XmlMarshaller.XMLLocation;
import iristk.system.Event;
import iristk.flow.*;
import iristk.util.Record;
import static iristk.util.Converters.*;
import static iristk.flow.State.*;

public class FridgeFlow extends iristk.flow.Flow {

	private CookBook cookBook;
	private Fridge fridge;
	private List<Ingredient> missingIngredients;
	private List<Ingredient> availableIngredients;
	private List<Recipe> availableRecipes;
	private Recipe recipe;

	private void initVariables() {
		cookBook = (CookBook) CookBook.factory();
		fridge = (Fridge) Fridge.factory();
		availableIngredients = (List<Ingredient>) Ingredient.factory();
	}

	public CookBook getCookBook() {
		return this.cookBook;
	}

	public void setCookBook(CookBook value) {
		this.cookBook = value;
	}

	public Fridge getFridge() {
		return this.fridge;
	}

	public void setFridge(Fridge value) {
		this.fridge = value;
	}

	public List<Ingredient> getMissingIngredients() {
		return this.missingIngredients;
	}

	public void setMissingIngredients(List<Ingredient> value) {
		this.missingIngredients = value;
	}

	public List<Ingredient> getAvailableIngredients() {
		return this.availableIngredients;
	}

	public void setAvailableIngredients(List<Ingredient> value) {
		this.availableIngredients = value;
	}

	public List<Recipe> getAvailableRecipes() {
		return this.availableRecipes;
	}

	public void setAvailableRecipes(List<Recipe> value) {
		this.availableRecipes = value;
	}

	public Recipe getRecipe() {
		return this.recipe;
	}

	public void setRecipe(Recipe value) {
		this.recipe = value;
	}

	@Override
	public Object getVariable(String name) {
		if (name.equals("cookBook")) return this.cookBook;
		if (name.equals("fridge")) return this.fridge;
		if (name.equals("missingIngredients")) return this.missingIngredients;
		if (name.equals("availableIngredients")) return this.availableIngredients;
		if (name.equals("availableRecipes")) return this.availableRecipes;
		if (name.equals("recipe")) return this.recipe;
		return null;
	}


	public FridgeFlow() {
		initVariables();
	}

	@Override
	public State getInitialState() {return new Start();}


	public class Start extends State implements Initial {

		final State currentState = this;


		@Override
		public void setFlowThread(FlowRunner.FlowThread flowThread) {
			super.setFlowThread(flowThread);
		}

		@Override
		public void onentry() throws Exception {
			int eventResult;
			Event event = new Event("state.enter");
			// Line: 14
			try {
				EXECUTION: {
					int count = getCount(33439459) + 1;
					incrCount(33439459);
					// Line: 15
					boolean chosen0 = false;
					boolean matching1 = true;
					while (!chosen0 && matching1) {
						int rand2 = random(14628265, 5, iristk.util.RandomList.RandomModel.DECK_RESHUFFLE_NOREPEAT);
						matching1 = false;
						if (true) {
							matching1 = true;
							if (rand2 >= 0 && rand2 < 1) {
								chosen0 = true;
								iristk.flow.DialogFlow.say state3 = new iristk.flow.DialogFlow.say();
								StringCreator string4 = new StringCreator();
								string4.append("HUNGRY, are we?");
								state3.setText(string4.toString());
								if (!flowThread.callState(state3, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 15, 12)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
						if (true) {
							matching1 = true;
							if (rand2 >= 1 && rand2 < 2) {
								chosen0 = true;
								iristk.flow.DialogFlow.say state5 = new iristk.flow.DialogFlow.say();
								StringCreator string6 = new StringCreator();
								string6.append("Your wish is my command.");
								state5.setText(string6.toString());
								if (!flowThread.callState(state5, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 15, 12)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
						if (true) {
							matching1 = true;
							if (rand2 >= 2 && rand2 < 3) {
								chosen0 = true;
								iristk.flow.DialogFlow.say state7 = new iristk.flow.DialogFlow.say();
								StringCreator string8 = new StringCreator();
								string8.append("Apple and pears, speak to my ears.");
								state7.setText(string8.toString());
								if (!flowThread.callState(state7, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 15, 12)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
						if (true) {
							matching1 = true;
							if (rand2 >= 3 && rand2 < 4) {
								chosen0 = true;
								iristk.flow.DialogFlow.say state9 = new iristk.flow.DialogFlow.say();
								StringCreator string10 = new StringCreator();
								string10.append("What's cooking good looking?");
								state9.setText(string10.toString());
								if (!flowThread.callState(state9, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 15, 12)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
						if (true) {
							matching1 = true;
							if (rand2 >= 4 && rand2 < 5) {
								chosen0 = true;
								iristk.flow.DialogFlow.say state11 = new iristk.flow.DialogFlow.say();
								StringCreator string12 = new StringCreator();
								string12.append("What can I do you for?");
								state11.setText(string12.toString());
								if (!flowThread.callState(state11, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 15, 12)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
					}
					// Line: 22
					Dispatch state13 = new Dispatch();
					flowThread.gotoState(state13, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 22, 28)));
					eventResult = EVENT_ABORTED;
					break EXECUTION;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 14, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			eventResult = super.onFlowEvent(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			eventResult = callerHandlers(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			return EVENT_IGNORED;
		}

	}


	private class Dispatch extends State {

		final State currentState = this;


		@Override
		public void setFlowThread(FlowRunner.FlowThread flowThread) {
			super.setFlowThread(flowThread);
		}

		@Override
		public void onentry() throws Exception {
			int eventResult;
			Event event = new Event("state.enter");
			// Line: 27
			try {
				EXECUTION: {
					int count = getCount(11911716) + 1;
					incrCount(11911716);
					iristk.flow.DialogFlow.listen state14 = new iristk.flow.DialogFlow.listen();
					if (!flowThread.callState(state14, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 27, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 27, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			// Line: 30
			try {
				count = getCount(31611766) + 1;
				if (event.triggers("sense.user.speak")) {
					if (event.has("sem:cook")) {
						incrCount(31611766);
						eventResult = EVENT_CONSUMED;
						EXECUTION: {
							iristk.flow.DialogFlow.say state15 = new iristk.flow.DialogFlow.say();
							StringCreator string16 = new StringCreator();
							string16.append("Okay.");
							state15.setText(string16.toString());
							if (!flowThread.callState(state15, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 30, 59)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 32
							Cook state17 = new Cook();
							flowThread.gotoState(state17, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 32, 24)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						if (eventResult != EVENT_IGNORED) return eventResult;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 30, 59));
			}
			// Line: 34
			try {
				count = getCount(10684311) + 1;
				if (event.triggers("sense.user.speak")) {
					if (event.has("sem:suggest")) {
						incrCount(10684311);
						eventResult = EVENT_CONSUMED;
						EXECUTION: {
							iristk.flow.DialogFlow.say state18 = new iristk.flow.DialogFlow.say();
							StringCreator string19 = new StringCreator();
							string19.append("Alright, let's see what we have.");
							state18.setText(string19.toString());
							if (!flowThread.callState(state18, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 34, 62)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 36
							Suggestion state20 = new Suggestion();
							flowThread.gotoState(state20, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 36, 30)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						if (eventResult != EVENT_IGNORED) return eventResult;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 34, 62));
			}
			// Line: 38
			try {
				count = getCount(26189270) + 1;
				if (event.triggers("sense.user.speak")) {
					if (event.has("sem:groceries")) {
						incrCount(26189270);
						eventResult = EVENT_CONSUMED;
						EXECUTION: {
							iristk.flow.DialogFlow.say state21 = new iristk.flow.DialogFlow.say();
							StringCreator string22 = new StringCreator();
							string22.append("Okay.");
							state21.setText(string22.toString());
							if (!flowThread.callState(state21, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 38, 64)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 40
							Groceries state23 = new Groceries();
							flowThread.gotoState(state23, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 40, 29)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						if (eventResult != EVENT_IGNORED) return eventResult;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 38, 64));
			}
			// Line: 42
			try {
				count = getCount(6640161) + 1;
				if (event.triggers("sense.user.silence sense.user.speak")) {
					incrCount(6640161);
					eventResult = EVENT_CONSUMED;
					EXECUTION: {
						iristk.flow.DialogFlow.say state24 = new iristk.flow.DialogFlow.say();
						StringCreator string25 = new StringCreator();
						string25.append("I don't understand you. Please repeat.");
						state24.setText(string25.toString());
						if (!flowThread.callState(state24, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 42, 55)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						// Line: 44
						Dispatch state26 = new Dispatch();
						flowThread.gotoState(state26, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 44, 28)));
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
					if (eventResult != EVENT_IGNORED) return eventResult;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 42, 55));
			}
			eventResult = super.onFlowEvent(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			eventResult = callerHandlers(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			return EVENT_IGNORED;
		}

	}


	private class Groceries extends State {

		final State currentState = this;


		@Override
		public void setFlowThread(FlowRunner.FlowThread flowThread) {
			super.setFlowThread(flowThread);
		}

		@Override
		public void onentry() throws Exception {
			int eventResult;
			Event event = new Event("state.enter");
			// Line: 49
			try {
				EXECUTION: {
					int count = getCount(7289688) + 1;
					incrCount(7289688);
					iristk.flow.DialogFlow.say state27 = new iristk.flow.DialogFlow.say();
					StringCreator string28 = new StringCreator();
					string28.append("Please specify ingredient name");
					state27.setText(string28.toString());
					if (!flowThread.callState(state27, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 49, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
					iristk.flow.DialogFlow.listen state29 = new iristk.flow.DialogFlow.listen();
					state29.setContext("default ingredients");
					if (!flowThread.callState(state29, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 49, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 49, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			// Line: 53
			try {
				count = getCount(2988910) + 1;
				if (event.triggers("sense.user.speak")) {
					if (event.has("sem:ingredient")) {
						incrCount(2988910);
						eventResult = EVENT_CONSUMED;
						EXECUTION: {
							// Line: 54
							Ingredient ingredient = (Ingredient) availableIngredients.get(asInteger(event.get("sem:ingredient")));
							// Line: 55
							fridge.addIngredient(ingredient);
							iristk.flow.DialogFlow.say state30 = new iristk.flow.DialogFlow.say();
							StringCreator string31 = new StringCreator();
							string31.append("Thanks, added");
							// Line: 55
							string31.append(ingredient.getName());
							string31.append(".");
							state30.setText(string31.toString());
							if (!flowThread.callState(state30, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 53, 65)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 57
							boolean chosen32 = false;
							boolean matching33 = true;
							while (!chosen32 && matching33) {
								int rand34 = random(14621846, 2, iristk.util.RandomList.RandomModel.DECK_RESHUFFLE_NOREPEAT);
								matching33 = false;
								if (true) {
									matching33 = true;
									if (rand34 >= 0 && rand34 < 1) {
										chosen32 = true;
										iristk.flow.DialogFlow.say state35 = new iristk.flow.DialogFlow.say();
										StringCreator string36 = new StringCreator();
										string36.append("Do you want to add more ingredients?");
										state35.setText(string36.toString());
										if (!flowThread.callState(state35, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 57, 12)))) {
											eventResult = EVENT_ABORTED;
											break EXECUTION;
										}
									}
								}
								if (true) {
									matching33 = true;
									if (rand34 >= 1 && rand34 < 2) {
										chosen32 = true;
										iristk.flow.DialogFlow.say state37 = new iristk.flow.DialogFlow.say();
										StringCreator string38 = new StringCreator();
										string38.append("Anything else?");
										state37.setText(string38.toString());
										if (!flowThread.callState(state37, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 57, 12)))) {
											eventResult = EVENT_ABORTED;
											break EXECUTION;
										}
									}
								}
							}
							iristk.flow.DialogFlow.listen state39 = new iristk.flow.DialogFlow.listen();
							if (!flowThread.callState(state39, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 53, 65)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
						}
						if (eventResult != EVENT_IGNORED) return eventResult;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 53, 65));
			}
			// Line: 63
			try {
				count = getCount(23265386) + 1;
				if (event.triggers("sense.user.speak")) {
					if (event.has("sem:yes")) {
						incrCount(23265386);
						eventResult = EVENT_CONSUMED;
						EXECUTION: {
							// Line: 64
							flowThread.reentryState(this, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 64, 14)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						if (eventResult != EVENT_IGNORED) return eventResult;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 63, 58));
			}
			// Line: 66
			try {
				count = getCount(3022630) + 1;
				if (event.triggers("sense.user.speak")) {
					if (event.has("sem:no")) {
						incrCount(3022630);
						eventResult = EVENT_CONSUMED;
						EXECUTION: {
							// Line: 67
							Start state40 = new Start();
							flowThread.gotoState(state40, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 67, 26)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						if (eventResult != EVENT_IGNORED) return eventResult;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 66, 57));
			}
			// Line: 69
			try {
				count = getCount(14272056) + 1;
				if (event.triggers("sense.user.speak sense.user.silence")) {
					incrCount(14272056);
					eventResult = EVENT_CONSUMED;
					EXECUTION: {
						iristk.flow.DialogFlow.say state41 = new iristk.flow.DialogFlow.say();
						StringCreator string42 = new StringCreator();
						string42.append("Why so quiet? Dear...");
						state41.setText(string42.toString());
						if (!flowThread.callState(state41, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 69, 55)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						// Line: 71
						flowThread.reentryState(this, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 71, 14)));
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
					if (eventResult != EVENT_IGNORED) return eventResult;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 69, 55));
			}
			eventResult = super.onFlowEvent(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			eventResult = callerHandlers(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			return EVENT_IGNORED;
		}

	}


	private class Suggestion extends State {

		final State currentState = this;


		@Override
		public void setFlowThread(FlowRunner.FlowThread flowThread) {
			super.setFlowThread(flowThread);
		}

		@Override
		public void onentry() throws Exception {
			int eventResult;
			Event event = new Event("state.enter");
			// Line: 76
			try {
				EXECUTION: {
					int count = getCount(27381079) + 1;
					incrCount(27381079);
					// Line: 77
					availableRecipes = fridge.intersect(cookBook);
					// Line: 78
					if (!availableRecipes.isEmpty()) {
						iristk.flow.DialogFlow.say state43 = new iristk.flow.DialogFlow.say();
						StringCreator string44 = new StringCreator();
						string44.append("You can cook the following recipes:");
						// Line: 78
						string44.append(Recipe.concat(availableRecipes));
						state43.setText(string44.toString());
						if (!flowThread.callState(state43, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 78, 43)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						iristk.flow.DialogFlow.say state45 = new iristk.flow.DialogFlow.say();
						StringCreator string46 = new StringCreator();
						string46.append("Do you want to cook any of these recipes?");
						state45.setText(string46.toString());
						if (!flowThread.callState(state45, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 78, 43)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						iristk.flow.DialogFlow.listen state47 = new iristk.flow.DialogFlow.listen();
						state47.setContext("default recipes");
						if (!flowThread.callState(state47, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 78, 43)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						// Line: 82
					} else {
						// Line: 83
						boolean chosen48 = false;
						boolean matching49 = true;
						while (!chosen48 && matching49) {
							int rand50 = random(17097650, 3, iristk.util.RandomList.RandomModel.DECK_RESHUFFLE_NOREPEAT);
							matching49 = false;
							if (true) {
								matching49 = true;
								if (rand50 >= 0 && rand50 < 1) {
									chosen48 = true;
									iristk.flow.DialogFlow.say state51 = new iristk.flow.DialogFlow.say();
									StringCreator string52 = new StringCreator();
									string52.append("You can't cook anything. Please call your personal shopper.");
									state51.setText(string52.toString());
									if (!flowThread.callState(state51, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 83, 13)))) {
										eventResult = EVENT_ABORTED;
										break EXECUTION;
									}
								}
							}
							if (true) {
								matching49 = true;
								if (rand50 >= 1 && rand50 < 2) {
									chosen48 = true;
									iristk.flow.DialogFlow.say state53 = new iristk.flow.DialogFlow.say();
									StringCreator string54 = new StringCreator();
									string54.append("You can't cook anything. Do you want me to call the nearest restuarant? SPONSORED BY: Ikea");
									state53.setText(string54.toString());
									if (!flowThread.callState(state53, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 83, 13)))) {
										eventResult = EVENT_ABORTED;
										break EXECUTION;
									}
								}
							}
							if (true) {
								matching49 = true;
								if (rand50 >= 2 && rand50 < 3) {
									chosen48 = true;
									// Line: 86
									Start state55 = new Start();
									flowThread.gotoState(state55, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 86, 28)));
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 76, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			// Line: 90
			try {
				count = getCount(7023946) + 1;
				if (event.triggers("sense.user.speak")) {
					incrCount(7023946);
					eventResult = EVENT_CONSUMED;
					EXECUTION: {
						// Line: 91
						if (event.has("sem:recipe")) {
							// Line: 92
							if (fridge.canCook(cookBook.lookup(event.get("sem:recipe"))).isEmpty()) {
								// Line: 93
								fridge.consume(cookBook.lookup(event.get("sem:recipe")));
								iristk.flow.DialogFlow.say state56 = new iristk.flow.DialogFlow.say();
								StringCreator string57 = new StringCreator();
								string57.append("Okay. Enjoy your meal.");
								state56.setText(string57.toString());
								if (!flowThread.callState(state56, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 92, 76)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
								// Line: 95
								Start state58 = new Start();
								flowThread.gotoState(state58, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 95, 27)));
								eventResult = EVENT_ABORTED;
								break EXECUTION;
								// Line: 96
							} else {
								iristk.flow.DialogFlow.say state59 = new iristk.flow.DialogFlow.say();
								StringCreator string60 = new StringCreator();
								string60.append("Please choose available recipe.");
								state59.setText(string60.toString());
								if (!flowThread.callState(state59, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 92, 76)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
								// Line: 98
								flowThread.reentryState(this, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 98, 16)));
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 100
						} else if (event.has("sem:no")) {
							iristk.flow.DialogFlow.say state61 = new iristk.flow.DialogFlow.say();
							StringCreator string62 = new StringCreator();
							string62.append("That's too bad.");
							state61.setText(string62.toString());
							if (!flowThread.callState(state61, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 91, 33)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 102
							Start state63 = new Start();
							flowThread.gotoState(state63, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 102, 26)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
							// Line: 103
						} else {
							iristk.flow.DialogFlow.say state64 = new iristk.flow.DialogFlow.say();
							StringCreator string65 = new StringCreator();
							string65.append("I didn't get that. Please repeat.");
							state64.setText(string65.toString());
							if (!flowThread.callState(state64, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 91, 33)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 105
							flowThread.reentryState(this, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 105, 15)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
					}
					if (eventResult != EVENT_IGNORED) return eventResult;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 90, 36));
			}
			eventResult = super.onFlowEvent(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			eventResult = callerHandlers(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			return EVENT_IGNORED;
		}

	}


	private class Cook extends State {

		final State currentState = this;


		@Override
		public void setFlowThread(FlowRunner.FlowThread flowThread) {
			super.setFlowThread(flowThread);
		}

		@Override
		public void onentry() throws Exception {
			int eventResult;
			Event event = new Event("state.enter");
			// Line: 111
			try {
				EXECUTION: {
					int count = getCount(3009755) + 1;
					incrCount(3009755);
					iristk.flow.DialogFlow.say state66 = new iristk.flow.DialogFlow.say();
					StringCreator string67 = new StringCreator();
					string67.append("What do you want to cook?");
					state66.setText(string67.toString());
					if (!flowThread.callState(state66, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 111, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
					iristk.flow.DialogFlow.listen state68 = new iristk.flow.DialogFlow.listen();
					state68.setContext("default recipes");
					if (!flowThread.callState(state68, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 111, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 111, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			// Line: 115
			try {
				count = getCount(15771199) + 1;
				if (event.triggers("sense.user.speak")) {
					incrCount(15771199);
					eventResult = EVENT_CONSUMED;
					EXECUTION: {
						// Line: 116
						if (event.has("sem:recipe")) {
							iristk.flow.DialogFlow.say state69 = new iristk.flow.DialogFlow.say();
							StringCreator string70 = new StringCreator();
							string70.append("Found it!");
							state69.setText(string70.toString());
							if (!flowThread.callState(state69, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 116, 33)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 118
							recipe = cookBook.lookup(event.get("sem:recipe"));
							// Line: 119
							CheckIngredients state71 = new CheckIngredients();
							flowThread.gotoState(state71, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 119, 38)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
							// Line: 120
						} else {
							iristk.flow.DialogFlow.say state72 = new iristk.flow.DialogFlow.say();
							StringCreator string73 = new StringCreator();
							string73.append("I can't find that. Please try again");
							state72.setText(string73.toString());
							if (!flowThread.callState(state72, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 116, 33)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 122
							Cook state74 = new Cook();
							flowThread.gotoState(state74, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 122, 25)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
					}
					if (eventResult != EVENT_IGNORED) return eventResult;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 115, 36));
			}
			eventResult = super.onFlowEvent(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			eventResult = callerHandlers(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			return EVENT_IGNORED;
		}

	}


	private class CheckIngredients extends State {

		final State currentState = this;


		@Override
		public void setFlowThread(FlowRunner.FlowThread flowThread) {
			super.setFlowThread(flowThread);
		}

		@Override
		public void onentry() throws Exception {
			int eventResult;
			Event event = new Event("state.enter");
			// Line: 128
			try {
				EXECUTION: {
					int count = getCount(19053495) + 1;
					incrCount(19053495);
					// Line: 129
					missingIngredients = fridge.canCook(recipe);
					// Line: 130
					if (missingIngredients.isEmpty()) {
						iristk.flow.DialogFlow.say state75 = new iristk.flow.DialogFlow.say();
						StringCreator string76 = new StringCreator();
						string76.append("You can cook this recipe:");
						// Line: 130
						string76.append(recipe.getName());
						state75.setText(string76.toString());
						if (!flowThread.callState(state75, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 130, 44)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						// Line: 132
					} else {
						iristk.flow.DialogFlow.say state77 = new iristk.flow.DialogFlow.say();
						StringCreator string78 = new StringCreator();
						string78.append("You are missing the following ingredients:");
						// Line: 132
						string78.append(Ingredient.concat(missingIngredients));
						string78.append(".");
						state77.setText(string78.toString());
						if (!flowThread.callState(state77, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 130, 44)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						// Line: 134
						boolean chosen79 = false;
						boolean matching80 = true;
						while (!chosen79 && matching80) {
							int rand81 = random(31115012, 1, iristk.util.RandomList.RandomModel.DECK_RESHUFFLE_NOREPEAT);
							matching80 = false;
							if (true) {
								matching80 = true;
								if (rand81 >= 0 && rand81 < 1) {
									chosen79 = true;
									iristk.flow.DialogFlow.say state82 = new iristk.flow.DialogFlow.say();
									StringCreator string83 = new StringCreator();
									string83.append("Time to go shopping!");
									state82.setText(string83.toString());
									if (!flowThread.callState(state82, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 134, 13)))) {
										eventResult = EVENT_ABORTED;
										break EXECUTION;
									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 128, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			eventResult = super.onFlowEvent(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			eventResult = callerHandlers(event);
			if (eventResult != EVENT_IGNORED) return eventResult;
			return EVENT_IGNORED;
		}

	}


}
