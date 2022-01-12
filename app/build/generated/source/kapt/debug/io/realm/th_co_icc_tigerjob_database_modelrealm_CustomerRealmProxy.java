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
public class th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy extends th.co.icc.tigerjob.database.modelrealm.Customer
    implements RealmObjectProxy, th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface {

    static final class CustomerColumnInfo extends ColumnInfo {
        long customerCodeIndex;
        long customerNameIndex;
        long addressIndex;
        long subdistrictIndex;
        long districtIndex;
        long provinceIndex;
        long zipcodeIndex;
        long telIndex;
        long latIndex;
        long lngIndex;
        long dateIndex;

        CustomerColumnInfo(OsSchemaInfo schemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Customer");
            this.customerCodeIndex = addColumnDetails("customerCode", "customerCode", objectSchemaInfo);
            this.customerNameIndex = addColumnDetails("customerName", "customerName", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", "address", objectSchemaInfo);
            this.subdistrictIndex = addColumnDetails("subdistrict", "subdistrict", objectSchemaInfo);
            this.districtIndex = addColumnDetails("district", "district", objectSchemaInfo);
            this.provinceIndex = addColumnDetails("province", "province", objectSchemaInfo);
            this.zipcodeIndex = addColumnDetails("zipcode", "zipcode", objectSchemaInfo);
            this.telIndex = addColumnDetails("tel", "tel", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lngIndex = addColumnDetails("lng", "lng", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
        }

        CustomerColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CustomerColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CustomerColumnInfo src = (CustomerColumnInfo) rawSrc;
            final CustomerColumnInfo dst = (CustomerColumnInfo) rawDst;
            dst.customerCodeIndex = src.customerCodeIndex;
            dst.customerNameIndex = src.customerNameIndex;
            dst.addressIndex = src.addressIndex;
            dst.subdistrictIndex = src.subdistrictIndex;
            dst.districtIndex = src.districtIndex;
            dst.provinceIndex = src.provinceIndex;
            dst.zipcodeIndex = src.zipcodeIndex;
            dst.telIndex = src.telIndex;
            dst.latIndex = src.latIndex;
            dst.lngIndex = src.lngIndex;
            dst.dateIndex = src.dateIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CustomerColumnInfo columnInfo;
    private ProxyState<th.co.icc.tigerjob.database.modelrealm.Customer> proxyState;

    th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CustomerColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<th.co.icc.tigerjob.database.modelrealm.Customer>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'customerCode' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$customerName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.customerNameIndex);
    }

    @Override
    public void realmSet$customerName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.customerNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.customerNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.customerNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.customerNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressIndex);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.addressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.addressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.addressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.addressIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$subdistrict() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.subdistrictIndex);
    }

    @Override
    public void realmSet$subdistrict(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.subdistrictIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.subdistrictIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.subdistrictIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.subdistrictIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$district() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.districtIndex);
    }

    @Override
    public void realmSet$district(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.districtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.districtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.districtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.districtIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$province() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.provinceIndex);
    }

    @Override
    public void realmSet$province(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.provinceIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.provinceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.provinceIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.provinceIndex, value);
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
    public String realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.latIndex);
    }

    @Override
    public void realmSet$lat(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.latIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.latIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lng() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lngIndex);
    }

    @Override
    public void realmSet$lng(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lngIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lngIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lngIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lngIndex, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Customer", 11, 0);
        builder.addPersistedProperty("customerCode", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("customerName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("subdistrict", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("district", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("province", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("zipcode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lng", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CustomerColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CustomerColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Customer";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Customer";
    }

    @SuppressWarnings("cast")
    public static th.co.icc.tigerjob.database.modelrealm.Customer createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        th.co.icc.tigerjob.database.modelrealm.Customer obj = null;
        if (update) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Customer.class);
            CustomerColumnInfo columnInfo = (CustomerColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class);
            long pkColumnIndex = columnInfo.customerCodeIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("customerCode")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("customerCode"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class), false, Collections.<String> emptyList());
                    obj = new io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("customerCode")) {
                if (json.isNull("customerCode")) {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Customer.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Customer.class, json.getString("customerCode"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'customerCode'.");
            }
        }

        final th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) obj;
        if (json.has("customerName")) {
            if (json.isNull("customerName")) {
                objProxy.realmSet$customerName(null);
            } else {
                objProxy.realmSet$customerName((String) json.getString("customerName"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("subdistrict")) {
            if (json.isNull("subdistrict")) {
                objProxy.realmSet$subdistrict(null);
            } else {
                objProxy.realmSet$subdistrict((String) json.getString("subdistrict"));
            }
        }
        if (json.has("district")) {
            if (json.isNull("district")) {
                objProxy.realmSet$district(null);
            } else {
                objProxy.realmSet$district((String) json.getString("district"));
            }
        }
        if (json.has("province")) {
            if (json.isNull("province")) {
                objProxy.realmSet$province(null);
            } else {
                objProxy.realmSet$province((String) json.getString("province"));
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
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                objProxy.realmSet$lat(null);
            } else {
                objProxy.realmSet$lat((String) json.getString("lat"));
            }
        }
        if (json.has("lng")) {
            if (json.isNull("lng")) {
                objProxy.realmSet$lng(null);
            } else {
                objProxy.realmSet$lng((String) json.getString("lng"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                objProxy.realmSet$date((String) json.getString("date"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static th.co.icc.tigerjob.database.modelrealm.Customer createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final th.co.icc.tigerjob.database.modelrealm.Customer obj = new th.co.icc.tigerjob.database.modelrealm.Customer();
        final th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("customerCode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$customerCode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$customerCode(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("customerName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$customerName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$customerName(null);
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("subdistrict")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subdistrict((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$subdistrict(null);
                }
            } else if (name.equals("district")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$district((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$district(null);
                }
            } else if (name.equals("province")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$province((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$province(null);
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
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lat(null);
                }
            } else if (name.equals("lng")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lng((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lng(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'customerCode'.");
        }
        return realm.copyToRealm(obj);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Customer copyOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Customer object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (th.co.icc.tigerjob.database.modelrealm.Customer) cachedRealmObject;
        }

        th.co.icc.tigerjob.database.modelrealm.Customer realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Customer.class);
            CustomerColumnInfo columnInfo = (CustomerColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class);
            long pkColumnIndex = columnInfo.customerCodeIndex;
            String value = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerCode();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Customer copy(Realm realm, th.co.icc.tigerjob.database.modelrealm.Customer newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (th.co.icc.tigerjob.database.modelrealm.Customer) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        th.co.icc.tigerjob.database.modelrealm.Customer realmObject = realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Customer.class, ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) newObject).realmGet$customerCode(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) newObject;
        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface realmObjectCopy = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$customerName(realmObjectSource.realmGet$customerName());
        realmObjectCopy.realmSet$address(realmObjectSource.realmGet$address());
        realmObjectCopy.realmSet$subdistrict(realmObjectSource.realmGet$subdistrict());
        realmObjectCopy.realmSet$district(realmObjectSource.realmGet$district());
        realmObjectCopy.realmSet$province(realmObjectSource.realmGet$province());
        realmObjectCopy.realmSet$zipcode(realmObjectSource.realmGet$zipcode());
        realmObjectCopy.realmSet$tel(realmObjectSource.realmGet$tel());
        realmObjectCopy.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectCopy.realmSet$lng(realmObjectSource.realmGet$lng());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        return realmObject;
    }

    public static long insert(Realm realm, th.co.icc.tigerjob.database.modelrealm.Customer object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long tableNativePtr = table.getNativePtr();
        CustomerColumnInfo columnInfo = (CustomerColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long pkColumnIndex = columnInfo.customerCodeIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerCode();
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
        String realmGet$customerName = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerName();
        if (realmGet$customerName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customerNameIndex, rowIndex, realmGet$customerName, false);
        }
        String realmGet$address = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }
        String realmGet$subdistrict = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$subdistrict();
        if (realmGet$subdistrict != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subdistrictIndex, rowIndex, realmGet$subdistrict, false);
        }
        String realmGet$district = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$district();
        if (realmGet$district != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.districtIndex, rowIndex, realmGet$district, false);
        }
        String realmGet$province = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$province();
        if (realmGet$province != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.provinceIndex, rowIndex, realmGet$province, false);
        }
        String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$zipcode();
        if (realmGet$zipcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
        }
        String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$tel();
        if (realmGet$tel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
        }
        String realmGet$lat = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        }
        String realmGet$lng = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lng();
        if (realmGet$lng != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
        }
        String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long tableNativePtr = table.getNativePtr();
        CustomerColumnInfo columnInfo = (CustomerColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long pkColumnIndex = columnInfo.customerCodeIndex;
        th.co.icc.tigerjob.database.modelrealm.Customer object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Customer) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerCode();
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
            String realmGet$customerName = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerName();
            if (realmGet$customerName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customerNameIndex, rowIndex, realmGet$customerName, false);
            }
            String realmGet$address = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }
            String realmGet$subdistrict = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$subdistrict();
            if (realmGet$subdistrict != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subdistrictIndex, rowIndex, realmGet$subdistrict, false);
            }
            String realmGet$district = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$district();
            if (realmGet$district != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.districtIndex, rowIndex, realmGet$district, false);
            }
            String realmGet$province = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$province();
            if (realmGet$province != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.provinceIndex, rowIndex, realmGet$province, false);
            }
            String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$zipcode();
            if (realmGet$zipcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
            }
            String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$tel();
            if (realmGet$tel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
            }
            String realmGet$lat = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            }
            String realmGet$lng = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lng();
            if (realmGet$lng != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
            }
            String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Customer object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long tableNativePtr = table.getNativePtr();
        CustomerColumnInfo columnInfo = (CustomerColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long pkColumnIndex = columnInfo.customerCodeIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerCode();
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
        String realmGet$customerName = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerName();
        if (realmGet$customerName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customerNameIndex, rowIndex, realmGet$customerName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.customerNameIndex, rowIndex, false);
        }
        String realmGet$address = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }
        String realmGet$subdistrict = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$subdistrict();
        if (realmGet$subdistrict != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subdistrictIndex, rowIndex, realmGet$subdistrict, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.subdistrictIndex, rowIndex, false);
        }
        String realmGet$district = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$district();
        if (realmGet$district != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.districtIndex, rowIndex, realmGet$district, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.districtIndex, rowIndex, false);
        }
        String realmGet$province = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$province();
        if (realmGet$province != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.provinceIndex, rowIndex, realmGet$province, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.provinceIndex, rowIndex, false);
        }
        String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$zipcode();
        if (realmGet$zipcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, false);
        }
        String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$tel();
        if (realmGet$tel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.telIndex, rowIndex, false);
        }
        String realmGet$lat = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
        }
        String realmGet$lng = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lng();
        if (realmGet$lng != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lngIndex, rowIndex, false);
        }
        String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long tableNativePtr = table.getNativePtr();
        CustomerColumnInfo columnInfo = (CustomerColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        long pkColumnIndex = columnInfo.customerCodeIndex;
        th.co.icc.tigerjob.database.modelrealm.Customer object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Customer) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerCode();
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
            String realmGet$customerName = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$customerName();
            if (realmGet$customerName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customerNameIndex, rowIndex, realmGet$customerName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.customerNameIndex, rowIndex, false);
            }
            String realmGet$address = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }
            String realmGet$subdistrict = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$subdistrict();
            if (realmGet$subdistrict != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subdistrictIndex, rowIndex, realmGet$subdistrict, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.subdistrictIndex, rowIndex, false);
            }
            String realmGet$district = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$district();
            if (realmGet$district != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.districtIndex, rowIndex, realmGet$district, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.districtIndex, rowIndex, false);
            }
            String realmGet$province = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$province();
            if (realmGet$province != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.provinceIndex, rowIndex, realmGet$province, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.provinceIndex, rowIndex, false);
            }
            String realmGet$zipcode = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$zipcode();
            if (realmGet$zipcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, realmGet$zipcode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.zipcodeIndex, rowIndex, false);
            }
            String realmGet$tel = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$tel();
            if (realmGet$tel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telIndex, rowIndex, realmGet$tel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.telIndex, rowIndex, false);
            }
            String realmGet$lat = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
            }
            String realmGet$lng = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$lng();
            if (realmGet$lng != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lngIndex, rowIndex, false);
            }
            String realmGet$date = ((th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
        }
    }

    public static th.co.icc.tigerjob.database.modelrealm.Customer createDetachedCopy(th.co.icc.tigerjob.database.modelrealm.Customer realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        th.co.icc.tigerjob.database.modelrealm.Customer unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new th.co.icc.tigerjob.database.modelrealm.Customer();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (th.co.icc.tigerjob.database.modelrealm.Customer) cachedObject.object;
            }
            unmanagedObject = (th.co.icc.tigerjob.database.modelrealm.Customer) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface unmanagedCopy = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) unmanagedObject;
        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface realmSource = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$customerCode(realmSource.realmGet$customerCode());
        unmanagedCopy.realmSet$customerName(realmSource.realmGet$customerName());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$subdistrict(realmSource.realmGet$subdistrict());
        unmanagedCopy.realmSet$district(realmSource.realmGet$district());
        unmanagedCopy.realmSet$province(realmSource.realmGet$province());
        unmanagedCopy.realmSet$zipcode(realmSource.realmGet$zipcode());
        unmanagedCopy.realmSet$tel(realmSource.realmGet$tel());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lng(realmSource.realmGet$lng());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    static th.co.icc.tigerjob.database.modelrealm.Customer update(Realm realm, th.co.icc.tigerjob.database.modelrealm.Customer realmObject, th.co.icc.tigerjob.database.modelrealm.Customer newObject, Map<RealmModel, RealmObjectProxy> cache) {
        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface realmObjectTarget = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) realmObject;
        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$customerName(realmObjectSource.realmGet$customerName());
        realmObjectTarget.realmSet$address(realmObjectSource.realmGet$address());
        realmObjectTarget.realmSet$subdistrict(realmObjectSource.realmGet$subdistrict());
        realmObjectTarget.realmSet$district(realmObjectSource.realmGet$district());
        realmObjectTarget.realmSet$province(realmObjectSource.realmGet$province());
        realmObjectTarget.realmSet$zipcode(realmObjectSource.realmGet$zipcode());
        realmObjectTarget.realmSet$tel(realmObjectSource.realmGet$tel());
        realmObjectTarget.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectTarget.realmSet$lng(realmObjectSource.realmGet$lng());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
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
        th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy aCustomer = (th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCustomer.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCustomer.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCustomer.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
