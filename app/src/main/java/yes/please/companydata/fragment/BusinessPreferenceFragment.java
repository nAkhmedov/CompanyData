package yes.please.companydata.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import yes.please.companydata.R;
import yes.please.companydata.constants.ContextConstants;
import yes.please.companydata.execution.CustomHTTPService;

/**
 * Created by Navruz on 25.04.2016.
 */
public class BusinessPreferenceFragment extends PreferenceFragment implements Preference.OnPreferenceClickListener {

    private SharedPreferences.OnSharedPreferenceChangeListener listener;
    private SharedPreferences prefs;
    private static CustomHTTPService http;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getDetails();

        addPreferencesFromResource(R.xml.pref_content);
        addPreferencesFromResource(R.xml.mail_pref_content);
        addPreferencesFromResource(R.xml.fb_pref_content);
        addPreferencesFromResource(R.xml.twitter_pref_content);
        addPreferencesFromResource(R.xml.linkedin_pref_content);
        addPreferencesFromResource(R.xml.googleplus_pref_content);
        addPreferencesFromResource(R.xml.youtube_pref_content);
        addPreferencesFromResource(R.xml.phone_pref_content);
        addPreferencesFromResource(R.xml.gallery_pref_content);
        addPreferencesFromResource(R.xml.about_pref_content);
        addPreferencesFromResource(R.xml.website_pref_content);
        addPreferencesFromResource(R.xml.map_pref_content);
        addPreferencesFromResource(R.xml.pinterest_pref_content);
        addPreferencesFromResource(R.xml.chat_pref_content);
        addPreferencesFromResource(R.xml.android_app_pref_content);

        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        final EditTextPreference businessName = (EditTextPreference) findPreference("business_name");
        final EditTextPreference logoName = (EditTextPreference) findPreference("logo_name");

        listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                switch (key) {
                    case "business_name": {
                        String businessText = sharedPreferences.getString("business_name", "");
                        businessName.setTitle(businessText);
                        break;
                    }
                    case "logo_name": {
                        String logoText = sharedPreferences.getString("logo_name", "");
                        logoName.setTitle(logoText);
                        break;
                    }
                }
            }
        };
    }

    private void getDetails() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ContextConstants.BUSINESS_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        http = restAdapter.create(CustomHTTPService.class);
        http.sendBusinessDetailRequest("13933", new Callback<JsonObject>() {
            @Override
            public void success(JsonObject jsonObject, Response response) {
                jsonObject = jsonObject;
                int i = 0;
                i++;
            }

            @Override
            public void failure(RetrofitError error) {
                int i = 0;
                i++;
            }
        });
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        return false;
    }

    @Override
    public void onResume() {
        super.onResume();
        prefs.registerOnSharedPreferenceChangeListener(listener);
    }

    @Override
    public void onPause() {
        super.onPause();
        prefs.unregisterOnSharedPreferenceChangeListener(listener);
    }
}
