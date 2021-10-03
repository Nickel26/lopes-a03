package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInput() {
        Solution27 app = new Solution27();
        String fName = "j";
        String lName = "doe";
        String zipCode = "321";
        String empID = "ak-0132";

        int fNameFlag, lNameFlag, zipCodeFlag, empIDFlag;

        int expectFirstName = 1;
        int expectLastName = 0;
        int expectZipCode = 1;
        int expectEmpID = 0;

        fNameFlag = app.validateFirstName(fName);
        lNameFlag = app.validateLastName(lName);
        zipCodeFlag = app.validateZipCode(zipCode);
        empIDFlag = app.validateEmployeeID(empID);

        assertEquals(expectFirstName, fNameFlag);
        assertEquals(expectLastName, lNameFlag);
        assertEquals(expectZipCode, zipCodeFlag);
        assertEquals(expectEmpID, empIDFlag);

    }


}