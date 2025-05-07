import factory.BasicInsuraceFactory;
import factory.InsuranceFactory;
import factory.PremiumInsuranceFactory;
import factory.StandardInsuranceFactory;
import products.CarInsurance;
import products.HeathInsurance;
import products.LifeInsurance;

public class Main {

    public static void insuranceDetail(InsuranceFactory ins) {
        HeathInsurance heathInsurance = ins.createHeathInsurance();
        LifeInsurance lifeInsurance = ins.createLifeInsurance();
        CarInsurance carInsurance = ins.createCarInsurance();

        heathInsurance.getInsurancePolicy();
        heathInsurance.getPrice();

        lifeInsurance.getInsurancePolicy();
        lifeInsurance.getPrice();

        carInsurance.getInsurancePolicy();
        carInsurance.getPrice();

        System.out.println("");

    }

    public static void main(String[] args) {
        System.out.println("Abstract Insurance Factory");
        System.out.println("✅ Premium Heath Insurance Factory");
        InsuranceFactory ins = new PremiumInsuranceFactory();

        HeathInsuranceApp heathApp = new HeathInsuranceApp(ins);
        heathApp.createInsurance();
        heathApp.getInsurancePolicy();
        heathApp.getPrice();
        System.out.println("");



        BasicInsuraceFactory basic = new BasicInsuraceFactory();
        System.out.println("Basic Insurance Detail");
        insuranceDetail(basic);

        StandardInsuranceFactory standard = new StandardInsuranceFactory();
        System.out.println("Standard Insurance Detail");
        insuranceDetail(standard);

        PremiumInsuranceFactory premium = new PremiumInsuranceFactory();
        System.out.println("💎Premium Insurance Detail");
        insuranceDetail(premium);


    }
}