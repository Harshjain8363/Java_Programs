public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        // Test Case 1: Ron
        try {
            System.out.println("Test Case 1:");
            double taxAmount = taxCalculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 2: Tim
        try {
            System.out.println("Test Case 2:");
            double taxAmount = taxCalculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 3: Jack
        try {
            System.out.println("Test Case 3:");
            double taxAmount = taxCalculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 4: No Name
        try {
            System.out.println("Test Case 4:");
            double taxAmount = taxCalculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
