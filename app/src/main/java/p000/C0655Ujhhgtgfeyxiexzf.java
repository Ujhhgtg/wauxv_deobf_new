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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0655Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final Pattern f2744Ujhhgtgfeyxiexzf = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Pattern f2745Ujhhgtgfeyxiexzf = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final Pattern f2746Ujhhgtgfeyxiexzf = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Pattern f2747Ujhhgtgfeyxiexzf = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final Pattern f2748Ujhhgtgfeyxiexzf = Pattern.compile("`+");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final Pattern f2749Ujhhgtgfeyxiexzf = Pattern.compile("^`+");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final Pattern f2750Ujhhgtgfeyxiexzf = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Pattern f2751Ujhhgtgfeyxiexzf = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final Pattern f2752Ujhhgtgfeyxiexzf = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Pattern f2753Ujhhgtgfeyxiexzf = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final Pattern f2754Ujhhgtgfeyxiexzf = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final Pattern f2755Ujhhgtgfeyxiexzf = Pattern.compile(" *$");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final BitSet f2756Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final BitSet f2757Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashMap f2758Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f2759Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public String f2760Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f2761Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C3255feyxiexzfUjhhgtg f2762Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C2567Ujhhgtgfeyxiexzf f2763Ujhhgtgfeyxiexzf;

    public C0655Ujhhgtgfeyxiexzf(C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf) {
        List list = (List) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
        HashMap map = new HashMap();
        m1924Ujhhgtgfeyxiexzf(Arrays.asList(new C2398Ujhhgtgfeyxiexzf('*'), new C2398Ujhhgtgfeyxiexzf('_')), map);
        m1924Ujhhgtgfeyxiexzf(list, map);
        this.f2758Ujhhgtgfeyxiexzf = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f2757Ujhhgtgfeyxiexzf = bitSet;
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
        this.f2756Ujhhgtgfeyxiexzf = bitSet2;
        this.f2759Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m1923Ujhhgtgfeyxiexzf(char c, InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg, HashMap map) {
        if (((InterfaceC3256feyxiexzfUjhhgtg) map.put(Character.valueOf(c), interfaceC3256feyxiexzfUjhhgtg)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m1924Ujhhgtgfeyxiexzf(Iterable iterable, HashMap map) {
        C1145feyxiexzfUjhhgtg c1145feyxiexzfUjhhgtg;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg = (InterfaceC3256feyxiexzfUjhhgtg) it.next();
            char cMo2612Ujhhgtgfeyxiexzf = interfaceC3256feyxiexzfUjhhgtg.mo2612Ujhhgtgfeyxiexzf();
            char cMo2609Ujhhgtgfeyxiexzf = interfaceC3256feyxiexzfUjhhgtg.mo2609Ujhhgtgfeyxiexzf();
            if (cMo2612Ujhhgtgfeyxiexzf == cMo2609Ujhhgtgfeyxiexzf) {
                InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg2 = (InterfaceC3256feyxiexzfUjhhgtg) map.get(Character.valueOf(cMo2612Ujhhgtgfeyxiexzf));
                if (interfaceC3256feyxiexzfUjhhgtg2 == null || interfaceC3256feyxiexzfUjhhgtg2.mo2612Ujhhgtgfeyxiexzf() != interfaceC3256feyxiexzfUjhhgtg2.mo2609Ujhhgtgfeyxiexzf()) {
                    m1923Ujhhgtgfeyxiexzf(cMo2612Ujhhgtgfeyxiexzf, interfaceC3256feyxiexzfUjhhgtg, map);
                } else {
                    if (interfaceC3256feyxiexzfUjhhgtg2 instanceof C1145feyxiexzfUjhhgtg) {
                        c1145feyxiexzfUjhhgtg = (C1145feyxiexzfUjhhgtg) interfaceC3256feyxiexzfUjhhgtg2;
                    } else {
                        C1145feyxiexzfUjhhgtg c1145feyxiexzfUjhhgtg2 = new C1145feyxiexzfUjhhgtg(cMo2612Ujhhgtgfeyxiexzf);
                        c1145feyxiexzfUjhhgtg2.m2613Ujhhgtgfeyxiexzf(interfaceC3256feyxiexzfUjhhgtg2);
                        c1145feyxiexzfUjhhgtg = c1145feyxiexzfUjhhgtg2;
                    }
                    c1145feyxiexzfUjhhgtg.m2613Ujhhgtgfeyxiexzf(interfaceC3256feyxiexzfUjhhgtg);
                    map.put(Character.valueOf(cMo2612Ujhhgtgfeyxiexzf), c1145feyxiexzfUjhhgtg);
                }
            } else {
                m1923Ujhhgtgfeyxiexzf(cMo2612Ujhhgtgfeyxiexzf, interfaceC3256feyxiexzfUjhhgtg, map);
                m1923Ujhhgtgfeyxiexzf(cMo2609Ujhhgtgfeyxiexzf, interfaceC3256feyxiexzfUjhhgtg, map);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m1925Ujhhgtgfeyxiexzf(C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf, C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf2, int i) {
        if (c1964Ujhhgtgfeyxiexzf == null || c1964Ujhhgtgfeyxiexzf2 == null || c1964Ujhhgtgfeyxiexzf == c1964Ujhhgtgfeyxiexzf2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c1964Ujhhgtgfeyxiexzf.f6440Ujhhgtgfeyxiexzf);
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg = c1964Ujhhgtgfeyxiexzf.f4689Ujhhgtgfeyxiexzf;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg2 = c1964Ujhhgtgfeyxiexzf2.f4689Ujhhgtgfeyxiexzf;
        while (abstractC1286feyxiexzfUjhhgtg != abstractC1286feyxiexzfUjhhgtg2) {
            sb.append(((C1964Ujhhgtgfeyxiexzf) abstractC1286feyxiexzfUjhhgtg).f6440Ujhhgtgfeyxiexzf);
            AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg3 = abstractC1286feyxiexzfUjhhgtg.f4689Ujhhgtgfeyxiexzf;
            abstractC1286feyxiexzfUjhhgtg.m2851Ujhhgtgfeyxiexzf();
            abstractC1286feyxiexzfUjhhgtg = abstractC1286feyxiexzfUjhhgtg3;
        }
        c1964Ujhhgtgfeyxiexzf.f6440Ujhhgtgfeyxiexzf = sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m1926Ujhhgtgfeyxiexzf(AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg, AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg2) {
        C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf = null;
        C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf2 = null;
        int length = 0;
        while (abstractC1286feyxiexzfUjhhgtg != null) {
            if (abstractC1286feyxiexzfUjhhgtg instanceof C1964Ujhhgtgfeyxiexzf) {
                c1964Ujhhgtgfeyxiexzf2 = (C1964Ujhhgtgfeyxiexzf) abstractC1286feyxiexzfUjhhgtg;
                if (c1964Ujhhgtgfeyxiexzf == null) {
                    c1964Ujhhgtgfeyxiexzf = c1964Ujhhgtgfeyxiexzf2;
                }
                length = c1964Ujhhgtgfeyxiexzf2.f6440Ujhhgtgfeyxiexzf.length() + length;
            } else {
                m1925Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf, c1964Ujhhgtgfeyxiexzf2, length);
                c1964Ujhhgtgfeyxiexzf = null;
                c1964Ujhhgtgfeyxiexzf2 = null;
                length = 0;
            }
            if (abstractC1286feyxiexzfUjhhgtg == abstractC1286feyxiexzfUjhhgtg2) {
                break;
            } else {
                abstractC1286feyxiexzfUjhhgtg = abstractC1286feyxiexzfUjhhgtg.f4689Ujhhgtgfeyxiexzf;
            }
        }
        m1925Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf, c1964Ujhhgtgfeyxiexzf2, length);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String m1927Ujhhgtgfeyxiexzf(Pattern pattern) {
        if (this.f2761Ujhhgtgfeyxiexzf >= this.f2760Ujhhgtgfeyxiexzf.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f2760Ujhhgtgfeyxiexzf);
        matcher.region(this.f2761Ujhhgtgfeyxiexzf, this.f2760Ujhhgtgfeyxiexzf.length());
        if (!matcher.find()) {
            return null;
        }
        this.f2761Ujhhgtgfeyxiexzf = matcher.end();
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1928Ujhhgtgfeyxiexzf(String str, AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg) {
        int i;
        AbstractC1286feyxiexzfUjhhgtg c1229feyxiexzfUjhhgtg;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg2;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg3;
        AbstractC1286feyxiexzfUjhhgtg c1964Ujhhgtgfeyxiexzf;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg4;
        AbstractC1286feyxiexzfUjhhgtg c1964Ujhhgtgfeyxiexzf2;
        AbstractC1286feyxiexzfUjhhgtg c0067Ujhhgtgfeyxiexzf;
        AbstractC1286feyxiexzfUjhhgtg c1964Ujhhgtgfeyxiexzf3;
        int i2;
        String strM4879Ujhhgtgfeyxiexzf;
        boolean z;
        String strM4879Ujhhgtgfeyxiexzf2;
        int iM2772Ujhhgtgfeyxiexzf;
        int i3;
        AbstractC1286feyxiexzfUjhhgtg c1964Ujhhgtgfeyxiexzf4;
        boolean z2;
        boolean z3;
        C0656Ujhhgtgfeyxiexzf c0656Ujhhgtgfeyxiexzf;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg5;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg6;
        this.f2760Ujhhgtgfeyxiexzf = str.trim();
        int i4 = 0;
        this.f2761Ujhhgtgfeyxiexzf = 0;
        C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf5 = null;
        this.f2762Ujhhgtgfeyxiexzf = null;
        this.f2763Ujhhgtgfeyxiexzf = null;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg7 = null;
        while (true) {
            char cM1929Ujhhgtgfeyxiexzf = m1929Ujhhgtgfeyxiexzf();
            if (cM1929Ujhhgtgfeyxiexzf == 0) {
                i = i4;
            } else {
                if (cM1929Ujhhgtgfeyxiexzf == '\n') {
                    this.f2761Ujhhgtgfeyxiexzf++;
                    if (abstractC1286feyxiexzfUjhhgtg7 instanceof C1964Ujhhgtgfeyxiexzf) {
                        C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf6 = (C1964Ujhhgtgfeyxiexzf) abstractC1286feyxiexzfUjhhgtg7;
                        if (c1964Ujhhgtgfeyxiexzf6.f6440Ujhhgtgfeyxiexzf.endsWith(" ")) {
                            String str2 = c1964Ujhhgtgfeyxiexzf6.f6440Ujhhgtgfeyxiexzf;
                            Matcher matcher = f2755Ujhhgtgfeyxiexzf.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i = 0;
                            if (iEnd > 0) {
                                c1964Ujhhgtgfeyxiexzf6.f6440Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(iEnd, 0, str2);
                            }
                            c1229feyxiexzfUjhhgtg = iEnd >= 2 ? new C0539Ujhhgtgfeyxiexzf() : new C1229feyxiexzfUjhhgtg();
                        } else {
                            i = 0;
                            c1229feyxiexzfUjhhgtg = new C1229feyxiexzfUjhhgtg();
                        }
                    } else {
                        i = 0;
                        c1229feyxiexzfUjhhgtg = new C1229feyxiexzfUjhhgtg();
                    }
                    abstractC1286feyxiexzfUjhhgtg2 = c1229feyxiexzfUjhhgtg;
                } else if (cM1929Ujhhgtgfeyxiexzf == '!') {
                    int i5 = this.f2761Ujhhgtgfeyxiexzf + 1;
                    this.f2761Ujhhgtgfeyxiexzf = i5;
                    if (m1929Ujhhgtgfeyxiexzf() == '[') {
                        this.f2761Ujhhgtgfeyxiexzf++;
                        C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf7 = new C1964Ujhhgtgfeyxiexzf("![");
                        C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf = this.f2763Ujhhgtgfeyxiexzf;
                        C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf2 = new C2567Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf7, i5, c2567Ujhhgtgfeyxiexzf, this.f2762Ujhhgtgfeyxiexzf, true);
                        if (c2567Ujhhgtgfeyxiexzf != null) {
                            c2567Ujhhgtgfeyxiexzf.f8314Ujhhgtgfeyxiexzf = true;
                        }
                        this.f2763Ujhhgtgfeyxiexzf = c2567Ujhhgtgfeyxiexzf2;
                        abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf7;
                    } else {
                        c1964Ujhhgtgfeyxiexzf = new C1964Ujhhgtgfeyxiexzf("!");
                        abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf;
                    }
                    i = 0;
                    abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                } else if (cM1929Ujhhgtgfeyxiexzf == '&') {
                    String strM1927Ujhhgtgfeyxiexzf = m1927Ujhhgtgfeyxiexzf(f2747Ujhhgtgfeyxiexzf);
                    if (strM1927Ujhhgtgfeyxiexzf != null) {
                        c1964Ujhhgtgfeyxiexzf2 = new C1964Ujhhgtgfeyxiexzf(AbstractC0588Ujhhgtgfeyxiexzf.m1864Ujhhgtgfeyxiexzf(strM1927Ujhhgtgfeyxiexzf));
                        abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf2;
                    } else {
                        abstractC1286feyxiexzfUjhhgtg4 = null;
                    }
                    i = 0;
                    abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                } else if (cM1929Ujhhgtgfeyxiexzf == '<') {
                    String strM1927Ujhhgtgfeyxiexzf2 = m1927Ujhhgtgfeyxiexzf(f2750Ujhhgtgfeyxiexzf);
                    if (strM1927Ujhhgtgfeyxiexzf2 != null) {
                        String strM2699Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 1, strM1927Ujhhgtgfeyxiexzf2);
                        c0067Ujhhgtgfeyxiexzf = new C0067Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("mailto:", strM2699Ujhhgtgfeyxiexzf), null);
                        c0067Ujhhgtgfeyxiexzf.m2848Ujhhgtgfeyxiexzf(new C1964Ujhhgtgfeyxiexzf(strM2699Ujhhgtgfeyxiexzf));
                    } else {
                        String strM1927Ujhhgtgfeyxiexzf3 = m1927Ujhhgtgfeyxiexzf(f2751Ujhhgtgfeyxiexzf);
                        if (strM1927Ujhhgtgfeyxiexzf3 != null) {
                            String strM2699Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 1, strM1927Ujhhgtgfeyxiexzf3);
                            c0067Ujhhgtgfeyxiexzf = new C0067Ujhhgtgfeyxiexzf(strM2699Ujhhgtgfeyxiexzf2, null);
                            c0067Ujhhgtgfeyxiexzf.m2848Ujhhgtgfeyxiexzf(new C1964Ujhhgtgfeyxiexzf(strM2699Ujhhgtgfeyxiexzf2));
                        } else {
                            abstractC1286feyxiexzfUjhhgtg4 = null;
                        }
                        if (abstractC1286feyxiexzfUjhhgtg4 == null) {
                            if (m1927Ujhhgtgfeyxiexzf(f2745Ujhhgtgfeyxiexzf) != null) {
                                c1964Ujhhgtgfeyxiexzf = new C0586Ujhhgtgfeyxiexzf();
                                abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf;
                            } else {
                                abstractC1286feyxiexzfUjhhgtg4 = null;
                            }
                        }
                        i = 0;
                        abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                    }
                    abstractC1286feyxiexzfUjhhgtg4 = c0067Ujhhgtgfeyxiexzf;
                    if (abstractC1286feyxiexzfUjhhgtg4 == null) {
                        if (m1927Ujhhgtgfeyxiexzf(f2745Ujhhgtgfeyxiexzf) != null) {
                            c1964Ujhhgtgfeyxiexzf = new C0586Ujhhgtgfeyxiexzf();
                            abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf;
                        } else {
                            abstractC1286feyxiexzfUjhhgtg4 = null;
                        }
                    }
                    i = 0;
                    abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                } else if (cM1929Ujhhgtgfeyxiexzf != '`') {
                    switch (cM1929Ujhhgtgfeyxiexzf) {
                        case '[':
                            int i6 = this.f2761Ujhhgtgfeyxiexzf;
                            this.f2761Ujhhgtgfeyxiexzf = i6 + 1;
                            C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf8 = new C1964Ujhhgtgfeyxiexzf("[");
                            C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf3 = this.f2763Ujhhgtgfeyxiexzf;
                            C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf4 = new C2567Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf8, i6, c2567Ujhhgtgfeyxiexzf3, this.f2762Ujhhgtgfeyxiexzf, false);
                            if (c2567Ujhhgtgfeyxiexzf3 != null) {
                                c2567Ujhhgtgfeyxiexzf3.f8314Ujhhgtgfeyxiexzf = true;
                            }
                            this.f2763Ujhhgtgfeyxiexzf = c2567Ujhhgtgfeyxiexzf4;
                            abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf8;
                            i = 0;
                            abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                            break;
                        case Opcodes.DUP2 /* 92 */:
                            this.f2761Ujhhgtgfeyxiexzf++;
                            if (m1929Ujhhgtgfeyxiexzf() == '\n') {
                                c1964Ujhhgtgfeyxiexzf = new C0539Ujhhgtgfeyxiexzf();
                                this.f2761Ujhhgtgfeyxiexzf++;
                            } else {
                                if (this.f2761Ujhhgtgfeyxiexzf < this.f2760Ujhhgtgfeyxiexzf.length()) {
                                    String str3 = this.f2760Ujhhgtgfeyxiexzf;
                                    int i7 = this.f2761Ujhhgtgfeyxiexzf;
                                    if (f2746Ujhhgtgfeyxiexzf.matcher(str3.substring(i7, i7 + 1)).matches()) {
                                        String str4 = this.f2760Ujhhgtgfeyxiexzf;
                                        int i8 = this.f2761Ujhhgtgfeyxiexzf;
                                        AbstractC1286feyxiexzfUjhhgtg c1964Ujhhgtgfeyxiexzf9 = new C1964Ujhhgtgfeyxiexzf(str4.substring(i8, i8 + 1));
                                        this.f2761Ujhhgtgfeyxiexzf++;
                                        abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf9;
                                    }
                                    i = 0;
                                    abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                                }
                                c1964Ujhhgtgfeyxiexzf = new C1964Ujhhgtgfeyxiexzf("\\");
                            }
                            abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf;
                            i = 0;
                            abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                            break;
                        case ']':
                            int i9 = this.f2761Ujhhgtgfeyxiexzf + 1;
                            this.f2761Ujhhgtgfeyxiexzf = i9;
                            C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf5 = this.f2763Ujhhgtgfeyxiexzf;
                            if (c2567Ujhhgtgfeyxiexzf5 != null) {
                                C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf10 = (C1964Ujhhgtgfeyxiexzf) c2567Ujhhgtgfeyxiexzf5.f8316Ujhhgtgfeyxiexzf;
                                boolean z4 = c2567Ujhhgtgfeyxiexzf5.f8312Ujhhgtgfeyxiexzf;
                                if (c2567Ujhhgtgfeyxiexzf5.f8313Ujhhgtgfeyxiexzf) {
                                    int i10 = -1;
                                    if (m1929Ujhhgtgfeyxiexzf() == '(') {
                                        this.f2761Ujhhgtgfeyxiexzf++;
                                        Pattern pattern = f2752Ujhhgtgfeyxiexzf;
                                        m1927Ujhhgtgfeyxiexzf(pattern);
                                        i2 = 1;
                                        int iM2770Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2770Ujhhgtgfeyxiexzf(this.f2761Ujhhgtgfeyxiexzf, this.f2760Ujhhgtgfeyxiexzf);
                                        if (iM2770Ujhhgtgfeyxiexzf == -1) {
                                            strM4879Ujhhgtgfeyxiexzf2 = null;
                                        } else {
                                            String strSubstring = m1929Ujhhgtgfeyxiexzf() == '<' ? this.f2760Ujhhgtgfeyxiexzf.substring(this.f2761Ujhhgtgfeyxiexzf + 1, iM2770Ujhhgtgfeyxiexzf - 1) : this.f2760Ujhhgtgfeyxiexzf.substring(this.f2761Ujhhgtgfeyxiexzf, iM2770Ujhhgtgfeyxiexzf);
                                            this.f2761Ujhhgtgfeyxiexzf = iM2770Ujhhgtgfeyxiexzf;
                                            strM4879Ujhhgtgfeyxiexzf2 = AbstractC3372feyxiexzfUjhhgtg.m4879Ujhhgtgfeyxiexzf(strSubstring);
                                        }
                                        if (strM4879Ujhhgtgfeyxiexzf2 != null) {
                                            m1927Ujhhgtgfeyxiexzf(pattern);
                                            String str5 = this.f2760Ujhhgtgfeyxiexzf;
                                            int i11 = this.f2761Ujhhgtgfeyxiexzf;
                                            if (f2754Ujhhgtgfeyxiexzf.matcher(str5.substring(i11 - 1, i11)).matches()) {
                                                String str6 = this.f2760Ujhhgtgfeyxiexzf;
                                                int i12 = this.f2761Ujhhgtgfeyxiexzf;
                                                if (i12 >= str6.length()) {
                                                    i3 = -1;
                                                } else {
                                                    char cCharAt = str6.charAt(i12);
                                                    char c = '\"';
                                                    if (cCharAt != '\"') {
                                                        c = '\'';
                                                        if (cCharAt == '\'') {
                                                            iM2772Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2772Ujhhgtgfeyxiexzf(str6, i12 + 1, c);
                                                            if (iM2772Ujhhgtgfeyxiexzf == -1 && iM2772Ujhhgtgfeyxiexzf < str6.length() && str6.charAt(iM2772Ujhhgtgfeyxiexzf) == c) {
                                                                i3 = iM2772Ujhhgtgfeyxiexzf + 1;
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
                                                            iM2772Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2772Ujhhgtgfeyxiexzf(str6, i12 + 1, c);
                                                            if (iM2772Ujhhgtgfeyxiexzf == -1) {
                                                                i10 = -1;
                                                                i3 = -1;
                                                            } else {
                                                                i3 = iM2772Ujhhgtgfeyxiexzf + 1;
                                                                i10 = -1;
                                                            }
                                                        }
                                                    } else {
                                                        iM2772Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2772Ujhhgtgfeyxiexzf(str6, i12 + 1, c);
                                                        if (iM2772Ujhhgtgfeyxiexzf == -1) {
                                                            i10 = -1;
                                                            i3 = -1;
                                                        } else {
                                                            i3 = iM2772Ujhhgtgfeyxiexzf + 1;
                                                            i10 = -1;
                                                        }
                                                    }
                                                }
                                                if (i3 == i10) {
                                                    strM4879Ujhhgtgfeyxiexzf = null;
                                                } else {
                                                    String strSubstring2 = this.f2760Ujhhgtgfeyxiexzf.substring(this.f2761Ujhhgtgfeyxiexzf + 1, i3 - 1);
                                                    this.f2761Ujhhgtgfeyxiexzf = i3;
                                                    strM4879Ujhhgtgfeyxiexzf = AbstractC3372feyxiexzfUjhhgtg.m4879Ujhhgtgfeyxiexzf(strSubstring2);
                                                }
                                                m1927Ujhhgtgfeyxiexzf(pattern);
                                            } else {
                                                strM4879Ujhhgtgfeyxiexzf = null;
                                            }
                                            if (m1929Ujhhgtgfeyxiexzf() == ')') {
                                                this.f2761Ujhhgtgfeyxiexzf++;
                                                z = true;
                                            } else {
                                                this.f2761Ujhhgtgfeyxiexzf = i9;
                                            }
                                        } else {
                                            strM4879Ujhhgtgfeyxiexzf = null;
                                        }
                                        z = false;
                                    } else {
                                        i2 = 1;
                                        strM4879Ujhhgtgfeyxiexzf = null;
                                        z = false;
                                        strM4879Ujhhgtgfeyxiexzf2 = null;
                                    }
                                    if (!z) {
                                        int i13 = this.f2761Ujhhgtgfeyxiexzf;
                                        if (i13 < this.f2760Ujhhgtgfeyxiexzf.length() && this.f2760Ujhhgtgfeyxiexzf.charAt(this.f2761Ujhhgtgfeyxiexzf) == '[') {
                                            int i14 = this.f2761Ujhhgtgfeyxiexzf + 1;
                                            int iM2771Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2771Ujhhgtgfeyxiexzf(i14, this.f2760Ujhhgtgfeyxiexzf);
                                            int i15 = iM2771Ujhhgtgfeyxiexzf - i14;
                                            if (iM2771Ujhhgtgfeyxiexzf != -1 && i15 <= 999 && iM2771Ujhhgtgfeyxiexzf < this.f2760Ujhhgtgfeyxiexzf.length() && this.f2760Ujhhgtgfeyxiexzf.charAt(iM2771Ujhhgtgfeyxiexzf) == ']') {
                                                this.f2761Ujhhgtgfeyxiexzf = iM2771Ujhhgtgfeyxiexzf + 1;
                                            }
                                        }
                                        int i16 = this.f2761Ujhhgtgfeyxiexzf - i13;
                                        String strSubstring3 = i16 > 2 ? this.f2760Ujhhgtgfeyxiexzf.substring(i13, i16 + i13) : !c2567Ujhhgtgfeyxiexzf5.f8314Ujhhgtgfeyxiexzf ? this.f2760Ujhhgtgfeyxiexzf.substring(c2567Ujhhgtgfeyxiexzf5.f8315Ujhhgtgfeyxiexzf, i9) : null;
                                        if (strSubstring3 != null) {
                                            Pattern pattern2 = AbstractC3372feyxiexzfUjhhgtg.f10544Ujhhgtgfeyxiexzf;
                                            C0068Ujhhgtgfeyxiexzf c0068Ujhhgtgfeyxiexzf = (C0068Ujhhgtgfeyxiexzf) ((Map) this.f2759Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf).get(AbstractC3372feyxiexzfUjhhgtg.f10546Ujhhgtgfeyxiexzf.matcher(strSubstring3.substring(i2, strSubstring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                            if (c0068Ujhhgtgfeyxiexzf != null) {
                                                strM4879Ujhhgtgfeyxiexzf2 = c0068Ujhhgtgfeyxiexzf.f1086Ujhhgtgfeyxiexzf;
                                                strM4879Ujhhgtgfeyxiexzf = c0068Ujhhgtgfeyxiexzf.f1087Ujhhgtgfeyxiexzf;
                                                z = true;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        this.f2761Ujhhgtgfeyxiexzf = i9;
                                        this.f2763Ujhhgtgfeyxiexzf = (C2567Ujhhgtgfeyxiexzf) this.f2763Ujhhgtgfeyxiexzf.f8317Ujhhgtgfeyxiexzf;
                                        c1964Ujhhgtgfeyxiexzf = new C1964Ujhhgtgfeyxiexzf("]");
                                        abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf;
                                        i = 0;
                                        abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                                    } else {
                                        if (z4) {
                                            C0749Ujhhgtgfeyxiexzf c0749Ujhhgtgfeyxiexzf = new C0749Ujhhgtgfeyxiexzf();
                                            c0749Ujhhgtgfeyxiexzf.f3018Ujhhgtgfeyxiexzf = strM4879Ujhhgtgfeyxiexzf2;
                                            c0749Ujhhgtgfeyxiexzf.f3019Ujhhgtgfeyxiexzf = strM4879Ujhhgtgfeyxiexzf;
                                            c1964Ujhhgtgfeyxiexzf2 = c0749Ujhhgtgfeyxiexzf;
                                        } else {
                                            c1964Ujhhgtgfeyxiexzf2 = new C0067Ujhhgtgfeyxiexzf(strM4879Ujhhgtgfeyxiexzf2, strM4879Ujhhgtgfeyxiexzf);
                                        }
                                        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg8 = c1964Ujhhgtgfeyxiexzf10.f4689Ujhhgtgfeyxiexzf;
                                        while (abstractC1286feyxiexzfUjhhgtg8 != null) {
                                            AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg9 = abstractC1286feyxiexzfUjhhgtg8.f4689Ujhhgtgfeyxiexzf;
                                            c1964Ujhhgtgfeyxiexzf2.m2848Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg8);
                                            abstractC1286feyxiexzfUjhhgtg8 = abstractC1286feyxiexzfUjhhgtg9;
                                        }
                                        m1930Ujhhgtgfeyxiexzf((C3255feyxiexzfUjhhgtg) c2567Ujhhgtgfeyxiexzf5.f8318Ujhhgtgfeyxiexzf);
                                        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg10 = c1964Ujhhgtgfeyxiexzf2.f4686Ujhhgtgfeyxiexzf;
                                        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg11 = c1964Ujhhgtgfeyxiexzf2.f4687Ujhhgtgfeyxiexzf;
                                        if (abstractC1286feyxiexzfUjhhgtg10 != abstractC1286feyxiexzfUjhhgtg11) {
                                            m1926Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg10, abstractC1286feyxiexzfUjhhgtg11);
                                        }
                                        c1964Ujhhgtgfeyxiexzf10.m2851Ujhhgtgfeyxiexzf();
                                        C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf6 = (C2567Ujhhgtgfeyxiexzf) this.f2763Ujhhgtgfeyxiexzf.f8317Ujhhgtgfeyxiexzf;
                                        this.f2763Ujhhgtgfeyxiexzf = c2567Ujhhgtgfeyxiexzf6;
                                        if (!z4) {
                                            while (c2567Ujhhgtgfeyxiexzf6 != null) {
                                                if (!c2567Ujhhgtgfeyxiexzf6.f8312Ujhhgtgfeyxiexzf) {
                                                    c2567Ujhhgtgfeyxiexzf6.f8313Ujhhgtgfeyxiexzf = false;
                                                }
                                                c2567Ujhhgtgfeyxiexzf6 = (C2567Ujhhgtgfeyxiexzf) c2567Ujhhgtgfeyxiexzf6.f8317Ujhhgtgfeyxiexzf;
                                            }
                                        }
                                        abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf2;
                                        i = 0;
                                        abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                                    }
                                } else {
                                    this.f2763Ujhhgtgfeyxiexzf = (C2567Ujhhgtgfeyxiexzf) c2567Ujhhgtgfeyxiexzf5.f8317Ujhhgtgfeyxiexzf;
                                    c1964Ujhhgtgfeyxiexzf3 = new C1964Ujhhgtgfeyxiexzf("]");
                                }
                            } else {
                                c1964Ujhhgtgfeyxiexzf3 = new C1964Ujhhgtgfeyxiexzf("]");
                            }
                            abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf3;
                            i = 0;
                            abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                            break;
                        default:
                            if (this.f2757Ujhhgtgfeyxiexzf.get(cM1929Ujhhgtgfeyxiexzf)) {
                                InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg = (InterfaceC3256feyxiexzfUjhhgtg) this.f2758Ujhhgtgfeyxiexzf.get(Character.valueOf(cM1929Ujhhgtgfeyxiexzf));
                                int i17 = this.f2761Ujhhgtgfeyxiexzf;
                                int i18 = i4;
                                while (m1929Ujhhgtgfeyxiexzf() == cM1929Ujhhgtgfeyxiexzf) {
                                    i18++;
                                    this.f2761Ujhhgtgfeyxiexzf++;
                                }
                                if (i18 < interfaceC3256feyxiexzfUjhhgtg.mo2610Ujhhgtgfeyxiexzf()) {
                                    this.f2761Ujhhgtgfeyxiexzf = i17;
                                    c0656Ujhhgtgfeyxiexzf = c1964Ujhhgtgfeyxiexzf5;
                                } else {
                                    String strSubstring4 = i17 == 0 ? "\n" : this.f2760Ujhhgtgfeyxiexzf.substring(i17 - 1, i17);
                                    char cM1929Ujhhgtgfeyxiexzf2 = m1929Ujhhgtgfeyxiexzf();
                                    String strValueOf = cM1929Ujhhgtgfeyxiexzf2 != 0 ? String.valueOf(cM1929Ujhhgtgfeyxiexzf2) : "\n";
                                    Pattern pattern3 = f2744Ujhhgtgfeyxiexzf;
                                    boolean zMatches = pattern3.matcher(strSubstring4).matches();
                                    Pattern pattern4 = f2753Ujhhgtgfeyxiexzf;
                                    boolean zMatches2 = pattern4.matcher(strSubstring4).matches();
                                    boolean zMatches3 = pattern3.matcher(strValueOf).matches();
                                    boolean zMatches4 = pattern4.matcher(strValueOf).matches();
                                    int i19 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i4 : 1;
                                    int i20 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i4 : 1;
                                    if (cM1929Ujhhgtgfeyxiexzf == '_') {
                                        int i21 = (i19 == 0 || !(i20 == 0 || zMatches)) ? i4 : 1;
                                        if (i20 == 0 || !(i19 == 0 || zMatches3)) {
                                            z3 = i4;
                                            z2 = i21;
                                        } else {
                                            z3 = 1;
                                            z2 = i21;
                                        }
                                    } else {
                                        int i22 = (i19 == 0 || cM1929Ujhhgtgfeyxiexzf != interfaceC3256feyxiexzfUjhhgtg.mo2612Ujhhgtgfeyxiexzf()) ? i4 : 1;
                                        int i23 = (i20 == 0 || cM1929Ujhhgtgfeyxiexzf != interfaceC3256feyxiexzfUjhhgtg.mo2609Ujhhgtgfeyxiexzf()) ? i4 : 1;
                                        z2 = i22;
                                        z3 = i23;
                                    }
                                    this.f2761Ujhhgtgfeyxiexzf = i17;
                                    c0656Ujhhgtgfeyxiexzf = new C0656Ujhhgtgfeyxiexzf(i18, z2, z3);
                                }
                                if (c0656Ujhhgtgfeyxiexzf == 0) {
                                    c1964Ujhhgtgfeyxiexzf4 = c1964Ujhhgtgfeyxiexzf5;
                                } else {
                                    int i24 = c0656Ujhhgtgfeyxiexzf.f2764Ujhhgtgfeyxiexzf;
                                    int i25 = this.f2761Ujhhgtgfeyxiexzf;
                                    int i26 = i25 + i24;
                                    this.f2761Ujhhgtgfeyxiexzf = i26;
                                    C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf11 = new C1964Ujhhgtgfeyxiexzf(this.f2760Ujhhgtgfeyxiexzf.substring(i25, i26));
                                    boolean z5 = c0656Ujhhgtgfeyxiexzf.f2766Ujhhgtgfeyxiexzf;
                                    boolean z6 = c0656Ujhhgtgfeyxiexzf.f2765Ujhhgtgfeyxiexzf;
                                    C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg = this.f2762Ujhhgtgfeyxiexzf;
                                    C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg2 = new C3255feyxiexzfUjhhgtg(c1964Ujhhgtgfeyxiexzf11, cM1929Ujhhgtgfeyxiexzf, z5, z6, c3255feyxiexzfUjhhgtg);
                                    this.f2762Ujhhgtgfeyxiexzf = c3255feyxiexzfUjhhgtg2;
                                    c3255feyxiexzfUjhhgtg2.f10214Ujhhgtgfeyxiexzf = i24;
                                    c3255feyxiexzfUjhhgtg2.f10215Ujhhgtgfeyxiexzf = i24;
                                    if (c3255feyxiexzfUjhhgtg != null) {
                                        c3255feyxiexzfUjhhgtg.f10213Ujhhgtgfeyxiexzf = c3255feyxiexzfUjhhgtg2;
                                    }
                                    c1964Ujhhgtgfeyxiexzf4 = c1964Ujhhgtgfeyxiexzf11;
                                }
                            } else {
                                int i27 = this.f2761Ujhhgtgfeyxiexzf;
                                int length = this.f2760Ujhhgtgfeyxiexzf.length();
                                while (true) {
                                    int i28 = this.f2761Ujhhgtgfeyxiexzf;
                                    if (i28 != length) {
                                        if (!this.f2756Ujhhgtgfeyxiexzf.get(this.f2760Ujhhgtgfeyxiexzf.charAt(i28))) {
                                            this.f2761Ujhhgtgfeyxiexzf++;
                                        }
                                    }
                                }
                                int i29 = this.f2761Ujhhgtgfeyxiexzf;
                                if (i27 != i29) {
                                    c1964Ujhhgtgfeyxiexzf4 = new C1964Ujhhgtgfeyxiexzf(this.f2760Ujhhgtgfeyxiexzf.substring(i27, i29));
                                } else {
                                    c1964Ujhhgtgfeyxiexzf4 = c1964Ujhhgtgfeyxiexzf5;
                                }
                            }
                            i = i4;
                            abstractC1286feyxiexzfUjhhgtg2 = c1964Ujhhgtgfeyxiexzf4;
                            break;
                    }
                } else {
                    String strM1927Ujhhgtgfeyxiexzf4 = m1927Ujhhgtgfeyxiexzf(f2749Ujhhgtgfeyxiexzf);
                    if (strM1927Ujhhgtgfeyxiexzf4 == null) {
                        abstractC1286feyxiexzfUjhhgtg4 = null;
                    } else {
                        int i30 = this.f2761Ujhhgtgfeyxiexzf;
                        while (true) {
                            String strM1927Ujhhgtgfeyxiexzf5 = m1927Ujhhgtgfeyxiexzf(f2748Ujhhgtgfeyxiexzf);
                            if (strM1927Ujhhgtgfeyxiexzf5 == null) {
                                this.f2761Ujhhgtgfeyxiexzf = i30;
                                c1964Ujhhgtgfeyxiexzf2 = new C1964Ujhhgtgfeyxiexzf(strM1927Ujhhgtgfeyxiexzf4);
                                abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf2;
                            } else if (strM1927Ujhhgtgfeyxiexzf5.equals(strM1927Ujhhgtgfeyxiexzf4)) {
                                C2865feyxiexzfUjhhgtg c2865feyxiexzfUjhhgtg = new C2865feyxiexzfUjhhgtg();
                                String strReplace = this.f2760Ujhhgtgfeyxiexzf.substring(i30, this.f2761Ujhhgtgfeyxiexzf - strM1927Ujhhgtgfeyxiexzf4.length()).replace('\n', ' ');
                                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                    int length2 = strReplace.length();
                                    if (C3052Ujhhgtgfeyxiexzf.m4531Ujhhgtgfeyxiexzf(' ', 0, length2, strReplace) != length2) {
                                        strReplace = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 1, strReplace);
                                    }
                                }
                                c2865feyxiexzfUjhhgtg.f9124Ujhhgtgfeyxiexzf = strReplace;
                                c1964Ujhhgtgfeyxiexzf3 = c2865feyxiexzfUjhhgtg;
                                abstractC1286feyxiexzfUjhhgtg4 = c1964Ujhhgtgfeyxiexzf3;
                            }
                        }
                    }
                    i = 0;
                    abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg4;
                }
                if (abstractC1286feyxiexzfUjhhgtg2 != null) {
                    abstractC1286feyxiexzfUjhhgtg3 = abstractC1286feyxiexzfUjhhgtg2;
                } else {
                    this.f2761Ujhhgtgfeyxiexzf++;
                    c1964Ujhhgtgfeyxiexzf5 = new C1964Ujhhgtgfeyxiexzf(String.valueOf(cM1929Ujhhgtgfeyxiexzf));
                }
                if (abstractC1286feyxiexzfUjhhgtg3 != null) {
                    m1930Ujhhgtgfeyxiexzf(null);
                    abstractC1286feyxiexzfUjhhgtg5 = abstractC1286feyxiexzfUjhhgtg.f4686Ujhhgtgfeyxiexzf;
                    abstractC1286feyxiexzfUjhhgtg6 = abstractC1286feyxiexzfUjhhgtg.f4687Ujhhgtgfeyxiexzf;
                    if (abstractC1286feyxiexzfUjhhgtg5 == abstractC1286feyxiexzfUjhhgtg6) {
                        return;
                    }
                    m1926Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg5, abstractC1286feyxiexzfUjhhgtg6);
                    return;
                }
                abstractC1286feyxiexzfUjhhgtg.m2848Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg3);
                i4 = i;
                c1964Ujhhgtgfeyxiexzf5 = null;
                abstractC1286feyxiexzfUjhhgtg7 = abstractC1286feyxiexzfUjhhgtg3;
            }
            abstractC1286feyxiexzfUjhhgtg3 = c1964Ujhhgtgfeyxiexzf5;
            if (abstractC1286feyxiexzfUjhhgtg3 != null) {
                m1930Ujhhgtgfeyxiexzf(null);
                abstractC1286feyxiexzfUjhhgtg5 = abstractC1286feyxiexzfUjhhgtg.f4686Ujhhgtgfeyxiexzf;
                abstractC1286feyxiexzfUjhhgtg6 = abstractC1286feyxiexzfUjhhgtg.f4687Ujhhgtgfeyxiexzf;
                if (abstractC1286feyxiexzfUjhhgtg5 == abstractC1286feyxiexzfUjhhgtg6) {
                    return;
                }
                m1926Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg5, abstractC1286feyxiexzfUjhhgtg6);
                return;
            }
            abstractC1286feyxiexzfUjhhgtg.m2848Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg3);
            i4 = i;
            c1964Ujhhgtgfeyxiexzf5 = null;
            abstractC1286feyxiexzfUjhhgtg7 = abstractC1286feyxiexzfUjhhgtg3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final char m1929Ujhhgtgfeyxiexzf() {
        if (this.f2761Ujhhgtgfeyxiexzf < this.f2760Ujhhgtgfeyxiexzf.length()) {
            return this.f2760Ujhhgtgfeyxiexzf.charAt(this.f2761Ujhhgtgfeyxiexzf);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m1930Ujhhgtgfeyxiexzf(C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg) {
        boolean z;
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg;
        HashMap map = new HashMap();
        C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg2 = this.f2762Ujhhgtgfeyxiexzf;
        while (c3255feyxiexzfUjhhgtg2 != null) {
            C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg3 = c3255feyxiexzfUjhhgtg2.f10212Ujhhgtgfeyxiexzf;
            if (c3255feyxiexzfUjhhgtg3 == c3255feyxiexzfUjhhgtg) {
                break;
            } else {
                c3255feyxiexzfUjhhgtg2 = c3255feyxiexzfUjhhgtg3;
            }
        }
        while (c3255feyxiexzfUjhhgtg2 != null) {
            C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf = c3255feyxiexzfUjhhgtg2.f10208Ujhhgtgfeyxiexzf;
            char c = c3255feyxiexzfUjhhgtg2.f10209Ujhhgtgfeyxiexzf;
            InterfaceC3256feyxiexzfUjhhgtg interfaceC3256feyxiexzfUjhhgtg = (InterfaceC3256feyxiexzfUjhhgtg) this.f2758Ujhhgtgfeyxiexzf.get(Character.valueOf(c));
            if (!c3255feyxiexzfUjhhgtg2.f10211Ujhhgtgfeyxiexzf || interfaceC3256feyxiexzfUjhhgtg == null) {
                c3255feyxiexzfUjhhgtg2 = c3255feyxiexzfUjhhgtg2.f10213Ujhhgtgfeyxiexzf;
            } else {
                char cMo2612Ujhhgtgfeyxiexzf = interfaceC3256feyxiexzfUjhhgtg.mo2612Ujhhgtgfeyxiexzf();
                C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg4 = c3255feyxiexzfUjhhgtg2.f10212Ujhhgtgfeyxiexzf;
                int iMo2611Ujhhgtgfeyxiexzf = 0;
                boolean z2 = false;
                while (true) {
                    if (c3255feyxiexzfUjhhgtg4 == null || c3255feyxiexzfUjhhgtg4 == c3255feyxiexzfUjhhgtg || c3255feyxiexzfUjhhgtg4 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (c3255feyxiexzfUjhhgtg4.f10210Ujhhgtgfeyxiexzf && c3255feyxiexzfUjhhgtg4.f10209Ujhhgtgfeyxiexzf == cMo2612Ujhhgtgfeyxiexzf) {
                        iMo2611Ujhhgtgfeyxiexzf = interfaceC3256feyxiexzfUjhhgtg.mo2611Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg4, c3255feyxiexzfUjhhgtg2);
                        z2 = true;
                        if (iMo2611Ujhhgtgfeyxiexzf > 0) {
                            z = true;
                            break;
                        }
                    }
                    c3255feyxiexzfUjhhgtg4 = c3255feyxiexzfUjhhgtg4.f10212Ujhhgtgfeyxiexzf;
                }
                if (z2) {
                    C1964Ujhhgtgfeyxiexzf c1964Ujhhgtgfeyxiexzf2 = c3255feyxiexzfUjhhgtg4.f10208Ujhhgtgfeyxiexzf;
                    c3255feyxiexzfUjhhgtg4.f10214Ujhhgtgfeyxiexzf -= iMo2611Ujhhgtgfeyxiexzf;
                    c3255feyxiexzfUjhhgtg2.f10214Ujhhgtgfeyxiexzf -= iMo2611Ujhhgtgfeyxiexzf;
                    c1964Ujhhgtgfeyxiexzf2.f6440Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(iMo2611Ujhhgtgfeyxiexzf, 0, c1964Ujhhgtgfeyxiexzf2.f6440Ujhhgtgfeyxiexzf);
                    c1964Ujhhgtgfeyxiexzf.f6440Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(iMo2611Ujhhgtgfeyxiexzf, 0, c1964Ujhhgtgfeyxiexzf.f6440Ujhhgtgfeyxiexzf);
                    C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg5 = c3255feyxiexzfUjhhgtg2.f10212Ujhhgtgfeyxiexzf;
                    while (c3255feyxiexzfUjhhgtg5 != null && c3255feyxiexzfUjhhgtg5 != c3255feyxiexzfUjhhgtg4) {
                        C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg6 = c3255feyxiexzfUjhhgtg5.f10212Ujhhgtgfeyxiexzf;
                        m1931Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg5);
                        c3255feyxiexzfUjhhgtg5 = c3255feyxiexzfUjhhgtg6;
                    }
                    if (c1964Ujhhgtgfeyxiexzf2 != c1964Ujhhgtgfeyxiexzf && (abstractC1286feyxiexzfUjhhgtg = c1964Ujhhgtgfeyxiexzf2.f4689Ujhhgtgfeyxiexzf) != c1964Ujhhgtgfeyxiexzf) {
                        m1926Ujhhgtgfeyxiexzf(abstractC1286feyxiexzfUjhhgtg, c1964Ujhhgtgfeyxiexzf.f4688Ujhhgtgfeyxiexzf);
                    }
                    interfaceC3256feyxiexzfUjhhgtg.mo2608Ujhhgtgfeyxiexzf(c1964Ujhhgtgfeyxiexzf2, c1964Ujhhgtgfeyxiexzf, iMo2611Ujhhgtgfeyxiexzf);
                    if (c3255feyxiexzfUjhhgtg4.f10214Ujhhgtgfeyxiexzf == 0) {
                        c3255feyxiexzfUjhhgtg4.f10208Ujhhgtgfeyxiexzf.m2851Ujhhgtgfeyxiexzf();
                        m1931Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg4);
                    }
                    if (c3255feyxiexzfUjhhgtg2.f10214Ujhhgtgfeyxiexzf == 0) {
                        C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg7 = c3255feyxiexzfUjhhgtg2.f10213Ujhhgtgfeyxiexzf;
                        c1964Ujhhgtgfeyxiexzf.m2851Ujhhgtgfeyxiexzf();
                        m1931Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg2);
                        c3255feyxiexzfUjhhgtg2 = c3255feyxiexzfUjhhgtg7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), c3255feyxiexzfUjhhgtg2.f10212Ujhhgtgfeyxiexzf);
                        if (!c3255feyxiexzfUjhhgtg2.f10210Ujhhgtgfeyxiexzf) {
                            m1931Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg2);
                        }
                    }
                    c3255feyxiexzfUjhhgtg2 = c3255feyxiexzfUjhhgtg2.f10213Ujhhgtgfeyxiexzf;
                }
            }
        }
        while (true) {
            C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg8 = this.f2762Ujhhgtgfeyxiexzf;
            if (c3255feyxiexzfUjhhgtg8 == null || c3255feyxiexzfUjhhgtg8 == c3255feyxiexzfUjhhgtg) {
                return;
            } else {
                m1931Ujhhgtgfeyxiexzf(c3255feyxiexzfUjhhgtg8);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1931Ujhhgtgfeyxiexzf(C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg) {
        C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg2 = c3255feyxiexzfUjhhgtg.f10212Ujhhgtgfeyxiexzf;
        if (c3255feyxiexzfUjhhgtg2 != null) {
            c3255feyxiexzfUjhhgtg2.f10213Ujhhgtgfeyxiexzf = c3255feyxiexzfUjhhgtg.f10213Ujhhgtgfeyxiexzf;
        }
        C3255feyxiexzfUjhhgtg c3255feyxiexzfUjhhgtg3 = c3255feyxiexzfUjhhgtg.f10213Ujhhgtgfeyxiexzf;
        if (c3255feyxiexzfUjhhgtg3 == null) {
            this.f2762Ujhhgtgfeyxiexzf = c3255feyxiexzfUjhhgtg2;
        } else {
            c3255feyxiexzfUjhhgtg3.f10212Ujhhgtgfeyxiexzf = c3255feyxiexzfUjhhgtg2;
        }
    }
}
