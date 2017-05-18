package in.ac.bits_pilani.goa.ard;

import android.app.Application;
import android.content.Context;

import in.ac.bits_pilani.goa.ard.utils.AHC;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Custom class extending the Application class.
 * This is used for setting up libraries.
 * @author vikramaditya
 */

public class ARD extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name(AHC.REALM_ARD_DATABASE)
                .schemaVersion(AHC.REALM_ARD_DATABASE_SCHEMA)
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}