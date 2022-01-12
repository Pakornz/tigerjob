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
public class th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy extends th.co.icc.tigerjob.database.modelrealm.Prefix
    implements RealmObjectProxy, th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface {

    static final class PrefixColumnInfo extends ColumnInfo {
        long docidIndex;
        long typeIndex;
        long docnameIndex;
        long prefixIndex;
        long startrunIndex;
        long currentrunIndex;
        long customtextIndex;
        long isdefaultIndex;
        long ishiddenIndex;
        long isactiveIndex;
        long docformatIndex;

        PrefixColumnInfo(OsSchemaInfo schemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Prefix");
            this.docidIndex = addColumnDetails("docid", "docid", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.docnameIndex = addColumnDetails("docname", "docname", objectSchemaInfo);
            this.prefixIndex = addColumnDetails("prefix", "prefix", objectSchemaInfo);
            this.startrunIndex = addColumnDetails("startrun", "startrun", objectSchemaInfo);
            this.currentrunIndex = addColumnDetails("currentrun", "currentrun", objectSchemaInfo);
            this.customtextIndex = addColumnDetails("customtext", "customtext", objectSchemaInfo);
            this.isdefaultIndex = addColumnDetails("isdefault", "isdefault", objectSchemaInfo);
            this.ishiddenIndex = addColumnDetails("ishidden", "ishidden", objectSchemaInfo);
            this.isactiveIndex = addColumnDetails("isactive", "isactive", objectSchemaInfo);
            this.docformatIndex = addColumnDetails("docformat", "docformat", objectSchemaInfo);
        }

        PrefixColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PrefixColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PrefixColumnInfo src = (PrefixColumnInfo) rawSrc;
            final PrefixColumnInfo dst = (PrefixColumnInfo) rawDst;
            dst.docidIndex = src.docidIndex;
            dst.typeIndex = src.typeIndex;
            dst.docnameIndex = src.docnameIndex;
            dst.prefixIndex = src.prefixIndex;
            dst.startrunIndex = src.startrunIndex;
            dst.currentrunIndex = src.currentrunIndex;
            dst.customtextIndex = src.customtextIndex;
            dst.isdefaultIndex = src.isdefaultIndex;
            dst.ishiddenIndex = src.ishiddenIndex;
            dst.isactiveIndex = src.isactiveIndex;
            dst.docformatIndex = src.docformatIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PrefixColumnInfo columnInfo;
    private ProxyState<th.co.icc.tigerjob.database.modelrealm.Prefix> proxyState;

    th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PrefixColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<th.co.icc.tigerjob.database.modelrealm.Prefix>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$docid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.docidIndex);
    }

    @Override
    public void realmSet$docid(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'docid' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$docname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.docnameIndex);
    }

    @Override
    public void realmSet$docname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.docnameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.docnameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.docnameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.docnameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$prefix() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.prefixIndex);
    }

    @Override
    public void realmSet$prefix(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.prefixIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.prefixIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.prefixIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.prefixIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$startrun() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.startrunIndex);
    }

    @Override
    public void realmSet$startrun(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.startrunIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.startrunIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.startrunIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.startrunIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currentrun() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currentrunIndex);
    }

    @Override
    public void realmSet$currentrun(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.currentrunIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.currentrunIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.currentrunIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.currentrunIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$customtext() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.customtextIndex);
    }

    @Override
    public void realmSet$customtext(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.customtextIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.customtextIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.customtextIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.customtextIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$isdefault() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.isdefaultIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isdefaultIndex);
    }

    @Override
    public void realmSet$isdefault(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.isdefaultIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.isdefaultIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.isdefaultIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.isdefaultIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$ishidden() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ishiddenIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.ishiddenIndex);
    }

    @Override
    public void realmSet$ishidden(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ishiddenIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.ishiddenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ishiddenIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.ishiddenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$isactive() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.isactiveIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isactiveIndex);
    }

    @Override
    public void realmSet$isactive(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.isactiveIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.isactiveIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.isactiveIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.isactiveIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$docformat() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.docformatIndex);
    }

    @Override
    public void realmSet$docformat(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.docformatIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.docformatIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.docformatIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.docformatIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Prefix", 11, 0);
        builder.addPersistedProperty("docid", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("docname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("prefix", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("startrun", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("currentrun", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("customtext", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isdefault", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("ishidden", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isactive", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("docformat", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PrefixColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PrefixColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Prefix";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Prefix";
    }

    @SuppressWarnings("cast")
    public static th.co.icc.tigerjob.database.modelrealm.Prefix createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        th.co.icc.tigerjob.database.modelrealm.Prefix obj = null;
        if (update) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
            PrefixColumnInfo columnInfo = (PrefixColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
            long pkColumnIndex = columnInfo.docidIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("docid")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("docid"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class), false, Collections.<String> emptyList());
                    obj = new io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("docid")) {
                if (json.isNull("docid")) {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Prefix.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy) realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Prefix.class, json.getString("docid"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'docid'.");
            }
        }

        final th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) obj;
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("docname")) {
            if (json.isNull("docname")) {
                objProxy.realmSet$docname(null);
            } else {
                objProxy.realmSet$docname((String) json.getString("docname"));
            }
        }
        if (json.has("prefix")) {
            if (json.isNull("prefix")) {
                objProxy.realmSet$prefix(null);
            } else {
                objProxy.realmSet$prefix((String) json.getString("prefix"));
            }
        }
        if (json.has("startrun")) {
            if (json.isNull("startrun")) {
                objProxy.realmSet$startrun(null);
            } else {
                objProxy.realmSet$startrun((String) json.getString("startrun"));
            }
        }
        if (json.has("currentrun")) {
            if (json.isNull("currentrun")) {
                objProxy.realmSet$currentrun(null);
            } else {
                objProxy.realmSet$currentrun((String) json.getString("currentrun"));
            }
        }
        if (json.has("customtext")) {
            if (json.isNull("customtext")) {
                objProxy.realmSet$customtext(null);
            } else {
                objProxy.realmSet$customtext((String) json.getString("customtext"));
            }
        }
        if (json.has("isdefault")) {
            if (json.isNull("isdefault")) {
                objProxy.realmSet$isdefault(null);
            } else {
                objProxy.realmSet$isdefault((boolean) json.getBoolean("isdefault"));
            }
        }
        if (json.has("ishidden")) {
            if (json.isNull("ishidden")) {
                objProxy.realmSet$ishidden(null);
            } else {
                objProxy.realmSet$ishidden((boolean) json.getBoolean("ishidden"));
            }
        }
        if (json.has("isactive")) {
            if (json.isNull("isactive")) {
                objProxy.realmSet$isactive(null);
            } else {
                objProxy.realmSet$isactive((boolean) json.getBoolean("isactive"));
            }
        }
        if (json.has("docformat")) {
            if (json.isNull("docformat")) {
                objProxy.realmSet$docformat(null);
            } else {
                objProxy.realmSet$docformat((String) json.getString("docformat"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static th.co.icc.tigerjob.database.modelrealm.Prefix createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final th.co.icc.tigerjob.database.modelrealm.Prefix obj = new th.co.icc.tigerjob.database.modelrealm.Prefix();
        final th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface objProxy = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("docid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$docid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$docid(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("docname")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$docname((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$docname(null);
                }
            } else if (name.equals("prefix")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$prefix((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$prefix(null);
                }
            } else if (name.equals("startrun")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$startrun((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$startrun(null);
                }
            } else if (name.equals("currentrun")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currentrun((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currentrun(null);
                }
            } else if (name.equals("customtext")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$customtext((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$customtext(null);
                }
            } else if (name.equals("isdefault")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isdefault((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$isdefault(null);
                }
            } else if (name.equals("ishidden")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ishidden((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ishidden(null);
                }
            } else if (name.equals("isactive")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isactive((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$isactive(null);
                }
            } else if (name.equals("docformat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$docformat((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$docformat(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'docid'.");
        }
        return realm.copyToRealm(obj);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Prefix copyOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Prefix object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (th.co.icc.tigerjob.database.modelrealm.Prefix) cachedRealmObject;
        }

        th.co.icc.tigerjob.database.modelrealm.Prefix realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
            PrefixColumnInfo columnInfo = (PrefixColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
            long pkColumnIndex = columnInfo.docidIndex;
            String value = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docid();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static th.co.icc.tigerjob.database.modelrealm.Prefix copy(Realm realm, th.co.icc.tigerjob.database.modelrealm.Prefix newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (th.co.icc.tigerjob.database.modelrealm.Prefix) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        th.co.icc.tigerjob.database.modelrealm.Prefix realmObject = realm.createObjectInternal(th.co.icc.tigerjob.database.modelrealm.Prefix.class, ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) newObject).realmGet$docid(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) newObject;
        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface realmObjectCopy = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectCopy.realmSet$docname(realmObjectSource.realmGet$docname());
        realmObjectCopy.realmSet$prefix(realmObjectSource.realmGet$prefix());
        realmObjectCopy.realmSet$startrun(realmObjectSource.realmGet$startrun());
        realmObjectCopy.realmSet$currentrun(realmObjectSource.realmGet$currentrun());
        realmObjectCopy.realmSet$customtext(realmObjectSource.realmGet$customtext());
        realmObjectCopy.realmSet$isdefault(realmObjectSource.realmGet$isdefault());
        realmObjectCopy.realmSet$ishidden(realmObjectSource.realmGet$ishidden());
        realmObjectCopy.realmSet$isactive(realmObjectSource.realmGet$isactive());
        realmObjectCopy.realmSet$docformat(realmObjectSource.realmGet$docformat());
        return realmObject;
    }

    public static long insert(Realm realm, th.co.icc.tigerjob.database.modelrealm.Prefix object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long tableNativePtr = table.getNativePtr();
        PrefixColumnInfo columnInfo = (PrefixColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long pkColumnIndex = columnInfo.docidIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docid();
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
        String realmGet$type = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        String realmGet$docname = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docname();
        if (realmGet$docname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.docnameIndex, rowIndex, realmGet$docname, false);
        }
        String realmGet$prefix = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$prefix();
        if (realmGet$prefix != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.prefixIndex, rowIndex, realmGet$prefix, false);
        }
        String realmGet$startrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$startrun();
        if (realmGet$startrun != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.startrunIndex, rowIndex, realmGet$startrun, false);
        }
        String realmGet$currentrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$currentrun();
        if (realmGet$currentrun != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentrunIndex, rowIndex, realmGet$currentrun, false);
        }
        String realmGet$customtext = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$customtext();
        if (realmGet$customtext != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customtextIndex, rowIndex, realmGet$customtext, false);
        }
        Boolean realmGet$isdefault = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isdefault();
        if (realmGet$isdefault != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isdefaultIndex, rowIndex, realmGet$isdefault, false);
        }
        Boolean realmGet$ishidden = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$ishidden();
        if (realmGet$ishidden != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.ishiddenIndex, rowIndex, realmGet$ishidden, false);
        }
        Boolean realmGet$isactive = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isactive();
        if (realmGet$isactive != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isactiveIndex, rowIndex, realmGet$isactive, false);
        }
        String realmGet$docformat = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docformat();
        if (realmGet$docformat != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.docformatIndex, rowIndex, realmGet$docformat, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long tableNativePtr = table.getNativePtr();
        PrefixColumnInfo columnInfo = (PrefixColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long pkColumnIndex = columnInfo.docidIndex;
        th.co.icc.tigerjob.database.modelrealm.Prefix object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Prefix) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docid();
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
            String realmGet$type = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }
            String realmGet$docname = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docname();
            if (realmGet$docname != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.docnameIndex, rowIndex, realmGet$docname, false);
            }
            String realmGet$prefix = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$prefix();
            if (realmGet$prefix != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.prefixIndex, rowIndex, realmGet$prefix, false);
            }
            String realmGet$startrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$startrun();
            if (realmGet$startrun != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.startrunIndex, rowIndex, realmGet$startrun, false);
            }
            String realmGet$currentrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$currentrun();
            if (realmGet$currentrun != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentrunIndex, rowIndex, realmGet$currentrun, false);
            }
            String realmGet$customtext = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$customtext();
            if (realmGet$customtext != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customtextIndex, rowIndex, realmGet$customtext, false);
            }
            Boolean realmGet$isdefault = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isdefault();
            if (realmGet$isdefault != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.isdefaultIndex, rowIndex, realmGet$isdefault, false);
            }
            Boolean realmGet$ishidden = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$ishidden();
            if (realmGet$ishidden != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.ishiddenIndex, rowIndex, realmGet$ishidden, false);
            }
            Boolean realmGet$isactive = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isactive();
            if (realmGet$isactive != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.isactiveIndex, rowIndex, realmGet$isactive, false);
            }
            String realmGet$docformat = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docformat();
            if (realmGet$docformat != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.docformatIndex, rowIndex, realmGet$docformat, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, th.co.icc.tigerjob.database.modelrealm.Prefix object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long tableNativePtr = table.getNativePtr();
        PrefixColumnInfo columnInfo = (PrefixColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long pkColumnIndex = columnInfo.docidIndex;
        String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docid();
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
        String realmGet$type = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        String realmGet$docname = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docname();
        if (realmGet$docname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.docnameIndex, rowIndex, realmGet$docname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.docnameIndex, rowIndex, false);
        }
        String realmGet$prefix = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$prefix();
        if (realmGet$prefix != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.prefixIndex, rowIndex, realmGet$prefix, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.prefixIndex, rowIndex, false);
        }
        String realmGet$startrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$startrun();
        if (realmGet$startrun != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.startrunIndex, rowIndex, realmGet$startrun, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.startrunIndex, rowIndex, false);
        }
        String realmGet$currentrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$currentrun();
        if (realmGet$currentrun != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentrunIndex, rowIndex, realmGet$currentrun, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currentrunIndex, rowIndex, false);
        }
        String realmGet$customtext = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$customtext();
        if (realmGet$customtext != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customtextIndex, rowIndex, realmGet$customtext, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.customtextIndex, rowIndex, false);
        }
        Boolean realmGet$isdefault = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isdefault();
        if (realmGet$isdefault != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isdefaultIndex, rowIndex, realmGet$isdefault, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.isdefaultIndex, rowIndex, false);
        }
        Boolean realmGet$ishidden = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$ishidden();
        if (realmGet$ishidden != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.ishiddenIndex, rowIndex, realmGet$ishidden, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ishiddenIndex, rowIndex, false);
        }
        Boolean realmGet$isactive = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isactive();
        if (realmGet$isactive != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isactiveIndex, rowIndex, realmGet$isactive, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.isactiveIndex, rowIndex, false);
        }
        String realmGet$docformat = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docformat();
        if (realmGet$docformat != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.docformatIndex, rowIndex, realmGet$docformat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.docformatIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long tableNativePtr = table.getNativePtr();
        PrefixColumnInfo columnInfo = (PrefixColumnInfo) realm.getSchema().getColumnInfo(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        long pkColumnIndex = columnInfo.docidIndex;
        th.co.icc.tigerjob.database.modelrealm.Prefix object = null;
        while (objects.hasNext()) {
            object = (th.co.icc.tigerjob.database.modelrealm.Prefix) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docid();
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
            String realmGet$type = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
            String realmGet$docname = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docname();
            if (realmGet$docname != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.docnameIndex, rowIndex, realmGet$docname, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.docnameIndex, rowIndex, false);
            }
            String realmGet$prefix = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$prefix();
            if (realmGet$prefix != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.prefixIndex, rowIndex, realmGet$prefix, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.prefixIndex, rowIndex, false);
            }
            String realmGet$startrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$startrun();
            if (realmGet$startrun != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.startrunIndex, rowIndex, realmGet$startrun, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.startrunIndex, rowIndex, false);
            }
            String realmGet$currentrun = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$currentrun();
            if (realmGet$currentrun != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentrunIndex, rowIndex, realmGet$currentrun, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currentrunIndex, rowIndex, false);
            }
            String realmGet$customtext = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$customtext();
            if (realmGet$customtext != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customtextIndex, rowIndex, realmGet$customtext, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.customtextIndex, rowIndex, false);
            }
            Boolean realmGet$isdefault = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isdefault();
            if (realmGet$isdefault != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.isdefaultIndex, rowIndex, realmGet$isdefault, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.isdefaultIndex, rowIndex, false);
            }
            Boolean realmGet$ishidden = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$ishidden();
            if (realmGet$ishidden != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.ishiddenIndex, rowIndex, realmGet$ishidden, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ishiddenIndex, rowIndex, false);
            }
            Boolean realmGet$isactive = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$isactive();
            if (realmGet$isactive != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.isactiveIndex, rowIndex, realmGet$isactive, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.isactiveIndex, rowIndex, false);
            }
            String realmGet$docformat = ((th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) object).realmGet$docformat();
            if (realmGet$docformat != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.docformatIndex, rowIndex, realmGet$docformat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.docformatIndex, rowIndex, false);
            }
        }
    }

    public static th.co.icc.tigerjob.database.modelrealm.Prefix createDetachedCopy(th.co.icc.tigerjob.database.modelrealm.Prefix realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        th.co.icc.tigerjob.database.modelrealm.Prefix unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new th.co.icc.tigerjob.database.modelrealm.Prefix();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (th.co.icc.tigerjob.database.modelrealm.Prefix) cachedObject.object;
            }
            unmanagedObject = (th.co.icc.tigerjob.database.modelrealm.Prefix) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface unmanagedCopy = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) unmanagedObject;
        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface realmSource = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$docid(realmSource.realmGet$docid());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$docname(realmSource.realmGet$docname());
        unmanagedCopy.realmSet$prefix(realmSource.realmGet$prefix());
        unmanagedCopy.realmSet$startrun(realmSource.realmGet$startrun());
        unmanagedCopy.realmSet$currentrun(realmSource.realmGet$currentrun());
        unmanagedCopy.realmSet$customtext(realmSource.realmGet$customtext());
        unmanagedCopy.realmSet$isdefault(realmSource.realmGet$isdefault());
        unmanagedCopy.realmSet$ishidden(realmSource.realmGet$ishidden());
        unmanagedCopy.realmSet$isactive(realmSource.realmGet$isactive());
        unmanagedCopy.realmSet$docformat(realmSource.realmGet$docformat());

        return unmanagedObject;
    }

    static th.co.icc.tigerjob.database.modelrealm.Prefix update(Realm realm, th.co.icc.tigerjob.database.modelrealm.Prefix realmObject, th.co.icc.tigerjob.database.modelrealm.Prefix newObject, Map<RealmModel, RealmObjectProxy> cache) {
        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface realmObjectTarget = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) realmObject;
        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface realmObjectSource = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectTarget.realmSet$docname(realmObjectSource.realmGet$docname());
        realmObjectTarget.realmSet$prefix(realmObjectSource.realmGet$prefix());
        realmObjectTarget.realmSet$startrun(realmObjectSource.realmGet$startrun());
        realmObjectTarget.realmSet$currentrun(realmObjectSource.realmGet$currentrun());
        realmObjectTarget.realmSet$customtext(realmObjectSource.realmGet$customtext());
        realmObjectTarget.realmSet$isdefault(realmObjectSource.realmGet$isdefault());
        realmObjectTarget.realmSet$ishidden(realmObjectSource.realmGet$ishidden());
        realmObjectTarget.realmSet$isactive(realmObjectSource.realmGet$isactive());
        realmObjectTarget.realmSet$docformat(realmObjectSource.realmGet$docformat());
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
        th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy aPrefix = (th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPrefix.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPrefix.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPrefix.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
