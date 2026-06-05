package p000;

import bsh.C0021Ujhhgtgfeyxiexzf;
import bsh.C0029Ujhhgtgfeyxiexzf;
import bsh.Primitive;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.crypto.spec.SecretKeySpec;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛴᛱUjhhgtgᛱᛲ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1435feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1414feyxiexzfUjhhgtg f5032Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final RunnableC0026Ujhhgtgfeyxiexzf f5033Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5034Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final SecretKeySpec f5035Ujhhgtgfeyxiexzf;

    public C1435feyxiexzfUjhhgtg(C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str) {
        this.f5032Ujhhgtgfeyxiexzf = c1414feyxiexzfUjhhgtg;
        this.f5033Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf;
        this.f5034Ujhhgtgfeyxiexzf = str;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        "getBytes(...)";
        this.f5035Ujhhgtgfeyxiexzf = new SecretKeySpec(bytes, "AES");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object m2928Ujhhgtgfeyxiexzf(String str, Object... objArr) {
        Object c0919feyxiexzfUjhhgtg;
        C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf;
        RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = this.f5033Ujhhgtgfeyxiexzf;
        C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg = this.f5032Ujhhgtgfeyxiexzf;
        if (c1414feyxiexzfUjhhgtg.f4964Ujhhgtgfeyxiexzf.exists()) {
            try {
                C0021Ujhhgtgfeyxiexzf[] c0021UjhhgtgfeyxiexzfArrM370Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m370Ujhhgtgfeyxiexzf();
                int length = c0021UjhhgtgfeyxiexzfArrM370Ujhhgtgfeyxiexzf.length;
                int i = 0;
                boolean z = false;
                C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf2 = null;
                while (true) {
                    if (i >= length) {
                        if (z) {
                            c0021Ujhhgtgfeyxiexzf = c0021Ujhhgtgfeyxiexzf2;
                            break;
                        }
                    } else {
                        C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf3 = c0021UjhhgtgfeyxiexzfArrM370Ujhhgtgfeyxiexzf[i];
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0021Ujhhgtgfeyxiexzf3.m310Ujhhgtgfeyxiexzf(), str)) {
                            if (!z) {
                                z = true;
                                c0021Ujhhgtgfeyxiexzf2 = c0021Ujhhgtgfeyxiexzf3;
                            }
                        }
                        i++;
                    }
                    c0021Ujhhgtgfeyxiexzf = null;
                    break;
                }
                if (c0021Ujhhgtgfeyxiexzf != null) {
                    c0919feyxiexzfUjhhgtg = c0021Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(objArr, runnableC0026Ujhhgtgfeyxiexzf, null, null, false, null);
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg, Primitive.VOID)) {
                        c0919feyxiexzfUjhhgtg = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                    } else if (c0919feyxiexzfUjhhgtg instanceof Primitive) {
                        c0919feyxiexzfUjhhgtg = ((Primitive) c0919feyxiexzfUjhhgtg).getValue();
                    }
                    Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
                    if (thM2409Ujhhgtgfeyxiexzf != null) {
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb.append("callBshMethod ");
                        sb.append(str);
                        sb.append(" Failed: ");
                        sb.append(thM2409Ujhhgtgfeyxiexzf.getMessage());
                        c1414feyxiexzfUjhhgtg.m2925Ujhhgtgfeyxiexzf(sb.toString());
                    }
                    if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                        return null;
                    }
                    return c0919feyxiexzfUjhhgtg;
                }
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2929Ujhhgtgfeyxiexzf() {
        this.f5033Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.clear();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2930Ujhhgtgfeyxiexzf() throws IOException {
        File file = this.f5032Ujhhgtgfeyxiexzf.f4964Ujhhgtgfeyxiexzf;
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        try {
            RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = this.f5033Ujhhgtgfeyxiexzf;
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf;
            String str = runnableC0026Ujhhgtgfeyxiexzf.f521Ujhhgtgfeyxiexzf;
            if (str == null) {
                str = "eval stream";
            }
            runnableC0026Ujhhgtgfeyxiexzf.m337Ujhhgtgfeyxiexzf(inputStreamReader, c0029Ujhhgtgfeyxiexzf, str);
            inputStreamReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m2931Ujhhgtgfeyxiexzf(String str) {
        if (!this.f5032Ujhhgtgfeyxiexzf.f4964Ujhhgtgfeyxiexzf.exists()) {
            return false;
        }
        for (C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf : this.f5033Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m370Ujhhgtgfeyxiexzf()) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0021Ujhhgtgfeyxiexzf.m310Ujhhgtgfeyxiexzf(), str)) {
                return true;
            }
        }
        return false;
    }
}
