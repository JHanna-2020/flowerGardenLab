//(c) A+ Computer Science
// www.apluscompsci.com

public class FlowerGardenRunner
{
   public static void main(String args[])
	{
		FlowerGarden fg = new FlowerGarden();
		fg.addFlower( "daisy" );
		fg.addFlower( "rose" );
		fg.addFlower( "poppy" );
		fg.addFlower( "sunflower" );
		fg.addFlower( "daisy" );
		System.out.println( fg );
		System.out.println( fg.findFlower( "daisy" ) );
		System.out.println( fg.findFlower( "orchid" ) );
		System.out.println( fg.getCount( "daisy" ) );
		System.out.println( fg.getCount( "orchid" ) );



		//add test cases																		
	} 
}