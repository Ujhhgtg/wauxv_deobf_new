package com.umeng.commonsdk.framework;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.bv;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class UMFrUtils {
    private static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    private static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    private static Object mEnvelopeBuildTimeLock = new Object();
    private static String mDefaultEnvelopeDir = be.b().b("env");
    private static String mDefaultEnvelopeDirPath = null;
    private static Object mEnvelopeFileLock = new Object();
    private static String sCurrentProcessName = "";

    private static boolean checkPermission(Context context, String str) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(applicationContext, th);
            }
        }
        return false;
    }

    public static int envelopeFileNumber(Context context) {
        String[] list;
        if (context != null) {
            try {
                File file = new File(getEnvelopeDirPath(context));
                synchronized (mEnvelopeFileLock) {
                    try {
                        if (file.isDirectory() && (list = file.list()) != null) {
                            return list.length;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
        }
        return 0;
    }

    public static String getCurrentProcessName(Context context) {
        if (TextUtils.isEmpty(sCurrentProcessName)) {
            try {
                String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
                if (TextUtils.isEmpty(processName)) {
                    String processName2 = getProcessName(Process.myPid());
                    if (!TextUtils.isEmpty(processName2)) {
                        sCurrentProcessName = processName2;
                    }
                } else {
                    sCurrentProcessName = processName;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context.getApplicationContext(), th);
            }
        }
        return sCurrentProcessName;
    }

    private static long getDistanceDays(long j, long j2) {
        return (j < j2 ? j2 - j : j - j2) / 86400000;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    mDefaultEnvelopeDirPath = context.getFilesDir().getAbsolutePath() + File.separator + "." + mDefaultEnvelopeDir;
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.d("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
            str = mDefaultEnvelopeDirPath;
        }
        return str;
    }

    public static File getEnvelopeFile(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.UMFrUtils.2
                        @Override // java.util.Comparator
                        public int compare(File file2, File file3) {
                            long jLastModified = file2.lastModified() - file3.lastModified();
                            if (jLastModified > 0) {
                                return 1;
                            }
                            return jLastModified == 0 ? 0 : -1;
                        }
                    });
                    return fileArrListFiles[0];
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long getLastInstantBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong("last_instant_build_time", 0L);
        }
        return j;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong("last_successful_build_time", 0L);
        }
        return j;
    }

    public static String getLegacyEnvelopeDir(Context context) {
        try {
            String currentProcessName = getCurrentProcessName(context);
            if (!TextUtils.isEmpty(currentProcessName)) {
                String strB = be.b().b("lepd");
                String strReplace = currentProcessName.replace(':', '_');
                ULog.d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                return strB + strReplace;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return mDefaultEnvelopeDir;
    }

    private static String getProcessName(int i) {
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
                if (true) {
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

    public static String getSubProcessName(Context context) {
        String strSubstring = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int iIndexOf = currentProcessName.indexOf(":");
            strSubstring = iIndexOf >= 0 ? currentProcessName.substring(iIndexOf + 1) : "";
            if (iIndexOf >= 0) {
                return strSubstring;
            }
            String packageName = context.getPackageName();
            return currentProcessName.length() > packageName.length() ? currentProcessName.substring(packageName.length() + 1, currentProcessName.length()) : currentProcessName;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return "";
        }
    }

    public static boolean hasEnvelopeFile(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        String str = "a";
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
            str = "i";
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_ZeroEnv) {
            str = "z";
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_Silent) {
            str = "h";
        }
        String envelopeDirPath = getEnvelopeDirPath(context);
        if (envelopeDirPath == null) {
            return false;
        }
        File file = new File(envelopeDirPath);
        synchronized (mEnvelopeFileLock) {
            try {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.getName().startsWith(str)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return false;
        }
    }

    public static boolean removeEnvelopeFile(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            try {
                if (file != null) {
                    try {
                        if (file.exists()) {
                            return file.delete();
                        }
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(appContext, th);
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void removeRedundantEnvelopeFiles(Context context, int i) {
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > i) {
                    Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.UMFrUtils.1
                        @Override // java.util.Comparator
                        public int compare(File file2, File file3) {
                            long jLastModified = file2.lastModified() - file3.lastModified();
                            if (jLastModified > 0) {
                                return 1;
                            }
                            return jLastModified == 0 ? 0 : -1;
                        }
                    });
                    if (true) {
                        for (int i2 = 0; i2 < fileArrListFiles.length - i; i2++) {
                            try {
                                if (!fileArrListFiles[i2].delete()) {
                                    ULog.d("--->>> remove [" + i2 + "] file fail.");
                                }
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int saveEnvelopeFile(Context context, String str, byte[] bArr) {
        if (bArr == null) {
            return 101;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getEnvelopeDirPath(context));
        File file = new File(AbstractC2784.m4752(sb, File.separator, str));
        synchronized (mEnvelopeFileLock) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.close();
                            boolean zA = com.umeng.commonsdk.statistics.internal.a.a(context).a(str);
                            boolean zB = com.umeng.commonsdk.statistics.internal.a.a(context).b(str);
                            if (zA) {
                                updateLastSuccessfulBuildTime(context);
                            }
                            if (zB) {
                                updateLastInstantBuildTime(context);
                            }
                            return 0;
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            UMCrashManager.reportCrash(context, e);
                            if (true) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    UMCrashManager.reportCrash(context, th);
                                }
                            }
                            return 101;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (true) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    UMCrashManager.reportCrash(context, th3);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context == null) {
            return;
        }
        try {
            String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
            if (!TextUtils.isEmpty(legacyEnvelopeDir) && !legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                File file = new File(context.getFilesDir().getAbsolutePath() + "/." + legacyEnvelopeDir);
                if (file.exists()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        try {
                            if (file.isDirectory()) {
                                file.delete();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            UMCrashManager.reportCrash(context, th);
                            return;
                        }
                    }
                    try {
                        String envelopeDirPath = getEnvelopeDirPath(context);
                        for (int i = 0; i < fileArrListFiles.length; i++) {
                            fileArrListFiles[i].renameTo(new File(envelopeDirPath + File.separator + fileArrListFiles[i].getName()));
                        }
                        if (file.isDirectory()) {
                            file.delete();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        UMCrashManager.reportCrash(context, th2);
                        return;
                    }
                    UMCrashManager.reportCrash(context, th);
                }
            }
        } catch (Throwable th3) {
            UMCrashManager.reportCrash(context, th3);
        }
    }

    public static byte[] toByteArray(String str) {
        Throwable th;
        IOException iOException;
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            FileChannel fileChannel = null;
            try {
                try {
                    FileChannel channel = new RandomAccessFile(str, "r").getChannel();
                    try {
                        MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                        bArr = new byte[(int) channel.size()];
                        if (mappedByteBufferLoad.remaining() > 0) {
                            mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                        }
                        try {
                            channel.close();
                        } catch (Throwable th2) {
                            UMCrashManager.reportCrash(appContext, th2);
                        }
                    } catch (IOException e) {
                        iOException = e;
                        fileChannel = channel;
                        UMCrashManager.reportCrash(appContext, iOException);
                        throw iOException;
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = channel;
                        try {
                            fileChannel.close();
                            throw th;
                        } catch (Throwable th4) {
                            UMCrashManager.reportCrash(appContext, th4);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    iOException = e2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return bArr;
    }

    private static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong("last_instant_build_time", System.currentTimeMillis()).commit();
        }
    }

    private static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong("last_successful_build_time", System.currentTimeMillis()).commit();
        }
    }
}
