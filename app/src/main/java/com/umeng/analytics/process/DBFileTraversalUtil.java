package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DBFileTraversalUtil {
    private static ExecutorService a = Executors.newSingleThreadExecutor();
    private static FileLockUtil b = new FileLockUtil();

    /* JADX INFO: compiled from: obf */
    public interface a {
        void a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final a aVar) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            a.execute(new Runnable() { // from class: com.umeng.analytics.process.DBFileTraversalUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        for (File file2 : file.listFiles()) {
                            if (file2.getName().endsWith(".db")) {
                                DBFileTraversalUtil.b.doFileOperateion(file2, fileLockCallback);
                                UMRTLog.i("MobclickRT", "--->>> file: " + file2.getName());
                            }
                        }
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.i("MobclickRT", "--->>> end *** ");
                }
            });
        }
    }
}
