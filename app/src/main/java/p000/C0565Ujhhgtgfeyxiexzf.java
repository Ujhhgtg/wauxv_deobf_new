package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛲ要点脸ᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0565Ujhhgtgfeyxiexzf extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2578Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AbstractC2516feyxiexzfUjhhgtg f2579Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Serializable f2580Ujhhgtgfeyxiexzf;

    public C0565Ujhhgtgfeyxiexzf() {
        this.f2578Ujhhgtgfeyxiexzf = 1;
        this.f2579Ujhhgtgfeyxiexzf = new C0647Ujhhgtgfeyxiexzf();
        this.f2580Ujhhgtgfeyxiexzf = new ArrayList();
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void mo1839Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        switch (this.f2578Ujhhgtgfeyxiexzf) {
            case 1:
                ((ArrayList) this.f2580Ujhhgtgfeyxiexzf).add(charSequence);
                break;
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo1840Ujhhgtgfeyxiexzf() {
        int i;
        switch (this.f2578Ujhhgtgfeyxiexzf) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f2580Ujhhgtgfeyxiexzf;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = charSequence.charAt(i2);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case Opcodes.FCONST_1 /* 12 */:
                                        case '\r':
                                            break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < size + 1; i++) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((C0647Ujhhgtgfeyxiexzf) this.f2579Ujhhgtgfeyxiexzf).f2703Ujhhgtgfeyxiexzf = sb.toString();
                break;
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        switch (this.f2578Ujhhgtgfeyxiexzf) {
            case 0:
                return (C0537Ujhhgtgfeyxiexzf) this.f2579Ujhhgtgfeyxiexzf;
            default:
                return (C0647Ujhhgtgfeyxiexzf) this.f2579Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void mo1841Ujhhgtgfeyxiexzf(C0655Ujhhgtgfeyxiexzf c0655Ujhhgtgfeyxiexzf) {
        switch (this.f2578Ujhhgtgfeyxiexzf) {
            case 0:
                c0655Ujhhgtgfeyxiexzf.m1928Ujhhgtgfeyxiexzf((String) this.f2580Ujhhgtgfeyxiexzf, (C0537Ujhhgtgfeyxiexzf) this.f2579Ujhhgtgfeyxiexzf);
                break;
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        switch (this.f2578Ujhhgtgfeyxiexzf) {
            case 0:
                return null;
            default:
                if (c3215feyxiexzfUjhhgtg.f10090Ujhhgtgfeyxiexzf >= 4) {
                    return new C2515feyxiexzfUjhhgtg(-1, c3215feyxiexzfUjhhgtg.f10086Ujhhgtgfeyxiexzf + 4, false);
                }
                if (c3215feyxiexzfUjhhgtg.f10091Ujhhgtgfeyxiexzf) {
                    return C2515feyxiexzfUjhhgtg.m3791Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10088Ujhhgtgfeyxiexzf);
                }
                return null;
        }
    }

    public C0565Ujhhgtgfeyxiexzf(int i, String str) {
        this.f2578Ujhhgtgfeyxiexzf = 0;
        C0537Ujhhgtgfeyxiexzf c0537Ujhhgtgfeyxiexzf = new C0537Ujhhgtgfeyxiexzf();
        this.f2579Ujhhgtgfeyxiexzf = c0537Ujhhgtgfeyxiexzf;
        c0537Ujhhgtgfeyxiexzf.f2507Ujhhgtgfeyxiexzf = i;
        this.f2580Ujhhgtgfeyxiexzf = str;
    }
}
