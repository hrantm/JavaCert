package sectionTests;

public enum Color {
	Red("RED", 1), Blue("BLUE", 2), Green("GREEN",3);

	private String color = null;
	private int value;

	Color(String color, int value) {
		this.color = color;
		this.value = value;
	}

	public static int getColorCode(Color color) {
		int ret = -1;
		switch (color) {
		case Red:
			ret = 1;
			break;
		case Blue:
			ret = 2;
			break;
		case Green:
			ret = 3;
			break;

		default:
			throw new RuntimeException("Illegal Color");
		}
		return ret;
	}
}