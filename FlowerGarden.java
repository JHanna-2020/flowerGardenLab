import java.util.Arrays;
import java.util.ArrayList;

public class FlowerGarden
{
	//create an arraylist instance variable
    private ArrayList<String> flowers;
	
	//write a constructor
    public FlowerGarden(){
        flowers = new ArrayList<String>();

    }
	
	//write add flower
	public void addFlower(String userInput){

        flowers.add("01 "+userInput);

    }
	//write get count
		public String getCount(String input){
        int counter =0;
        for(int i = 0; i< flowers.size();i++){
            if(input.equals(flowers.get(i))){
            counter++;
            }

        }
            if(counter>=1){
                return "There are "+counter+" "+  input+"s in the flower garden";
            }
            return "There are no "+input +"s in the flower garden";

        }
	//write get flower name
	
	//write in range
	
	//write find flower
public int findFlower(String input){

    return flowers.lastIndexOf(input);

}

	//write max flower	
	
	//write a toString
    public String toString(){
        return Arrays.toString(flowers.toArray());
    }
}