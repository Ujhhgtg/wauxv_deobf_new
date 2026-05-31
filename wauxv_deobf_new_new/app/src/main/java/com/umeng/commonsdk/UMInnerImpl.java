package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.c;
import com.umeng.commonsdk.internal.utils.k;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.d;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class UMInnerImpl {
    private static boolean isInternal = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f1033 = 0;

    public static synchronized void initAndSendInternal(final Context context) {
        if (context != null) {
            try {
                if (!isInternal) {
                    new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                                    return;
                                }
                                try {
                                    if (FieldManager.allow(d.aq) && !c.a(context).a()) {
                                        c.a(context).b();
                                    }
                                } catch (Throwable th) {
                                    ULog.e(UMModuleRegister.INNER, "e is " + th);
                                }
                                try {
                                    k.b(context);
                                } catch (Throwable th2) {
                                    ULog.e(UMModuleRegister.INNER, "e is " + th2);
                                }
                            } catch (Throwable th3) {
                                UMCrashManager.reportCrash(context, th3);
                            }
                        }
                    }).start();
                    isInternal = true;
                    sendInternal(context);
                }
            } catch (Throwable th) {
                ULog.e(UMModuleRegister.INNER, "e is " + th.getMessage());
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    private static synchronized void sendInternal(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                            String packageName = context.getPackageName();
                            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                                return;
                            }
                            try {
                                com.umeng.commonsdk.internal.d.b(context);
                            } catch (Throwable th) {
                                ULog.e(UMModuleRegister.INNER, "e is " + th);
                            }
                        } catch (Throwable th2) {
                            UMCrashManager.reportCrash(context, th2);
                        }
                    }
                }).start();
                isInternal = true;
            } catch (Throwable th) {
                ULog.e(UMModuleRegister.INNER, "e is " + th.getMessage());
                UMCrashManager.reportCrash(context, th);
            }
        }
    }
}
