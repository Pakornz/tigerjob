package th.co.icc.tigerjob.database

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import th.co.icc.tigerjob.config.Config


class ConnectRealm : Application() {
    override fun onCreate() {
        super.onCreate()
        realmDatabase()


    }

    private fun realmDatabase(){
        Realm.init(this)
        val config = RealmConfiguration.Builder()
                .name(Config.REALM_DB_NAME)
                .schemaVersion(Config.REALM_DB_VERSION)
                .modules(MyRealmModule())
                .migration(MyMigration())
                .build()
        Realm.getInstance(config)

    }

}