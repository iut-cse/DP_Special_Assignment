import java.util.ArrayList;

public class BuildingDesign implements IDesign{

    ArrayList<ApartmentDesign> apartmentDesigns;

    public BuildingDesign(ArrayList<ApartmentDesign> apartmentDesigns) {
        this.apartmentDesigns = apartmentDesigns;
    }

    void add(ApartmentDesign apartmentDesign) {
        this.apartmentDesigns.add(apartmentDesign);
    }

    void remove() {
        this.apartmentDesigns.remove(0);
    }

    @Override
    public void design() {
        for (ApartmentDesign apartment: this.apartmentDesigns) {
            apartment.design();
        }
        System.out.println("Building Design");
    }
}
