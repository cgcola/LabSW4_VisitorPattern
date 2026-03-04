# Lab SW4: Visitor Pattern

<p>Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.</p>

<ol>
  <li><strong>Smart: </strong>Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.</li>
  <li><strong>Globe: </strong>Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.</li>
  <li><strong>Ditto: </strong>Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all networks within the country.</li>
</ol>

Testing the codes with the given client program:

```java
public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: "
                + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println(
                "Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println(
                "Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}
```
<hr>

### UML Diagram:
<img width="3452" height="2505" alt="image" src="https://github.com/user-attachments/assets/e59f2b6e-5882-43e9-8318-bce4cfc6f77f" />

