package org.repackage.com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.cl;

/* JADX INFO: loaded from: classes.dex */
class b {
    private static volatile b e = null;
    private static boolean f = false;
    private BroadcastReceiver h;
    OpenId a = new OpenId("udid");
    OpenId b = new OpenId("oaid");
    OpenId d = new OpenId("vaid");
    OpenId c = new OpenId("aaid");
    private SupportInfo g = new SupportInfo();

    private b() {
    }

    private String b(Context context, OpenId openId) throws Throwable {
        Exception exc;
        String str;
        Throwable th;
        String str2;
        String strValueOf;
        a("queryId : " + openId.c);
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{openId.c}, null);
                try {
                    if (cursorQuery != null) {
                        ValueData valueDataA = a(cursorQuery);
                        str3 = valueDataA.a;
                        openId.a(str3);
                        openId.a(valueDataA.c);
                        openId.a(valueDataA.b);
                        a(openId.c + " errorCode : " + openId.d);
                        if (valueDataA.b != 1000) {
                            b(context);
                            if (!a(context, false)) {
                                str2 = "not support, forceQuery isSupported: ";
                                strValueOf = String.valueOf(a(context, true));
                                a(str2.concat(strValueOf));
                            }
                        }
                    } else if (a(context, false)) {
                        str2 = "forceQuery isSupported : ";
                        strValueOf = String.valueOf(a(context, true));
                        a(str2.concat(strValueOf));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return str3;
                } catch (Exception e2) {
                    exc = e2;
                    str = str3;
                    cursor = cursorQuery;
                    a("queryId, Exception : " + exc.getMessage());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            exc = e3;
            str = null;
        }
    }

    public final String a(Context context, OpenId openId) {
        String str;
        if (openId == null) {
            str = "getId, openId = null.";
        } else {
            if (openId.a()) {
                return openId.b;
            }
            if (a(context, true)) {
                return b(context, openId);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    private static String a(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    private static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            a("getAppVersion, Exception : " + e2.getMessage());
            return null;
        }
    }

    private static ValueData a(Cursor cursor) {
        ValueData valueData = new ValueData(null, 0);
        if (cursor == null) {
            a("parseValue fail, cursor is null.");
            return valueData;
        }
        if (cursor.isClosed()) {
            a("parseValue fail, cursor is closed.");
            return valueData;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            valueData.a = cursor.getString(columnIndex);
        } else {
            a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex(cl.g);
        if (columnIndex2 >= 0) {
            valueData.b = cursor.getInt(columnIndex2);
        } else {
            a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            valueData.c = cursor.getLong(columnIndex3);
            return valueData;
        }
        a("parseExpired fail, index < 0.");
        return valueData;
    }

    private synchronized void b(Context context) {
        if (this.h != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        a aVar = new a();
        this.h = aVar;
        context.registerReceiver(aVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    public static final b a() {
        if (e == null) {
            synchronized (b.class) {
                try {
                    if (e == null) {
                        e = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static void a(String str) {
        if (f) {
            Log.d("OpenIdManager", str);
        }
    }

    public static void a(boolean z) {
        f = z;
    }

    private static boolean a(Context context) {
        a("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
                ValueData valueDataA = a(cursorQuery);
                boolean z = 1000 != valueDataA.b || "0".equals(valueDataA.a);
                cursorQuery.close();
                return z;
            } catch (Exception e2) {
                a("querySupport, Exception : " + e2.getMessage());
                if (cursorQuery != null) {
                }
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    public final boolean a(Context context, boolean z) {
        if (this.g.a() && !z) {
            return this.g.b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String strA = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String strB = b(packageManager, strA);
        if (this.g.a() && this.g.a(strB)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(strB)));
            return this.g.b();
        }
        this.g.b(strB);
        boolean zA = a(context);
        a("query support, result : ".concat(String.valueOf(zA)));
        this.g.a(zA);
        return zA;
    }
}
