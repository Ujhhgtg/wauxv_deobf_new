package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0146 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1148;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f1149;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Object f1154;

    public C0146(View view) {
        C0216 c0216;
        this.f1148 = 1;
        this.f1149 = -1;
        this.f1150 = view;
        PorterDuff.Mode mode = C0216.f1336;
        synchronized (C0216.class) {
            try {
                if (C0216.f1337 == null) {
                    C0216.m1250();
                }
                c0216 = C0216.f1337;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1151 = c0216;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m1151(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static /* synthetic */ void m1152(C0146 c0146, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = c0146.f1149;
        }
        c0146.m1169(i, str, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public String toString() {
        switch (this.f1148) {
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f1154);
                sb.append("', currentPosition=");
                return AbstractC2784.m4750(sb, this.f1149, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int m1153(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f1153).append((char) (m1171(i + 3, charSequence) + (m1171(i, charSequence) << 12) + (m1171(i + 1, charSequence) << 8) + (m1171(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f1149 = i;
        if (i2 < charSequence.length()) {
            return m1153(this.f1149, charSequence);
        }
        m1152(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1154() {
        View view = (View) this.f1150;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C3402) this.f1152) != null) {
                if (((C3402) this.f1154) == null) {
                    this.f1154 = new C3402();
                }
                C3402 c3402 = (C3402) this.f1154;
                c3402.f10726 = null;
                c3402.f10729 = false;
                c3402.f10727 = null;
                c3402.f10728 = false;
                Field field = AbstractC3578.f11184;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c3402.f10729 = true;
                    c3402.f10726 = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c3402.f10728 = true;
                    c3402.f10727 = backgroundTintMode;
                }
                if (c3402.f10729 || c3402.f10728) {
                    C0216.m1251(background, c3402, view.getDrawableState());
                    return;
                }
            }
            C3402 c3403 = (C3402) this.f1153;
            if (c3403 != null) {
                C0216.m1251(background, c3403, view.getDrawableState());
                return;
            }
            C3402 c3404 = (C3402) this.f1152;
            if (c3404 != null) {
                C0216.m1251(background, c3404, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean m1155() {
        int i = this.f1149;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f1154;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1149 = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f1149 = i;
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean m1156(int i) {
        ArrayList arrayList = (ArrayList) this.f1152;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0145 c0145 = (C0145) arrayList.get(i2);
            int i3 = c0145.f1144;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0145.f1145;
                    int i5 = c0145.f1147 + i4;
                    while (i4 < i5) {
                        if (m1170(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m1170(c0145.f1147, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m1157(int i, String str) {
        String str2 = (String) this.f1154;
        if (str2.length() - i < str.length()) {
            m1152(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m1152(this, "Expected valid boolean literal prefix, but had '" + m1165() + '\'', 0, 6);
                throw null;
            }
        }
        this.f1149 = str.length() + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String m1158() {
        String string;
        StringBuilder sb = (StringBuilder) this.f1153;
        String str = (String) this.f1154;
        m1161('\"');
        int i = this.f1149;
        int iM4833 = AbstractC2841.m4833('\"', i, 4, str);
        if (iM4833 == -1) {
            m1165();
            int i2 = this.f1149;
            m1152(this, AbstractC1194.m2785("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM4833) {
            if (str.charAt(i3) == '\\') {
                int iM1183 = this.f1149;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM1183, i3);
                        int iM1184 = m1183(i3 + 1);
                        if (iM1184 == -1) {
                            m1152(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM1153 = iM1184 + 1;
                        char cCharAt2 = str.charAt(iM1184);
                        if (cCharAt2 == 'u') {
                            iM1153 = m1153(iM1153, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C0594.f2402[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m1152(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM1183 = m1183(iM1153);
                        if (iM1183 == -1) {
                            m1152(this, "Unexpected EOF", iM1183, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM1183, i3);
                            iM1183 = m1183(i3);
                            if (iM1183 == -1) {
                                m1152(this, "Unexpected EOF", iM1183, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iM1183;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM1183, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM1183, i3).toString();
                }
                this.f1149 = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f1149 = iM4833 + 1;
        return str.substring(i, iM4833);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte m1159() {
        String str = (String) this.f1154;
        int i = this.f1149;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1149 = i2;
                return AbstractC1460.m3207(cCharAt);
            }
            i = i2;
        }
        this.f1149 = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte m1160(byte b) {
        String str = (String) this.f1154;
        byte bM1159 = m1159();
        if (bM1159 == b) {
            return bM1159;
        }
        String strM3221 = AbstractC1460.m3221(b);
        int i = this.f1149;
        int i2 = i > 0 ? i - 1 : i;
        m1152(this, "Expected " + strM3221 + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, 4);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m1161(char c) {
        int i = this.f1149;
        if (i == -1) {
            m1190(c);
            throw null;
        }
        String str = (String) this.f1154;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1149 = i2;
                if (cCharAt == c) {
                    return;
                }
                m1190(c);
                throw null;
            }
            i = i2;
        }
        this.f1149 = -1;
        m1190(c);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public long m1162() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iM1183 = m1183(m1188());
        String str = (String) this.f1154;
        if (iM1183 >= str.length() || iM1183 == -1) {
            m1152(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1183) == '\"') {
            iM1183++;
            if (iM1183 == str.length()) {
                m1152(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iM1183;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            j3 = j3;
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                z2 = z;
                if (cCharAt == '-' && z4) {
                    if (i == iM1183) {
                        m1152(this, "Unexpected symbol '-' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    if (cCharAt != '-') {
                        if (AbstractC1460.m3207(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m1152(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * ((long) 10)) + ((long) i3);
                        } else {
                            j4 = (j4 * ((long) 10)) - ((long) i3);
                            if (j4 > j3) {
                                m1152(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                        }
                        z = z2;
                        i = i2;
                    } else {
                        if (i != iM1183) {
                            m1152(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = true;
                    }
                } else {
                    if (i == iM1183) {
                        m1152(this, "Unexpected symbol '+' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = true;
                }
            } else {
                if (i == iM1183) {
                    m1152(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                    throw null;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iM1183;
        if (iM1183 == i || (z5 && iM1183 == i - 1)) {
            m1152(this, "Expected numeric literal", i, 4);
            throw null;
        }
        if (z2) {
            if (!z6) {
                m1152(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m1152(this, "Expected closing quotation mark", i, 4);
                throw null;
            }
            i++;
        }
        this.f1149 = i;
        long j5 = j4;
        if (z4) {
            double d = j5;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    throw new C0761();
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m1152(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m1152(this, "Can't convert " + d2 + " to Long", 0, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j5;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        m1152(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m1163() {
        ArrayList arrayList = (ArrayList) this.f1152;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2481) this.f1153).m4433((C0145) arrayList.get(i));
        }
        m1184(arrayList);
        this.f1149 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String m1164() {
        String str = (String) this.f1152;
        if (str == null) {
            return m1158();
        }
        this.f1152 = null;
        return str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public String m1165() {
        String string;
        StringBuilder sb = (StringBuilder) this.f1153;
        String str = (String) this.f1154;
        String str2 = (String) this.f1152;
        if (str2 != null) {
            this.f1152 = null;
            return str2;
        }
        int iM1188 = m1188();
        if (iM1188 >= str.length() || iM1188 == -1) {
            m1152(this, "EOF", iM1188, 4);
            throw null;
        }
        byte bM3207 = AbstractC1460.m3207(str.charAt(iM1188));
        if (bM3207 == 1) {
            return m1164();
        }
        if (bM3207 != 0) {
            m1152(this, "Expected beginning of the string, but got " + str.charAt(iM1188), 0, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC1460.m3207(str.charAt(iM1188)) == 0) {
            iM1188++;
            if (iM1188 >= str.length()) {
                sb.append((CharSequence) str, this.f1149, iM1188);
                int iM1183 = m1183(iM1188);
                if (iM1183 == -1) {
                    this.f1149 = iM1188;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM1188 = iM1183;
                z = true;
            }
        }
        if (z) {
            sb.append((CharSequence) str, this.f1149, iM1188);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(this.f1149, iM1188).toString();
        }
        this.f1149 = iM1188;
        return string;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1166() {
        C2481 c2481 = (C2481) this.f1153;
        m1163();
        ArrayList arrayList = (ArrayList) this.f1151;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0145 c0145 = (C0145) arrayList.get(i);
            int i2 = c0145.f1144;
            if (i2 == 1) {
                c2481.m4433(c0145);
                c2481.m4436(c0145.f1145, c0145.f1147);
            } else if (i2 == 2) {
                c2481.m4433(c0145);
                int i3 = c0145.f1145;
                int i4 = c0145.f1147;
                RecyclerView recyclerView = c2481.f7925;
                recyclerView.m238(i3, i4, true);
                recyclerView.f414 = true;
                recyclerView.f411.f7986 += i4;
            } else if (i2 == 4) {
                c2481.m4433(c0145);
                c2481.m4435(c0145.f1145, c0145.f1147, c0145.f1146);
            } else if (i2 == 8) {
                c2481.m4433(c0145);
                c2481.m4437(c0145.f1145, c0145.f1147);
            }
        }
        m1184(arrayList);
        this.f1149 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m1167(C0145 c0145) {
        int i;
        C2379 c2379 = (C2379) this.f1150;
        int i2 = c0145.f1144;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM1191 = m1191(c0145.f1145, i2);
        int i3 = c0145.f1145;
        int i4 = c0145.f1144;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0145);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0145.f1147; i6++) {
            int iM1192 = m1191((i * i6) + c0145.f1145, c0145.f1144);
            int i7 = c0145.f1144;
            if (i7 == 2 ? iM1192 != iM1191 : !(i7 == 4 && iM1192 == iM1191 + 1)) {
                C0145 c0145M1176 = m1176(c0145.f1146, i7, iM1191, i5);
                m1168(c0145M1176, i3);
                c0145M1176.f1146 = null;
                c2379.mo1311(c0145M1176);
                if (c0145.f1144 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM1191 = iM1192;
            } else {
                i5++;
            }
        }
        Object obj = c0145.f1146;
        c0145.f1146 = null;
        c2379.mo1311(c0145);
        if (i5 > 0) {
            C0145 c0145M1177 = m1176(obj, c0145.f1144, iM1191, i5);
            m1168(c0145M1177, i3);
            c0145M1177.f1146 = null;
            c2379.mo1311(c0145M1177);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public void m1168(C0145 c0145, int i) {
        C2481 c2481 = (C2481) this.f1153;
        c2481.m4433(c0145);
        int i2 = c0145.f1144;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c2481.m4435(i, c0145.f1147, c0145.f1146);
        } else {
            int i3 = c0145.f1147;
            RecyclerView recyclerView = c2481.f7925;
            recyclerView.m238(i, i3, true);
            recyclerView.f414 = true;
            recyclerView.f411.f7986 += i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m1169(int i, String str, String str2) {
        String strM2054 = ((C0662) this.f1151).m2054();
        String str3 = (String) this.f1154;
        ((C1227) this.f1150).getClass();
        throw new C1713(AbstractC3681.m5327(i, str, strM2054, str2, AbstractC3681.m5333(i, str3).toString()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int m1170(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f1152;
        int size = arrayList.size();
        while (i2 < size) {
            C0145 c0145 = (C0145) arrayList.get(i2);
            int i3 = c0145.f1144;
            if (i3 == 8) {
                int i4 = c0145.f1145;
                if (i4 == i) {
                    i = c0145.f1147;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0145.f1147 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0145.f1145;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0145.f1147;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0145.f1147;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int m1171(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m1152(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ColorStateList m1172() {
        C3402 c3402 = (C3402) this.f1153;
        if (c3402 != null) {
            return c3402.f10726;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public PorterDuff.Mode m1173() {
        C3402 c3402 = (C3402) this.f1153;
        if (c3402 != null) {
            return c3402.f10727;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean m1174() {
        return ((ArrayList) this.f1151).size() > 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void m1175(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM4590;
        View view = (View) this.f1150;
        Context context = view.getContext();
        int[] iArr = AbstractC2470.f7897;
        C0243 c0243M1307 = C0243.m1307(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
        View view2 = (View) this.f1150;
        AbstractC3578.m5176(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0243M1307.f1404, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f1149 = typedArray.getResourceId(0, -1);
                C0216 c0216 = (C0216) this.f1151;
                Context context2 = view.getContext();
                int i2 = this.f1149;
                synchronized (c0216) {
                    colorStateListM4590 = c0216.f1338.m4590(context2, i2);
                }
                if (colorStateListM4590 != null) {
                    m1185(colorStateListM4590);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c0243M1307.m1319(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC1105.m2676(typedArray.getInt(2, -1), null));
            }
            c0243M1307.m1329();
        } catch (Throwable th) {
            c0243M1307.m1329();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C0145 m1176(Object obj, int i, int i2, int i3) {
        C0145 c0145 = (C0145) ((C2379) this.f1150).mo1312();
        if (c0145 != null) {
            c0145.f1144 = i;
            c0145.f1145 = i2;
            c0145.f1147 = i3;
            c0145.f1146 = obj;
            return c0145;
        }
        C0145 c0146 = new C0145();
        c0146.f1144 = i;
        c0146.f1145 = i2;
        c0146.f1147 = i3;
        c0146.f1146 = obj;
        return c0146;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m1177() {
        this.f1149 = -1;
        m1185(null);
        m1154();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public void m1178(int i) {
        ColorStateList colorStateListM4590;
        this.f1149 = i;
        C0216 c0216 = (C0216) this.f1151;
        if (c0216 != null) {
            Context context = ((View) this.f1150).getContext();
            synchronized (c0216) {
                colorStateListM4590 = c0216.f1338.m4590(context, i);
            }
        } else {
            colorStateListM4590 = null;
        }
        m1185(colorStateListM4590);
        m1154();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public void m1179() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.f1152;
        StringBuffer stringBuffer2 = (StringBuffer) this.f1151;
        Writer writer = (Writer) this.f1150;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f1149 - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public byte m1180() {
        String str = (String) this.f1154;
        int i = this.f1149;
        while (true) {
            int iM1183 = m1183(i);
            if (iM1183 == -1) {
                this.f1149 = iM1183;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM1183);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1149 = iM1183;
                return AbstractC1460.m3207(cCharAt);
            }
            i = iM1183 + 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public void m1181(C0145 c0145) {
        C2481 c2481 = (C2481) this.f1153;
        ((ArrayList) this.f1152).add(c0145);
        int i = c0145.f1144;
        if (i == 1) {
            c2481.m4436(c0145.f1145, c0145.f1147);
            return;
        }
        if (i == 2) {
            int i2 = c0145.f1145;
            int i3 = c0145.f1147;
            RecyclerView recyclerView = c2481.f7925;
            recyclerView.m238(i2, i3, false);
            recyclerView.f414 = true;
            return;
        }
        if (i == 4) {
            c2481.m4435(c0145.f1145, c0145.f1147, c0145.f1146);
        } else if (i == 8) {
            c2481.m4437(c0145.f1145, c0145.f1147);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0145);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public void m1182() {
        boolean z;
        byte b;
        C0145 c0145M1176;
        int i;
        int i2;
        int i3;
        C0145 c0145M1177;
        boolean z2;
        boolean z3;
        Object obj;
        C0145 c0145;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C2379 c2379 = (C2379) this.f1150;
        C2481 c2481 = (C2481) this.f1153;
        C1744 c1744 = (C1744) this.f1154;
        ArrayList arrayList = (ArrayList) this.f1151;
        c1744.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0145) arrayList.get(size)).f1144 == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            C0146 c0146 = (C0146) c1744.f5843;
            C2379 c23710 = (C2379) c0146.f1150;
            C0145 c0147 = (C0145) arrayList.get(size);
            C0145 c0148 = (C0145) arrayList.get(i12);
            int i13 = c0148.f1144;
            if (i13 == 1) {
                int i14 = c0147.f1147;
                int i15 = c0148.f1145;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = c0147.f1145;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    c0147.f1145 = i17 + c0148.f1147;
                }
                int i18 = c0148.f1145;
                if (i18 <= i14) {
                    c0147.f1147 = i14 + c0148.f1147;
                }
                c0148.f1145 = i18 + i16;
                arrayList.set(size, c0148);
                arrayList.set(i12, c0147);
            } else if (i13 == 2) {
                int i19 = c0147.f1145;
                int i20 = c0147.f1147;
                if (i19 < i20) {
                    if (c0148.f1145 == i19 && c0148.f1147 == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (c0148.f1145 == i20 + 1 && c0148.f1147 == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = c0148.f1145;
                if (i20 < i21) {
                    c0148.f1145 = i21 - 1;
                } else {
                    int i22 = c0148.f1147;
                    if (i20 < i21 + i22) {
                        c0148.f1147 = i22 - 1;
                        c0147.f1144 = 2;
                        c0147.f1147 = 1;
                        if (c0148.f1147 == 0) {
                            arrayList.remove(i12);
                            c0148.f1146 = null;
                            c23710.mo1311(c0148);
                        }
                    }
                }
                int i23 = c0147.f1145;
                int i24 = c0148.f1145;
                if (i23 <= i24) {
                    c0148.f1145 = i24 + 1;
                } else {
                    int i25 = i24 + c0148.f1147;
                    if (i23 < i25) {
                        obj = null;
                        C0145 c0145M1178 = c0146.m1176(null, 2, i23 + 1, i25 - i23);
                        c0148.f1147 = c0147.f1145 - c0148.f1145;
                        c0145 = c0145M1178;
                    }
                    if (z3) {
                        arrayList.set(size, c0148);
                        arrayList.remove(i12);
                        c0147.f1146 = obj;
                        c23710.mo1311(c0147);
                    } else {
                        if (z2) {
                            if (c0145 != null) {
                                i10 = c0147.f1145;
                                if (i10 > c0145.f1145) {
                                    c0147.f1145 = i10 - c0145.f1147;
                                }
                                i11 = c0147.f1147;
                                if (i11 > c0145.f1145) {
                                    c0147.f1147 = i11 - c0145.f1147;
                                }
                            }
                            i8 = c0147.f1145;
                            if (i8 > c0148.f1145) {
                                c0147.f1145 = i8 - c0148.f1147;
                            }
                            i9 = c0147.f1147;
                            if (i9 > c0148.f1145) {
                                c0147.f1147 = i9 - c0148.f1147;
                            }
                        } else {
                            if (c0145 != null) {
                                i6 = c0147.f1145;
                                if (i6 >= c0145.f1145) {
                                    c0147.f1145 = i6 - c0145.f1147;
                                }
                                i7 = c0147.f1147;
                                if (i7 >= c0145.f1145) {
                                    c0147.f1147 = i7 - c0145.f1147;
                                }
                            }
                            i4 = c0147.f1145;
                            if (i4 >= c0148.f1145) {
                                c0147.f1145 = i4 - c0148.f1147;
                            }
                            i5 = c0147.f1147;
                            if (i5 >= c0148.f1145) {
                                c0147.f1147 = i5 - c0148.f1147;
                            }
                        }
                        arrayList.set(size, c0148);
                        if (c0147.f1145 != c0147.f1147) {
                            arrayList.set(i12, c0147);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (c0145 != null) {
                            arrayList.add(size, c0145);
                        }
                    }
                }
                obj = null;
                c0145 = null;
                if (z3) {
                    arrayList.set(size, c0148);
                    arrayList.remove(i12);
                    c0147.f1146 = obj;
                    c23710.mo1311(c0147);
                } else {
                    if (z2) {
                        if (c0145 != null) {
                            i10 = c0147.f1145;
                            if (i10 > c0145.f1145) {
                                c0147.f1145 = i10 - c0145.f1147;
                            }
                            i11 = c0147.f1147;
                            if (i11 > c0145.f1145) {
                                c0147.f1147 = i11 - c0145.f1147;
                            }
                        }
                        i8 = c0147.f1145;
                        if (i8 > c0148.f1145) {
                            c0147.f1145 = i8 - c0148.f1147;
                        }
                        i9 = c0147.f1147;
                        if (i9 > c0148.f1145) {
                            c0147.f1147 = i9 - c0148.f1147;
                        }
                    } else {
                        if (c0145 != null) {
                            i6 = c0147.f1145;
                            if (i6 >= c0145.f1145) {
                                c0147.f1145 = i6 - c0145.f1147;
                            }
                            i7 = c0147.f1147;
                            if (i7 >= c0145.f1145) {
                                c0147.f1147 = i7 - c0145.f1147;
                            }
                        }
                        i4 = c0147.f1145;
                        if (i4 >= c0148.f1145) {
                            c0147.f1145 = i4 - c0148.f1147;
                        }
                        i5 = c0147.f1147;
                        if (i5 >= c0148.f1145) {
                            c0147.f1147 = i5 - c0148.f1147;
                        }
                    }
                    arrayList.set(size, c0148);
                    if (c0147.f1145 != c0147.f1147) {
                        arrayList.set(i12, c0147);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (c0145 != null) {
                        arrayList.add(size, c0145);
                    }
                }
            } else if (i13 == 4) {
                int i26 = c0147.f1147;
                int i27 = c0148.f1145;
                if (i26 < i27) {
                    c0148.f1145 = i27 - 1;
                } else {
                    int i28 = c0148.f1147;
                    if (i26 < i27 + i28) {
                        c0148.f1147 = i28 - 1;
                        c0145M1176 = c0146.m1176(c0148.f1146, 4, c0147.f1145, 1);
                    }
                    i = c0147.f1145;
                    i2 = c0148.f1145;
                    if (i <= i2) {
                        c0148.f1145 = i2 + 1;
                    } else {
                        i3 = i2 + c0148.f1147;
                        if (i < i3) {
                            int i29 = i3 - i;
                            c0145M1177 = c0146.m1176(c0148.f1146, 4, i + 1, i29);
                            c0148.f1147 -= i29;
                        }
                        arrayList.set(i12, c0147);
                        if (c0148.f1147 > 0) {
                            arrayList.set(size, c0148);
                        } else {
                            arrayList.remove(size);
                            c0148.f1146 = null;
                            c23710.mo1311(c0148);
                        }
                        if (c0145M1176 != null) {
                            arrayList.add(size, c0145M1176);
                        }
                        if (c0145M1177 != null) {
                            arrayList.add(size, c0145M1177);
                        }
                    }
                    c0145M1177 = null;
                    arrayList.set(i12, c0147);
                    if (c0148.f1147 > 0) {
                        arrayList.set(size, c0148);
                    } else {
                        arrayList.remove(size);
                        c0148.f1146 = null;
                        c23710.mo1311(c0148);
                    }
                    if (c0145M1176 != null) {
                        arrayList.add(size, c0145M1176);
                    }
                    if (c0145M1177 != null) {
                        arrayList.add(size, c0145M1177);
                    }
                }
                c0145M1176 = null;
                i = c0147.f1145;
                i2 = c0148.f1145;
                if (i <= i2) {
                    c0148.f1145 = i2 + 1;
                } else {
                    i3 = i2 + c0148.f1147;
                    if (i < i3) {
                        int i210 = i3 - i;
                        c0145M1177 = c0146.m1176(c0148.f1146, 4, i + 1, i210);
                        c0148.f1147 -= i210;
                    }
                    arrayList.set(i12, c0147);
                    if (c0148.f1147 > 0) {
                        arrayList.set(size, c0148);
                    } else {
                        arrayList.remove(size);
                        c0148.f1146 = null;
                        c23710.mo1311(c0148);
                    }
                    if (c0145M1176 != null) {
                        arrayList.add(size, c0145M1176);
                    }
                    if (c0145M1177 != null) {
                        arrayList.add(size, c0145M1177);
                    }
                }
                c0145M1177 = null;
                arrayList.set(i12, c0147);
                if (c0148.f1147 > 0) {
                    arrayList.set(size, c0148);
                } else {
                    arrayList.remove(size);
                    c0148.f1146 = null;
                    c23710.mo1311(c0148);
                }
                if (c0145M1176 != null) {
                    arrayList.add(size, c0145M1176);
                }
                if (c0145M1177 != null) {
                    arrayList.add(size, c0145M1177);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            C0145 c0145M1179 = (C0145) arrayList.get(i30);
            int i31 = c0145M1179.f1144;
            if (i31 == 1) {
                m1181(c0145M1179);
            } else if (i31 == 2) {
                int i32 = c0145M1179.f1145;
                int i33 = c0145M1179.f1147 + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (c2481.m4434(i34) != null || m1156(i34)) {
                        if (b2 == 0) {
                            m1167(m1176(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m1181(m1176(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != c0145M1179.f1147) {
                    c0145M1179.f1146 = null;
                    c2379.mo1311(c0145M1179);
                    c0145M1179 = m1176(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    m1167(c0145M1179);
                } else {
                    m1181(c0145M1179);
                }
            } else if (i31 == 4) {
                int i36 = c0145M1179.f1145;
                int i37 = c0145M1179.f1147 + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (c2481.m4434(i36) != null || m1156(i36)) {
                        if (b3 == 0) {
                            m1167(m1176(c0145M1179.f1146, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m1181(m1176(c0145M1179.f1146, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != c0145M1179.f1147) {
                    Object obj2 = c0145M1179.f1146;
                    c0145M1179.f1146 = null;
                    c2379.mo1311(c0145M1179);
                    c0145M1179 = m1176(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    m1167(c0145M1179);
                } else {
                    m1181(c0145M1179);
                }
            } else if (i31 == 8) {
                m1181(c0145M1179);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int m1183(int i) {
        if (i < ((String) this.f1154).length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public void m1184(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0145 c0145 = (C0145) arrayList.get(i);
            c0145.f1146 = null;
            ((C2379) this.f1150).mo1311(c0145);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public void m1185(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C3402) this.f1152) == null) {
                this.f1152 = new C3402();
            }
            C3402 c3402 = (C3402) this.f1152;
            c3402.f10726 = colorStateList;
            c3402.f10729 = true;
        } else {
            this.f1152 = null;
        }
        m1154();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public void m1186(ColorStateList colorStateList) {
        if (((C3402) this.f1153) == null) {
            this.f1153 = new C3402();
        }
        C3402 c3402 = (C3402) this.f1153;
        c3402.f10726 = colorStateList;
        c3402.f10729 = true;
        m1154();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public void m1187(PorterDuff.Mode mode) {
        if (((C3402) this.f1153) == null) {
            this.f1153 = new C3402();
        }
        C3402 c3402 = (C3402) this.f1153;
        c3402.f10727 = mode;
        c3402.f10728 = true;
        m1154();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int m1188() {
        char cCharAt;
        int i = this.f1149;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f1154;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f1149 = i;
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public boolean m1189() {
        int iM1188 = m1188();
        String str = (String) this.f1154;
        if (iM1188 >= str.length() || iM1188 == -1 || str.charAt(iM1188) != ',') {
            return false;
        }
        this.f1149++;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public void m1190(char c) {
        String str = (String) this.f1154;
        int i = this.f1149;
        if (i > 0 && c == '\"') {
            try {
                this.f1149 = i - 1;
                String strM1165 = m1165();
                this.f1149 = i;
                if (AbstractC2207.m4087(strM1165, "null")) {
                    m1169(this.f1149 - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1149 = i;
                throw th;
            }
        }
        String strM3221 = AbstractC1460.m3221(AbstractC1460.m3207(c));
        int i2 = this.f1149;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m1152(this, "Expected " + strM3221 + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, 4);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public int m1191(int i, int i2) {
        int i3;
        int i4;
        C2379 c2379 = (C2379) this.f1150;
        ArrayList arrayList = (ArrayList) this.f1152;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0145 c0145 = (C0145) arrayList.get(size);
            int i5 = c0145.f1144;
            if (i5 == 8) {
                int i6 = c0145.f1145;
                int i7 = c0145.f1147;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0145.f1145 = i6 + 1;
                            c0145.f1147 = i7 + 1;
                        } else if (i2 == 2) {
                            c0145.f1145 = i6 - 1;
                            c0145.f1147 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0145.f1147 = i7 + 1;
                    } else if (i2 == 2) {
                        c0145.f1147 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0145.f1145 = i6 + 1;
                    } else if (i2 == 2) {
                        c0145.f1145 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0145.f1145;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0145.f1147;
                    } else if (i5 == 2) {
                        i += c0145.f1147;
                    }
                } else if (i2 == 1) {
                    c0145.f1145 = i8 + 1;
                } else if (i2 == 2) {
                    c0145.f1145 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0145 c0146 = (C0145) arrayList.get(size2);
            if (c0146.f1144 == 8) {
                int i9 = c0146.f1147;
                if (i9 == c0146.f1145 || i9 < 0) {
                    arrayList.remove(size2);
                    c0146.f1146 = null;
                    c2379.mo1311(c0146);
                }
            } else if (c0146.f1147 <= 0) {
                arrayList.remove(size2);
                c0146.f1146 = null;
                c2379.mo1311(c0146);
            }
        }
        return i;
    }

    public C0146(C2481 c2481) {
        this.f1148 = 0;
        this.f1150 = new C2379(30);
        this.f1151 = new ArrayList();
        this.f1152 = new ArrayList();
        this.f1149 = 0;
        this.f1153 = c2481;
        this.f1154 = new C1744(this);
    }

    public C0146(StringWriter stringWriter, int i, int i2, String str) {
        this.f1148 = 3;
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 >= 1) {
            StringWriter stringWriter2 = new StringWriter(1000);
            StringWriter stringWriter3 = new StringWriter(1000);
            this.f1150 = stringWriter;
            this.f1149 = i;
            this.f1151 = stringWriter2.getBuffer();
            this.f1152 = stringWriter3.getBuffer();
            this.f1153 = new C1627(stringWriter2, i, "");
            this.f1154 = new C1627(stringWriter3, i2, str);
            return;
        }
        throw new IllegalArgumentException("rightWidth < 1");
    }

    public C0146(String str, C1227 c1227) {
        this.f1148 = 2;
        this.f1150 = c1227;
        this.f1151 = new C0662(c1227);
        this.f1153 = new StringBuilder();
        this.f1154 = str;
    }
}
