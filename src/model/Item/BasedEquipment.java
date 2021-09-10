package model.Item;

import javafx.scene.input.DataFormat;

import java.io.Serializable;

//-----------1.36---------
//public class BasedEquipment {
public class BasedEquipment implements Serializable {
    //    public static final DataFormat DATA_FORMAT = null;
    public static final DataFormat DATA_FORMAT = new DataFormat("src.model.Item. BasedEquipment");
    protected String name;
    protected String imgpath;

    public String getName() { return name; }
    public String getImagepath() { return imgpath; }

    public void setImagepath(String imgpath) {
        this.imgpath = imgpath;
    }
}
