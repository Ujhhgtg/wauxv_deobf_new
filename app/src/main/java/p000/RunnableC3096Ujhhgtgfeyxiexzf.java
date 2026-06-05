package p000;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛲ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3096Ujhhgtgfeyxiexzf implements InterfaceC3074Ujhhgtgfeyxiexzf, Runnable, Comparable, InterfaceC3508feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f9597feyxiexzfUjhhgtg = new C1469feyxiexzfUjhhgtg("glide_thread_priority_override", null, C1469feyxiexzfUjhhgtg.f5103Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C3331feyxiexzfUjhhgtg f9601Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1445feyxiexzfUjhhgtg f9602Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3589Ujhhgtgfeyxiexzf f9605Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public InterfaceC0156Ujhhgtgfeyxiexzf f9606Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public EnumC0836feyxiexzfUjhhgtg f9607Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C3340feyxiexzfUjhhgtg f9608Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f9609Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f9610Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3183feyxiexzfUjhhgtg f9611Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C1471feyxiexzfUjhhgtg f9612Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3338Ujhhgtgfeyxiexzf f9613Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f9614Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public long f9615Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Object f9616Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3596feyxiexzfUjhhgtg f9617Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public Supplier f9618Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Thread f9619Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public InterfaceC0156Ujhhgtgfeyxiexzf f9620feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public InterfaceC0156Ujhhgtgfeyxiexzf f9621feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object f9622feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public InterfaceC3078Ujhhgtgfeyxiexzf f9623feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public volatile InterfaceC3073Ujhhgtgfeyxiexzf f9624feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public volatile boolean f9625feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public volatile boolean f9626feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f9627feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f9628feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f9629feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f9630feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3087Ujhhgtgfeyxiexzf f9598Ujhhgtgfeyxiexzf = new C3087Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f9599Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C1131feyxiexzfUjhhgtg f9600Ujhhgtgfeyxiexzf = new C1131feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2366Ujhhgtgfeyxiexzf f9603Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(6);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C3095Ujhhgtgfeyxiexzf f9604Ujhhgtgfeyxiexzf = new C3095Ujhhgtgfeyxiexzf();

    public RunnableC3096Ujhhgtgfeyxiexzf(C3331feyxiexzfUjhhgtg c3331feyxiexzfUjhhgtg, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        this.f9601Ujhhgtgfeyxiexzf = c3331feyxiexzfUjhhgtg;
        this.f9602Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf = (RunnableC3096Ujhhgtgfeyxiexzf) obj;
        int iOrdinal = this.f9607Ujhhgtgfeyxiexzf.ordinal() - runnableC3096Ujhhgtgfeyxiexzf.f9607Ujhhgtgfeyxiexzf.ordinal();
        return iOrdinal == 0 ? this.f9614Ujhhgtgfeyxiexzf - runnableC3096Ujhhgtgfeyxiexzf.f9614Ujhhgtgfeyxiexzf : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf = this.f9623feyxiexzfUjhhgtg;
        try {
            try {
                if (this.f9626feyxiexzfUjhhgtg) {
                    m4599Ujhhgtgfeyxiexzf();
                    if (interfaceC3078Ujhhgtgfeyxiexzf != null) {
                        interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
                        return;
                    }
                    return;
                }
                m4604Ujhhgtgfeyxiexzf();
                if (interfaceC3078Ujhhgtgfeyxiexzf != null) {
                    interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
                }
            } catch (Throwable th) {
                if (interfaceC3078Ujhhgtgfeyxiexzf != null) {
                    interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
                }
                throw th;
            }
        } catch (C2642Ujhhgtgfeyxiexzf e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f9626feyxiexzfUjhhgtg + ", stage: " + AbstractC1225feyxiexzfUjhhgtg.m2715feyxiexzfUjhhgtg(this.f9628feyxiexzfUjhhgtg), th2);
            }
            if (this.f9628feyxiexzfUjhhgtg != 5) {
                this.f9599Ujhhgtgfeyxiexzf.add(th2);
                m4599Ujhhgtgfeyxiexzf();
            }
            if (!this.f9626feyxiexzfUjhhgtg) {
                throw th2;
            }
            throw th2;
        }
    }

    @Override // p000.InterfaceC3508feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final C1131feyxiexzfUjhhgtg mo1443Ujhhgtgfeyxiexzf() {
        return this.f9600Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3074Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2716Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, Object obj, InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf, int i, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf2) {
        this.f9620feyxiexzfUjhhgtg = interfaceC0156Ujhhgtgfeyxiexzf;
        this.f9622feyxiexzfUjhhgtg = obj;
        this.f9623feyxiexzfUjhhgtg = interfaceC3078Ujhhgtgfeyxiexzf;
        this.f9630feyxiexzfUjhhgtg = i;
        this.f9621feyxiexzfUjhhgtg = interfaceC0156Ujhhgtgfeyxiexzf2;
        this.f9627feyxiexzfUjhhgtg = interfaceC0156Ujhhgtgfeyxiexzf != this.f9598Ujhhgtgfeyxiexzf.m4574Ujhhgtgfeyxiexzf().get(0);
        if (Thread.currentThread() != this.f9619Ujhhgtgfeyxiexzf) {
            m4601Ujhhgtgfeyxiexzf(3);
        } else {
            m4595Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC3074Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo2717Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, Exception exc, InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf, int i) {
        interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
        C3591Ujhhgtgfeyxiexzf c3591Ujhhgtgfeyxiexzf = new C3591Ujhhgtgfeyxiexzf("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1381Ujhhgtgfeyxiexzf = interfaceC3078Ujhhgtgfeyxiexzf.mo1381Ujhhgtgfeyxiexzf();
        c3591Ujhhgtgfeyxiexzf.f11174Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
        c3591Ujhhgtgfeyxiexzf.f11175Ujhhgtgfeyxiexzf = i;
        c3591Ujhhgtgfeyxiexzf.f11176Ujhhgtgfeyxiexzf = clsMo1381Ujhhgtgfeyxiexzf;
        this.f9599Ujhhgtgfeyxiexzf.add(c3591Ujhhgtgfeyxiexzf);
        if (Thread.currentThread() != this.f9619Ujhhgtgfeyxiexzf) {
            m4601Ujhhgtgfeyxiexzf(2);
        } else {
            m4603Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC0901feyxiexzfUjhhgtg m4593Ujhhgtgfeyxiexzf(InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf, Object obj, int i) {
        if (obj == null) {
            interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
            return null;
        }
        try {
            int i2 = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgM4594Ujhhgtgfeyxiexzf = m4594Ujhhgtgfeyxiexzf(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m4598Ujhhgtgfeyxiexzf("Decoded result " + interfaceC0901feyxiexzfUjhhgtgM4594Ujhhgtgfeyxiexzf, jElapsedRealtimeNanos, null);
            }
            return interfaceC0901feyxiexzfUjhhgtgM4594Ujhhgtgfeyxiexzf;
        } finally {
            interfaceC3078Ujhhgtgfeyxiexzf.mo1382Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC0901feyxiexzfUjhhgtg m4594Ujhhgtgfeyxiexzf(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = this.f9598Ujhhgtgfeyxiexzf;
        C0256Ujhhgtgfeyxiexzf c0256UjhhgtgfeyxiexzfM4576Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf.m4576Ujhhgtgfeyxiexzf(cls);
        C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg = this.f9612Ujhhgtgfeyxiexzf;
        boolean z = i == 4 || c3087Ujhhgtgfeyxiexzf.f9564Ujhhgtgfeyxiexzf;
        C1469feyxiexzfUjhhgtg c1469feyxiexzfUjhhgtg = C3220feyxiexzfUjhhgtg.f10115Ujhhgtgfeyxiexzf;
        Boolean bool = (Boolean) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg);
        if (bool == null || (bool.booleanValue() && !z)) {
            c1471feyxiexzfUjhhgtg = new C1471feyxiexzfUjhhgtg();
            C2639feyxiexzfUjhhgtg c2639feyxiexzfUjhhgtg = this.f9612Ujhhgtgfeyxiexzf.f5110Ujhhgtgfeyxiexzf;
            C2639feyxiexzfUjhhgtg c2639feyxiexzfUjhhgtg2 = c1471feyxiexzfUjhhgtg.f5110Ujhhgtgfeyxiexzf;
            c2639feyxiexzfUjhhgtg2.mo2537Ujhhgtgfeyxiexzf(c2639feyxiexzfUjhhgtg);
            c2639feyxiexzfUjhhgtg2.put(c1469feyxiexzfUjhhgtg, Boolean.valueOf(z));
        }
        C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg2 = c1471feyxiexzfUjhhgtg;
        InterfaceC3106Ujhhgtgfeyxiexzf interfaceC3106UjhhgtgfeyxiexzfM2472Ujhhgtgfeyxiexzf = this.f9605Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().m2472Ujhhgtgfeyxiexzf(obj);
        try {
            return c0256UjhhgtgfeyxiexzfM4576Ujhhgtgfeyxiexzf.m1425Ujhhgtgfeyxiexzf(this.f9609Ujhhgtgfeyxiexzf, this.f9610Ujhhgtgfeyxiexzf, new C2501feyxiexzfUjhhgtg(i, 4, this), interfaceC3106UjhhgtgfeyxiexzfM2472Ujhhgtgfeyxiexzf, c1471feyxiexzfUjhhgtg2);
        } finally {
            interfaceC3106UjhhgtgfeyxiexzfM2472Ujhhgtgfeyxiexzf.mo752Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4595Ujhhgtgfeyxiexzf() {
        InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf;
        boolean zM4592Ujhhgtgfeyxiexzf;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m4598Ujhhgtgfeyxiexzf("Retrieved data", this.f9615Ujhhgtgfeyxiexzf, "data: " + this.f9622feyxiexzfUjhhgtg + ", cache key: " + this.f9620feyxiexzfUjhhgtg + ", fetcher: " + this.f9623feyxiexzfUjhhgtg);
        }
        C0263Ujhhgtgfeyxiexzf c0263Ujhhgtgfeyxiexzf = null;
        if (this.f9617Ujhhgtgfeyxiexzf.f11193Ujhhgtgfeyxiexzf.containsKey(AbstractC3594Ujhhgtgfeyxiexzf.class) && (supplier = this.f9618Ujhhgtgfeyxiexzf) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f9618Ujhhgtgfeyxiexzf.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f9618Ujhhgtgfeyxiexzf = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf = m4593Ujhhgtgfeyxiexzf(this.f9623feyxiexzfUjhhgtg, this.f9622feyxiexzfUjhhgtg, this.f9630feyxiexzfUjhhgtg);
        } catch (C3591Ujhhgtgfeyxiexzf e2) {
            InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = this.f9621feyxiexzfUjhhgtg;
            int i = this.f9630feyxiexzfUjhhgtg;
            e2.f11174Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
            e2.f11175Ujhhgtgfeyxiexzf = i;
            e2.f11176Ujhhgtgfeyxiexzf = null;
            this.f9599Ujhhgtgfeyxiexzf.add(e2);
            interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf = null;
        }
        if (interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf == null) {
            m4603Ujhhgtgfeyxiexzf();
            return;
        }
        int i2 = this.f9630feyxiexzfUjhhgtg;
        boolean z = this.f9627feyxiexzfUjhhgtg;
        if (interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf instanceof InterfaceC0649Ujhhgtgfeyxiexzf) {
            ((InterfaceC0649Ujhhgtgfeyxiexzf) interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf).mo1912Ujhhgtgfeyxiexzf();
        }
        if (((C0263Ujhhgtgfeyxiexzf) this.f9603Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf) != null) {
            c0263Ujhhgtgfeyxiexzf = (C0263Ujhhgtgfeyxiexzf) C0263Ujhhgtgfeyxiexzf.f1644Ujhhgtgfeyxiexzf.mo2933Ujhhgtgfeyxiexzf();
            c0263Ujhhgtgfeyxiexzf.f1648Ujhhgtgfeyxiexzf = false;
            c0263Ujhhgtgfeyxiexzf.f1647Ujhhgtgfeyxiexzf = true;
            c0263Ujhhgtgfeyxiexzf.f1646Ujhhgtgfeyxiexzf = interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf;
            interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf = c0263Ujhhgtgfeyxiexzf;
        }
        if (this.f9617Ujhhgtgfeyxiexzf.f11193Ujhhgtgfeyxiexzf.containsKey(AbstractC3594Ujhhgtgfeyxiexzf.class)) {
            m4602Ujhhgtgfeyxiexzf();
        }
        m4605Ujhhgtgfeyxiexzf();
        C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf = this.f9613Ujhhgtgfeyxiexzf;
        synchronized (c3338Ujhhgtgfeyxiexzf) {
            c3338Ujhhgtgfeyxiexzf.f10430Ujhhgtgfeyxiexzf = interfaceC0901feyxiexzfUjhhgtgM4593Ujhhgtgfeyxiexzf;
            c3338Ujhhgtgfeyxiexzf.f10431Ujhhgtgfeyxiexzf = i2;
            c3338Ujhhgtgfeyxiexzf.f10438Ujhhgtgfeyxiexzf = z;
        }
        synchronized (c3338Ujhhgtgfeyxiexzf) {
            try {
                c3338Ujhhgtgfeyxiexzf.f10418Ujhhgtgfeyxiexzf.m2600Ujhhgtgfeyxiexzf();
                if (c3338Ujhhgtgfeyxiexzf.f10437Ujhhgtgfeyxiexzf) {
                    c3338Ujhhgtgfeyxiexzf.f10430Ujhhgtgfeyxiexzf.mo1444Ujhhgtgfeyxiexzf();
                    c3338Ujhhgtgfeyxiexzf.m4846Ujhhgtgfeyxiexzf();
                } else {
                    if (c3338Ujhhgtgfeyxiexzf.f10417Ujhhgtgfeyxiexzf.f10452Ujhhgtgfeyxiexzf.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c3338Ujhhgtgfeyxiexzf.f10432Ujhhgtgfeyxiexzf) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf.f10421Ujhhgtgfeyxiexzf;
                    InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf.f10430Ujhhgtgfeyxiexzf;
                    boolean z2 = c3338Ujhhgtgfeyxiexzf.f10428Ujhhgtgfeyxiexzf;
                    C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf.f10427Ujhhgtgfeyxiexzf;
                    InterfaceC3367Ujhhgtgfeyxiexzf interfaceC3367Ujhhgtgfeyxiexzf = c3338Ujhhgtgfeyxiexzf.f10419Ujhhgtgfeyxiexzf;
                    c2466feyxiexzfUjhhgtg.getClass();
                    c3338Ujhhgtgfeyxiexzf.f10435Ujhhgtgfeyxiexzf = new C3368Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtg, z2, true, c3340feyxiexzfUjhhgtg, interfaceC3367Ujhhgtgfeyxiexzf);
                    c3338Ujhhgtgfeyxiexzf.f10432Ujhhgtgfeyxiexzf = true;
                    C3342feyxiexzfUjhhgtg c3342feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf.f10417Ujhhgtgfeyxiexzf;
                    c3342feyxiexzfUjhhgtg.getClass();
                    ArrayList<C3341Ujhhgtgfeyxiexzf> arrayList = new ArrayList(c3342feyxiexzfUjhhgtg.f10452Ujhhgtgfeyxiexzf);
                    c3338Ujhhgtgfeyxiexzf.m4844Ujhhgtgfeyxiexzf(arrayList.size() + 1);
                    ((C3334feyxiexzfUjhhgtg) c3338Ujhhgtgfeyxiexzf.f10422Ujhhgtgfeyxiexzf).m4823Ujhhgtgfeyxiexzf(c3338Ujhhgtgfeyxiexzf, c3338Ujhhgtgfeyxiexzf.f10427Ujhhgtgfeyxiexzf, c3338Ujhhgtgfeyxiexzf.f10435Ujhhgtgfeyxiexzf);
                    for (C3341Ujhhgtgfeyxiexzf c3341Ujhhgtgfeyxiexzf : arrayList) {
                        c3341Ujhhgtgfeyxiexzf.f10451Ujhhgtgfeyxiexzf.execute(new RunnableC3333feyxiexzfUjhhgtg(c3338Ujhhgtgfeyxiexzf, c3341Ujhhgtgfeyxiexzf.f10450Ujhhgtgfeyxiexzf, 1));
                    }
                    c3338Ujhhgtgfeyxiexzf.m4843Ujhhgtgfeyxiexzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9628feyxiexzfUjhhgtg = 5;
        try {
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = this.f9603Ujhhgtgfeyxiexzf;
            if (((C0263Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf) != null) {
                C3331feyxiexzfUjhhgtg c3331feyxiexzfUjhhgtg = this.f9601Ujhhgtgfeyxiexzf;
                C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg = this.f9612Ujhhgtgfeyxiexzf;
                c2366Ujhhgtgfeyxiexzf.getClass();
                try {
                    c3331feyxiexzfUjhhgtg.m4818Ujhhgtgfeyxiexzf().mo3706Ujhhgtgfeyxiexzf((InterfaceC0156Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, new C2366Ujhhgtgfeyxiexzf((InterfaceC0887feyxiexzfUjhhgtg) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf, (C0263Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf, c1471feyxiexzfUjhhgtg, 5));
                    ((C0263Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf).m1447Ujhhgtgfeyxiexzf();
                } catch (Throwable th2) {
                    ((C0263Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf).m1447Ujhhgtgfeyxiexzf();
                    throw th2;
                }
            }
            if (c0263Ujhhgtgfeyxiexzf != null) {
                c0263Ujhhgtgfeyxiexzf.m1447Ujhhgtgfeyxiexzf();
            }
            C3095Ujhhgtgfeyxiexzf c3095Ujhhgtgfeyxiexzf = this.f9604Ujhhgtgfeyxiexzf;
            synchronized (c3095Ujhhgtgfeyxiexzf) {
                c3095Ujhhgtgfeyxiexzf.f9595Ujhhgtgfeyxiexzf = true;
                zM4592Ujhhgtgfeyxiexzf = c3095Ujhhgtgfeyxiexzf.m4592Ujhhgtgfeyxiexzf();
            }
            if (zM4592Ujhhgtgfeyxiexzf) {
                m4600Ujhhgtgfeyxiexzf();
            }
        } catch (Throwable th3) {
            if (c0263Ujhhgtgfeyxiexzf != null) {
                c0263Ujhhgtgfeyxiexzf.m1447Ujhhgtgfeyxiexzf();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC3073Ujhhgtgfeyxiexzf m4596Ujhhgtgfeyxiexzf() {
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(this.f9628feyxiexzfUjhhgtg);
        C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = this.f9598Ujhhgtgfeyxiexzf;
        if (iM2713feyxiexzfUjhhgtg == 1) {
            return new C0900feyxiexzfUjhhgtg(c3087Ujhhgtgfeyxiexzf, this);
        }
        if (iM2713feyxiexzfUjhhgtg == 2) {
            return new C3070Ujhhgtgfeyxiexzf(c3087Ujhhgtgfeyxiexzf.m4574Ujhhgtgfeyxiexzf(), c3087Ujhhgtgfeyxiexzf, this);
        }
        if (iM2713feyxiexzfUjhhgtg == 3) {
            return new C1226feyxiexzfUjhhgtg(c3087Ujhhgtgfeyxiexzf, this);
        }
        if (iM2713feyxiexzfUjhhgtg == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC1225feyxiexzfUjhhgtg.m2715feyxiexzfUjhhgtg(this.f9628feyxiexzfUjhhgtg)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m4597Ujhhgtgfeyxiexzf(int i) {
        boolean z;
        boolean z2;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        if (iM2713feyxiexzfUjhhgtg == 0) {
            switch (this.f9611Ujhhgtgfeyxiexzf.f9834Ujhhgtgfeyxiexzf) {
                case 0:
                case 1:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return m4597Ujhhgtgfeyxiexzf(2);
        }
        if (iM2713feyxiexzfUjhhgtg != 1) {
            if (iM2713feyxiexzfUjhhgtg == 2) {
                return 4;
            }
            if (iM2713feyxiexzfUjhhgtg == 3 || iM2713feyxiexzfUjhhgtg == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC1225feyxiexzfUjhhgtg.m2715feyxiexzfUjhhgtg(i)));
        }
        switch (this.f9611Ujhhgtgfeyxiexzf.f9834Ujhhgtgfeyxiexzf) {
            case 0:
                z2 = false;
                break;
            case 1:
            default:
                z2 = true;
                break;
        }
        if (z2) {
            return 3;
        }
        return m4597Ujhhgtgfeyxiexzf(3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4598Ujhhgtgfeyxiexzf(String str, long j, String str2) {
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, " in ");
        sbM4805Ujhhgtgfeyxiexzf.append(AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(j));
        sbM4805Ujhhgtgfeyxiexzf.append(", load key: ");
        sbM4805Ujhhgtgfeyxiexzf.append(this.f9608Ujhhgtgfeyxiexzf);
        sbM4805Ujhhgtgfeyxiexzf.append(str2 != null ? ", ".concat(str2) : "");
        sbM4805Ujhhgtgfeyxiexzf.append(", thread: ");
        sbM4805Ujhhgtgfeyxiexzf.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM4805Ujhhgtgfeyxiexzf.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4599Ujhhgtgfeyxiexzf() {
        boolean zM4592Ujhhgtgfeyxiexzf;
        if (this.f9617Ujhhgtgfeyxiexzf.f11193Ujhhgtgfeyxiexzf.containsKey(AbstractC3594Ujhhgtgfeyxiexzf.class)) {
            m4602Ujhhgtgfeyxiexzf();
        }
        m4605Ujhhgtgfeyxiexzf();
        C3591Ujhhgtgfeyxiexzf c3591Ujhhgtgfeyxiexzf = new C3591Ujhhgtgfeyxiexzf("Failed to load resource", new ArrayList(this.f9599Ujhhgtgfeyxiexzf));
        C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf = this.f9613Ujhhgtgfeyxiexzf;
        synchronized (c3338Ujhhgtgfeyxiexzf) {
            c3338Ujhhgtgfeyxiexzf.f10433Ujhhgtgfeyxiexzf = c3591Ujhhgtgfeyxiexzf;
        }
        synchronized (c3338Ujhhgtgfeyxiexzf) {
            try {
                c3338Ujhhgtgfeyxiexzf.f10418Ujhhgtgfeyxiexzf.m2600Ujhhgtgfeyxiexzf();
                if (c3338Ujhhgtgfeyxiexzf.f10437Ujhhgtgfeyxiexzf) {
                    c3338Ujhhgtgfeyxiexzf.m4846Ujhhgtgfeyxiexzf();
                } else {
                    if (c3338Ujhhgtgfeyxiexzf.f10417Ujhhgtgfeyxiexzf.f10452Ujhhgtgfeyxiexzf.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c3338Ujhhgtgfeyxiexzf.f10434Ujhhgtgfeyxiexzf) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c3338Ujhhgtgfeyxiexzf.f10434Ujhhgtgfeyxiexzf = true;
                    C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf.f10427Ujhhgtgfeyxiexzf;
                    C3342feyxiexzfUjhhgtg c3342feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf.f10417Ujhhgtgfeyxiexzf;
                    c3342feyxiexzfUjhhgtg.getClass();
                    ArrayList<C3341Ujhhgtgfeyxiexzf> arrayList = new ArrayList(c3342feyxiexzfUjhhgtg.f10452Ujhhgtgfeyxiexzf);
                    c3338Ujhhgtgfeyxiexzf.m4844Ujhhgtgfeyxiexzf(arrayList.size() + 1);
                    ((C3334feyxiexzfUjhhgtg) c3338Ujhhgtgfeyxiexzf.f10422Ujhhgtgfeyxiexzf).m4823Ujhhgtgfeyxiexzf(c3338Ujhhgtgfeyxiexzf, c3340feyxiexzfUjhhgtg, null);
                    for (C3341Ujhhgtgfeyxiexzf c3341Ujhhgtgfeyxiexzf : arrayList) {
                        c3341Ujhhgtgfeyxiexzf.f10451Ujhhgtgfeyxiexzf.execute(new RunnableC3333feyxiexzfUjhhgtg(c3338Ujhhgtgfeyxiexzf, c3341Ujhhgtgfeyxiexzf.f10450Ujhhgtgfeyxiexzf, 0));
                    }
                    c3338Ujhhgtgfeyxiexzf.m4843Ujhhgtgfeyxiexzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3095Ujhhgtgfeyxiexzf c3095Ujhhgtgfeyxiexzf = this.f9604Ujhhgtgfeyxiexzf;
        synchronized (c3095Ujhhgtgfeyxiexzf) {
            c3095Ujhhgtgfeyxiexzf.f9596Ujhhgtgfeyxiexzf = true;
            zM4592Ujhhgtgfeyxiexzf = c3095Ujhhgtgfeyxiexzf.m4592Ujhhgtgfeyxiexzf();
        }
        if (zM4592Ujhhgtgfeyxiexzf) {
            m4600Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4600Ujhhgtgfeyxiexzf() {
        C3095Ujhhgtgfeyxiexzf c3095Ujhhgtgfeyxiexzf = this.f9604Ujhhgtgfeyxiexzf;
        synchronized (c3095Ujhhgtgfeyxiexzf) {
            c3095Ujhhgtgfeyxiexzf.f9595Ujhhgtgfeyxiexzf = false;
            c3095Ujhhgtgfeyxiexzf.f9594Ujhhgtgfeyxiexzf = false;
            c3095Ujhhgtgfeyxiexzf.f9596Ujhhgtgfeyxiexzf = false;
        }
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = this.f9603Ujhhgtgfeyxiexzf;
        c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf = null;
        c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf = null;
        c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf = null;
        C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = this.f9598Ujhhgtgfeyxiexzf;
        c3087Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9550Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9560Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9553Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9557Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9555Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9561Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9556Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9562Ujhhgtgfeyxiexzf = null;
        c3087Ujhhgtgfeyxiexzf.f9547Ujhhgtgfeyxiexzf.clear();
        c3087Ujhhgtgfeyxiexzf.f9558Ujhhgtgfeyxiexzf = false;
        c3087Ujhhgtgfeyxiexzf.f9548Ujhhgtgfeyxiexzf.clear();
        c3087Ujhhgtgfeyxiexzf.f9559Ujhhgtgfeyxiexzf = false;
        this.f9625feyxiexzfUjhhgtg = false;
        this.f9605Ujhhgtgfeyxiexzf = null;
        this.f9606Ujhhgtgfeyxiexzf = null;
        this.f9612Ujhhgtgfeyxiexzf = null;
        this.f9607Ujhhgtgfeyxiexzf = null;
        this.f9608Ujhhgtgfeyxiexzf = null;
        this.f9613Ujhhgtgfeyxiexzf = null;
        this.f9628feyxiexzfUjhhgtg = 0;
        this.f9624feyxiexzfUjhhgtg = null;
        this.f9619Ujhhgtgfeyxiexzf = null;
        this.f9620feyxiexzfUjhhgtg = null;
        this.f9622feyxiexzfUjhhgtg = null;
        this.f9630feyxiexzfUjhhgtg = 0;
        this.f9623feyxiexzfUjhhgtg = null;
        this.f9615Ujhhgtgfeyxiexzf = 0L;
        this.f9626feyxiexzfUjhhgtg = false;
        this.f9616Ujhhgtgfeyxiexzf = null;
        this.f9599Ujhhgtgfeyxiexzf.clear();
        this.f9602Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4601Ujhhgtgfeyxiexzf(int i) {
        this.f9629feyxiexzfUjhhgtg = i;
        C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf = this.f9613Ujhhgtgfeyxiexzf;
        (c3338Ujhhgtgfeyxiexzf.f10429Ujhhgtgfeyxiexzf ? c3338Ujhhgtgfeyxiexzf.f10425Ujhhgtgfeyxiexzf : c3338Ujhhgtgfeyxiexzf.f10424Ujhhgtgfeyxiexzf).execute(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m4602Ujhhgtgfeyxiexzf() {
        if (!this.f9617Ujhhgtgfeyxiexzf.f11193Ujhhgtgfeyxiexzf.containsKey(AbstractC3594Ujhhgtgfeyxiexzf.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f9618Ujhhgtgfeyxiexzf;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f9618Ujhhgtgfeyxiexzf = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m4603Ujhhgtgfeyxiexzf() {
        this.f9619Ujhhgtgfeyxiexzf = Thread.currentThread();
        int i = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
        this.f9615Ujhhgtgfeyxiexzf = SystemClock.elapsedRealtimeNanos();
        boolean zMo2377Ujhhgtgfeyxiexzf = false;
        while (!this.f9626feyxiexzfUjhhgtg && this.f9624feyxiexzfUjhhgtg != null && !(zMo2377Ujhhgtgfeyxiexzf = this.f9624feyxiexzfUjhhgtg.mo2377Ujhhgtgfeyxiexzf())) {
            this.f9628feyxiexzfUjhhgtg = m4597Ujhhgtgfeyxiexzf(this.f9628feyxiexzfUjhhgtg);
            this.f9624feyxiexzfUjhhgtg = m4596Ujhhgtgfeyxiexzf();
            if (this.f9628feyxiexzfUjhhgtg == 4) {
                m4601Ujhhgtgfeyxiexzf(2);
                return;
            }
        }
        if ((this.f9628feyxiexzfUjhhgtg == 6 || this.f9626feyxiexzfUjhhgtg) && !zMo2377Ujhhgtgfeyxiexzf) {
            m4599Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4604Ujhhgtgfeyxiexzf() {
        String str;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(this.f9629feyxiexzfUjhhgtg);
        if (iM2713feyxiexzfUjhhgtg == 0) {
            this.f9628feyxiexzfUjhhgtg = m4597Ujhhgtgfeyxiexzf(1);
            this.f9624feyxiexzfUjhhgtg = m4596Ujhhgtgfeyxiexzf();
            m4603Ujhhgtgfeyxiexzf();
        } else {
            if (iM2713feyxiexzfUjhhgtg == 1) {
                m4603Ujhhgtgfeyxiexzf();
                return;
            }
            if (iM2713feyxiexzfUjhhgtg == 2) {
                m4595Ujhhgtgfeyxiexzf();
                return;
            }
            int i = this.f9629feyxiexzfUjhhgtg;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4605Ujhhgtgfeyxiexzf() {
        Throwable th;
        this.f9600Ujhhgtgfeyxiexzf.m2600Ujhhgtgfeyxiexzf();
        if (!this.f9625feyxiexzfUjhhgtg) {
            this.f9625feyxiexzfUjhhgtg = true;
            return;
        }
        if (this.f9599Ujhhgtgfeyxiexzf.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f9599Ujhhgtgfeyxiexzf;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}
