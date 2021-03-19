package com.zemosotraining.designprinciples.SOLIDprinciples.OCP.solution;
/*
 * Example for O - Open/Closed principle:
 * Software entities(classes, modules, functions, etc.) should be Open for extension, but closed for modification
 */

import com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution.Mobile;

public class MobileWithTripleSimSlots extends Mobile {
    private long IMEI3; // IMEI Number for SIM slot 3
    private long ternaryNumber;

    public MobileWithTripleSimSlots(long IMEI1, long IMEI2, long primaryMobileNumber, long secondaryMobileNumber, String deviceName, long IMEI3, long ternaryMobileNumber) {
        super(IMEI1, IMEI2, primaryMobileNumber, secondaryMobileNumber, deviceName);
        this.IMEI3 = IMEI3;
        this.ternaryNumber = ternaryMobileNumber;
    }

    public long getIMEI3() {
        return IMEI3;
    }

    public void setIMEI3(long iMEI3) {
        IMEI3 = iMEI3;
    }

    public long getTernaryNumber() {
        return ternaryNumber;
    }

    public void setTernaryNumber(long ternaryNumber) {
        this.ternaryNumber = ternaryNumber;
    }

}