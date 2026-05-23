package com.umeng.analytics.pro;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.h;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public static final int a = 2049;
    public static final int b = 2050;
    private static final int c = 1000;
    private static Context d = null;
    private static String e = null;
    private static final String f = "umeng+";
    private static final String g = "ek__id";
    private static final String h = "ek_key";
    private List<String> i;
    private List<Integer> j;
    private String k;
    private List<String> l;

    /* JADX INFO: compiled from: obf */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* JADX INFO: compiled from: obf */
    public static class b {
        private static final l a = new l();

        private b() {
        }
    }

    public static l a(Context context) {
        l lVar = 2050 .a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            lVar.k();
        }
        return lVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.l.clear();
            this.j.clear();
        }
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, "ek__id");
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString("ek__id", null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, "ek__id", multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String strSubstring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strSubstring.length(); i++) {
                        char cCharAt = strSubstring.charAt(i);
                        if (!Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(d, "ek_key");
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(d, "ek_key", c("umeng+"));
                } else {
                    if ("umeng+".equals(d(multiProcessSP2))) {
                        return;
                    }
                    b(true, false);
                    a(true, false);
                    h();
                    i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.l.clear();
    }

    public boolean c() {
        return this.l.isEmpty();
    }

    public void d() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    String strC = x.a().c();
                    if (TextUtils.isEmpty(strC)) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                        j.a(d).b();
                        return;
                    }
                    String[] strArr = {"", "-1"};
                    for (int i = 0; i < 2; i++) {
                        sQLiteDatabaseA.execSQL("update __et set __i=\"" + strC + "\" where __i=\"" + strArr[i] + "\"");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    j.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
                k.a(d);
            } catch (Throwable unused4) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused5) {
        }
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0089 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r4 r6
      0x0089: PHI (r4v3 org.json.JSONObject) = (r4v2 org.json.JSONObject), (r4v5 org.json.JSONObject) binds: [B:28:0x0087, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r6v3 android.database.sqlite.SQLiteDatabase) = (r6v2 android.database.sqlite.SQLiteDatabase), (r6v4 android.database.sqlite.SQLiteDatabase) binds: [B:28:0x0087, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject f() {
        JSONObject jSONObject;
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.l.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = j.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a("ek_key".c.a, sQLiteDatabaseA, null, "__ii=? ", new String[]{this.l.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                cursor2 = cursorA;
                                try {
                                    k.a(d);
                                    return jSONObject;
                                } finally {
                                    if (true) {
                                        cursor2.close();
                                    }
                                    if (true) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    j.a(d).b();
                                }
                            } catch (Throwable unused3) {
                                cursor = cursorA;
                                if (true) {
                                    cursor.close();
                                }
                                if (true) {
                                }
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException unused4) {
                        jSONObject = jSONObject2;
                    } catch (Throwable unused5) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                if (cursorA != null) {
                    cursorA.close();
                }
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
                j.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException unused7) {
                jSONObject = null;
            } catch (Throwable unused8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused9) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        } catch (Throwable unused10) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0089 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r4 r6
      0x0089: PHI (r4v3 org.json.JSONObject) = (r4v2 org.json.JSONObject), (r4v5 org.json.JSONObject) binds: [B:28:0x0087, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r6v3 android.database.sqlite.SQLiteDatabase) = (r6v2 android.database.sqlite.SQLiteDatabase), (r6v4 android.database.sqlite.SQLiteDatabase) binds: [B:28:0x0087, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject g() {
        JSONObject jSONObject;
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.i.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = j.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a("ek_key".d.a, sQLiteDatabaseA, null, "__ii=? ", new String[]{this.i.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                cursor2 = cursorA;
                                try {
                                    k.a(d);
                                    return jSONObject;
                                } finally {
                                    if (true) {
                                        cursor2.close();
                                    }
                                    if (true) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    j.a(d).b();
                                }
                            } catch (Throwable unused3) {
                                cursor = cursorA;
                                if (true) {
                                    cursor.close();
                                }
                                if (true) {
                                }
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException unused4) {
                        jSONObject = jSONObject2;
                    } catch (Throwable unused5) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                if (cursorA != null) {
                    cursorA.close();
                }
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
                j.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException unused7) {
                jSONObject = null;
            } catch (Throwable unused8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused9) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        } catch (Throwable unused10) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        }
    }

    public void h() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (this.j.size() > 0) {
                        for (int i = 0; i < this.j.size(); i++) {
                            sQLiteDatabaseA.delete("ek_key".b.a, "rowid=?", new String[]{String.valueOf(this.j.get(i).intValue())});
                        }
                    }
                    this.j.clear();
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    j.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                k.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void i() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.execSQL("delete from __er");
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    j.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                k.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void j() {
        SQLiteDatabase sQLiteDatabaseA;
        if (!TextUtils.isEmpty(this.k)) {
            try {
                sQLiteDatabaseA = j.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.delete("ek_key".a.a, "__i=?", new String[]{this.k});
                    sQLiteDatabaseA.delete("ek_key".b.a, "__i=?", new String[]{this.k});
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (SQLiteDatabaseCorruptException unused) {
                    try {
                        k.a(d);
                        if (true) {
                        }
                        j.a(d).b();
                        this.k = null;
                    } catch (Throwable th) {
                        if (true) {
                            try {
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        j.a(d).b();
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (sQLiteDatabaseA != null) {
                    }
                    j.a(d).b();
                    this.k = null;
                }
            } catch (SQLiteDatabaseCorruptException unused4) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused5) {
                sQLiteDatabaseA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused6) {
            }
            j.a(d).b();
        }
        this.k = null;
    }

    private l() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.l = new ArrayList();
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC = "";
            String strC2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC = c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strC2);
            contentValues.put("__pp", strC);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert("ek_key".c.a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    private void c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorA;
        Cursor cursor = null;
        strD = null;
        strD = null;
        String strD = null;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ek_key".d.a.e);
            if (jSONObjectOptJSONObject != null) {
                sQLiteDatabase2 = sQLiteDatabase;
                cursorA = a("ek_key".d.a, sQLiteDatabase2, new String[]{"ek_key".d.a.e}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex("ek_key".d.a.e)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (true) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                sQLiteDatabase2 = sQLiteDatabase;
                cursorA = null;
            }
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArray = new JSONArray();
                if (!TextUtils.isEmpty(strD)) {
                    jSONArray = new JSONArray(strD);
                }
                jSONArray.put(jSONObjectOptJSONObject);
                String strC = c(jSONArray.toString());
                if (!TextUtils.isEmpty(strC)) {
                    sQLiteDatabase2.execSQL("update  __sd set __d=\"" + strC + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ek_key".d.a.d);
            if (jSONObjectOptJSONObject2 != null) {
                String strC2 = c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strC2)) {
                    sQLiteDatabase2.execSQL("update  __sd set __c=\"" + strC2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase2.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong("ek_key".d.a.g)) + "\" where __ii=\"" + str + "\"");
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (Throwable unused2) {
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.i.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (r2 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = j.a(d).a();
                try {
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                ContentValues contentValues = new ContentValues();
                                String strOptString = jSONObject.optString("__i");
                                if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                                    strOptString = x.a().b();
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = "-1";
                                    }
                                }
                                contentValues.put("__i", strOptString);
                                contentValues.put("__e", jSONObject.optString("id"));
                                contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                                contentValues.put("__av", UMUtils.getAppVersionName(d));
                                contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                                jSONObject.remove("__i");
                                jSONObject.remove("__t");
                                contentValues.put("__s", c(jSONObject.toString()));
                                sQLiteDatabaseA.insert("ek_key".b.a, null, contentValues);
                            } catch (Exception unused) {
                            }
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused2) {
                        sQLiteDatabase = sQLiteDatabaseA;
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        k.a(d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused4) {
                            }
                        }
                        j.a(d).b();
                    }
                }
            } catch (Throwable unused5) {
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
        } catch (Throwable unused7) {
        }
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e("MobclickRT", "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.database.Cursor] */
    private void b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseA = j.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        cursorA = a("ek_key".a.a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null);
                    } else {
                        try {
                            cursorA = a("ek_key".a.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                        } catch (SQLiteDatabaseCorruptException unused) {
                            jSONObject = cursor;
                            k.a(d);
                            if (false) {
                                jSONObject.close();
                            }
                            if (true) {
                            }
                            j.a(d).b();
                        } catch (Throwable unused2) {
                            jSONObject = cursor;
                            k.a(d);
                            if (false) {
                                jSONObject.close();
                            }
                            if (true) {
                            }
                            j.a(d).b();
                        }
                    }
                    cursor = cursorA;
                    if (cursor != null) {
                        JSONArray jSONArray = new JSONArray();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(cursor.getColumnIndex("__a"));
                            if (!TextUtils.isEmpty(string)) {
                                jSONArray.put(new JSONObject(d(string)));
                            }
                        }
                        if (jSONArray.length() > 0) {
                            jSONObject.put("ek__id".U, jSONArray);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                if (false) {
                    jSONObject.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                j.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            jSONObject = 0;
            sQLiteDatabaseA = null;
        } catch (Throwable unused7) {
            jSONObject = 0;
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused8) {
        }
        j.a(d).b();
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = j.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("__i", str);
                    String strC = c(str2);
                    if (!TextUtils.isEmpty(strC)) {
                        contentValues.put("__a", strC);
                        contentValues.put("__t", Integer.valueOf(i));
                        contentValues.put("__av", UMUtils.getAppVersionName(d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                        sQLiteDatabaseA.insert("ek_key".a.a, null, contentValues);
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        k.a(d);
                    } finally {
                        if (true) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        j.a(d).b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong("duration") > 0) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1 A[EXC_TOP_SPLITTER, PHI: r0 r1 r4
      0x00b1: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v12 java.lang.String), (r0v12 java.lang.String) binds: [B:40:0x00d8, B:47:0x00e8, B:27:0x00ac, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r1v6 android.database.Cursor) = 
      (r1v3 android.database.Cursor)
      (r1v4 android.database.Cursor)
      (r1v11 android.database.Cursor)
      (r1v11 android.database.Cursor)
     binds: [B:40:0x00d8, B:47:0x00e8, B:27:0x00ac, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r4v6 android.database.sqlite.SQLiteDatabase) = 
      (r4v3 android.database.sqlite.SQLiteDatabase)
      (r4v4 android.database.sqlite.SQLiteDatabase)
      (r4v7 android.database.sqlite.SQLiteDatabase)
      (r4v7 android.database.sqlite.SQLiteDatabase)
     binds: [B:40:0x00d8, B:47:0x00e8, B:27:0x00ac, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private String b(JSONObject jSONObject, boolean z) {
        Cursor cursorA;
        SQLiteDatabase sQLiteDatabaseA;
        String string = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        try {
                            cursorA = a("ek_key".c.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                            if (cursorA != null) {
                                try {
                                    JSONArray jSONArray = new JSONArray();
                                    while (cursorA.moveToNext()) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        String string2 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                        string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                        this.l.add(string);
                                        String string3 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                        String string4 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                        if (!TextUtils.isEmpty(string3)) {
                                            jSONObject2.put("ek__id".aA, new JSONObject(d(string3)));
                                        }
                                        if (!TextUtils.isEmpty(string4)) {
                                            jSONObject2.put("ek__id".aB, new JSONObject(d(string4)));
                                        }
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject2.put("id", string);
                                            jSONObject2.put("ek__id".p, string2);
                                            if (jSONObject2.length() > 0) {
                                                jSONArray.put(jSONObject2);
                                            }
                                            if (z) {
                                                break;
                                            }
                                        }
                                    }
                                    if (jSONArray.length() > 0) {
                                        jSONObject.put("ek__id".n, jSONArray);
                                    }
                                    sQLiteDatabaseA.setTransactionSuccessful();
                                    if (true) {
                                        cursorA.close();
                                    }
                                } catch (SQLiteDatabaseCorruptException unused) {
                                    k.a(d);
                                    if (true) {
                                        cursorA.close();
                                    }
                                    if (true) {
                                    }
                                    j.a(d).b();
                                    return string;
                                } catch (Throwable unused2) {
                                    k.a(d);
                                    if (true) {
                                        cursorA.close();
                                    }
                                    if (true) {
                                    }
                                    j.a(d).b();
                                    return string;
                                }
                            } else {
                                sQLiteDatabaseA.setTransactionSuccessful();
                                if (false) {
                                    cursorA.close();
                                }
                            }
                        } catch (SQLiteDatabaseCorruptException unused3) {
                            cursorA = null;
                            k.a(d);
                            if (false) {
                                cursorA.close();
                            }
                            if (true) {
                                sQLiteDatabaseA.endTransaction();
                            }
                            j.a(d).b();
                            return string;
                        } catch (Throwable unused4) {
                            cursorA = null;
                            k.a(d);
                            if (false) {
                                cursorA.close();
                            }
                            if (true) {
                                sQLiteDatabaseA.endTransaction();
                            }
                            j.a(d).b();
                            return string;
                        }
                    } catch (SQLiteDatabaseCorruptException unused5) {
                    } catch (Throwable unused6) {
                    }
                } catch (Throwable th) {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused7) {
                        }
                    }
                    j.a(d).b();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException unused8) {
                cursorA = null;
                sQLiteDatabaseA = null;
            } catch (Throwable unused9) {
                cursorA = null;
                sQLiteDatabaseA = null;
            }
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused10) {
        }
        j.a(d).b();
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r2 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, JSONObject jSONObject, a aVar) {
        if (jSONObject == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = j.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (aVar == 2049 .BEGIN) {
                        long jLongValue = ((Long) jSONObject.opt("__e")).longValue();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("__ii", str);
                        contentValues.put("__e", String.valueOf(jLongValue));
                        contentValues.put("__av", UMUtils.getAppVersionName(d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                        sQLiteDatabaseA.insert("ek_key".d.a, null, contentValues);
                    } else if (aVar == 2049 .INSTANTSESSIONBEGIN) {
                        b(str, jSONObject, sQLiteDatabaseA);
                    } else if (aVar == 2049 .END) {
                        a(str, jSONObject, sQLiteDatabaseA);
                    } else if (aVar == 2049 .PAGE) {
                        a(str, jSONObject, sQLiteDatabaseA, "__a");
                    } else if (aVar == 2049 .AUTOPAGE) {
                        a(str, jSONObject, sQLiteDatabaseA, "ek_key".d.a.c);
                    } else if (aVar == 2049 .NEWSESSION) {
                        c(str, jSONObject, sQLiteDatabaseA);
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        k.a(d);
                    } finally {
                        if (true) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        j.a(d).b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    public void b(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (z2) {
                        if (z) {
                            sQLiteDatabaseA.execSQL("delete from __sd");
                        }
                    } else if (this.i.size() > 0) {
                        for (int i = 0; i < this.i.size(); i++) {
                            sQLiteDatabaseA.delete("ek_key".d.a, "__ii=?", new String[]{this.i.get(i)});
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    j.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                k.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String strC;
        try {
            long jLongValue = ((Long) jSONObject.opt("ek_key".d.a.g)).longValue();
            Object objOpt = jSONObject.opt("ek_key".d.a.h);
            long jLongValue2 = (objOpt == null || !(objOpt instanceof Long)) ? 0L : ((Long) objOpt).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC2 = "";
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) {
                strC = "";
            } else {
                strC = c(jSONObjectOptJSONObject.toString());
            }
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC2 = c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", __g=\"" + jLongValue2 + "\", __sp=\"" + strC + "\", __pp=\"" + strC2 + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #3 {Exception -> 0x0058, blocks: (B:18:0x0050, B:20:0x0055), top: B:33:0x0050 }] */
    public long a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA = null;
        long j = 0;
        try {
            try {
                sQLiteDatabaseA = 0L.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a("ek_key".d.a, sQLiteDatabaseA, new String[]{"ek_key".d.a.g}, "__ii=? ", new String[]{str}, null, null, null, null);
                    if (cursorA != null) {
                        cursorA.moveToFirst();
                        j = cursorA.getLong(cursorA.getColumnIndex("ek_key".d.a.g));
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (Exception unused) {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    j.a(d).b();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    if (cursorA != null) {
                        try {
                            cursorA.close();
                            if (true) {
                                sQLiteDatabaseA.endTransaction();
                            }
                        } catch (Exception unused2) {
                            j.a(d).b();
                            throw th;
                        }
                    } else if (true) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    j.a(d).b();
                    throw th;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            sQLiteDatabaseA = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseA = null;
        }
        sQLiteDatabaseA.endTransaction();
        j.a(d).b();
        return j;
    }

    public void b(String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseA.delete("ek_key".c.a, "__ii=?", new String[]{str});
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    j.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                k.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[Catch: all -> 0x0062, LOOP:1: B:53:0x004f->B:23:0x0055, LOOP_END, TryCatch #1 {all -> 0x0062, blocks: (B:21:0x004f, B:23:0x0055, B:25:0x0065, B:27:0x0070, B:28:0x0075, B:35:0x0084, B:37:0x008a, B:39:0x0090, B:41:0x0096, B:43:0x00a4, B:40:0x0093), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:21:0x004f, B:23:0x0055, B:25:0x0065, B:27:0x0070, B:28:0x0075, B:35:0x0084, B:37:0x008a, B:39:0x0090, B:41:0x0096, B:43:0x00a4, B:40:0x0093), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #1 {all -> 0x0062, blocks: (B:21:0x004f, B:23:0x0055, B:25:0x0065, B:27:0x0070, B:28:0x0075, B:35:0x0084, B:37:0x008a, B:39:0x0090, B:41:0x0096, B:43:0x00a4, B:40:0x0093), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:21:0x004f, B:23:0x0055, B:25:0x0065, B:27:0x0070, B:28:0x0075, B:35:0x0084, B:37:0x008a, B:39:0x0090, B:41:0x0096, B:43:0x00a4, B:40:0x0093), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x004f A[EXC_TOP_SPLITTER, LOOP:1: B:53:0x004f->B:23:0x0055, LOOP_START, PHI: r12
      0x004f: PHI (r12v2 java.lang.String) = (r12v7 java.lang.String), (r12v3 java.lang.String) binds: [B:20:0x004d, B:23:0x0055] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00a4, please report this as an issue */
    @SuppressLint({"Range"})
    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) {
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray;
        Cursor cursorA;
        JSONArray jSONArray2;
        int i;
        String strC;
        JSONObject jSONObject2;
        Cursor cursor = null;
        strD = null;
        String strD = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                if ("ek_key".d.a.c.equals(str2)) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("ek_key".d.a.c);
                    if (jSONArrayOptJSONArray == null) {
                        return;
                    }
                    if (jSONArrayOptJSONArray.length() <= 0) {
                        return;
                    }
                } else {
                    jSONArray = null;
                }
                cursorA = a("ek_key".d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (true) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
                jSONArray2 = new JSONArray();
                if (!TextUtils.isEmpty(strD)) {
                    jSONArray2 = new JSONArray(strD);
                }
                if (jSONArray2.length() > 1000) {
                    if (cursorA != null) {
                        cursorA.close();
                        return;
                    }
                    return;
                }
                for (i = 0; i < jSONArray.length(); i++) {
                    try {
                        jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            jSONArray2.put(jSONObject2);
                        }
                    } catch (JSONException unused2) {
                    }
                }
                strC = c(jSONArray2.toString());
                if (!TextUtils.isEmpty(strC)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            }
            jSONArray = jSONArrayOptJSONArray;
            cursorA = a("ek_key".d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                }
            }
            jSONArray2 = new JSONArray();
            if (!TextUtils.isEmpty(strD)) {
                jSONArray2 = new JSONArray(strD);
            }
            if (jSONArray2.length() > 1000) {
                if (cursorA != null) {
                    cursorA.close();
                    return;
                }
                return;
            }
            while (i < jSONArray.length()) {
                jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    jSONArray2.put(jSONObject2);
                }
            }
            strC = c(jSONArray2.toString());
            if (!TextUtils.isEmpty(strC)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (Throwable unused3) {
        }
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, false);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
            return jSONObject;
        }
        String strA = a(jSONObject, true);
        if (!TextUtils.isEmpty(strA)) {
            b(jSONObject, strA);
            a(jSONObject, strA);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.database.Cursor] */
    private void a(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        l lVar;
        Cursor cursorA;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseA = j.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        cursorA = a("ek_key".b.a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null);
                        lVar = this;
                    } else {
                        lVar = this;
                        try {
                            cursorA = lVar.a("ek_key".b.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                        } catch (SQLiteDatabaseCorruptException unused) {
                            jSONObject = cursor;
                            k.a(d);
                            if (false) {
                                jSONObject.close();
                            }
                            if (true) {
                            }
                            j.a(d).b();
                        } catch (Throwable unused2) {
                            jSONObject = cursor;
                            k.a(d);
                            if (false) {
                                jSONObject.close();
                            }
                            if (true) {
                            }
                            j.a(d).b();
                        }
                    }
                    cursor = cursorA;
                    if (cursor != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        String strB = x.a().b();
                        while (cursor.moveToNext()) {
                            int i = cursor.getInt(cursor.getColumnIndex("__t"));
                            String string = cursor.getString(cursor.getColumnIndex("__i"));
                            String string2 = cursor.getString(cursor.getColumnIndex("__s"));
                            if (TextUtils.isEmpty(string) || "-1".equals(string)) {
                                if (!TextUtils.isEmpty(strB)) {
                                    string = strB;
                                }
                            }
                            lVar.j.add(Integer.valueOf(cursor.getInt(0)));
                            if (i != 2049) {
                                if (i == 2050 && !TextUtils.isEmpty(string2)) {
                                    JSONObject jSONObject4 = new JSONObject(d(string2));
                                    if (jSONObject3.has(string)) {
                                        jSONArray = jSONObject3.optJSONArray(string);
                                    } else {
                                        jSONArray = new JSONArray();
                                    }
                                    jSONArray.put(jSONObject4);
                                    jSONObject3.put(string, jSONArray);
                                }
                            } else if (!TextUtils.isEmpty(string2)) {
                                JSONObject jSONObject5 = new JSONObject(d(string2));
                                if (jSONObject2.has(string)) {
                                    jSONArray2 = jSONObject2.optJSONArray(string);
                                } else {
                                    jSONArray2 = new JSONArray();
                                }
                                jSONArray2.put(jSONObject5);
                                jSONObject2.put(string, jSONArray2);
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                JSONObject jSONObject6 = new JSONObject();
                                String next = itKeys.next();
                                jSONObject6.put(next, new JSONArray(jSONObject2.optString(next)));
                                if (jSONObject6.length() > 0) {
                                    jSONArray3.put(jSONObject6);
                                }
                            }
                            if (jSONArray3.length() > 0) {
                                jSONObject.put("ekv", jSONArray3);
                            }
                        }
                        if (jSONObject3.length() > 0) {
                            JSONArray jSONArray4 = new JSONArray();
                            Iterator<String> itKeys2 = jSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                JSONObject jSONObject7 = new JSONObject();
                                String next2 = itKeys2.next();
                                jSONObject7.put(next2, new JSONArray(jSONObject3.optString(next2)));
                                if (jSONObject7.length() > 0) {
                                    jSONArray4.put(jSONObject7);
                                }
                            }
                            if (jSONArray4.length() > 0) {
                                jSONObject.put("ek__id".Z, jSONArray4);
                            }
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                if (false) {
                    jSONObject.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                j.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            jSONObject = 0;
            sQLiteDatabaseA = null;
        } catch (Throwable unused7) {
            jSONObject = 0;
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused8) {
        }
        j.a(d).b();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0250  */
    /* JADX WARN: Code duplicated, block: B:131:0x0213 A[EXC_TOP_SPLITTER, PHI: r0 r6 r16
      0x0213: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v39 java.lang.String), (r0v39 java.lang.String) binds: [B:97:0x0244, B:104:0x0253, B:84:0x020e, B:85:0x0210] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r6v6 android.database.Cursor) = 
      (r6v3 android.database.Cursor)
      (r6v4 android.database.Cursor)
      (r6v36 android.database.Cursor)
      (r6v36 android.database.Cursor)
     binds: [B:97:0x0244, B:104:0x0253, B:84:0x020e, B:85:0x0210] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r16v6 android.database.sqlite.SQLiteDatabase) = 
      (r16v3 android.database.sqlite.SQLiteDatabase)
      (r16v4 android.database.sqlite.SQLiteDatabase)
      (r16v28 android.database.sqlite.SQLiteDatabase)
      (r16v28 android.database.sqlite.SQLiteDatabase)
     binds: [B:97:0x0244, B:104:0x0253, B:84:0x020e, B:85:0x0210] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    private String a(JSONObject jSONObject, boolean z) {
        Cursor cursorA;
        SQLiteDatabase sQLiteDatabaseA;
        String str;
        String string = null;
        try {
            try {
                sQLiteDatabaseA = j.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    try {
                        cursorA = a("ek_key".d.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                        if (cursorA != null) {
                            try {
                                JSONArray jSONArray = new JSONArray();
                                while (true) {
                                    if (!cursorA.moveToNext()) {
                                        cursorA = cursorA;
                                        sQLiteDatabaseA = sQLiteDatabaseA;
                                        break;
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    String string2 = cursorA.getString(cursorA.getColumnIndex("ek_key".d.a.g));
                                    String string3 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                    String string4 = cursorA.getString(cursorA.getColumnIndex("ek_key".d.a.h));
                                    string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                    try {
                                        if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                                            str = string;
                                            cursorA = cursorA;
                                            sQLiteDatabaseA = sQLiteDatabaseA;
                                        } else {
                                            if (Long.parseLong(string2) - Long.parseLong(string3) > 0) {
                                                String string5 = cursorA.getString(cursorA.getColumnIndex("__a"));
                                                String string6 = cursorA.getString(cursorA.getColumnIndex("ek_key".d.a.c));
                                                String string7 = cursorA.getString(cursorA.getColumnIndex("ek_key".d.a.d));
                                                String string8 = cursorA.getString(cursorA.getColumnIndex("ek_key".d.a.e));
                                                this.i.add(string);
                                                String string9 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                                String string10 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                                jSONObject2.put("id", string);
                                                jSONObject2.put("ek__id".p, string3);
                                                jSONObject2.put("ek__id".q, string2);
                                                str = string;
                                                if (!FieldManager.allow("header_foreground_count")) {
                                                    jSONObject2.put("duration", Long.parseLong(string2) - Long.parseLong(string3));
                                                } else {
                                                    try {
                                                        if (Long.parseLong(string4) <= 0) {
                                                            jSONObject2.put("duration", Long.parseLong(string2) - Long.parseLong(string3));
                                                        } else {
                                                            jSONObject2.put("duration", Long.parseLong(string4));
                                                            jSONObject2.put("ek__id".s, Long.parseLong(string2) - Long.parseLong(string3));
                                                        }
                                                    } catch (SQLiteDatabaseCorruptException unused) {
                                                        cursorA = cursorA;
                                                        sQLiteDatabaseA = sQLiteDatabaseA;
                                                        string = str;
                                                        k.a(d);
                                                        if (true) {
                                                            cursorA.close();
                                                        }
                                                        if (true) {
                                                            sQLiteDatabaseA.endTransaction();
                                                        }
                                                        j.a(d).b();
                                                        return string;
                                                    } catch (Throwable unused2) {
                                                        cursorA = cursorA;
                                                        sQLiteDatabaseA = sQLiteDatabaseA;
                                                        string = str;
                                                        k.a(d);
                                                        if (true) {
                                                            cursorA.close();
                                                        }
                                                        if (true) {
                                                            sQLiteDatabaseA.endTransaction();
                                                        }
                                                        j.a(d).b();
                                                        return string;
                                                    }
                                                }
                                                try {
                                                    if (!TextUtils.isEmpty(string5)) {
                                                        jSONObject2.put("ek__id".t, new JSONArray(d(string5)));
                                                    }
                                                    boolean z2 = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO;
                                                    if (!TextUtils.isEmpty(string6) && z2) {
                                                        JSONArray jSONArray2 = new JSONArray(d(string6));
                                                        JSONArray jSONArray3 = new JSONArray();
                                                        if (jSONArray2.length() > 0) {
                                                            jSONArray3 = b(jSONArray2);
                                                        }
                                                        jSONObject2.put("ek__id".u, jSONArray3);
                                                    }
                                                    if (!TextUtils.isEmpty(string7)) {
                                                        jSONObject2.put("ek__id".F, new JSONObject(d(string7)));
                                                    }
                                                    if (!TextUtils.isEmpty(string8)) {
                                                        jSONObject2.put("ek__id".B, new JSONArray(d(string8)));
                                                    }
                                                    if (!TextUtils.isEmpty(string9)) {
                                                        jSONObject2.put("ek__id".aA, new JSONObject(d(string9)));
                                                    }
                                                    if (!TextUtils.isEmpty(string10)) {
                                                        jSONObject2.put("ek__id".aB, new JSONObject(d(string10)));
                                                    }
                                                    if (jSONObject2.length() > 0) {
                                                        jSONArray.put(jSONObject2);
                                                    }
                                                } catch (SQLiteDatabaseCorruptException unused3) {
                                                    string = str;
                                                    k.a(d);
                                                    if (true) {
                                                        cursorA.close();
                                                    }
                                                    if (true) {
                                                    }
                                                    j.a(d).b();
                                                    return string;
                                                } catch (Throwable unused4) {
                                                    string = str;
                                                    k.a(d);
                                                    if (true) {
                                                        cursorA.close();
                                                    }
                                                    if (true) {
                                                    }
                                                    j.a(d).b();
                                                    return string;
                                                }
                                            } else {
                                                str = string;
                                                cursorA = cursorA;
                                                sQLiteDatabaseA = sQLiteDatabaseA;
                                            }
                                            if (z) {
                                                string = str;
                                                break;
                                            }
                                        }
                                        cursorA = cursorA;
                                        sQLiteDatabaseA = sQLiteDatabaseA;
                                        string = str;
                                    } catch (SQLiteDatabaseCorruptException unused5) {
                                        cursorA = cursorA;
                                        sQLiteDatabaseA = sQLiteDatabaseA;
                                        k.a(d);
                                        if (true) {
                                            cursorA.close();
                                        }
                                        if (true) {
                                            sQLiteDatabaseA.endTransaction();
                                        }
                                        j.a(d).b();
                                        return string;
                                    } catch (Throwable unused6) {
                                        cursorA = cursorA;
                                        sQLiteDatabaseA = sQLiteDatabaseA;
                                        k.a(d);
                                        if (true) {
                                            cursorA.close();
                                        }
                                        if (true) {
                                            sQLiteDatabaseA.endTransaction();
                                        }
                                        j.a(d).b();
                                        return string;
                                    }
                                }
                                try {
                                    if (this.i.size() < 1) {
                                        cursorA.close();
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused7) {
                                        }
                                        j.a(d).b();
                                        return string;
                                    }
                                    if (jSONArray.length() > 0) {
                                        jSONObject.put("ek__id".n, jSONArray);
                                    }
                                } catch (SQLiteDatabaseCorruptException unused8) {
                                    k.a(d);
                                    if (true) {
                                        cursorA.close();
                                    }
                                    if (true) {
                                    }
                                    j.a(d).b();
                                    return string;
                                } catch (Throwable unused9) {
                                    k.a(d);
                                    if (true) {
                                        cursorA.close();
                                    }
                                    if (true) {
                                    }
                                    j.a(d).b();
                                    return string;
                                }
                            } catch (SQLiteDatabaseCorruptException unused10) {
                            } catch (Throwable unused11) {
                            }
                        } else {
                            cursorA = cursorA;
                            sQLiteDatabaseA = sQLiteDatabaseA;
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                    } catch (SQLiteDatabaseCorruptException unused12) {
                        sQLiteDatabaseA = sQLiteDatabaseA;
                        cursorA = null;
                        k.a(d);
                        if (false) {
                            cursorA.close();
                        }
                        if (true) {
                            sQLiteDatabaseA.endTransaction();
                        }
                        j.a(d).b();
                        return string;
                    } catch (Throwable unused13) {
                        sQLiteDatabaseA = sQLiteDatabaseA;
                        cursorA = null;
                        k.a(d);
                        if (false) {
                            cursorA.close();
                        }
                        if (true) {
                            sQLiteDatabaseA.endTransaction();
                        }
                        j.a(d).b();
                        return string;
                    }
                } catch (SQLiteDatabaseCorruptException unused14) {
                } catch (Throwable unused15) {
                }
            } catch (Throwable th) {
                if (cursorA != null) {
                    cursorA.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused16) {
                    }
                }
                j.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused17) {
            cursorA = null;
            sQLiteDatabaseA = null;
        } catch (Throwable unused18) {
            cursorA = null;
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused19) {
        }
        j.a(d).b();
        return string;
    }

    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!z2) {
                        int size = this.l.size();
                        int i = 0;
                        if (size > 0) {
                            int i2 = 0;
                            while (i < size) {
                                String str = this.l.get(i);
                                if (str == null) {
                                    i2 = 1;
                                }
                                sQLiteDatabaseA.delete("ek_key".c.a, "__ii=?", new String[]{str});
                                i++;
                            }
                            i = i2;
                        }
                        if (i != 0) {
                            sQLiteDatabaseA.execSQL("delete from __is where __ii is null");
                        }
                    } else if (z) {
                        sQLiteDatabaseA.execSQL("delete from __is");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable th) {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    j.a(d).b();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                k.a(d);
                if (sQLiteDatabaseA != null) {
                }
                j.a(d).b();
            } catch (Throwable unused3) {
                k.a(d);
                if (sQLiteDatabaseA != null) {
                }
                j.a(d).b();
            }
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused4) {
        }
        j.a(d).b();
    }

    public void a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = j.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseA.delete("ek_key".a.a, "__i=?", new String[]{str});
                        sQLiteDatabaseA.delete("ek_key".b.a, "__i=?", new String[]{str});
                        this.j.clear();
                        sQLiteDatabaseA.delete("ek_key".d.a, "__ii=?", new String[]{str});
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    j.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                k.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }
}
