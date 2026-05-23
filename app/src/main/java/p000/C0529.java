package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0529 implements InterfaceC0955 {

    public final /* synthetic */ int f2221;

    public final Object f2222;

    public /* synthetic */ C0529(int i, Object obj) {
        this.f2221 = i;
        this.f2222 = obj;
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
        int i = this.f2221;
    }

    @Override // p000.InterfaceC0955
    public final Class mo1391() {
        switch (this.f2221) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f2222.getClass();
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1855() {
        int i = this.f2221;
    }

    @Override // p000.InterfaceC0955
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        switch (this.f2221) {
            case 0:
                try {
                    interfaceC0954.mo1883(AbstractC0534.m1863((File) this.f2222));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC0954.mo1882(e);
                    return;
                }
                break;
            default:
                interfaceC0954.mo1883(this.f2222);
                break;
        }
    }

    @Override // p000.InterfaceC0955
    public final int mo1857() {
        switch (this.f2221) {
        }
        return 1;
    }

    private final void m1851() {
    }

    private final void m1852() {
    }

    private final void m1853() {
    }

    private final void m1854() {
    }
}
