package p000;

import bsh.AbstractC0009;
import bsh.C0006;
import bsh.C0007;
import bsh.Primitive;
import bsh.This;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1668 implements Runnable, Serializable, InterfaceC0480 {

    public static final ThreadLocal f5629 = ThreadLocal.withInitial(new C1666(0));

    public static final This f5630 = This.getThis(new C0007(null, null, "bsh.system"), null);

    public static final C1883 f5631 = new C1883();

    public boolean f5632;

    public final transient C2334 f5633;

    public C0007 f5634;

    public final C1667 f5635;

    public String f5636;

    public final int f5637;

    public final boolean f5638;

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    public RunnableC1668(StringReader stringReader, PrintStream printStream, PrintStream printStream2, C0007 c0007, RunnableC1668 runnableC1668, String str) {
        C1667 c1667 = new C1667();
        c1667.f5626 = stringReader;
        c1667.f5627 = printStream;
        c1667.f5628 = printStream2;
        C1667.f5625 = printStream2;
        this.f5637 = -1;
        ThreadLocal threadLocal = f5629;
        long jNanoTime = ((Boolean) threadLocal.get()).booleanValue() ? System.nanoTime() : 0L;
        if (runnableC1668 != null) {
            this.f5633 = runnableC1668.f5633;
            this.f5638 = runnableC1668.f5638;
        }
        this.f5636 = str;
        c0007 = c0007 == null ? new C0007(c0007, C0482.m1721(this), "global") : c0007;
        this.f5635 = c1667;
        C2334 c2334 = this.f5633;
        if (c2334 != null) {
            C1687 c1687 = c2334.f7480;
            if (c1687.f5744 - c1687.f5745 == 0) {
                c2334.m4214(stringReader);
            } else {
                this.f5633 = new C2334(stringReader);
            }
        } else {
            this.f5633 = new C2334(stringReader);
        }
        m3395(c0007);
        this.f5634.m346().mo296(this);
        if (((Boolean) threadLocal.get()).booleanValue()) {
            m3389("Time to initialize interpreter: interactive=", Boolean.FALSE, " ", Long.valueOf(System.nanoTime() - jNanoTime), " nanoseconds.");
        }
    }

    public static final void m3389(Object... objArr) {
        if (((Boolean) f5629.get()).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj);
            }
            C1667.f5625.println("// Debug: " + sb.toString());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM4203;
        ThreadLocal threadLocal = f5629;
        if (this.f5638) {
            throw new RuntimeException("bsh Interpreter: No stream");
        }
        C0550 c0550 = new C0550(this.f5634);
        Stack stack = c0550.f2265;
        this.f5632 = false;
        while (!Thread.interrupted() && !this.f5632) {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    zM4203 = this.f5633.m4203();
                                } catch (Throwable th) {
                                    this.f5633.f7480.m3427();
                                    if (stack.size() > 1) {
                                        c0550.clear();
                                        c0550.m1927(this.f5634);
                                    }
                                    throw th;
                                }
                            } catch (Exception e) {
                                m3390("Unknown error: " + e);
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    e.printStackTrace();
                                }
                                this.f5632 = true;
                                this.f5633.f7480.m3427();
                                if (stack.size() > 1) {
                                }
                            }
                        } catch (C2332 e2) {
                            int i = this.f5637;
                            if (i >= 0) {
                                try {
                                    Thread.sleep(i);
                                } catch (InterruptedException unused) {
                                }
                            }
                            if (!this.f5632) {
                                throw e2;
                            }
                            zM4203 = true;
                        }
                        try {
                            this.f5632 = zM4203;
                            C1687 c1687 = this.f5633.f7480;
                            if (c1687.f5744 - c1687.f5745 > 0) {
                                AbstractC2707 abstractC2707 = (AbstractC2707) ((InterfaceC2225) c1687.f5742.get(0));
                                abstractC2707.f8719 = this.f5636;
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    abstractC2707.m4708(">");
                                }
                                abstractC2707.mo306(c0550, this);
                                if (stack.size() > 1) {
                                    throw new C1669("Callstack growing: " + c0550);
                                }
                            }
                            this.f5633.f7480.m3427();
                            if (stack.size() > 1) {
                                c0550.clear();
                                c0550.m1927(this.f5634);
                            }
                        } catch (C2332 e3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Parser Error: ");
                            
                            sb.append(e3.getMessage());
                            m3390(sb.toString());
                            if (((Boolean) threadLocal.get()).booleanValue()) {
                                e3.printStackTrace();
                            }
                            this.f5632 = true;
                            this.f5633.m4214(this.f5635.f5626);
                            this.f5633.f7480.m3427();
                            if (stack.size() > 1) {
                            }
                        }
                    } catch (C3409 e4) {
                        m3390("Error parsing input: " + e4);
                        C2334 c2334 = this.f5633;
                        Reader reader = this.f5635.f5626;
                        C1697 c1697 = c2334.f7482;
                        int[] iArr = c1697.f5776;
                        int i2 = c1697.f5771;
                        int i3 = iArr[i2];
                        int i4 = c1697.f5777[i2];
                        c1697.f5782 = new char[4096];
                        c1697.f5783 = -1;
                        c1697.f5784 = reader;
                        c1697.m3434(i3, i4);
                        this.f5632 = true;
                        this.f5633.f7480.m3427();
                        if (stack.size() > 1) {
                        }
                    }
                } catch (C1229 e5) {
                    m3390("Evaluation Error: " + e5.f4453);
                    if (((Boolean) threadLocal.get()).booleanValue()) {
                        e5.printStackTrace();
                    }
                    this.f5632 = true;
                    this.f5633.f7480.m3427();
                    if (stack.size() > 1) {
                    }
                }
            } catch (C1669 e6) {
                m3390("Internal Error: " + e6.getMessage());
                this.f5632 = true;
                this.f5633.f7480.m3427();
                if (stack.size() > 1) {
                }
            } catch (C2895 e7) {
                m3390("Target Exception: " + e7.getMessage());
                if (e7.f9312) {
                    boolean zBooleanValue = ((Boolean) threadLocal.get()).booleanValue();
                    C1667 c1667 = this.f5635;
                    if (c1667.f5628 == null) {
                        c1667.f5628 = System.err;
                    }
                    e7.m4901(zBooleanValue, c1667.f5628);
                }
                this.f5632 = true;
                m3396(e7.m4900(), "$_e");
                this.f5633.f7480.m3427();
                if (stack.size() > 1) {
                }
            }
        }
    }

    @Override // p000.InterfaceC0480
    public final void mo343() {
        AbstractC0009.f521.clear();
    }

    public final void m3390(String str) {
        C1667 c1667 = this.f5635;
        if (c1667.f5627 != null) {
            String str2 = ((Object) ("// Error: " + ((Object) str))) + "\n";
            PrintStream printStream = c1667.f5627;
            if (true) {
                printStream.print((Object) str2);
                c1667.f5627.flush();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0217  */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:368:0x0600 A[Catch: all -> 0x058e, TryCatch #9 {all -> 0x058e, blocks: (B:299:0x0529, B:318:0x0551, B:320:0x055a, B:321:0x0563, B:323:0x0573, B:325:0x0577, B:344:0x05ae, B:345:0x05c4, B:366:0x05f4, B:368:0x0600, B:369:0x0603, B:370:0x0625, B:372:0x0628, B:373:0x0648, B:375:0x064b, B:377:0x0657, B:378:0x065a, B:380:0x065e, B:381:0x0660, B:382:0x0673, B:384:0x0676, B:386:0x067a, B:387:0x067c, B:388:0x068e, B:390:0x0691, B:391:0x06b1, B:310:0x0543, B:314:0x0549, B:315:0x054c, B:365:0x05f3, B:392:0x06b2, B:394:0x06be, B:395:0x06ce, B:396:0x06d0), top: B:406:0x0529, inners: #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x0657 A[Catch: all -> 0x058e, TryCatch #9 {all -> 0x058e, blocks: (B:299:0x0529, B:318:0x0551, B:320:0x055a, B:321:0x0563, B:323:0x0573, B:325:0x0577, B:344:0x05ae, B:345:0x05c4, B:366:0x05f4, B:368:0x0600, B:369:0x0603, B:370:0x0625, B:372:0x0628, B:373:0x0648, B:375:0x064b, B:377:0x0657, B:378:0x065a, B:380:0x065e, B:381:0x0660, B:382:0x0673, B:384:0x0676, B:386:0x067a, B:387:0x067c, B:388:0x068e, B:390:0x0691, B:391:0x06b1, B:310:0x0543, B:314:0x0549, B:315:0x054c, B:365:0x05f3, B:392:0x06b2, B:394:0x06be, B:395:0x06ce, B:396:0x06d0), top: B:406:0x0529, inners: #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:380:0x065e A[Catch: all -> 0x058e, TryCatch #9 {all -> 0x058e, blocks: (B:299:0x0529, B:318:0x0551, B:320:0x055a, B:321:0x0563, B:323:0x0573, B:325:0x0577, B:344:0x05ae, B:345:0x05c4, B:366:0x05f4, B:368:0x0600, B:369:0x0603, B:370:0x0625, B:372:0x0628, B:373:0x0648, B:375:0x064b, B:377:0x0657, B:378:0x065a, B:380:0x065e, B:381:0x0660, B:382:0x0673, B:384:0x0676, B:386:0x067a, B:387:0x067c, B:388:0x068e, B:390:0x0691, B:391:0x06b1, B:310:0x0543, B:314:0x0549, B:315:0x054c, B:365:0x05f3, B:392:0x06b2, B:394:0x06be, B:395:0x06ce, B:396:0x06d0), top: B:406:0x0529, inners: #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:386:0x067a A[Catch: all -> 0x058e, TryCatch #9 {all -> 0x058e, blocks: (B:299:0x0529, B:318:0x0551, B:320:0x055a, B:321:0x0563, B:323:0x0573, B:325:0x0577, B:344:0x05ae, B:345:0x05c4, B:366:0x05f4, B:368:0x0600, B:369:0x0603, B:370:0x0625, B:372:0x0628, B:373:0x0648, B:375:0x064b, B:377:0x0657, B:378:0x065a, B:380:0x065e, B:381:0x0660, B:382:0x0673, B:384:0x0676, B:386:0x067a, B:387:0x067c, B:388:0x068e, B:390:0x0691, B:391:0x06b1, B:310:0x0543, B:314:0x0549, B:315:0x054c, B:365:0x05f3, B:392:0x06b2, B:394:0x06be, B:395:0x06ce, B:396:0x06d0), top: B:406:0x0529, inners: #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    public final Object m3391(Reader reader, C0007 c0007, String str) throws C1229 {
        boolean z;
        ThreadLocal threadLocal;
        String str2;
        InterfaceC2225 interfaceC2225;
        int i;
        int i2;
        int i3;
        boolean z2;
        C0785 c0785;
        ArrayList arrayList;
        int i4;
        C0978 c0978M2535;
        int i5;
        int i6;
        char cCharAt;
        ThreadLocal threadLocal2 = f5629;
        String str3 = "Sourced file: ";
        try {
            StringBuilder sb = new StringBuilder(1024);
            char[] cArr = new char[4096];
            while (true) {
                int i7 = reader.read(cArr);
                if (i7 == -1) {
                    break;
                }
                sb.append(cArr, 0, i7);
            }
            String string = sb.toString();
            HashSet hashSet = AbstractC0170.f1201;
            char c = '(';
            if (string != null) {
                char c2 = '@';
                if (string.indexOf(64) < 0) {
                    z = true;
                } else {
                    int length = string.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    int i8 = 0;
                    while (i8 < length) {
                        int iM1220 = AbstractC0170.m1220(i8, string);
                        if (iM1220 > i8) {
                            sb2.append((CharSequence) string, i8, iM1220);
                            i8 = iM1220;
                        } else if (string.charAt(i8) != c2) {
                            sb2.append(string.charAt(i8));
                            i8++;
                        } else {
                            int length2 = string.length();
                            int i9 = i8 + 1;
                            if (i9 >= length2 || !((cCharAt = string.charAt(i9)) == '_' || Character.isLetterOrDigit(cCharAt))) {
                                i5 = -1;
                            } else {
                                int i10 = i9;
                                while (i10 < length2) {
                                    char cCharAt2 = string.charAt(i10);
                                    if (cCharAt2 != '_' && !Character.isLetterOrDigit(cCharAt2)) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (AbstractC0170.f1201.contains(string.substring(i9, i10)) && (i10 >= length2 || !Character.isJavaIdentifierPart(string.charAt(i10)))) {
                                    i5 = i10;
                                } else {
                                    i5 = -1;
                                }
                            }
                            if (i5 > i8) {
                                sb2.append((CharSequence) string, i8, i5);
                                i8 = i5;
                            } else {
                                int length3 = string.length();
                                if (i9 >= length3 || !Character.isJavaIdentifierStart(string.charAt(i9))) {
                                    i6 = -1;
                                } else {
                                    i6 = i9;
                                    while (i6 < length3 && Character.isJavaIdentifierPart(string.charAt(i6))) {
                                        i6++;
                                    }
                                    if (string.substring(i9, i6).equals("interface")) {
                                        i6 = -1;
                                    } else {
                                        while (true) {
                                            if (i6 >= length3 || string.charAt(i6) != '.') {
                                                while (i6 < length3) {
                                                    char cCharAt3 = string.charAt(i6);
                                                    if (cCharAt3 != ' ' && cCharAt3 != '\t' && cCharAt3 != '\f') {
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                                if (i6 < length3 && string.charAt(i6) == c) {
                                                    int length4 = string.length();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i6 >= length4) {
                                                            i6 = -1;
                                                            break;
                                                        }
                                                        int iM1221 = AbstractC0170.m1220(i6, string);
                                                        if (iM1221 <= i6) {
                                                            char cCharAt4 = string.charAt(i6);
                                                            if (cCharAt4 != c) {
                                                                if (cCharAt4 == ')' && (i11 = i11 - 1) == 0) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i11++;
                                                            }
                                                        } else {
                                                            i6 = iM1221 - 1;
                                                        }
                                                        i6++;
                                                        c = '(';
                                                    }
                                                    if (i6 >= 0) {
                                                        i6++;
                                                    }
                                                }
                                            } else {
                                                i6++;
                                                if (i6 < length3 && Character.isJavaIdentifierStart(string.charAt(i6))) {
                                                    while (i6 < length3 && Character.isJavaIdentifierPart(string.charAt(i6))) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                            i6 = -1;
                                        }
                                    }
                                }
                                if (i6 > i8) {
                                    while (i8 < i6) {
                                        char cCharAt5 = string.charAt(i8);
                                        if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                            sb2.append(cCharAt5);
                                        }
                                        i8++;
                                    }
                                    i8 = i6;
                                    while (i8 < length && (string.charAt(i8) == ' ' || string.charAt(i8) == '\t')) {
                                        i8++;
                                    }
                                    c = '(';
                                } else {
                                    sb2.append('@');
                                    c2 = '@';
                                    i8 = i9;
                                    c = '(';
                                }
                            }
                            c2 = '@';
                        }
                    }
                    z = true;
                    string = sb2.toString();
                }
            } else {
                z = true;
            }
            HashSet hashSet2 = AbstractC0979.f3590;
            if (string == null || string.indexOf(61) < 0 || string.indexOf(40) < 0) {
                threadLocal = threadLocal2;
                str2 = "Sourced file: ";
            } else {
                HashSet hashSet3 = new HashSet();
                int length5 = string.length();
                int i12 = 0;
                while (i12 < length5) {
                    int iM2531 = AbstractC0979.m2531(i12, string);
                    if (iM2531 > i12) {
                        i12 = iM2531;
                    } else if (string.charAt(i12) == '(' && (c0978M2535 = AbstractC0979.m2535(i12, string)) != null) {
                        String str4 = (String) c0978M2535.f3588;
                        ArrayList arrayList2 = (ArrayList) ((C0474) c0978M2535.f3589).f2080;
                        hashSet3.add(AbstractC0979.m2529(str4, arrayList2, arrayList2.size()));
                        i12 = c0978M2535.f3587;
                    } else {
                        i12++;
                    }
                }
                StringBuilder sb3 = new StringBuilder(string.length() + 128);
                int length6 = string.length();
                int i13 = 0;
                int i14 = 0;
                while (i13 < length6) {
                    int iM2532 = AbstractC0979.m2531(i13, string);
                    if (iM2532 > i13) {
                        i13 = iM2532;
                    } else if (string.charAt(i13) != '(') {
                        i13++;
                    } else {
                        C0978 c0978M2536 = AbstractC0979.m2535(i13, string);
                        if (c0978M2536 == null) {
                            i3 = length6;
                            c0785 = null;
                        } else {
                            C0474 c0474 = (C0474) c0978M2536.f3589;
                            if (c0474.f2076 && c0474.f2077 && c0474.f2078) {
                                int i15 = c0978M2536.f3586;
                                int iM2526 = AbstractC0979.m2526(string, i13, '(', ')');
                                String strSubstring = string.substring(i15, i13);
                                int i16 = iM2526 + 1;
                                int iM2527 = AbstractC0979.m2527(i16, string);
                                if (iM2527 < 0) {
                                    i3 = length6;
                                    c0785 = null;
                                } else {
                                    String strSubstring2 = string.substring(i16, iM2527);
                                    int iM2528 = AbstractC0979.m2526(string, iM2527, '{', '}') + 1;
                                    String strSubstring3 = string.substring(iM2527, iM2528);
                                    String str5 = (String) c0978M2536.f3588;
                                    StringBuilder sb4 = new StringBuilder(strSubstring3.length() + strSubstring.length() + 128);
                                    sb4.append(strSubstring);
                                    sb4.append('(');
                                    ArrayList arrayList3 = (ArrayList) c0474.f2080;
                                    sb4.append(AbstractC0979.m2528(arrayList3, arrayList3.size()));
                                    sb4.append(')');
                                    sb4.append(strSubstring2);
                                    sb4.append(strSubstring3);
                                    String strTrim = strSubstring.trim();
                                    if (strTrim.endsWith(str5)) {
                                        String strTrim2 = strTrim.substring(0, strTrim.length() - str5.length()).trim();
                                        if (strTrim2.isEmpty()) {
                                            i3 = length6;
                                        } else {
                                            String[] strArrSplit = strTrim2.split("\\s+");
                                            i3 = length6;
                                            int i17 = 0;
                                            String str6 = null;
                                            while (i17 < strArrSplit.length) {
                                                String str7 = strArrSplit[i17];
                                                String[] strArr = strArrSplit;
                                                if (!str7.startsWith("@") && !AbstractC0979.f3591.contains(str7)) {
                                                    str6 = str7;
                                                }
                                                i17++;
                                                strArrSplit = strArr;
                                            }
                                            if (str6 != null) {
                                                z2 = !"void".equals(str6);
                                            }
                                        }
                                        z2 = false;
                                    } else {
                                        i3 = length6;
                                        z2 = false;
                                    }
                                    int size = arrayList3.size() - 1;
                                    while (size >= c0474.f2079) {
                                        String strM2529 = AbstractC0979.m2529(str5, arrayList3, size);
                                        if (hashSet3.contains(strM2529)) {
                                            i4 = size;
                                            arrayList = arrayList3;
                                        } else {
                                            sb4.append('\n');
                                            sb4.append(strSubstring);
                                            sb4.append('(');
                                            sb4.append(AbstractC0979.m2528(arrayList3, size));
                                            sb4.append(')');
                                            sb4.append(strSubstring2);
                                            sb4.append('{');
                                            if (z2) {
                                                sb4.append("return ");
                                            }
                                            sb4.append(str5);
                                            sb4.append('(');
                                            StringBuilder sb5 = new StringBuilder();
                                            arrayList = arrayList3;
                                            for (int i18 = 0; i18 < size; i18++) {
                                                if (sb5.length() > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append((String) ((ArrayList) c0474.f2081).get(i18));
                                            }
                                            int i19 = size;
                                            i4 = i19;
                                            while (i19 < arrayList.size()) {
                                                if (sb5.length() > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append((String) ((ArrayList) c0474.f2082).get(i19));
                                                i19++;
                                            }
                                            sb4.append(sb5.toString());
                                            sb4.append(");}");
                                            hashSet3.add(strM2529);
                                        }
                                        size = i4 - 1;
                                        z2 = z2;
                                        arrayList3 = arrayList;
                                    }
                                    c0785 = new C0785(i15, iM2528, sb4.toString());
                                }
                            } else {
                                i3 = length6;
                                c0785 = null;
                            }
                        }
                        if (c0785 != null) {
                            sb3.append((CharSequence) string, i14, c0785.f2970);
                            sb3.append((String) c0785.f2972);
                            i14 = c0785.f2971;
                            i13 = i14;
                        } else {
                            i13++;
                        }
                        threadLocal2 = threadLocal2;
                        length6 = i3;
                        str3 = str3;
                    }
                }
                threadLocal = threadLocal2;
                str2 = str3;
                sb3.append((CharSequence) string, i14, length6);
                string = sb3.toString();
            }
            if (string != null && string.indexOf(36) >= 0 && string.indexOf(34) >= 0) {
                int length7 = string.length();
                StringBuilder sb6 = new StringBuilder(length7 + 32);
                int i20 = 0;
                while (i20 < length7) {
                    char cCharAt6 = string.charAt(i20);
                    if (cCharAt6 == '\"') {
                        if (AbstractC1270.m2985(i20, string)) {
                            int i21 = i20 + 3;
                            int i22 = i21;
                            while (true) {
                                if (i22 + 2 >= string.length()) {
                                    i22 = -1;
                                    break;
                                }
                                if (AbstractC1270.m2985(i22, string)) {
                                    break;
                                }
                                i22++;
                            }
                            if (i22 < 0) {
                                sb6.append((CharSequence) string, i20, length7);
                                break;
                            }
                            sb6.append(AbstractC1270.m2993(string.substring(i21, i22), z));
                            i20 = i22 + 3;
                            z = true;
                        } else {
                            int i23 = i20 + 1;
                            int i24 = i23;
                            while (true) {
                                if (i24 >= string.length()) {
                                    i24 = -1;
                                    break;
                                }
                                char cCharAt7 = string.charAt(i24);
                                if (cCharAt7 == '\\') {
                                    i24++;
                                } else if (cCharAt7 == '\"') {
                                    break;
                                }
                                i24++;
                            }
                            if (i24 < 0) {
                                sb6.append((CharSequence) string, i20, length7);
                                break;
                            }
                            sb6.append(AbstractC1270.m2993(string.substring(i23, i24), false));
                            i20 = i24 + 1;
                            z = true;
                        }
                    } else if (cCharAt6 == '\'') {
                        int iM2978 = AbstractC1270.m2978(i20 + 1, string);
                        if (iM2978 < 0) {
                            sb6.append((CharSequence) string, i20, length7);
                            break;
                        }
                        i2 = iM2978 + 1;
                        sb6.append((CharSequence) string, i20, i2);
                        i20 = i2;
                        z = true;
                    } else {
                        if (cCharAt6 == '/' && (i = i20 + 1) < length7) {
                            char cCharAt8 = string.charAt(i);
                            if (cCharAt8 == '/') {
                                i2 = i20 + 2;
                                while (i2 < length7) {
                                    char cCharAt9 = string.charAt(i2);
                                    if (cCharAt9 == '\n' || cCharAt9 == '\r') {
                                        break;
                                    }
                                    i2++;
                                }
                                sb6.append((CharSequence) string, i20, i2);
                            } else {
                                if (cCharAt8 == '*') {
                                    int i25 = i20 + 2;
                                    while (true) {
                                        int i26 = i25 + 1;
                                        if (i26 >= string.length()) {
                                            i25 = -1;
                                            break;
                                        }
                                        if (string.charAt(i25) == '*' && string.charAt(i26) == '/') {
                                            break;
                                        }
                                        i25 = i26;
                                    }
                                    if (i25 < 0) {
                                        sb6.append((CharSequence) string, i20, length7);
                                        break;
                                    }
                                    i2 = i25 + 2;
                                    sb6.append((CharSequence) string, i20, i2);
                                }
                                z = true;
                            }
                            i20 = i2;
                            z = true;
                        }
                        sb6.append(cCharAt6);
                        i20++;
                        z = true;
                    }
                }
                string = sb6.toString();
            }
            m3389("eval: nameSpace = ", c0007);
            if (!string.endsWith(";")) {
                string = string.concat(";");
            }
            StringReader stringReader = new StringReader(string);
            C1667 c1667 = this.f5635;
            if (c1667.f5627 == null) {
                c1667.f5627 = System.out;
            }
            PrintStream printStream = c1667.f5627;
            if (c1667.f5628 == null) {
                c1667.f5628 = System.err;
            }
            RunnableC1668 runnableC1668 = new RunnableC1668(stringReader, printStream, c1667.f5628, c0007, this, str);
            C2334 c2334 = runnableC1668.f5633;
            C0550 c0550 = new C0550(c0007);
            Stack stack = c0550.f2265;
            boolean zM4203 = false;
            Object objMo306 = null;
            InterfaceC2225 interfaceC2226 = null;
            while (!zM4203) {
                try {
                    try {
                        try {
                            try {
                                zM4203 = c2334.m4203();
                            } catch (Exception e) {
                                e = e;
                                interfaceC2225 = interfaceC2226;
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    e.printStackTrace();
                                }
                                throw new C1229(str2 + str + " unknown error: " + e.getMessage(), interfaceC2225, c0550, e);
                            }
                        } catch (C2332 e2) {
                            int i27 = runnableC1668.f5637;
                            if (i27 >= 0) {
                                try {
                                    Thread.sleep(i27);
                                } catch (InterruptedException unused) {
                                }
                            }
                            if (!runnableC1668.f5632) {
                                throw e2;
                            }
                            zM4203 = true;
                            if (((Boolean) threadLocal.get()).booleanValue()) {
                                e.printStackTrace();
                            }
                            throw new C1229(str2 + str + " unknown error: " + e.getMessage(), interfaceC2225, c0550, e);
                        }
                        try {
                            try {
                                C1687 c1687 = c2334.f7480;
                                if (c1687.f5744 - c1687.f5745 > 0) {
                                    interfaceC2225 = (InterfaceC2225) c1687.f5742.get(0);
                                    try {
                                        ((AbstractC2707) interfaceC2225).f8719 = str;
                                        objMo306 = interfaceC2225.mo306(c0550, runnableC1668);
                                        if (stack.size() > 1) {
                                            throw new C1669("Callstack growing: " + c0550);
                                        }
                                        if (objMo306 instanceof C2588) {
                                            objMo306 = ((C2588) objMo306).f8196;
                                            c2334.f7480.m3427();
                                            if (stack.size() <= 1) {
                                                break;
                                            }
                                            c0550.clear();
                                            c0550.m1927(c0007);
                                            break;
                                        }
                                        interfaceC2226 = interfaceC2225;
                                    } catch (C2895 e3) {
                                        e = e3;
                                        if (e.f4452 == null) {
                                            e.f4452 = interfaceC2225;
                                        }
                                        e.m2864(str2 + str);
                                        throw e;
                                    } catch (C1229 e4) {
                                        e = e4;
                                        if (((Boolean) threadLocal.get()).booleanValue()) {
                                            e.printStackTrace();
                                        }
                                        if (e.f4452 == null) {
                                            e.f4452 = interfaceC2225;
                                        }
                                        throw e.mo2865(str2 + str);
                                    } catch (C1669 e5) {
                                        e = e5;
                                        throw new C1229(str2 + str + " internal Error: " + e.getMessage(), interfaceC2225, c0550, e);
                                    } catch (C3409 e6) {
                                        e = e6;
                                        throw new C1229(str2 + str + " Token Parsing Error: " + e.getMessage(), interfaceC2225, c0550, e);
                                    } catch (Exception e7) {
                                        e = e7;
                                        if (((Boolean) threadLocal.get()).booleanValue()) {
                                            e.printStackTrace();
                                        }
                                        throw new C1229(str2 + str + " unknown error: " + e.getMessage(), interfaceC2225, c0550, e);
                                    }
                                }
                                c2334.f7480.m3427();
                                if (stack.size() > 1) {
                                    c0550.clear();
                                    c0550.m1927(c0007);
                                }
                            } catch (C2332 e8) {
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    
                                    m3390(e8.getMessage());
                                }
                                C2332.f7471 = str;
                                throw e8;
                            }
                        } catch (C1229 e9) {
                            e = e9;
                            interfaceC2225 = interfaceC2226;
                        } catch (C1669 e10) {
                            e = e10;
                            interfaceC2225 = interfaceC2226;
                        } catch (C2895 e11) {
                            e = e11;
                            interfaceC2225 = interfaceC2226;
                        } catch (C3409 e12) {
                            e = e12;
                            interfaceC2225 = interfaceC2226;
                        }
                    } catch (Throwable th) {
                        c2334.f7480.m3427();
                        if (stack.size() > 1) {
                            c0550.clear();
                            c0550.m1927(c0007);
                        }
                        throw th;
                    }
                } catch (C2895 e13) {
                    e = e13;
                    interfaceC2225 = interfaceC2226;
                    if (e.f4452 == null) {
                        e.f4452 = interfaceC2225;
                    }
                    e.m2864(str2 + str);
                    throw e;
                } catch (C1229 e14) {
                    e = e14;
                    interfaceC2225 = interfaceC2226;
                    if (((Boolean) threadLocal.get()).booleanValue()) {
                        e.printStackTrace();
                    }
                    if (e.f4452 == null) {
                        e.f4452 = interfaceC2225;
                    }
                    throw e.mo2865(str2 + str);
                } catch (C1669 e15) {
                    e = e15;
                    interfaceC2225 = interfaceC2226;
                    throw new C1229(str2 + str + " internal Error: " + e.getMessage(), interfaceC2225, c0550, e);
                } catch (C3409 e16) {
                    e = e16;
                    interfaceC2225 = interfaceC2226;
                    throw new C1229(str2 + str + " Token Parsing Error: " + e.getMessage(), interfaceC2225, c0550, e);
                }
            }
            return Primitive.unwrap(objMo306);
        } catch (IOException e17) {
            StringBuilder sbM4679 = AbstractC2668.m4679("Sourced file: ", str, " read error: ");
            sbM4679.append(e17.getMessage());
            throw new C1229(sbM4679.toString(), null, null, e17);
        }
    }

    public final void m3392() {
        C0482 c0482M346 = this.f5634.m346();
        m3396(new C0007(null, c0482M346, "Bsh Object").mo310(this), "bsh");
        This r1 = f5630;
        m3396(r1, "bsh.system");
        m3396(r1, "bsh.shared");
        m3396(new C0007(null, c0482M346, "Bsh Command Help Text").mo310(this), "bsh.help");
        m3396(System.getProperty("user.dir"), "bsh.cwd");
        Primitive primitive = Primitive.FALSE;
        m3396(primitive, "bsh.interactive");
        m3396(primitive, "bsh.evalOnly");
        m3396("3.0.0.beta10", "bsh.version");
    }

    public final File m3393(String str) {
        try {
            try {
                C0007 c0007 = this.f5634;
                
                String str2 = (String) Primitive.unwrap(c0007.m352("bsh.cwd").m339(new C0550(c0007), this, false));
                File file = new File(str);
                if (!file.isAbsolute()) {
                    file = new File(AbstractC2784.m4752(AbstractC2784.m4753(str2), File.separator, str));
                }
                return new File(file.getCanonicalPath());
            } catch (C3523 e) {
                throw e.mo4643(InterfaceC2225.f7223, new C0550());
            }
        } catch (C1229 e2) {
            throw new C1669("set: " + e2, e2);
        }
    }

    public final void m3394(String str) {
        C1667 c1667 = this.f5635;
        
        String str2 = ((Object) str) + "\n";
        PrintStream printStream = c1667.f5627;
        if (printStream != null) {
            printStream.print((Object) str2);
            c1667.f5627.flush();
        }
    }

    public final void m3395(C0007 c0007) {
        this.f5634 = c0007;
        if (c0007 != null) {
            try {
                if (c0007.m356("bsh", true) instanceof This) {
                    return;
                }
                m3392();
            } catch (C3523 e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final void m3396(Object obj, String str) {
        try {
            C0550 c0550 = new C0550(this.f5634);
            try {
                if (C0006.m329(str)) {
                    this.f5634.m352(str).m338(c0550, this).m3497(obj, false);
                } else {
                    this.f5634.mo314(str, obj, true);
                }
            } catch (C3523 e) {
                throw e.mo4643(InterfaceC2225.f7223, c0550);
            }
        } catch (C1229 e2) {
            throw new C1669("set: " + e2, e2);
        }
    }

    public RunnableC1668(C0007 c0007, String str) {
        this(null, System.out, System.err, c0007, null, str);
        this.f5638 = true;
        m3396(Primitive.TRUE, "bsh.evalOnly");
    }
}
