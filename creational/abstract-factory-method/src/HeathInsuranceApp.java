import factory.InsuranceFactory;
import products.HeathInsurance;

public class HeathInsuranceApp {
    private InsuranceFactory factory;
    private HeathInsurance heathInsurance;

    public HeathInsuranceApp() {
    }

    public HeathInsuranceApp(InsuranceFactory ins) {
        this.factory = ins;
    }

    public void createInsurance() {
        if (this.heathInsurance == null) {
            this.heathInsurance = factory.createHeathInsurance();
        }
    }

    public void getInsurancePolicy() {
        this.heathInsurance.getInsurancePolicy();
    }

    public void getPrice() {
        this.heathInsurance.getPrice();
    }
}