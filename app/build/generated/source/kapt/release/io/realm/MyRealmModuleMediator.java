package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class MyRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(7);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.Prefix.class);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.User.class);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.Job.class);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.CreateJob.class);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.Check.class);
        modelClasses.add(th.co.icc.tigerjob.database.modelrealm.Customer.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(7);
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.Prefix.class, io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.User.class, io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.Job.class, io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class, io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.CreateJob.class, io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.Check.class, io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(th.co.icc.tigerjob.database.modelrealm.Customer.class, io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            return io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            return "Prefix";
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            return "User";
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            return "Job";
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            return "CreateCustomer";
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            return "CreateJob";
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            return "Check";
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            return "Customer";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy());
            }
            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy());
            }
            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy());
            }
            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy());
            }
            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy());
            }
            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy());
            }
            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
                return clazz.cast(new io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Prefix) obj, update, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.User) obj, update, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Job) obj, update, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.CreateCustomer) obj, update, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.CreateJob) obj, update, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Check) obj, update, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.copyOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Customer) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Prefix) object, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.User) object, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Job) object, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.CreateCustomer) object, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.CreateJob) object, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Check) object, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Customer) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Prefix) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.User) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Job) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.CreateCustomer) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.CreateJob) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Check) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.insert(realm, (th.co.icc.tigerjob.database.modelrealm.Customer) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Prefix) obj, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.User) obj, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Job) obj, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.CreateCustomer) obj, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.CreateJob) obj, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Check) obj, cache);
        } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Customer) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Prefix) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.User) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Job) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.CreateCustomer) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.CreateJob) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Check) object, cache);
            } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
                io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.insertOrUpdate(realm, (th.co.icc.tigerjob.database.modelrealm.Customer) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
                    io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Prefix.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_PrefixRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.Prefix) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.User.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_UserRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Job.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_JobRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.Job) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateCustomer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateCustomerRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.CreateCustomer) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.CreateJob.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CreateJobRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.CreateJob) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Check.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CheckRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.Check) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(th.co.icc.tigerjob.database.modelrealm.Customer.class)) {
            return clazz.cast(io.realm.th_co_icc_tigerjob_database_modelrealm_CustomerRealmProxy.createDetachedCopy((th.co.icc.tigerjob.database.modelrealm.Customer) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
