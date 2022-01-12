package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class th_co_icc_tigerjob_database_modelrealm_JobRealmProxy extends th.co.icc.tigerjob.database.modelrealm.Job
    implements RealmObjectProxy, th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface {

    static final class JobColumnInfo extends ColumnInfo {
        long jobNoIndex;
        long customerCodeIndex;
        long currentDateIndex;
        long boxIndex;
        long zipcodeIndex;
        long telIndex;
        long contactIndex;
        long remarkIndex;
        long dateIndex;
        long currenttimeIndex;

        JobColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Job");
            this.jobNoIndex = addColumnDetails("jobNo", "jobNo", objectSchemaInfo);
            this.customerCodeIndex = addColumnDetails("customerCode", "customerCode", objectSchemaInfo);
            this.currentDateIndex = addColumnDetails("currentDate", "currentDate", objectSchemaInfo);
            this.boxIndex = addColumnDetails("box", "box", objectSchemaInfo);
            this.zipcodeIndex = addColumnDetails("zipcode", "zipcode", objectSchemaInfo);
            this.telIndex = addColumnDetails("tel", "tel", objectSchemaInfo);
            this.contactIndex = addColumnDetails("contact", "contact", objectSchemaInfo);
            this.remarkIndex = addColumnDetails("remark", "remark", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.currenttimeIndex = addColumnDetails("currenttime", "currenttime", objectSchemaInfo);
        }

        JobColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new JobColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final JobColumnInfo src = (JobColumnInfo) rawSrc;
            final JobColumnInfo dst = (JobColumnInfo) rawDst;
            dst.jobNoIndex = src.jobNoIndex;
            dst.customerCodeIndex = src.customerCodeIndex;
            dst.currentDateIndex = src.currentDateIndex;
            dst.boxIndex = src.boxIndex;
            dst.zipcodeIndex = src.zipcodeIndex;
            dst.telIndex = src.telIndex;
            dst.contactIndex = src.contactIndex;
            dst.remarkIndex = src.remarkIndex;
            dst.dateIndex = src.dateIndex;
            dst.currenttimeIndex = src.currenttimeIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private JobColumnInfo columnInfo;
    private ProxyState<th.co.icc.tigerjob.database.modelrealm.Job> proxyState;

    th_co_icc_tigerjob_database_modelrealm_JobRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (JobColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<th.co.icc.tigerjob.database.modelrealm.Job>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jobNo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jobNoIndex);
    }

    @Override
    public void realmSet$jobNo(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'jobNo' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$customerCode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.customerCodeIndex);
    }

    @Override
    public void realmSet$customerCode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.customerCodeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.customerCodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.customerCodeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.customerCodeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currentDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currentDateIndex);
    }

    @Override
    public void realmSet$currentDate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.currentDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.currentDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.currentDateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.currentDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$box() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.boxIndex);
    }

    @Override
    public void realmSet$box(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.boxIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.boxIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.boxIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.boxIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$zipcode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.zipcodeIndex);
    }

    @Override
    public void realmSet$zipcode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.zipcodeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.zipcodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.zipcodeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.zipcodeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tel() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.telIndex);
    }

    @Override
    public void realmSet$tel(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.telIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.telIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.telIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.telIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$contact() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contactIndex);
    }

    @Override
    public void realmSet$contact(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contactIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.contactIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contactIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contactIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$remark() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.remarkIndex);
    }

    @Override
    public void realmSet$remark(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.remarkIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.remarkIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.remarkIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.remarkIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currenttime() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currenttimeIndex);
    }

    @Override
    public void realmSet$currenttime(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.currenttimeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.currenttimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.currenttimeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.currenttimeIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Job", 10, 0);
        builder.addPersistedProperty("jobNo", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("customerCode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("currentDate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("box", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("zipcode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("contact", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("remark", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("currenttime", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static JobColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new JobColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Job";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Job";
    }

    @SuppressWarnings("cast")
    public static th.co.icc.tigerjob.database.modelrealm.Job createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        th.co.icc.tigerjob.database.modelrealm.Job obj = null;
        if (update) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Job.class);
            JobColumnInfo columnInfo = (JobColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class);
            long pkColumnIndex = columnInfo.jobNoIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("jobNo")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("jobNo"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class), false, Collections.<String> emptyList());
                    obj = new io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("jobNo")) {
                if (json.isNull("jobNo")) {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Job.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Job.class, json.getString("jobNo"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'jobNo'.");
            }
        }

        final th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) obj;
        if (json.has("customerCode")) {
            if (json.isNull("customerCode")) {
                objProxy.realmSet$customerCode(null);
            } else {
                objProxy.realmSet$customerCode((String) json.getString("customerCode"));
            }
        }
        if (json.has("currentDate")) {
            if (json.isNull("currentDate")) {
                objProxy.realmSet$currentDate(null);
            } else {
                objProxy.realmSet$currentDate((String) json.getString("currentDate"));
            }
        }
        if (json.has("box")) {
            if (json.isNull("box")) {
                objProxy.realmSet$box(null);
            } else {
                objProxy.realmSet$box((String) json.getString("box"));
            }
        }
        if (json.has("zipcode")) {
            if (json.isNull("zipcode")) {
                objProxy.realmSet$zipcode(null);
            } else {
                objProxy.realmSet$zipcode((String) json.getString("zipcode"));
            }
        }
        if (json.has("tel")) {
            if (json.isNull("tel")) {
                objProxy.realmSet$tel(null);
            } else {
                objProxy.realmSet$tel((String) json.getString("tel"));
            }
        }
        if (json.has("contact")) {
            if (json.isNull("contact")) {
                objProxy.realmSet$contact(null);
            } else {
                objProxy.realmSet$contact((String) json.getString("contact"));
            }
        }
        if (json.has("remark")) {
            if (json.isNull("remark")) {
                objProxy.realmSet$remark(null);
            } else {
                objProxy.realmSet$remark((String) json.getString("remark"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                objProxy.realmSet$date((String) json.getString("date"));
            }
        }
        if (json.has("currenttime")) {
            if (json.isNull("currenttime")) {
                objProxy.realmSet$currenttime(null);
            } else {
                objProxy.realmSet$currenttime((String) json.getString("currenttime"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static th.co.icc.tigerjob.database.modelrealm.Job createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final th.co.icc.tigerjob.database.modelrealm.Job obj = new th.co.icc.tigerjob.database.modelrealm.Job();
        final th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("jobNo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jobNo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jobNo(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("customerCode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$customerCode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$customerCode(null);
                }
            } else if (name.equals("currentDate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currentDate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currentDate(null);
                }
            } else if (name.equals("box")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$box((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$box(null);
                }
            } else if (name.equals("zipcode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$zipcode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$zipcode(null);
                }
            } else if (name.equals("tel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tel((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tel(null);
                }
            } else if (name.equals("contact")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contact((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$contact(null);
                }
            } else if (name.equals("remark")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$remark((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$remark(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                }
            } else if (name.equals("currenttime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currenttime((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currenttime(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'jobNo'.");
        }
        return realm.copyToRealm(obj);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Job copyOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Job object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (th.co.icc.tigerjob.database.modelrealm.Job) cachedRealmObject;
        }

        th.co.icc.tigerjob.database.modelrealm.Job realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Job.class);
            JobColumnInfo columnInfo = (JobColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class);
            long pkColumnIndex = columnInfo.jobNoIndex;
            String value = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$jobNo();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Job copy(Realm realm, th.co.icc.tigerjob.database.modelrealm.Job newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (th.co.icc.tigerjob.database.modelrealm.Job) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        th.co.icc.tigerjob.database.modelrealm.Job realmObject = realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Job.class, ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) newObject).realmGet$jobNo(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) newObject;
        th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface realmObjectCopy = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$customerCode(realmObjectSource.realmGet$customerCode());
        realmObjectCopy.realmSet$currentDate(realmObjectSource.realmGet$currentDate());
        realmObjectCopy.realmSet$box(realmObjectSource.realmGet$box());
        realmObjectCopy.realmSet$zipcode(realmObjectSource.realmGet$zipcode());
        realmObjectCopy.realmSet$tel(realmObjectSource.realmGet$tel());
        realmObjectCopy.realmSet$contact(realmObjectSource.realmGet$contact());
        realmObjectCopy.realmSet$remark(realmObjectSource.realmGet$remark());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$currenttime(realmObjectSource.realmGet$currenttime());
        return realmObject;
    }

    public static long insert(Realm realm, th.co.icc.tigerjob.database.modelrealm.Job object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long tableNativePtr = table.getNativePtr();
        JobColumnInfo columnInfo = (JobColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long pkColumnIndex = columnInfo.jobNoIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$jobNo();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$customerCode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$customerCode();
        if (realmGet$customerCode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customerCodeIndex, rowIndex, realmGet$customerCode, false);
        }
        String realmGet$currentDate = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currentDate();
        if (realmGet$currentDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentDateIndex, rowIndex, realmGet$currentDate, false);
        }
        String realmGet$box = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$box();
        if (realmGet$box != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.boxIndex, rowIndex, realmGet$box, false);
        }
        String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$zipcode();
        if (realmGet$zipcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
        }
        String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$tel();
        if (realmGet$tel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
        }
        String realmGet$contact = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$contact();
        if (realmGet$contact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contactIndex, rowIndex, realmGet$contact, false);
        }
        String realmGet$remark = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$remark();
        if (realmGet$remark != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remarkIndex, rowIndex, realmGet$remark, false);
        }
        String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
        }
        String realmGet$currenttime = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currenttime();
        if (realmGet$currenttime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currenttimeIndex, rowIndex, realmGet$currenttime, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long tableNativePtr = table.getNativePtr();
        JobColumnInfo columnInfo = (JobColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long pkColumnIndex = columnInfo.jobNoIndex;
        th.co.icc.tigerjob.database.modelrealm.Job object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Job) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$jobNo();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$customerCode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$customerCode();
            if (realmGet$customerCode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customerCodeIndex, rowIndex, realmGet$customerCode, false);
            }
            String realmGet$currentDate = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currentDate();
            if (realmGet$currentDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentDateIndex, rowIndex, realmGet$currentDate, false);
            }
            String realmGet$box = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$box();
            if (realmGet$box != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.boxIndex, rowIndex, realmGet$box, false);
            }
            String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$zipcode();
            if (realmGet$zipcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
            }
            String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$tel();
            if (realmGet$tel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
            }
            String realmGet$contact = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$contact();
            if (realmGet$contact != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contactIndex, rowIndex, realmGet$contact, false);
            }
            String realmGet$remark = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$remark();
            if (realmGet$remark != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remarkIndex, rowIndex, realmGet$remark, false);
            }
            String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
            }
            String realmGet$currenttime = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currenttime();
            if (realmGet$currenttime != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currenttimeIndex, rowIndex, realmGet$currenttime, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Job object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long tableNativePtr = table.getNativePtr();
        JobColumnInfo columnInfo = (JobColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long pkColumnIndex = columnInfo.jobNoIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$jobNo();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$customerCode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$customerCode();
        if (realmGet$customerCode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customerCodeIndex, rowIndex, realmGet$customerCode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.customerCodeIndex, rowIndex, false);
        }
        String realmGet$currentDate = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currentDate();
        if (realmGet$currentDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentDateIndex, rowIndex, realmGet$currentDate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currentDateIndex, rowIndex, false);
        }
        String realmGet$box = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$box();
        if (realmGet$box != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.boxIndex, rowIndex, realmGet$box, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.boxIndex, rowIndex, false);
        }
        String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$zipcode();
        if (realmGet$zipcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, false);
        }
        String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$tel();
        if (realmGet$tel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.telIndex, rowIndex, false);
        }
        String realmGet$contact = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$contact();
        if (realmGet$contact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contactIndex, rowIndex, realmGet$contact, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contactIndex, rowIndex, false);
        }
        String realmGet$remark = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$remark();
        if (realmGet$remark != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remarkIndex, rowIndex, realmGet$remark, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.remarkIndex, rowIndex, false);
        }
        String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        String realmGet$currenttime = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currenttime();
        if (realmGet$currenttime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currenttimeIndex, rowIndex, realmGet$currenttime, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currenttimeIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long tableNativePtr = table.getNativePtr();
        JobColumnInfo columnInfo = (JobColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Job.class);
        long pkColumnIndex = columnInfo.jobNoIndex;
        th.co.icc.tigerjob.database.modelrealm.Job object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Job) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$jobNo();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$customerCode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$customerCode();
            if (realmGet$customerCode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customerCodeIndex, rowIndex, realmGet$customerCode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.customerCodeIndex, rowIndex, false);
            }
            String realmGet$currentDate = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currentDate();
            if (realmGet$currentDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentDateIndex, rowIndex, realmGet$currentDate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currentDateIndex, rowIndex, false);
            }
            String realmGet$box = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$box();
            if (realmGet$box != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.boxIndex, rowIndex, realmGet$box, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.boxIndex, rowIndex, false);
            }
            String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$zipcode();
            if (realmGet$zipcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, false);
            }
            String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$tel();
            if (realmGet$tel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.telIndex, rowIndex, false);
            }
            String realmGet$contact = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$contact();
            if (realmGet$contact != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contactIndex, rowIndex, realmGet$contact, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contactIndex, rowIndex, false);
            }
            String realmGet$remark = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$remark();
            if (realmGet$remark != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remarkIndex, rowIndex, realmGet$remark, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.remarkIndex, rowIndex, false);
            }
            String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
            String realmGet$currenttime = ((th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) object).realmGet$currenttime();
            if (realmGet$currenttime != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currenttimeIndex, rowIndex, realmGet$currenttime, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currenttimeIndex, rowIndex, false);
            }
        }
    }

    public static th.co.icc.tigerjob.database.modelrealm.Job createDetachedCopy(th.co.icc.tigerjob.database.modelrealm.Job realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        th.co.icc.tigerjob.database.modelrealm.Job unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new th.co.icc.tigerjob.database.modelrealm.Job();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (th.co.icc.tigerjob.database.modelrealm.Job) cachedObject.object;
            }
            unmanagedObject = (th.co.icc.tigerjob.database.modelrealm.Job) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface unmanagedCopy = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) unmanagedObject;
        th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface realmSource = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$jobNo(realmSource.realmGet$jobNo());
        unmanagedCopy.realmSet$customerCode(realmSource.realmGet$customerCode());
        unmanagedCopy.realmSet$currentDate(realmSource.realmGet$currentDate());
        unmanagedCopy.realmSet$box(realmSource.realmGet$box());
        unmanagedCopy.realmSet$zipcode(realmSource.realmGet$zipcode());
        unmanagedCopy.realmSet$tel(realmSource.realmGet$tel());
        unmanagedCopy.realmSet$contact(realmSource.realmGet$contact());
        unmanagedCopy.realmSet$remark(realmSource.realmGet$remark());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$currenttime(realmSource.realmGet$currenttime());

        return unmanagedObject;
    }

    static th.co.icc.tigerjob.database.modelrealm.Job update(Realm realm, th.co.icc.tigerjob.database.modelrealm.Job realmObject, th.co.icc.tigerjob.database.modelrealm.Job newObject, Map<RealmModel, RealmObjectProxy> cache) {
        th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface realmObjectTarget = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) realmObject;
        th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$customerCode(realmObjectSource.realmGet$customerCode());
        realmObjectTarget.realmSet$currentDate(realmObjectSource.realmGet$currentDate());
        realmObjectTarget.realmSet$box(realmObjectSource.realmGet$box());
        realmObjectTarget.realmSet$zipcode(realmObjectSource.realmGet$zipcode());
        realmObjectTarget.realmSet$tel(realmObjectSource.realmGet$tel());
        realmObjectTarget.realmSet$contact(realmObjectSource.realmGet$contact());
        realmObjectTarget.realmSet$remark(realmObjectSource.realmGet$remark());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectTarget.realmSet$currenttime(realmObjectSource.realmGet$currenttime());
        return realmObject;
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        th_co_icc_tigerjob_database_modelrealm_JobRealmProxy aJob = (th_co_icc_tigerjob_database_modelrealm_JobRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aJob.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aJob.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aJob.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
