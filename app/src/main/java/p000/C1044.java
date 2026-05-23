package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲇᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1044 implements InterfaceC1997, InterfaceC1141, InterfaceC1467 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Context f3808;

    public /* synthetic */ C1044(Context context, int i) {
        this.f3807 = i;
        this.f3808 = context;
    }

    @Override // p000.InterfaceC1467
    public Object get() {
        return (ConnectivityManager) this.f3808.getSystemService("connectivity");
    }

    @Override // p000.InterfaceC1141
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo2614(AbstractC1458 abstractC1458) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0769("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC1143(this, abstractC1458, threadPoolExecutor, 0));
    }

    @Override // p000.InterfaceC1997
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC1996 mo1115(C2103 c2103) {
        switch (this.f3807) {
            case 0:
                return new C0274(this.f3808, this);
            case 1:
                return new C0274(this.f3808, this);
            case 2:
                return new C0274(this.f3808, this);
            case 3:
            case 4:
            default:
                return new C0274(this.f3808, c2103.m3911(Integer.class, InputStream.class));
            case 5:
                return new C1925(this.f3808, 0);
            case 6:
                return new C1925(this.f3808, 1);
            case 7:
                return new C1925(this.f3808, 2);
            case 8:
                return new C0274(this.f3808, c2103.m3911(Integer.class, AssetFileDescriptor.class));
        }
    }

    public C1044(Context context) {
        this.f3807 = 3;
        this.f3808 = context.getApplicationContext();
    }
}
