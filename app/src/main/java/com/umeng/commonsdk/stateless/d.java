package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static int a;
    private static Object b = new Object();

    public static boolean a(long j, long j2) {
        return j > j2;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d2 A[EXC_TOP_SPLITTER, PHI: r2
      0x00d2: PHI (r2v2 java.io.FileOutputStream) = (r2v1 java.io.FileOutputStream), (r2v3 java.io.FileOutputStream) binds: [B:38:0x00f9, B:32:0x00d0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static boolean b(Context context, String str, String str2, byte[] bArr) {
        if (context == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    synchronized (b) {
                        try {
                            ULog.i("walle", "[stateless] begin write envelope, thread is " + Thread.currentThread());
                            File file = new File(context.getFilesDir() + "/" + a.e);
                            if (!file.isDirectory()) {
                                file.mkdir();
                            }
                            File file2 = new File(file.getPath() + "/" + str);
                            if (!file2.isDirectory()) {
                                file2.mkdir();
                            }
                            File file3 = new File(file2.getPath() + "/" + str2);
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                            try {
                                fileOutputStream2.write(bArr);
                                fileOutputStream2.close();
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    if (false) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                ULog.i("walle", "[stateless] write envelope, e is " + th4.getMessage());
                UMCrashManager.reportCrash(context, th4);
                if (false) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return false;
            }
        } catch (IOException e) {
            ULog.i("walle", "[stateless] write envelope, e is " + e.getMessage());
            UMCrashManager.reportCrash(context, e);
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        }
    }

    public static File[] c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (b) {
                try {
                    String str = context.getApplicationContext().getFilesDir() + File.separator + a.f;
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    File file = new File(str);
                    synchronized (b) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.3
                                @Override // java.util.Comparator
                                public int compare(File file2, File file3) {
                                    long jLastModified = file2.lastModified() - file3.lastModified();
                                    if (jLastModified > 0) {
                                        return 1;
                                    }
                                    return jLastModified == 0 ? 0 : -1;
                                }
                            });
                            return fileArrListFiles;
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String d(String str) {
        int iLastIndexOf;
        int iLastIndexOf2;
        return (!TextUtils.isEmpty(str) && str.indexOf("envelope") < 0 && (iLastIndexOf = str.lastIndexOf("_")) >= 0 && (iLastIndexOf2 = str.lastIndexOf(".")) >= 0) ? str.substring(iLastIndexOf + 1, iLastIndexOf2) : "";
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0067 A[EXC_TOP_SPLITTER, PHI: r1
      0x0067: PHI (r1v2 java.io.FileOutputStream) = (r1v1 java.io.FileOutputStream), (r1v3 java.io.FileOutputStream) binds: [B:26:0x0065, B:32:0x0070] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static int a(Context context, String str, String str2, byte[] bArr) {
        if (context == null) {
            return 101;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    synchronized (b) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(context.getFilesDir());
                            String str3 = File.separator;
                            sb.append(str3);
                            sb.append(str);
                            File file = new File(sb.toString());
                            if (!file.isDirectory()) {
                                file.mkdir();
                            }
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file.getPath() + str3 + str2));
                            try {
                                fileOutputStream2.write(bArr);
                                fileOutputStream2.close();
                                return 0;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException e) {
                    UMCrashManager.reportCrash(context, e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return 101;
                }
            } catch (Throwable th3) {
                UMCrashManager.reportCrash(context, th3);
                if (false) {
                    fileOutputStream.close();
                }
                return 101;
            }
        } catch (Throwable th4) {
            if (false) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
            }
            throw th4;
        }
    }

    public static String c(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(String str) {
        Throwable th;
        IOException iOException;
        byte[] bArr;
        synchronized (b) {
            FileChannel fileChannel = null;
            try {
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
                            } catch (Throwable unused) {
                            }
                        } catch (IOException e) {
                            iOException = e;
                            fileChannel = channel;
                            ULog.i("walle", "[stateless] write envelope, e is " + iOException.getMessage());
                            throw iOException;
                        } catch (Throwable th2) {
                            th = th2;
                            fileChannel = channel;
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                    throw th;
                                } catch (Throwable unused2) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return bArr;
    }

    public static File b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (b) {
                try {
                    String str = context.getApplicationContext().getFilesDir() + File.separator + a.f;
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    File file = new File(str);
                    synchronized (b) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.2
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
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static File a(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file = null;
        try {
            synchronized (b) {
                try {
                    ULog.i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                    if (context != null && context.getApplicationContext() != null) {
                        String str = context.getApplicationContext().getFilesDir() + File.separator + a.e;
                        if (!TextUtils.isEmpty(str)) {
                            File file2 = new File(str);
                            if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0) {
                                for (File file3 : fileArrListFiles) {
                                    if (file3 != null && file3.isDirectory() && (fileArrListFiles2 = file3.listFiles()) != null && fileArrListFiles2.length > 0) {
                                        Arrays.sort(fileArrListFiles2, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.1
                                            @Override // java.util.Comparator
                                            public int compare(File file4, File file5) {
                                                long jLastModified = file4.lastModified() - file5.lastModified();
                                                if (jLastModified > 0) {
                                                    return 1;
                                                }
                                                return jLastModified == 0 ? 0 : -1;
                                            }
                                        });
                                        File file4 = fileArrListFiles2[0];
                                        if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                            file = file4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ULog.i("walle", "get last envelope end, thread is " + Thread.currentThread());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return file;
        }
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b2)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    public static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, boolean z) {
        if (context == null) {
            return null;
        }
        try {
            if (z) {
                return context.getApplicationContext().getFilesDir() + File.separator + a.e;
            }
            return context.getApplicationContext().getFilesDir() + File.separator + a.f;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Context context, String str, int i) {
        try {
            if (str == null) {
                ULog.i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                ULog.i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (b) {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    ULog.i("AmapLBS", "[lbs-build] delete file begin " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                    if (fileArrListFiles.length >= i) {
                        ULog.i("AmapLBS", "[lbs-build] file size >= max");
                        ArrayList arrayList = new ArrayList();
                        for (File file2 : fileArrListFiles) {
                            if (file2 != null) {
                                arrayList.add(file2);
                            }
                        }
                        if (arrayList.size() >= i) {
                            Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.4
                                @Override // java.util.Comparator
                                public int compare(File file3, File file4) {
                                    if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                        return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                    }
                                    return -1;
                                }
                            });
                            if (ULog.DEBUG) {
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    ULog.i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                                }
                            }
                            for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                                if (arrayList.get(i3) != null) {
                                    ULog.i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                    try {
                                        ((File) arrayList.get(i3)).delete();
                                        arrayList.remove(i3);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    } else {
                        ULog.i("AmapLBS", "[lbs-build] file size < max");
                    }
                    ULog.i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static void a(Context context, String str, final String str2, int i) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                synchronized (b) {
                    try {
                        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.umeng.commonsdk.stateless.d.5
                            @Override // java.io.FilenameFilter
                            public boolean accept(File file2, String str3) {
                                return str3.startsWith(str2);
                            }
                        });
                        if (fileArrListFiles != null && fileArrListFiles.length >= i) {
                            ULog.i("AmapLBS", "[lbs-build] file size >= max");
                            ArrayList arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    arrayList.add(file2);
                                }
                            }
                            if (arrayList.size() >= i) {
                                Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.6
                                    @Override // java.util.Comparator
                                    public int compare(File file3, File file4) {
                                        if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                            return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                        }
                                        return -1;
                                    }
                                });
                                if (ULog.DEBUG) {
                                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                        ULog.i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                                    }
                                }
                                for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                                    if (arrayList.get(i3) != null) {
                                        ULog.i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                        try {
                                            ((File) arrayList.get(i3)).delete();
                                            arrayList.remove(i3);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                        } else {
                            ULog.i("AmapLBS", "[lbs-build] file size < max");
                        }
                        ULog.i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    a += iDeflate;
                    byteArrayOutputStream2.write(bArr2, 0, iDeflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (true) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
