package model.Item;

public class Armor extends BasedEquipment{
    private int defense, resistance;
    private int power;

    public Armor(String name, int defense, int resistance, String imgpath) {
        this.name = name;
        this.imgpath = imgpath;
        this.defense = defense;
        this.resistance = resistance;
    }
    public String getImagepath() {
        return imgpath;
    }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }
    public int getResistance() { return resistance; }
    public void setResistant(int resistance) { this.resistance = resistance; }
    @Override
    public String toString() { return name; }
}
