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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3017Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9375Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f9376Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f9377Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f9378Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f9379Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f9380Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Object f9381Ujhhgtgfeyxiexzf;

    public C3017Ujhhgtgfeyxiexzf(View view) {
        C2364Ujhhgtgfeyxiexzf c2364Ujhhgtgfeyxiexzf;
        this.f9375Ujhhgtgfeyxiexzf = 1;
        this.f9376Ujhhgtgfeyxiexzf = -1;
        this.f9377Ujhhgtgfeyxiexzf = view;
        PorterDuff.Mode mode = C2364Ujhhgtgfeyxiexzf.f7707Ujhhgtgfeyxiexzf;
        synchronized (C2364Ujhhgtgfeyxiexzf.class) {
            try {
                if (C2364Ujhhgtgfeyxiexzf.f7708Ujhhgtgfeyxiexzf == null) {
                    C2364Ujhhgtgfeyxiexzf.m3587Ujhhgtgfeyxiexzf();
                }
                c2364Ujhhgtgfeyxiexzf = C2364Ujhhgtgfeyxiexzf.f7708Ujhhgtgfeyxiexzf;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9378Ujhhgtgfeyxiexzf = c2364Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4461Ujhhgtgfeyxiexzf(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static /* synthetic */ void m4462Ujhhgtgfeyxiexzf(C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf;
        }
        c3017Ujhhgtgfeyxiexzf.m4479Ujhhgtgfeyxiexzf(i, str, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public String toString() {
        switch (this.f9375Ujhhgtgfeyxiexzf) {
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f9381Ujhhgtgfeyxiexzf);
                sb.append("', currentPosition=");
                return AbstractC3317feyxiexzfUjhhgtg.m4802Ujhhgtgfeyxiexzf(sb, this.f9376Ujhhgtgfeyxiexzf, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int m4463Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f9380Ujhhgtgfeyxiexzf).append((char) (m4481Ujhhgtgfeyxiexzf(i + 3, charSequence) + (m4481Ujhhgtgfeyxiexzf(i, charSequence) << 12) + (m4481Ujhhgtgfeyxiexzf(i + 1, charSequence) << 8) + (m4481Ujhhgtgfeyxiexzf(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f9376Ujhhgtgfeyxiexzf = i;
        if (i2 < charSequence.length()) {
            return m4463Ujhhgtgfeyxiexzf(this.f9376Ujhhgtgfeyxiexzf, charSequence);
        }
        m4462Ujhhgtgfeyxiexzf(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m4464Ujhhgtgfeyxiexzf() {
        View view = (View) this.f9377Ujhhgtgfeyxiexzf;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C1741Ujhhgtgfeyxiexzf) this.f9379Ujhhgtgfeyxiexzf) != null) {
                if (((C1741Ujhhgtgfeyxiexzf) this.f9381Ujhhgtgfeyxiexzf) == null) {
                    this.f9381Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
                }
                C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f9381Ujhhgtgfeyxiexzf;
                c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = null;
                c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = false;
                c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf = null;
                c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf = false;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = true;
                    c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf = true;
                    c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf = backgroundTintMode;
                }
                if (c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf || c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf) {
                    C2364Ujhhgtgfeyxiexzf.m3588Ujhhgtgfeyxiexzf(background, c1741Ujhhgtgfeyxiexzf, view.getDrawableState());
                    return;
                }
            }
            C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf2 = (C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf;
            if (c1741Ujhhgtgfeyxiexzf2 != null) {
                C2364Ujhhgtgfeyxiexzf.m3588Ujhhgtgfeyxiexzf(background, c1741Ujhhgtgfeyxiexzf2, view.getDrawableState());
                return;
            }
            C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf3 = (C1741Ujhhgtgfeyxiexzf) this.f9379Ujhhgtgfeyxiexzf;
            if (c1741Ujhhgtgfeyxiexzf3 != null) {
                C2364Ujhhgtgfeyxiexzf.m3588Ujhhgtgfeyxiexzf(background, c1741Ujhhgtgfeyxiexzf3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean m4465Ujhhgtgfeyxiexzf() {
        int i = this.f9376Ujhhgtgfeyxiexzf;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9376Ujhhgtgfeyxiexzf = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f9376Ujhhgtgfeyxiexzf = i;
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean m4466Ujhhgtgfeyxiexzf(int i) {
        ArrayList arrayList = (ArrayList) this.f9379Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i2);
            int i3 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                    int i5 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf + i4;
                    while (i4 < i5) {
                        if (m4480Ujhhgtgfeyxiexzf(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m4480Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void m4467Ujhhgtgfeyxiexzf(int i, String str) {
        String str2 = (String) this.f9381Ujhhgtgfeyxiexzf;
        if (str2.length() - i < str.length()) {
            m4462Ujhhgtgfeyxiexzf(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m4462Ujhhgtgfeyxiexzf(this, "Expected valid boolean literal prefix, but had '" + m4475Ujhhgtgfeyxiexzf() + '\'', 0, 6);
                throw null;
            }
        }
        this.f9376Ujhhgtgfeyxiexzf = str.length() + i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public String m4468Ujhhgtgfeyxiexzf() {
        String string;
        StringBuilder sb = (StringBuilder) this.f9380Ujhhgtgfeyxiexzf;
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        m4471Ujhhgtgfeyxiexzf('\"');
        int i = this.f9376Ujhhgtgfeyxiexzf;
        int iM2628feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2628feyxiexzfUjhhgtg('\"', i, 4, str);
        if (iM2628feyxiexzfUjhhgtg == -1) {
            m4475Ujhhgtgfeyxiexzf();
            int i2 = this.f9376Ujhhgtgfeyxiexzf;
            m4462Ujhhgtgfeyxiexzf(this, AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM2628feyxiexzfUjhhgtg) {
            if (str.charAt(i3) == '\\') {
                int iM4493feyxiexzfUjhhgtg = this.f9376Ujhhgtgfeyxiexzf;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM4493feyxiexzfUjhhgtg, i3);
                        int iM4493feyxiexzfUjhhgtg2 = m4493feyxiexzfUjhhgtg(i3 + 1);
                        if (iM4493feyxiexzfUjhhgtg2 == -1) {
                            m4462Ujhhgtgfeyxiexzf(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM4463Ujhhgtgfeyxiexzf = iM4493feyxiexzfUjhhgtg2 + 1;
                        char cCharAt2 = str.charAt(iM4493feyxiexzfUjhhgtg2);
                        if (cCharAt2 == 'u') {
                            iM4463Ujhhgtgfeyxiexzf = m4463Ujhhgtgfeyxiexzf(iM4463Ujhhgtgfeyxiexzf, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C2686Ujhhgtgfeyxiexzf.f8576Ujhhgtgfeyxiexzf[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m4462Ujhhgtgfeyxiexzf(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM4493feyxiexzfUjhhgtg = m4493feyxiexzfUjhhgtg(iM4463Ujhhgtgfeyxiexzf);
                        if (iM4493feyxiexzfUjhhgtg == -1) {
                            m4462Ujhhgtgfeyxiexzf(this, "Unexpected EOF", iM4493feyxiexzfUjhhgtg, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM4493feyxiexzfUjhhgtg, i3);
                            iM4493feyxiexzfUjhhgtg = m4493feyxiexzfUjhhgtg(i3);
                            if (iM4493feyxiexzfUjhhgtg == -1) {
                                m4462Ujhhgtgfeyxiexzf(this, "Unexpected EOF", iM4493feyxiexzfUjhhgtg, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iM4493feyxiexzfUjhhgtg;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM4493feyxiexzfUjhhgtg, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM4493feyxiexzfUjhhgtg, i3).toString();
                }
                this.f9376Ujhhgtgfeyxiexzf = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f9376Ujhhgtgfeyxiexzf = iM2628feyxiexzfUjhhgtg + 1;
        return str.substring(i, iM2628feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public byte m4469Ujhhgtgfeyxiexzf() {
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        int i = this.f9376Ujhhgtgfeyxiexzf;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9376Ujhhgtgfeyxiexzf = i2;
                return AbstractC3085Ujhhgtgfeyxiexzf.m4551Ujhhgtgfeyxiexzf(cCharAt);
            }
            i = i2;
        }
        this.f9376Ujhhgtgfeyxiexzf = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public byte m4470Ujhhgtgfeyxiexzf(byte b) {
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        byte bM4469Ujhhgtgfeyxiexzf = m4469Ujhhgtgfeyxiexzf();
        if (bM4469Ujhhgtgfeyxiexzf == b) {
            return bM4469Ujhhgtgfeyxiexzf;
        }
        String strM4572feyxiexzfUjhhgtg = AbstractC3085Ujhhgtgfeyxiexzf.m4572feyxiexzfUjhhgtg(b);
        int i = this.f9376Ujhhgtgfeyxiexzf;
        int i2 = i > 0 ? i - 1 : i;
        m4462Ujhhgtgfeyxiexzf(this, "Expected " + strM4572feyxiexzfUjhhgtg + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, 4);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m4471Ujhhgtgfeyxiexzf(char c) {
        int i = this.f9376Ujhhgtgfeyxiexzf;
        if (i == -1) {
            m4500feyxiexzfUjhhgtg(c);
            throw null;
        }
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9376Ujhhgtgfeyxiexzf = i2;
                if (cCharAt == c) {
                    return;
                }
                m4500feyxiexzfUjhhgtg(c);
                throw null;
            }
            i = i2;
        }
        this.f9376Ujhhgtgfeyxiexzf = -1;
        m4500feyxiexzfUjhhgtg(c);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public long m4472Ujhhgtgfeyxiexzf() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iM4493feyxiexzfUjhhgtg = m4493feyxiexzfUjhhgtg(m4498feyxiexzfUjhhgtg());
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        if (iM4493feyxiexzfUjhhgtg >= str.length() || iM4493feyxiexzfUjhhgtg == -1) {
            m4462Ujhhgtgfeyxiexzf(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM4493feyxiexzfUjhhgtg) == '\"') {
            iM4493feyxiexzfUjhhgtg++;
            if (iM4493feyxiexzfUjhhgtg == str.length()) {
                m4462Ujhhgtgfeyxiexzf(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iM4493feyxiexzfUjhhgtg;
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
                    if (i == iM4493feyxiexzfUjhhgtg) {
                        m4462Ujhhgtgfeyxiexzf(this, "Unexpected symbol '-' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    if (cCharAt != '-') {
                        if (AbstractC3085Ujhhgtgfeyxiexzf.m4551Ujhhgtgfeyxiexzf(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m4462Ujhhgtgfeyxiexzf(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * ((long) 10)) + ((long) i3);
                        } else {
                            j4 = (j4 * ((long) 10)) - ((long) i3);
                            if (j4 > j3) {
                                m4462Ujhhgtgfeyxiexzf(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                        }
                        z = z2;
                        i = i2;
                    } else {
                        if (i != iM4493feyxiexzfUjhhgtg) {
                            m4462Ujhhgtgfeyxiexzf(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = true;
                    }
                } else {
                    if (i == iM4493feyxiexzfUjhhgtg) {
                        m4462Ujhhgtgfeyxiexzf(this, "Unexpected symbol '+' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = true;
                }
            } else {
                if (i == iM4493feyxiexzfUjhhgtg) {
                    m4462Ujhhgtgfeyxiexzf(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                    throw null;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iM4493feyxiexzfUjhhgtg;
        if (iM4493feyxiexzfUjhhgtg == i || (z5 && iM4493feyxiexzfUjhhgtg == i - 1)) {
            m4462Ujhhgtgfeyxiexzf(this, "Expected numeric literal", i, 4);
            throw null;
        }
        if (z2) {
            if (!z6) {
                m4462Ujhhgtgfeyxiexzf(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m4462Ujhhgtgfeyxiexzf(this, "Expected closing quotation mark", i, 4);
                throw null;
            }
            i++;
        }
        this.f9376Ujhhgtgfeyxiexzf = i;
        long j5 = j4;
        if (z4) {
            double d = j5;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    throw new C2870Ujhhgtgfeyxiexzf();
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m4462Ujhhgtgfeyxiexzf(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m4462Ujhhgtgfeyxiexzf(this, "Can't convert " + d2 + " to Long", 0, 6);
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
        m4462Ujhhgtgfeyxiexzf(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m4473Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = (ArrayList) this.f9379Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0787feyxiexzfUjhhgtg) this.f9380Ujhhgtgfeyxiexzf).m2096Ujhhgtgfeyxiexzf((C3016Ujhhgtgfeyxiexzf) arrayList.get(i));
        }
        m4494feyxiexzfUjhhgtg(arrayList);
        this.f9376Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public String m4474Ujhhgtgfeyxiexzf() {
        String str = (String) this.f9379Ujhhgtgfeyxiexzf;
        if (str == null) {
            return m4468Ujhhgtgfeyxiexzf();
        }
        this.f9379Ujhhgtgfeyxiexzf = null;
        return str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public String m4475Ujhhgtgfeyxiexzf() {
        String string;
        StringBuilder sb = (StringBuilder) this.f9380Ujhhgtgfeyxiexzf;
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        String str2 = (String) this.f9379Ujhhgtgfeyxiexzf;
        if (str2 != null) {
            this.f9379Ujhhgtgfeyxiexzf = null;
            return str2;
        }
        int iM4498feyxiexzfUjhhgtg = m4498feyxiexzfUjhhgtg();
        if (iM4498feyxiexzfUjhhgtg >= str.length() || iM4498feyxiexzfUjhhgtg == -1) {
            m4462Ujhhgtgfeyxiexzf(this, "EOF", iM4498feyxiexzfUjhhgtg, 4);
            throw null;
        }
        byte bM4551Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4551Ujhhgtgfeyxiexzf(str.charAt(iM4498feyxiexzfUjhhgtg));
        if (bM4551Ujhhgtgfeyxiexzf == 1) {
            return m4474Ujhhgtgfeyxiexzf();
        }
        if (bM4551Ujhhgtgfeyxiexzf != 0) {
            m4462Ujhhgtgfeyxiexzf(this, "Expected beginning of the string, but got " + str.charAt(iM4498feyxiexzfUjhhgtg), 0, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC3085Ujhhgtgfeyxiexzf.m4551Ujhhgtgfeyxiexzf(str.charAt(iM4498feyxiexzfUjhhgtg)) == 0) {
            iM4498feyxiexzfUjhhgtg++;
            if (iM4498feyxiexzfUjhhgtg >= str.length()) {
                sb.append((CharSequence) str, this.f9376Ujhhgtgfeyxiexzf, iM4498feyxiexzfUjhhgtg);
                int iM4493feyxiexzfUjhhgtg = m4493feyxiexzfUjhhgtg(iM4498feyxiexzfUjhhgtg);
                if (iM4493feyxiexzfUjhhgtg == -1) {
                    this.f9376Ujhhgtgfeyxiexzf = iM4498feyxiexzfUjhhgtg;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM4498feyxiexzfUjhhgtg = iM4493feyxiexzfUjhhgtg;
                z = true;
            }
        }
        if (z) {
            sb.append((CharSequence) str, this.f9376Ujhhgtgfeyxiexzf, iM4498feyxiexzfUjhhgtg);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(this.f9376Ujhhgtgfeyxiexzf, iM4498feyxiexzfUjhhgtg).toString();
        }
        this.f9376Ujhhgtgfeyxiexzf = iM4498feyxiexzfUjhhgtg;
        return string;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m4476Ujhhgtgfeyxiexzf() {
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) this.f9380Ujhhgtgfeyxiexzf;
        m4473Ujhhgtgfeyxiexzf();
        ArrayList arrayList = (ArrayList) this.f9378Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i);
            int i2 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
            if (i2 == 1) {
                c0787feyxiexzfUjhhgtg.m2096Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
                c0787feyxiexzfUjhhgtg.m2099Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
            } else if (i2 == 2) {
                c0787feyxiexzfUjhhgtg.m2096Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
                int i3 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                int i4 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                RecyclerView recyclerView = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
                recyclerView.m238feyxiexzfUjhhgtg(i3, i4, true);
                recyclerView.f415Ujhhgtgfeyxiexzf = true;
                recyclerView.f412feyxiexzfUjhhgtg.f3207Ujhhgtgfeyxiexzf += i4;
            } else if (i2 == 4) {
                c0787feyxiexzfUjhhgtg.m2096Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
                c0787feyxiexzfUjhhgtg.m2098Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf);
            } else if (i2 == 8) {
                c0787feyxiexzfUjhhgtg.m2096Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
                c0787feyxiexzfUjhhgtg.m2100Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
            }
        }
        m4494feyxiexzfUjhhgtg(arrayList);
        this.f9376Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m4477Ujhhgtgfeyxiexzf(C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf) {
        int i;
        C1441feyxiexzfUjhhgtg c1441feyxiexzfUjhhgtg = (C1441feyxiexzfUjhhgtg) this.f9377Ujhhgtgfeyxiexzf;
        int i2 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM4501feyxiexzfUjhhgtg = m4501feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, i2);
        int i3 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
        int i4 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c3016Ujhhgtgfeyxiexzf);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf; i6++) {
            int iM4501feyxiexzfUjhhgtg2 = m4501feyxiexzfUjhhgtg((i * i6) + c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf);
            int i7 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
            if (i7 == 2 ? iM4501feyxiexzfUjhhgtg2 != iM4501feyxiexzfUjhhgtg : !(i7 == 4 && iM4501feyxiexzfUjhhgtg2 == iM4501feyxiexzfUjhhgtg + 1)) {
                C3016Ujhhgtgfeyxiexzf c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg = m4486feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf, i7, iM4501feyxiexzfUjhhgtg, i5);
                m4478Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg, i3);
                c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg.f9373Ujhhgtgfeyxiexzf = null;
                c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg);
                if (c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM4501feyxiexzfUjhhgtg = iM4501feyxiexzfUjhhgtg2;
            } else {
                i5++;
            }
        }
        Object obj = c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf;
        c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf = null;
        c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
        if (i5 > 0) {
            C3016Ujhhgtgfeyxiexzf c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 = m4486feyxiexzfUjhhgtg(obj, c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf, iM4501feyxiexzfUjhhgtg, i5);
            m4478Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2, i3);
            c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2.f9373Ujhhgtgfeyxiexzf = null;
            c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public void m4478Ujhhgtgfeyxiexzf(C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf, int i) {
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) this.f9380Ujhhgtgfeyxiexzf;
        c0787feyxiexzfUjhhgtg.m2096Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
        int i2 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0787feyxiexzfUjhhgtg.m2098Ujhhgtgfeyxiexzf(i, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf);
        } else {
            int i3 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
            RecyclerView recyclerView = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
            recyclerView.m238feyxiexzfUjhhgtg(i, i3, true);
            recyclerView.f415Ujhhgtgfeyxiexzf = true;
            recyclerView.f412feyxiexzfUjhhgtg.f3207Ujhhgtgfeyxiexzf += i3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m4479Ujhhgtgfeyxiexzf(int i, String str, String str2) {
        throw new C0138Ujhhgtgfeyxiexzf(AbstractC3611Ujhhgtgfeyxiexzf.m5215Ujhhgtgfeyxiexzf(i, str, ((C3639Ujhhgtgfeyxiexzf) this.f9378Ujhhgtgfeyxiexzf).m5279Ujhhgtgfeyxiexzf(), str2, ((C0136Ujhhgtgfeyxiexzf) this.f9377Ujhhgtgfeyxiexzf).f1300Ujhhgtgfeyxiexzf ? AbstractC3611Ujhhgtgfeyxiexzf.m5222Ujhhgtgfeyxiexzf(i, (String) this.f9381Ujhhgtgfeyxiexzf).toString() : null));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int m4480Ujhhgtgfeyxiexzf(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f9379Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        while (i2 < size) {
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i2);
            int i3 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
            if (i3 == 8) {
                int i4 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                if (i4 == i) {
                    i = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int m4481Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
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
        m4462Ujhhgtgfeyxiexzf(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList m4482Ujhhgtgfeyxiexzf() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf;
        if (c1741Ujhhgtgfeyxiexzf != null) {
            return c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public PorterDuff.Mode m4483Ujhhgtgfeyxiexzf() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf;
        if (c1741Ujhhgtgfeyxiexzf != null) {
            return c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean m4484Ujhhgtgfeyxiexzf() {
        return ((ArrayList) this.f9378Ujhhgtgfeyxiexzf).size() > 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m4485feyxiexzfUjhhgtg(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM2360Ujhhgtgfeyxiexzf;
        View view = (View) this.f9377Ujhhgtgfeyxiexzf;
        Context context = view.getContext();
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3178Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        View view2 = (View) this.f9377Ujhhgtgfeyxiexzf;
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f9376Ujhhgtgfeyxiexzf = typedArray.getResourceId(0, -1);
                C2364Ujhhgtgfeyxiexzf c2364Ujhhgtgfeyxiexzf = (C2364Ujhhgtgfeyxiexzf) this.f9378Ujhhgtgfeyxiexzf;
                Context context2 = view.getContext();
                int i2 = this.f9376Ujhhgtgfeyxiexzf;
                synchronized (c2364Ujhhgtgfeyxiexzf) {
                    colorStateListM2360Ujhhgtgfeyxiexzf = c2364Ujhhgtgfeyxiexzf.f7709Ujhhgtgfeyxiexzf.m2360Ujhhgtgfeyxiexzf(context2, i2);
                }
                if (colorStateListM2360Ujhhgtgfeyxiexzf != null) {
                    m4495feyxiexzfUjhhgtg(colorStateListM2360Ujhhgtgfeyxiexzf);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArray.getInt(2, -1), null));
            }
            c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        } catch (Throwable th) {
            c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3016Ujhhgtgfeyxiexzf m4486feyxiexzfUjhhgtg(Object obj, int i, int i2, int i3) {
        C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) ((C1441feyxiexzfUjhhgtg) this.f9377Ujhhgtgfeyxiexzf).mo2933Ujhhgtgfeyxiexzf();
        if (c3016Ujhhgtgfeyxiexzf != null) {
            c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf = i;
            c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i2;
            c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf = i3;
            c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf = obj;
            return c3016Ujhhgtgfeyxiexzf;
        }
        C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf2 = new C3016Ujhhgtgfeyxiexzf();
        c3016Ujhhgtgfeyxiexzf2.f9371Ujhhgtgfeyxiexzf = i;
        c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i2;
        c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i3;
        c3016Ujhhgtgfeyxiexzf2.f9373Ujhhgtgfeyxiexzf = obj;
        return c3016Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m4487feyxiexzfUjhhgtg() {
        this.f9376Ujhhgtgfeyxiexzf = -1;
        m4495feyxiexzfUjhhgtg(null);
        m4464Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m4488feyxiexzfUjhhgtg(int i) {
        ColorStateList colorStateListM2360Ujhhgtgfeyxiexzf;
        this.f9376Ujhhgtgfeyxiexzf = i;
        C2364Ujhhgtgfeyxiexzf c2364Ujhhgtgfeyxiexzf = (C2364Ujhhgtgfeyxiexzf) this.f9378Ujhhgtgfeyxiexzf;
        if (c2364Ujhhgtgfeyxiexzf != null) {
            Context context = ((View) this.f9377Ujhhgtgfeyxiexzf).getContext();
            synchronized (c2364Ujhhgtgfeyxiexzf) {
                colorStateListM2360Ujhhgtgfeyxiexzf = c2364Ujhhgtgfeyxiexzf.f7709Ujhhgtgfeyxiexzf.m2360Ujhhgtgfeyxiexzf(context, i);
            }
        } else {
            colorStateListM2360Ujhhgtgfeyxiexzf = null;
        }
        m4495feyxiexzfUjhhgtg(colorStateListM2360Ujhhgtgfeyxiexzf);
        m4464Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public void m4489feyxiexzfUjhhgtg() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.f9379Ujhhgtgfeyxiexzf;
        StringBuffer stringBuffer2 = (StringBuffer) this.f9378Ujhhgtgfeyxiexzf;
        Writer writer = (Writer) this.f9377Ujhhgtgfeyxiexzf;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f9376Ujhhgtgfeyxiexzf - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public byte m4490feyxiexzfUjhhgtg() {
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        int i = this.f9376Ujhhgtgfeyxiexzf;
        while (true) {
            int iM4493feyxiexzfUjhhgtg = m4493feyxiexzfUjhhgtg(i);
            if (iM4493feyxiexzfUjhhgtg == -1) {
                this.f9376Ujhhgtgfeyxiexzf = iM4493feyxiexzfUjhhgtg;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM4493feyxiexzfUjhhgtg);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f9376Ujhhgtgfeyxiexzf = iM4493feyxiexzfUjhhgtg;
                return AbstractC3085Ujhhgtgfeyxiexzf.m4551Ujhhgtgfeyxiexzf(cCharAt);
            }
            i = iM4493feyxiexzfUjhhgtg + 1;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public void m4491feyxiexzfUjhhgtg(C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf) {
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) this.f9380Ujhhgtgfeyxiexzf;
        ((ArrayList) this.f9379Ujhhgtgfeyxiexzf).add(c3016Ujhhgtgfeyxiexzf);
        int i = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
        if (i == 1) {
            c0787feyxiexzfUjhhgtg.m2099Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
            return;
        }
        if (i == 2) {
            int i2 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
            int i3 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
            RecyclerView recyclerView = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
            recyclerView.m238feyxiexzfUjhhgtg(i2, i3, false);
            recyclerView.f415Ujhhgtgfeyxiexzf = true;
            return;
        }
        if (i == 4) {
            c0787feyxiexzfUjhhgtg.m2098Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf);
        } else if (i == 8) {
            c0787feyxiexzfUjhhgtg.m2100Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c3016Ujhhgtgfeyxiexzf);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public void m4492feyxiexzfUjhhgtg() {
        boolean z;
        byte b;
        C3016Ujhhgtgfeyxiexzf c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg;
        int i;
        int i2;
        int i3;
        C3016Ujhhgtgfeyxiexzf c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2;
        boolean z2;
        boolean z3;
        Object obj;
        C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C1441feyxiexzfUjhhgtg c1441feyxiexzfUjhhgtg = (C1441feyxiexzfUjhhgtg) this.f9377Ujhhgtgfeyxiexzf;
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) this.f9380Ujhhgtgfeyxiexzf;
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = (C0709Ujhhgtgfeyxiexzf) this.f9381Ujhhgtgfeyxiexzf;
        ArrayList arrayList = (ArrayList) this.f9378Ujhhgtgfeyxiexzf;
        c0709Ujhhgtgfeyxiexzf.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C3016Ujhhgtgfeyxiexzf) arrayList.get(size)).f9371Ujhhgtgfeyxiexzf == 8) {
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
            C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
            C1441feyxiexzfUjhhgtg c1441feyxiexzfUjhhgtg2 = (C1441feyxiexzfUjhhgtg) c3017Ujhhgtgfeyxiexzf.f9377Ujhhgtgfeyxiexzf;
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf2 = (C3016Ujhhgtgfeyxiexzf) arrayList.get(size);
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf3 = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i12);
            int i13 = c3016Ujhhgtgfeyxiexzf3.f9371Ujhhgtgfeyxiexzf;
            if (i13 == 1) {
                int i14 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                int i15 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i17 + c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                }
                int i18 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                if (i18 <= i14) {
                    c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i14 + c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                }
                c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf = i18 + i16;
                arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
            } else if (i13 == 2) {
                int i19 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                int i20 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                if (i19 < i20) {
                    if (c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf == i19 && c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf == i20 + 1 && c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                if (i20 < i21) {
                    c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf = i21 - 1;
                } else {
                    int i22 = c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                    if (i20 < i21 + i22) {
                        c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf = i22 - 1;
                        c3016Ujhhgtgfeyxiexzf2.f9371Ujhhgtgfeyxiexzf = 2;
                        c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = 1;
                        if (c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf == 0) {
                            arrayList.remove(i12);
                            c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf = null;
                            c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf3);
                        }
                    }
                }
                int i23 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                int i24 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                if (i23 <= i24) {
                    c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf = i24 + 1;
                } else {
                    int i25 = i24 + c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                    if (i23 < i25) {
                        obj = null;
                        C3016Ujhhgtgfeyxiexzf c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg3 = c3017Ujhhgtgfeyxiexzf.m4486feyxiexzfUjhhgtg(null, 2, i23 + 1, i25 - i23);
                        c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf - c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                        c3016Ujhhgtgfeyxiexzf = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg3;
                    }
                    if (z3) {
                        arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                        arrayList.remove(i12);
                        c3016Ujhhgtgfeyxiexzf2.f9373Ujhhgtgfeyxiexzf = obj;
                        c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf2);
                    } else {
                        if (z2) {
                            if (c3016Ujhhgtgfeyxiexzf != null) {
                                i10 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                                if (i10 > c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                    c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i10 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                                }
                                i11 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                                if (i11 > c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                    c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i11 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                                }
                            }
                            i8 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                            if (i8 > c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i8 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                            }
                            i9 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                            if (i9 > c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i9 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                            }
                        } else {
                            if (c3016Ujhhgtgfeyxiexzf != null) {
                                i6 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                                if (i6 >= c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                    c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i6 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                                }
                                i7 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                                if (i7 >= c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                    c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i7 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                                }
                            }
                            i4 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                            if (i4 >= c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i4 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                            }
                            i5 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                            if (i5 >= c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i5 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                            }
                        }
                        arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                        if (c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf != c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf) {
                            arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (c3016Ujhhgtgfeyxiexzf != null) {
                            arrayList.add(size, c3016Ujhhgtgfeyxiexzf);
                        }
                    }
                }
                obj = null;
                c3016Ujhhgtgfeyxiexzf = null;
                if (z3) {
                    arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                    arrayList.remove(i12);
                    c3016Ujhhgtgfeyxiexzf2.f9373Ujhhgtgfeyxiexzf = obj;
                    c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf2);
                } else {
                    if (z2) {
                        if (c3016Ujhhgtgfeyxiexzf != null) {
                            i10 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                            if (i10 > c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i10 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                            }
                            i11 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                            if (i11 > c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i11 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                            }
                        }
                        i8 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                        if (i8 > c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                            c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i8 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                        }
                        i9 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                        if (i9 > c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                            c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i9 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                        }
                    } else {
                        if (c3016Ujhhgtgfeyxiexzf != null) {
                            i6 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                            if (i6 >= c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i6 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                            }
                            i7 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                            if (i7 >= c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                                c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i7 - c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                            }
                        }
                        i4 = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                        if (i4 >= c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                            c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf = i4 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                        }
                        i5 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                        if (i5 >= c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf) {
                            c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf = i5 - c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                        }
                    }
                    arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                    if (c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf != c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf) {
                        arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (c3016Ujhhgtgfeyxiexzf != null) {
                        arrayList.add(size, c3016Ujhhgtgfeyxiexzf);
                    }
                }
            } else if (i13 == 4) {
                int i26 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                int i27 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                if (i26 < i27) {
                    c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf = i27 - 1;
                } else {
                    int i28 = c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                    if (i26 < i27 + i28) {
                        c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf = i28 - 1;
                        c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg = c3017Ujhhgtgfeyxiexzf.m4486feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf, 4, c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf, 1);
                    }
                    i = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                    i2 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                    if (i <= i2) {
                        c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf = i2 + 1;
                    } else {
                        i3 = i2 + c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                        if (i < i3) {
                            int i29 = i3 - i;
                            c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 = c3017Ujhhgtgfeyxiexzf.m4486feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf, 4, i + 1, i29);
                            c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf -= i29;
                        }
                        arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
                        if (c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf > 0) {
                            arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                        } else {
                            arrayList.remove(size);
                            c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf = null;
                            c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf3);
                        }
                        if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg != null) {
                            arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg);
                        }
                        if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 != null) {
                            arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2);
                        }
                    }
                    c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 = null;
                    arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
                    if (c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf > 0) {
                        arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                    } else {
                        arrayList.remove(size);
                        c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf = null;
                        c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf3);
                    }
                    if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg != null) {
                        arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg);
                    }
                    if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 != null) {
                        arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2);
                    }
                }
                c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg = null;
                i = c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf;
                i2 = c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf;
                if (i <= i2) {
                    c3016Ujhhgtgfeyxiexzf3.f9372Ujhhgtgfeyxiexzf = i2 + 1;
                } else {
                    i3 = i2 + c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf;
                    if (i < i3) {
                        int i210 = i3 - i;
                        c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 = c3017Ujhhgtgfeyxiexzf.m4486feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf, 4, i + 1, i210);
                        c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf -= i210;
                    }
                    arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
                    if (c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf > 0) {
                        arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                    } else {
                        arrayList.remove(size);
                        c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf = null;
                        c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf3);
                    }
                    if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg != null) {
                        arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg);
                    }
                    if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 != null) {
                        arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2);
                    }
                }
                c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 = null;
                arrayList.set(i12, c3016Ujhhgtgfeyxiexzf2);
                if (c3016Ujhhgtgfeyxiexzf3.f9374Ujhhgtgfeyxiexzf > 0) {
                    arrayList.set(size, c3016Ujhhgtgfeyxiexzf3);
                } else {
                    arrayList.remove(size);
                    c3016Ujhhgtgfeyxiexzf3.f9373Ujhhgtgfeyxiexzf = null;
                    c1441feyxiexzfUjhhgtg2.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf3);
                }
                if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg != null) {
                    arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg);
                }
                if (c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2 != null) {
                    arrayList.add(size, c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            C3016Ujhhgtgfeyxiexzf c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4 = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i30);
            int i31 = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9371Ujhhgtgfeyxiexzf;
            if (i31 == 1) {
                m4491feyxiexzfUjhhgtg(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
            } else if (i31 == 2) {
                int i32 = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9372Ujhhgtgfeyxiexzf;
                int i33 = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9374Ujhhgtgfeyxiexzf + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (c0787feyxiexzfUjhhgtg.m2097Ujhhgtgfeyxiexzf(i34) != null || m4466Ujhhgtgfeyxiexzf(i34)) {
                        if (b2 == 0) {
                            m4477Ujhhgtgfeyxiexzf(m4486feyxiexzfUjhhgtg(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m4491feyxiexzfUjhhgtg(m4486feyxiexzfUjhhgtg(null, 2, i32, i35));
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
                if (i35 != c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9374Ujhhgtgfeyxiexzf) {
                    c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9373Ujhhgtgfeyxiexzf = null;
                    c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
                    c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4 = m4486feyxiexzfUjhhgtg(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    m4477Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
                } else {
                    m4491feyxiexzfUjhhgtg(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
                }
            } else if (i31 == 4) {
                int i36 = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9372Ujhhgtgfeyxiexzf;
                int i37 = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9374Ujhhgtgfeyxiexzf + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (c0787feyxiexzfUjhhgtg.m2097Ujhhgtgfeyxiexzf(i36) != null || m4466Ujhhgtgfeyxiexzf(i36)) {
                        if (b3 == 0) {
                            m4477Ujhhgtgfeyxiexzf(m4486feyxiexzfUjhhgtg(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9373Ujhhgtgfeyxiexzf, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m4491feyxiexzfUjhhgtg(m4486feyxiexzfUjhhgtg(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9373Ujhhgtgfeyxiexzf, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9374Ujhhgtgfeyxiexzf) {
                    Object obj2 = c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9373Ujhhgtgfeyxiexzf;
                    c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4.f9373Ujhhgtgfeyxiexzf = null;
                    c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
                    c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4 = m4486feyxiexzfUjhhgtg(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    m4477Ujhhgtgfeyxiexzf(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
                } else {
                    m4491feyxiexzfUjhhgtg(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
                }
            } else if (i31 == 8) {
                m4491feyxiexzfUjhhgtg(c3016UjhhgtgfeyxiexzfM4486feyxiexzfUjhhgtg4);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int m4493feyxiexzfUjhhgtg(int i) {
        if (i < ((String) this.f9381Ujhhgtgfeyxiexzf).length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m4494feyxiexzfUjhhgtg(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i);
            c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf = null;
            ((C1441feyxiexzfUjhhgtg) this.f9377Ujhhgtgfeyxiexzf).mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public void m4495feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C1741Ujhhgtgfeyxiexzf) this.f9379Ujhhgtgfeyxiexzf) == null) {
                this.f9379Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
            }
            C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f9379Ujhhgtgfeyxiexzf;
            c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = colorStateList;
            c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = true;
        } else {
            this.f9379Ujhhgtgfeyxiexzf = null;
        }
        m4464Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m4496feyxiexzfUjhhgtg(ColorStateList colorStateList) {
        if (((C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf) == null) {
            this.f9380Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
        }
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf;
        c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = colorStateList;
        c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = true;
        m4464Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public void m4497feyxiexzfUjhhgtg(PorterDuff.Mode mode) {
        if (((C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf) == null) {
            this.f9380Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
        }
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f9380Ujhhgtgfeyxiexzf;
        c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf = mode;
        c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf = true;
        m4464Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public int m4498feyxiexzfUjhhgtg() {
        char cCharAt;
        int i = this.f9376Ujhhgtgfeyxiexzf;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f9376Ujhhgtgfeyxiexzf = i;
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean m4499feyxiexzfUjhhgtg() {
        int iM4498feyxiexzfUjhhgtg = m4498feyxiexzfUjhhgtg();
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        if (iM4498feyxiexzfUjhhgtg >= str.length() || iM4498feyxiexzfUjhhgtg == -1 || str.charAt(iM4498feyxiexzfUjhhgtg) != ',') {
            return false;
        }
        this.f9376Ujhhgtgfeyxiexzf++;
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m4500feyxiexzfUjhhgtg(char c) {
        String str = (String) this.f9381Ujhhgtgfeyxiexzf;
        int i = this.f9376Ujhhgtgfeyxiexzf;
        if (i > 0 && c == '\"') {
            try {
                this.f9376Ujhhgtgfeyxiexzf = i - 1;
                String strM4475Ujhhgtgfeyxiexzf = m4475Ujhhgtgfeyxiexzf();
                this.f9376Ujhhgtgfeyxiexzf = i;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strM4475Ujhhgtgfeyxiexzf, "null")) {
                    m4479Ujhhgtgfeyxiexzf(this.f9376Ujhhgtgfeyxiexzf - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f9376Ujhhgtgfeyxiexzf = i;
                throw th;
            }
        }
        String strM4572feyxiexzfUjhhgtg = AbstractC3085Ujhhgtgfeyxiexzf.m4572feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4551Ujhhgtgfeyxiexzf(c));
        int i2 = this.f9376Ujhhgtgfeyxiexzf;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m4462Ujhhgtgfeyxiexzf(this, "Expected " + strM4572feyxiexzfUjhhgtg + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, 4);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public int m4501feyxiexzfUjhhgtg(int i, int i2) {
        int i3;
        int i4;
        C1441feyxiexzfUjhhgtg c1441feyxiexzfUjhhgtg = (C1441feyxiexzfUjhhgtg) this.f9377Ujhhgtgfeyxiexzf;
        ArrayList arrayList = (ArrayList) this.f9379Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) arrayList.get(size);
            int i5 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
            if (i5 == 8) {
                int i6 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                int i7 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
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
                            c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i6 + 1;
                            c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf = i7 + 1;
                        } else if (i2 == 2) {
                            c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i6 - 1;
                            c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf = i7 + 1;
                    } else if (i2 == 2) {
                        c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i6 + 1;
                    } else if (i2 == 2) {
                        c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                    } else if (i5 == 2) {
                        i += c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                    }
                } else if (i2 == 1) {
                    c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i8 + 1;
                } else if (i2 == 2) {
                    c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf2 = (C3016Ujhhgtgfeyxiexzf) arrayList.get(size2);
            if (c3016Ujhhgtgfeyxiexzf2.f9371Ujhhgtgfeyxiexzf == 8) {
                int i9 = c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf;
                if (i9 == c3016Ujhhgtgfeyxiexzf2.f9372Ujhhgtgfeyxiexzf || i9 < 0) {
                    arrayList.remove(size2);
                    c3016Ujhhgtgfeyxiexzf2.f9373Ujhhgtgfeyxiexzf = null;
                    c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf2);
                }
            } else if (c3016Ujhhgtgfeyxiexzf2.f9374Ujhhgtgfeyxiexzf <= 0) {
                arrayList.remove(size2);
                c3016Ujhhgtgfeyxiexzf2.f9373Ujhhgtgfeyxiexzf = null;
                c1441feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c3016Ujhhgtgfeyxiexzf2);
            }
        }
        return i;
    }

    public C3017Ujhhgtgfeyxiexzf(C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg) {
        this.f9375Ujhhgtgfeyxiexzf = 0;
        this.f9377Ujhhgtgfeyxiexzf = new C1441feyxiexzfUjhhgtg(30);
        this.f9378Ujhhgtgfeyxiexzf = new ArrayList();
        this.f9379Ujhhgtgfeyxiexzf = new ArrayList();
        this.f9376Ujhhgtgfeyxiexzf = 0;
        this.f9380Ujhhgtgfeyxiexzf = c0787feyxiexzfUjhhgtg;
        this.f9381Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(this);
    }

    public C3017Ujhhgtgfeyxiexzf(StringWriter stringWriter, int i, int i2, String str) {
        this.f9375Ujhhgtgfeyxiexzf = 3;
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 >= 1) {
            StringWriter stringWriter2 = new StringWriter(1000);
            StringWriter stringWriter3 = new StringWriter(1000);
            this.f9377Ujhhgtgfeyxiexzf = stringWriter;
            this.f9376Ujhhgtgfeyxiexzf = i;
            this.f9378Ujhhgtgfeyxiexzf = stringWriter2.getBuffer();
            this.f9379Ujhhgtgfeyxiexzf = stringWriter3.getBuffer();
            this.f9380Ujhhgtgfeyxiexzf = new C0648Ujhhgtgfeyxiexzf(stringWriter2, i, "");
            this.f9381Ujhhgtgfeyxiexzf = new C0648Ujhhgtgfeyxiexzf(stringWriter3, i2, str);
            return;
        }
        throw new IllegalArgumentException("rightWidth < 1");
    }

    public C3017Ujhhgtgfeyxiexzf(String str, C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf) {
        this.f9375Ujhhgtgfeyxiexzf = 2;
        this.f9377Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf;
        this.f9378Ujhhgtgfeyxiexzf = new C3639Ujhhgtgfeyxiexzf(c0136Ujhhgtgfeyxiexzf);
        this.f9380Ujhhgtgfeyxiexzf = new StringBuilder();
        this.f9381Ujhhgtgfeyxiexzf = str;
    }
}
