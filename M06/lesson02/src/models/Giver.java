package models;

public class Giver {
    private String name;
    private String partnerName;
    private boolean partnerTaken;

    public Giver() {
        System.out.println( "Giver instance created..!" );
    }

    public String toString() {
        System.out.println( "Name: " + this.name + ", Partner: " + this.partnerName + ", Partner Taken: " + this.partnerTaken );
        return "";
    }

    public String getName() {
        return this.name;
    }
    public void setName( String name ) {
        this.name = name;
    }

    public String getPartnerName() {
        return this.partnerName;
    }
    public void setPartnerName( String partnerName ) {
        this.partnerName = partnerName;
    }

    public boolean getPartnerTaken() {
        return this.partnerTaken;
    }
    public void setPartnerTaken( boolean partnerTaken ) {
        this.partnerTaken = partnerTaken;
    }



}
