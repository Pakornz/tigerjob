package th.co.icc.tigerjob;

import java.lang.System;

@android.annotation.SuppressLint(value = {"Registered"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0018H\u0004J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0018H\u0004J\b\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0004J\b\u0010)\u001a\u00020\u001aH\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0018J\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0018J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00061"}, d2 = {"Lth/co/icc/tigerjob/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "fonts", "Lth/co/icc/tigerjob/font/Fonts;", "getFonts", "()Lth/co/icc/tigerjob/font/Fonts;", "setFonts", "(Lth/co/icc/tigerjob/font/Fonts;)V", "function", "Lth/co/icc/tigerjob/function/Function;", "getFunction", "()Lth/co/icc/tigerjob/function/Function;", "setFunction", "(Lth/co/icc/tigerjob/function/Function;)V", "locationChangeListener", "Lth/co/icc/tigerjob/BaseActivity$LocationChangeListener;", "realmDatabase", "Lth/co/icc/tigerjob/database/RealmDb;", "getRealmDatabase", "()Lth/co/icc/tigerjob/database/RealmDb;", "setRealmDatabase", "(Lth/co/icc/tigerjob/database/RealmDb;)V", "AppVersion", "", "finish", "", "initRealmDatabase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "overridePendingTransitionEnter", "overridePendingTransitionExit", "setActionBarSubtitle", "title", "setActionBarTitle", "setActionbar", "setContentView", "layoutResID", "", "setLocationChangeListener", "setViewsFont", "showToastLong", "msg", "showToastShort", "startActivity", "intent", "Landroid/content/Intent;", "LocationChangeListener", "app_debug"})
public class BaseActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.function.Function function;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.font.Fonts fonts;
    @org.jetbrains.annotations.Nullable()
    private th.co.icc.tigerjob.database.RealmDb realmDatabase;
    private th.co.icc.tigerjob.BaseActivity.LocationChangeListener locationChangeListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.function.Function getFunction() {
        return null;
    }
    
    public final void setFunction(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.function.Function p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.font.Fonts getFonts() {
        return null;
    }
    
    public final void setFonts(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.font.Fonts p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.RealmDb getRealmDatabase() {
        return null;
    }
    
    public final void setRealmDatabase(@org.jetbrains.annotations.Nullable()
    th.co.icc.tigerjob.database.RealmDb p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initRealmDatabase() {
    }
    
    @java.lang.Override()
    public void setContentView(int layoutResID) {
    }
    
    protected final void setLocationChangeListener(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.BaseActivity.LocationChangeListener locationChangeListener) {
    }
    
    private final void setViewsFont() {
    }
    
    private final void setActionbar() {
    }
    
    protected final void setActionBarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    protected final void setActionBarSubtitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void startActivity(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    private final void overridePendingTransitionEnter() {
    }
    
    private final void overridePendingTransitionExit() {
    }
    
    public final void showToastShort(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void showToastLong(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String AppVersion() {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lth/co/icc/tigerjob/BaseActivity$LocationChangeListener;", "", "onLocationChange", "", "location", "Landroid/location/Location;", "app_debug"})
    public static abstract interface LocationChangeListener {
        
        public abstract void onLocationChange(@org.jetbrains.annotations.Nullable()
        android.location.Location location);
    }
}