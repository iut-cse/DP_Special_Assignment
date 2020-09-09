import java.util.ArrayList;

public class RoomDesign implements IDesign{

    ArrayList<FurnitureDesign> furnitureDesigns;

    public RoomDesign(ArrayList<FurnitureDesign> furnitureDesigns) {
        this.furnitureDesigns = furnitureDesigns;
    }

    void add(FurnitureDesign furnitureDesign) {
        this.furnitureDesigns.add(furnitureDesign);
    }

    void remove() {
        this.furnitureDesigns.remove(0);
    }

    @Override
    public void design() {
        for (FurnitureDesign furniture: this.furnitureDesigns) {
            furniture.design();
        }
        System.out.println("Room Design");
    }
}
