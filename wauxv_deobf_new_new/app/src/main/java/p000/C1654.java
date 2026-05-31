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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲇᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1654 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Pattern f5588 = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Pattern f5589 = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Pattern f5590 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Pattern f5591 = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final Pattern f5592 = Pattern.compile("`+");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Pattern f5593 = Pattern.compile("^`+");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final Pattern f5594 = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final Pattern f5595 = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final Pattern f5596 = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final Pattern f5597 = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final Pattern f5598 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final Pattern f5599 = Pattern.compile(" *$");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final BitSet f5600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final BitSet f5601;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f5602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0519 f5603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f5604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1013 f5606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0449 f5607;

    public C1654(C0519 c0519) {
        List list = (List) c0519.f2208;
        HashMap map = new HashMap();
        m3524(Arrays.asList(new C0285('*'), new C0285('_')), map);
        m3524(list, map);
        this.f5602 = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f5601 = bitSet;
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
        this.f5600 = bitSet2;
        this.f5603 = c0519;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3523(char c, InterfaceC1014 interfaceC1014, HashMap map) {
        if (((InterfaceC1014) map.put(Character.valueOf(c), interfaceC1014)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3524(Iterable iterable, HashMap map) {
        C2861 c2861;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC1014 interfaceC1014 = (InterfaceC1014) it.next();
            char cMo1546 = interfaceC1014.mo1546();
            char cMo1543 = interfaceC1014.mo1543();
            if (cMo1546 == cMo1543) {
                InterfaceC1014 interfaceC1015 = (InterfaceC1014) map.get(Character.valueOf(cMo1546));
                if (interfaceC1015 == null || interfaceC1015.mo1546() != interfaceC1015.mo1543()) {
                    m3523(cMo1546, interfaceC1014, map);
                } else {
                    if (interfaceC1015 instanceof C2861) {
                        c2861 = (C2861) interfaceC1015;
                    } else {
                        C2861 c2862 = new C2861(cMo1546);
                        c2862.m4813(interfaceC1015);
                        c2861 = c2862;
                    }
                    c2861.m4813(interfaceC1014);
                    map.put(Character.valueOf(cMo1546), c2861);
                }
            } else {
                m3523(cMo1546, interfaceC1014, map);
                m3523(cMo1543, interfaceC1014, map);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m3525(C2960 c2960, C2960 c2961, int i) {
        if (c2960 == null || c2961 == null || c2960 == c2961) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c2960.f9491);
        AbstractC2254 abstractC2254 = c2960.f7337;
        AbstractC2254 abstractC2255 = c2961.f7337;
        while (abstractC2254 != abstractC2255) {
            sb.append(((C2960) abstractC2254).f9491);
            AbstractC2254 abstractC2256 = abstractC2254.f7337;
            abstractC2254.m4273();
            abstractC2254 = abstractC2256;
        }
        c2960.f9491 = sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m3526(AbstractC2254 abstractC2254, AbstractC2254 abstractC2255) {
        C2960 c2960 = null;
        C2960 c2961 = null;
        int length = 0;
        while (abstractC2254 != null) {
            if (abstractC2254 instanceof C2960) {
                c2961 = (C2960) abstractC2254;
                if (c2960 == null) {
                    c2960 = c2961;
                }
                length = c2961.f9491.length() + length;
            } else {
                m3525(c2960, c2961, length);
                c2960 = null;
                c2961 = null;
                length = 0;
            }
            if (abstractC2254 == abstractC2255) {
                break;
            } else {
                abstractC2254 = abstractC2254.f7337;
            }
        }
        m3525(c2960, c2961, length);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String m3527(Pattern pattern) {
        if (this.f5605 >= this.f5604.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f5604);
        matcher.region(this.f5605, this.f5604.length());
        if (!matcher.find()) {
            return null;
        }
        this.f5605 = matcher.end();
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
    public final void m3528(String str, AbstractC2254 abstractC2254) {
        int i;
        AbstractC2254 c2843;
        AbstractC2254 abstractC2255;
        AbstractC2254 abstractC2256;
        AbstractC2254 c2960;
        AbstractC2254 abstractC2257;
        AbstractC2254 c2961;
        AbstractC2254 c1816;
        AbstractC2254 c2962;
        int i2;
        String strM2985;
        boolean z;
        String strM2986;
        int iM5345;
        int i3;
        AbstractC2254 c2963;
        boolean z2;
        boolean z3;
        C1653 c1653;
        AbstractC2254 abstractC2258;
        AbstractC2254 abstractC2259;
        this.f5604 = str.trim();
        int i4 = 0;
        this.f5605 = 0;
        C2960 c2964 = null;
        this.f5606 = null;
        this.f5607 = null;
        AbstractC2254 abstractC22510 = null;
        while (true) {
            char cM3529 = m3529();
            if (cM3529 == 0) {
                i = i4;
            } else {
                if (cM3529 == '\n') {
                    this.f5605++;
                    if (abstractC22510 instanceof C2960) {
                        C2960 c2965 = (C2960) abstractC22510;
                        if (c2965.f9491.endsWith(" ")) {
                            String str2 = c2965.f9491;
                            Matcher matcher = f5599.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i = 0;
                            if (iEnd > 0) {
                                c2965.f9491 = AbstractC2844.m4778(iEnd, 0, str2);
                            }
                            c2843 = iEnd >= 2 ? new C1530() : new C2843();
                        } else {
                            i = 0;
                            c2843 = new C2843();
                        }
                    } else {
                        i = 0;
                        c2843 = new C2843();
                    }
                    abstractC2255 = c2843;
                } else if (cM3529 == '!') {
                    int i5 = this.f5605 + 1;
                    this.f5605 = i5;
                    if (m3529() == '[') {
                        this.f5605++;
                        C2960 c2966 = new C2960("![");
                        C0449 c0449 = this.f5607;
                        C0449 c04410 = new C0449(c2966, i5, c0449, this.f5606, true);
                        if (c0449 != null) {
                            c0449.f2050 = true;
                        }
                        this.f5607 = c04410;
                        abstractC2257 = c2966;
                    } else {
                        c2960 = new C2960("!");
                        abstractC2257 = c2960;
                    }
                    i = 0;
                    abstractC2255 = abstractC2257;
                } else if (cM3529 == '&') {
                    String strM3527 = m3527(f5591);
                    if (strM3527 != null) {
                        c2961 = new C2960(AbstractC1579.m3464(strM3527));
                        abstractC2257 = c2961;
                    } else {
                        abstractC2257 = null;
                    }
                    i = 0;
                    abstractC2255 = abstractC2257;
                } else if (cM3529 == '<') {
                    String strM3528 = m3527(f5594);
                    if (strM3528 != null) {
                        String strM4778 = AbstractC2844.m4778(1, 1, strM3528);
                        c1816 = new C1816(AbstractC2844.m4790("mailto:", strM4778), null);
                        c1816.m4272(new C2960(strM4778));
                    } else {
                        String strM3529 = m3527(f5595);
                        if (strM3529 != null) {
                            String strM4779 = AbstractC2844.m4778(1, 1, strM3529);
                            c1816 = new C1816(strM4779, null);
                            c1816.m4272(new C2960(strM4779));
                        } else {
                            abstractC2257 = null;
                        }
                        if (abstractC2257 == null) {
                            if (m3527(f5589) != null) {
                                c2960 = new C1582();
                                abstractC2257 = c2960;
                            } else {
                                abstractC2257 = null;
                            }
                        }
                        i = 0;
                        abstractC2255 = abstractC2257;
                    }
                    abstractC2257 = c1816;
                    if (abstractC2257 == null) {
                        if (m3527(f5589) != null) {
                            c2960 = new C1582();
                            abstractC2257 = c2960;
                        } else {
                            abstractC2257 = null;
                        }
                    }
                    i = 0;
                    abstractC2255 = abstractC2257;
                } else if (cM3529 != '`') {
                    switch (cM3529) {
                        case '[':
                            int i6 = this.f5605;
                            this.f5605 = i6 + 1;
                            C2960 c2967 = new C2960("[");
                            C0449 c04411 = this.f5607;
                            C0449 c04412 = new C0449(c2967, i6, c04411, this.f5606, false);
                            if (c04411 != null) {
                                c04411.f2050 = true;
                            }
                            this.f5607 = c04412;
                            abstractC2257 = c2967;
                            i = 0;
                            abstractC2255 = abstractC2257;
                            break;
                        case Opcodes.DUP2 /* 92 */:
                            this.f5605++;
                            if (m3529() == '\n') {
                                c2960 = new C1530();
                                this.f5605++;
                            } else {
                                if (this.f5605 < this.f5604.length()) {
                                    String str3 = this.f5604;
                                    int i7 = this.f5605;
                                    if (f5590.matcher(str3.substring(i7, i7 + 1)).matches()) {
                                        String str4 = this.f5604;
                                        int i8 = this.f5605;
                                        AbstractC2254 c2968 = new C2960(str4.substring(i8, i8 + 1));
                                        this.f5605++;
                                        abstractC2257 = c2968;
                                    }
                                    i = 0;
                                    abstractC2255 = abstractC2257;
                                }
                                c2960 = new C2960("\\");
                            }
                            abstractC2257 = c2960;
                            i = 0;
                            abstractC2255 = abstractC2257;
                            break;
                        case ']':
                            int i9 = this.f5605 + 1;
                            this.f5605 = i9;
                            C0449 c04413 = this.f5607;
                            if (c04413 != null) {
                                C2960 c2969 = (C2960) c04413.f2052;
                                boolean z4 = c04413.f2048;
                                if (c04413.f2049) {
                                    int i10 = -1;
                                    if (m3529() == '(') {
                                        this.f5605++;
                                        Pattern pattern = f5596;
                                        m3527(pattern);
                                        i2 = 1;
                                        int iM5343 = AbstractC3744.m5343(this.f5605, this.f5604);
                                        if (iM5343 == -1) {
                                            strM2986 = null;
                                        } else {
                                            String strSubstring = m3529() == '<' ? this.f5604.substring(this.f5605 + 1, iM5343 - 1) : this.f5604.substring(this.f5605, iM5343);
                                            this.f5605 = iM5343;
                                            strM2986 = AbstractC1230.m2985(strSubstring);
                                        }
                                        if (strM2986 != null) {
                                            m3527(pattern);
                                            String str5 = this.f5604;
                                            int i11 = this.f5605;
                                            if (f5598.matcher(str5.substring(i11 - 1, i11)).matches()) {
                                                String str6 = this.f5604;
                                                int i12 = this.f5605;
                                                if (i12 >= str6.length()) {
                                                    i3 = -1;
                                                } else {
                                                    char cCharAt = str6.charAt(i12);
                                                    char c = '\"';
                                                    if (cCharAt != '\"') {
                                                        c = '\'';
                                                        if (cCharAt == '\'') {
                                                            iM5345 = AbstractC3744.m5345(str6, i12 + 1, c);
                                                            if (iM5345 == -1 && iM5345 < str6.length() && str6.charAt(iM5345) == c) {
                                                                i3 = iM5345 + 1;
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
                                                            iM5345 = AbstractC3744.m5345(str6, i12 + 1, c);
                                                            if (iM5345 == -1) {
                                                                i10 = -1;
                                                                i3 = -1;
                                                            } else {
                                                                i3 = iM5345 + 1;
                                                                i10 = -1;
                                                            }
                                                        }
                                                    } else {
                                                        iM5345 = AbstractC3744.m5345(str6, i12 + 1, c);
                                                        if (iM5345 == -1) {
                                                            i10 = -1;
                                                            i3 = -1;
                                                        } else {
                                                            i3 = iM5345 + 1;
                                                            i10 = -1;
                                                        }
                                                    }
                                                }
                                                if (i3 == i10) {
                                                    strM2985 = null;
                                                } else {
                                                    String strSubstring2 = this.f5604.substring(this.f5605 + 1, i3 - 1);
                                                    this.f5605 = i3;
                                                    strM2985 = AbstractC1230.m2985(strSubstring2);
                                                }
                                                m3527(pattern);
                                            } else {
                                                strM2985 = null;
                                            }
                                            if (m3529() == ')') {
                                                this.f5605++;
                                                z = true;
                                            } else {
                                                this.f5605 = i9;
                                            }
                                        } else {
                                            strM2985 = null;
                                        }
                                        z = false;
                                    } else {
                                        i2 = 1;
                                        strM2985 = null;
                                        z = false;
                                        strM2986 = null;
                                    }
                                    if (!z) {
                                        int i13 = this.f5605;
                                        if (i13 < this.f5604.length() && this.f5604.charAt(this.f5605) == '[') {
                                            int i14 = this.f5605 + 1;
                                            int iM5344 = AbstractC3744.m5344(i14, this.f5604);
                                            int i15 = iM5344 - i14;
                                            if (iM5344 != -1 && i15 <= 999 && iM5344 < this.f5604.length() && this.f5604.charAt(iM5344) == ']') {
                                                this.f5605 = iM5344 + 1;
                                            }
                                        }
                                        int i16 = this.f5605 - i13;
                                        String strSubstring3 = i16 > 2 ? this.f5604.substring(i13, i16 + i13) : !c04413.f2050 ? this.f5604.substring(c04413.f2051, i9) : null;
                                        if (strSubstring3 != null) {
                                            Pattern pattern2 = AbstractC1230.f4446;
                                            C1817 c1817 = (C1817) ((Map) this.f5603.f2209).get(AbstractC1230.f4448.matcher(strSubstring3.substring(i2, strSubstring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                            if (c1817 != null) {
                                                strM2986 = c1817.f6049;
                                                strM2985 = c1817.f6050;
                                                z = true;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        this.f5605 = i9;
                                        this.f5607 = (C0449) this.f5607.f2053;
                                        c2960 = new C2960("]");
                                        abstractC2257 = c2960;
                                        i = 0;
                                        abstractC2255 = abstractC2257;
                                    } else {
                                        if (z4) {
                                            C1618 c1618 = new C1618();
                                            c1618.f5510 = strM2986;
                                            c1618.f5511 = strM2985;
                                            c2961 = c1618;
                                        } else {
                                            c2961 = new C1816(strM2986, strM2985);
                                        }
                                        AbstractC2254 abstractC22511 = c2969.f7337;
                                        while (abstractC22511 != null) {
                                            AbstractC2254 abstractC22512 = abstractC22511.f7337;
                                            c2961.m4272(abstractC22511);
                                            abstractC22511 = abstractC22512;
                                        }
                                        m3530((C1013) c04413.f2054);
                                        AbstractC2254 abstractC22513 = c2961.f7334;
                                        AbstractC2254 abstractC22514 = c2961.f7335;
                                        if (abstractC22513 != abstractC22514) {
                                            m3526(abstractC22513, abstractC22514);
                                        }
                                        c2969.m4273();
                                        C0449 c04414 = (C0449) this.f5607.f2053;
                                        this.f5607 = c04414;
                                        if (!z4) {
                                            while (c04414 != null) {
                                                if (!c04414.f2048) {
                                                    c04414.f2049 = false;
                                                }
                                                c04414 = (C0449) c04414.f2053;
                                            }
                                        }
                                        abstractC2257 = c2961;
                                        i = 0;
                                        abstractC2255 = abstractC2257;
                                    }
                                } else {
                                    this.f5607 = (C0449) c04413.f2053;
                                    c2962 = new C2960("]");
                                }
                            } else {
                                c2962 = new C2960("]");
                            }
                            abstractC2257 = c2962;
                            i = 0;
                            abstractC2255 = abstractC2257;
                            break;
                        default:
                            if (this.f5601.get(cM3529)) {
                                InterfaceC1014 interfaceC1014 = (InterfaceC1014) this.f5602.get(Character.valueOf(cM3529));
                                int i17 = this.f5605;
                                int i18 = i4;
                                while (m3529() == cM3529) {
                                    i18++;
                                    this.f5605++;
                                }
                                if (i18 < interfaceC1014.mo1544()) {
                                    this.f5605 = i17;
                                    c1653 = c2964;
                                } else {
                                    String strSubstring4 = i17 == 0 ? "\n" : this.f5604.substring(i17 - 1, i17);
                                    char cM35210 = m3529();
                                    String strValueOf = cM35210 != 0 ? String.valueOf(cM35210) : "\n";
                                    Pattern pattern3 = f5588;
                                    boolean zMatches = pattern3.matcher(strSubstring4).matches();
                                    Pattern pattern4 = f5597;
                                    boolean zMatches2 = pattern4.matcher(strSubstring4).matches();
                                    boolean zMatches3 = pattern3.matcher(strValueOf).matches();
                                    boolean zMatches4 = pattern4.matcher(strValueOf).matches();
                                    int i19 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i4 : 1;
                                    int i20 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i4 : 1;
                                    if (cM3529 == '_') {
                                        int i21 = (i19 == 0 || !(i20 == 0 || zMatches)) ? i4 : 1;
                                        if (i20 == 0 || !(i19 == 0 || zMatches3)) {
                                            z3 = i4;
                                            z2 = i21;
                                        } else {
                                            z3 = 1;
                                            z2 = i21;
                                        }
                                    } else {
                                        int i22 = (i19 == 0 || cM3529 != interfaceC1014.mo1546()) ? i4 : 1;
                                        int i23 = (i20 == 0 || cM3529 != interfaceC1014.mo1543()) ? i4 : 1;
                                        z2 = i22;
                                        z3 = i23;
                                    }
                                    this.f5605 = i17;
                                    c1653 = new C1653(i18, z2, z3);
                                }
                                if (c1653 == 0) {
                                    c2963 = c2964;
                                } else {
                                    int i24 = c1653.f5585;
                                    int i25 = this.f5605;
                                    int i26 = i25 + i24;
                                    this.f5605 = i26;
                                    C2960 c29610 = new C2960(this.f5604.substring(i25, i26));
                                    boolean z5 = c1653.f5587;
                                    boolean z6 = c1653.f5586;
                                    C1013 c1013 = this.f5606;
                                    C1013 c1014 = new C1013(c29610, cM3529, z5, z6, c1013);
                                    this.f5606 = c1014;
                                    c1014.f3698 = i24;
                                    c1014.f3699 = i24;
                                    if (c1013 != null) {
                                        c1013.f3697 = c1014;
                                    }
                                    c2963 = c29610;
                                }
                            } else {
                                int i27 = this.f5605;
                                int length = this.f5604.length();
                                while (true) {
                                    int i28 = this.f5605;
                                    if (i28 != length) {
                                        if (!this.f5600.get(this.f5604.charAt(i28))) {
                                            this.f5605++;
                                        }
                                    }
                                }
                                int i29 = this.f5605;
                                if (i27 != i29) {
                                    c2963 = new C2960(this.f5604.substring(i27, i29));
                                } else {
                                    c2963 = c2964;
                                }
                            }
                            i = i4;
                            abstractC2255 = c2963;
                            break;
                    }
                } else {
                    String strM35210 = m3527(f5593);
                    if (strM35210 == null) {
                        abstractC2257 = null;
                    } else {
                        int i30 = this.f5605;
                        while (true) {
                            String strM35211 = m3527(f5592);
                            if (strM35211 == null) {
                                this.f5605 = i30;
                                c2961 = new C2960(strM35210);
                                abstractC2257 = c2961;
                            } else if (strM35211.equals(strM35210)) {
                                C0728 c0728 = new C0728();
                                String strReplace = this.f5604.substring(i30, this.f5605 - strM35210.length()).replace('\n', ' ');
                                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                    int length2 = strReplace.length();
                                    if (AbstractC1470.m3370(' ', 0, length2, strReplace) != length2) {
                                        strReplace = AbstractC2844.m4778(1, 1, strReplace);
                                    }
                                }
                                c0728.f2755 = strReplace;
                                c2962 = c0728;
                                abstractC2257 = c2962;
                            }
                        }
                    }
                    i = 0;
                    abstractC2255 = abstractC2257;
                }
                if (abstractC2255 != null) {
                    abstractC2256 = abstractC2255;
                } else {
                    this.f5605++;
                    c2964 = new C2960(String.valueOf(cM3529));
                }
                if (abstractC2256 != null) {
                    m3530(null);
                    abstractC2258 = abstractC2254.f7334;
                    abstractC2259 = abstractC2254.f7335;
                    if (abstractC2258 == abstractC2259) {
                        return;
                    }
                    m3526(abstractC2258, abstractC2259);
                    return;
                }
                abstractC2254.m4272(abstractC2256);
                i4 = i;
                c2964 = null;
                abstractC22510 = abstractC2256;
            }
            abstractC2256 = c2964;
            if (abstractC2256 != null) {
                m3530(null);
                abstractC2258 = abstractC2254.f7334;
                abstractC2259 = abstractC2254.f7335;
                if (abstractC2258 == abstractC2259) {
                    return;
                }
                m3526(abstractC2258, abstractC2259);
                return;
            }
            abstractC2254.m4272(abstractC2256);
            i4 = i;
            c2964 = null;
            abstractC22510 = abstractC2256;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final char m3529() {
        if (this.f5605 < this.f5604.length()) {
            return this.f5604.charAt(this.f5605);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3530(C1013 c1013) {
        boolean z;
        AbstractC2254 abstractC2254;
        HashMap map = new HashMap();
        C1013 c1014 = this.f5606;
        while (c1014 != null) {
            C1013 c1015 = c1014.f3696;
            if (c1015 == c1013) {
                break;
            } else {
                c1014 = c1015;
            }
        }
        while (c1014 != null) {
            C2960 c2960 = c1014.f3692;
            char c = c1014.f3693;
            InterfaceC1014 interfaceC1014 = (InterfaceC1014) this.f5602.get(Character.valueOf(c));
            if (!c1014.f3695 || interfaceC1014 == null) {
                c1014 = c1014.f3697;
            } else {
                char cMo1546 = interfaceC1014.mo1546();
                C1013 c1016 = c1014.f3696;
                int iMo1545 = 0;
                boolean z2 = false;
                while (true) {
                    if (c1016 == null || c1016 == c1013 || c1016 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (c1016.f3694 && c1016.f3693 == cMo1546) {
                        iMo1545 = interfaceC1014.mo1545(c1016, c1014);
                        z2 = true;
                        if (iMo1545 > 0) {
                            z = true;
                            break;
                        }
                    }
                    c1016 = c1016.f3696;
                }
                if (z2) {
                    C2960 c2961 = c1016.f3692;
                    c1016.f3698 -= iMo1545;
                    c1014.f3698 -= iMo1545;
                    c2961.f9491 = AbstractC2844.m4778(iMo1545, 0, c2961.f9491);
                    c2960.f9491 = AbstractC2844.m4778(iMo1545, 0, c2960.f9491);
                    C1013 c1017 = c1014.f3696;
                    while (c1017 != null && c1017 != c1016) {
                        C1013 c1018 = c1017.f3696;
                        m3531(c1017);
                        c1017 = c1018;
                    }
                    if (c2961 != c2960 && (abstractC2254 = c2961.f7337) != c2960) {
                        m3526(abstractC2254, c2960.f7336);
                    }
                    interfaceC1014.mo1542(c2961, c2960, iMo1545);
                    if (c1016.f3698 == 0) {
                        c1016.f3692.m4273();
                        m3531(c1016);
                    }
                    if (c1014.f3698 == 0) {
                        C1013 c1019 = c1014.f3697;
                        c2960.m4273();
                        m3531(c1014);
                        c1014 = c1019;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), c1014.f3696);
                        if (!c1014.f3694) {
                            m3531(c1014);
                        }
                    }
                    c1014 = c1014.f3697;
                }
            }
        }
        while (true) {
            C1013 c10110 = this.f5606;
            if (c10110 == null || c10110 == c1013) {
                return;
            } else {
                m3531(c10110);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3531(C1013 c1013) {
        C1013 c1014 = c1013.f3696;
        if (c1014 != null) {
            c1014.f3697 = c1013.f3697;
        }
        C1013 c1015 = c1013.f3697;
        if (c1015 == null) {
            this.f5606 = c1014;
        } else {
            c1015.f3696 = c1014;
        }
    }
}
