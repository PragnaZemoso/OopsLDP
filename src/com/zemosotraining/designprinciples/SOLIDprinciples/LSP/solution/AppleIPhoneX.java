package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.solution;

public class AppleIPhoneX extends SmartPhone{

    @Override
    public void getMobileDescription() {
        System.out.println("Its an AppleIPhoneX & so:");
        super.getMobileDescription();
    }
}
