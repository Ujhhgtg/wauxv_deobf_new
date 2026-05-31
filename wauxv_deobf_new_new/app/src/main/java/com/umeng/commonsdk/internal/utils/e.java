package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: compiled from: obf */
    public enum a {
        check_su_binary(new String[]{"/system/xbin/which", "su"});

        String[] b;

        a(String[] strArr) {
            this.b = strArr;
        }
    }

    public ArrayList a(a aVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                Process processExec = Runtime.getRuntime().exec(aVar.b);
                new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return arrayList;
    }
}
