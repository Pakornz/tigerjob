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
public class th_co_icc_tigerjob_database_modelrealm_UserRealmProxy extends th.co.icc.tigerjob.database.modelrealm.User
    implements RealmObjectProxy, th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long empIdIndex;
        long nameIndex;
        long dept_idIndex;
        long authTokenIndex;
        long authDateIndex;
        long expiredateIndex;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.empIdIndex = addColumnDetails("empId", "empId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.dept_idIndex = addColumnDetails("dept_id", "dept_id", objectSchemaInfo);
            this.authTokenIndex = addColumnDetails("authToken", "authToken", objectSchemaInfo);
            this.authDateIndex = addColumnDetails("authDate", "authDate", objectSchemaInfo);
            this.expiredateIndex = addColumnDetails("expiredate", "expiredate", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.empIdIndex = src.empIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.dept_idIndex = src.dept_idIndex;
            dst.authTokenIndex = src.authTokenIndex;
            dst.authDateIndex = src.authDateIndex;
            dst.expiredateIndex = src.expiredateIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<th.co.icc.tigerjob.database.modelrealm.User> proxyState;

    th_co_icc_tigerjob_database_modelrealm_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<th.co.icc.tigerjob.database.modelrealm.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$empId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.empIdIndex);
    }

    @Override
    public void realmSet$empId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.empIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.empIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.empIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.empIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dept_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dept_idIndex);
    }

    @Override
    public void realmSet$dept_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dept_idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dept_idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dept_idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dept_idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$authToken() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.authTokenIndex);
    }

    @Override
    public void realmSet$authToken(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'authToken' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$authDate() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.authDateIndex)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.authDateIndex);
    }

    @Override
    public void realmSet$authDate(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.authDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDate(columnInfo.authDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.authDateIndex);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.authDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$expiredate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.expiredateIndex);
    }

    @Override
    public void realmSet$expiredate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.expiredateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.expiredateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.expiredateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.expiredateIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 6, 0);
        builder.addPersistedProperty("empId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dept_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("authToken", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("authDate", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("expiredate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static th.co.icc.tigerjob.database.modelrealm.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        th.co.icc.tigerjob.database.modelrealm.User obj = null;
        if (update) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class);
            long pkColumnIndex = columnInfo.authTokenIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("authToken")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("authToken"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("authToken")) {
                if (json.isNull("authToken")) {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.User.class, json.getString("authToken"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'authToken'.");
            }
        }

        final th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) obj;
        if (json.has("empId")) {
            if (json.isNull("empId")) {
                objProxy.realmSet$empId(null);
            } else {
                objProxy.realmSet$empId((String) json.getString("empId"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("dept_id")) {
            if (json.isNull("dept_id")) {
                objProxy.realmSet$dept_id(null);
            } else {
                objProxy.realmSet$dept_id((String) json.getString("dept_id"));
            }
        }
        if (json.has("authDate")) {
            if (json.isNull("authDate")) {
                objProxy.realmSet$authDate(null);
            } else {
                Object timestamp = json.get("authDate");
                if (timestamp instanceof String) {
                    objProxy.realmSet$authDate(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$authDate(new Date(json.getLong("authDate")));
                }
            }
        }
        if (json.has("expiredate")) {
            if (json.isNull("expiredate")) {
                objProxy.realmSet$expiredate(null);
            } else {
                objProxy.realmSet$expiredate((String) json.getString("expiredate"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static th.co.icc.tigerjob.database.modelrealm.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final th.co.icc.tigerjob.database.modelrealm.User obj = new th.co.icc.tigerjob.database.modelrealm.User();
        final th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("empId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$empId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$empId(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("dept_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dept_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dept_id(null);
                }
            } else if (name.equals("authToken")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$authToken((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$authToken(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("authDate")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$authDate(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$authDate(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$authDate(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("expiredate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$expiredate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$expiredate(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'authToken'.");
        }
        return realm.copyToRealm(obj);
    }

    public static th.co.icc.tigerjob.database.modelrealm.User copyOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (th.co.icc.tigerjob.database.modelrealm.User) cachedRealmObject;
        }

        th.co.icc.tigerjob.database.modelrealm.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class);
            long pkColumnIndex = columnInfo.authTokenIndex;
            String value = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authToken();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static th.co.icc.tigerjob.database.modelrealm.User copy(Realm realm, th.co.icc.tigerjob.database.modelrealm.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (th.co.icc.tigerjob.database.modelrealm.User) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        th.co.icc.tigerjob.database.modelrealm.User realmObject = realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.User.class, ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) newObject).realmGet$authToken(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) newObject;
        th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface realmObjectCopy = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$empId(realmObjectSource.realmGet$empId());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$dept_id(realmObjectSource.realmGet$dept_id());
        realmObjectCopy.realmSet$authDate(realmObjectSource.realmGet$authDate());
        realmObjectCopy.realmSet$expiredate(realmObjectSource.realmGet$expiredate());
        return realmObject;
    }

    public static long insert(Realm realm, th.co.icc.tigerjob.database.modelrealm.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class);
        long pkColumnIndex = columnInfo.authTokenIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authToken();
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
        String realmGet$empId = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$empId();
        if (realmGet$empId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.empIdIndex, rowIndex, realmGet$empId, false);
        }
        String realmGet$name = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$dept_id = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$dept_id();
        if (realmGet$dept_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dept_idIndex, rowIndex, realmGet$dept_id, false);
        }
        java.util.Date realmGet$authDate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authDate();
        if (realmGet$authDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.authDateIndex, rowIndex, realmGet$authDate.getTime(), false);
        }
        String realmGet$expiredate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$expiredate();
        if (realmGet$expiredate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.expiredateIndex, rowIndex, realmGet$expiredate, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class);
        long pkColumnIndex = columnInfo.authTokenIndex;
        th.co.icc.tigerjob.database.modelrealm.User object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authToken();
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
            String realmGet$empId = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$empId();
            if (realmGet$empId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.empIdIndex, rowIndex, realmGet$empId, false);
            }
            String realmGet$name = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$dept_id = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$dept_id();
            if (realmGet$dept_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dept_idIndex, rowIndex, realmGet$dept_id, false);
            }
            java.util.Date realmGet$authDate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authDate();
            if (realmGet$authDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.authDateIndex, rowIndex, realmGet$authDate.getTime(), false);
            }
            String realmGet$expiredate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$expiredate();
            if (realmGet$expiredate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.expiredateIndex, rowIndex, realmGet$expiredate, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class);
        long pkColumnIndex = columnInfo.authTokenIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authToken();
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
        String realmGet$empId = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$empId();
        if (realmGet$empId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.empIdIndex, rowIndex, realmGet$empId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.empIdIndex, rowIndex, false);
        }
        String realmGet$name = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$dept_id = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$dept_id();
        if (realmGet$dept_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dept_idIndex, rowIndex, realmGet$dept_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dept_idIndex, rowIndex, false);
        }
        java.util.Date realmGet$authDate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authDate();
        if (realmGet$authDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.authDateIndex, rowIndex, realmGet$authDate.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.authDateIndex, rowIndex, false);
        }
        String realmGet$expiredate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$expiredate();
        if (realmGet$expiredate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.expiredateIndex, rowIndex, realmGet$expiredate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.expiredateIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.User.class);
        long pkColumnIndex = columnInfo.authTokenIndex;
        th.co.icc.tigerjob.database.modelrealm.User object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authToken();
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
            String realmGet$empId = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$empId();
            if (realmGet$empId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.empIdIndex, rowIndex, realmGet$empId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.empIdIndex, rowIndex, false);
            }
            String realmGet$name = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$dept_id = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$dept_id();
            if (realmGet$dept_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dept_idIndex, rowIndex, realmGet$dept_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dept_idIndex, rowIndex, false);
            }
            java.util.Date realmGet$authDate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$authDate();
            if (realmGet$authDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.authDateIndex, rowIndex, realmGet$authDate.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.authDateIndex, rowIndex, false);
            }
            String realmGet$expiredate = ((th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) object).realmGet$expiredate();
            if (realmGet$expiredate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.expiredateIndex, rowIndex, realmGet$expiredate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.expiredateIndex, rowIndex, false);
            }
        }
    }

    public static th.co.icc.tigerjob.database.modelrealm.User createDetachedCopy(th.co.icc.tigerjob.database.modelrealm.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        th.co.icc.tigerjob.database.modelrealm.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new th.co.icc.tigerjob.database.modelrealm.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (th.co.icc.tigerjob.database.modelrealm.User) cachedObject.object;
            }
            unmanagedObject = (th.co.icc.tigerjob.database.modelrealm.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface unmanagedCopy = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) unmanagedObject;
        th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface realmSource = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$empId(realmSource.realmGet$empId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$dept_id(realmSource.realmGet$dept_id());
        unmanagedCopy.realmSet$authToken(realmSource.realmGet$authToken());
        unmanagedCopy.realmSet$authDate(realmSource.realmGet$authDate());
        unmanagedCopy.realmSet$expiredate(realmSource.realmGet$expiredate());

        return unmanagedObject;
    }

    static th.co.icc.tigerjob.database.modelrealm.User update(Realm realm, th.co.icc.tigerjob.database.modelrealm.User realmObject, th.co.icc.tigerjob.database.modelrealm.User newObject, Map<RealmModel, RealmObjectProxy> cache) {
        th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface realmObjectTarget = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) realmObject;
        th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$empId(realmObjectSource.realmGet$empId());
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$dept_id(realmObjectSource.realmGet$dept_id());
        realmObjectTarget.realmSet$authDate(realmObjectSource.realmGet$authDate());
        realmObjectTarget.realmSet$expiredate(realmObjectSource.realmGet$expiredate());
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
        th_co_icc_tigerjob_database_modelrealm_UserRealmProxy aUser = (th_co_icc_tigerjob_database_modelrealm_UserRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUser.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUser.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
