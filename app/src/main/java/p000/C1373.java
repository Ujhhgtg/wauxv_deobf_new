package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲀᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1373 implements InterfaceC1141 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f4945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1372 f4946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1227 f4947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f4948 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Handler f4949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ThreadPoolExecutor f4950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ThreadPoolExecutor f4951;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public AbstractC1458 f4952;

    public C1373(Context context, C1372 c1372) {
        AbstractC2665.m4661(context, "Context cannot be null");
        this.f4945 = context.getApplicationContext();
        this.f4946 = c1372;
        this.f4947 = C1374.f4953;
    }

    @Override // p000.InterfaceC1141
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2614(AbstractC1458 abstractC1458) {
        synchronized (this.f4948) {
            this.f4952 = abstractC1458;
        }
        synchronized (this.f4948) {
            try {
                if (this.f4952 == null) {
                    return;
                }
                if (this.f4950 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0769("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4951 = threadPoolExecutor;
                    this.f4950 = threadPoolExecutor;
                }
                this.f4950.execute(new RunnableC0563(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3093() {
        synchronized (this.f4948) {
            try {
                this.f4952 = null;
                Handler handler = this.f4949;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4949 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4951;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4950 = null;
                this.f4951 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1383 m3094() {
        try {
            C1227 c1227 = this.f4947;
            Context context = this.f4945;
            C1372 c1372 = this.f4946;
            
            Object[] objArr = {c1372};
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(objArr[0]);
            C0408 c0408M3090 = AbstractC1371.m3090(context, Collections.unmodifiableList(arrayList));
            int i = c0408M3090.f1921;
            if (i != 0) {
                throw new RuntimeException(AbstractC1194.m2780(i, "fetchFonts failed (", ")"));
            }
            C1383[] c1383Arr = (C1383[]) ((List) c0408M3090.f1922).get(0);
            if (c1383Arr == null || c1383Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1383Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
