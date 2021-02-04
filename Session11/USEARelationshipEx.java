

class Item
{
	private int itemId;
	private String itemName;

	public Item(int itemId, String itemName)
		{
			this.itemId = itemId;
			this.itemName = itemName;
		}

		public String getItemInfo()
		{
			return itemId + " : "+itemName;
		}
}



class Shop
{


	public Shop()
	{

	}


	public void getInfo(Item item)  // USA-A Relationship 
	{

		System.out.println(" Item Info "+item.getItemInfo());
	}

}

public class USEARelationshipEx
{
	public static void main(String args[])
	{
		Item item = new Item(1,"Santoor");
		Shop shop = new Shop();
		shop.getInfo(item);
	}
}