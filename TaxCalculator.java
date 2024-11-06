// Custom exception for country validation
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

// Custom exception for employee name validation
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

// Custom exception for tax eligibility
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

public class TaxCalculator {
    // Method to calculate tax
    public double calculateTax(String empName, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }
        
        if (empSal > 100000) {
            return empSal * 8 / 100;  // Tax 8% for salary > 1 lakh
        } else if (empSal >= 50000 && empSal <= 100000) {
            return empSal * 6 / 100;  // Tax 6% for salary between 50K and 1 lakh
        } else if (empSal >= 30000 && empSal < 50000) {
            return empSal * 5 / 100;  // Tax 5% for salary between 30K and 50K
        } else if (empSal >= 10000 && empSal < 30000) {
            return empSal * 4 / 100;  // Tax 4% for salary between 10K and 30K
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }
}
