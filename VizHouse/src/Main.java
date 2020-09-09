import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FurnitureDesign furnitureDesign1 = new FurnitureDesign();
        FurnitureDesign furnitureDesign2 = new FurnitureDesign();
        FurnitureDesign furnitureDesign3 = new FurnitureDesign();
        ArrayList<FurnitureDesign> arrayList = new ArrayList<FurnitureDesign>();
        arrayList.add(furnitureDesign1);
        arrayList.add(furnitureDesign2);
        arrayList.add(furnitureDesign3);

        RoomDesign roomDesign = new RoomDesign(arrayList);
        roomDesign.design();
    }
}
