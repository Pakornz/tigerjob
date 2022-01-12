package th.co.icc.tigerjob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010m\u001a\u00020nH\u0002J\b\u0010o\u001a\u000200H\u0002J\b\u0010p\u001a\u00020nH\u0002J\u001a\u0010q\u001a\u0004\u0018\u00010\t2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020hH\u0002J\u0006\u0010u\u001a\u00020nJ\b\u0010v\u001a\u00020nH\u0002J\u0012\u0010w\u001a\u00020n2\b\u0010x\u001a\u0004\u0018\u00010yH\u0014J\u0010\u0010z\u001a\u0002002\u0006\u0010{\u001a\u00020|H\u0016J\u0012\u0010}\u001a\u00020n2\b\u0010~\u001a\u0004\u0018\u00010*H\u0016J\u0014\u0010\u007f\u001a\u0002002\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J2\u0010\u0082\u0001\u001a\u00020n2\u0007\u0010\u0083\u0001\u001a\u00020\u00192\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016\u00a2\u0006\u0003\u0010\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020nH\u0014J\t\u0010\u008a\u0001\u001a\u00020nH\u0002J\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020hH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u0019X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u0010\rR\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020DX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020JX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020PX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\\X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001c\u0010a\u001a\u0004\u0018\u00010bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010g\u001a\u00020hX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l\u00a8\u0006\u008c\u0001"}, d2 = {"Lth/co/icc/tigerjob/SearchMapActivity;", "Lth/co/icc/tigerjob/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "BOUNDS_INDIA", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getBOUNDS_INDIA", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "GPS", "Lcom/google/android/gms/maps/model/LatLng;", "getGPS", "()Lcom/google/android/gms/maps/model/LatLng;", "setGPS", "(Lcom/google/android/gms/maps/model/LatLng;)V", "Lat1", "", "getLat1", "()Ljava/lang/Double;", "setLat1", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "Long1", "getLong1", "setLong1", "REQUEST_CHECK_SETTINGS", "", "REQUEST_LOCATION", "getREQUEST_LOCATION", "()I", "enter_place", "Landroid/widget/EditText;", "getEnter_place", "()Landroid/widget/EditText;", "setEnter_place", "(Landroid/widget/EditText;)V", "enter_place2", "Landroid/widget/ImageView;", "getEnter_place2", "()Landroid/widget/ImageView;", "setEnter_place2", "(Landroid/widget/ImageView;)V", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "getGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setGoogleMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "isAutoCompleteLocation", "", "()Z", "setAutoCompleteLocation", "(Z)V", "latLng", "getLatLng", "setLatLng", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "setLocation", "(Landroid/location/Location;)V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mGeoDataClient", "Lcom/google/android/gms/location/places/GeoDataClient;", "getMGeoDataClient", "()Lcom/google/android/gms/location/places/GeoDataClient;", "setMGeoDataClient", "(Lcom/google/android/gms/location/places/GeoDataClient;)V", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getMLocationCallback", "()Lcom/google/android/gms/location/LocationCallback;", "setMLocationCallback", "(Lcom/google/android/gms/location/LocationCallback;)V", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getMLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "setMLocationRequest", "(Lcom/google/android/gms/location/LocationRequest;)V", "mLocationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "getMLocationSettingsRequest", "()Lcom/google/android/gms/location/LocationSettingsRequest;", "setMLocationSettingsRequest", "(Lcom/google/android/gms/location/LocationSettingsRequest;)V", "mSettingsClient", "Lcom/google/android/gms/location/SettingsClient;", "getMSettingsClient", "()Lcom/google/android/gms/location/SettingsClient;", "setMSettingsClient", "(Lcom/google/android/gms/location/SettingsClient;)V", "marker", "Lcom/google/android/gms/maps/model/Marker;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "total", "", "getTotal", "()Ljava/lang/String;", "setTotal", "(Ljava/lang/String;)V", "assignToMap", "", "checkPermissions", "getLastLocation", "getLocationFromAddress", "context", "Landroid/content/Context;", "strAddress", "hideKeyboard", "initLocation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onMapReady", "p0", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "requestPermissions", "searchMapInMapFromAddress", "app_debug"})
public final class SearchMapActivity extends th.co.icc.tigerjob.BaseActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng latLng;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.LocationRequest mLocationRequest;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.LocationCallback mLocationCallback;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.places.GeoDataClient mGeoDataClient;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.SettingsClient mSettingsClient;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.LocationSettingsRequest mLocationSettingsRequest;
    private final int REQUEST_CHECK_SETTINGS = 1;
    private boolean isAutoCompleteLocation;
    @org.jetbrains.annotations.NotNull()
    public android.location.Location location;
    private final int REQUEST_LOCATION = 1011;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.maps.model.LatLngBounds BOUNDS_INDIA = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker marker;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String total;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Lat1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Long1;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng GPS;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText enter_place;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView enter_place2;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.GoogleMap getGoogleMap() {
        return null;
    }
    
    public final void setGoogleMap(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getLatLng() {
        return null;
    }
    
    public final void setLatLng(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationRequest getMLocationRequest() {
        return null;
    }
    
    public final void setMLocationRequest(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationRequest p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationClient() {
        return null;
    }
    
    public final void setMFusedLocationClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationCallback getMLocationCallback() {
        return null;
    }
    
    public final void setMLocationCallback(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.places.GeoDataClient getMGeoDataClient() {
        return null;
    }
    
    public final void setMGeoDataClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.places.GeoDataClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.SettingsClient getMSettingsClient() {
        return null;
    }
    
    public final void setMSettingsClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.SettingsClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationSettingsRequest getMLocationSettingsRequest() {
        return null;
    }
    
    public final void setMLocationSettingsRequest(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationSettingsRequest p0) {
    }
    
    public final boolean isAutoCompleteLocation() {
        return false;
    }
    
    public final void setAutoCompleteLocation(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location p0) {
    }
    
    public final int getREQUEST_LOCATION() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLngBounds getBOUNDS_INDIA() {
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
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat1() {
        return null;
    }
    
    public final void setLat1(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLong1() {
        return null;
    }
    
    public final void setLong1(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getGPS() {
        return null;
    }
    
    public final void setGPS(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEnter_place() {
        return null;
    }
    
    public final void setEnter_place(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getEnter_place2() {
        return null;
    }
    
    public final void setEnter_place2(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.google.android.gms.maps.model.LatLng searchMapInMapFromAddress(android.content.Context context, java.lang.String strAddress) {
        return null;
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
    
    private final com.google.android.gms.maps.model.LatLng getLocationFromAddress(android.content.Context context, java.lang.String strAddress) {
        return null;
    }
    
    private final void assignToMap() {
    }
    
    private final void getLastLocation() {
    }
    
    private final void initLocation() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    public final void hideKeyboard() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final boolean checkPermissions() {
        return false;
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public SearchMapActivity() {
        super();
    }
}