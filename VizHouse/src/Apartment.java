public class Apartment implements IApartment{

    @Override
    public boolean autoDoor(boolean yes) {
        return false;
    }

    @Override
    public String lockSystem(String type) {
        return null;
    }

    @Override
    public void apartmentDisplay(IDisplay display) {

    }
}
