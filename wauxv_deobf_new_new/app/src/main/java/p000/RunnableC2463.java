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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲁᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2463 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f7837;

    public /* synthetic */ RunnableC2463(Context context, int i) {
        this.f7836 = i;
        this.f7837 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7836) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC2465.m4398(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2463(this.f7837, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC2463(this.f7837, 2));
                break;
            default:
                AbstractC2234.m4191(this.f7837, new ExecutorC2461(), AbstractC2234.f7285, false);
                break;
        }
    }

    public /* synthetic */ RunnableC2463(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f7836 = 0;
        this.f7837 = context;
    }
}
