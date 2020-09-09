import java.util.ArrayList;

public class ApartmentDesign implements IDesign{

    ArrayList<RoomDesign> roomDesigns;

    public ApartmentDesign(ArrayList<RoomDesign> roomDesigns) {
        this.roomDesigns = roomDesigns;
    }

    void add(RoomDesign roomDesign) {
        this.roomDesigns.add(roomDesign);
    }

    void remove() {
        this.roomDesigns.remove(0);
    }

    @Override
    public void design() {
        for (RoomDesign room: this.roomDesigns) {
            room.design();
        }
        System.out.println("Apartment Design");
    }
}
