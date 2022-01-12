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
public class th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy extends th.co.icc.tigerjob.database.modelrealm.Check
    implements RealmObjectProxy, th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface {

    static final class CheckColumnInfo extends ColumnInfo {
        long namesIndex;
        long isCheckedIndex;

        CheckColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Check");
            this.namesIndex = addColumnDetails("names", "names", objectSchemaInfo);
            this.isCheckedIndex = addColumnDetails("isChecked", "isChecked", objectSchemaInfo);
        }

        CheckColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CheckColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CheckColumnInfo src = (CheckColumnInfo) rawSrc;
            final CheckColumnInfo dst = (CheckColumnInfo) rawDst;
            dst.namesIndex = src.namesIndex;
            dst.isCheckedIndex = src.isCheckedIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CheckColumnInfo columnInfo;
    private ProxyState<th.co.icc.tigerjob.database.modelrealm.Check> proxyState;

    th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CheckColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<th.co.icc.tigerjob.database.modelrealm.Check>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$names() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namesIndex);
    }

    @Override
    public void realmSet$names(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'names' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isChecked() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isCheckedIndex);
    }

    @Override
    public void realmSet$isChecked(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isCheckedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isCheckedIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Check", 2, 0);
        builder.addPersistedProperty("names", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isChecked", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CheckColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CheckColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Check";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Check";
    }

    @SuppressWarnings("cast")
    public static th.co.icc.tigerjob.database.modelrealm.Check createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        th.co.icc.tigerjob.database.modelrealm.Check obj = null;
        if (update) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Check.class);
            CheckColumnInfo columnInfo = (CheckColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class);
            long pkColumnIndex = columnInfo.namesIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("names")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("names"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class), false, Collections.<String> emptyList());
                    obj = new io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("names")) {
                if (json.isNull("names")) {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Check.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Check.class, json.getString("names"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'names'.");
            }
        }

        final th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) obj;
        if (json.has("isChecked")) {
            if (json.isNull("isChecked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isChecked' to null.");
            } else {
                objProxy.realmSet$isChecked((boolean) json.getBoolean("isChecked"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static th.co.icc.tigerjob.database.modelrealm.Check createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final th.co.icc.tigerjob.database.modelrealm.Check obj = new th.co.icc.tigerjob.database.modelrealm.Check();
        final th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("names")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$names((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$names(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("isChecked")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isChecked((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isChecked' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'names'.");
        }
        return realm.copyToRealm(obj);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Check copyOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Check object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (th.co.icc.tigerjob.database.modelrealm.Check) cachedRealmObject;
        }

        th.co.icc.tigerjob.database.modelrealm.Check realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Check.class);
            CheckColumnInfo columnInfo = (CheckColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class);
            long pkColumnIndex = columnInfo.namesIndex;
            String value = ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$names();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Check copy(Realm realm, th.co.icc.tigerjob.database.modelrealm.Check newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (th.co.icc.tigerjob.database.modelrealm.Check) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        th.co.icc.tigerjob.database.modelrealm.Check realmObject = realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Check.class, ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) newObject).realmGet$names(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) newObject;
        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface realmObjectCopy = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$isChecked(realmObjectSource.realmGet$isChecked());
        return realmObject;
    }

    public static long insert(Realm realm, th.co.icc.tigerjob.database.modelrealm.Check object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long tableNativePtr = table.getNativePtr();
        CheckColumnInfo columnInfo = (CheckColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long pkColumnIndex = columnInfo.namesIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$names();
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
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isCheckedIndex, rowIndex, ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$isChecked(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long tableNativePtr = table.getNativePtr();
        CheckColumnInfo columnInfo = (CheckColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long pkColumnIndex = columnInfo.namesIndex;
        th.co.icc.tigerjob.database.modelrealm.Check object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Check) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$names();
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
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isCheckedIndex, rowIndex, ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$isChecked(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Check object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long tableNativePtr = table.getNativePtr();
        CheckColumnInfo columnInfo = (CheckColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long pkColumnIndex = columnInfo.namesIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$names();
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
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isCheckedIndex, rowIndex, ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$isChecked(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long tableNativePtr = table.getNativePtr();
        CheckColumnInfo columnInfo = (CheckColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Check.class);
        long pkColumnIndex = columnInfo.namesIndex;
        th.co.icc.tigerjob.database.modelrealm.Check object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Check) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$names();
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
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isCheckedIndex, rowIndex, ((th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) object).realmGet$isChecked(), false);
        }
    }

    public static th.co.icc.tigerjob.database.modelrealm.Check createDetachedCopy(th.co.icc.tigerjob.database.modelrealm.Check realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        th.co.icc.tigerjob.database.modelrealm.Check unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new th.co.icc.tigerjob.database.modelrealm.Check();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (th.co.icc.tigerjob.database.modelrealm.Check) cachedObject.object;
            }
            unmanagedObject = (th.co.icc.tigerjob.database.modelrealm.Check) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface unmanagedCopy = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) unmanagedObject;
        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface realmSource = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$names(realmSource.realmGet$names());
        unmanagedCopy.realmSet$isChecked(realmSource.realmGet$isChecked());

        return unmanagedObject;
    }

    static th.co.icc.tigerjob.database.modelrealm.Check update(Realm realm, th.co.icc.tigerjob.database.modelrealm.Check realmObject, th.co.icc.tigerjob.database.modelrealm.Check newObject, Map<RealmModel, RealmObjectProxy> cache) {
        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface realmObjectTarget = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) realmObject;
        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$isChecked(realmObjectSource.realmGet$isChecked());
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
        th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy aCheck = (th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCheck.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCheck.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCheck.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
