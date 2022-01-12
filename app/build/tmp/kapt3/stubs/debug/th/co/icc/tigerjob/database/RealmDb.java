package th.co.icc.tigerjob.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001IB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130)2\u0006\u0010*\u001a\u00020+J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170)2\u0006\u0010*\u001a\u00020+J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0013H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0017H\u0002J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+J\u000e\u00106\u001a\u0002032\u0006\u00105\u001a\u00020+J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203J\u000e\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020+J\u000e\u0010;\u001a\u0002032\u0006\u0010:\u001a\u00020+J\u0006\u0010<\u001a\u000203J\u000e\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020\u000fJ\u0006\u0010?\u001a\u000203J\u000e\u0010?\u001a\u0002012\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u0002012\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010C\u001a\u0002012\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010D\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010E\u001a\u0002012\u0006\u0010\n\u001a\u00020\u0013J\u000e\u0010F\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u0017J\u000e\u0010G\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010H\u001a\u0002012\u0006\u0010$\u001a\u00020%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010%8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'\u00a8\u0006J"}, d2 = {"Lth/co/icc/tigerjob/database/RealmDb;", "", "()V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "check", "Lth/co/icc/tigerjob/database/modelrealm/Check;", "getCheck", "()Lth/co/icc/tigerjob/database/modelrealm/Check;", "custo", "Lth/co/icc/tigerjob/database/modelrealm/CreateCustomer;", "getCusto", "()Lth/co/icc/tigerjob/database/modelrealm/CreateCustomer;", "job", "Lth/co/icc/tigerjob/database/modelrealm/CreateJob;", "getJob", "()Lth/co/icc/tigerjob/database/modelrealm/CreateJob;", "listCustomer", "Lth/co/icc/tigerjob/database/modelrealm/Customer;", "getListCustomer", "()Lth/co/icc/tigerjob/database/modelrealm/Customer;", "listJob", "Lth/co/icc/tigerjob/database/modelrealm/Job;", "getListJob", "()Lth/co/icc/tigerjob/database/modelrealm/Job;", "prefix", "Lth/co/icc/tigerjob/database/modelrealm/Prefix;", "getPrefix", "()Lth/co/icc/tigerjob/database/modelrealm/Prefix;", "realmDatabase", "Lio/realm/Realm;", "getRealmDatabase", "()Lio/realm/Realm;", "setRealmDatabase", "(Lio/realm/Realm;)V", "user", "Lth/co/icc/tigerjob/database/modelrealm/User;", "getUser", "()Lth/co/icc/tigerjob/database/modelrealm/User;", "ListCutomer", "Ljava/util/ArrayList;", "showdate", "", "ListJob", "cloneCustomer", "cus", "cloneJob", "close", "", "deleteCheck", "", "deleteCurrentCus", "deleteCurrent", "deleteCurrentJob", "deleteCusto", "deleteJob", "deleteListCustomer", "deleteDay", "deleteListJob", "deletePrefix", "deleteRemarkJob", "jobNo", "deleteUser", "realmTransactionFinished", "Lth/co/icc/tigerjob/database/RealmDb$RealmTransactionFinished;", "insertOrUpdateCheck", "insertOrUpdateCustomer", "insertOrUpdateJob", "insertOrUpdateListCustomer", "insertOrUpdateListJob", "insertOrUpdatePrefix", "insertOrUpdateUser", "RealmTransactionFinished", "app_debug"})
public final class RealmDb {
    @org.jetbrains.annotations.Nullable()
    private io.realm.Realm realmDatabase;
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.Realm getRealmDatabase() {
        return null;
    }
    
    public final void setRealmDatabase(@org.jetbrains.annotations.Nullable()
    io.realm.Realm p0) {
    }
    
    public final void close() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.User getUser() {
        return null;
    }
    
    public final void insertOrUpdateUser(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.User user) {
    }
    
    public final void deleteUser(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.RealmDb.RealmTransactionFinished realmTransactionFinished) {
    }
    
    public final boolean deleteUser() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.Prefix getPrefix() {
        return null;
    }
    
    public final void insertOrUpdatePrefix(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.Prefix prefix) {
    }
    
    public final boolean deletePrefix() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.CreateCustomer getCusto() {
        return null;
    }
    
    public final void insertOrUpdateCustomer(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.CreateCustomer custo) {
    }
    
    public final boolean deleteCusto() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.Customer getListCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<th.co.icc.tigerjob.database.modelrealm.Customer> ListCutomer(@org.jetbrains.annotations.NotNull()
    java.lang.String showdate) {
        return null;
    }
    
    public final boolean deleteCurrentCus(@org.jetbrains.annotations.NotNull()
    java.lang.String deleteCurrent) {
        return false;
    }
    
    private final th.co.icc.tigerjob.database.modelrealm.Customer cloneCustomer(th.co.icc.tigerjob.database.modelrealm.Customer cus) {
        return null;
    }
    
    public final void insertOrUpdateListCustomer(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.Customer custo) {
    }
    
    public final boolean deleteListCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String deleteDay) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.CreateJob getJob() {
        return null;
    }
    
    public final void insertOrUpdateJob(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.CreateJob job) {
    }
    
    public final boolean deleteJob() {
        return false;
    }
    
    public final boolean deleteRemarkJob(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.CreateJob jobNo) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.Job getListJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<th.co.icc.tigerjob.database.modelrealm.Job> ListJob(@org.jetbrains.annotations.NotNull()
    java.lang.String showdate) {
        return null;
    }
    
    private final th.co.icc.tigerjob.database.modelrealm.Job cloneJob(th.co.icc.tigerjob.database.modelrealm.Job job) {
        return null;
    }
    
    public final void insertOrUpdateListJob(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.Job job) {
    }
    
    public final boolean deleteListJob(@org.jetbrains.annotations.NotNull()
    java.lang.String deleteDay) {
        return false;
    }
    
    public final boolean deleteCurrentJob(@org.jetbrains.annotations.NotNull()
    java.lang.String deleteCurrent) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final th.co.icc.tigerjob.database.modelrealm.Check getCheck() {
        return null;
    }
    
    public final void insertOrUpdateCheck(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.database.modelrealm.Check check) {
    }
    
    public final boolean deleteCheck() {
        return false;
    }
    
    public RealmDb() {
        super();
    }
    
    public RealmDb(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lth/co/icc/tigerjob/database/RealmDb$RealmTransactionFinished;", "", "onFinish", "", "result", "Lth/co/icc/tigerjob/api/modelapi/ResultSet;", "app_debug"})
    public static abstract interface RealmTransactionFinished {
        
        public abstract void onFinish(@org.jetbrains.annotations.NotNull()
        th.co.icc.tigerjob.api.modelapi.ResultSet result);
    }
}