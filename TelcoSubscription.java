public interface TelcoSubscription {
    public string accept(UsagePromo promo, double price);
    public string accept(UnliCallOffer unliPackage, boolean unliCallText);
    public string getTelcoName();
    public double getPromoPrice();
    public boolean getUnliCallText();
}