package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.pro.t;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.analytics.process.a;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private Context mContext;
    private FileLockUtil mFileLock = new FileLockUtil();
    private InsertEventCallback ekvCallBack = new InsertEventCallback();

    /* JADX INFO: compiled from: obf */
    public class InsertEventCallback implements FileLockCallback {
        private InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = com.umeng.analytics.process.a.c;
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(com.umeng.analytics.process.a.d, ""), (JSONArray) obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public class ProcessToMainCallback implements FileLockCallback {
        private ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = com.umeng.analytics.process.a.c;
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(com.umeng.analytics.process.a.d, ""));
            return true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public class a implements Serializable {
        int a;
        String b;
        String c;
        String d;
        int e;
        String f;
        String g;
        String h;

        private a() {
        }
    }

    private UMProcessDBHelper() {
    }

    private List<a> datasAdapter(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    a aVar = new a();
                    aVar.c = jSONObject.optString("id");
                    aVar.g = UMUtils.getAppVersionName(this.mContext);
                    aVar.h = UMUtils.getAppVersionCode(this.mContext);
                    aVar.b = jSONObject.optString("__i");
                    aVar.e = jSONObject.optInt("__t");
                    aVar.f = str;
                    if (jSONObject.has("ds")) {
                        jSONObject.remove("ds");
                    }
                    jSONObject.put("ds", getDataSource());
                    jSONObject.remove("__i");
                    jSONObject.remove("__t");
                    aVar.d = com.umeng.common.a.a().a(jSONObject.toString());
                    jSONObject.remove("ds");
                    arrayList.add(aVar);
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(b.b(this.mContext, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private int getDataSource() {
        return 0;
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new UMProcessDBHelper(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    private boolean insertEvents_(String str, List<a> list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = c.a(this.mContext).a(str);
            try {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (a aVar : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", aVar.b);
                            contentValues.put("__e", aVar.c);
                            contentValues.put("__t", Integer.valueOf(aVar.e));
                            contentValues.put(a.InterfaceC0040a.f, aVar.f);
                            contentValues.put("__av", aVar.g);
                            contentValues.put("__vc", aVar.h);
                            contentValues.put("__s", aVar.d);
                            sQLiteDatabaseA.insert(a.InterfaceC0040a.a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    c.a(this.mContext).b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    c.a(this.mContext).b(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                c.a(this.mContext).b(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean processIsService(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processToMain(String str) throws Throwable {
        if (dbIsExists(str)) {
            List<a> eventByProcess = readEventByProcess(str);
            if (!eventByProcess.isEmpty() && insertEvents_(com.umeng.analytics.process.a.h, eventByProcess)) {
                deleteEventDatas(str, null, eventByProcess);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[Catch: Exception -> 0x00c2, TRY_LEAVE, TryCatch #7 {Exception -> 0x00c2, blocks: (B:33:0x00ba, B:35:0x00bf), top: B:47:0x00ba }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private List<a> readEventByProcess(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        ArrayList arrayList = new ArrayList();
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        try {
            try {
                try {
                    sQLiteDatabaseA = c.a(this.mContext).a(str);
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        Cursor cursorQuery = sQLiteDatabaseA.query(a.InterfaceC0040a.a, null, null, null, null, null, null);
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                try {
                                    a aVar = new a();
                                    aVar.a = cursorQuery.getInt(0);
                                    aVar.b = cursorQuery.getString(cursorQuery.getColumnIndex("__i"));
                                    aVar.c = cursorQuery.getString(cursorQuery.getColumnIndex("__e"));
                                    aVar.d = cursorQuery.getString(cursorQuery.getColumnIndex("__s"));
                                    aVar.e = cursorQuery.getInt(cursorQuery.getColumnIndex("__t"));
                                    aVar.f = cursorQuery.getString(cursorQuery.getColumnIndex(a.InterfaceC0040a.f));
                                    aVar.g = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                                    aVar.h = cursorQuery.getString(cursorQuery.getColumnIndex("__vc"));
                                    arrayList.add(aVar);
                                } catch (Exception e) {
                                    e = e;
                                    r2 = cursorQuery;
                                    e.printStackTrace();
                                    if (r2 != 0) {
                                        r2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                    }
                                    c.a(this.mContext).b(str);
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = cursorQuery;
                                    if (r2 != 0) {
                                        try {
                                            r2.close();
                                            if (sQLiteDatabaseA != null) {
                                                sQLiteDatabaseA.endTransaction();
                                            }
                                        } catch (Exception unused) {
                                            c.a(this.mContext).b(str);
                                            throw th;
                                        }
                                    } else if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                    c.a(this.mContext).b(str);
                                    throw th;
                                }
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                sQLiteDatabaseA = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabaseA = null;
            }
            sQLiteDatabaseA.endTransaction();
        } catch (Exception unused2) {
        }
        c.a(this.mContext).b(str);
        return arrayList;
    }

    public void createDBByProcess(String str) {
        try {
            c.a(this.mContext).a(str);
            c.a(this.mContext).b(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEventDatas(String str, String str2, List<a> list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c.a(this.mContext).a(str);
            try {
                sQLiteDatabaseA.beginTransaction();
                int size = list.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        sQLiteDatabaseA.delete(a.InterfaceC0040a.a, "rowid=?", new String[]{String.valueOf(list.get(i).a)});
                    }
                } else {
                    sQLiteDatabaseA.delete(a.InterfaceC0040a.a, null, null);
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Exception unused) {
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteDatabaseA != null) {
                    sQLiteDatabaseA.endTransaction();
                }
                c.a(this.mContext).b(str);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            sQLiteDatabaseA = null;
            th = th3;
        }
        c.a(this.mContext).b(str);
    }

    public void deleteMainProcessEventDatasByIds(List<Integer> list) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = c.a(this.mContext).a(com.umeng.analytics.process.a.h);
            sQLiteDatabaseA.beginTransaction();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabaseA.delete(a.InterfaceC0040a.a, "id=?", new String[]{String.valueOf(it.next())});
            }
            sQLiteDatabaseA.setTransactionSuccessful();
        } catch (Exception unused) {
            if (sQLiteDatabaseA != null) {
            }
            c.a(this.mContext).b(com.umeng.analytics.process.a.h);
        } catch (Throwable th) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.endTransaction();
            }
            c.a(this.mContext).b(com.umeng.analytics.process.a.h);
            throw th;
        }
        sQLiteDatabaseA.endTransaction();
        c.a(this.mContext).b(com.umeng.analytics.process.a.h);
    }

    public void insertEvents(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(b.b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(b.a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.a
                public void a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public JSONObject readMainEvents(long j, List<Integer> list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursor;
        JSONObject jSONObject = new JSONObject();
        Cursor cursorQuery = null;
        cursorQuery = null;
        cursorQuery = null;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseA = c.a(this.mContext).a(com.umeng.analytics.process.a.h);
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorQuery = sQLiteDatabaseA.query(a.InterfaceC0040a.a, null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        String str = "";
                        while (cursorQuery.moveToNext()) {
                            int i = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("__t"));
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("__i"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("__s"));
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(a.InterfaceC0040a.f));
                            String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                            if (!TextUtils.isEmpty(string)) {
                                if (TextUtils.isEmpty(str)) {
                                    str = string4;
                                }
                                if (!TextUtils.isEmpty(string2) && i2 == 2049) {
                                    JSONObject jSONObject3 = new JSONObject(com.umeng.common.a.a().b(string2));
                                    String strOptString = jSONObject3.optString("pn");
                                    if (TextUtils.isEmpty(strOptString) || "unknown".equals(strOptString)) {
                                        jSONObject3.put("pn", this.mContext.getPackageName() + ":" + string3);
                                    }
                                    JSONArray jSONArrayOptJSONArray = jSONObject2.has(string) ? jSONObject2.optJSONArray(string) : new JSONArray();
                                    if (t.a(jSONObject3) + t.a(jSONArrayOptJSONArray) > j || !str.equalsIgnoreCase(string4)) {
                                        break;
                                        break;
                                    }
                                    list.add(Integer.valueOf(i));
                                    jSONArrayOptJSONArray.put(jSONObject3);
                                    jSONObject2.put(string, jSONArrayOptJSONArray);
                                }
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                JSONObject jSONObject4 = new JSONObject();
                                String next = itKeys.next();
                                jSONObject4.put(next, new JSONArray(jSONObject2.optString(next)));
                                if (jSONObject4.length() > 0) {
                                    jSONArray.put(jSONObject4);
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("ekv", jSONArray);
                            }
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabaseA.endTransaction();
                } catch (Exception unused) {
                    cursor = cursorQuery;
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建子进程事件数据异常，清除数据库数据。");
                        sQLiteDatabase.execSQL("delete from __et_p");
                        sQLiteDatabase.setTransactionSuccessful();
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabaseA = sQLiteDatabase;
                        cursorQuery = cursor;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseA != null) {
                            try {
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA != null) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                    throw th;
                }
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseA = null;
        }
        c.a(this.mContext).b(com.umeng.analytics.process.a.h);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #1 {Exception -> 0x008d, blocks: (B:36:0x0085, B:38:0x008a), top: B:52:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #7 {Exception -> 0x00a2, blocks: (B:42:0x009a, B:44:0x009f), top: B:59:0x009a }] */
    public JSONObject readVersionInfoFromColumId(Integer num) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        cursor = null;
        try {
            sQLiteDatabaseA = c.a(this.mContext).a(com.umeng.analytics.process.a.h);
            try {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorQuery = sQLiteDatabaseA.query(a.InterfaceC0040a.a, null, "rowid=?", new String[]{String.valueOf(num)}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            try {
                                if (cursorQuery.moveToNext()) {
                                    jSONObject = new JSONObject();
                                    try {
                                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("__vc"));
                                        if (!TextUtils.isEmpty(string)) {
                                            jSONObject.put("__av", string);
                                        }
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject.put("__vc", string2);
                                        }
                                        jSONObject2 = jSONObject;
                                    } catch (Exception e) {
                                        e = e;
                                        cursor = cursorQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                                if (sQLiteDatabaseA != null) {
                                                    sQLiteDatabaseA.endTransaction();
                                                }
                                            } catch (Exception unused) {
                                                c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                                                return jSONObject;
                                            }
                                        } else if (sQLiteDatabaseA != null) {
                                            sQLiteDatabaseA.endTransaction();
                                        }
                                        c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                                        return jSONObject;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                jSONObject = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                    if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                } catch (Exception unused2) {
                                    c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                                    throw th;
                                }
                            } else if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                            c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                            throw th;
                        }
                    }
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception unused3) {
                        }
                    }
                    sQLiteDatabaseA.endTransaction();
                    c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                    return jSONObject2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                jSONObject = null;
            }
        } catch (Exception e4) {
            e = e4;
            jSONObject = null;
            sQLiteDatabaseA = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseA = null;
        }
    }

    private UMProcessDBHelper(Context context) {
        com.umeng.common.a.a().a(context);
    }
}
