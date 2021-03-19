package com.zemosotraining.designprinciples.SOLIDprinciples.LSP.solution;

abstract class MobileDevice {
    String application;
    abstract void getMobileDescription();
}

abstract class SmartPhone extends MobileDevice{
    String application;

    public void downloadApplication(String appName) {
        this.application = appName;
        getMobileDescription();
        searchForApplication(application);
        System.out.println("Downloading Application '" + application + "' from " + this.getClass());
    }

    public void searchForApplication(String appName) {
        System.out.println("Searching Application '" + appName + "' from " + this.getClass());
    }

    @Override
    public void getMobileDescription() {
        System.out.println("Mobile Type:--- This is a SmartPhone");
    }
}

abstract class NormalPhone extends MobileDevice{
    @Override
    public void getMobileDescription() {
        System.out.println("Mobile Type:--- This is a very Normal Phone");
    }
}