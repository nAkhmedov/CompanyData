package yes.please.companydata.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import yes.please.companydata.R;

/**
 * Created by Navruz on 25.04.2016.
 */
public class BusinessPreferenceFragment extends PreferenceFragment implements Preference.OnPreferenceClickListener {

    private SharedPreferences.OnSharedPreferenceChangeListener listener;
    private SharedPreferences prefs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_content);

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
