

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

	private Item  itemObj; // HAS-A Relationship

	public Shop(Item itemObj)
	{
		this.itemObj = itemObj;
	}


	public void getInfo()
	{

		System.out.println(" Item Info "+itemObj.getItemInfo());
	}

}

public class HasARelationshipEx
{
	public static void main(String args[])
	{
		Item item = new Item(1,"Santoor");
		Shop shop = new Shop(item);
		shop.getInfo();
	}
}