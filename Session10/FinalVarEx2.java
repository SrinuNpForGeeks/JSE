class PanCard

{
	private final String panNo;

	public PanCard(String panNo)
	{
		this.panNo = panNo; // Blank Final Variable
	}

	public String getPanNo()
	{
		return panNo;
	}


}



public class FinalVarEx2
	{
		public static void main(String args[])
		{
			PanCard p = new PanCard("AQ567GN");
			System.out.println(" PanCard "+p.getPanNo());
		}
	}


