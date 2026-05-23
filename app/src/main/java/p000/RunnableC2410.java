package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2410 implements Runnable {

    public final /* synthetic */ int f7692;

    public final /* synthetic */ Context f7693;

    public /* synthetic */ RunnableC2410(Context context, int i) {
        this.f7692 = i;
        this.f7693 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7692) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC2412.m4377(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2410(this.f7693, 1), new Random().nextInt(1000) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC2410(this.f7693, 2));
                break;
            default:
                AbstractC2203.m4046(this.f7693, new ExecutorC2408(), AbstractC2203.f7168, false);
                break;
        }
    }

    public /* synthetic */ RunnableC2410(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f7692 = 0;
        this.f7693 = context;
    }
}
