package enity;

import java.io.Serializable;

public class Fruit implements Serializable {
    private String name;
    private String introduce;
    private int imgId;
    private String price;

    public Fruit(String name, int imgId,String introduce, String price) {
        this.name = name;
        this.introduce = introduce;
        this.imgId = imgId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
