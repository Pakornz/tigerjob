package th.co.icc.tigerjob;

import java.lang.System;

@kotlin.Suppress(names = {"RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u00d4\u0001\u00d5\u0001\u00d6\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010\u00b2\u0001\u001a\u00030\u00b3\u0001H\u0002J\u0013\u0010\u00b4\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00af\u0001\u001a\u00020\u0005H\u0002J\u0013\u0010\u00b5\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00af\u0001\u001a\u00020\u0005H\u0002J\u0013\u0010\u00b6\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00af\u0001\u001a\u00020\u0005H\u0002J\u001c\u0010\u00b7\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u00ab\u0001\u001a\u00020\u0005H\u0002J\b\u0010\u00b8\u0001\u001a\u00030\u00b3\u0001J\n\u0010\u00b9\u0001\u001a\u00030\u00b3\u0001H\u0002J(\u0010\u00ba\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00bb\u0001\u001a\u00020 2\u0007\u0010\u00bc\u0001\u001a\u00020 2\n\u0010\u00bd\u0001\u001a\u0005\u0018\u00010\u00be\u0001H\u0014J\u0016\u0010\u00bf\u0001\u001a\u00030\u00b3\u00012\n\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00c1\u0001H\u0014J\u0013\u0010\u00c2\u0001\u001a\u00020>2\b\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001H\u0016J\u0015\u0010\u00c5\u0001\u001a\u00030\u00b3\u00012\t\u0010\u00c6\u0001\u001a\u0004\u0018\u00010EH\u0016J\u0015\u0010\u00c7\u0001\u001a\u00020>2\n\u0010\u00c8\u0001\u001a\u0005\u0018\u00010\u00c9\u0001H\u0016J%\u0010\u00ca\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00cb\u0001\u001a\u00020N2\u0007\u0010\u00cc\u0001\u001a\u00020\u00052\u0007\u0010\u00cd\u0001\u001a\u00020\u0005H\u0002J\n\u0010\u00ce\u0001\u001a\u00030\u00b3\u0001H\u0002J\n\u0010\u00cf\u0001\u001a\u00030\u00b3\u0001H\u0002J\n\u0010\u00d0\u0001\u001a\u00030\u00b3\u0001H\u0002J\n\u0010\u00d1\u0001\u001a\u00030\u00b3\u0001H\u0002J\n\u0010\u00d2\u0001\u001a\u00030\u00b3\u0001H\u0002J\n\u0010\u00d3\u0001\u001a\u00030\u00b3\u0001H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR\u001a\u0010Z\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR\u001a\u0010]\u001a\u00020^X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020^X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010`\"\u0004\be\u0010bR\u001a\u0010f\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010T\"\u0004\bh\u0010VR\u001a\u0010i\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010T\"\u0004\bk\u0010VR\u001a\u0010l\u001a\u00020^X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010`\"\u0004\bn\u0010bR\u001a\u0010o\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010T\"\u0004\bq\u0010VR\u001a\u0010r\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010T\"\u0004\bt\u0010VR\u001a\u0010u\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0007\"\u0004\bw\u0010\tR\u001a\u0010x\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0007\"\u0004\bz\u0010\tR\u001a\u0010{\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0007\"\u0004\b}\u0010\tR\u001b\u0010~\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0007\"\u0005\b\u0080\u0001\u0010\tR\u001d\u0010\u0081\u0001\u001a\u00020 X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\"\"\u0005\b\u0083\u0001\u0010$R$\u0010\u0084\u0001\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u0089\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u0005X\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0007R \u0010\u008c\u0001\u001a\u00030\u008d\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u0098\u0001\u001a\u00030\u0099\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010\u009e\u0001\u001a\u00030\u009f\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a0\u0001\u0010\u00a1\u0001\"\u0006\b\u00a2\u0001\u0010\u00a3\u0001R\u000f\u0010\u00a4\u0001\u001a\u00020>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u00a5\u0001\u001a\u0005\u0018\u00010\u009f\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a6\u0001\u0010\u00a1\u0001\"\u0006\b\u00a7\u0001\u0010\u00a3\u0001R\u001d\u0010\u00a8\u0001\u001a\u00020RX\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010T\"\u0005\b\u00aa\u0001\u0010VR\u0016\u0010\u00ab\u0001\u001a\u00020\u0005X\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010\u0007R\u0016\u0010\u00ad\u0001\u001a\u00020\u0005X\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010\u0007R\u001d\u0010\u00af\u0001\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010\u0007\"\u0005\b\u00b1\u0001\u0010\t\u00a8\u0006\u00d7\u0001"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity;", "Lth/co/icc/tigerjob/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "LL", "", "getLL", "()Ljava/lang/String;", "setLL", "(Ljava/lang/String;)V", "Lat", "", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "Lat1", "getLat1", "()D", "setLat1", "(D)V", "Long", "getLong", "setLong", "Long1", "getLong1", "setLong1", "NewDate", "getNewDate", "setNewDate", "REQUEST_CODE", "", "getREQUEST_CODE", "()I", "setREQUEST_CODE", "(I)V", "aListAdapter", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter;", "getAListAdapter", "()Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter;", "setAListAdapter", "(Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter;)V", "aListAdapter2", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2;", "getAListAdapter2", "()Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2;", "setAListAdapter2", "(Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2;)V", "aListAdapter3", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3;", "getAListAdapter3", "()Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3;", "setAListAdapter3", "(Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3;)V", "callApi", "Lth/co/icc/tigerjob/api/Service;", "getCallApi", "()Lth/co/icc/tigerjob/api/Service;", "setCallApi", "(Lth/co/icc/tigerjob/api/Service;)V", "closeShow", "", "currentViewDate", "Ljava/util/Date;", "dateFormat", "formatter", "Ljava/text/SimpleDateFormat;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "marker", "Lcom/google/android/gms/maps/model/Marker;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "markerPoints", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "getMarkerPoints", "()Ljava/util/ArrayList;", "no1", "Landroid/widget/TextView;", "getNo1", "()Landroid/widget/TextView;", "setNo1", "(Landroid/widget/TextView;)V", "no10", "getNo10", "setNo10", "no11", "getNo11", "setNo11", "no2", "Landroid/widget/EditText;", "getNo2", "()Landroid/widget/EditText;", "setNo2", "(Landroid/widget/EditText;)V", "no3", "getNo3", "setNo3", "no4", "getNo4", "setNo4", "no5", "getNo5", "setNo5", "no6", "getNo6", "setNo6", "no7", "getNo7", "setNo7", "no8", "getNo8", "setNo8", "p1", "getP1", "setP1", "p2", "getP2", "setP2", "p3", "getP3", "setP3", "p4", "getP4", "setP4", "posit", "getPosit", "setPosit", "positoon", "getPositoon", "()Ljava/lang/Integer;", "setPositoon", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pre", "getPre", "save_button", "Landroid/widget/Button;", "getSave_button", "()Landroid/widget/Button;", "setSave_button", "(Landroid/widget/Button;)V", "searchmap", "Landroid/support/v7/widget/CardView;", "getSearchmap", "()Landroid/support/v7/widget/CardView;", "setSearchmap", "(Landroid/support/v7/widget/CardView;)V", "searchmap2", "Landroid/widget/ImageView;", "getSearchmap2", "()Landroid/widget/ImageView;", "setSearchmap2", "(Landroid/widget/ImageView;)V", "searchmapshow", "Landroid/widget/LinearLayout;", "getSearchmapshow", "()Landroid/widget/LinearLayout;", "setSearchmapshow", "(Landroid/widget/LinearLayout;)V", "showButton", "show_map", "getShow_map", "setShow_map", "textmap2", "getTextmap2", "setTextmap2", "typ", "getTyp", "zipcodeBKK", "getZipcodeBKK", "zipid", "getZipid", "setZipid", "bindViews", "", "callListDistrict", "callListSubDistrict", "callListZipcode", "createRunningCustomer", "hideKeyboard", "hideStatus", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onMapReady", "googleMap", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "placeMarker", "location", "title", "detail", "setEvents", "showSelectTypeDialog", "showSelectTypeDialog2", "showSelectTypeDialog3", "showStatus", "uploadInfoDialog", "SelectZipcodeListAdapter", "SelectZipcodeListAdapter2", "SelectZipcodeListAdapter3", "app_release"})
public final class CustomerActivity extends th.co.icc.tigerjob.BaseActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no1;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText no2;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText no3;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no4;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no5;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText no6;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no7;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no8;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no10;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView no11;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button save_button;
    @org.jetbrains.annotations.Nullable()
    private android.widget.LinearLayout show_map;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout searchmapshow;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.CardView searchmap;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView searchmap2;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textmap2;
    private com.google.android.gms.maps.GoogleMap mMap;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> markerPoints = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker marker;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.api.Service callApi;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String LL;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Lat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Long;
    private double Lat1;
    private double Long1;
    private boolean showButton;
    private boolean closeShow;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter aListAdapter;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2 aListAdapter2;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3 aListAdapter3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String zipid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String p1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String p2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String p3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String p4;
    private int REQUEST_CODE;
    private int posit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer positoon;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pre = "TDL";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String typ = "CREATE_CUSTOMER";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String zipcodeBKK = "10";
    @org.jetbrains.annotations.NotNull()
    public java.lang.String NewDate;
    private java.util.Date currentViewDate;
    private final java.lang.String dateFormat = "dd/MM/yyyy";
    private final java.text.SimpleDateFormat formatter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo1() {
        return null;
    }
    
    public final void setNo1(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getNo2() {
        return null;
    }
    
    public final void setNo2(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getNo3() {
        return null;
    }
    
    public final void setNo3(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
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
    public final android.widget.EditText getNo6() {
        return null;
    }
    
    public final void setNo6(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
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
    public final android.widget.TextView getNo10() {
        return null;
    }
    
    public final void setNo10(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNo11() {
        return null;
    }
    
    public final void setNo11(@org.jetbrains.annotations.NotNull()
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
    public final android.widget.LinearLayout getShow_map() {
        return null;
    }
    
    public final void setShow_map(@org.jetbrains.annotations.Nullable()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getSearchmapshow() {
        return null;
    }
    
    public final void setSearchmapshow(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.CardView getSearchmap() {
        return null;
    }
    
    public final void setSearchmap(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getSearchmap2() {
        return null;
    }
    
    public final void setSearchmap2(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextmap2() {
        return null;
    }
    
    public final void setTextmap2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getMarkerPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getMarker() {
        return null;
    }
    
    public final void setMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.api.Service getCallApi() {
        return null;
    }
    
    public final void setCallApi(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.api.Service p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLL() {
        return null;
    }
    
    public final void setLL(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLong() {
        return null;
    }
    
    public final void setLong(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final double getLat1() {
        return 0.0;
    }
    
    public final void setLat1(double p0) {
    }
    
    public final double getLong1() {
        return 0.0;
    }
    
    public final void setLong1(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter getAListAdapter() {
        return null;
    }
    
    public final void setAListAdapter(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2 getAListAdapter2() {
        return null;
    }
    
    public final void setAListAdapter2(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3 getAListAdapter3() {
        return null;
    }
    
    public final void setAListAdapter3(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZipid() {
        return null;
    }
    
    public final void setZipid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getP1() {
        return null;
    }
    
    public final void setP1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getP2() {
        return null;
    }
    
    public final void setP2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getP3() {
        return null;
    }
    
    public final void setP3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getP4() {
        return null;
    }
    
    public final void setP4(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getREQUEST_CODE() {
        return 0;
    }
    
    public final void setREQUEST_CODE(int p0) {
    }
    
    public final int getPosit() {
        return 0;
    }
    
    public final void setPosit(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPositoon() {
        return null;
    }
    
    public final void setPositoon(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTyp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZipcodeBKK() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewDate() {
        return null;
    }
    
    public final void setNewDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void createRunningCustomer(java.lang.String pre, java.lang.String typ) {
    }
    
    private final void bindViews() {
    }
    
    private final void setEvents() {
    }
    
    private final void showStatus() {
    }
    
    private final void hideStatus() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void placeMarker(com.google.android.gms.maps.model.LatLng location, java.lang.String title, java.lang.String detail) {
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
    
    private final void showSelectTypeDialog() {
    }
    
    private final void showSelectTypeDialog2() {
    }
    
    private final void showSelectTypeDialog3() {
    }
    
    private final void callListZipcode(java.lang.String zipid) {
    }
    
    private final void callListDistrict(java.lang.String zipid) {
    }
    
    private final void callListSubDistrict(java.lang.String zipid) {
    }
    
    private final void uploadInfoDialog() {
    }
    
    public final void hideKeyboard() {
    }
    
    public CustomerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter$TypeViewHolder;", "()V", "onVideoClick", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter$OnVideoClick;", "getOnVideoClick", "()Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter$OnVideoClick;", "setOnVideoClick", "(Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter$OnVideoClick;)V", "selectedPosition", "", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "typeList", "", "Lth/co/icc/tigerjob/api/modelapi/ListZipCode$DataBean;", "getTypeList", "()Ljava/util/List;", "setTypeList", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnVideoClick", "TypeViewHolder", "app_release"})
    public static final class SelectZipcodeListAdapter extends android.support.v7.widget.RecyclerView.Adapter<th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter.TypeViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<? extends th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean> typeList;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer selectedPosition;
        @org.jetbrains.annotations.Nullable()
        private th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter.OnVideoClick onVideoClick;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean> getTypeList() {
            return null;
        }
        
        public final void setTypeList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSelectedPosition() {
            return null;
        }
        
        public final void setSelectedPosition(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter.OnVideoClick getOnVideoClick() {
            return null;
        }
        
        public final void setOnVideoClick(@org.jetbrains.annotations.Nullable()
        th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter.OnVideoClick p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter.TypeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter.TypeViewHolder holder, int position) {
        }
        
        public SelectZipcodeListAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter$OnVideoClick;", "", "onClickUser", "", "type", "Lth/co/icc/tigerjob/api/modelapi/ListZipCode$DataBean;", "app_release"})
        public static abstract interface OnVideoClick {
            
            public abstract void onClickUser(@org.jetbrains.annotations.NotNull()
            th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean type);
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter$TypeViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "wSelected", "Landroid/widget/ImageView;", "getWSelected", "()Landroid/widget/ImageView;", "wTypeCard", "Landroid/support/v7/widget/CardView;", "getWTypeCard", "()Landroid/support/v7/widget/CardView;", "wTypeName", "Landroid/widget/TextView;", "getWTypeName", "()Landroid/widget/TextView;", "wTypePrefix", "getWTypePrefix", "app_release"})
        public static final class TypeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypePrefix = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypeName = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.ImageView wSelected = null;
            @org.jetbrains.annotations.NotNull()
            private final android.support.v7.widget.CardView wTypeCard = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypePrefix() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypeName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getWSelected() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.support.v7.widget.CardView getWTypeCard() {
                return null;
            }
            
            public TypeViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002./B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020\u0013H\u0016J\u0018\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00060"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2$TypeViewHolder;", "()V", "ck", "Lth/co/icc/tigerjob/database/modelrealm/Check;", "getCk", "()Lth/co/icc/tigerjob/database/modelrealm/Check;", "onVideoClick", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2$OnVideoClick;", "getOnVideoClick", "()Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2$OnVideoClick;", "setOnVideoClick", "(Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2$OnVideoClick;)V", "realmDatabase", "Lth/co/icc/tigerjob/database/RealmDb;", "getRealmDatabase", "()Lth/co/icc/tigerjob/database/RealmDb;", "selectedPosition", "", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "typeList", "Ljava/util/ArrayList;", "Lth/co/icc/tigerjob/api/modelapi/ListZipCode$DataBean$DistrictsBean;", "Lkotlin/collections/ArrayList;", "getTypeList", "()Ljava/util/ArrayList;", "setTypeList", "(Ljava/util/ArrayList;)V", "zipcodeBKK", "", "getZipcodeBKK", "()Ljava/lang/String;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnVideoClick", "TypeViewHolder", "app_release"})
    public static final class SelectZipcodeListAdapter2 extends android.support.v7.widget.RecyclerView.Adapter<th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2.TypeViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean> typeList;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer selectedPosition;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String zipcodeBKK = "10";
        @org.jetbrains.annotations.NotNull()
        private final th.co.icc.tigerjob.database.RealmDb realmDatabase = null;
        @org.jetbrains.annotations.NotNull()
        private final th.co.icc.tigerjob.database.modelrealm.Check ck = null;
        @org.jetbrains.annotations.Nullable()
        private th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2.OnVideoClick onVideoClick;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean> getTypeList() {
            return null;
        }
        
        public final void setTypeList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSelectedPosition() {
            return null;
        }
        
        public final void setSelectedPosition(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getZipcodeBKK() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final th.co.icc.tigerjob.database.RealmDb getRealmDatabase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final th.co.icc.tigerjob.database.modelrealm.Check getCk() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2.OnVideoClick getOnVideoClick() {
            return null;
        }
        
        public final void setOnVideoClick(@org.jetbrains.annotations.Nullable()
        th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2.OnVideoClick p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2.TypeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter2.TypeViewHolder holder, int position) {
        }
        
        public SelectZipcodeListAdapter2() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2$OnVideoClick;", "", "onClickUser", "", "type", "Lth/co/icc/tigerjob/api/modelapi/ListZipCode$DataBean$DistrictsBean;", "pos", "", "app_release"})
        public static abstract interface OnVideoClick {
            
            public abstract void onClickUser(@org.jetbrains.annotations.NotNull()
            th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean type, int pos);
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter2$TypeViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "wSelected", "Landroid/widget/ImageView;", "getWSelected", "()Landroid/widget/ImageView;", "wTypeCard", "Landroid/support/v7/widget/CardView;", "getWTypeCard", "()Landroid/support/v7/widget/CardView;", "wTypeName", "Landroid/widget/TextView;", "getWTypeName", "()Landroid/widget/TextView;", "wTypePrefix", "getWTypePrefix", "app_release"})
        public static final class TypeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypePrefix = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypeName = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.ImageView wSelected = null;
            @org.jetbrains.annotations.NotNull()
            private final android.support.v7.widget.CardView wTypeCard = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypePrefix() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypeName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getWSelected() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.support.v7.widget.CardView getWTypeCard() {
                return null;
            }
            
            public TypeViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002./B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020\u0013H\u0016J\u0018\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00060"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3$TypeViewHolder;", "()V", "ck", "Lth/co/icc/tigerjob/database/modelrealm/Check;", "getCk", "()Lth/co/icc/tigerjob/database/modelrealm/Check;", "onVideoClick", "Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3$OnVideoClick;", "getOnVideoClick", "()Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3$OnVideoClick;", "setOnVideoClick", "(Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3$OnVideoClick;)V", "realmDatabase", "Lth/co/icc/tigerjob/database/RealmDb;", "getRealmDatabase", "()Lth/co/icc/tigerjob/database/RealmDb;", "selectedPosition", "", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "typeList", "Ljava/util/ArrayList;", "Lth/co/icc/tigerjob/api/modelapi/ListZipCode$DataBean$DistrictsBean$SubdistrictsBean;", "Lkotlin/collections/ArrayList;", "getTypeList", "()Ljava/util/ArrayList;", "setTypeList", "(Ljava/util/ArrayList;)V", "zipcodeBKK", "", "getZipcodeBKK", "()Ljava/lang/String;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnVideoClick", "TypeViewHolder", "app_release"})
    public static final class SelectZipcodeListAdapter3 extends android.support.v7.widget.RecyclerView.Adapter<th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3.TypeViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean.SubdistrictsBean> typeList;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer selectedPosition;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String zipcodeBKK = "10";
        @org.jetbrains.annotations.NotNull()
        private final th.co.icc.tigerjob.database.RealmDb realmDatabase = null;
        @org.jetbrains.annotations.NotNull()
        private final th.co.icc.tigerjob.database.modelrealm.Check ck = null;
        @org.jetbrains.annotations.Nullable()
        private th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3.OnVideoClick onVideoClick;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean.SubdistrictsBean> getTypeList() {
            return null;
        }
        
        public final void setTypeList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean.SubdistrictsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSelectedPosition() {
            return null;
        }
        
        public final void setSelectedPosition(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getZipcodeBKK() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final th.co.icc.tigerjob.database.RealmDb getRealmDatabase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final th.co.icc.tigerjob.database.modelrealm.Check getCk() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3.OnVideoClick getOnVideoClick() {
            return null;
        }
        
        public final void setOnVideoClick(@org.jetbrains.annotations.Nullable()
        th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3.OnVideoClick p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3.TypeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        th.co.icc.tigerjob.CustomerActivity.SelectZipcodeListAdapter3.TypeViewHolder holder, int position) {
        }
        
        public SelectZipcodeListAdapter3() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3$OnVideoClick;", "", "onClickUser", "", "type", "Lth/co/icc/tigerjob/api/modelapi/ListZipCode$DataBean$DistrictsBean$SubdistrictsBean;", "app_release"})
        public static abstract interface OnVideoClick {
            
            public abstract void onClickUser(@org.jetbrains.annotations.NotNull()
            th.co.icc.tigerjob.api.modelapi.ListZipCode.DataBean.DistrictsBean.SubdistrictsBean type);
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lth/co/icc/tigerjob/CustomerActivity$SelectZipcodeListAdapter3$TypeViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "wSelected", "Landroid/widget/ImageView;", "getWSelected", "()Landroid/widget/ImageView;", "wTypeCard", "Landroid/support/v7/widget/CardView;", "getWTypeCard", "()Landroid/support/v7/widget/CardView;", "wTypeName", "Landroid/widget/TextView;", "getWTypeName", "()Landroid/widget/TextView;", "wTypePrefix", "getWTypePrefix", "app_release"})
        public static final class TypeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypePrefix = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypeName = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.ImageView wSelected = null;
            @org.jetbrains.annotations.NotNull()
            private final android.support.v7.widget.CardView wTypeCard = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypePrefix() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypeName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getWSelected() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.support.v7.widget.CardView getWTypeCard() {
                return null;
            }
            
            public TypeViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
                super(null);
            }
        }
    }
}