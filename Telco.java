public interface Telco implements TelcoSubscription {
    private int dataAllowance;
    private String telcoName;
    private double promoPrice;
    private boolean unliCallText;

    public TelcoSubscription(int dataAllowance, String telcoName, double promoPrice, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }

    public String getTelcoName(){
        return telcoName;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }

    public void setDataAllowance(int dataAllowance){
        this.dataAllowance = dataAllowance;
    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price){
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer unliPackage, boolean unliCallText){
        return unli.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}