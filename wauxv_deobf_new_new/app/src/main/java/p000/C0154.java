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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0154 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f1217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1218;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1219;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1220;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1221;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Object f1222;

    public C0154(View view) {
        C0226 c0226;
        this.f1216 = 1;
        this.f1217 = -1;
        this.f1218 = view;
        PorterDuff.Mode mode = C0226.f1410;
        synchronized (C0226.class) {
            try {
                if (C0226.f1411 == null) {
                    C0226.m1396();
                }
                c0226 = C0226.f1411;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1219 = c0226;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m1297(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static /* synthetic */ void m1298(C0154 c0154, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = c0154.f1217;
        }
        c0154.m1315(i, str, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public String toString() {
        switch (this.f1216) {
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f1222);
                sb.append("', currentPosition=");
                return AbstractC2844.m4784(sb, this.f1217, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int m1299(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f1221).append((char) (m1317(i + 3, charSequence) + (m1317(i, charSequence) << 12) + (m1317(i + 1, charSequence) << 8) + (m1317(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f1217 = i;
        if (i2 < charSequence.length()) {
            return m1299(this.f1217, charSequence);
        }
        m1298(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1300() {
        View view = (View) this.f1218;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C3461) this.f1220) != null) {
                if (((C3461) this.f1222) == null) {
                    this.f1222 = new C3461();
                }
                C3461 c3461 = (C3461) this.f1222;
                c3461.f10893 = null;
                c3461.f10896 = false;
                c3461.f10894 = null;
                c3461.f10895 = false;
                Field field = AbstractC3638.f11333;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c3461.f10896 = true;
                    c3461.f10893 = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c3461.f10895 = true;
                    c3461.f10894 = backgroundTintMode;
                }
                if (c3461.f10896 || c3461.f10895) {
                    C0226.m1397(background, c3461, view.getDrawableState());
                    return;
                }
            }
            C3461 c3462 = (C3461) this.f1221;
            if (c3462 != null) {
                C0226.m1397(background, c3462, view.getDrawableState());
                return;
            }
            C3461 c3463 = (C3461) this.f1220;
            if (c3463 != null) {
                C0226.m1397(background, c3463, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean m1301() {
        int i = this.f1217;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f1222;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1217 = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f1217 = i;
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean m1302(int i) {
        ArrayList arrayList = (ArrayList) this.f1220;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0153 c0153 = (C0153) arrayList.get(i2);
            int i3 = c0153.f1212;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0153.f1213;
                    int i5 = c0153.f1215 + i4;
                    while (i4 < i5) {
                        if (m1316(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m1316(c0153.f1215, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m1303(int i, String str) {
        String str2 = (String) this.f1222;
        if (str2.length() - i < str.length()) {
            m1298(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m1298(this, "Expected valid boolean literal prefix, but had '" + m1311() + '\'', 0, 6);
                throw null;
            }
        }
        this.f1217 = str.length() + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String m1304() {
        String string;
        StringBuilder sb = (StringBuilder) this.f1221;
        String str = (String) this.f1222;
        m1307('\"');
        int i = this.f1217;
        int iM4866 = AbstractC2901.m4866('\"', i, 4, str);
        if (iM4866 == -1) {
            m1311();
            int i2 = this.f1217;
            m1298(this, AbstractC1095.m2800("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM4866) {
            if (str.charAt(i3) == '\\') {
                int iM1329 = this.f1217;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM1329, i3);
                        int iM13210 = m1329(i3 + 1);
                        if (iM13210 == -1) {
                            m1298(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM1299 = iM13210 + 1;
                        char cCharAt2 = str.charAt(iM13210);
                        if (cCharAt2 == 'u') {
                            iM1299 = m1299(iM1299, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C0575.f2368[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m1298(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM1329 = m1329(iM1299);
                        if (iM1329 == -1) {
                            m1298(this, "Unexpected EOF", iM1329, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM1329, i3);
                            iM1329 = m1329(i3);
                            if (iM1329 == -1) {
                                m1298(this, "Unexpected EOF", iM1329, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iM1329;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM1329, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM1329, i3).toString();
                }
                this.f1217 = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f1217 = iM4866 + 1;
        return str.substring(i, iM4866);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte m1305() {
        String str = (String) this.f1222;
        int i = this.f1217;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1217 = i2;
                return AbstractC1467.m3264(cCharAt);
            }
            i = i2;
        }
        this.f1217 = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte m1306(byte b) {
        String str = (String) this.f1222;
        byte bM1305 = m1305();
        if (bM1305 == b) {
            return bM1305;
        }
        String strM3293 = AbstractC1467.m3293(b);
        int i = this.f1217;
        int i2 = i > 0 ? i - 1 : i;
        m1298(this, "Expected " + strM3293 + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, 4);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m1307(char c) {
        int i = this.f1217;
        if (i == -1) {
            m1336(c);
            throw null;
        }
        String str = (String) this.f1222;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1217 = i2;
                if (cCharAt == c) {
                    return;
                }
                m1336(c);
                throw null;
            }
            i = i2;
        }
        this.f1217 = -1;
        m1336(c);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public long m1308() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iM1329 = m1329(m1334());
        String str = (String) this.f1222;
        if (iM1329 >= str.length() || iM1329 == -1) {
            m1298(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1329) == '\"') {
            iM1329++;
            if (iM1329 == str.length()) {
                m1298(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iM1329;
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
                    if (i == iM1329) {
                        m1298(this, "Unexpected symbol '-' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    if (cCharAt != '-') {
                        if (AbstractC1467.m3264(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m1298(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * ((long) 10)) + ((long) i3);
                        } else {
                            j4 = (j4 * ((long) 10)) - ((long) i3);
                            if (j4 > j3) {
                                m1298(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                        }
                        z = z2;
                        i = i2;
                    } else {
                        if (i != iM1329) {
                            m1298(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = true;
                    }
                } else {
                    if (i == iM1329) {
                        m1298(this, "Unexpected symbol '+' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = true;
                }
            } else {
                if (i == iM1329) {
                    m1298(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                    throw null;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iM1329;
        if (iM1329 == i || (z5 && iM1329 == i - 1)) {
            m1298(this, "Expected numeric literal", i, 4);
            throw null;
        }
        if (z2) {
            if (!z6) {
                m1298(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m1298(this, "Expected closing quotation mark", i, 4);
                throw null;
            }
            i++;
        }
        this.f1217 = i;
        long j5 = j4;
        if (z4) {
            double d = j5;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    throw new C0758();
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m1298(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m1298(this, "Can't convert " + d2 + " to Long", 0, 6);
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
        m1298(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m1309() {
        ArrayList arrayList = (ArrayList) this.f1220;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2536) this.f1221).m4454((C0153) arrayList.get(i));
        }
        m1330(arrayList);
        this.f1217 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String m1310() {
        String str = (String) this.f1220;
        if (str == null) {
            return m1304();
        }
        this.f1220 = null;
        return str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public String m1311() {
        String string;
        StringBuilder sb = (StringBuilder) this.f1221;
        String str = (String) this.f1222;
        String str2 = (String) this.f1220;
        if (str2 != null) {
            this.f1220 = null;
            return str2;
        }
        int iM1334 = m1334();
        if (iM1334 >= str.length() || iM1334 == -1) {
            m1298(this, "EOF", iM1334, 4);
            throw null;
        }
        byte bM3264 = AbstractC1467.m3264(str.charAt(iM1334));
        if (bM3264 == 1) {
            return m1310();
        }
        if (bM3264 != 0) {
            m1298(this, "Expected beginning of the string, but got " + str.charAt(iM1334), 0, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC1467.m3264(str.charAt(iM1334)) == 0) {
            iM1334++;
            if (iM1334 >= str.length()) {
                sb.append((CharSequence) str, this.f1217, iM1334);
                int iM1329 = m1329(iM1334);
                if (iM1329 == -1) {
                    this.f1217 = iM1334;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM1334 = iM1329;
                z = true;
            }
        }
        if (z) {
            sb.append((CharSequence) str, this.f1217, iM1334);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(this.f1217, iM1334).toString();
        }
        this.f1217 = iM1334;
        return string;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1312() {
        C2536 c2536 = (C2536) this.f1221;
        m1309();
        ArrayList arrayList = (ArrayList) this.f1219;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0153 c0153 = (C0153) arrayList.get(i);
            int i2 = c0153.f1212;
            if (i2 == 1) {
                c2536.m4454(c0153);
                c2536.m4457(c0153.f1213, c0153.f1215);
            } else if (i2 == 2) {
                c2536.m4454(c0153);
                int i3 = c0153.f1213;
                int i4 = c0153.f1215;
                RecyclerView recyclerView = c2536.f8076;
                recyclerView.m238(i3, i4, true);
                recyclerView.f414 = true;
                recyclerView.f411.f8137 += i4;
            } else if (i2 == 4) {
                c2536.m4454(c0153);
                c2536.m4456(c0153.f1213, c0153.f1215, c0153.f1214);
            } else if (i2 == 8) {
                c2536.m4454(c0153);
                c2536.m4458(c0153.f1213, c0153.f1215);
            }
        }
        m1330(arrayList);
        this.f1217 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m1313(C0153 c0153) {
        int i;
        C2432 c2432 = (C2432) this.f1218;
        int i2 = c0153.f1212;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM1337 = m1337(c0153.f1213, i2);
        int i3 = c0153.f1213;
        int i4 = c0153.f1212;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0153);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0153.f1215; i6++) {
            int iM1338 = m1337((i * i6) + c0153.f1213, c0153.f1212);
            int i7 = c0153.f1212;
            if (i7 == 2 ? iM1338 != iM1337 : !(i7 == 4 && iM1338 == iM1337 + 1)) {
                C0153 c0153M1322 = m1322(c0153.f1214, i7, iM1337, i5);
                m1314(c0153M1322, i3);
                c0153M1322.f1214 = null;
                c2432.mo1457(c0153M1322);
                if (c0153.f1212 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM1337 = iM1338;
            } else {
                i5++;
            }
        }
        Object obj = c0153.f1214;
        c0153.f1214 = null;
        c2432.mo1457(c0153);
        if (i5 > 0) {
            C0153 c0153M1323 = m1322(obj, c0153.f1212, iM1337, i5);
            m1314(c0153M1323, i3);
            c0153M1323.f1214 = null;
            c2432.mo1457(c0153M1323);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public void m1314(C0153 c0153, int i) {
        C2536 c2536 = (C2536) this.f1221;
        c2536.m4454(c0153);
        int i2 = c0153.f1212;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c2536.m4456(i, c0153.f1215, c0153.f1214);
        } else {
            int i3 = c0153.f1215;
            RecyclerView recyclerView = c2536.f8076;
            recyclerView.m238(i, i3, true);
            recyclerView.f414 = true;
            recyclerView.f411.f8137 += i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m1315(int i, String str, String str2) {
        throw new C1734(AbstractC2234.m4167(i, str, ((C0776) this.f1219).m2379(), str2, ((C1732) this.f1218).f5867 ? AbstractC2234.m4177(i, (String) this.f1222).toString() : null));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int m1316(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f1220;
        int size = arrayList.size();
        while (i2 < size) {
            C0153 c0153 = (C0153) arrayList.get(i2);
            int i3 = c0153.f1212;
            if (i3 == 8) {
                int i4 = c0153.f1213;
                if (i4 == i) {
                    i = c0153.f1215;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0153.f1215 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0153.f1213;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0153.f1215;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0153.f1215;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int m1317(int i, CharSequence charSequence) {
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
        m1298(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ColorStateList m1318() {
        C3461 c3461 = (C3461) this.f1221;
        if (c3461 != null) {
            return c3461.f10893;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public PorterDuff.Mode m1319() {
        C3461 c3461 = (C3461) this.f1221;
        if (c3461 != null) {
            return c3461.f10894;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean m1320() {
        return ((ArrayList) this.f1219).size() > 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void m1321(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM4612;
        View view = (View) this.f1218;
        Context context = view.getContext();
        int[] iArr = AbstractC2523.f8046;
        C0253 c0253M1453 = C0253.m1453(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0253M1453.f1478;
        View view2 = (View) this.f1218;
        AbstractC3638.m5182(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0253M1453.f1478, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f1217 = typedArray.getResourceId(0, -1);
                C0226 c0226 = (C0226) this.f1219;
                Context context2 = view.getContext();
                int i2 = this.f1217;
                synchronized (c0226) {
                    colorStateListM4612 = c0226.f1412.m4612(context2, i2);
                }
                if (colorStateListM4612 != null) {
                    m1331(colorStateListM4612);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c0253M1453.m1465(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC1111.m2825(typedArray.getInt(2, -1), null));
            }
            c0253M1453.m1475();
        } catch (Throwable th) {
            c0253M1453.m1475();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C0153 m1322(Object obj, int i, int i2, int i3) {
        C0153 c0153 = (C0153) ((C2432) this.f1218).mo1458();
        if (c0153 != null) {
            c0153.f1212 = i;
            c0153.f1213 = i2;
            c0153.f1215 = i3;
            c0153.f1214 = obj;
            return c0153;
        }
        C0153 c0154 = new C0153();
        c0154.f1212 = i;
        c0154.f1213 = i2;
        c0154.f1215 = i3;
        c0154.f1214 = obj;
        return c0154;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m1323() {
        this.f1217 = -1;
        m1331(null);
        m1300();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public void m1324(int i) {
        ColorStateList colorStateListM4612;
        this.f1217 = i;
        C0226 c0226 = (C0226) this.f1219;
        if (c0226 != null) {
            Context context = ((View) this.f1218).getContext();
            synchronized (c0226) {
                colorStateListM4612 = c0226.f1412.m4612(context, i);
            }
        } else {
            colorStateListM4612 = null;
        }
        m1331(colorStateListM4612);
        m1300();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public void m1325() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.f1220;
        StringBuffer stringBuffer2 = (StringBuffer) this.f1219;
        Writer writer = (Writer) this.f1218;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f1217 - iIndexOf2; i > 0; i--) {
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
    public byte m1326() {
        String str = (String) this.f1222;
        int i = this.f1217;
        while (true) {
            int iM1329 = m1329(i);
            if (iM1329 == -1) {
                this.f1217 = iM1329;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM1329);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1217 = iM1329;
                return AbstractC1467.m3264(cCharAt);
            }
            i = iM1329 + 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public void m1327(C0153 c0153) {
        C2536 c2536 = (C2536) this.f1221;
        ((ArrayList) this.f1220).add(c0153);
        int i = c0153.f1212;
        if (i == 1) {
            c2536.m4457(c0153.f1213, c0153.f1215);
            return;
        }
        if (i == 2) {
            int i2 = c0153.f1213;
            int i3 = c0153.f1215;
            RecyclerView recyclerView = c2536.f8076;
            recyclerView.m238(i2, i3, false);
            recyclerView.f414 = true;
            return;
        }
        if (i == 4) {
            c2536.m4456(c0153.f1213, c0153.f1215, c0153.f1214);
        } else if (i == 8) {
            c2536.m4458(c0153.f1213, c0153.f1215);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0153);
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
    public void m1328() {
        boolean z;
        byte b;
        C0153 c0153M1322;
        int i;
        int i2;
        int i3;
        C0153 c0153M1323;
        boolean z2;
        boolean z3;
        Object obj;
        C0153 c0153;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C2432 c2432 = (C2432) this.f1218;
        C2536 c2536 = (C2536) this.f1221;
        C1681 c1681 = (C1681) this.f1222;
        ArrayList arrayList = (ArrayList) this.f1219;
        c1681.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0153) arrayList.get(size)).f1212 == 8) {
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
            C0154 c0154 = (C0154) c1681.f5660;
            C2432 c2433 = (C2432) c0154.f1218;
            C0153 c0155 = (C0153) arrayList.get(size);
            C0153 c0156 = (C0153) arrayList.get(i12);
            int i13 = c0156.f1212;
            if (i13 == 1) {
                int i14 = c0155.f1215;
                int i15 = c0156.f1213;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = c0155.f1213;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    c0155.f1213 = i17 + c0156.f1215;
                }
                int i18 = c0156.f1213;
                if (i18 <= i14) {
                    c0155.f1215 = i14 + c0156.f1215;
                }
                c0156.f1213 = i18 + i16;
                arrayList.set(size, c0156);
                arrayList.set(i12, c0155);
            } else if (i13 == 2) {
                int i19 = c0155.f1213;
                int i20 = c0155.f1215;
                if (i19 < i20) {
                    if (c0156.f1213 == i19 && c0156.f1215 == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (c0156.f1213 == i20 + 1 && c0156.f1215 == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = c0156.f1213;
                if (i20 < i21) {
                    c0156.f1213 = i21 - 1;
                } else {
                    int i22 = c0156.f1215;
                    if (i20 < i21 + i22) {
                        c0156.f1215 = i22 - 1;
                        c0155.f1212 = 2;
                        c0155.f1215 = 1;
                        if (c0156.f1215 == 0) {
                            arrayList.remove(i12);
                            c0156.f1214 = null;
                            c2433.mo1457(c0156);
                        }
                    }
                }
                int i23 = c0155.f1213;
                int i24 = c0156.f1213;
                if (i23 <= i24) {
                    c0156.f1213 = i24 + 1;
                } else {
                    int i25 = i24 + c0156.f1215;
                    if (i23 < i25) {
                        obj = null;
                        C0153 c0153M1324 = c0154.m1322(null, 2, i23 + 1, i25 - i23);
                        c0156.f1215 = c0155.f1213 - c0156.f1213;
                        c0153 = c0153M1324;
                    }
                    if (z3) {
                        arrayList.set(size, c0156);
                        arrayList.remove(i12);
                        c0155.f1214 = obj;
                        c2433.mo1457(c0155);
                    } else {
                        if (z2) {
                            if (c0153 != null) {
                                i10 = c0155.f1213;
                                if (i10 > c0153.f1213) {
                                    c0155.f1213 = i10 - c0153.f1215;
                                }
                                i11 = c0155.f1215;
                                if (i11 > c0153.f1213) {
                                    c0155.f1215 = i11 - c0153.f1215;
                                }
                            }
                            i8 = c0155.f1213;
                            if (i8 > c0156.f1213) {
                                c0155.f1213 = i8 - c0156.f1215;
                            }
                            i9 = c0155.f1215;
                            if (i9 > c0156.f1213) {
                                c0155.f1215 = i9 - c0156.f1215;
                            }
                        } else {
                            if (c0153 != null) {
                                i6 = c0155.f1213;
                                if (i6 >= c0153.f1213) {
                                    c0155.f1213 = i6 - c0153.f1215;
                                }
                                i7 = c0155.f1215;
                                if (i7 >= c0153.f1213) {
                                    c0155.f1215 = i7 - c0153.f1215;
                                }
                            }
                            i4 = c0155.f1213;
                            if (i4 >= c0156.f1213) {
                                c0155.f1213 = i4 - c0156.f1215;
                            }
                            i5 = c0155.f1215;
                            if (i5 >= c0156.f1213) {
                                c0155.f1215 = i5 - c0156.f1215;
                            }
                        }
                        arrayList.set(size, c0156);
                        if (c0155.f1213 != c0155.f1215) {
                            arrayList.set(i12, c0155);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (c0153 != null) {
                            arrayList.add(size, c0153);
                        }
                    }
                }
                obj = null;
                c0153 = null;
                if (z3) {
                    arrayList.set(size, c0156);
                    arrayList.remove(i12);
                    c0155.f1214 = obj;
                    c2433.mo1457(c0155);
                } else {
                    if (z2) {
                        if (c0153 != null) {
                            i10 = c0155.f1213;
                            if (i10 > c0153.f1213) {
                                c0155.f1213 = i10 - c0153.f1215;
                            }
                            i11 = c0155.f1215;
                            if (i11 > c0153.f1213) {
                                c0155.f1215 = i11 - c0153.f1215;
                            }
                        }
                        i8 = c0155.f1213;
                        if (i8 > c0156.f1213) {
                            c0155.f1213 = i8 - c0156.f1215;
                        }
                        i9 = c0155.f1215;
                        if (i9 > c0156.f1213) {
                            c0155.f1215 = i9 - c0156.f1215;
                        }
                    } else {
                        if (c0153 != null) {
                            i6 = c0155.f1213;
                            if (i6 >= c0153.f1213) {
                                c0155.f1213 = i6 - c0153.f1215;
                            }
                            i7 = c0155.f1215;
                            if (i7 >= c0153.f1213) {
                                c0155.f1215 = i7 - c0153.f1215;
                            }
                        }
                        i4 = c0155.f1213;
                        if (i4 >= c0156.f1213) {
                            c0155.f1213 = i4 - c0156.f1215;
                        }
                        i5 = c0155.f1215;
                        if (i5 >= c0156.f1213) {
                            c0155.f1215 = i5 - c0156.f1215;
                        }
                    }
                    arrayList.set(size, c0156);
                    if (c0155.f1213 != c0155.f1215) {
                        arrayList.set(i12, c0155);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (c0153 != null) {
                        arrayList.add(size, c0153);
                    }
                }
            } else if (i13 == 4) {
                int i26 = c0155.f1215;
                int i27 = c0156.f1213;
                if (i26 < i27) {
                    c0156.f1213 = i27 - 1;
                } else {
                    int i28 = c0156.f1215;
                    if (i26 < i27 + i28) {
                        c0156.f1215 = i28 - 1;
                        c0153M1322 = c0154.m1322(c0156.f1214, 4, c0155.f1213, 1);
                    }
                    i = c0155.f1213;
                    i2 = c0156.f1213;
                    if (i <= i2) {
                        c0156.f1213 = i2 + 1;
                    } else {
                        i3 = i2 + c0156.f1215;
                        if (i < i3) {
                            int i29 = i3 - i;
                            c0153M1323 = c0154.m1322(c0156.f1214, 4, i + 1, i29);
                            c0156.f1215 -= i29;
                        }
                        arrayList.set(i12, c0155);
                        if (c0156.f1215 > 0) {
                            arrayList.set(size, c0156);
                        } else {
                            arrayList.remove(size);
                            c0156.f1214 = null;
                            c2433.mo1457(c0156);
                        }
                        if (c0153M1322 != null) {
                            arrayList.add(size, c0153M1322);
                        }
                        if (c0153M1323 != null) {
                            arrayList.add(size, c0153M1323);
                        }
                    }
                    c0153M1323 = null;
                    arrayList.set(i12, c0155);
                    if (c0156.f1215 > 0) {
                        arrayList.set(size, c0156);
                    } else {
                        arrayList.remove(size);
                        c0156.f1214 = null;
                        c2433.mo1457(c0156);
                    }
                    if (c0153M1322 != null) {
                        arrayList.add(size, c0153M1322);
                    }
                    if (c0153M1323 != null) {
                        arrayList.add(size, c0153M1323);
                    }
                }
                c0153M1322 = null;
                i = c0155.f1213;
                i2 = c0156.f1213;
                if (i <= i2) {
                    c0156.f1213 = i2 + 1;
                } else {
                    i3 = i2 + c0156.f1215;
                    if (i < i3) {
                        int i210 = i3 - i;
                        c0153M1323 = c0154.m1322(c0156.f1214, 4, i + 1, i210);
                        c0156.f1215 -= i210;
                    }
                    arrayList.set(i12, c0155);
                    if (c0156.f1215 > 0) {
                        arrayList.set(size, c0156);
                    } else {
                        arrayList.remove(size);
                        c0156.f1214 = null;
                        c2433.mo1457(c0156);
                    }
                    if (c0153M1322 != null) {
                        arrayList.add(size, c0153M1322);
                    }
                    if (c0153M1323 != null) {
                        arrayList.add(size, c0153M1323);
                    }
                }
                c0153M1323 = null;
                arrayList.set(i12, c0155);
                if (c0156.f1215 > 0) {
                    arrayList.set(size, c0156);
                } else {
                    arrayList.remove(size);
                    c0156.f1214 = null;
                    c2433.mo1457(c0156);
                }
                if (c0153M1322 != null) {
                    arrayList.add(size, c0153M1322);
                }
                if (c0153M1323 != null) {
                    arrayList.add(size, c0153M1323);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            C0153 c0153M1325 = (C0153) arrayList.get(i30);
            int i31 = c0153M1325.f1212;
            if (i31 == 1) {
                m1327(c0153M1325);
            } else if (i31 == 2) {
                int i32 = c0153M1325.f1213;
                int i33 = c0153M1325.f1215 + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (c2536.m4455(i34) != null || m1302(i34)) {
                        if (b2 == 0) {
                            m1313(m1322(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m1327(m1322(null, 2, i32, i35));
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
                if (i35 != c0153M1325.f1215) {
                    c0153M1325.f1214 = null;
                    c2432.mo1457(c0153M1325);
                    c0153M1325 = m1322(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    m1313(c0153M1325);
                } else {
                    m1327(c0153M1325);
                }
            } else if (i31 == 4) {
                int i36 = c0153M1325.f1213;
                int i37 = c0153M1325.f1215 + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (c2536.m4455(i36) != null || m1302(i36)) {
                        if (b3 == 0) {
                            m1313(m1322(c0153M1325.f1214, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m1327(m1322(c0153M1325.f1214, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != c0153M1325.f1215) {
                    Object obj2 = c0153M1325.f1214;
                    c0153M1325.f1214 = null;
                    c2432.mo1457(c0153M1325);
                    c0153M1325 = m1322(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    m1313(c0153M1325);
                } else {
                    m1327(c0153M1325);
                }
            } else if (i31 == 8) {
                m1327(c0153M1325);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int m1329(int i) {
        if (i < ((String) this.f1222).length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public void m1330(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0153 c0153 = (C0153) arrayList.get(i);
            c0153.f1214 = null;
            ((C2432) this.f1218).mo1457(c0153);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public void m1331(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C3461) this.f1220) == null) {
                this.f1220 = new C3461();
            }
            C3461 c3461 = (C3461) this.f1220;
            c3461.f10893 = colorStateList;
            c3461.f10896 = true;
        } else {
            this.f1220 = null;
        }
        m1300();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public void m1332(ColorStateList colorStateList) {
        if (((C3461) this.f1221) == null) {
            this.f1221 = new C3461();
        }
        C3461 c3461 = (C3461) this.f1221;
        c3461.f10893 = colorStateList;
        c3461.f10896 = true;
        m1300();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public void m1333(PorterDuff.Mode mode) {
        if (((C3461) this.f1221) == null) {
            this.f1221 = new C3461();
        }
        C3461 c3461 = (C3461) this.f1221;
        c3461.f10894 = mode;
        c3461.f10895 = true;
        m1300();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int m1334() {
        char cCharAt;
        int i = this.f1217;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f1222;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f1217 = i;
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public boolean m1335() {
        int iM1334 = m1334();
        String str = (String) this.f1222;
        if (iM1334 >= str.length() || iM1334 == -1 || str.charAt(iM1334) != ',') {
            return false;
        }
        this.f1217++;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public void m1336(char c) {
        String str = (String) this.f1222;
        int i = this.f1217;
        if (i > 0 && c == '\"') {
            try {
                this.f1217 = i - 1;
                String strM1311 = m1311();
                this.f1217 = i;
                if (AbstractC1469.m3322(strM1311, "null")) {
                    m1315(this.f1217 - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1217 = i;
                throw th;
            }
        }
        String strM3293 = AbstractC1467.m3293(AbstractC1467.m3264(c));
        int i2 = this.f1217;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m1298(this, "Expected " + strM3293 + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, 4);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public int m1337(int i, int i2) {
        int i3;
        int i4;
        C2432 c2432 = (C2432) this.f1218;
        ArrayList arrayList = (ArrayList) this.f1220;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0153 c0153 = (C0153) arrayList.get(size);
            int i5 = c0153.f1212;
            if (i5 == 8) {
                int i6 = c0153.f1213;
                int i7 = c0153.f1215;
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
                            c0153.f1213 = i6 + 1;
                            c0153.f1215 = i7 + 1;
                        } else if (i2 == 2) {
                            c0153.f1213 = i6 - 1;
                            c0153.f1215 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0153.f1215 = i7 + 1;
                    } else if (i2 == 2) {
                        c0153.f1215 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0153.f1213 = i6 + 1;
                    } else if (i2 == 2) {
                        c0153.f1213 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0153.f1213;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0153.f1215;
                    } else if (i5 == 2) {
                        i += c0153.f1215;
                    }
                } else if (i2 == 1) {
                    c0153.f1213 = i8 + 1;
                } else if (i2 == 2) {
                    c0153.f1213 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0153 c0154 = (C0153) arrayList.get(size2);
            if (c0154.f1212 == 8) {
                int i9 = c0154.f1215;
                if (i9 == c0154.f1213 || i9 < 0) {
                    arrayList.remove(size2);
                    c0154.f1214 = null;
                    c2432.mo1457(c0154);
                }
            } else if (c0154.f1215 <= 0) {
                arrayList.remove(size2);
                c0154.f1214 = null;
                c2432.mo1457(c0154);
            }
        }
        return i;
    }

    public C0154(C2536 c2536) {
        this.f1216 = 0;
        this.f1218 = new C2432(30);
        this.f1219 = new ArrayList();
        this.f1220 = new ArrayList();
        this.f1217 = 0;
        this.f1221 = c2536;
        this.f1222 = new C1681(this);
    }

    public C0154(StringWriter stringWriter, int i, int i2, String str) {
        this.f1216 = 3;
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 >= 1) {
            StringWriter stringWriter2 = new StringWriter(1000);
            StringWriter stringWriter3 = new StringWriter(1000);
            this.f1218 = stringWriter;
            this.f1217 = i;
            this.f1219 = stringWriter2.getBuffer();
            this.f1220 = stringWriter3.getBuffer();
            this.f1221 = new C1640(stringWriter2, i, "");
            this.f1222 = new C1640(stringWriter3, i2, str);
            return;
        }
        throw new IllegalArgumentException("rightWidth < 1");
    }

    public C0154(String str, C1732 c1732) {
        this.f1216 = 2;
        this.f1218 = c1732;
        this.f1219 = new C0776(c1732);
        this.f1221 = new StringBuilder();
        this.f1222 = str;
    }
}
