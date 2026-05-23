package org.repackage.com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DataBaseOperation {
    private static final String a = "VMS_SDK_DB";
    private static final String b = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String c = "content://com.vivo.abe.exidentifier/guid";
    private static final String d = "value";
    private static final String e = "OAID";
    private static final String f = "AAID";
    private static final String g = "VAID";
    private static final String h = "OAIDBLACK";
    private static final String i = "OAIDSTATUS";
    private static final String j = "STATISTICS";
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;
    private static final int q = 6;
    private static final int r = 7;
    private static final String s = "UDID";
    private Context t;

    public DataBaseOperation(Context context) {
        this.t = context;
    }

    public boolean a(int i2, String str, ContentValues[] contentValuesArr) {
        Uri uri;
        if (i2 == 6) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        } else if (i2 != 7) {
            uri = null;
        } else {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_" + str);
        }
        if (uri == null) {
            return false;
        }
        try {
            int iBulkInsert = this.t.getContentResolver().bulkInsert(uri, contentValuesArr);
            Log.d("VMS_SDK_DB", "insert:" + iBulkInsert);
            return iBulkInsert != 0;
        } catch (Exception unused) {
            Log.e("VMS_SDK_DB", "return insert is error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[Catch: all -> 0x0089, Exception -> 0x009c, TRY_ENTER, TryCatch #0 {Exception -> 0x009c, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x008d), top: B:46:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: all -> 0x0089, Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x008d), top: B:46:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d A[Catch: all -> 0x0089, Exception -> 0x009c, TRY_LEAVE, TryCatch #0 {Exception -> 0x009c, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x008d), top: B:46:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.database.Cursor] */
    public String a(int i2, String str) throws Throwable {
        Uri uri;
        Uri uri2;
        ?? Query;
        Throwable th;
        ?? r1 = 0;
        string = null;
        string = null;
        string = null;
        String string = null;
        try {
            if (i2 == 0) {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
            } else if (i2 == 1) {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
            } else if (i2 == 2) {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
            } else if (i2 == 3) {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/UDID");
            } else if (i2 != 4) {
                if (i2 != 5) {
                    uri2 = null;
                    Query = i2;
                } else {
                    uri = Uri.parse("content://com.vivo.abe.exidentifier/guid");
                }
                if (uri2 == null) {
                    return null;
                }
                try {
                    Query = this.t.getContentResolver().query(uri2, null, null, null, null);
                    try {
                        if (Query != 0) {
                            Log.d("VMS_SDK_DB", "return cursor is null,return");
                        } else if (Query.moveToNext()) {
                            string = Query.getString(Query.getColumnIndex("value"));
                        }
                        if (Query != 0) {
                            Query.close();
                        }
                        return string;
                    } catch (Exception unused) {
                        Log.e("VMS_SDK_DB", "return cursor is error");
                        if (Query != 0) {
                            Query.close();
                        }
                        return string;
                    }
                } catch (Exception unused2) {
                    Query = 0;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_" + str);
            }
            if (uri2 == null) {
                return null;
            }
            Query = this.t.getContentResolver().query(uri2, null, null, null, null);
            if (Query != 0) {
                Log.d("VMS_SDK_DB", "return cursor is null,return");
            } else if (Query.moveToNext()) {
                string = Query.getString(Query.getColumnIndex("value"));
            }
            if (Query != 0) {
                Query.close();
            }
            return string;
        } catch (Throwable th3) {
            th = th3;
            r1 = Query;
        }
        uri2 = uri;
        Query = uri;
        if (r1 != 0) {
            r1.close();
            throw th;
        }
        throw th;
    }

    public boolean a(int i2, String str, String str2, String str3) {
        Uri uri;
        if (i2 != 6) {
            uri = null;
        } else {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        }
        if (uri == null) {
            return false;
        }
        try {
            int iDelete = this.t.getContentResolver().delete(uri, "packageName=? and uid=?", new String[]{str2, str3});
            Log.d("VMS_SDK_DB", "delete:" + iDelete);
            return iDelete != 0;
        } catch (Exception unused) {
            Log.e("VMS_SDK_DB", "return delete is error");
        }
    }
}
