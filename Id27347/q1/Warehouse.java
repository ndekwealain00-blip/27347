package Id27347.q1;

import java.time.LocalDate;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }


    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new IllegalArgumentException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
