package p000;

import java.io.PrintStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ要点脸ᛳᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int f3883Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int f3884Ujhhgtgfeyxiexzf;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property != null && !property.isEmpty()) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    i = 1;
                    break;
                } else {
                    if (strArr[i3].equalsIgnoreCase(property)) {
                        i = 2;
                        break;
                    }
                    i3++;
                }
            }
        } else {
            i = 1;
            break;
        }
        f3883Ujhhgtgfeyxiexzf = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i2 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i2 = 3;
            }
        }
        f3884Ujhhgtgfeyxiexzf = i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final void m2477Ujhhgtgfeyxiexzf(String str, Throwable th) {
        m2478Ujhhgtgfeyxiexzf().println("SLF4J(E): " + str);
        m2478Ujhhgtgfeyxiexzf().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m2478Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static PrintStream m2478Ujhhgtgfeyxiexzf() {
        return AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(f3883Ujhhgtgfeyxiexzf) != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m2479Ujhhgtgfeyxiexzf(String str) {
        if (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(3) >= AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(f3884Ujhhgtgfeyxiexzf)) {
            m2478Ujhhgtgfeyxiexzf().println("SLF4J(W): " + str);
        }
    }
}
