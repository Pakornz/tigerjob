package th.co.icc.tigerjob.database

import io.realm.annotations.RealmModule
import th.co.icc.tigerjob.database.modelrealm.*

@RealmModule(classes = [User::class,Prefix::class,CreateCustomer::class,CreateJob::class,Check::class,Customer::class,Job::class])
class MyRealmModule {


}