package th.co.icc.tigerjob.function;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0019J0\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020%2\u0006\u0010!\u001a\u00020\u0019J0\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010\'\u001a\u00020\u0010J(\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0019\u00a8\u0006)"}, d2 = {"Lth/co/icc/tigerjob/function/Function;", "", "()V", "StringToDate", "Ljava/util/Date;", "dataStr", "", "format", "locale", "Ljava/util/Locale;", "getCurrentDate", "getDate", "date", "getFirstDateOfMonth", "getLastDateOfMonth", "isInternetConnected", "", "context", "Landroid/content/Context;", "replaceNull", "data", "replaceStr", "setTimeOut", "Landroid/os/CountDownTimer;", "onTimeOut", "Lth/co/icc/tigerjob/api/CallbackListener;", "countDownTimeOutSecond", "", "showErrorDialog", "", "activity", "title", "content", "callbackListener", "showInputDialog", "Landroid/app/Activity;", "inputType", "", "showSuccessDialog", "autoHide", "showWarningDialog", "app_release"})
public final class Function {
    
    public final boolean isInternetConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void showErrorDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    th.co.icc.tigerjob.api.CallbackListener callbackListener) {
    }
    
    public final void showWarningDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    th.co.icc.tigerjob.api.CallbackListener callbackListener) {
    }
    
    public final void showSuccessDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    th.co.icc.tigerjob.api.CallbackListener callbackListener, boolean autoHide) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.CountDownTimer setTimeOut(@org.jetbrains.annotations.Nullable()
    th.co.icc.tigerjob.api.CallbackListener onTimeOut, long countDownTimeOutSecond) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String replaceNull(@org.jetbrains.annotations.Nullable()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String replaceStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentDate(@org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate(@org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date StringToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dataStr, @org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    public final void showInputDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String content, int inputType, @org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.api.CallbackListener callbackListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getFirstDateOfMonth(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLastDateOfMonth(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    public Function() {
        super();
    }
}