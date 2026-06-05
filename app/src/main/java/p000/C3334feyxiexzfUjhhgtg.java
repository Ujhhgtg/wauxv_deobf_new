package p000;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳᛱfeyxiexzfᛱᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3334feyxiexzfUjhhgtg implements InterfaceC3337Ujhhgtgfeyxiexzf, InterfaceC3367Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final boolean f10382Ujhhgtgfeyxiexzf = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3107Ujhhgtgfeyxiexzf f10383Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3339feyxiexzfUjhhgtg f10384Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0180Ujhhgtgfeyxiexzf f10385Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3332feyxiexzfUjhhgtg f10386Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2667feyxiexzfUjhhgtg f10387Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2344Ujhhgtgfeyxiexzf f10388Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2366Ujhhgtgfeyxiexzf f10389Ujhhgtgfeyxiexzf;

    public C3334feyxiexzfUjhhgtg(C0180Ujhhgtgfeyxiexzf c0180Ujhhgtgfeyxiexzf, C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf, ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg, ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg2, ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg3, ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg4) {
        this.f10385Ujhhgtgfeyxiexzf = c0180Ujhhgtgfeyxiexzf;
        C3331feyxiexzfUjhhgtg c3331feyxiexzfUjhhgtg = new C3331feyxiexzfUjhhgtg(c0709Ujhhgtgfeyxiexzf);
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf();
        this.f10389Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf;
        synchronized (this) {
            synchronized (c2366Ujhhgtgfeyxiexzf) {
                c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf = this;
            }
        }
        this.f10384Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(0);
        this.f10383Ujhhgtgfeyxiexzf = new C3107Ujhhgtgfeyxiexzf(2);
        C3332feyxiexzfUjhhgtg c3332feyxiexzfUjhhgtg = new C3332feyxiexzfUjhhgtg();
        c3332feyxiexzfUjhhgtg.f10378Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2791Ujhhgtgfeyxiexzf(Opcodes.FCMPG, new C2965Ujhhgtgfeyxiexzf(23, c3332feyxiexzfUjhhgtg));
        c3332feyxiexzfUjhhgtg.f10372Ujhhgtgfeyxiexzf = executorServiceC3600feyxiexzfUjhhgtg;
        c3332feyxiexzfUjhhgtg.f10373Ujhhgtgfeyxiexzf = executorServiceC3600feyxiexzfUjhhgtg2;
        c3332feyxiexzfUjhhgtg.f10374Ujhhgtgfeyxiexzf = executorServiceC3600feyxiexzfUjhhgtg3;
        c3332feyxiexzfUjhhgtg.f10375Ujhhgtgfeyxiexzf = executorServiceC3600feyxiexzfUjhhgtg4;
        c3332feyxiexzfUjhhgtg.f10376Ujhhgtgfeyxiexzf = this;
        c3332feyxiexzfUjhhgtg.f10377Ujhhgtgfeyxiexzf = this;
        this.f10386Ujhhgtgfeyxiexzf = c3332feyxiexzfUjhhgtg;
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf();
        c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2791Ujhhgtgfeyxiexzf(Opcodes.FCMPG, new C2965Ujhhgtgfeyxiexzf(22, c2344Ujhhgtgfeyxiexzf));
        c2344Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf = c3331feyxiexzfUjhhgtg;
        this.f10388Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf;
        this.f10387Ujhhgtgfeyxiexzf = new C2667feyxiexzfUjhhgtg();
        c0180Ujhhgtgfeyxiexzf.f1385Ujhhgtgfeyxiexzf = this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m4819Ujhhgtgfeyxiexzf(String str, long j, C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg) {
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, " in ");
        sbM4805Ujhhgtgfeyxiexzf.append(AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(j));
        sbM4805Ujhhgtgfeyxiexzf.append("ms, key: ");
        sbM4805Ujhhgtgfeyxiexzf.append(c3340feyxiexzfUjhhgtg);
        Log.v("Engine", sbM4805Ujhhgtgfeyxiexzf.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m4820Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg) {
        if (!(interfaceC0901feyxiexzfUjhhgtg instanceof C3368Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3368Ujhhgtgfeyxiexzf) interfaceC0901feyxiexzfUjhhgtg).m4878Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2366Ujhhgtgfeyxiexzf m4821Ujhhgtgfeyxiexzf(C3589Ujhhgtgfeyxiexzf c3589Ujhhgtgfeyxiexzf, Object obj, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, int i, int i2, Class cls, Class cls2, EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, C3183feyxiexzfUjhhgtg c3183feyxiexzfUjhhgtg, C2639feyxiexzfUjhhgtg c2639feyxiexzfUjhhgtg, boolean z, boolean z2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg, boolean z3, boolean z4, C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg, ExecutorC3361Ujhhgtgfeyxiexzf executorC3361Ujhhgtgfeyxiexzf) {
        long jElapsedRealtimeNanos;
        if (f10382Ujhhgtgfeyxiexzf) {
            int i3 = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f10384Ujhhgtgfeyxiexzf.getClass();
        C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg = new C3340feyxiexzfUjhhgtg(obj, interfaceC0156Ujhhgtgfeyxiexzf, i, i2, c2639feyxiexzfUjhhgtg, cls, cls2, c1471feyxiexzfUjhhgtg);
        synchronized (this) {
            try {
                C3368Ujhhgtgfeyxiexzf c3368UjhhgtgfeyxiexzfM4822Ujhhgtgfeyxiexzf = m4822Ujhhgtgfeyxiexzf(c3340feyxiexzfUjhhgtg, z3, jElapsedRealtimeNanos);
                if (c3368UjhhgtgfeyxiexzfM4822Ujhhgtgfeyxiexzf == null) {
                    return m4825Ujhhgtgfeyxiexzf(c3589Ujhhgtgfeyxiexzf, obj, interfaceC0156Ujhhgtgfeyxiexzf, i, i2, cls, cls2, enumC0836feyxiexzfUjhhgtg, c3183feyxiexzfUjhhgtg, c2639feyxiexzfUjhhgtg, z, z2, c1471feyxiexzfUjhhgtg, z3, z4, c1046feyxiexzfUjhhgtg, executorC3361Ujhhgtgfeyxiexzf, c3340feyxiexzfUjhhgtg, jElapsedRealtimeNanos);
                }
                c1046feyxiexzfUjhhgtg.m2545Ujhhgtgfeyxiexzf(c3368UjhhgtgfeyxiexzfM4822Ujhhgtgfeyxiexzf, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3368Ujhhgtgfeyxiexzf m4822Ujhhgtgfeyxiexzf(C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg, boolean z, long j) throws Throwable {
        Throwable th;
        C3368Ujhhgtgfeyxiexzf c3368Ujhhgtgfeyxiexzf;
        Object obj;
        C3334feyxiexzfUjhhgtg c3334feyxiexzfUjhhgtg;
        C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg2;
        C3368Ujhhgtgfeyxiexzf c3368Ujhhgtgfeyxiexzf2;
        if (z) {
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = this.f10389Ujhhgtgfeyxiexzf;
            synchronized (c2366Ujhhgtgfeyxiexzf) {
                try {
                    C3014Ujhhgtgfeyxiexzf c3014Ujhhgtgfeyxiexzf = (C3014Ujhhgtgfeyxiexzf) ((HashMap) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).get(c3340feyxiexzfUjhhgtg);
                    if (c3014Ujhhgtgfeyxiexzf == null) {
                        c3368Ujhhgtgfeyxiexzf = null;
                    } else {
                        c3368Ujhhgtgfeyxiexzf = (C3368Ujhhgtgfeyxiexzf) c3014Ujhhgtgfeyxiexzf.get();
                        if (c3368Ujhhgtgfeyxiexzf == null) {
                            try {
                                c2366Ujhhgtgfeyxiexzf.m3597Ujhhgtgfeyxiexzf(c3014Ujhhgtgfeyxiexzf);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (c3368Ujhhgtgfeyxiexzf != null) {
                        c3368Ujhhgtgfeyxiexzf.m4877Ujhhgtgfeyxiexzf();
                    }
                    if (c3368Ujhhgtgfeyxiexzf != null) {
                        if (f10382Ujhhgtgfeyxiexzf) {
                            m4819Ujhhgtgfeyxiexzf("Loaded resource from active resources", j, c3340feyxiexzfUjhhgtg);
                        }
                        return c3368Ujhhgtgfeyxiexzf;
                    }
                    C0180Ujhhgtgfeyxiexzf c0180Ujhhgtgfeyxiexzf = this.f10385Ujhhgtgfeyxiexzf;
                    synchronized (c0180Ujhhgtgfeyxiexzf) {
                        try {
                            C0273Ujhhgtgfeyxiexzf c0273Ujhhgtgfeyxiexzf = (C0273Ujhhgtgfeyxiexzf) c0180Ujhhgtgfeyxiexzf.f1382Ujhhgtgfeyxiexzf.remove(c3340feyxiexzfUjhhgtg);
                            if (c0273Ujhhgtgfeyxiexzf == null) {
                                obj = null;
                            } else {
                                c0180Ujhhgtgfeyxiexzf.f1384Ujhhgtgfeyxiexzf -= (long) c0273Ujhhgtgfeyxiexzf.f1673Ujhhgtgfeyxiexzf;
                                obj = c0273Ujhhgtgfeyxiexzf.f1672Ujhhgtgfeyxiexzf;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg = (InterfaceC0901feyxiexzfUjhhgtg) obj;
                    if (interfaceC0901feyxiexzfUjhhgtg == null) {
                        c3334feyxiexzfUjhhgtg = this;
                        c3340feyxiexzfUjhhgtg2 = c3340feyxiexzfUjhhgtg;
                        c3368Ujhhgtgfeyxiexzf2 = null;
                    } else if (interfaceC0901feyxiexzfUjhhgtg instanceof C3368Ujhhgtgfeyxiexzf) {
                        c3368Ujhhgtgfeyxiexzf2 = (C3368Ujhhgtgfeyxiexzf) interfaceC0901feyxiexzfUjhhgtg;
                        c3334feyxiexzfUjhhgtg = this;
                        c3340feyxiexzfUjhhgtg2 = c3340feyxiexzfUjhhgtg;
                    } else {
                        c3334feyxiexzfUjhhgtg = this;
                        c3340feyxiexzfUjhhgtg2 = c3340feyxiexzfUjhhgtg;
                        c3368Ujhhgtgfeyxiexzf2 = new C3368Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtg, true, true, c3340feyxiexzfUjhhgtg2, c3334feyxiexzfUjhhgtg);
                    }
                    if (c3368Ujhhgtgfeyxiexzf2 != null) {
                        c3368Ujhhgtgfeyxiexzf2.m4877Ujhhgtgfeyxiexzf();
                        c3334feyxiexzfUjhhgtg.f10389Ujhhgtgfeyxiexzf.m3596Ujhhgtgfeyxiexzf(c3340feyxiexzfUjhhgtg2, c3368Ujhhgtgfeyxiexzf2);
                    }
                    if (c3368Ujhhgtgfeyxiexzf2 != null) {
                        if (f10382Ujhhgtgfeyxiexzf) {
                            m4819Ujhhgtgfeyxiexzf("Loaded resource from cache", j, c3340feyxiexzfUjhhgtg2);
                        }
                        return c3368Ujhhgtgfeyxiexzf2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final synchronized void m4823Ujhhgtgfeyxiexzf(C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, C3368Ujhhgtgfeyxiexzf c3368Ujhhgtgfeyxiexzf) {
        if (c3368Ujhhgtgfeyxiexzf != null) {
            try {
                if (c3368Ujhhgtgfeyxiexzf.f10529Ujhhgtgfeyxiexzf) {
                    this.f10389Ujhhgtgfeyxiexzf.m3596Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, c3368Ujhhgtgfeyxiexzf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf = this.f10383Ujhhgtgfeyxiexzf;
        c3107Ujhhgtgfeyxiexzf.getClass();
        c3338Ujhhgtgfeyxiexzf.getClass();
        HashMap map = c3107Ujhhgtgfeyxiexzf.f9652Ujhhgtgfeyxiexzf;
        if (c3338Ujhhgtgfeyxiexzf.equals(map.get(interfaceC0156Ujhhgtgfeyxiexzf))) {
            map.remove(interfaceC0156Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4824Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, C3368Ujhhgtgfeyxiexzf c3368Ujhhgtgfeyxiexzf) {
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = this.f10389Ujhhgtgfeyxiexzf;
        synchronized (c2366Ujhhgtgfeyxiexzf) {
            C3014Ujhhgtgfeyxiexzf c3014Ujhhgtgfeyxiexzf = (C3014Ujhhgtgfeyxiexzf) ((HashMap) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).remove(interfaceC0156Ujhhgtgfeyxiexzf);
            if (c3014Ujhhgtgfeyxiexzf != null) {
                c3014Ujhhgtgfeyxiexzf.f9367Ujhhgtgfeyxiexzf = null;
                c3014Ujhhgtgfeyxiexzf.clear();
            }
        }
        if (c3368Ujhhgtgfeyxiexzf.f10529Ujhhgtgfeyxiexzf) {
        } else {
            this.f10387Ujhhgtgfeyxiexzf.m4021Ujhhgtgfeyxiexzf(c3368Ujhhgtgfeyxiexzf, false);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2366Ujhhgtgfeyxiexzf m4825Ujhhgtgfeyxiexzf(C3589Ujhhgtgfeyxiexzf c3589Ujhhgtgfeyxiexzf, Object obj, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, int i, int i2, Class cls, Class cls2, EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, C3183feyxiexzfUjhhgtg c3183feyxiexzfUjhhgtg, Map map, boolean z, boolean z2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg, boolean z3, boolean z4, C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg, Executor executor, C3340feyxiexzfUjhhgtg c3340feyxiexzfUjhhgtg, long j) {
        ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg;
        C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf = (C3338Ujhhgtgfeyxiexzf) this.f10383Ujhhgtgfeyxiexzf.f9652Ujhhgtgfeyxiexzf.get(c3340feyxiexzfUjhhgtg);
        if (c3338Ujhhgtgfeyxiexzf != null) {
            c3338Ujhhgtgfeyxiexzf.m4841Ujhhgtgfeyxiexzf(c1046feyxiexzfUjhhgtg, executor);
            if (f10382Ujhhgtgfeyxiexzf) {
                m4819Ujhhgtgfeyxiexzf("Added to existing load", j, c3340feyxiexzfUjhhgtg);
            }
            return new C2366Ujhhgtgfeyxiexzf(this, c1046feyxiexzfUjhhgtg, c3338Ujhhgtgfeyxiexzf);
        }
        C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf2 = (C3338Ujhhgtgfeyxiexzf) ((C2366Ujhhgtgfeyxiexzf) this.f10386Ujhhgtgfeyxiexzf.f10378Ujhhgtgfeyxiexzf).mo2933Ujhhgtgfeyxiexzf();
        synchronized (c3338Ujhhgtgfeyxiexzf2) {
            c3338Ujhhgtgfeyxiexzf2.f10427Ujhhgtgfeyxiexzf = c3340feyxiexzfUjhhgtg;
            c3338Ujhhgtgfeyxiexzf2.f10428Ujhhgtgfeyxiexzf = z3;
            c3338Ujhhgtgfeyxiexzf2.f10429Ujhhgtgfeyxiexzf = z4;
        }
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10388Ujhhgtgfeyxiexzf;
        RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf = (RunnableC3096Ujhhgtgfeyxiexzf) ((C2366Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf).mo2933Ujhhgtgfeyxiexzf();
        int i3 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i3 + 1;
        C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf.f9598Ujhhgtgfeyxiexzf;
        C3331feyxiexzfUjhhgtg c3331feyxiexzfUjhhgtg = runnableC3096Ujhhgtgfeyxiexzf.f9601Ujhhgtgfeyxiexzf;
        c3087Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf = c3589Ujhhgtgfeyxiexzf;
        c3087Ujhhgtgfeyxiexzf.f9550Ujhhgtgfeyxiexzf = obj;
        c3087Ujhhgtgfeyxiexzf.f9560Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
        c3087Ujhhgtgfeyxiexzf.f9551Ujhhgtgfeyxiexzf = i;
        c3087Ujhhgtgfeyxiexzf.f9552Ujhhgtgfeyxiexzf = i2;
        c3087Ujhhgtgfeyxiexzf.f9562Ujhhgtgfeyxiexzf = c3183feyxiexzfUjhhgtg;
        c3087Ujhhgtgfeyxiexzf.f9553Ujhhgtgfeyxiexzf = cls;
        c3087Ujhhgtgfeyxiexzf.f9554Ujhhgtgfeyxiexzf = c3331feyxiexzfUjhhgtg;
        c3087Ujhhgtgfeyxiexzf.f9557Ujhhgtgfeyxiexzf = cls2;
        c3087Ujhhgtgfeyxiexzf.f9561Ujhhgtgfeyxiexzf = enumC0836feyxiexzfUjhhgtg;
        c3087Ujhhgtgfeyxiexzf.f9555Ujhhgtgfeyxiexzf = c1471feyxiexzfUjhhgtg;
        c3087Ujhhgtgfeyxiexzf.f9556Ujhhgtgfeyxiexzf = map;
        c3087Ujhhgtgfeyxiexzf.f9563Ujhhgtgfeyxiexzf = z;
        c3087Ujhhgtgfeyxiexzf.f9564Ujhhgtgfeyxiexzf = z2;
        runnableC3096Ujhhgtgfeyxiexzf.f9605Ujhhgtgfeyxiexzf = c3589Ujhhgtgfeyxiexzf;
        runnableC3096Ujhhgtgfeyxiexzf.f9606Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
        runnableC3096Ujhhgtgfeyxiexzf.f9607Ujhhgtgfeyxiexzf = enumC0836feyxiexzfUjhhgtg;
        runnableC3096Ujhhgtgfeyxiexzf.f9608Ujhhgtgfeyxiexzf = c3340feyxiexzfUjhhgtg;
        runnableC3096Ujhhgtgfeyxiexzf.f9609Ujhhgtgfeyxiexzf = i;
        runnableC3096Ujhhgtgfeyxiexzf.f9610Ujhhgtgfeyxiexzf = i2;
        runnableC3096Ujhhgtgfeyxiexzf.f9611Ujhhgtgfeyxiexzf = c3183feyxiexzfUjhhgtg;
        runnableC3096Ujhhgtgfeyxiexzf.f9612Ujhhgtgfeyxiexzf = c1471feyxiexzfUjhhgtg;
        runnableC3096Ujhhgtgfeyxiexzf.f9613Ujhhgtgfeyxiexzf = c3338Ujhhgtgfeyxiexzf2;
        runnableC3096Ujhhgtgfeyxiexzf.f9614Ujhhgtgfeyxiexzf = i3;
        runnableC3096Ujhhgtgfeyxiexzf.f9629feyxiexzfUjhhgtg = 1;
        runnableC3096Ujhhgtgfeyxiexzf.f9616Ujhhgtgfeyxiexzf = obj;
        runnableC3096Ujhhgtgfeyxiexzf.f9617Ujhhgtgfeyxiexzf = c3589Ujhhgtgfeyxiexzf.f11167Ujhhgtgfeyxiexzf;
        runnableC3096Ujhhgtgfeyxiexzf.f9618Ujhhgtgfeyxiexzf = (Supplier) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(RunnableC3096Ujhhgtgfeyxiexzf.f9597feyxiexzfUjhhgtg);
        C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf = this.f10383Ujhhgtgfeyxiexzf;
        c3107Ujhhgtgfeyxiexzf.getClass();
        c3107Ujhhgtgfeyxiexzf.f9652Ujhhgtgfeyxiexzf.put(c3340feyxiexzfUjhhgtg, c3338Ujhhgtgfeyxiexzf2);
        c3338Ujhhgtgfeyxiexzf2.m4841Ujhhgtgfeyxiexzf(c1046feyxiexzfUjhhgtg, executor);
        synchronized (c3338Ujhhgtgfeyxiexzf2) {
            c3338Ujhhgtgfeyxiexzf2.f10436Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf;
            int iM4597Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf.m4597Ujhhgtgfeyxiexzf(1);
            if (iM4597Ujhhgtgfeyxiexzf == 2 || iM4597Ujhhgtgfeyxiexzf == 3) {
                executorServiceC3600feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf2.f10423Ujhhgtgfeyxiexzf;
            } else {
                executorServiceC3600feyxiexzfUjhhgtg = c3338Ujhhgtgfeyxiexzf2.f10429Ujhhgtgfeyxiexzf ? c3338Ujhhgtgfeyxiexzf2.f10425Ujhhgtgfeyxiexzf : c3338Ujhhgtgfeyxiexzf2.f10424Ujhhgtgfeyxiexzf;
            }
            executorServiceC3600feyxiexzfUjhhgtg.execute(runnableC3096Ujhhgtgfeyxiexzf);
        }
        if (f10382Ujhhgtgfeyxiexzf) {
            m4819Ujhhgtgfeyxiexzf("Started new load", j, c3340feyxiexzfUjhhgtg);
        }
        return new C2366Ujhhgtgfeyxiexzf(this, c1046feyxiexzfUjhhgtg, c3338Ujhhgtgfeyxiexzf2);
    }
}
