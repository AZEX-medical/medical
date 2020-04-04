package com.example.bottomnavigationbar;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import java.util.Locale;
import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;

public class SettingFragment extends Fragment {

    TextView set_lang, set_help, set_switch, set_chang_pass, set_size, set_about, set_logout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_setting,container,false);
        loadLocale();

        set_lang = (TextView) view.findViewById(R.id.tv_lang);
        set_help = (TextView) view.findViewById(R.id.tv_help);
        set_switch = (TextView) view.findViewById(R.id.tv_switch);
        set_chang_pass = (TextView) view.findViewById(R.id.tv_chang_pass);
        set_size = (TextView) view.findViewById(R.id.tv_size);
        set_about = (TextView) view.findViewById(R.id.tv_about);
        set_logout = (TextView) view.findViewById(R.id.tv_logout);

        // change language
        set_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showChangeLanguage();
            }
        });



        return view;
    }

    private void showChangeLanguage() {

        String[] listitem = {"English", "العربيه"};

        AlertDialog.Builder builder = new AlertDialog.Builder(Objects.requireNonNull(this.getActivity()));
        builder.setTitle("Choose Language....");
        builder.setSingleChoiceItems(listitem, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if(i == 0){
                    // english
                    setLocal("en");
                    recreate();
                }

                else if(i == 1){
                    // arabic
                    setLocal("ar");
                    recreate();
                }

                dialogInterface.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private void setLocal(String lang) {

        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getContext().getResources().updateConfiguration(config, getContext().getResources().getDisplayMetrics());

        // saved data to shared Preferences
        SharedPreferences.Editor editor =this.getActivity().getSharedPreferences("setting", MODE_PRIVATE).edit();

        editor.putString("My_Lang", lang);
        editor.apply();

    }
    // load language saved in SharedPreferences
    public void loadLocale(){

        SharedPreferences pref =this.getActivity().getSharedPreferences("setting", MODE_PRIVATE);
        String language = pref.getString("My_Lang", "");
        setLocal(language);

    }
}
