import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(){}

    public Box(T... fruit){
        this.fruits = new ArrayList<T>(Arrays.asList(fruit));
    }

    public float getWeight(){
        float boxWeight = 0f;
        if (fruits.isEmpty()) return boxWeight;

        for(int i = 0; i < fruits.size(); i++){
            boxWeight += fruits.get(i).getWeight();
        }
        return boxWeight;
    }

    public void addFruit(T... fruit){
        this.fruits.addAll(Arrays.asList(fruit));
    }

    public void addFruit(ArrayList<T> fruit){
        this.fruits.addAll(fruit);
    }

    public boolean compared(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public void sprinkle(Box<T> toBox){
        toBox.addFruit(this.fruits);
        this.fruits.clear();
    }


}
