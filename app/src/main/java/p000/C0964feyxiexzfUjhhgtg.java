package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛳ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0964feyxiexzfUjhhgtg implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Pattern f3835Ujhhgtgfeyxiexzf;

    public C0964feyxiexzfUjhhgtg(Pattern pattern) {
        this.f3835Ujhhgtgfeyxiexzf = pattern;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f3835Ujhhgtgfeyxiexzf;
        return new C0957feyxiexzfUjhhgtg(pattern.pattern(), pattern.flags());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C3254feyxiexzfUjhhgtg m2464Ujhhgtgfeyxiexzf(C0964feyxiexzfUjhhgtg c0964feyxiexzfUjhhgtg, String str) {
        if (str.length() >= 0) {
            return new C3254feyxiexzfUjhhgtg(new C2550feyxiexzfUjhhgtg(c0964feyxiexzfUjhhgtg, 6, str), C0956feyxiexzfUjhhgtg.f3823Ujhhgtgfeyxiexzf);
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(0, "Start index out of bounds: ", ", input length: ");
        sbM4804Ujhhgtgfeyxiexzf.append(str.length());
        throw new IndexOutOfBoundsException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    public final String toString() {
        return this.f3835Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m2465Ujhhgtgfeyxiexzf(String str, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        int i = 0;
        C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(this.f3835Ujhhgtgfeyxiexzf.matcher(str), 0, str);
        if (c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            Matcher matcher = c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.f1465Ujhhgtgfeyxiexzf;
            sb.append((CharSequence) str, i, AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(matcher.start(), matcher.end()).f2805Ujhhgtgfeyxiexzf);
            sb.append((CharSequence) interfaceC3549feyxiexzfUjhhgtg.invoke(c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf));
            i = AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(matcher.start(), matcher.end()).f2806Ujhhgtgfeyxiexzf + 1;
            c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1286Ujhhgtgfeyxiexzf();
            if (i >= length) {
                break;
            }
        } while (c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public C0964feyxiexzfUjhhgtg(String str) {
        this(Pattern.compile(str));
    }
}
