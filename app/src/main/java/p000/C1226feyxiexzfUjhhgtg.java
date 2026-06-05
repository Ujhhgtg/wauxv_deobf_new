package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ要点脸ᛲᛳᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1226feyxiexzfUjhhgtg implements InterfaceC3073Ujhhgtgfeyxiexzf, InterfaceC3074Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3087Ujhhgtgfeyxiexzf f4547Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final RunnableC3096Ujhhgtgfeyxiexzf f4548Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public volatile int f4549Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public volatile C3070Ujhhgtgfeyxiexzf f4550Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public volatile Object f4551Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public volatile C0286Ujhhgtgfeyxiexzf f4552Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public volatile C3069Ujhhgtgfeyxiexzf f4553Ujhhgtgfeyxiexzf;

    public C1226feyxiexzfUjhhgtg(C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf, RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf) {
        this.f4547Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf;
        this.f4548Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3073Ujhhgtgfeyxiexzf
    public final void cancel() {
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf = this.f4552Ujhhgtgfeyxiexzf;
        if (c0286Ujhhgtgfeyxiexzf != null) {
            c0286Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // p000.InterfaceC3073Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2377Ujhhgtgfeyxiexzf() {
        boolean z;
        if (this.f4551Ujhhgtgfeyxiexzf == null) {
            if (this.f4550Ujhhgtgfeyxiexzf != null) {
            }
            this.f4550Ujhhgtgfeyxiexzf = null;
            this.f4552Ujhhgtgfeyxiexzf = null;
            z = false;
            while (!z) {
                ArrayList arrayListM4575Ujhhgtgfeyxiexzf = this.f4547Ujhhgtgfeyxiexzf.m4575Ujhhgtgfeyxiexzf();
                int i = this.f4549Ujhhgtgfeyxiexzf;
                this.f4549Ujhhgtgfeyxiexzf = i + 1;
                this.f4552Ujhhgtgfeyxiexzf = (C0286Ujhhgtgfeyxiexzf) arrayListM4575Ujhhgtgfeyxiexzf.get(i);
                if (this.f4552Ujhhgtgfeyxiexzf == null) {
                }
            }
            return z;
        }
        Object obj = this.f4551Ujhhgtgfeyxiexzf;
        this.f4551Ujhhgtgfeyxiexzf = null;
        try {
            if (m2718Ujhhgtgfeyxiexzf(obj)) {
                if (this.f4550Ujhhgtgfeyxiexzf != null || !this.f4550Ujhhgtgfeyxiexzf.mo2377Ujhhgtgfeyxiexzf()) {
                    this.f4550Ujhhgtgfeyxiexzf = null;
                    this.f4552Ujhhgtgfeyxiexzf = null;
                    z = false;
                    while (!z && this.f4549Ujhhgtgfeyxiexzf < this.f4547Ujhhgtgfeyxiexzf.m4575Ujhhgtgfeyxiexzf().size()) {
                        ArrayList arrayListM4575Ujhhgtgfeyxiexzf2 = this.f4547Ujhhgtgfeyxiexzf.m4575Ujhhgtgfeyxiexzf();
                        int i2 = this.f4549Ujhhgtgfeyxiexzf;
                        this.f4549Ujhhgtgfeyxiexzf = i2 + 1;
                        this.f4552Ujhhgtgfeyxiexzf = (C0286Ujhhgtgfeyxiexzf) arrayListM4575Ujhhgtgfeyxiexzf2.get(i2);
                        if (this.f4552Ujhhgtgfeyxiexzf == null && (this.f4547Ujhhgtgfeyxiexzf.f9562Ujhhgtgfeyxiexzf.m4679Ujhhgtgfeyxiexzf(this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf()) || this.f4547Ujhhgtgfeyxiexzf.m4576Ujhhgtgfeyxiexzf(this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1381Ujhhgtgfeyxiexzf()) != null)) {
                            this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1383Ujhhgtgfeyxiexzf(this.f4547Ujhhgtgfeyxiexzf.f9561Ujhhgtgfeyxiexzf, new C2629Ujhhgtgfeyxiexzf(this, this.f4552Ujhhgtgfeyxiexzf, 27, false));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    @Override // p000.InterfaceC3074Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo2716Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, Object obj, InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf, int i, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf2) {
        this.f4548Ujhhgtgfeyxiexzf.mo2716Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, obj, interfaceC3078Ujhhgtgfeyxiexzf, this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf(), interfaceC0156Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3074Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo2717Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, Exception exc, InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf, int i) {
        this.f4548Ujhhgtgfeyxiexzf.mo2717Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, exc, interfaceC3078Ujhhgtgfeyxiexzf, this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m2718Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC3106Ujhhgtgfeyxiexzf interfaceC3106UjhhgtgfeyxiexzfM2472Ujhhgtgfeyxiexzf = this.f4547Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().m2472Ujhhgtgfeyxiexzf(obj);
            Object objMo753Ujhhgtgfeyxiexzf = interfaceC3106UjhhgtgfeyxiexzfM2472Ujhhgtgfeyxiexzf.mo753Ujhhgtgfeyxiexzf();
            InterfaceC3330Ujhhgtgfeyxiexzf interfaceC3330UjhhgtgfeyxiexzfM4577Ujhhgtgfeyxiexzf = this.f4547Ujhhgtgfeyxiexzf.m4577Ujhhgtgfeyxiexzf(objMo753Ujhhgtgfeyxiexzf);
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(interfaceC3330UjhhgtgfeyxiexzfM4577Ujhhgtgfeyxiexzf, objMo753Ujhhgtgfeyxiexzf, this.f4547Ujhhgtgfeyxiexzf.f9555Ujhhgtgfeyxiexzf, 5);
            InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = this.f4552Ujhhgtgfeyxiexzf.f1717Ujhhgtgfeyxiexzf;
            C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = this.f4547Ujhhgtgfeyxiexzf;
            C3069Ujhhgtgfeyxiexzf c3069Ujhhgtgfeyxiexzf = new C3069Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf.f9560Ujhhgtgfeyxiexzf);
            InterfaceC3184feyxiexzfUjhhgtg interfaceC3184feyxiexzfUjhhgtgM4818Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf.f9554Ujhhgtgfeyxiexzf.m4818Ujhhgtgfeyxiexzf();
            interfaceC3184feyxiexzfUjhhgtgM4818Ujhhgtgfeyxiexzf.mo3706Ujhhgtgfeyxiexzf(c3069Ujhhgtgfeyxiexzf, c2366Ujhhgtgfeyxiexzf);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c3069Ujhhgtgfeyxiexzf + ", data: " + obj + ", encoder: " + interfaceC3330UjhhgtgfeyxiexzfM4577Ujhhgtgfeyxiexzf + ", duration: " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos));
            }
            if (interfaceC3184feyxiexzfUjhhgtgM4818Ujhhgtgfeyxiexzf.mo3704Ujhhgtgfeyxiexzf(c3069Ujhhgtgfeyxiexzf) != null) {
                this.f4553Ujhhgtgfeyxiexzf = c3069Ujhhgtgfeyxiexzf;
                this.f4550Ujhhgtgfeyxiexzf = new C3070Ujhhgtgfeyxiexzf(Collections.singletonList(this.f4552Ujhhgtgfeyxiexzf.f1717Ujhhgtgfeyxiexzf), this.f4547Ujhhgtgfeyxiexzf, this);
                this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f4553Ujhhgtgfeyxiexzf + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f4548Ujhhgtgfeyxiexzf.mo2716Ujhhgtgfeyxiexzf(this.f4552Ujhhgtgfeyxiexzf.f1717Ujhhgtgfeyxiexzf, interfaceC3106UjhhgtgfeyxiexzfM2472Ujhhgtgfeyxiexzf.mo753Ujhhgtgfeyxiexzf(), this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf, this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf(), this.f4552Ujhhgtgfeyxiexzf.f1717Ujhhgtgfeyxiexzf);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f4552Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
