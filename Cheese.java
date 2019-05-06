
public class Cheese {
		private String cheeseType;
		private double cheesePrice;
		
		/**
		 * @param args the command line arguments
		 */
		public Cheese(String newCheeseType, double newCheesePrice){
				cheeseType = newCheeseType;
				cheesePrice = newCheesePrice;
		}

		Cheese(String camry) {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		}
			 
		public String getCheeseType()
		{
				return cheeseType;
		}
		public double getCheesePrice()
		{
				return cheesePrice;
		}
		public void setCheeseType(String cheeseType)
		{
		}
		public void setCheesePrice(double cheesePrice)
		{        
		}
		/**
			The equals method compares this Cheese to another Object .
			@param The object to test for equality.
			@return boolean with result of test for equality.
	 	*/
		public boolean equals(Object obj)
		{
				if (!(obj instanceof Cheese))
						throw new ClassCastException("A Car object expected.");

				Cheese otherCheese = (Cheese) obj;  // cast the Object to a Car

				if (cheeseType.equalsIgnoreCase(otherCheese.getCheeseType())
						&& cheesePrice == otherCheese.getCheesePrice())
						return true;
				else
						return false;
		}
	 
		public String toString()
		{
				return "Cheese Type" + cheeseType + "Cheese Price" + cheesePrice;
		}
		
}
