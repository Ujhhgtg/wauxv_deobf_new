package com.uyumao;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class n {
    public static String a = null;
    public static String b = null;
    public static String c = null;
    public static String d = "";

    public static String a() {
        if (TextUtils.isEmpty(c)) {
            c = Build.BOARD;
        }
        return c;
    }

    public static String b() {
        if (TextUtils.isEmpty(a)) {
            String str = Build.BRAND;
            a = str;
            if (TextUtils.isEmpty(str)) {
                a = Build.MANUFACTURER;
            }
        }
        return a;
    }

    public static String c() {
        if (TextUtils.isEmpty(b)) {
            b = Build.MODEL;
        }
        return b;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean c(Context context) {
        try {
            String strB = b(context);
            String packageName = context.getApplicationContext().getPackageName();
            return (TextUtils.isEmpty(strB) || TextUtils.isEmpty(packageName) || !strB.equals(packageName)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object a(Object obj, String str, int i) {
        try {
            return ((PackageManager) obj).getPackageInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(d)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    processName = Application.getProcessName();
                } else {
                    processName = "";
                }
                if (TextUtils.isEmpty(processName)) {
                    int iMyPid = Process.myPid();
                    String strA = a(iMyPid);
                    if (!TextUtils.isEmpty(strA)) {
                        d = strA;
                    } else {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.pid == iMyPid) {
                                    d = runningAppProcessInfo.processName;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    d = processName;
                }
            } catch (Throwable unused) {
            }
        }
        return d;
    }

    public static String a(int i) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                return line;
            } catch (Throwable unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
    }

    public static boolean a(Context context) {
        return UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }
}
