package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1047 implements InterfaceC2028, InterfaceC1147, InterfaceC1478 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f3815;

    public /* synthetic */ C1047(Context context, int i) {
        this.f3814 = i;
        this.f3815 = context;
    }

    @Override // p000.InterfaceC1478
    public Object get() {
        return (ConnectivityManager) this.f3815.getSystemService("connectivity");
    }

    @Override // p000.InterfaceC1147
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo2738(AbstractC2240 abstractC2240) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0767("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC1149(this, abstractC2240, threadPoolExecutor, 0));
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC2027 mo1261(C2136 c2136) {
        switch (this.f3814) {
            case 0:
                return new C0284(this.f3815, this);
            case 1:
                return new C0284(this.f3815, this);
            case 2:
                return new C0284(this.f3815, this);
            case 3:
            case 4:
            default:
                return new C0284(this.f3815, c2136.m4095(Integer.class, InputStream.class));
            case 5:
                return new C1956(this.f3815, 0);
            case 6:
                return new C1956(this.f3815, 1);
            case 7:
                return new C1956(this.f3815, 2);
            case 8:
                return new C0284(this.f3815, c2136.m4095(Integer.class, AssetFileDescriptor.class));
        }
    }

    public C1047(Context context) {
        this.f3814 = 3;
        this.f3815 = context.getApplicationContext();
    }
}
