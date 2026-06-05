package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.ExecutorC0842feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1898Ujhhgtgfeyxiexzf(context, new ExecutorC0842feyxiexzfUjhhgtg(), new C0709Ujhhgtgfeyxiexzf(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(this);
                try {
                    AbstractC0615Ujhhgtgfeyxiexzf.m1887Ujhhgtgfeyxiexzf(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c0709Ujhhgtgfeyxiexzf.mo1738Ujhhgtgfeyxiexzf(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    c0709Ujhhgtgfeyxiexzf.mo1738Ujhhgtgfeyxiexzf(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf2 = new C0709Ujhhgtgfeyxiexzf(this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                c0709Ujhhgtgfeyxiexzf2.mo1738Ujhhgtgfeyxiexzf(16, null);
                return;
            }
            if (C3052Ujhhgtgfeyxiexzf.m4515Ujhhgtgfeyxiexzf(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                c0709Ujhhgtgfeyxiexzf2.mo1738Ujhhgtgfeyxiexzf(14, null);
            } else {
                c0709Ujhhgtgfeyxiexzf2.mo1738Ujhhgtgfeyxiexzf(15, null);
            }
        }
    }
}
