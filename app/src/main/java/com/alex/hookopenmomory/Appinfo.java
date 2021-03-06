package com.alex.hookopenmomory;

import android.graphics.drawable.Drawable;

public class Appinfo {
    private String appName;
    private String appPackage;
    private boolean isChecked;
    private Drawable icon;

    public Appinfo(String appName, String appPackage){
        this.appName = appName;
        this.appPackage = appPackage;
    }

    public Appinfo(){}

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}
