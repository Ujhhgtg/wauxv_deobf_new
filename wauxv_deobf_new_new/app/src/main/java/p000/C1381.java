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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲀᤞᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1381 implements InterfaceC1147 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f4974;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1380 f4975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1224 f4976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f4977 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Handler f4978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ThreadPoolExecutor f4979;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ThreadPoolExecutor f4980;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public AbstractC2240 f4981;

    public C1381(Context context, C1380 c1380) {
        C1787.m3664(context, "Context cannot be null");
        this.f4974 = context.getApplicationContext();
        this.f4975 = c1380;
        this.f4976 = C1382.f4982;
    }

    @Override // p000.InterfaceC1147
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2738(AbstractC2240 abstractC2240) {
        synchronized (this.f4977) {
            this.f4981 = abstractC2240;
        }
        synchronized (this.f4977) {
            try {
                if (this.f4981 == null) {
                    return;
                }
                if (this.f4979 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0767("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4980 = threadPoolExecutor;
                    this.f4979 = threadPoolExecutor;
                }
                this.f4979.execute(new RunnableC0541(this, 3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3201() {
        synchronized (this.f4977) {
            try {
                this.f4981 = null;
                Handler handler = this.f4978;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4978 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4980;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4979 = null;
                this.f4980 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1391 m3202() {
        try {
            C1224 c1224 = this.f4976;
            Context context = this.f4974;
            C1380 c1380 = this.f4975;
            c1224.getClass();
            Object[] objArr = {c1380};
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(objArr[0]);
            C0383 c0383M3198 = AbstractC1379.m3198(context, Collections.unmodifiableList(arrayList));
            int i = c0383M3198.f1893;
            if (i != 0) {
                throw new RuntimeException(AbstractC1095.m2795(i, "fetchFonts failed (", ")"));
            }
            C1391[] c1391Arr = (C1391[]) ((List) c0383M3198.f1894).get(0);
            if (c1391Arr == null || c1391Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1391Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
