package bsh;

import bsh.snapshot.BshSnapshot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000.AbstractC0178;
import p000.AbstractC0478;
import p000.AbstractC0983;
import p000.AbstractC1095;
import p000.AbstractC2647;
import p000.AbstractC2844;
import p000.C0449;
import p000.C0458;
import p000.C0477;
import p000.C0527;
import p000.C0784;
import p000.C0982;
import p000.C1231;
import p000.C1682;
import p000.C1683;
import p000.C1684;
import p000.C1705;
import p000.C1715;
import p000.C1787;
import p000.C1910;
import p000.C2372;
import p000.C2954;
import p000.C3467;
import p000.C3581;
import p000.InterfaceC0455;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0008 implements Runnable, Serializable, InterfaceC0455 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final ThreadLocal f500 = ThreadLocal.withInitial(new C1682(0));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final This f501 = This.getThis(new C0012(null, null, "bsh.system"), null);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C1910 f502 = new C1910();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f503;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final transient C0015 f504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0012 f505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1683 f506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String f507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f509;

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    public RunnableC0008(StringReader stringReader, PrintStream printStream, PrintStream printStream2, C0012 c0012, RunnableC0008 runnableC0008, String str) {
        C1683 c1683 = new C1683();
        c1683.f5663 = stringReader;
        c1683.f5664 = printStream;
        c1683.f5665 = printStream2;
        C1683.f5662 = printStream2;
        this.f508 = -1;
        ThreadLocal threadLocal = f500;
        long jNanoTime = ((Boolean) threadLocal.get()).booleanValue() ? System.nanoTime() : 0L;
        if (runnableC0008 != null) {
            this.f504 = runnableC0008.f504;
            this.f509 = runnableC0008.f509;
        }
        this.f507 = str;
        c0012 = c0012 == null ? new C0012(c0012, C0458.m1829(this), "global") : c0012;
        this.f506 = c1683;
        C0015 c0015 = this.f504;
        if (c0015 != null) {
            C1705 c1705 = c0015.f548;
            if (c1705.f5787 - c1705.f5788 == 0) {
                c0015.m433(stringReader);
            } else {
                this.f504 = new C0015(stringReader);
            }
        } else {
            this.f504 = new C0015(stringReader);
        }
        m346(c0012);
        this.f505.m365().mo302(this);
        if (((Boolean) threadLocal.get()).booleanValue()) {
            m333("Time to initialize interpreter: interactive=", Boolean.FALSE, " ", Long.valueOf(System.nanoTime() - jNanoTime), " nanoseconds.");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        PrintStream printStream = System.out;
        C1683 c1683 = this.f506;
        c1683.f5664 = printStream;
        c1683.f5665 = System.err;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m333(Object... objArr) {
        if (((Boolean) f500.get()).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj);
            }
            C1683.f5662.println("// Debug: " + sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:179:0x0306  */
    /* JADX WARN: Code duplicated, block: B:181:0x030c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0328  */
    /* JADX WARN: Code duplicated, block: B:188:0x032e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:344:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0131  */
    /* JADX WARN: Code duplicated, block: B:96:0x0139  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String m334(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int size;
        C0784 c0784;
        String strM2653;
        StringBuilder sb;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        C0982 c0982M2659;
        int i8;
        char cCharAt;
        char cCharAt2;
        String string = str;
        HashSet hashSet = AbstractC0178.f1269;
        char c = ')';
        char c2 = '(';
        if (string == null || string.indexOf(64) < 0) {
            z = true;
        } else {
            int length = string.length();
            StringBuilder sb2 = new StringBuilder(length);
            int i9 = 0;
            while (i9 < length) {
                int iM1366 = AbstractC0178.m1366(i9, string);
                if (iM1366 > i9) {
                    sb2.append((CharSequence) string, i9, iM1366);
                } else if (string.charAt(i9) != '@') {
                    sb2.append(string.charAt(i9));
                    i9++;
                } else {
                    int length2 = string.length();
                    int i10 = i9 + 1;
                    if (i10 >= length2 || !((cCharAt2 = string.charAt(i10)) == '_' || Character.isLetterOrDigit(cCharAt2))) {
                        iM1366 = -1;
                    } else {
                        int i11 = i10;
                        while (i11 < length2) {
                            char cCharAt3 = string.charAt(i11);
                            if (cCharAt3 != '_' && !Character.isLetterOrDigit(cCharAt3)) {
                                break;
                            }
                            i11++;
                        }
                        if (AbstractC0178.f1269.contains(string.substring(i10, i11)) && (i11 >= length2 || !Character.isJavaIdentifierPart(string.charAt(i11)))) {
                            iM1366 = i11;
                        } else {
                            iM1366 = -1;
                        }
                    }
                    if (iM1366 > i9) {
                        sb2.append((CharSequence) string, i9, iM1366);
                    } else {
                        int length3 = string.length();
                        if (i10 < length3 && Character.isJavaIdentifierStart(string.charAt(i10))) {
                            i8 = i10;
                            while (i8 < length3 && Character.isJavaIdentifierPart(string.charAt(i8))) {
                                i8++;
                            }
                            if (!string.substring(i10, i8).equals("interface")) {
                                while (true) {
                                    if (i8 >= length3 || string.charAt(i8) != '.') {
                                        while (i8 < length3) {
                                            char cCharAt4 = string.charAt(i8);
                                            if (cCharAt4 != ' ' && cCharAt4 != '\t' && cCharAt4 != '\f') {
                                                break;
                                            }
                                            i8++;
                                        }
                                        if (i8 < length3 && string.charAt(i8) == '(') {
                                            int length4 = string.length();
                                            int i12 = 0;
                                            while (true) {
                                                if (i8 >= length4) {
                                                    i8 = -1;
                                                    break;
                                                }
                                                int iM1367 = AbstractC0178.m1366(i8, string);
                                                if (iM1367 <= i8) {
                                                    char cCharAt5 = string.charAt(i8);
                                                    if (cCharAt5 != '(') {
                                                        if (cCharAt5 == ')' && (i12 = i12 - 1) == 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        i12++;
                                                    }
                                                } else {
                                                    i8 = iM1367 - 1;
                                                }
                                                i8++;
                                            }
                                            if (i8 >= 0) {
                                                i8++;
                                            }
                                        }
                                    } else {
                                        i8++;
                                        if (i8 < length3 && Character.isJavaIdentifierStart(string.charAt(i8))) {
                                            while (i8 < length3 && Character.isJavaIdentifierPart(string.charAt(i8))) {
                                                i8++;
                                            }
                                        }
                                    }
                                }
                            }
                            if (i8 > i9) {
                                while (i9 < i8) {
                                    cCharAt = string.charAt(i9);
                                    if (cCharAt != '\n' || cCharAt == '\r') {
                                        sb2.append(cCharAt);
                                    }
                                    i9++;
                                }
                                i9 = i8;
                                while (i9 < length && (string.charAt(i9) == ' ' || string.charAt(i9) == '\t')) {
                                    i9++;
                                }
                            } else {
                                sb2.append('@');
                                i9 = i10;
                            }
                        }
                        i8 = -1;
                        if (i8 > i9) {
                            while (i9 < i8) {
                                cCharAt = string.charAt(i9);
                                if (cCharAt != '\n') {
                                    sb2.append(cCharAt);
                                } else {
                                    sb2.append(cCharAt);
                                }
                                i9++;
                            }
                            i9 = i8;
                            while (i9 < length) {
                                i9++;
                            }
                        } else {
                            sb2.append('@');
                            i9 = i10;
                        }
                    }
                }
                i9 = iM1366;
            }
            z = true;
            string = sb2.toString();
        }
        HashSet hashSet2 = AbstractC0983.f3606;
        if (string != null && string.indexOf(61) >= 0 && string.indexOf(40) >= 0) {
            HashSet hashSet3 = new HashSet();
            int length5 = string.length();
            int i13 = 0;
            while (i13 < length5) {
                int iM2655 = AbstractC0983.m2655(i13, string);
                if (iM2655 > i13) {
                    i13 = iM2655;
                } else if (string.charAt(i13) == '(' && (c0982M2659 = AbstractC0983.m2659(i13, string)) != null) {
                    String str2 = (String) c0982M2659.f3604;
                    ArrayList arrayList2 = (ArrayList) ((C0449) c0982M2659.f3605).f2052;
                    hashSet3.add(AbstractC0983.m2653(str2, arrayList2, arrayList2.size()));
                    i13 = c0982M2659.f3603;
                } else {
                    i13++;
                }
            }
            StringBuilder sb3 = new StringBuilder(string.length() + 128);
            int length6 = string.length();
            int i14 = 0;
            int i15 = 0;
            while (i14 < length6) {
                int iM2656 = AbstractC0983.m2655(i14, string);
                if (iM2656 > i14) {
                    i14 = iM2656;
                } else if (string.charAt(i14) != c2) {
                    i14++;
                } else {
                    C0982 c0982M26510 = AbstractC0983.m2659(i14, string);
                    if (c0982M26510 == null) {
                        i4 = length6;
                        i3 = i14;
                        c0784 = null;
                    } else {
                        C0449 c0449 = (C0449) c0982M26510.f3605;
                        if (c0449.f2048 && c0449.f2049 && c0449.f2050) {
                            int i16 = c0982M26510.f3602;
                            int iM2650 = AbstractC0983.m2650(string, i14, c2, c);
                            String strSubstring = string.substring(i16, i14);
                            int i17 = iM2650 + 1;
                            int iM2651 = AbstractC0983.m2651(i17, string);
                            if (iM2651 < 0) {
                                i4 = length6;
                                i3 = i14;
                                c0784 = null;
                            } else {
                                String strSubstring2 = string.substring(i17, iM2651);
                                int iM2652 = AbstractC0983.m2650(string, iM2651, '{', '}') + 1;
                                String strSubstring3 = string.substring(iM2651, iM2652);
                                String str3 = (String) c0982M26510.f3604;
                                StringBuilder sb4 = new StringBuilder(strSubstring3.length() + strSubstring.length() + 128);
                                sb4.append(strSubstring);
                                sb4.append(c2);
                                ArrayList arrayList3 = (ArrayList) c0449.f2052;
                                sb4.append(AbstractC0983.m2652(arrayList3, arrayList3.size()));
                                sb4.append(')');
                                sb4.append(strSubstring2);
                                sb4.append(strSubstring3);
                                String strTrim = strSubstring.trim();
                                if (strTrim.endsWith(str3)) {
                                    i3 = i14;
                                    String strTrim2 = strTrim.substring(0, strTrim.length() - str3.length()).trim();
                                    if (strTrim2.isEmpty()) {
                                        i4 = length6;
                                    } else {
                                        String[] strArrSplit = strTrim2.split("\\s+");
                                        i4 = length6;
                                        int i18 = 0;
                                        String str4 = null;
                                        while (i18 < strArrSplit.length) {
                                            String str5 = strArrSplit[i18];
                                            String[] strArr = strArrSplit;
                                            if (!str5.startsWith("@") && !AbstractC0983.f3607.contains(str5)) {
                                                str4 = str5;
                                            }
                                            i18++;
                                            strArrSplit = strArr;
                                        }
                                        if (str4 != null) {
                                            z2 = !"void".equals(str4);
                                        }
                                        size = arrayList3.size() - 1;
                                        while (size >= c0449.f2051) {
                                            strM2653 = AbstractC0983.m2653(str3, arrayList3, size);
                                            if (hashSet3.contains(strM2653)) {
                                                arrayList = arrayList3;
                                                i7 = size;
                                            } else {
                                                sb4.append('\n');
                                                sb4.append(strSubstring);
                                                sb4.append('(');
                                                sb4.append(AbstractC0983.m2652(arrayList3, size));
                                                sb4.append(')');
                                                sb4.append(strSubstring2);
                                                sb4.append('{');
                                                if (z2) {
                                                    sb4.append("return ");
                                                }
                                                sb4.append(str3);
                                                sb4.append('(');
                                                sb = new StringBuilder();
                                                arrayList = arrayList3;
                                                for (i5 = 0; i5 < size; i5++) {
                                                    if (sb.length() > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append((String) ((ArrayList) c0449.f2053).get(i5));
                                                }
                                                i6 = size;
                                                i7 = i6;
                                                while (i6 < arrayList.size()) {
                                                    if (sb.length() > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append((String) ((ArrayList) c0449.f2054).get(i6));
                                                    i6++;
                                                }
                                                sb4.append(sb.toString());
                                                sb4.append(");}");
                                                hashSet3.add(strM2653);
                                            }
                                            size = i7 - 1;
                                            z2 = z2;
                                            arrayList3 = arrayList;
                                        }
                                        c0784 = new C0784(i16, iM2652, sb4.toString());
                                    }
                                } else {
                                    i4 = length6;
                                    i3 = i14;
                                }
                                z2 = false;
                                size = arrayList3.size() - 1;
                                while (size >= c0449.f2051) {
                                    strM2653 = AbstractC0983.m2653(str3, arrayList3, size);
                                    if (hashSet3.contains(strM2653)) {
                                        arrayList = arrayList3;
                                        i7 = size;
                                    } else {
                                        sb4.append('\n');
                                        sb4.append(strSubstring);
                                        sb4.append('(');
                                        sb4.append(AbstractC0983.m2652(arrayList3, size));
                                        sb4.append(')');
                                        sb4.append(strSubstring2);
                                        sb4.append('{');
                                        if (z2) {
                                            sb4.append("return ");
                                        }
                                        sb4.append(str3);
                                        sb4.append('(');
                                        sb = new StringBuilder();
                                        arrayList = arrayList3;
                                        while (i5 < size) {
                                            if (sb.length() > 0) {
                                                sb.append(", ");
                                            }
                                            sb.append((String) ((ArrayList) c0449.f2053).get(i5));
                                        }
                                        i6 = size;
                                        i7 = i6;
                                        while (i6 < arrayList.size()) {
                                            if (sb.length() > 0) {
                                                sb.append(", ");
                                            }
                                            sb.append((String) ((ArrayList) c0449.f2054).get(i6));
                                            i6++;
                                        }
                                        sb4.append(sb.toString());
                                        sb4.append(");}");
                                        hashSet3.add(strM2653);
                                    }
                                    size = i7 - 1;
                                    z2 = z2;
                                    arrayList3 = arrayList;
                                }
                                c0784 = new C0784(i16, iM2652, sb4.toString());
                            }
                        } else {
                            i4 = length6;
                            i3 = i14;
                            c0784 = null;
                        }
                    }
                    if (c0784 != null) {
                        sb3.append((CharSequence) string, i15, c0784.f2977);
                        sb3.append((String) c0784.f2979);
                        i15 = c0784.f2978;
                        i14 = i15;
                    } else {
                        i14 = i3 + 1;
                    }
                    length6 = i4;
                    c = ')';
                    c2 = '(';
                }
            }
            sb3.append((CharSequence) string, i15, length6);
            string = sb3.toString();
        }
        if (string == null || string.indexOf(36) < 0 || string.indexOf(34) < 0) {
            return string;
        }
        int length7 = string.length();
        StringBuilder sb5 = new StringBuilder(length7 + 32);
        int i19 = 0;
        while (i19 < length7) {
            char cCharAt6 = string.charAt(i19);
            if (cCharAt6 == '\"') {
                if (C1787.m3668(i19, string)) {
                    int i20 = i19 + 3;
                    int i21 = i20;
                    while (true) {
                        if (i21 + 2 >= string.length()) {
                            i21 = -1;
                            break;
                        }
                        if (C1787.m3668(i21, string)) {
                            break;
                        }
                        i21++;
                    }
                    if (i21 < 0) {
                        sb5.append((CharSequence) string, i19, length7);
                        break;
                    }
                    sb5.append(C1787.m3676(string.substring(i20, i21), z));
                    i19 = i21 + 3;
                    z = true;
                } else {
                    int i22 = i19 + 1;
                    int i23 = i22;
                    while (true) {
                        if (i23 >= string.length()) {
                            i23 = -1;
                            z = true;
                            break;
                        }
                        char cCharAt7 = string.charAt(i23);
                        if (cCharAt7 != '\\') {
                            z = true;
                            if (cCharAt7 == '\"') {
                                break;
                            }
                        } else {
                            i23++;
                        }
                        i23++;
                    }
                    if (i23 < 0) {
                        sb5.append((CharSequence) string, i19, length7);
                        break;
                    }
                    sb5.append(C1787.m3676(string.substring(i22, i23), false));
                    i19 = i23 + 1;
                }
            } else if (cCharAt6 == '\'') {
                int iM3665 = C1787.m3665(i19 + 1, string);
                if (iM3665 < 0) {
                    sb5.append((CharSequence) string, i19, length7);
                    break;
                }
                i = iM3665 + 1;
                sb5.append((CharSequence) string, i19, i);
                i19 = i;
            } else {
                if (cCharAt6 == '/' && (i2 = i19 + 1) < length7) {
                    char cCharAt8 = string.charAt(i2);
                    if (cCharAt8 == '/') {
                        i = i19 + 2;
                        while (i < length7) {
                            char cCharAt9 = string.charAt(i);
                            if (cCharAt9 == '\n' || cCharAt9 == '\r') {
                                break;
                            }
                            i++;
                        }
                        sb5.append((CharSequence) string, i19, i);
                    } else if (cCharAt8 == '*') {
                        int i24 = i19 + 2;
                        while (true) {
                            int i25 = i24 + 1;
                            if (i25 >= string.length()) {
                                i24 = -1;
                                break;
                            }
                            if (string.charAt(i24) == '*' && string.charAt(i25) == '/') {
                                break;
                            }
                            i24 = i25;
                        }
                        if (i24 < 0) {
                            sb5.append((CharSequence) string, i19, length7);
                            break;
                        }
                        i = i24 + 2;
                        sb5.append((CharSequence) string, i19, i);
                    }
                    i19 = i;
                }
                sb5.append(cCharAt6);
                i19++;
            }
        }
        return sb5.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static String m335(Reader reader, String str) throws C1231 {
        try {
            StringBuilder sb = new StringBuilder(1024);
            char[] cArr = new char[4096];
            while (true) {
                int i = reader.read(cArr);
                if (i == -1) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } catch (IOException e) {
            StringBuilder sbM4625 = AbstractC2647.m4625("Sourced file: ", str, " read error: ");
            sbM4625.append(e.getMessage());
            throw new C1231(sbM4625.toString(), null, null, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static void m336(Node node) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(node);
        while (!arrayList.isEmpty()) {
            Node node2 = (Node) arrayList.remove(arrayList.size() - 1);
            if (node2 instanceof SimpleNode) {
                SimpleNode simpleNode = (SimpleNode) node2;
                simpleNode.firstToken = null;
                simpleNode.lastToken = null;
                simpleNode.parser = null;
                for (Node node3 : simpleNode.jjtGetChildren()) {
                    if (node3 != null) {
                        arrayList.add(node3);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC0455
    public final void classLoaderChanged() {
        AbstractC0016.f573.clear();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = f500;
        if (this.f509) {
            throw new RuntimeException("bsh Interpreter: No stream");
        }
        C0527 c0527 = new C0527(this.f505);
        Stack stack = c0527.f2221;
        this.f503 = false;
        while (!Thread.interrupted() && !this.f503) {
            try {
                try {
                    try {
                        try {
                            this.f503 = m345();
                            C1705 c1705 = this.f504.f548;
                            if (c1705.f5787 - c1705.f5788 > 0) {
                                Node node = (Node) c1705.f5785.get(0);
                                node.setSourceFile(this.f507);
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    node.dump(">");
                                }
                                node.eval(c0527, this);
                                if (stack.size() > 1) {
                                    throw new C1684("Callstack growing: " + c0527);
                                }
                            }
                            this.f504.f548.m3595();
                            if (stack.size() > 1) {
                                c0527.clear();
                                c0527.m2022(this.f505);
                            }
                        } catch (C2954 e) {
                            m338("Target Exception: " + e.getMessage());
                            if (e.f9479) {
                                e.m4963(((Boolean) threadLocal.get()).booleanValue(), m341());
                            }
                            this.f503 = true;
                            m347(e.m4962(), "$_e");
                            this.f504.f548.m3595();
                            if (stack.size() > 1) {
                            }
                        } catch (C3467 e2) {
                            m338("Error parsing input: " + e2);
                            C0015 c0015 = this.f504;
                            Reader reader = this.f506.f5663;
                            C1715 c1715 = c0015.f550;
                            int[] iArr = c1715.f5819;
                            int i = c1715.f5814;
                            int i2 = iArr[i];
                            int i3 = c1715.f5820[i];
                            c1715.f5825 = new char[4096];
                            c1715.f5826 = -1;
                            c1715.f5827 = reader;
                            c1715.m3602(i2, i3);
                            this.f503 = true;
                            this.f504.f548.m3595();
                            if (stack.size() > 1) {
                            }
                        }
                    } catch (C1684 e3) {
                        m338("Internal Error: " + e3.getMessage());
                        this.f503 = true;
                        this.f504.f548.m3595();
                        if (stack.size() > 1) {
                        }
                    } catch (C2372 e4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parser Error: ");
                        ((Boolean) threadLocal.get()).getClass();
                        sb.append(e4.getMessage());
                        m338(sb.toString());
                        if (((Boolean) threadLocal.get()).booleanValue()) {
                            e4.printStackTrace();
                        }
                        this.f503 = true;
                        this.f504.m433(this.f506.f5663);
                        this.f504.f548.m3595();
                        if (stack.size() > 1) {
                        }
                    }
                } catch (C1231 e5) {
                    m338("Evaluation Error: " + e5.f4451);
                    if (((Boolean) threadLocal.get()).booleanValue()) {
                        e5.printStackTrace();
                    }
                    this.f503 = true;
                    this.f504.f548.m3595();
                    if (stack.size() > 1) {
                    }
                } catch (Exception e6) {
                    m338("Unknown error: " + e6);
                    if (((Boolean) threadLocal.get()).booleanValue()) {
                        e6.printStackTrace();
                    }
                    this.f503 = true;
                    this.f504.f548.m3595();
                    if (stack.size() > 1) {
                    }
                }
            } catch (Throwable th) {
                this.f504.f548.m3595();
                if (stack.size() > 1) {
                    c0527.clear();
                    c0527.m2022(this.f505);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final BshSnapshot m337(BufferedReader bufferedReader, C0012 c0012, String str) {
        String strM334 = m334(m335(bufferedReader, str));
        if (!strM334.endsWith(";")) {
            strM334 = strM334.concat(";");
        }
        StringReader stringReader = new StringReader(strM334);
        C1683 c1683 = this.f506;
        if (c1683.f5664 == null) {
            c1683.f5664 = System.out;
        }
        RunnableC0008 runnableC0008 = new RunnableC0008(stringReader, c1683.f5664, m341(), c0012, this, str);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        boolean zM345 = runnableC0008.m345();
                        C1705 c1705 = runnableC0008.f504.f548;
                        if (c1705.f5787 - c1705.f5788 > 0) {
                            Node node = (Node) c1705.f5785.get(0);
                            node.setSourceFile(str);
                            m336(node);
                            arrayList.add(node);
                        }
                        runnableC0008.f504.f548.m3595();
                        z = zM345;
                    } catch (C1684 e) {
                        throw new C1231("Sourced file: " + str + " internal Error: " + e.getMessage(), null, null, e);
                    } catch (C3467 e2) {
                        throw new C1231("Sourced file: " + str + " Token Parsing Error: " + e2.getMessage(), null, null, e2);
                    }
                } catch (C2372 e3) {
                    C2372.f7609 = str;
                    throw e3;
                } catch (Exception e4) {
                    throw new C1231("Sourced file: " + str + " unknown error: " + e4.getMessage(), null, null, e4);
                }
            } catch (Throwable th) {
                runnableC0008.f504.f548.m3595();
                throw th;
            }
        }
        return new BshSnapshot((Node[]) arrayList.toArray(new Node[0]));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m338(String str) {
        C1683 c1683 = this.f506;
        if (c1683.f5664 != null) {
            String str2 = ((Object) ("// Error: " + ((Object) str))) + "\n";
            PrintStream printStream = c1683.f5664;
            if (printStream != null) {
                printStream.print((Object) str2);
                c1683.f5664.flush();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m339(Reader reader, C0012 c0012, String str) {
        ThreadLocal threadLocal = f500;
        String strM334 = m334(m335(reader, str));
        m333("eval: nameSpace = ", c0012);
        if (!strM334.endsWith(";")) {
            strM334 = strM334.concat(";");
        }
        StringReader stringReader = new StringReader(strM334);
        C1683 c1683 = this.f506;
        if (c1683.f5664 == null) {
            c1683.f5664 = System.out;
        }
        RunnableC0008 runnableC0008 = new RunnableC0008(stringReader, c1683.f5664, m341(), c0012, this, str);
        C0527 c0527 = new C0527(c0012);
        Stack stack = c0527.f2221;
        Object obj = null;
        boolean z = false;
        Node node = null;
        while (!z) {
            try {
                try {
                    try {
                        boolean zM345 = runnableC0008.m345();
                        C1705 c1705 = runnableC0008.f504.f548;
                        if (c1705.f5787 - c1705.f5788 > 0) {
                            Node node2 = (Node) c1705.f5785.get(0);
                            try {
                                node2.setSourceFile(str);
                                Object objEval = node2.eval(c0527, runnableC0008);
                                if (stack.size() > 1) {
                                    throw new C1684("Callstack growing: " + c0527);
                                }
                                if (objEval instanceof ReturnControl) {
                                    obj = ((ReturnControl) objEval).value;
                                    runnableC0008.f504.f548.m3595();
                                    if (stack.size() <= 1) {
                                        break;
                                    }
                                    c0527.clear();
                                    c0527.m2022(c0012);
                                    break;
                                }
                                node = node2;
                                obj = objEval;
                            } catch (C1684 e) {
                                e = e;
                                node = node2;
                                throw new C1231("Sourced file: " + str + " internal Error: " + e.getMessage(), node, c0527, e);
                            } catch (C2954 e2) {
                                e = e2;
                                node = node2;
                                if (e.f4450 == null) {
                                    e.f4450 = node;
                                }
                                e.m2986("Sourced file: " + str);
                                throw e;
                            } catch (C1231 e3) {
                                e = e3;
                                node = node2;
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    e.printStackTrace();
                                }
                                if (e.f4450 == null) {
                                    e.f4450 = node;
                                }
                                throw e.mo2987("Sourced file: " + str);
                            } catch (C3467 e4) {
                                e = e4;
                                node = node2;
                                throw new C1231("Sourced file: " + str + " Token Parsing Error: " + e.getMessage(), node, c0527, e);
                            } catch (Exception e5) {
                                e = e5;
                                node = node2;
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    e.printStackTrace();
                                }
                                throw new C1231("Sourced file: " + str + " unknown error: " + e.getMessage(), node, c0527, e);
                            }
                        }
                        runnableC0008.f504.f548.m3595();
                        if (stack.size() > 1) {
                            c0527.clear();
                            c0527.m2022(c0012);
                        }
                        z = zM345;
                    } catch (C2372 e6) {
                        if (((Boolean) threadLocal.get()).booleanValue()) {
                            ((Boolean) threadLocal.get()).getClass();
                            m338(e6.getMessage());
                        }
                        C2372.f7609 = str;
                        throw e6;
                    }
                } catch (Throwable th) {
                    runnableC0008.f504.f548.m3595();
                    if (stack.size() > 1) {
                        c0527.clear();
                        c0527.m2022(c0012);
                    }
                    throw th;
                }
            } catch (C1684 e7) {
                e = e7;
            } catch (C2954 e8) {
                e = e8;
            } catch (C1231 e9) {
                e = e9;
            } catch (C3467 e10) {
                e = e10;
            } catch (Exception e11) {
                e = e11;
            }
        }
        return Primitive.unwrap(obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object m340(FileInputStream fileInputStream, SecretKeySpec secretKeySpec, String str) throws IOException {
        byte[] bArr = AbstractC0478.f2116;
        byte[] bArr2 = new byte[4];
        int i = 0;
        int i2 = 0;
        while (i2 < 4) {
            int i3 = fileInputStream.read(bArr2, i2, 4 - i2);
            if (i3 < 0) {
                throw new IOException("BeanShell snapshot unexpected end");
            }
            i2 += i3;
        }
        if (!Arrays.equals(bArr2, bArr)) {
            throw new IOException("BeanShell snapshot invalid header");
        }
        int i4 = fileInputStream.read();
        if (i4 != 1) {
            throw new IOException(AbstractC1095.m2794(i4, "BeanShell snapshot unsupported version: "));
        }
        int i5 = fileInputStream.read();
        if (i5 <= 0 || i5 > 32) {
            throw new IOException("BeanShell snapshot invalid IV length");
        }
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = fileInputStream.read(bArr3, i6, i5 - i6);
            if (i7 < 0) {
                throw new IOException("BeanShell snapshot unexpected end");
            }
            i6 += i7;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            C0477 c0477 = new C0477(new CipherInputStream(fileInputStream, cipher));
            try {
                Object object = c0477.readObject();
                if (!(object instanceof BshSnapshot)) {
                    throw new InvalidClassException("BeanShell snapshot unexpected payload");
                }
                BshSnapshot bshSnapshot = (BshSnapshot) object;
                if (bshSnapshot.getFormatVersion() != 1) {
                    throw new IOException("BeanShell snapshot unsupported AST format: " + bshSnapshot.getFormatVersion());
                }
                c0477.close();
                C0012 c0012 = this.f505;
                StringReader stringReader = new StringReader("");
                C1683 c1683 = this.f506;
                if (c1683.f5664 == null) {
                    c1683.f5664 = System.out;
                }
                RunnableC0008 runnableC0008 = new RunnableC0008(stringReader, c1683.f5664, m341(), c0012, this, str);
                C0527 c0527 = new C0527(c0012);
                Stack stack = c0527.f2221;
                Node[] nodes = bshSnapshot.getNodes();
                int length = nodes.length;
                Object obj = null;
                while (i < length) {
                    Node node = nodes[i];
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        node.setSourceFile(str);
                                        Object objEval = node.eval(c0527, runnableC0008);
                                        if (stack.size() > 1) {
                                            throw new C1684("Callstack growing: " + c0527);
                                        }
                                        if (objEval instanceof ReturnControl) {
                                            obj = ((ReturnControl) objEval).value;
                                            runnableC0008.f504.f548.m3595();
                                            if (stack.size() <= 1) {
                                                break;
                                            }
                                            c0527.clear();
                                            c0527.m2022(c0012);
                                            break;
                                        }
                                        runnableC0008.f504.f548.m3595();
                                        if (stack.size() > 1) {
                                            c0527.clear();
                                            c0527.m2022(c0012);
                                        }
                                        i++;
                                        obj = objEval;
                                    } catch (Exception e) {
                                        throw new C1231("Snapshot: " + str + " unknown error: " + e.getMessage(), node, c0527, e);
                                    }
                                } catch (C2954 e2) {
                                    if (e2.f4450 == null) {
                                        e2.f4450 = node;
                                    }
                                    e2.m2986("Snapshot: " + str);
                                    throw e2;
                                }
                            } catch (C1231 e3) {
                                if (e3.f4450 == null) {
                                    e3.f4450 = node;
                                }
                                throw e3.mo2987("Snapshot: " + str);
                            }
                        } catch (Throwable th) {
                            runnableC0008.f504.f548.m3595();
                            if (stack.size() <= 1) {
                                throw th;
                            }
                            c0527.clear();
                            c0527.m2022(c0012);
                            throw th;
                        }
                    } catch (C1684 e4) {
                        throw new C1231("Snapshot: " + str + " internal Error: " + e4.getMessage(), node, c0527, e4);
                    }
                }
                return Primitive.unwrap(obj);
            } catch (Throwable th2) {
                try {
                    c0477.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (ClassNotFoundException e5) {
            throw new IOException("BeanShell snapshot class not found", e5);
        } catch (GeneralSecurityException e6) {
            throw new IOException("BeanShell snapshot decrypt failed", e6);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final PrintStream m341() {
        C1683 c1683 = this.f506;
        if (c1683.f5665 == null) {
            c1683.f5665 = System.err;
        }
        return c1683.f5665;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m342() {
        C0458 c0458M365 = this.f505.m365();
        m347(new C0012(null, c0458M365, "Bsh Object").mo313(this), "bsh");
        This r1 = f501;
        m347(r1, "bsh.system");
        m347(r1, "bsh.shared");
        m347(new C0012(null, c0458M365, "Bsh Command Help Text").mo313(this), "bsh.help");
        m347(System.getProperty("user.dir"), "bsh.cwd");
        Primitive primitive = Primitive.FALSE;
        m347(primitive, "bsh.interactive");
        m347(primitive, "bsh.evalOnly");
        m347("3.0.0.beta12", "bsh.version");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final File m343(String str) {
        try {
            try {
                C0012 c0012 = this.f505;
                c0012.getClass();
                String str2 = (String) Primitive.unwrap(c0012.m372("bsh.cwd").m360(new C0527(c0012), this, false));
                File file = new File(str);
                if (!file.isAbsolute()) {
                    file = new File(AbstractC2844.m4786(AbstractC2844.m4787(str2), File.separator, str));
                }
                return new File(file.getCanonicalPath());
            } catch (C3581 e) {
                throw e.mo4677(Node.JAVACODE, new C0527());
            }
        } catch (C1231 e2) {
            throw new C1684("set: " + e2, e2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m344(String str) {
        C1683 c1683 = this.f506;
        c1683.getClass();
        String str2 = ((Object) str) + "\n";
        PrintStream printStream = c1683.f5664;
        if (printStream != null) {
            printStream.print((Object) str2);
            c1683.f5664.flush();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m345() throws C2372 {
        try {
            return this.f504.m422();
        } catch (C2372 e) {
            int i = this.f508;
            if (i >= 0) {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException unused) {
                }
            }
            if (this.f503) {
                return true;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m346(C0012 c0012) {
        this.f505 = c0012;
        if (c0012 != null) {
            try {
                if (c0012.m376("bsh", true) instanceof This) {
                    return;
                }
                m342();
            } catch (C3581 e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m347(Object obj, String str) {
        try {
            C0527 c0527 = new C0527(this.f505);
            try {
                if (C0010.m350(str)) {
                    this.f505.m372(str).m359(c0527, this).assign(obj, false);
                } else {
                    this.f505.mo317(str, obj, true);
                }
            } catch (C3581 e) {
                throw e.mo4677(Node.JAVACODE, c0527);
            }
        } catch (C1231 e2) {
            throw new C1684("set: " + e2, e2);
        }
    }

    public RunnableC0008(C0012 c0012, String str) {
        this(null, System.out, System.err, c0012, null, str);
        this.f509 = true;
        m347(Primitive.TRUE, "bsh.evalOnly");
    }
}
