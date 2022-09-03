package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.CommercialPlan;
import CreationalPatterns.FactoryMethod.DomesticPlan;
import CreationalPatterns.FactoryMethod.InstitutionalPlan;
import CreationalPatterns.FactoryMethod.Plan;

/**
 * Generate object of concrete classes based on given information
 */
public class GetPlanFactory {
    //use getPlan method to get object of type CreationalPatterns.FactoryMethod.Plan
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTIC_PLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIAL_PLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONAL_PLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
