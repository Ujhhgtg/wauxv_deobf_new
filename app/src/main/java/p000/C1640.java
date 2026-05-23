package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1640 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Pattern f5553 = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Pattern f5554 = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Pattern f5555 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Pattern f5556 = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final Pattern f5557 = Pattern.compile("`+");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Pattern f5558 = Pattern.compile("^`+");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final Pattern f5559 = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final Pattern f5560 = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final Pattern f5561 = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final Pattern f5562 = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final Pattern f5563 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final Pattern f5564 = Pattern.compile(" *$");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final BitSet f5565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final BitSet f5566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f5567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0542 f5568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f5569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1010 f5571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0474 f5572;

    public C1640(C0542 c0542) {
        List list = (List) c0542.f2252;
        HashMap map = new HashMap();
        m3360(Arrays.asList(new C0275('*'), new C0275('_')), map);
        m3360(list, map);
        this.f5567 = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f5566 = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f5565 = bitSet2;
        this.f5568 = c0542;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3359(char c, InterfaceC1011 interfaceC1011, HashMap map) {
        if (((InterfaceC1011) map.put(Character.valueOf(c), interfaceC1011)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3360(Iterable iterable, HashMap map) {
        C2802 c2802;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC1011 interfaceC1011 = (InterfaceC1011) it.next();
            char cMo1400 = interfaceC1011.mo1400();
            char cMo1397 = interfaceC1011.mo1397();
            if (cMo1400 == cMo1397) {
                InterfaceC1011 interfaceC1012 = (InterfaceC1011) map.get(Character.valueOf(cMo1400));
                if (interfaceC1012 == null || interfaceC1012.mo1400() != interfaceC1012.mo1397()) {
                    m3359(cMo1400, interfaceC1011, map);
                } else {
                    if (interfaceC1012 instanceof C2802) {
                        c2802 = (C2802) interfaceC1012;
                    } else {
                        C2802 c2803 = new C2802(cMo1400);
                        c2803.m4780(interfaceC1012);
                        c2802 = c2803;
                    }
                    c2802.m4780(interfaceC1011);
                    map.put(Character.valueOf(cMo1400), c2802);
                }
            } else {
                m3359(cMo1400, interfaceC1011, map);
                m3359(cMo1397, interfaceC1011, map);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m3361(C2901 c2901, C2901 c2902, int i) {
        if (c2901 == null || c2902 == null || c2901 == c2902) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c2901.f9324);
        AbstractC2224 abstractC2224 = c2901.f7222;
        AbstractC2224 abstractC2225 = c2902.f7222;
        while (abstractC2224 != abstractC2225) {
            sb.append(((C2901) abstractC2224).f9324);
            AbstractC2224 abstractC2226 = abstractC2224.f7222;
            abstractC2224.m4144();
            abstractC2224 = abstractC2226;
        }
        c2901.f9324 = sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m3362(AbstractC2224 abstractC2224, AbstractC2224 abstractC2225) {
        C2901 c2901 = null;
        C2901 c2902 = null;
        int length = 0;
        while (abstractC2224 != null) {
            if (abstractC2224 instanceof C2901) {
                c2902 = (C2901) abstractC2224;
                if (c2901 == null) {
                    c2901 = c2902;
                }
                length = c2902.f9324.length() + length;
            } else {
                m3361(c2901, c2902, length);
                c2901 = null;
                c2902 = null;
                length = 0;
            }
            if (abstractC2224 == abstractC2225) {
                break;
            } else {
                abstractC2224 = abstractC2224.f7222;
            }
        }
        m3361(c2901, c2902, length);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String m3363(Pattern pattern) {
        if (this.f5570 >= this.f5569.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f5569);
        matcher.region(this.f5570, this.f5569.length());
        if (!matcher.find()) {
            return null;
        }
        this.f5570 = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f8 A[PHI: r2
      0x01f8: PHI (r2v83 char) = (r2v82 char), (r2v87 char), (r2v88 char) binds: [B:113:0x01eb, B:115:0x01ef, B:118:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0202  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:231:0x0474  */
    /* JADX WARN: Code duplicated, block: B:233:0x047c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0520  */
    /* JADX WARN: Code duplicated, block: B:265:0x0540 A[LOOP:0: B:3:0x0013->B:265:0x0540, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x0551 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:269:0x0552  */
    /* JADX WARN: Code duplicated, block: B:271:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3364(String str, AbstractC2224 abstractC2224) {
        int i;
        AbstractC2224 c2783;
        AbstractC2224 abstractC2225;
        AbstractC2224 abstractC2226;
        AbstractC2224 c2901;
        AbstractC2224 abstractC2227;
        AbstractC2224 c2902;
        AbstractC2224 c1793;
        AbstractC2224 c2903;
        int i2;
        String strM2863;
        boolean z;
        String strM2864;
        int iM4672;
        int i3;
        AbstractC2224 c2904;
        boolean z2;
        boolean z3;
        C1639 c1639;
        AbstractC2224 abstractC2228;
        AbstractC2224 abstractC2229;
        this.f5569 = str.trim();
        int i4 = 0;
        this.f5570 = 0;
        C2901 c2905 = null;
        this.f5571 = null;
        this.f5572 = null;
        AbstractC2224 abstractC22210 = null;
        while (true) {
            char cM3365 = m3365();
            if (cM3365 == 0) {
                i = 0;
            } else {
                if (cM3365 == '\n') {
                    this.f5570++;
                    if (abstractC22210 instanceof C2901) {
                        C2901 c2906 = (C2901) abstractC22210;
                        if (c2906.f9324.endsWith(" ")) {
                            String str2 = c2906.f9324;
                            Matcher matcher = f5564.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i = 0;
                            if (iEnd > 0) {
                                c2906.f9324 = AbstractC2784.m4744(iEnd, 0, str2);
                            }
                            c2783 = iEnd >= 2 ? new C1518() : new C2783();
                        } else {
                            i = 0;
                            c2783 = new C2783();
                        }
                    } else {
                        i = 0;
                        c2783 = new C2783();
                    }
                    abstractC2225 = c2783;
                } else if (cM3365 == '!') {
                    int i5 = this.f5570 + 1;
                    this.f5570 = i5;
                    if (m3365() == '[') {
                        this.f5570++;
                        C2901 c2907 = new C2901("![");
                        C0474 c0474 = this.f5572;
                        C0474 c0475 = new C0474(c2907, i5, c0474, this.f5571, true);
                        if (c0474 != null) {
                            c0474.f2078 = true;
                        }
                        this.f5572 = c0475;
                        abstractC2227 = c2907;
                    } else {
                        c2901 = new C2901("!");
                        abstractC2227 = c2901;
                    }
                    i = 0;
                    abstractC2225 = abstractC2227;
                } else if (cM3365 == '&') {
                    String strM3363 = m3363(f5556);
                    if (strM3363 != null) {
                        c2902 = new C2901(AbstractC1568.m3284(strM3363));
                        abstractC2227 = c2902;
                    } else {
                        abstractC2227 = null;
                    }
                    i = 0;
                    abstractC2225 = abstractC2227;
                } else if (cM3365 == '<') {
                    String strM3364 = m3363(f5559);
                    if (strM3364 != null) {
                        String strM4744 = AbstractC2784.m4744(1, 1, strM3364);
                        c1793 = new C1793(AbstractC2784.m4757("mailto:", strM4744), null);
                        c1793.m4143(new C2901(strM4744));
                    } else {
                        String strM3365 = m3363(f5560);
                        if (strM3365 != null) {
                            String strM4745 = AbstractC2784.m4744(1, 1, strM3365);
                            c1793 = new C1793(strM4745, null);
                            c1793.m4143(new C2901(strM4745));
                        } else {
                            abstractC2227 = null;
                        }
                        if (abstractC2227 == null) {
                            if (m3363(f5554) != null) {
                                c2901 = new C1571();
                                abstractC2227 = c2901;
                            } else {
                                abstractC2227 = null;
                            }
                        }
                        i = 0;
                        abstractC2225 = abstractC2227;
                    }
                    abstractC2227 = c1793;
                    if (abstractC2227 == null) {
                        if (m3363(f5554) != null) {
                            c2901 = new C1571();
                            abstractC2227 = c2901;
                        } else {
                            abstractC2227 = null;
                        }
                    }
                    i = 0;
                    abstractC2225 = abstractC2227;
                } else if (cM3365 != '`') {
                    switch (cM3365) {
                        case '[':
                            int i6 = this.f5570;
                            this.f5570 = i6 + 1;
                            C2901 c2908 = new C2901("[");
                            C0474 c0476 = this.f5572;
                            C0474 c0477 = new C0474(c2908, i6, c0476, this.f5571, false);
                            if (c0476 != null) {
                                c0476.f2078 = true;
                            }
                            this.f5572 = c0477;
                            abstractC2227 = c2908;
                            i = 0;
                            abstractC2225 = abstractC2227;
                            break;
                        case 92 /* 92 */:
                            this.f5570++;
                            if (m3365() == '\n') {
                                c2901 = new C1518();
                                this.f5570++;
                            } else {
                                if (this.f5570 < this.f5569.length()) {
                                    String str3 = this.f5569;
                                    int i7 = this.f5570;
                                    if (f5555.matcher(str3.substring(i7, i7 + 1)).matches()) {
                                        String str4 = this.f5569;
                                        int i8 = this.f5570;
                                        AbstractC2224 c2909 = new C2901(str4.substring(i8, i8 + 1));
                                        this.f5570++;
                                        abstractC2227 = c2909;
                                    }
                                    i = 0;
                                    abstractC2225 = abstractC2227;
                                }
                                c2901 = new C2901("\\");
                            }
                            abstractC2227 = c2901;
                            i = 0;
                            abstractC2225 = abstractC2227;
                            break;
                        case ']':
                            int i9 = this.f5570 + 1;
                            this.f5570 = i9;
                            C0474 c0478 = this.f5572;
                            if (c0478 != null) {
                                C2901 c29010 = (C2901) c0478.f2080;
                                boolean z4 = c0478.f2076;
                                if (c0478.f2077) {
                                    int i10 = -1;
                                    if (m3365() == '(') {
                                        this.f5570++;
                                        Pattern pattern = f5561;
                                        m3363(pattern);
                                        i2 = 1;
                                        int iM4670 = AbstractC2665.m4670(this.f5570, this.f5569);
                                        if (iM4670 == -1) {
                                            strM2864 = null;
                                        } else {
                                            String strSubstring = m3365() == '<' ? this.f5569.substring(this.f5570 + 1, iM4670 - 1) : this.f5569.substring(this.f5570, iM4670);
                                            this.f5570 = iM4670;
                                            strM2864 = AbstractC1228.m2863(strSubstring);
                                        }
                                        if (strM2864 != null) {
                                            m3363(pattern);
                                            String str5 = this.f5569;
                                            int i11 = this.f5570;
                                            if (f5563.matcher(str5.substring(i11 - 1, i11)).matches()) {
                                                String str6 = this.f5569;
                                                int i12 = this.f5570;
                                                if (i12 >= str6.length()) {
                                                    i3 = -1;
                                                } else {
                                                    char cCharAt = str6.charAt(i12);
                                                    char c = '\"';
                                                    if (cCharAt != '\"') {
                                                        c = '\'';
                                                        if (cCharAt == '\'') {
                                                            iM4672 = AbstractC2665.m4672(str6, i12 + 1, 39);
                                                            if (iM4672 == -1 && -1 < str6.length() && str6.charAt(-1) == 39) {
                                                                i3 = 0;
                                                                i10 = -1;
                                                            } else {
                                                                i10 = -1;
                                                                i3 = -1;
                                                            }
                                                        } else if (cCharAt != '(') {
                                                            i10 = -1;
                                                            i3 = -1;
                                                        } else {
                                                            c = ')';
                                                            iM4672 = AbstractC2665.m4672(str6, i12 + 1, 41);
                                                            if (iM4672 == -1) {
                                                                i10 = -1;
                                                                i3 = -1;
                                                            } else {
                                                                i3 = iM4672 + 1;
                                                                i10 = -1;
                                                            }
                                                        }
                                                    } else {
                                                        iM4672 = AbstractC2665.m4672(str6, i12 + 1, 34);
                                                        if (iM4672 == -1) {
                                                            i10 = -1;
                                                            i3 = -1;
                                                        } else {
                                                            i3 = iM4672 + 1;
                                                            i10 = -1;
                                                        }
                                                    }
                                                }
                                                if (i3 == -1) {
                                                    strM2863 = null;
                                                } else {
                                                    String strSubstring2 = this.f5569.substring(this.f5570 + 1, i3 - 1);
                                                    this.f5570 = i3;
                                                    strM2863 = AbstractC1228.m2863(strSubstring2);
                                                }
                                                m3363(pattern);
                                            } else {
                                                strM2863 = null;
                                            }
                                            if (m3365() == ')') {
                                                this.f5570++;
                                                z = true;
                                            } else {
                                                this.f5570 = i9;
                                            }
                                        } else {
                                            strM2863 = null;
                                        }
                                        z = false;
                                    } else {
                                        i2 = 1;
                                        strM2863 = null;
                                        z = false;
                                        strM2864 = null;
                                    }
                                    if (true) {
                                        int i13 = this.f5570;
                                        if (i13 < this.f5569.length() && this.f5569.charAt(this.f5570) == '[') {
                                            int i14 = this.f5570 + 1;
                                            int iM4671 = AbstractC2665.m4671(i14, this.f5569);
                                            int i15 = iM4671 - i14;
                                            if (iM4671 != -1 && i15 <= 999 && iM4671 < this.f5569.length() && this.f5569.charAt(iM4671) == ']') {
                                                this.f5570 = iM4671 + 1;
                                            }
                                        }
                                        int i16 = this.f5570 - i13;
                                        String strSubstring3 = i16 > 2 ? this.f5569.substring(i13, i16 + i13) : !c0478.f2078 ? this.f5569.substring(c0478.f2079, i9) : null;
                                        if (strSubstring3 != null) {
                                            Pattern pattern2 = AbstractC1228.f4448;
                                            C1794 c1794 = (C1794) ((Map) this.f5568.f2253).get(AbstractC1228.f4450.matcher(strSubstring3.substring(1, strSubstring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                            if (c1794 != null) {
                                                strM2864 = c1794.f5993;
                                                strM2863 = c1794.f5994;
                                                z = true;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        this.f5570 = i9;
                                        this.f5572 = (C0474) this.f5572.f2081;
                                        c2901 = new C2901("]");
                                        abstractC2227 = c2901;
                                        i = 0;
                                        abstractC2225 = abstractC2227;
                                    } else {
                                        if (z4) {
                                            C1605 c1605 = new C1605();
                                            c1605.f5476 = strM2864;
                                            c1605.f5477 = strM2863;
                                            c2902 = c1605;
                                        } else {
                                            c2902 = new C1793(strM2864, strM2863);
                                        }
                                        AbstractC2224 abstractC22211 = c29010.f7222;
                                        while (abstractC22211 != null) {
                                            AbstractC2224 abstractC22212 = abstractC22211.f7222;
                                            c2902.m4143(abstractC22211);
                                            abstractC22211 = abstractC22212;
                                        }
                                        m3366((C1010) c0478.f2082);
                                        AbstractC2224 abstractC22213 = c2902.f7219;
                                        AbstractC2224 abstractC22214 = c2902.f7220;
                                        if (abstractC22213 != abstractC22214) {
                                            m3362(abstractC22213, abstractC22214);
                                        }
                                        c29010.m4144();
                                        C0474 c0479 = (C0474) this.f5572.f2081;
                                        this.f5572 = c0479;
                                        if (!z4) {
                                            while (c0479 != null) {
                                                if (!c0479.f2076) {
                                                    c0479.f2077 = false;
                                                }
                                                c0479 = (C0474) c0479.f2081;
                                            }
                                        }
                                        abstractC2227 = c2902;
                                        i = 0;
                                        abstractC2225 = abstractC2227;
                                    }
                                } else {
                                    this.f5572 = (C0474) c0478.f2081;
                                    c2903 = new C2901("]");
                                }
                            } else {
                                c2903 = new C2901("]");
                            }
                            abstractC2227 = c2903;
                            i = 0;
                            abstractC2225 = abstractC2227;
                            break;
                        default:
                            if (this.f5566.get(cM3365)) {
                                InterfaceC1011 interfaceC1011 = (InterfaceC1011) this.f5567.get(Character.valueOf(cM3365));
                                int i17 = this.f5570;
                                int i18 = 0;
                                while (m3365() == cM3365) {
                                    i18++;
                                    this.f5570++;
                                }
                                if (i18 < interfaceC1011.mo1398()) {
                                    this.f5570 = i17;
                                    c1639 = c2905;
                                } else {
                                    String strSubstring4 = i17 == 0 ? "\n" : this.f5569.substring(i17 - 1, i17);
                                    char cM3366 = m3365();
                                    String strValueOf = cM3366 != 0 ? String.valueOf(cM3366) : "\n";
                                    Pattern pattern3 = f5553;
                                    boolean zMatches = pattern3.matcher(strSubstring4).matches();
                                    Pattern pattern4 = f5562;
                                    boolean zMatches2 = pattern4.matcher(strSubstring4).matches();
                                    boolean zMatches3 = pattern3.matcher(strValueOf).matches();
                                    boolean zMatches4 = pattern4.matcher(strValueOf).matches();
                                    int i19 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? 0 : 1;
                                    int i20 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? 0 : 1;
                                    if (cM3365 == '_') {
                                        int i21 = (i19 == 0 || !(i20 == 0 || zMatches)) ? 0 : 1;
                                        if (i20 == 0 || !(i19 == 0 || zMatches3)) {
                                            z3 = 0;
                                            z2 = i21;
                                        } else {
                                            z3 = 1;
                                            z2 = i21;
                                        }
                                    } else {
                                        int i22 = (i19 == 0 || cM3365 != interfaceC1011.mo1400()) ? 0 : 1;
                                        int i23 = (i20 == 0 || cM3365 != interfaceC1011.mo1397()) ? 0 : 1;
                                        z2 = i22;
                                        z3 = i23;
                                    }
                                    this.f5570 = i17;
                                    c1639 = new C1639(i18, z2, z3);
                                }
                                if (false) {
                                    c2904 = c2905;
                                } else {
                                    int i24 = c1639.f5550;
                                    int i25 = this.f5570;
                                    int i26 = i25 + i24;
                                    this.f5570 = i26;
                                    C2901 c29011 = new C2901(this.f5569.substring(i25, i26));
                                    boolean z5 = c1639.f5552;
                                    boolean z6 = c1639.f5551;
                                    C1010 c1010 = this.f5571;
                                    C1010 c1011 = new C1010(c29011, cM3365, z5, z6, c1010);
                                    this.f5571 = c1011;
                                    c1011.f3691 = i24;
                                    c1011.f3692 = i24;
                                    if (c1010 != null) {
                                        c1010.f3690 = c1011;
                                    }
                                    c2904 = c29011;
                                }
                            } else {
                                int i27 = this.f5570;
                                int length = this.f5569.length();
                                while (true) {
                                    int i28 = this.f5570;
                                    if (i28 != length) {
                                        if (!this.f5565.get(this.f5569.charAt(i28))) {
                                            this.f5570++;
                                        }
                                    }
                                }
                                int i29 = this.f5570;
                                if (i27 != i29) {
                                    c2904 = new C2901(this.f5569.substring(i27, i29));
                                } else {
                                    c2904 = c2905;
                                }
                            }
                            i = 0;
                            abstractC2225 = c2904;
                            break;
                    }
                } else {
                    String strM3366 = m3363(f5558);
                    if (strM3366 == null) {
                        abstractC2227 = null;
                    } else {
                        int i30 = this.f5570;
                        while (true) {
                            String strM3367 = m3363(f5557);
                            if (strM3367 == null) {
                                this.f5570 = i30;
                                c2902 = new C2901(strM3366);
                                abstractC2227 = c2902;
                            } else if (strM3367.equals(strM3366)) {
                                C0733 c0733 = new C0733();
                                String strReplace = this.f5569.substring(i30, this.f5570 - strM3366.length()).replace('\n', ' ');
                                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                    int length2 = strReplace.length();
                                    if (AbstractC3471.m5087(' ', 0, length2, strReplace) != length2) {
                                        strReplace = AbstractC2784.m4744(1, 1, strReplace);
                                    }
                                }
                                c0733.f2761 = strReplace;
                                c2903 = c0733;
                                abstractC2227 = c2903;
                            }
                        }
                    }
                    i = 0;
                    abstractC2225 = abstractC2227;
                }
                if (abstractC2225 != null) {
                    abstractC2226 = abstractC2225;
                } else {
                    this.f5570++;
                    c2905 = new C2901(String.valueOf(cM3365));
                }
                if (abstractC2226 != null) {
                    m3366(null);
                    abstractC2228 = abstractC2224.f7219;
                    abstractC2229 = abstractC2224.f7220;
                    if (abstractC2228 == abstractC2229) {
                        return;
                    }
                    m3362(abstractC2228, abstractC2229);
                    return;
                }
                abstractC2224.m4143(abstractC2226);
                i4 = 0;
                c2905 = null;
                abstractC22210 = abstractC2226;
            }
            abstractC2226 = c2905;
            if (false) {
                m3366(null);
                abstractC2228 = abstractC2224.f7219;
                abstractC2229 = abstractC2224.f7220;
                if (abstractC2228 == abstractC2229) {
                    return;
                }
                m3362(abstractC2228, abstractC2229);
                return;
            }
            abstractC2224.m4143(abstractC2226);
            i4 = 0;
            c2905 = null;
            abstractC22210 = abstractC2226;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final char m3365() {
        if (this.f5570 < this.f5569.length()) {
            return this.f5569.charAt(this.f5570);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3366(C1010 c1010) {
        boolean z;
        AbstractC2224 abstractC2224;
        HashMap map = new HashMap();
        C1010 c1011 = this.f5571;
        while (c1011 != null) {
            C1010 c1012 = c1011.f3689;
            if (c1012 == c1010) {
                break;
            } else {
                c1011 = c1012;
            }
        }
        while (c1011 != null) {
            C2901 c2901 = c1011.f3685;
            char c = c1011.f3686;
            InterfaceC1011 interfaceC1011 = (InterfaceC1011) this.f5567.get(Character.valueOf(c));
            if (!c1011.f3688 || interfaceC1011 == null) {
                c1011 = c1011.f3690;
            } else {
                char cMo1400 = interfaceC1011.mo1400();
                C1010 c1013 = c1011.f3689;
                int iMo1399 = 0;
                boolean z2 = false;
                while (true) {
                    if (c1013 == null || c1013 == c1010 || c1013 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (c1013.f3687 && c1013.f3686 == cMo1400) {
                        iMo1399 = interfaceC1011.mo1399(c1013, c1011);
                        z2 = true;
                        if (iMo1399 > 0) {
                            z = true;
                            break;
                        }
                    }
                    c1013 = c1013.f3689;
                }
                if (z2) {
                    C2901 c2902 = c1013.f3685;
                    c1013.f3691 -= iMo1399;
                    c1011.f3691 -= iMo1399;
                    c2902.f9324 = AbstractC2784.m4744(iMo1399, 0, c2902.f9324);
                    c2901.f9324 = AbstractC2784.m4744(iMo1399, 0, c2901.f9324);
                    C1010 c1014 = c1011.f3689;
                    while (c1014 != null && c1014 != c1013) {
                        C1010 c1015 = c1014.f3689;
                        m3367(c1014);
                        c1014 = c1015;
                    }
                    if (c2902 != c2901 && (abstractC2224 = c2902.f7222) != c2901) {
                        m3362(abstractC2224, c2901.f7221);
                    }
                    interfaceC1011.mo1396(c2902, c2901, iMo1399);
                    if (c1013.f3691 == 0) {
                        c1013.f3685.m4144();
                        m3367(c1013);
                    }
                    if (c1011.f3691 == 0) {
                        C1010 c1016 = c1011.f3690;
                        c2901.m4144();
                        m3367(c1011);
                        c1011 = c1016;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), c1011.f3689);
                        if (!c1011.f3687) {
                            m3367(c1011);
                        }
                    }
                    c1011 = c1011.f3690;
                }
            }
        }
        while (true) {
            C1010 c1017 = this.f5571;
            if (c1017 == null || c1017 == c1010) {
                return;
            } else {
                m3367(c1017);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3367(C1010 c1010) {
        C1010 c1011 = c1010.f3689;
        if (c1011 != null) {
            c1011.f3690 = c1010.f3690;
        }
        C1010 c1012 = c1010.f3690;
        if (c1012 == null) {
            this.f5571 = c1011;
        } else {
            c1012.f3689 = c1011;
        }
    }
}
