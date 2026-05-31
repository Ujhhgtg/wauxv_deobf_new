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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1093 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final LinkedHashSet f3920 = new LinkedHashSet(Arrays.asList(C0406.class, C1535.class, C1296.class, C1580.class, C2976.class, AbstractC1831.class, C1639.class));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final Map f3921;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public CharSequence f3922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f3925;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f3929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final List f3930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2135 f3931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final List f3932;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C1092 f3933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final ArrayList f3935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final LinkedHashSet f3936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f3923 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f3924 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3926 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3927 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3928 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final LinkedHashMap f3934 = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(C0406.class, new C0407(0));
        map.put(C1535.class, new C0407(2));
        map.put(C1296.class, new C0407(1));
        map.put(C1580.class, new C0407(3));
        map.put(C2976.class, new C0407(6));
        map.put(AbstractC1831.class, new C0407(5));
        map.put(C1639.class, new C0407(4));
        f3921 = Collections.unmodifiableMap(map);
    }

    public C1093(ArrayList arrayList, C2135 c2135, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f3935 = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f3936 = linkedHashSet;
        this.f3930 = arrayList;
        this.f3931 = c2135;
        this.f3932 = arrayList2;
        C1092 c1092 = new C1092(0);
        this.f3933 = c1092;
        arrayList3.add(c1092);
        linkedHashSet.add(c1092);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2776(AbstractC0061 abstractC0061) {
        while (!m2783().mo1062(abstractC0061.mo1064())) {
            m2780(m2783());
        }
        m2783().mo1064().m4272(abstractC0061.mo1064());
        this.f3935.add(abstractC0061);
        this.f3936.add(abstractC0061);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2777(C2363 c2363) {
        C1818 c1818 = c2363.f7599;
        c1818.m3721();
        for (C1817 c1817 : c1818.f6053) {
            C2362 c2362 = c2363.f7598;
            c1817.m4273();
            AbstractC2254 abstractC2254 = c2362.f7336;
            c1817.f7336 = abstractC2254;
            if (abstractC2254 != null) {
                abstractC2254.f7337 = c1817;
            }
            c1817.f7337 = c2362;
            c2362.f7336 = c1817;
            AbstractC2254 abstractC2255 = c2362.f7333;
            c1817.f7333 = abstractC2255;
            if (c1817.f7336 == null) {
                abstractC2255.f7334 = c1817;
            }
            String str = c1817.f6048;
            LinkedHashMap linkedHashMap = this.f3934;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, c1817);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2778() {
        CharSequence charSequenceSubSequence;
        if (this.f3925) {
            int i = this.f3923 + 1;
            CharSequence charSequence = this.f3922;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.f3924 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f3922;
            charSequenceSubSequence = charSequence2.subSequence(this.f3923, charSequence2.length());
        }
        m2783().mo1061(charSequenceSubSequence);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2779() {
        if (this.f3922.charAt(this.f3923) != '\t') {
            this.f3923++;
            this.f3924++;
        } else {
            this.f3923++;
            int i = this.f3924;
            this.f3924 = (4 - (i % 4)) + i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2780(AbstractC0061 abstractC0061) {
        if (m2783() == abstractC0061) {
            ArrayList arrayList = this.f3935;
            arrayList.remove(arrayList.size() - 1);
        }
        if (abstractC0061 instanceof C2363) {
            m2777((C2363) abstractC0061);
        }
        abstractC0061.mo1063();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2781(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m2780((AbstractC0061) list.get(size));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2782() {
        int i = this.f3923;
        int i2 = this.f3924;
        this.f3929 = true;
        int length = this.f3922.length();
        while (i < length) {
            char cCharAt = this.f3922.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f3929 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f3926 = i;
        this.f3927 = i2;
        this.f3928 = i2 - this.f3924;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0061 m2783() {
        ArrayList arrayList = this.f3935;
        return (AbstractC0061) arrayList.get(arrayList.size() - 1);
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
    /* JADX WARN: Type inference failed for: r22v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᛸᲈᲁ] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2784(String str) {
        AbstractC0061 abstractC0061;
        int i;
        C0411 c0411;
        boolean z;
        char cCharAt;
        int i2;
        C1297 c1297;
        C0411 c0412;
        C1536 c1536;
        int i3;
        StringBuilder sb;
        StringBuilder sb2;
        int i4;
        C1832 c1832;
        char cCharAt2;
        C1832 c1833;
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
        this.f3922 = string;
        this.f3923 = 0;
        this.f3924 = 0;
        this.f3925 = false;
        ArrayList arrayList = this.f3935;
        int i9 = 1;
        for (AbstractC0061 abstractC0062 : arrayList.subList(1, arrayList.size())) {
            m2782();
            C0404 c0404Mo1067 = abstractC0062.mo1067(this);
            if (c0404Mo1067 == null) {
                break;
            }
            if (c0404Mo1067.f1957) {
                m2780(abstractC0062);
                return;
            }
            int i10 = c0404Mo1067.f1955;
            if (i10 != -1) {
                m2786(i10);
            } else {
                int i11 = c0404Mo1067.f1956;
                if (i11 != -1) {
                    m2785(i11);
                }
            }
            i9++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i9, arrayList.size()));
        AbstractC0061 abstractC0063 = (AbstractC0061) arrayList.get(i9 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zMo1065 = (abstractC0063.mo1064() instanceof C2362) || abstractC0063.mo1065();
        while (true) {
            if (zMo1065) {
                m2782();
                if (!this.f3929) {
                    int i12 = 4;
                    if (this.f3928 >= 4 || !Character.isLetter(Character.codePointAt(this.f3922, this.f3926))) {
                        C0102 c0102 = new C0102(abstractC0063, 18);
                        Iterator it = this.f3930.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i = i7;
                                char c = ' ';
                                switch (((C0407) it.next()).f1960) {
                                    case 0:
                                        abstractC0061 = abstractC0063;
                                        int i13 = this.f3926;
                                        if (C0408.m1742(this, i13)) {
                                            int i14 = this.f3924 + this.f3928;
                                            int i15 = i14 + 1;
                                            CharSequence charSequence = this.f3922;
                                            int i16 = i13 + 1;
                                            if (i16 < charSequence.length() && ((cCharAt = charSequence.charAt(i16)) == '\t' || cCharAt == ' ')) {
                                                i15 = i14 + 2;
                                            }
                                            AbstractC0061[] abstractC0061Arr = new AbstractC0061[1];
                                            abstractC0061Arr[i] = new C0408();
                                            c0411 = new C0411(abstractC0061Arr);
                                            c0411.f1969 = i15;
                                        } else {
                                            c0411 = null;
                                        }
                                        break;
                                    case 1:
                                        abstractC0061 = abstractC0063;
                                        int i17 = this.f3928;
                                        if (i17 < 4) {
                                            int i18 = this.f3926;
                                            CharSequence charSequence2 = this.f3922;
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
                                                    c1297 = null;
                                                } else {
                                                    c1297 = new C1297('~', i21, i17);
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
                                                    c1297 = null;
                                                } else {
                                                    c1297 = new C1297('`', i20, i17);
                                                }
                                            } else {
                                                i22 = 3;
                                                if (i21 >= i22) {
                                                    c1297 = null;
                                                } else {
                                                    c1297 = null;
                                                }
                                            }
                                            if (c1297 != null) {
                                                AbstractC0061[] abstractC0061Arr2 = new AbstractC0061[1];
                                                abstractC0061Arr2[i] = c1297;
                                                c0412 = new C0411(abstractC0061Arr2);
                                                c0412.f1968 = i2 + c1297.f4715.f4711;
                                                c0411 = c0412;
                                            }
                                        }
                                        c0411 = null;
                                        break;
                                    case 2:
                                        abstractC0061 = abstractC0063;
                                        if (this.f3928 < 4) {
                                            CharSequence charSequence3 = this.f3922;
                                            int i24 = this.f3926;
                                            int iM3370 = AbstractC1470.m3370('#', i24, charSequence3.length(), charSequence3) - i24;
                                            if (iM3370 == 0 || iM3370 > 6) {
                                                c1536 = null;
                                            } else {
                                                int i25 = i24 + iM3370;
                                                if (i25 >= charSequence3.length()) {
                                                    c1536 = new C1536(iM3370, "");
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
                                                        c1536 = i27 != i26 ? new C1536(iM3370, charSequence3.subSequence(i25, i27 + 1).toString()) : new C1536(iM3370, charSequence3.subSequence(i25, length4 + 1).toString());
                                                    } else {
                                                        c1536 = null;
                                                    }
                                                }
                                            }
                                            if (c1536 != null) {
                                                AbstractC0061[] abstractC0061Arr3 = new AbstractC0061[1];
                                                abstractC0061Arr3[i] = c1536;
                                                c0412 = new C0411(abstractC0061Arr3);
                                                c0412.f1968 = charSequence3.length();
                                            } else {
                                                char cCharAt9 = charSequence3.charAt(i24);
                                                if (cCharAt9 == '-') {
                                                    if (AbstractC1470.m3371(charSequence3, AbstractC1470.m3370('-', i24 + 1, charSequence3.length(), charSequence3), charSequence3.length()) >= charSequence3.length()) {
                                                        i3 = 2;
                                                    } else {
                                                        i3 = i;
                                                    }
                                                } else if (cCharAt9 != '=') {
                                                    i3 = i;
                                                } else if (AbstractC1470.m3371(charSequence3, AbstractC1470.m3370('=', i24 + 1, charSequence3.length(), charSequence3), charSequence3.length()) >= charSequence3.length()) {
                                                    i3 = 1;
                                                } else if (AbstractC1470.m3371(charSequence3, AbstractC1470.m3370('-', i24 + 1, charSequence3.length(), charSequence3), charSequence3.length()) >= charSequence3.length()) {
                                                    i3 = 2;
                                                } else {
                                                    i3 = i;
                                                }
                                                if (i3 > 0) {
                                                    AbstractC0061 abstractC0064 = (AbstractC0061) c0102.f1117;
                                                    if (abstractC0064 instanceof C2363) {
                                                        sb = ((C2363) abstractC0064).f7599.f6052;
                                                        if (sb.length() == 0) {
                                                            sb = null;
                                                        }
                                                    } else {
                                                        sb = null;
                                                    }
                                                    if (sb != null) {
                                                        C1536 c1537 = new C1536(i3, sb.toString());
                                                        AbstractC0061[] abstractC0061Arr4 = new AbstractC0061[1];
                                                        abstractC0061Arr4[i] = c1537;
                                                        c0412 = new C0411(abstractC0061Arr4);
                                                        c0412.f1968 = charSequence3.length();
                                                        c0412.f1970 = true;
                                                    }
                                                }
                                            }
                                            c0411 = c0412;
                                        }
                                        c0411 = null;
                                        break;
                                    case 3:
                                        abstractC0061 = abstractC0063;
                                        int i28 = i12;
                                        int i29 = this.f3926;
                                        CharSequence charSequence4 = this.f3922;
                                        if (this.f3928 >= i28 || charSequence4.charAt(i29) != '<') {
                                            c0411 = null;
                                        } else {
                                            int i30 = 1;
                                            while (true) {
                                                if (i30 > 7) {
                                                    c0411 = null;
                                                } else {
                                                    if (i30 != 7 || !(((AbstractC0061) c0102.f1117).mo1064() instanceof C2362)) {
                                                        Pattern[] patternArr = C1581.f5487[i30];
                                                        Pattern pattern = patternArr[i];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence4.subSequence(i29, charSequence4.length())).find()) {
                                                            AbstractC0061[] abstractC0061Arr5 = new AbstractC0061[1];
                                                            abstractC0061Arr5[i] = new C1581(pattern2);
                                                            c0411 = new C0411(abstractC0061Arr5);
                                                            c0411.f1968 = this.f3923;
                                                            break;
                                                        }
                                                    }
                                                    i30++;
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        abstractC0061 = abstractC0063;
                                        if (this.f3928 < 4) {
                                            c0411 = null;
                                        } else if (this.f3929 || (m2783().mo1064() instanceof C2362)) {
                                            c0411 = null;
                                        } else {
                                            AbstractC0061[] abstractC0061Arr6 = new AbstractC0061[1];
                                            abstractC0061Arr6[i] = new C1536();
                                            c0411 = new C0411(abstractC0061Arr6);
                                            c0411.f1969 = this.f3924 + 4;
                                        }
                                        break;
                                    case 5:
                                        AbstractC0061 abstractC0065 = (AbstractC0061) c0102.f1117;
                                        int i31 = this.f3928;
                                        if (i31 < 4) {
                                            int i32 = this.f3926;
                                            int i33 = this.f3924 + i31;
                                            if (abstractC0065 instanceof C2363) {
                                                sb2 = ((C2363) abstractC0065).f7599.f6052;
                                                if (sb2.length() == 0) {
                                                    sb2 = null;
                                                }
                                            } else {
                                                sb2 = null;
                                            }
                                            int i34 = sb2 != null ? 1 : i;
                                            CharSequence charSequence5 = this.f3922;
                                            char cCharAt10 = charSequence5.charAt(i32);
                                            if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                                i4 = i34;
                                                abstractC0061 = abstractC0063;
                                                int i35 = i32 + 1;
                                                if (i35 >= charSequence5.length() || (cCharAt2 = charSequence5.charAt(i35)) == '\t' || cCharAt2 == ' ') {
                                                    C0489 c0489 = new C0489();
                                                    c0489.f2137 = cCharAt10;
                                                    c1832 = new C1832(c0489, i35);
                                                } else {
                                                    c1832 = null;
                                                }
                                            } else {
                                                int length5 = charSequence5.length();
                                                int i36 = i32;
                                                int i37 = i;
                                                while (true) {
                                                    i4 = i34;
                                                    if (i36 < length5) {
                                                        char cCharAt11 = charSequence5.charAt(i36);
                                                        abstractC0061 = abstractC0063;
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
                                                                        abstractC0063 = abstractC0061;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i37 >= 1 && ((i6 = i36 + 1) >= charSequence5.length() || (cCharAt3 = charSequence5.charAt(i6)) == '\t' || cCharAt3 == ' ')) {
                                                            String string2 = charSequence5.subSequence(i32, i36).toString();
                                                            C2337 c2337 = new C2337();
                                                            c2337.f7542 = Integer.parseInt(string2);
                                                            c2337.f7543 = cCharAt11;
                                                            c1832 = new C1832(c2337, i6);
                                                        }
                                                    } else {
                                                        abstractC0061 = abstractC0063;
                                                    }
                                                    c1832 = null;
                                                }
                                            }
                                            if (c1832 == null) {
                                                c1833 = null;
                                            } else {
                                                AbstractC1831 abstractC1831 = c1832.f6103;
                                                int i38 = c1832.f6104;
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
                                                if (i4 == 0 || ((!(abstractC1831 instanceof C2337) || ((C2337) abstractC1831).f7542 == 1) && i5 != 0)) {
                                                    if (i5 == 0 || i40 - i39 > 4) {
                                                        i40 = i39 + 1;
                                                    }
                                                    c1833 = new C1832(abstractC1831, i40);
                                                } else {
                                                    c1833 = null;
                                                }
                                            }
                                            if (c1833 != null) {
                                                AbstractC1831 abstractC1832 = c1833.f6103;
                                                int i41 = c1833.f6104;
                                                C1839 c1839 = new C1839(i41 - this.f3924);
                                                if (abstractC0065 instanceof C1833) {
                                                    AbstractC1831 abstractC1833 = ((C1833) abstractC0065).f6105;
                                                    if ((abstractC1833 instanceof C0489) && (abstractC1832 instanceof C0489)) {
                                                        zEquals2 = Character.valueOf(((C0489) abstractC1833).f2137).equals(Character.valueOf(((C0489) abstractC1832).f2137));
                                                    } else if ((abstractC1833 instanceof C2337) && (abstractC1832 instanceof C2337)) {
                                                        zEquals = Character.valueOf(((C2337) abstractC1833).f7543).equals(Character.valueOf(((C2337) abstractC1832).f7543));
                                                    } else {
                                                        r4 = i;
                                                    }
                                                    if (r4 == 0) {
                                                        r4 = zEquals;
                                                        r4 = zEquals2;
                                                        C1833 c1834 = new C1833(abstractC1832);
                                                        abstractC1832.f6102 = true;
                                                        AbstractC0061[] abstractC0061Arr7 = new AbstractC0061[2];
                                                        abstractC0061Arr7[i] = c1834;
                                                        abstractC0061Arr7[1] = c1839;
                                                        C0411 c0413 = new C0411(abstractC0061Arr7);
                                                        c0413.f1969 = i41;
                                                        c0411 = c0413;
                                                    } else {
                                                        r4 = zEquals;
                                                        AbstractC0061[] abstractC0061Arr8 = new AbstractC0061[1];
                                                        abstractC0061Arr8[i] = c1839;
                                                        C0411 c0414 = new C0411(abstractC0061Arr8);
                                                        c0414.f1969 = i41;
                                                        c0411 = c0414;
                                                    }
                                                } else {
                                                    r4 = zEquals;
                                                    r4 = zEquals2;
                                                    C1833 c1835 = new C1833(abstractC1832);
                                                    abstractC1832.f6102 = true;
                                                    AbstractC0061[] abstractC0061Arr9 = new AbstractC0061[2];
                                                    abstractC0061Arr9[i] = c1835;
                                                    abstractC0061Arr9[1] = c1839;
                                                    C0411 c0415 = new C0411(abstractC0061Arr9);
                                                    c0415.f1969 = i41;
                                                    c0411 = c0415;
                                                }
                                                break;
                                            }
                                        } else {
                                            abstractC0061 = abstractC0063;
                                        }
                                        c0411 = null;
                                        break;
                                    default:
                                        if (this.f3928 >= i12) {
                                            c0411 = null;
                                        } else {
                                            int i42 = this.f3926;
                                            CharSequence charSequence6 = this.f3922;
                                            int length7 = charSequence6.length();
                                            int i43 = i;
                                            int i44 = i43;
                                            int i45 = i44;
                                            while (true) {
                                                if (i42 >= length7) {
                                                    int i46 = i44;
                                                    int i47 = i45;
                                                    if ((i43 >= 3 && i46 == 0 && i47 == 0) || ((i46 >= 3 && i43 == 0 && i47 == 0) || (i47 >= 3 && i43 == 0 && i46 == 0))) {
                                                        AbstractC0061[] abstractC0061Arr10 = new AbstractC0061[1];
                                                        abstractC0061Arr10[i] = new C1092(1);
                                                        c0411 = new C0411(abstractC0061Arr10);
                                                        c0411.f1968 = charSequence6.length();
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
                                                c0411 = null;
                                            }
                                        }
                                        abstractC0061 = abstractC0063;
                                        break;
                                }
                                if (c0411 != null) {
                                    r4 = zEquals2;
                                } else {
                                    r4 = zEquals2;
                                    i7 = i;
                                    abstractC0063 = abstractC0061;
                                    i12 = 4;
                                }
                            } else {
                                i = i7;
                                abstractC0061 = abstractC0063;
                                c0411 = null;
                            }
                        }
                        if (c0411 == null) {
                            m2786(this.f3926);
                        } else {
                            if (!zIsEmpty) {
                                m2781(arrayList2);
                                zIsEmpty = true;
                            }
                            int i48 = c0411.f1968;
                            if (i48 != -1) {
                                m2786(i48);
                            } else {
                                int i49 = c0411.f1969;
                                if (i49 != -1) {
                                    m2785(i49);
                                }
                            }
                            if (c0411.f1970) {
                                AbstractC0061 abstractC0061M2783 = m2783();
                                z = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.f3936.remove(abstractC0061M2783);
                                if (abstractC0061M2783 instanceof C2363) {
                                    m2777((C2363) abstractC0061M2783);
                                }
                                abstractC0061M2783.mo1064().m4273();
                            } else {
                                z = true;
                            }
                            AbstractC0061[] abstractC0061Arr11 = c0411.f1967;
                            int length8 = abstractC0061Arr11.length;
                            abstractC0063 = abstractC0061;
                            for (int i50 = i; i50 < length8; i50++) {
                                abstractC0063 = abstractC0061Arr11[i50];
                                m2776(abstractC0063);
                                zMo1065 = abstractC0063.mo1065();
                            }
                            i7 = i;
                        }
                    }
                }
                abstractC0061 = abstractC0063;
                m2786(this.f3926);
            } else {
                abstractC0061 = abstractC0063;
            }
            if (!zIsEmpty && !this.f3929) {
                AbstractC0061 abstractC0061M2784 = m2783();
                abstractC0061M2784.getClass();
                if (abstractC0061M2784 instanceof C2363) {
                    m2778();
                    return;
                }
            }
            if (!zIsEmpty) {
                m2781(arrayList2);
            }
            if (!abstractC0061.mo1065()) {
                m2778();
                return;
            } else {
                if (this.f3929) {
                    return;
                }
                m2776(new C2363());
                m2778();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2785(int i) {
        int i2;
        int i3 = this.f3927;
        if (i >= i3) {
            this.f3923 = this.f3926;
            this.f3924 = i3;
        }
        int length = this.f3922.length();
        while (true) {
            i2 = this.f3924;
            if (i2 >= i || this.f3923 == length) {
                break;
            } else {
                m2779();
            }
        }
        if (i2 <= i) {
            this.f3925 = false;
            return;
        }
        this.f3923--;
        this.f3924 = i;
        this.f3925 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2786(int i) {
        int i2 = this.f3926;
        if (i >= i2) {
            this.f3923 = i2;
            this.f3924 = this.f3927;
        }
        int length = this.f3922.length();
        while (true) {
            int i3 = this.f3923;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m2779();
            }
        }
        this.f3925 = false;
    }
}
