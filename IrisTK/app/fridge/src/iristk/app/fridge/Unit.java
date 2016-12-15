package iristk.app.fridge;

public enum Unit {
	UNKNOWN,
	ENUMERABLE,
	LIQUID,
	WEIGHT;
	
	public String toNaturalLanguage(double quantity) {		
		StringBuilder sb = new StringBuilder();

		switch (this) {
		case ENUMERABLE:
			if ((quantity % 1) == 0)
				sb.append((int)quantity);
			else
				sb.append(quantity);
			break;
		case LIQUID:
			sb.append(quantity).append(" liter");
			break;
		case WEIGHT:
			sb.append(quantity).append(" kilogram");
			break;
		}

		return sb.toString();
	}
}

