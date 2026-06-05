package bsh;

import bsh.snapshot.BshSnapshot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC2418Ujhhgtgfeyxiexzf;
import p000.AbstractC2590feyxiexzfUjhhgtg;
import p000.AbstractC3098Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C0168Ujhhgtgfeyxiexzf;
import p000.C0710Ujhhgtgfeyxiexzf;
import p000.C0711Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0718Ujhhgtgfeyxiexzf;
import p000.C0733Ujhhgtgfeyxiexzf;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C1405feyxiexzfUjhhgtg;
import p000.C1726Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2567Ujhhgtgfeyxiexzf;
import p000.C2587feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C2809Ujhhgtgfeyxiexzf;
import p000.C3102Ujhhgtgfeyxiexzf;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3450Ujhhgtgfeyxiexzf;
import p000.C3647Ujhhgtgfeyxiexzf;
import p000.InterfaceC2573Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0026Ujhhgtgfeyxiexzf implements Runnable, Serializable, InterfaceC2573Ujhhgtgfeyxiexzf {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final ThreadLocal f514Ujhhgtgfeyxiexzf = ThreadLocal.withInitial(new C0710Ujhhgtgfeyxiexzf(0));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final This f515Ujhhgtgfeyxiexzf = This.getThis(new C0029Ujhhgtgfeyxiexzf(null, null, "bsh.system"), null);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C0168Ujhhgtgfeyxiexzf f516Ujhhgtgfeyxiexzf = new C0168Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f517Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final transient C0032Ujhhgtgfeyxiexzf f518Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C0029Ujhhgtgfeyxiexzf f519Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0711Ujhhgtgfeyxiexzf f520Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public String f521Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f522Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f523Ujhhgtgfeyxiexzf;

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    public RunnableC0026Ujhhgtgfeyxiexzf(StringReader stringReader, PrintStream printStream, PrintStream printStream2, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str) {
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = new C0711Ujhhgtgfeyxiexzf();
        c0711Ujhhgtgfeyxiexzf.f2947Ujhhgtgfeyxiexzf = stringReader;
        c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf = printStream;
        c0711Ujhhgtgfeyxiexzf.f2949Ujhhgtgfeyxiexzf = printStream2;
        C0711Ujhhgtgfeyxiexzf.f2946Ujhhgtgfeyxiexzf = printStream2;
        this.f522Ujhhgtgfeyxiexzf = -1;
        ThreadLocal threadLocal = f514Ujhhgtgfeyxiexzf;
        long jNanoTime = ((Boolean) threadLocal.get()).booleanValue() ? System.nanoTime() : 0L;
        if (runnableC0026Ujhhgtgfeyxiexzf != null) {
            this.f518Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf;
            this.f523Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f523Ujhhgtgfeyxiexzf;
        }
        this.f521Ujhhgtgfeyxiexzf = str;
        c0029Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf == null ? new C0029Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf, C2809Ujhhgtgfeyxiexzf.m4130Ujhhgtgfeyxiexzf(this), "global") : c0029Ujhhgtgfeyxiexzf;
        this.f520Ujhhgtgfeyxiexzf = c0711Ujhhgtgfeyxiexzf;
        C0032Ujhhgtgfeyxiexzf c0032Ujhhgtgfeyxiexzf = this.f518Ujhhgtgfeyxiexzf;
        if (c0032Ujhhgtgfeyxiexzf != null) {
            C0733Ujhhgtgfeyxiexzf c0733Ujhhgtgfeyxiexzf = c0032Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf;
            if (c0733Ujhhgtgfeyxiexzf.f3008Ujhhgtgfeyxiexzf - c0733Ujhhgtgfeyxiexzf.f3009Ujhhgtgfeyxiexzf == 0) {
                c0032Ujhhgtgfeyxiexzf.m437feyxiexzfUjhhgtg(stringReader);
            } else {
                this.f518Ujhhgtgfeyxiexzf = new C0032Ujhhgtgfeyxiexzf(stringReader);
            }
        } else {
            this.f518Ujhhgtgfeyxiexzf = new C0032Ujhhgtgfeyxiexzf(stringReader);
        }
        m344Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
        this.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf().m4131Ujhhgtgfeyxiexzf(this);
        if (((Boolean) threadLocal.get()).booleanValue()) {
            m330Ujhhgtgfeyxiexzf("Time to initialize interpreter: interactive=", Boolean.FALSE, " ", Long.valueOf(System.nanoTime() - jNanoTime), " nanoseconds.");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        PrintStream printStream = System.out;
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
        c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf = printStream;
        c0711Ujhhgtgfeyxiexzf.f2949Ujhhgtgfeyxiexzf = System.err;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m330Ujhhgtgfeyxiexzf(Object... objArr) {
        if (((Boolean) f514Ujhhgtgfeyxiexzf.get()).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj);
            }
            C0711Ujhhgtgfeyxiexzf.f2946Ujhhgtgfeyxiexzf.println("// Debug: " + sb.toString());
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m331Ujhhgtgfeyxiexzf(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int size;
        C3647Ujhhgtgfeyxiexzf c3647Ujhhgtgfeyxiexzf;
        String strM4610Ujhhgtgfeyxiexzf;
        StringBuilder sb;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        C3102Ujhhgtgfeyxiexzf c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf;
        int i8;
        char cCharAt;
        char cCharAt2;
        String string = str;
        HashSet hashSet = AbstractC2418Ujhhgtgfeyxiexzf.f7831Ujhhgtgfeyxiexzf;
        char c = ')';
        char c2 = '(';
        if (string == null || string.indexOf(64) < 0) {
            z = true;
        } else {
            int length = string.length();
            StringBuilder sb2 = new StringBuilder(length);
            int i9 = 0;
            while (i9 < length) {
                int iM3670Ujhhgtgfeyxiexzf = AbstractC2418Ujhhgtgfeyxiexzf.m3670Ujhhgtgfeyxiexzf(i9, string);
                if (iM3670Ujhhgtgfeyxiexzf > i9) {
                    sb2.append((CharSequence) string, i9, iM3670Ujhhgtgfeyxiexzf);
                } else if (string.charAt(i9) != '@') {
                    sb2.append(string.charAt(i9));
                    i9++;
                } else {
                    int length2 = string.length();
                    int i10 = i9 + 1;
                    if (i10 >= length2 || !((cCharAt2 = string.charAt(i10)) == '_' || Character.isLetterOrDigit(cCharAt2))) {
                        iM3670Ujhhgtgfeyxiexzf = -1;
                    } else {
                        int i11 = i10;
                        while (i11 < length2) {
                            char cCharAt3 = string.charAt(i11);
                            if (cCharAt3 != '_' && !Character.isLetterOrDigit(cCharAt3)) {
                                break;
                            }
                            i11++;
                        }
                        if (AbstractC2418Ujhhgtgfeyxiexzf.f7831Ujhhgtgfeyxiexzf.contains(string.substring(i10, i11)) && (i11 >= length2 || !Character.isJavaIdentifierPart(string.charAt(i11)))) {
                            iM3670Ujhhgtgfeyxiexzf = i11;
                        } else {
                            iM3670Ujhhgtgfeyxiexzf = -1;
                        }
                    }
                    if (iM3670Ujhhgtgfeyxiexzf > i9) {
                        sb2.append((CharSequence) string, i9, iM3670Ujhhgtgfeyxiexzf);
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
                                                int iM3670Ujhhgtgfeyxiexzf2 = AbstractC2418Ujhhgtgfeyxiexzf.m3670Ujhhgtgfeyxiexzf(i8, string);
                                                if (iM3670Ujhhgtgfeyxiexzf2 <= i8) {
                                                    char cCharAt5 = string.charAt(i8);
                                                    if (cCharAt5 != '(') {
                                                        if (cCharAt5 == ')' && (i12 = i12 - 1) == 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        i12++;
                                                    }
                                                } else {
                                                    i8 = iM3670Ujhhgtgfeyxiexzf2 - 1;
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
                i9 = iM3670Ujhhgtgfeyxiexzf;
            }
            z = true;
            string = sb2.toString();
        }
        HashSet hashSet2 = AbstractC3098Ujhhgtgfeyxiexzf.f9633Ujhhgtgfeyxiexzf;
        if (string != null && string.indexOf(61) >= 0 && string.indexOf(40) >= 0) {
            HashSet hashSet3 = new HashSet();
            int length5 = string.length();
            int i13 = 0;
            while (i13 < length5) {
                int iM4612Ujhhgtgfeyxiexzf = AbstractC3098Ujhhgtgfeyxiexzf.m4612Ujhhgtgfeyxiexzf(i13, string);
                if (iM4612Ujhhgtgfeyxiexzf > i13) {
                    i13 = iM4612Ujhhgtgfeyxiexzf;
                } else if (string.charAt(i13) == '(' && (c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf = AbstractC3098Ujhhgtgfeyxiexzf.m4616Ujhhgtgfeyxiexzf(i13, string)) != null) {
                    String str2 = (String) c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf.f9647Ujhhgtgfeyxiexzf;
                    ArrayList arrayList2 = (ArrayList) ((C2567Ujhhgtgfeyxiexzf) c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf.f9648Ujhhgtgfeyxiexzf).f8316Ujhhgtgfeyxiexzf;
                    hashSet3.add(AbstractC3098Ujhhgtgfeyxiexzf.m4610Ujhhgtgfeyxiexzf(str2, arrayList2, arrayList2.size()));
                    i13 = c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf.f9646Ujhhgtgfeyxiexzf;
                } else {
                    i13++;
                }
            }
            StringBuilder sb3 = new StringBuilder(string.length() + 128);
            int length6 = string.length();
            int i14 = 0;
            int i15 = 0;
            while (i14 < length6) {
                int iM4612Ujhhgtgfeyxiexzf2 = AbstractC3098Ujhhgtgfeyxiexzf.m4612Ujhhgtgfeyxiexzf(i14, string);
                if (iM4612Ujhhgtgfeyxiexzf2 > i14) {
                    i14 = iM4612Ujhhgtgfeyxiexzf2;
                } else if (string.charAt(i14) != c2) {
                    i14++;
                } else {
                    C3102Ujhhgtgfeyxiexzf c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf2 = AbstractC3098Ujhhgtgfeyxiexzf.m4616Ujhhgtgfeyxiexzf(i14, string);
                    if (c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf2 == null) {
                        i4 = length6;
                        i3 = i14;
                        c3647Ujhhgtgfeyxiexzf = null;
                    } else {
                        C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf = (C2567Ujhhgtgfeyxiexzf) c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf2.f9648Ujhhgtgfeyxiexzf;
                        if (c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf && c2567Ujhhgtgfeyxiexzf.f8313Ujhhgtgfeyxiexzf && c2567Ujhhgtgfeyxiexzf.f8314Ujhhgtgfeyxiexzf) {
                            int i16 = c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf2.f9645Ujhhgtgfeyxiexzf;
                            int iM4607Ujhhgtgfeyxiexzf = AbstractC3098Ujhhgtgfeyxiexzf.m4607Ujhhgtgfeyxiexzf(string, i14, c2, c);
                            String strSubstring = string.substring(i16, i14);
                            int i17 = iM4607Ujhhgtgfeyxiexzf + 1;
                            int iM4608Ujhhgtgfeyxiexzf = AbstractC3098Ujhhgtgfeyxiexzf.m4608Ujhhgtgfeyxiexzf(i17, string);
                            if (iM4608Ujhhgtgfeyxiexzf < 0) {
                                i4 = length6;
                                i3 = i14;
                                c3647Ujhhgtgfeyxiexzf = null;
                            } else {
                                String strSubstring2 = string.substring(i17, iM4608Ujhhgtgfeyxiexzf);
                                int iM4607Ujhhgtgfeyxiexzf2 = AbstractC3098Ujhhgtgfeyxiexzf.m4607Ujhhgtgfeyxiexzf(string, iM4608Ujhhgtgfeyxiexzf, '{', '}') + 1;
                                String strSubstring3 = string.substring(iM4608Ujhhgtgfeyxiexzf, iM4607Ujhhgtgfeyxiexzf2);
                                String str3 = (String) c3102UjhhgtgfeyxiexzfM4616Ujhhgtgfeyxiexzf2.f9647Ujhhgtgfeyxiexzf;
                                StringBuilder sb4 = new StringBuilder(strSubstring3.length() + strSubstring.length() + 128);
                                sb4.append(strSubstring);
                                sb4.append(c2);
                                ArrayList arrayList3 = (ArrayList) c2567Ujhhgtgfeyxiexzf.f8316Ujhhgtgfeyxiexzf;
                                sb4.append(AbstractC3098Ujhhgtgfeyxiexzf.m4609Ujhhgtgfeyxiexzf(arrayList3, arrayList3.size()));
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
                                            if (!str5.startsWith("@") && !AbstractC3098Ujhhgtgfeyxiexzf.f9634Ujhhgtgfeyxiexzf.contains(str5)) {
                                                str4 = str5;
                                            }
                                            i18++;
                                            strArrSplit = strArr;
                                        }
                                        if (str4 != null) {
                                            z2 = !"void".equals(str4);
                                        }
                                        size = arrayList3.size() - 1;
                                        while (size >= c2567Ujhhgtgfeyxiexzf.f8315Ujhhgtgfeyxiexzf) {
                                            strM4610Ujhhgtgfeyxiexzf = AbstractC3098Ujhhgtgfeyxiexzf.m4610Ujhhgtgfeyxiexzf(str3, arrayList3, size);
                                            if (hashSet3.contains(strM4610Ujhhgtgfeyxiexzf)) {
                                                arrayList = arrayList3;
                                                i7 = size;
                                            } else {
                                                sb4.append('\n');
                                                sb4.append(strSubstring);
                                                sb4.append('(');
                                                sb4.append(AbstractC3098Ujhhgtgfeyxiexzf.m4609Ujhhgtgfeyxiexzf(arrayList3, size));
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
                                                    sb.append((String) ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8317Ujhhgtgfeyxiexzf).get(i5));
                                                }
                                                i6 = size;
                                                i7 = i6;
                                                while (i6 < arrayList.size()) {
                                                    if (sb.length() > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append((String) ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8318Ujhhgtgfeyxiexzf).get(i6));
                                                    i6++;
                                                }
                                                sb4.append(sb.toString());
                                                sb4.append(");}");
                                                hashSet3.add(strM4610Ujhhgtgfeyxiexzf);
                                            }
                                            size = i7 - 1;
                                            z2 = z2;
                                            arrayList3 = arrayList;
                                        }
                                        c3647Ujhhgtgfeyxiexzf = new C3647Ujhhgtgfeyxiexzf(i16, iM4607Ujhhgtgfeyxiexzf2, sb4.toString());
                                    }
                                } else {
                                    i4 = length6;
                                    i3 = i14;
                                }
                                z2 = false;
                                size = arrayList3.size() - 1;
                                while (size >= c2567Ujhhgtgfeyxiexzf.f8315Ujhhgtgfeyxiexzf) {
                                    strM4610Ujhhgtgfeyxiexzf = AbstractC3098Ujhhgtgfeyxiexzf.m4610Ujhhgtgfeyxiexzf(str3, arrayList3, size);
                                    if (hashSet3.contains(strM4610Ujhhgtgfeyxiexzf)) {
                                        arrayList = arrayList3;
                                        i7 = size;
                                    } else {
                                        sb4.append('\n');
                                        sb4.append(strSubstring);
                                        sb4.append('(');
                                        sb4.append(AbstractC3098Ujhhgtgfeyxiexzf.m4609Ujhhgtgfeyxiexzf(arrayList3, size));
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
                                            sb.append((String) ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8317Ujhhgtgfeyxiexzf).get(i5));
                                        }
                                        i6 = size;
                                        i7 = i6;
                                        while (i6 < arrayList.size()) {
                                            if (sb.length() > 0) {
                                                sb.append(", ");
                                            }
                                            sb.append((String) ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8318Ujhhgtgfeyxiexzf).get(i6));
                                            i6++;
                                        }
                                        sb4.append(sb.toString());
                                        sb4.append(");}");
                                        hashSet3.add(strM4610Ujhhgtgfeyxiexzf);
                                    }
                                    size = i7 - 1;
                                    z2 = z2;
                                    arrayList3 = arrayList;
                                }
                                c3647Ujhhgtgfeyxiexzf = new C3647Ujhhgtgfeyxiexzf(i16, iM4607Ujhhgtgfeyxiexzf2, sb4.toString());
                            }
                        } else {
                            i4 = length6;
                            i3 = i14;
                            c3647Ujhhgtgfeyxiexzf = null;
                        }
                    }
                    if (c3647Ujhhgtgfeyxiexzf != null) {
                        sb3.append((CharSequence) string, i15, c3647Ujhhgtgfeyxiexzf.f11467Ujhhgtgfeyxiexzf);
                        sb3.append((String) c3647Ujhhgtgfeyxiexzf.f11469Ujhhgtgfeyxiexzf);
                        i15 = c3647Ujhhgtgfeyxiexzf.f11468Ujhhgtgfeyxiexzf;
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
                if (AbstractC3590Ujhhgtgfeyxiexzf.m5136Ujhhgtgfeyxiexzf(i19, string)) {
                    int i20 = i19 + 3;
                    int i21 = i20;
                    while (true) {
                        if (i21 + 2 >= string.length()) {
                            i21 = -1;
                            break;
                        }
                        if (AbstractC3590Ujhhgtgfeyxiexzf.m5136Ujhhgtgfeyxiexzf(i21, string)) {
                            break;
                        }
                        i21++;
                    }
                    if (i21 < 0) {
                        sb5.append((CharSequence) string, i19, length7);
                        break;
                    }
                    sb5.append(AbstractC3590Ujhhgtgfeyxiexzf.m5139Ujhhgtgfeyxiexzf(string.substring(i20, i21), z));
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
                    sb5.append(AbstractC3590Ujhhgtgfeyxiexzf.m5139Ujhhgtgfeyxiexzf(string.substring(i22, i23), false));
                    i19 = i23 + 1;
                }
            } else if (cCharAt6 == '\'') {
                int iM5124Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5124Ujhhgtgfeyxiexzf(i19 + 1, string);
                if (iM5124Ujhhgtgfeyxiexzf < 0) {
                    sb5.append((CharSequence) string, i19, length7);
                    break;
                }
                i = iM5124Ujhhgtgfeyxiexzf + 1;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static String m332Ujhhgtgfeyxiexzf(Reader reader, String str) throws C3353Ujhhgtgfeyxiexzf {
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
            StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("Sourced file: ", str, " read error: ");
            sbM2419Ujhhgtgfeyxiexzf.append(e.getMessage());
            throw new C3353Ujhhgtgfeyxiexzf(sbM2419Ujhhgtgfeyxiexzf.toString(), null, null, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m333Ujhhgtgfeyxiexzf(Node node) {
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

    @Override // p000.InterfaceC2573Ujhhgtgfeyxiexzf
    public final void classLoaderChanged() {
        AbstractC0033Ujhhgtgfeyxiexzf.f587Ujhhgtgfeyxiexzf.clear();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = f514Ujhhgtgfeyxiexzf;
        if (this.f523Ujhhgtgfeyxiexzf) {
            throw new RuntimeException("bsh Interpreter: No stream");
        }
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(this.f519Ujhhgtgfeyxiexzf);
        Stack stack = c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf;
        this.f517Ujhhgtgfeyxiexzf = false;
        while (!Thread.interrupted() && !this.f517Ujhhgtgfeyxiexzf) {
            try {
                try {
                    try {
                        try {
                            this.f517Ujhhgtgfeyxiexzf = m343Ujhhgtgfeyxiexzf();
                            C0733Ujhhgtgfeyxiexzf c0733Ujhhgtgfeyxiexzf = this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf;
                            if (c0733Ujhhgtgfeyxiexzf.f3008Ujhhgtgfeyxiexzf - c0733Ujhhgtgfeyxiexzf.f3009Ujhhgtgfeyxiexzf > 0) {
                                Node node = (Node) c0733Ujhhgtgfeyxiexzf.f3006Ujhhgtgfeyxiexzf.get(0);
                                node.setSourceFile(this.f521Ujhhgtgfeyxiexzf);
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    node.dump(">");
                                }
                                node.eval(c2637feyxiexzfUjhhgtg, this);
                                if (stack.size() > 1) {
                                    throw new C0712Ujhhgtgfeyxiexzf("Callstack growing: " + c2637feyxiexzfUjhhgtg);
                                }
                            }
                            this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                            if (stack.size() > 1) {
                                c2637feyxiexzfUjhhgtg.clear();
                                c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(this.f519Ujhhgtgfeyxiexzf);
                            }
                        } catch (C1405feyxiexzfUjhhgtg e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Parser Error: ");
                            ((Boolean) threadLocal.get()).getClass();
                            sb.append(e.getMessage());
                            m336Ujhhgtgfeyxiexzf(sb.toString());
                            if (((Boolean) threadLocal.get()).booleanValue()) {
                                e.printStackTrace();
                            }
                            this.f517Ujhhgtgfeyxiexzf = true;
                            this.f518Ujhhgtgfeyxiexzf.m437feyxiexzfUjhhgtg(this.f520Ujhhgtgfeyxiexzf.f2947Ujhhgtgfeyxiexzf);
                            this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                            if (stack.size() > 1) {
                            }
                        } catch (C1985Ujhhgtgfeyxiexzf e2) {
                            m336Ujhhgtgfeyxiexzf("Target Exception: " + e2.getMessage());
                            if (e2.f6551Ujhhgtgfeyxiexzf) {
                                e2.m3340Ujhhgtgfeyxiexzf(((Boolean) threadLocal.get()).booleanValue(), m339Ujhhgtgfeyxiexzf());
                            }
                            this.f517Ujhhgtgfeyxiexzf = true;
                            m345Ujhhgtgfeyxiexzf(e2.m3339Ujhhgtgfeyxiexzf(), "$_e");
                            this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                            if (stack.size() > 1) {
                            }
                        }
                    } catch (C0712Ujhhgtgfeyxiexzf e3) {
                        m336Ujhhgtgfeyxiexzf("Internal Error: " + e3.getMessage());
                        this.f517Ujhhgtgfeyxiexzf = true;
                        this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                        if (stack.size() > 1) {
                        }
                    } catch (C3353Ujhhgtgfeyxiexzf e4) {
                        m336Ujhhgtgfeyxiexzf("Evaluation Error: " + e4.f10470Ujhhgtgfeyxiexzf);
                        if (((Boolean) threadLocal.get()).booleanValue()) {
                            e4.printStackTrace();
                        }
                        this.f517Ujhhgtgfeyxiexzf = true;
                        this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                        if (stack.size() > 1) {
                        }
                    }
                } catch (C1726Ujhhgtgfeyxiexzf e5) {
                    m336Ujhhgtgfeyxiexzf("Error parsing input: " + e5);
                    C0032Ujhhgtgfeyxiexzf c0032Ujhhgtgfeyxiexzf = this.f518Ujhhgtgfeyxiexzf;
                    Reader reader = this.f520Ujhhgtgfeyxiexzf.f2947Ujhhgtgfeyxiexzf;
                    C0718Ujhhgtgfeyxiexzf c0718Ujhhgtgfeyxiexzf = c0032Ujhhgtgfeyxiexzf.f564Ujhhgtgfeyxiexzf;
                    int[] iArr = c0718Ujhhgtgfeyxiexzf.f2975Ujhhgtgfeyxiexzf;
                    int i = c0718Ujhhgtgfeyxiexzf.f2970Ujhhgtgfeyxiexzf;
                    int i2 = iArr[i];
                    int i3 = c0718Ujhhgtgfeyxiexzf.f2976Ujhhgtgfeyxiexzf[i];
                    c0718Ujhhgtgfeyxiexzf.f2981Ujhhgtgfeyxiexzf = new char[4096];
                    c0718Ujhhgtgfeyxiexzf.f2982Ujhhgtgfeyxiexzf = -1;
                    c0718Ujhhgtgfeyxiexzf.f2983Ujhhgtgfeyxiexzf = reader;
                    c0718Ujhhgtgfeyxiexzf.m2034Ujhhgtgfeyxiexzf(i2, i3);
                    this.f517Ujhhgtgfeyxiexzf = true;
                    this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                    if (stack.size() > 1) {
                    }
                } catch (Exception e6) {
                    m336Ujhhgtgfeyxiexzf("Unknown error: " + e6);
                    if (((Boolean) threadLocal.get()).booleanValue()) {
                        e6.printStackTrace();
                    }
                    this.f517Ujhhgtgfeyxiexzf = true;
                    this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                    if (stack.size() > 1) {
                    }
                }
            } catch (Throwable th) {
                this.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                if (stack.size() > 1) {
                    c2637feyxiexzfUjhhgtg.clear();
                    c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(this.f519Ujhhgtgfeyxiexzf);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final BshSnapshot m334Ujhhgtgfeyxiexzf(BufferedReader bufferedReader, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, String str) {
        String strM331Ujhhgtgfeyxiexzf = m331Ujhhgtgfeyxiexzf(m332Ujhhgtgfeyxiexzf(bufferedReader, str));
        if (!strM331Ujhhgtgfeyxiexzf.endsWith(";")) {
            strM331Ujhhgtgfeyxiexzf = strM331Ujhhgtgfeyxiexzf.concat(";");
        }
        StringReader stringReader = new StringReader(strM331Ujhhgtgfeyxiexzf);
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
        if (c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf == null) {
            c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf = System.out;
        }
        RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = new RunnableC0026Ujhhgtgfeyxiexzf(stringReader, c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf, m339Ujhhgtgfeyxiexzf(), c0029Ujhhgtgfeyxiexzf, this, str);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        boolean zM343Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.m343Ujhhgtgfeyxiexzf();
                        C0733Ujhhgtgfeyxiexzf c0733Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf;
                        if (c0733Ujhhgtgfeyxiexzf.f3008Ujhhgtgfeyxiexzf - c0733Ujhhgtgfeyxiexzf.f3009Ujhhgtgfeyxiexzf > 0) {
                            Node node = (Node) c0733Ujhhgtgfeyxiexzf.f3006Ujhhgtgfeyxiexzf.get(0);
                            node.setSourceFile(str);
                            m333Ujhhgtgfeyxiexzf(node);
                            arrayList.add(node);
                        }
                        runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                        z = zM343Ujhhgtgfeyxiexzf;
                    } catch (C0712Ujhhgtgfeyxiexzf e) {
                        throw new C3353Ujhhgtgfeyxiexzf("Sourced file: " + str + " internal Error: " + e.getMessage(), null, null, e);
                    } catch (C1405feyxiexzfUjhhgtg e2) {
                        C1405feyxiexzfUjhhgtg.f4922Ujhhgtgfeyxiexzf = str;
                        throw e2;
                    }
                } catch (C1726Ujhhgtgfeyxiexzf e3) {
                    throw new C3353Ujhhgtgfeyxiexzf("Sourced file: " + str + " Token Parsing Error: " + e3.getMessage(), null, null, e3);
                } catch (Exception e4) {
                    throw new C3353Ujhhgtgfeyxiexzf("Sourced file: " + str + " unknown error: " + e4.getMessage(), null, null, e4);
                }
            } catch (Throwable th) {
                runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                throw th;
            }
        }
        return new BshSnapshot((Node[]) arrayList.toArray(new Node[0]));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m335Ujhhgtgfeyxiexzf(String str, String str2, SecretKeySpec secretKeySpec) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new C3450Ujhhgtgfeyxiexzf(new FileInputStream(str)));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                AbstractC2590feyxiexzfUjhhgtg.m3848Ujhhgtgfeyxiexzf(m334Ujhhgtgfeyxiexzf(bufferedReader, this.f519Ujhhgtgfeyxiexzf, str), fileOutputStream, secretKeySpec);
                fileOutputStream.close();
                bufferedReader.close();
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            bufferedReader.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m336Ujhhgtgfeyxiexzf(String str) {
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
        if (c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf != null) {
            String str2 = ((Object) ("// Error: " + ((Object) str))) + "\n";
            PrintStream printStream = c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf;
            if (printStream != null) {
                printStream.print((Object) str2);
                c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf.flush();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object m337Ujhhgtgfeyxiexzf(Reader reader, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, String str) {
        ThreadLocal threadLocal = f514Ujhhgtgfeyxiexzf;
        String strM331Ujhhgtgfeyxiexzf = m331Ujhhgtgfeyxiexzf(m332Ujhhgtgfeyxiexzf(reader, str));
        m330Ujhhgtgfeyxiexzf("eval: nameSpace = ", c0029Ujhhgtgfeyxiexzf);
        if (!strM331Ujhhgtgfeyxiexzf.endsWith(";")) {
            strM331Ujhhgtgfeyxiexzf = strM331Ujhhgtgfeyxiexzf.concat(";");
        }
        StringReader stringReader = new StringReader(strM331Ujhhgtgfeyxiexzf);
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
        if (c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf == null) {
            c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf = System.out;
        }
        RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = new RunnableC0026Ujhhgtgfeyxiexzf(stringReader, c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf, m339Ujhhgtgfeyxiexzf(), c0029Ujhhgtgfeyxiexzf, this, str);
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(c0029Ujhhgtgfeyxiexzf);
        Stack stack = c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf;
        Object obj = null;
        boolean z = false;
        Node node = null;
        while (!z) {
            try {
                try {
                    try {
                        boolean zM343Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.m343Ujhhgtgfeyxiexzf();
                        C0733Ujhhgtgfeyxiexzf c0733Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf;
                        if (c0733Ujhhgtgfeyxiexzf.f3008Ujhhgtgfeyxiexzf - c0733Ujhhgtgfeyxiexzf.f3009Ujhhgtgfeyxiexzf > 0) {
                            Node node2 = (Node) c0733Ujhhgtgfeyxiexzf.f3006Ujhhgtgfeyxiexzf.get(0);
                            try {
                                node2.setSourceFile(str);
                                Object objEval = node2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                if (stack.size() > 1) {
                                    throw new C0712Ujhhgtgfeyxiexzf("Callstack growing: " + c2637feyxiexzfUjhhgtg);
                                }
                                if (objEval instanceof C0920feyxiexzfUjhhgtg) {
                                    obj = ((C0920feyxiexzfUjhhgtg) objEval).f3739Ujhhgtgfeyxiexzf;
                                    runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                                    if (stack.size() <= 1) {
                                        break;
                                    }
                                    c2637feyxiexzfUjhhgtg.clear();
                                    c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
                                    break;
                                }
                                node = node2;
                                obj = objEval;
                            } catch (C0712Ujhhgtgfeyxiexzf e) {
                                e = e;
                                node = node2;
                                throw new C3353Ujhhgtgfeyxiexzf("Sourced file: " + str + " internal Error: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg, e);
                            } catch (C1726Ujhhgtgfeyxiexzf e2) {
                                e = e2;
                                node = node2;
                                throw new C3353Ujhhgtgfeyxiexzf("Sourced file: " + str + " Token Parsing Error: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg, e);
                            } catch (C1985Ujhhgtgfeyxiexzf e3) {
                                e = e3;
                                node = node2;
                                if (e.f10469Ujhhgtgfeyxiexzf == null) {
                                    e.f10469Ujhhgtgfeyxiexzf = node;
                                }
                                e.m4858Ujhhgtgfeyxiexzf("Sourced file: " + str);
                                throw e;
                            } catch (C3353Ujhhgtgfeyxiexzf e4) {
                                e = e4;
                                node = node2;
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    e.printStackTrace();
                                }
                                if (e.f10469Ujhhgtgfeyxiexzf == null) {
                                    e.f10469Ujhhgtgfeyxiexzf = node;
                                }
                                throw e.mo4859Ujhhgtgfeyxiexzf("Sourced file: " + str);
                            } catch (Exception e5) {
                                e = e5;
                                node = node2;
                                if (((Boolean) threadLocal.get()).booleanValue()) {
                                    e.printStackTrace();
                                }
                                throw new C3353Ujhhgtgfeyxiexzf("Sourced file: " + str + " unknown error: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg, e);
                            }
                        }
                        runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                        if (stack.size() > 1) {
                            c2637feyxiexzfUjhhgtg.clear();
                            c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
                        }
                        z = zM343Ujhhgtgfeyxiexzf;
                    } catch (C1405feyxiexzfUjhhgtg e6) {
                        if (((Boolean) threadLocal.get()).booleanValue()) {
                            ((Boolean) threadLocal.get()).getClass();
                            m336Ujhhgtgfeyxiexzf(e6.getMessage());
                        }
                        C1405feyxiexzfUjhhgtg.f4922Ujhhgtgfeyxiexzf = str;
                        throw e6;
                    }
                } catch (Throwable th) {
                    runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                    if (stack.size() > 1) {
                        c2637feyxiexzfUjhhgtg.clear();
                        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
                    }
                    throw th;
                }
            } catch (C0712Ujhhgtgfeyxiexzf e7) {
                e = e7;
            } catch (C1726Ujhhgtgfeyxiexzf e8) {
                e = e8;
            } catch (C1985Ujhhgtgfeyxiexzf e9) {
                e = e9;
            } catch (C3353Ujhhgtgfeyxiexzf e10) {
                e = e10;
            } catch (Exception e11) {
                e = e11;
            }
        }
        return Primitive.unwrap(obj);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object m338Ujhhgtgfeyxiexzf(InputStream inputStream, SecretKey secretKey, String str) throws IOException {
        byte[] bArr = AbstractC2590feyxiexzfUjhhgtg.f8385Ujhhgtgfeyxiexzf;
        byte[] bArr2 = new byte[4];
        int i = 0;
        int i2 = 0;
        while (i2 < 4) {
            int i3 = inputStream.read(bArr2, i2, 4 - i2);
            if (i3 < 0) {
                throw new IOException("BeanShell snapshot unexpected end");
            }
            i2 += i3;
        }
        if (!Arrays.equals(bArr2, bArr)) {
            throw new IOException("BeanShell snapshot invalid header");
        }
        int i4 = inputStream.read();
        if (i4 != 1) {
            throw new IOException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i4, "BeanShell snapshot unsupported version: "));
        }
        int i5 = inputStream.read();
        if (i5 <= 0 || i5 > 32) {
            throw new IOException("BeanShell snapshot invalid IV length");
        }
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = inputStream.read(bArr3, i6, i5 - i6);
            if (i7 < 0) {
                throw new IOException("BeanShell snapshot unexpected end");
            }
            i6 += i7;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArr3));
            C2587feyxiexzfUjhhgtg c2587feyxiexzfUjhhgtg = new C2587feyxiexzfUjhhgtg(new CipherInputStream(inputStream, cipher));
            try {
                Object object = c2587feyxiexzfUjhhgtg.readObject();
                if (!(object instanceof BshSnapshot)) {
                    throw new InvalidClassException("BeanShell snapshot unexpected payload");
                }
                BshSnapshot bshSnapshot = (BshSnapshot) object;
                if (bshSnapshot.getFormatVersion() != 1) {
                    throw new IOException("BeanShell snapshot unsupported AST format: " + bshSnapshot.getFormatVersion());
                }
                c2587feyxiexzfUjhhgtg.close();
                C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f519Ujhhgtgfeyxiexzf;
                StringReader stringReader = new StringReader("");
                C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
                if (c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf == null) {
                    c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf = System.out;
                }
                RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = new RunnableC0026Ujhhgtgfeyxiexzf(stringReader, c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf, m339Ujhhgtgfeyxiexzf(), c0029Ujhhgtgfeyxiexzf, this, str);
                C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(c0029Ujhhgtgfeyxiexzf);
                Stack stack = c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf;
                Node[] nodes = bshSnapshot.getNodes();
                int length = nodes.length;
                Object obj = null;
                while (i < length) {
                    Node node = nodes[i];
                    try {
                        try {
                            try {
                                try {
                                    node.setSourceFile(str);
                                    Object objEval = node.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                    if (stack.size() > 1) {
                                        throw new C0712Ujhhgtgfeyxiexzf("Callstack growing: " + c2637feyxiexzfUjhhgtg);
                                    }
                                    if (objEval instanceof C0920feyxiexzfUjhhgtg) {
                                        obj = ((C0920feyxiexzfUjhhgtg) objEval).f3739Ujhhgtgfeyxiexzf;
                                        runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                                        if (stack.size() <= 1) {
                                            break;
                                        }
                                        c2637feyxiexzfUjhhgtg.clear();
                                        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
                                        break;
                                    }
                                    runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                                    if (stack.size() > 1) {
                                        c2637feyxiexzfUjhhgtg.clear();
                                        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
                                    }
                                    i++;
                                    obj = objEval;
                                } catch (C0712Ujhhgtgfeyxiexzf e) {
                                    throw new C3353Ujhhgtgfeyxiexzf("Snapshot: " + str + " internal Error: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg, e);
                                }
                            } catch (Exception e2) {
                                throw new C3353Ujhhgtgfeyxiexzf("Snapshot: " + str + " unknown error: " + e2.getMessage(), node, c2637feyxiexzfUjhhgtg, e2);
                            }
                        } catch (C1985Ujhhgtgfeyxiexzf e3) {
                            if (e3.f10469Ujhhgtgfeyxiexzf == null) {
                                e3.f10469Ujhhgtgfeyxiexzf = node;
                            }
                            e3.m4858Ujhhgtgfeyxiexzf("Snapshot: " + str);
                            throw e3;
                        } catch (C3353Ujhhgtgfeyxiexzf e4) {
                            if (e4.f10469Ujhhgtgfeyxiexzf == null) {
                                e4.f10469Ujhhgtgfeyxiexzf = node;
                            }
                            throw e4.mo4859Ujhhgtgfeyxiexzf("Snapshot: " + str);
                        }
                    } catch (Throwable th) {
                        runnableC0026Ujhhgtgfeyxiexzf.f518Ujhhgtgfeyxiexzf.f562Ujhhgtgfeyxiexzf.m2079Ujhhgtgfeyxiexzf();
                        if (stack.size() <= 1) {
                            throw th;
                        }
                        c2637feyxiexzfUjhhgtg.clear();
                        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
                        throw th;
                    }
                }
                return Primitive.unwrap(obj);
            } catch (Throwable th2) {
                try {
                    c2587feyxiexzfUjhhgtg.close();
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final PrintStream m339Ujhhgtgfeyxiexzf() {
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
        if (c0711Ujhhgtgfeyxiexzf.f2949Ujhhgtgfeyxiexzf == null) {
            c0711Ujhhgtgfeyxiexzf.f2949Ujhhgtgfeyxiexzf = System.err;
        }
        return c0711Ujhhgtgfeyxiexzf.f2949Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m340Ujhhgtgfeyxiexzf() {
        C2809Ujhhgtgfeyxiexzf c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf = this.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf();
        m345Ujhhgtgfeyxiexzf(new C0029Ujhhgtgfeyxiexzf(null, c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf, "Bsh Object").mo299Ujhhgtgfeyxiexzf(this), "bsh");
        This r1 = f515Ujhhgtgfeyxiexzf;
        m345Ujhhgtgfeyxiexzf(r1, "bsh.system");
        m345Ujhhgtgfeyxiexzf(r1, "bsh.shared");
        m345Ujhhgtgfeyxiexzf(new C0029Ujhhgtgfeyxiexzf(null, c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf, "Bsh Command Help Text").mo299Ujhhgtgfeyxiexzf(this), "bsh.help");
        m345Ujhhgtgfeyxiexzf(System.getProperty("user.dir"), "bsh.cwd");
        Primitive primitive = Primitive.FALSE;
        m345Ujhhgtgfeyxiexzf(primitive, "bsh.interactive");
        m345Ujhhgtgfeyxiexzf(primitive, "bsh.evalOnly");
        m345Ujhhgtgfeyxiexzf("3.0.0.beta12", "bsh.version");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final File m341Ujhhgtgfeyxiexzf(String str) {
        try {
            try {
                C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f519Ujhhgtgfeyxiexzf;
                c0029Ujhhgtgfeyxiexzf.getClass();
                String str2 = (String) Primitive.unwrap(c0029Ujhhgtgfeyxiexzf.m371Ujhhgtgfeyxiexzf("bsh.cwd").m358Ujhhgtgfeyxiexzf(new C2637feyxiexzfUjhhgtg(c0029Ujhhgtgfeyxiexzf), this, false));
                File file = new File(str);
                if (!file.isAbsolute()) {
                    file = new File(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str2), File.separator, str));
                }
                return new File(file.getCanonicalPath());
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(Node.JAVACODE, new C2637feyxiexzfUjhhgtg());
            }
        } catch (C3353Ujhhgtgfeyxiexzf e2) {
            throw new C0712Ujhhgtgfeyxiexzf("set: " + e2, e2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m342Ujhhgtgfeyxiexzf(String str) {
        C0711Ujhhgtgfeyxiexzf c0711Ujhhgtgfeyxiexzf = this.f520Ujhhgtgfeyxiexzf;
        c0711Ujhhgtgfeyxiexzf.getClass();
        String str2 = ((Object) str) + "\n";
        PrintStream printStream = c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf;
        if (printStream != null) {
            printStream.print((Object) str2);
            c0711Ujhhgtgfeyxiexzf.f2948Ujhhgtgfeyxiexzf.flush();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m343Ujhhgtgfeyxiexzf() throws C1405feyxiexzfUjhhgtg {
        try {
            return this.f518Ujhhgtgfeyxiexzf.m426feyxiexzfUjhhgtg();
        } catch (C1405feyxiexzfUjhhgtg e) {
            int i = this.f522Ujhhgtgfeyxiexzf;
            if (i >= 0) {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException unused) {
                }
            }
            if (this.f517Ujhhgtgfeyxiexzf) {
                return true;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m344Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        this.f519Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
        if (c0029Ujhhgtgfeyxiexzf != null) {
            try {
                if (c0029Ujhhgtgfeyxiexzf.m375Ujhhgtgfeyxiexzf("bsh", true) instanceof This) {
                    return;
                }
                m340Ujhhgtgfeyxiexzf();
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m345Ujhhgtgfeyxiexzf(Object obj, String str) {
        try {
            C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(this.f519Ujhhgtgfeyxiexzf);
            try {
                if (C0028Ujhhgtgfeyxiexzf.m348Ujhhgtgfeyxiexzf(str)) {
                    this.f519Ujhhgtgfeyxiexzf.m371Ujhhgtgfeyxiexzf(str).m357Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, this).m1194Ujhhgtgfeyxiexzf(obj, false);
                } else {
                    this.f519Ujhhgtgfeyxiexzf.mo303feyxiexzfUjhhgtg(str, obj, true);
                }
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(Node.JAVACODE, c2637feyxiexzfUjhhgtg);
            }
        } catch (C3353Ujhhgtgfeyxiexzf e2) {
            throw new C0712Ujhhgtgfeyxiexzf("set: " + e2, e2);
        }
    }

    public RunnableC0026Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, String str) {
        this(null, System.out, System.err, c0029Ujhhgtgfeyxiexzf, null, str);
        this.f523Ujhhgtgfeyxiexzf = true;
        m345Ujhhgtgfeyxiexzf(Primitive.TRUE, "bsh.evalOnly");
    }
}
