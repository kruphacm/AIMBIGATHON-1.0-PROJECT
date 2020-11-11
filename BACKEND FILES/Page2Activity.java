/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Random
 */
package com.my.newproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.my.newproject.Page3Activity;
import com.my.newproject.R;
import java.util.ArrayList;
import java.util.Random;

public class Page2Activity
extends Activity {
    private Button button4;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private CheckBox checkbox9;
    private EditText edittext1;
    private Intent i = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear9;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout)this.findViewById(R.id.linear1);
        this.linear2 = (LinearLayout)this.findViewById(R.id.linear2);
        this.linear9 = (LinearLayout)this.findViewById(R.id.linear9);
        this.button4 = (Button)this.findViewById(R.id.button4);
        this.textview1 = (TextView)this.findViewById(R.id.textview1);
        this.edittext1 = (EditText)this.findViewById(R.id.edittext1);
        this.textview2 = (TextView)this.findViewById(R.id.textview2);
        this.linear3 = (LinearLayout)this.findViewById(R.id.linear3);
        this.checkbox2 = (CheckBox)this.findViewById(R.id.checkbox2);
        this.checkbox3 = (CheckBox)this.findViewById(R.id.checkbox3);
        this.checkbox4 = (CheckBox)this.findViewById(R.id.checkbox4);
        this.textview3 = (TextView)this.findViewById(R.id.textview3);
        this.checkbox5 = (CheckBox)this.findViewById(R.id.checkbox5);
        this.checkbox9 = (CheckBox)this.findViewById(R.id.checkbox9);
        this.button4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Page2Activity.this.i.setClass(Page2Activity.this.getApplicationContext(), Page3Activity.class);
                Page2Activity.this.startActivity(Page2Activity.this.i);
            }
        });
        this.edittext1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
            }
        });
        this.edittext1.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
            }

            public void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
                charSequence.toString();
            }
        });
        this.checkbox2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
            }
        });
    }

    private void initializeLogic() {
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = listView.getCheckedItemPositions();
        int n = 0;
        while (n < sparseBooleanArray.size()) {
            if (sparseBooleanArray.valueAt(n)) {
                arrayList.add((Object)sparseBooleanArray.keyAt(n));
            }
            ++n;
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int n) {
        return TypedValue.applyDimension((int)1, (float)n, (DisplayMetrics)this.getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return this.getResources().getDisplayMetrics().heightPixels;
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return this.getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[1];
    }

    @Deprecated
    public int getRandom(int n, int n2) {
        return n + new Random().nextInt(1 + (n2 - n));
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.page2);
        this.initialize(bundle);
        this.initializeLogic();
    }

    @Deprecated
    public void showMessage(String string2) {
        Toast.makeText((Context)this.getApplicationContext(), (CharSequence)string2, (int)0).show();
    }

}

