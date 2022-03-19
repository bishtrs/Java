public class Color {
	private String color;

	public Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Color) {
			Color other = (Color) obj;
			if (other.color.equals(this.color)) {
				return true;
			}
		} 
		return false;			
	}

	public static void main(String args[]) {
		Color c1 = new Color("blue");
		Color c2 = new Color("blue");
		System.out.println(c1.equals(c2));
	}
	
}