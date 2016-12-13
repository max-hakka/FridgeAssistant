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
	private Recipe recipe;

	private void initVariables() {
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
			// Line: 11
			try {
				EXECUTION: {
					int count = getCount(24529870) + 1;
					incrCount(24529870);
					// Line: 12
					cookBook = CookBook.factory();
					// Line: 13
					fridge = Fridge.factory();
					// Line: 14
					boolean chosen0 = false;
					boolean matching1 = true;
					while (!chosen0 && matching1) {
						int rand2 = random(33439459, 5, iristk.util.RandomList.RandomModel.DECK_RESHUFFLE_NOREPEAT);
						matching1 = false;
						if (true) {
							matching1 = true;
							if (rand2 >= 0 && rand2 < 1) {
								chosen0 = true;
								iristk.flow.DialogFlow.say state3 = new iristk.flow.DialogFlow.say();
								StringCreator string4 = new StringCreator();
								string4.append("HUNGRY, are we?");
								state3.setText(string4.toString());
								if (!flowThread.callState(state3, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 14, 12)))) {
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
								if (!flowThread.callState(state5, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 14, 12)))) {
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
								if (!flowThread.callState(state7, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 14, 12)))) {
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
								if (!flowThread.callState(state9, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 14, 12)))) {
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
								if (!flowThread.callState(state11, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 14, 12)))) {
									eventResult = EVENT_ABORTED;
									break EXECUTION;
								}
							}
						}
					}
					// Line: 21
					Dispatch state13 = new Dispatch();
					flowThread.gotoState(state13, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 21, 28)));
					eventResult = EVENT_ABORTED;
					break EXECUTION;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 11, 12));
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
			// Line: 26
			try {
				EXECUTION: {
					int count = getCount(32690318) + 1;
					incrCount(32690318);
					iristk.flow.DialogFlow.listen state14 = new iristk.flow.DialogFlow.listen();
					if (!flowThread.callState(state14, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 26, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 26, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			// Line: 29
			try {
				count = getCount(11911716) + 1;
				if (event.triggers("sense.user.speak")) {
					incrCount(11911716);
					eventResult = EVENT_CONSUMED;
					EXECUTION: {
						// Line: 30
						if (asInteger(event.get("sem:cook"))==1) {
							iristk.flow.DialogFlow.say state15 = new iristk.flow.DialogFlow.say();
							StringCreator string16 = new StringCreator();
							string16.append("Okay.");
							state15.setText(string16.toString());
							if (!flowThread.callState(state15, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 30, 44)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 32
							Cook state17 = new Cook();
							flowThread.gotoState(state17, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 32, 25)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
							// Line: 33
						} else {
							iristk.flow.DialogFlow.say state18 = new iristk.flow.DialogFlow.say();
							StringCreator string19 = new StringCreator();
							string19.append("That was too low, let's try again.");
							state18.setText(string19.toString());
							if (!flowThread.callState(state18, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 30, 44)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 35
							flowThread.reentryState(this, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 35, 15)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
					}
					if (eventResult != EVENT_IGNORED) return eventResult;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 29, 36));
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
			// Line: 41
			try {
				EXECUTION: {
					int count = getCount(15491924) + 1;
					incrCount(15491924);
					iristk.flow.DialogFlow.say state20 = new iristk.flow.DialogFlow.say();
					StringCreator string21 = new StringCreator();
					string21.append("What do you want to cook?");
					state20.setText(string21.toString());
					if (!flowThread.callState(state20, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 41, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
					iristk.flow.DialogFlow.listen state22 = new iristk.flow.DialogFlow.listen();
					state22.setContext("default recipes");
					if (!flowThread.callState(state22, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 41, 12)))) {
						eventResult = EVENT_ABORTED;
						break EXECUTION;
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 41, 12));
			}
		}

		@Override
		public int onFlowEvent(Event event) throws Exception {
			int eventResult;
			int count;
			// Line: 45
			try {
				count = getCount(6640161) + 1;
				if (event.triggers("sense.user.speak")) {
					incrCount(6640161);
					eventResult = EVENT_CONSUMED;
					EXECUTION: {
						// Line: 46
						if (event.has("sem:recipe")) {
							iristk.flow.DialogFlow.say state23 = new iristk.flow.DialogFlow.say();
							StringCreator string24 = new StringCreator();
							string24.append("Found it!");
							state23.setText(string24.toString());
							if (!flowThread.callState(state23, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 46, 33)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 48
							recipe = cookBook.lookup(event.get("sem:recipe"));
							// Line: 49
							CheckIngredients state25 = new CheckIngredients();
							flowThread.gotoState(state25, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 49, 38)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
							// Line: 50
						} else {
							iristk.flow.DialogFlow.say state26 = new iristk.flow.DialogFlow.say();
							StringCreator string27 = new StringCreator();
							string27.append("I can't find that. Please try again");
							state26.setText(string27.toString());
							if (!flowThread.callState(state26, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 46, 33)))) {
								eventResult = EVENT_ABORTED;
								break EXECUTION;
							}
							// Line: 52
							Cook state28 = new Cook();
							flowThread.gotoState(state28, currentState, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 52, 25)));
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
					}
					if (eventResult != EVENT_IGNORED) return eventResult;
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 45, 36));
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
			// Line: 58
			try {
				EXECUTION: {
					int count = getCount(14621846) + 1;
					incrCount(14621846);
					// Line: 59
					if (fridge.canCook(recipe).isEmpty()) {
						iristk.flow.DialogFlow.say state29 = new iristk.flow.DialogFlow.say();
						StringCreator string30 = new StringCreator();
						string30.append("You can cook this recipe:");
						// Line: 59
						string30.append(recipe.getName());
						state29.setText(string30.toString());
						if (!flowThread.callState(state29, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 59, 48)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
						// Line: 61
					} else {
						iristk.flow.DialogFlow.say state31 = new iristk.flow.DialogFlow.say();
						StringCreator string32 = new StringCreator();
						string32.append("No banana, janne, you cannot cook this recipe:");
						// Line: 61
						string32.append(recipe.getName());
						state31.setText(string32.toString());
						if (!flowThread.callState(state31, new FlowEventInfo(currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 59, 48)))) {
							eventResult = EVENT_ABORTED;
							break EXECUTION;
						}
					}
				}
			} catch (Exception e) {
				throw new FlowException(e, currentState, event, new XMLLocation(new File("C:\\Users\\antoli\\IrisTK\\app\\fridge\\src\\iristk\\app\\fridge\\FridgeFlow.xml"), 58, 12));
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
