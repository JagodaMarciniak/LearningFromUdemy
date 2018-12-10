package SelfStudy.Interfaces.Saveable;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitpoints;
    private int strengh;

    public Monster(String name, int hitpoints, int strengh) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strengh = strengh;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrengh() {
        return strengh;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strengh='" + strengh + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1, "" + this.hitpoints);
        values.add(2, "" + this.strengh);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
    if(savedValues!=null && savedValues.size() >0){
        this.name=savedValues.get(0);
        this.hitpoints = Integer.parseInt(savedValues.get(1));
        this.strengh = Integer.parseInt(savedValues.get(2));
    }
    }
}
