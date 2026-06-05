package p000;

import com.drake.net.exception.NetException;
import com.drake.net.exception.URLParseException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0433Ujhhgtgfeyxiexzf implements InterfaceC0717Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3121Ujhhgtgfeyxiexzf f2291Ujhhgtgfeyxiexzf;

    public C0433Ujhhgtgfeyxiexzf(C3121Ujhhgtgfeyxiexzf c3121Ujhhgtgfeyxiexzf) {
        this.f2291Ujhhgtgfeyxiexzf = c3121Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3737Ujhhgtgfeyxiexzf
    public final InterfaceC3738Ujhhgtgfeyxiexzf getKey() {
        return C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    public final boolean start() {
        return this.f2291Ujhhgtgfeyxiexzf.start();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object m1757Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) throws Exception {
        C0437Ujhhgtgfeyxiexzf c0437Ujhhgtgfeyxiexzf;
        String str;
        String str2;
        Exception e;
        if (interfaceC3704Ujhhgtgfeyxiexzf instanceof C0437Ujhhgtgfeyxiexzf) {
            c0437Ujhhgtgfeyxiexzf = (C0437Ujhhgtgfeyxiexzf) interfaceC3704Ujhhgtgfeyxiexzf;
            int i = c0437Ujhhgtgfeyxiexzf.f2302Ujhhgtgfeyxiexzf;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0437Ujhhgtgfeyxiexzf.f2302Ujhhgtgfeyxiexzf = i - Integer.MIN_VALUE;
            } else {
                c0437Ujhhgtgfeyxiexzf = new C0437Ujhhgtgfeyxiexzf(this, interfaceC3704Ujhhgtgfeyxiexzf);
            }
        } else {
            c0437Ujhhgtgfeyxiexzf = new C0437Ujhhgtgfeyxiexzf(this, interfaceC3704Ujhhgtgfeyxiexzf);
        }
        Object obj = c0437Ujhhgtgfeyxiexzf.f2300Ujhhgtgfeyxiexzf;
        int i2 = c0437Ujhhgtgfeyxiexzf.f2302Ujhhgtgfeyxiexzf;
        if (i2 == 0) {
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StackTraceElement stackTraceElement = 1 < stackTrace.length ? stackTrace[1] : null;
            if (stackTraceElement != null) {
                str = " ...(" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
            } else {
                str = null;
            }
            try {
                C3121Ujhhgtgfeyxiexzf c3121Ujhhgtgfeyxiexzf = this.f2291Ujhhgtgfeyxiexzf;
                c0437Ujhhgtgfeyxiexzf.f2299Ujhhgtgfeyxiexzf = str;
                c0437Ujhhgtgfeyxiexzf.f2302Ujhhgtgfeyxiexzf = 1;
                Object objM4650feyxiexzfUjhhgtg = c3121Ujhhgtgfeyxiexzf.m4650feyxiexzfUjhhgtg(c0437Ujhhgtgfeyxiexzf);
                EnumC3746Ujhhgtgfeyxiexzf enumC3746Ujhhgtgfeyxiexzf = EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
                return objM4650feyxiexzfUjhhgtg == enumC3746Ujhhgtgfeyxiexzf ? enumC3746Ujhhgtgfeyxiexzf : objM4650feyxiexzfUjhhgtg;
            } catch (Exception e2) {
                str2 = str;
                e = e2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c0437Ujhhgtgfeyxiexzf.f2299Ujhhgtgfeyxiexzf;
            try {
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                return obj;
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (str2 != null && (e instanceof NetException)) {
            ((NetException) e).setOccurred(str2);
        } else if (str2 != null && (e instanceof URLParseException)) {
            ((URLParseException) e).setOccurred(str2);
        }
        throw e;
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean mo1758Ujhhgtgfeyxiexzf() {
        return this.f2291Ujhhgtgfeyxiexzf.mo1758Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2916feyxiexzfUjhhgtg mo1759Ujhhgtgfeyxiexzf(C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf) {
        return this.f2291Ujhhgtgfeyxiexzf.mo1759Ujhhgtgfeyxiexzf(c0731Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final InterfaceC3227feyxiexzfUjhhgtg mo1760Ujhhgtgfeyxiexzf(boolean z, boolean z2, C0726Ujhhgtgfeyxiexzf c0726Ujhhgtgfeyxiexzf) {
        return this.f2291Ujhhgtgfeyxiexzf.mo1760Ujhhgtgfeyxiexzf(z, z2, c0726Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final CancellationException mo1761Ujhhgtgfeyxiexzf() {
        return this.f2291Ujhhgtgfeyxiexzf.mo1761Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg mo1762Ujhhgtgfeyxiexzf(InterfaceC3738Ujhhgtgfeyxiexzf interfaceC3738Ujhhgtgfeyxiexzf) {
        return this.f2291Ujhhgtgfeyxiexzf.mo1762Ujhhgtgfeyxiexzf(interfaceC3738Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object mo1763feyxiexzfUjhhgtg(Object obj, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        return interfaceC3553feyxiexzfUjhhgtg.mo1179Ujhhgtgfeyxiexzf(obj, this.f2291Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg mo1764feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg) {
        return AbstractC3593Ujhhgtgfeyxiexzf.m5163feyxiexzfUjhhgtg(this.f2291Ujhhgtgfeyxiexzf, interfaceC3739feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3737Ujhhgtgfeyxiexzf mo1765feyxiexzfUjhhgtg(InterfaceC3738Ujhhgtgfeyxiexzf interfaceC3738Ujhhgtgfeyxiexzf) {
        return this.f2291Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(interfaceC3738Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void mo1766feyxiexzfUjhhgtg(CancellationException cancellationException) {
        this.f2291Ujhhgtgfeyxiexzf.mo1766feyxiexzfUjhhgtg(cancellationException);
    }
}
