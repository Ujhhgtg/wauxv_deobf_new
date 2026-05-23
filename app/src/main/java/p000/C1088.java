package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1088 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final LinkedHashSet f3909 = new LinkedHashSet(Arrays.asList(C0431.class, C1523.class, C1295.class, C1569.class, C2917.class, AbstractC1804.class, C1626.class));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final Map f3910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public CharSequence f3911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f3914;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f3918;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final List f3919;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2102 f3920;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final List f3921;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C1087 f3922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final ArrayList f3924;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final LinkedHashSet f3925;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f3912 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f3913 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3915 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3916 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3917 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final LinkedHashMap f3923 = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(C0431.class, new C0432(0));
        map.put(C1523.class, new C0432(2));
        map.put(C1295.class, new C0432(1));
        map.put(C1569.class, new C0432(3));
        map.put(C2917.class, new C0432(6));
        map.put(AbstractC1804.class, new C0432(5));
        map.put(C1626.class, new C0432(4));
        f3910 = Collections.unmodifiableMap(map);
    }

    public C1088(ArrayList arrayList, C2102 c2102, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f3924 = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f3925 = linkedHashSet;
        this.f3919 = arrayList;
        this.f3920 = c2102;
        this.f3921 = arrayList2;
        C1087 c1087 = new C1087(0);
        this.f3922 = c1087;
        arrayList3.add(c1087);
        linkedHashSet.add(c1087);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2650(AbstractC0054 abstractC0054) {
        while (!m2657().mo918(abstractC0054.mo920())) {
            m2654(m2657());
        }
        m2657().mo920().m4143(abstractC0054.mo920());
        this.f3924.add(abstractC0054);
        this.f3925.add(abstractC0054);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2651(C2323 c2323) {
        C1795 c1795 = c2323.f7461;
        c1795.m3549();
        for (C1794 c1794 : c1795.f5997) {
            C2322 c2322 = c2323.f7460;
            c1794.m4144();
            AbstractC2224 abstractC2224 = c2322.f7221;
            c1794.f7221 = abstractC2224;
            if (abstractC2224 != null) {
                abstractC2224.f7222 = c1794;
            }
            c1794.f7222 = c2322;
            c2322.f7221 = c1794;
            AbstractC2224 abstractC2225 = c2322.f7218;
            c1794.f7218 = abstractC2225;
            if (c1794.f7221 == null) {
                abstractC2225.f7219 = c1794;
            }
            String str = c1794.f5992;
            LinkedHashMap linkedHashMap = this.f3923;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, c1794);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2652() {
        CharSequence charSequenceSubSequence;
        if (this.f3914) {
            int i = this.f3912 + 1;
            CharSequence charSequence = this.f3911;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.f3913 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f3911;
            charSequenceSubSequence = charSequence2.subSequence(this.f3912, charSequence2.length());
        }
        m2657().mo917(charSequenceSubSequence);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2653() {
        if (this.f3911.charAt(this.f3912) != '\t') {
            this.f3912++;
            this.f3913++;
        } else {
            this.f3912++;
            int i = this.f3913;
            this.f3913 = (4 - (i % 4)) + i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2654(AbstractC0054 abstractC0054) {
        if (m2657() == abstractC0054) {
            ArrayList arrayList = this.f3924;
            arrayList.remove(arrayList.size() - 1);
        }
        if (abstractC0054 instanceof C2323) {
            m2651((C2323) abstractC0054);
        }
        abstractC0054.mo919();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2655(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m2654((AbstractC0054) list.get(size));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2656() {
        int i = this.f3912;
        int i2 = this.f3913;
        this.f3918 = true;
        int length = this.f3911.length();
        while (i < length) {
            char cCharAt = this.f3911.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f3918 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f3915 = i;
        this.f3916 = i2;
        this.f3917 = i2 - this.f3913;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0054 m2657() {
        ArrayList arrayList = this.f3924;
        return (AbstractC0054) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0265  */
    /* JADX WARN: Code duplicated, block: B:159:0x0277 A[PHI: r21
      0x0277: PHI (r21v11 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ) = 
      (r21v5 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v6 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v6 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v8 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v8 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v8 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v9 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v9 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v9 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v10 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v10 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v13 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
      (r21v17 ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ)
     binds: [B:299:0x0532, B:267:0x04b9, B:296:0x0514, B:201:0x0387, B:258:0x047f, B:264:0x0496, B:186:0x0332, B:188:0x033a, B:387:0x0277, B:178:0x02fd, B:184:0x0326, B:158:0x0275, B:84:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:242:0x0424  */
    /* JADX WARN: Code duplicated, block: B:254:0x0461  */
    /* JADX WARN: Code duplicated, block: B:256:0x047b  */
    /* JADX WARN: Code duplicated, block: B:257:0x047d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0495  */
    /* JADX WARN: Code duplicated, block: B:295:0x0513  */
    /* JADX WARN: Code duplicated, block: B:89:0x0186  */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x01b6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᲁᲈᛸ] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2658(String str) {
        AbstractC0054 abstractC0054;
        int i;
        C0436 c0436;
        boolean z;
        char cCharAt;
        int i2;
        C1296 c1296;
        C0436 c0437;
        C1524 c1524;
        int i3;
        StringBuilder sb;
        StringBuilder sb2;
        int i4;
        C1805 c1805;
        char cCharAt2;
        C1805 c1806;
        ?? r4;
        boolean zEquals;
        boolean zEquals2;
        int i5;
        int i6;
        char cCharAt3;
        String string = str;
        int length = string.length();
        int i7 = 0;
        StringBuilder sb3 = null;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt4 = string.charAt(i8);
            if (cCharAt4 == 0) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    sb3.append((CharSequence) string, 0, i8);
                }
                sb3.append((char) 65533);
            } else if (sb3 != null) {
                sb3.append(cCharAt4);
            }
        }
        if (sb3 != null) {
            string = sb3.toString();
        }
        this.f3911 = string;
        this.f3912 = 0;
        this.f3913 = 0;
        this.f3914 = false;
        ArrayList arrayList = this.f3924;
        int i9 = 1;
        for (AbstractC0054 abstractC0055 : arrayList.subList(1, arrayList.size())) {
            m2656();
            C0429 c0429Mo923 = abstractC0055.mo923(this);
            if (c0429Mo923 == null) {
                break;
            }
            if (c0429Mo923.f1985) {
                m2654(abstractC0055);
                return;
            }
            int i10 = c0429Mo923.f1983;
            if (i10 != -1) {
                m2660(i10);
            } else {
                int i11 = c0429Mo923.f1984;
                if (i11 != -1) {
                    m2659(i11);
                }
            }
            i9++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i9, arrayList.size()));
        AbstractC0054 abstractC0056 = (AbstractC0054) arrayList.get(i9 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zMo921 = (abstractC0056.mo920() instanceof C2322) || abstractC0056.mo921();
        while (true) {
            if (zMo921) {
                m2656();
                if (!this.f3918) {
                    int i12 = 4;
                    if (this.f3917 >= 4 || !Character.isLetter(Character.codePointAt(this.f3911, this.f3915))) {
                        C0094 c0094 = new C0094(17, abstractC0056);
                        Iterator it = this.f3919.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i = i7;
                                char c = ' ';
                                switch (((C0432) it.next()).f1988) {
                                    case 0:
                                        abstractC0054 = abstractC0056;
                                        int i13 = this.f3915;
                                        if (C0433.m1636(this, i13)) {
                                            int i14 = this.f3913 + this.f3917;
                                            int i15 = i14 + 1;
                                            CharSequence charSequence = this.f3911;
                                            int i16 = i13 + 1;
                                            if (i16 < charSequence.length() && ((cCharAt = charSequence.charAt(i16)) == '\t' || cCharAt == ' ')) {
                                                i15 = i14 + 2;
                                            }
                                            AbstractC0054[] abstractC0054Arr = new AbstractC0054[1];
                                            abstractC0054Arr[i] = new C0433();
                                            c0436 = new C0436(abstractC0054Arr);
                                            c0436.f1997 = i15;
                                        } else {
                                            c0436 = null;
                                        }
                                        break;
                                    case 1:
                                        abstractC0054 = abstractC0056;
                                        int i17 = this.f3917;
                                        if (i17 < 4) {
                                            int i18 = this.f3915;
                                            CharSequence charSequence2 = this.f3911;
                                            int length2 = charSequence2.length();
                                            int i19 = i18;
                                            int i20 = i;
                                            int i21 = i20;
                                            while (true) {
                                                i2 = i18;
                                                if (i19 < length2) {
                                                    char cCharAt5 = charSequence2.charAt(i19);
                                                    if (cCharAt5 == '`') {
                                                        i20++;
                                                    } else if (cCharAt5 == '~') {
                                                        i21++;
                                                    }
                                                    i19++;
                                                    i18 = i2;
                                                }
                                            }
                                            int i22 = 3;
                                            if (i20 < 3) {
                                                if (i21 >= i22 || i20 != 0) {
                                                    c1296 = null;
                                                } else {
                                                    c1296 = new C1296('~', i21, i17);
                                                }
                                            } else if (i21 == 0) {
                                                int i23 = i2 + i20;
                                                int length3 = charSequence2.length();
                                                while (true) {
                                                    if (i23 >= length3) {
                                                        i23 = -1;
                                                    } else if (charSequence2.charAt(i23) != '`') {
                                                        i23++;
                                                    }
                                                }
                                                if (i23 != -1) {
                                                    c1296 = null;
                                                } else {
                                                    c1296 = new C1296('`', i20, i17);
                                                }
                                            } else {
                                                i22 = 3;
                                                if (i21 >= i22) {
                                                    c1296 = null;
                                                } else {
                                                    c1296 = null;
                                                }
                                            }
                                            if (c1296 != null) {
                                                AbstractC0054[] abstractC0054Arr2 = new AbstractC0054[1];
                                                abstractC0054Arr2[i] = c1296;
                                                c0437 = new C0436(abstractC0054Arr2);
                                                c0437.f1996 = i2 + c1296.f4716.f4712;
                                                c0436 = c0437;
                                            }
                                        }
                                        c0436 = null;
                                        break;
                                    case 2:
                                        abstractC0054 = abstractC0056;
                                        if (this.f3917 < 4) {
                                            CharSequence charSequence3 = this.f3911;
                                            int i24 = this.f3915;
                                            int iM5087 = AbstractC3471.m5087('#', i24, charSequence3.length(), charSequence3) - i24;
                                            if (iM5087 == 0 || iM5087 > 6) {
                                                c1524 = null;
                                            } else {
                                                int i25 = i24 + iM5087;
                                                if (i25 >= charSequence3.length()) {
                                                    c1524 = new C1524(iM5087, "");
                                                } else {
                                                    char cCharAt6 = charSequence3.charAt(i25);
                                                    char c2 = ' ';
                                                    char c3 = '\t';
                                                    if (cCharAt6 == ' ' || cCharAt6 == '\t') {
                                                        int length4 = charSequence3.length() - 1;
                                                        while (true) {
                                                            if (length4 < i25) {
                                                                length4 = i25 - 1;
                                                            } else {
                                                                char cCharAt7 = charSequence3.charAt(length4);
                                                                if (cCharAt7 == c3 || cCharAt7 == c2) {
                                                                    length4--;
                                                                    c2 = ' ';
                                                                    c3 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i26 = length4;
                                                        while (true) {
                                                            if (i26 < i25) {
                                                                i26 = i25 - 1;
                                                            } else if (charSequence3.charAt(i26) == '#') {
                                                                i26--;
                                                            }
                                                        }
                                                        int i27 = i26;
                                                        while (true) {
                                                            if (i27 < i25) {
                                                                i27 = i25 - 1;
                                                            } else {
                                                                char cCharAt8 = charSequence3.charAt(i27);
                                                                if (cCharAt8 == '\t' || cCharAt8 == ' ') {
                                                                    i27--;
                                                                }
                                                            }
                                                        }
                                                        c1524 = i27 != i26 ? new C1524(iM5087, charSequence3.subSequence(i25, i27 + 1).toString()) : new C1524(iM5087, charSequence3.subSequence(i25, length4 + 1).toString());
                                                    } else {
                                                        c1524 = null;
                                                    }
                                                }
                                            }
                                            if (c1524 != null) {
                                                AbstractC0054[] abstractC0054Arr3 = new AbstractC0054[1];
                                                abstractC0054Arr3[i] = c1524;
                                                c0437 = new C0436(abstractC0054Arr3);
                                                c0437.f1996 = charSequence3.length();
                                            } else {
                                                char cCharAt9 = charSequence3.charAt(i24);
                                                if (cCharAt9 == '-') {
                                                    if (AbstractC3471.m5089(charSequence3, AbstractC3471.m5087('-', i24 + 1, charSequence3.length(), charSequence3), charSequence3.length()) >= charSequence3.length()) {
                                                        i3 = 2;
                                                    } else {
                                                        i3 = i;
                                                    }
                                                } else if (cCharAt9 != '=') {
                                                    i3 = i;
                                                } else if (AbstractC3471.m5089(charSequence3, AbstractC3471.m5087('=', i24 + 1, charSequence3.length(), charSequence3), charSequence3.length()) >= charSequence3.length()) {
                                                    i3 = 1;
                                                } else if (AbstractC3471.m5089(charSequence3, AbstractC3471.m5087('-', i24 + 1, charSequence3.length(), charSequence3), charSequence3.length()) >= charSequence3.length()) {
                                                    i3 = 2;
                                                } else {
                                                    i3 = i;
                                                }
                                                if (i3 > 0) {
                                                    AbstractC0054 abstractC0057 = (AbstractC0054) c0094.f1049;
                                                    if (abstractC0057 instanceof C2323) {
                                                        sb = ((C2323) abstractC0057).f7461.f5996;
                                                        if (sb.length() == 0) {
                                                            sb = null;
                                                        }
                                                    } else {
                                                        sb = null;
                                                    }
                                                    if (sb != null) {
                                                        C1524 c1525 = new C1524(i3, sb.toString());
                                                        AbstractC0054[] abstractC0054Arr4 = new AbstractC0054[1];
                                                        abstractC0054Arr4[i] = c1525;
                                                        c0437 = new C0436(abstractC0054Arr4);
                                                        c0437.f1996 = charSequence3.length();
                                                        c0437.f1998 = true;
                                                    }
                                                }
                                            }
                                            c0436 = c0437;
                                        }
                                        c0436 = null;
                                        break;
                                    case 3:
                                        abstractC0054 = abstractC0056;
                                        int i28 = i12;
                                        int i29 = this.f3915;
                                        CharSequence charSequence4 = this.f3911;
                                        if (this.f3917 >= i28 || charSequence4.charAt(i29) != '<') {
                                            c0436 = null;
                                        } else {
                                            int i30 = 1;
                                            while (true) {
                                                if (i30 > 7) {
                                                    c0436 = null;
                                                } else {
                                                    if (i30 != 7 || !(((AbstractC0054) c0094.f1049).mo920() instanceof C2322)) {
                                                        Pattern[] patternArr = C1570.f5457[i30];
                                                        Pattern pattern = patternArr[i];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence4.subSequence(i29, charSequence4.length())).find()) {
                                                            AbstractC0054[] abstractC0054Arr5 = new AbstractC0054[1];
                                                            abstractC0054Arr5[i] = new C1570(pattern2);
                                                            c0436 = new C0436(abstractC0054Arr5);
                                                            c0436.f1996 = this.f3912;
                                                            break;
                                                        }
                                                    }
                                                    i30++;
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        abstractC0054 = abstractC0056;
                                        if (this.f3917 < 4) {
                                            c0436 = null;
                                        } else if (this.f3918 || (m2657().mo920() instanceof C2322)) {
                                            c0436 = null;
                                        } else {
                                            AbstractC0054[] abstractC0054Arr6 = new AbstractC0054[1];
                                            abstractC0054Arr6[i] = new C1524();
                                            c0436 = new C0436(abstractC0054Arr6);
                                            c0436.f1997 = this.f3913 + 4;
                                        }
                                        break;
                                    case 5:
                                        AbstractC0054 abstractC0058 = (AbstractC0054) c0094.f1049;
                                        int i31 = this.f3917;
                                        if (i31 < 4) {
                                            int i32 = this.f3915;
                                            int i33 = this.f3913 + i31;
                                            if (abstractC0058 instanceof C2323) {
                                                sb2 = ((C2323) abstractC0058).f7461.f5996;
                                                if (sb2.length() == 0) {
                                                    sb2 = null;
                                                }
                                            } else {
                                                sb2 = null;
                                            }
                                            int i34 = sb2 != null ? 1 : i;
                                            CharSequence charSequence5 = this.f3911;
                                            char cCharAt10 = charSequence5.charAt(i32);
                                            if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                                i4 = i34;
                                                abstractC0054 = abstractC0056;
                                                int i35 = i32 + 1;
                                                if (i35 >= charSequence5.length() || (cCharAt2 = charSequence5.charAt(i35)) == '\t' || cCharAt2 == ' ') {
                                                    C0512 c0512 = new C0512();
                                                    c0512.f2181 = cCharAt10;
                                                    c1805 = new C1805(c0512, i35);
                                                } else {
                                                    c1805 = null;
                                                }
                                            } else {
                                                int length5 = charSequence5.length();
                                                int i36 = i32;
                                                int i37 = i;
                                                while (true) {
                                                    i4 = i34;
                                                    if (i36 < length5) {
                                                        char cCharAt11 = charSequence5.charAt(i36);
                                                        abstractC0054 = abstractC0056;
                                                        if (cCharAt11 != ')' && cCharAt11 != '.') {
                                                            switch (cCharAt11) {
                                                                case '0':
                                                                case '1':
                                                                case Opcodes.AALOAD /* 50 */:
                                                                case Opcodes.BALOAD /* 51 */:
                                                                case '4':
                                                                case Opcodes.SALOAD /* 53 */:
                                                                case Opcodes.ISTORE /* 54 */:
                                                                case Opcodes.LSTORE /* 55 */:
                                                                case Opcodes.FSTORE /* 56 */:
                                                                case Opcodes.DSTORE /* 57 */:
                                                                    i37++;
                                                                    if (i37 <= 9) {
                                                                        i36++;
                                                                        i34 = i4;
                                                                        abstractC0056 = abstractC0054;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i37 >= 1 && ((i6 = i36 + 1) >= charSequence5.length() || (cCharAt3 = charSequence5.charAt(i6)) == '\t' || cCharAt3 == ' ')) {
                                                            String string2 = charSequence5.subSequence(i32, i36).toString();
                                                            C2304 c2304 = new C2304();
                                                            c2304.f7420 = Integer.parseInt(string2);
                                                            c2304.f7421 = cCharAt11;
                                                            c1805 = new C1805(c2304, i6);
                                                        }
                                                    } else {
                                                        abstractC0054 = abstractC0056;
                                                    }
                                                    c1805 = null;
                                                }
                                            }
                                            if (c1805 == null) {
                                                c1806 = null;
                                            } else {
                                                AbstractC1804 abstractC1804 = c1805.f6028;
                                                int i38 = c1805.f6029;
                                                int i39 = (i38 - i32) + i33;
                                                int length6 = charSequence5.length();
                                                int i40 = i39;
                                                while (true) {
                                                    if (i38 >= length6) {
                                                        i5 = i;
                                                    } else {
                                                        char cCharAt12 = charSequence5.charAt(i38);
                                                        if (cCharAt12 == '\t') {
                                                            i40 = (4 - (i40 % 4)) + i40;
                                                        } else if (cCharAt12 == ' ') {
                                                            i40++;
                                                        } else {
                                                            i5 = 1;
                                                        }
                                                        i38++;
                                                    }
                                                }
                                                if (i4 == 0 || ((!(abstractC1804 instanceof C2304) || ((C2304) abstractC1804).f7420 == 1) && i5 != 0)) {
                                                    if (i5 == 0 || i40 - i39 > 4) {
                                                        i40 = i39 + 1;
                                                    }
                                                    c1806 = new C1805(abstractC1804, i40);
                                                } else {
                                                    c1806 = null;
                                                }
                                            }
                                            if (c1806 != null) {
                                                AbstractC1804 abstractC1805 = c1806.f6028;
                                                int i41 = c1806.f6029;
                                                C1812 c1812 = new C1812(i41 - this.f3913);
                                                if (abstractC0058 instanceof C1806) {
                                                    AbstractC1804 abstractC1806 = ((C1806) abstractC0058).f6030;
                                                    if ((abstractC1806 instanceof C0512) && (abstractC1805 instanceof C0512)) {
                                                        zEquals2 = Character.valueOf(((C0512) abstractC1806).f2181).equals(Character.valueOf(((C0512) abstractC1805).f2181));
                                                    } else if ((abstractC1806 instanceof C2304) && (abstractC1805 instanceof C2304)) {
                                                        zEquals = Character.valueOf(((C2304) abstractC1806).f7421).equals(Character.valueOf(((C2304) abstractC1805).f7421));
                                                    } else {
                                                        r4 = i;
                                                    }
                                                    if (r4 == 0) {
                                                        r4 = zEquals;
                                                        r4 = zEquals2;
                                                        C1806 c1807 = new C1806(abstractC1805);
                                                        abstractC1805.f6027 = true;
                                                        AbstractC0054[] abstractC0054Arr7 = new AbstractC0054[2];
                                                        abstractC0054Arr7[i] = c1807;
                                                        abstractC0054Arr7[1] = c1812;
                                                        C0436 c0438 = new C0436(abstractC0054Arr7);
                                                        c0438.f1997 = i41;
                                                        c0436 = c0438;
                                                    } else {
                                                        r4 = zEquals;
                                                        AbstractC0054[] abstractC0054Arr8 = new AbstractC0054[1];
                                                        abstractC0054Arr8[i] = c1812;
                                                        C0436 c0439 = new C0436(abstractC0054Arr8);
                                                        c0439.f1997 = i41;
                                                        c0436 = c0439;
                                                    }
                                                } else {
                                                    r4 = zEquals;
                                                    r4 = zEquals2;
                                                    C1806 c1808 = new C1806(abstractC1805);
                                                    abstractC1805.f6027 = true;
                                                    AbstractC0054[] abstractC0054Arr9 = new AbstractC0054[2];
                                                    abstractC0054Arr9[i] = c1808;
                                                    abstractC0054Arr9[1] = c1812;
                                                    C0436 c04310 = new C0436(abstractC0054Arr9);
                                                    c04310.f1997 = i41;
                                                    c0436 = c04310;
                                                }
                                                break;
                                            }
                                        } else {
                                            abstractC0054 = abstractC0056;
                                        }
                                        c0436 = null;
                                        break;
                                    default:
                                        if (this.f3917 >= i12) {
                                            c0436 = null;
                                        } else {
                                            int i42 = this.f3915;
                                            CharSequence charSequence6 = this.f3911;
                                            int length7 = charSequence6.length();
                                            int i43 = i;
                                            int i44 = i43;
                                            int i45 = i44;
                                            while (true) {
                                                if (i42 >= length7) {
                                                    int i46 = i44;
                                                    int i47 = i45;
                                                    if ((i43 >= 3 && i46 == 0 && i47 == 0) || ((i46 >= 3 && i43 == 0 && i47 == 0) || (i47 >= 3 && i43 == 0 && i46 == 0))) {
                                                        AbstractC0054[] abstractC0054Arr10 = new AbstractC0054[1];
                                                        abstractC0054Arr10[i] = new C1087(1);
                                                        c0436 = new C0436(abstractC0054Arr10);
                                                        c0436.f1996 = charSequence6.length();
                                                    }
                                                } else {
                                                    char cCharAt13 = charSequence6.charAt(i42);
                                                    if (cCharAt13 == '\t' || cCharAt13 == c) {
                                                        i44 = i44;
                                                        i45 = i45;
                                                    } else if (cCharAt13 == '*') {
                                                        i45++;
                                                    } else if (cCharAt13 == '-') {
                                                        i43++;
                                                    } else if (cCharAt13 == '_') {
                                                        i44++;
                                                    }
                                                    i42++;
                                                    c = ' ';
                                                }
                                                c0436 = null;
                                            }
                                        }
                                        abstractC0054 = abstractC0056;
                                        break;
                                }
                                if (c0436 != null) {
                                    r4 = zEquals2;
                                } else {
                                    r4 = zEquals2;
                                    i7 = i;
                                    abstractC0056 = abstractC0054;
                                    i12 = 4;
                                }
                            } else {
                                i = i7;
                                abstractC0054 = abstractC0056;
                                c0436 = null;
                            }
                        }
                        if (c0436 == null) {
                            m2660(this.f3915);
                        } else {
                            if (!zIsEmpty) {
                                m2655(arrayList2);
                                zIsEmpty = true;
                            }
                            int i48 = c0436.f1996;
                            if (i48 != -1) {
                                m2660(i48);
                            } else {
                                int i49 = c0436.f1997;
                                if (i49 != -1) {
                                    m2659(i49);
                                }
                            }
                            if (c0436.f1998) {
                                AbstractC0054 abstractC0054M2657 = m2657();
                                z = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.f3925.remove(abstractC0054M2657);
                                if (abstractC0054M2657 instanceof C2323) {
                                    m2651((C2323) abstractC0054M2657);
                                }
                                abstractC0054M2657.mo920().m4144();
                            } else {
                                z = true;
                            }
                            AbstractC0054[] abstractC0054Arr11 = c0436.f1995;
                            int length8 = abstractC0054Arr11.length;
                            abstractC0056 = abstractC0054;
                            for (int i50 = i; i50 < length8; i50++) {
                                abstractC0056 = abstractC0054Arr11[i50];
                                m2650(abstractC0056);
                                zMo921 = abstractC0056.mo921();
                            }
                            i7 = i;
                        }
                    }
                }
                abstractC0054 = abstractC0056;
                m2660(this.f3915);
            } else {
                abstractC0054 = abstractC0056;
            }
            if (!zIsEmpty && !this.f3918) {
                AbstractC0054 abstractC0054M2658 = m2657();
                abstractC0054M2658.getClass();
                if (abstractC0054M2658 instanceof C2323) {
                    m2652();
                    return;
                }
            }
            if (!zIsEmpty) {
                m2655(arrayList2);
            }
            if (!abstractC0054.mo921()) {
                m2652();
                return;
            } else {
                if (this.f3918) {
                    return;
                }
                m2650(new C2323());
                m2652();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2659(int i) {
        int i2;
        int i3 = this.f3916;
        if (i >= i3) {
            this.f3912 = this.f3915;
            this.f3913 = i3;
        }
        int length = this.f3911.length();
        while (true) {
            i2 = this.f3913;
            if (i2 >= i || this.f3912 == length) {
                break;
            } else {
                m2653();
            }
        }
        if (i2 <= i) {
            this.f3914 = false;
            return;
        }
        this.f3912--;
        this.f3913 = i;
        this.f3914 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2660(int i) {
        int i2 = this.f3915;
        if (i >= i2) {
            this.f3912 = i2;
            this.f3913 = this.f3916;
        }
        int length = this.f3911.length();
        while (true) {
            int i3 = this.f3912;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m2653();
            }
        }
        this.f3914 = false;
    }
}
