package th.co.icc.tigerjob;

import java.lang.System;

@kotlin.Suppress(names = {"NAME_SHADOWING"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010~\u001a\u00020\u007fH\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010*\u001a\u00020\u0004H\u0002J\u0010\u0010\u0081\u0001\u001a\u00020\u007f2\u0007\u0010\u0082\u0001\u001a\u00020eJ\u0019\u0010\u0083\u0001\u001a\u00020\u007f2\u0006\u0010[\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u0004H\u0002J\t\u0010\u0084\u0001\u001a\u00020\u007fH\u0002J\u0015\u0010\u0085\u0001\u001a\u00020\u007f2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0014J\u0014\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J\u0016\u0010\u008c\u0001\u001a\u00030\u0089\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\t\u0010\u008f\u0001\u001a\u00020\u007fH\u0002J\t\u0010\u0090\u0001\u001a\u00020\u007fH\u0002J\u001d\u0010\u0091\u0001\u001a\u00020\u007f2\u0007\u0010\u0092\u0001\u001a\u00020\n2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010\u0094\u0001\u001a\u00020\u007fH\u0002J\t\u0010\u0095\u0001\u001a\u00020\u007fH\u0002J\t\u0010\u0096\u0001\u001a\u00020\u007fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010$\u001a\n %*\u0004\u0018\u00010!0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u0019\u0010-\u001a\n %*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u000e\u0010/\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u00101\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u000e\u00105\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010?\u001a\n %*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006R\u0011\u0010A\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u001a\u0010C\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<R\u001a\u0010F\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R\u001a\u0010I\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010:\"\u0004\bK\u0010<R\u001a\u0010L\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010:\"\u0004\bN\u0010<R\u001a\u0010O\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010:\"\u0004\bQ\u0010<R\u001a\u0010R\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\u001a\u0010U\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010:\"\u0004\bW\u0010<R\u001a\u0010X\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010:\"\u0004\bZ\u0010<R\u001a\u0010[\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0006\"\u0004\b]\u0010\bR\u001a\u0010^\u001a\u00020_X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010d\u001a\u0004\u0018\u00010eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010j\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0010\"\u0004\bl\u0010\u0012R\u001c\u0010m\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010:\"\u0004\bo\u0010<R\u001c\u0010p\u001a\u0004\u0018\u00010qX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0006\"\u0004\bx\u0010\bR\u001a\u0010y\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010:\"\u0004\b{\u0010<R\u0014\u0010|\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010\u0006\u00a8\u0006\u0097\u0001"}, d2 = {"Lth/co/icc/tigerjob/JobCompleteActivity;", "Lth/co/icc/tigerjob/BaseActivity;", "()V", "NewDate2", "", "getNewDate2", "()Ljava/lang/String;", "setNewDate2", "(Ljava/lang/String;)V", "STATUS_LOADING", "", "getSTATUS_LOADING", "()I", "addRemask", "Landroid/widget/ImageView;", "getAddRemask", "()Landroid/widget/ImageView;", "setAddRemask", "(Landroid/widget/ImageView;)V", "api", "Lth/co/icc/tigerjob/api/modelapi/Customer$DatasBean;", "getApi", "()Lth/co/icc/tigerjob/api/modelapi/Customer$DatasBean;", "setApi", "(Lth/co/icc/tigerjob/api/modelapi/Customer$DatasBean;)V", "box", "callApi", "Lth/co/icc/tigerjob/api/Service;", "getCallApi", "()Lth/co/icc/tigerjob/api/Service;", "setCallApi", "(Lth/co/icc/tigerjob/api/Service;)V", "currentViewDate", "Ljava/util/Date;", "currentViewDateTime", "", "currentdate", "kotlin.jvm.PlatformType", "getCurrentdate", "()Ljava/util/Date;", "setCurrentdate", "(Ljava/util/Date;)V", "cus", "getCus", "setCus", "date", "getDate", "dateFormat", "dateFormatTime", "formatdate", "Ljava/text/SimpleDateFormat;", "getFormatdate", "()Ljava/text/SimpleDateFormat;", "formatter", "formatterTime", "job_qty_text_view", "Landroid/widget/TextView;", "getJob_qty_text_view", "()Landroid/widget/TextView;", "setJob_qty_text_view", "(Landroid/widget/TextView;)V", "latitude", "longitude", "newDate", "getNewDate", "newformatdate", "getNewformatdate", "no1", "getNo1", "setNo1", "no2", "getNo2", "setNo2", "no3", "getNo3", "setNo3", "no4", "getNo4", "setNo4", "no5", "getNo5", "setNo5", "no6", "getNo6", "setNo6", "no7", "getNo7", "setNo7", "no8", "getNo8", "setNo8", "pre", "getPre", "setPre", "save_button", "Landroid/widget/Button;", "getSave_button", "()Landroid/widget/Button;", "setSave_button", "(Landroid/widget/Button;)V", "statusContainer", "Landroid/view/View;", "getStatusContainer", "()Landroid/view/View;", "setStatusContainer", "(Landroid/view/View;)V", "statusIcon", "getStatusIcon", "setStatusIcon", "statusText", "getStatusText", "setStatusText", "step1Item", "Landroid/widget/LinearLayout;", "getStep1Item", "()Landroid/widget/LinearLayout;", "setStep1Item", "(Landroid/widget/LinearLayout;)V", "time", "getTime", "setTime", "titleRemask", "getTitleRemask", "setTitleRemask", "typ", "getTyp", "bindViews", "", "callCustomer", "changeCount", "v", "createRunningJob", "hideStatus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openTaskDescDialog", "setEvent", "showStatus", "status", "text", "updateRemask", "updateUI", "uploadInfoDialog", "app_debug"})
public final class JobCompleteActivity extends th.co.icc.tigerjob.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView job_qty_text_view;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no1;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no2;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no3;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no4;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no5;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no6;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no7;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no8;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView addRemask;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView titleRemask;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button save_button;
    @org.jetbrains.annotations.Nullable()
    private android.widget.LinearLayout step1Item;
    private final int STATUS_LOADING = 1;
    @org.jetbrains.annotations.Nullable()
    private android.view.View statusContainer;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView statusIcon;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView statusText;
    private java.util.Date currentdate;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat formatdate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat newformatdate = null;
    private final java.lang.String date = null;
    private final java.lang.String newDate = null;
    private java.lang.String latitude;
    private java.lang.String longitude;
    private int box;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.api.Service callApi;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String cus;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.api.modelapi.Customer.DatasBean api;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String NewDate2;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String time;
    private java.util.Date currentViewDate;
    private long currentViewDateTime;
    private final java.lang.String dateFormat = "dd/MM/yyyy";
    private final java.text.SimpleDateFormat formatter = null;
    private final java.lang.String dateFormatTime = "HH:mm";
    private final java.text.SimpleDateFormat formatterTime = null;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String pre;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String typ = "CREATE_JOB";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getJob_qty_text_view() {
        return null;
    }
    
    public final void setJob_qty_text_view(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo1() {
        return null;
    }
    
    public final void setNo1(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo2() {
        return null;
    }
    
    public final void setNo2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo3() {
        return null;
    }
    
    public final void setNo3(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo4() {
        return null;
    }
    
    public final void setNo4(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo5() {
        return null;
    }
    
    public final void setNo5(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo6() {
        return null;
    }
    
    public final void setNo6(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo7() {
        return null;
    }
    
    public final void setNo7(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo8() {
        return null;
    }
    
    public final void setNo8(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getAddRemask() {
        return null;
    }
    
    public final void setAddRemask(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitleRemask() {
        return null;
    }
    
    public final void setTitleRemask(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSave_button() {
        return null;
    }
    
    public final void setSave_button(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.LinearLayout getStep1Item() {
        return null;
    }
    
    public final void setStep1Item(@org.jetbrains.annotations.Nullable()
    android.widget.LinearLayout p0) {
    }
    
    public final int getSTATUS_LOADING() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getStatusContainer() {
        return null;
    }
    
    public final void setStatusContainer(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getStatusIcon() {
        return null;
    }
    
    public final void setStatusIcon(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getStatusText() {
        return null;
    }
    
    public final void setStatusText(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    public final java.util.Date getCurrentdate() {
        return null;
    }
    
    public final void setCurrentdate(java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getFormatdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getNewformatdate() {
        return null;
    }
    
    public final java.lang.String getDate() {
        return null;
    }
    
    public final java.lang.String getNewDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.api.Service getCallApi() {
        return null;
    }
    
    public final void setCallApi(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.api.Service p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCus() {
        return null;
    }
    
    public final void setCus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.api.modelapi.Customer.DatasBean getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.api.modelapi.Customer.DatasBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewDate2() {
        return null;
    }
    
    public final void setNewDate2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPre() {
        return null;
    }
    
    public final void setPre(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTyp() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void createRunningJob(java.lang.String pre, java.lang.String typ) {
    }
    
    private final void bindViews() {
    }
    
    private final void setEvent() {
    }
    
    private final void showStatus(int status, java.lang.String text) {
    }
    
    private final void hideStatus() {
    }
    
    private final void updateRemask() {
    }
    
    private final void openTaskDescDialog() {
    }
    
    private final void callCustomer(java.lang.String cus) {
    }
    
    private final void updateUI() {
    }
    
    public final void changeCount(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void uploadInfoDialog() {
    }
    
    public JobCompleteActivity() {
        super();
    }
}