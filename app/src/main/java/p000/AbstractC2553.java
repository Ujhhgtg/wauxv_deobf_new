package p000;

import java.io.PrintStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2553 {

    public static final int f8109;

    public static final int f8110;

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
        f8109 = i;
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
        f8110 = i2;
    }

    public static final void m4565(String str, Throwable th) {
        m4566().println("SLF4J(E): " + str);
        m4566().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m4566());
    }

    public static PrintStream m4566() {
        return AbstractC2784.m4759(f8109) != 1 ? System.err : System.out;
    }

    public static final void m4567(String str) {
        if (AbstractC2784.m4759(3) >= AbstractC2784.m4759(f8110)) {
            m4566().println("SLF4J(W): " + str);
        }
    }
}
