package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static String[] a = {"com.bly.dkplat", "com.by.chaos", "com.lbe.parallel", "com.excelliance.dualaid", "com.excelliance.multiaccounts", "com.lody.virtual", "com.qihoo.magic"};

    public static String a(Context context) {
        try {
            String str = "";
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getAndroidId", Context.class);
            if (false) {
                return "";
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
            return (objInvoke == null || !(objInvoke instanceof String)) ? "" : (String) objInvoke;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        SharedPreferences sharedPreferencesA;
        if (context == null || (sharedPreferencesA = a.a(context)) == null) {
            return "";
        }
        String string = sharedPreferencesA.getString("inputDomain", "");
        return c(string) ? a(string) : string;
    }

    public static String c(Context context) {
        SharedPreferences sharedPreferencesA;
        return (context == null || (sharedPreferencesA = a.a(context)) == null) ? "" : sharedPreferencesA.getString("uabc", "");
    }

    public static String d(Context context) {
        SharedPreferences sharedPreferencesA;
        if (context == null || (sharedPreferencesA = a.a(context)) == null) {
            return null;
        }
        return sharedPreferencesA.getString("aaid", null);
    }

    public static String e(Context context) {
        try {
            String str = "";
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getMac", Context.class);
            if (false) {
                return "";
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
            return (objInvoke == null || !(objInvoke instanceof String)) ? "" : (String) objInvoke;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f(Context context) {
        try {
            String str = "";
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getOaid", Context.class);
            if (false) {
                return "";
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
            return (objInvoke == null || !(objInvoke instanceof String)) ? "" : (String) objInvoke;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean g(Context context) {
        try {
            String path = context.getFilesDir().getPath();
            for (String str : a) {
                if (path.contains(str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean h(Context context) {
        try {
            String str = "";
            Method declaredMethod = UMUtils.class.getDeclaredMethod("isMainProgress", Context.class);
            if (true) {
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(UMUtils.class, context)).booleanValue();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static boolean i(Context context) {
        NetworkInfo networkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(17)) == null) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean j(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static void c(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesA = a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("resetToken", str).commit();
    }

    public static void d(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesA = a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("uabc", str).commit();
    }

    public static void e(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesA = a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("aaid", str).commit();
    }

    public static void f(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesA = a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("zdata", str).commit();
    }

    public static void a(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        String strB = b(str);
        if (context == null || strB == null || TextUtils.isEmpty(strB) || (sharedPreferencesA = a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("mac", strB).commit();
    }

    public static void b(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        String strB = b(str);
        if (context == null || strB == null || TextUtils.isEmpty(strB) || (sharedPreferencesA = a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("oaid", strB).commit();
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.equals(b(a(str)));
    }
}
