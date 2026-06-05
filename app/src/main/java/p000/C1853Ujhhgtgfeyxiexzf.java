package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.Modifiers;
import bsh.Primitive;
import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱᛳ要点脸能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1853Ujhhgtgfeyxiexzf implements Serializable, InterfaceC2573Ujhhgtgfeyxiexzf, Cloneable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f6220Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Class f6221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public String f6222Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f6223Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Modifiers f6224Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C0151Ujhhgtgfeyxiexzf f6225Ujhhgtgfeyxiexzf;

    public C1853Ujhhgtgfeyxiexzf(String str, Class cls, C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf) {
        this.f6220Ujhhgtgfeyxiexzf = str;
        this.f6225Ujhhgtgfeyxiexzf = c0151Ujhhgtgfeyxiexzf;
        this.f6221Ujhhgtgfeyxiexzf = cls;
    }

    @Override // p000.InterfaceC2573Ujhhgtgfeyxiexzf
    public final void classLoaderChanged() {
        if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(this.f6221Ujhhgtgfeyxiexzf)) {
            try {
                this.f6221Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m538Ujhhgtgfeyxiexzf(this.f6221Ujhhgtgfeyxiexzf).m362Ujhhgtgfeyxiexzf(this.f6221Ujhhgtgfeyxiexzf.getName());
            } catch (C1863Ujhhgtgfeyxiexzf unused) {
            }
        }
    }

    public final String toString() {
        return "Variable: " + AbstractC3594Ujhhgtgfeyxiexzf.m5200feyxiexzfUjhhgtg(this) + ", value:" + this.f6223Ujhhgtgfeyxiexzf + ", lhs = " + this.f6225Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1853Ujhhgtgfeyxiexzf clone() {
        try {
            C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf = (C1853Ujhhgtgfeyxiexzf) super.clone();
            Modifiers modifiers = c1853Ujhhgtgfeyxiexzf.f6224Ujhhgtgfeyxiexzf;
            c1853Ujhhgtgfeyxiexzf.f6224Ujhhgtgfeyxiexzf = modifiers != null ? modifiers.m295clone() : null;
            return c1853Ujhhgtgfeyxiexzf;
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Modifiers m3186Ujhhgtgfeyxiexzf() {
        if (this.f6224Ujhhgtgfeyxiexzf == null) {
            this.f6224Ujhhgtgfeyxiexzf = new Modifiers(3);
        }
        return this.f6224Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object m3187Ujhhgtgfeyxiexzf() {
        C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf = this.f6225Ujhhgtgfeyxiexzf;
        if (c0151Ujhhgtgfeyxiexzf != null) {
            return this.f6221Ujhhgtgfeyxiexzf == null ? c0151Ujhhgtgfeyxiexzf.m1195Ujhhgtgfeyxiexzf() : Primitive.wrap(c0151Ujhhgtgfeyxiexzf.m1195Ujhhgtgfeyxiexzf(), (Class<?>) this.f6221Ujhhgtgfeyxiexzf);
        }
        return this.f6223Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m3188Ujhhgtgfeyxiexzf(String str) {
        return m3186Ujhhgtgfeyxiexzf().hasModifier(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3189Ujhhgtgfeyxiexzf(int i, Object obj) {
        if (m3188Ujhhgtgfeyxiexzf("final")) {
            if (this.f6223Ujhhgtgfeyxiexzf != null) {
                throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Cannot re-assign final variable "), this.f6220Ujhhgtgfeyxiexzf, "."));
            }
            if (obj == null) {
                return;
            }
        }
        Class cls = this.f6221Ujhhgtgfeyxiexzf;
        if (cls != null && cls != Object.class && obj != null) {
            obj = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(i == 0 ? 0 : 1, cls, obj);
            this.f6223Ujhhgtgfeyxiexzf = obj;
        }
        this.f6223Ujhhgtgfeyxiexzf = obj;
        if (obj == null && i != 0) {
            this.f6223Ujhhgtgfeyxiexzf = Primitive.getDefaultValue(this.f6221Ujhhgtgfeyxiexzf);
        }
        C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf = this.f6225Ujhhgtgfeyxiexzf;
        if (c0151Ujhhgtgfeyxiexzf != null) {
            this.f6223Ujhhgtgfeyxiexzf = c0151Ujhhgtgfeyxiexzf.m1194Ujhhgtgfeyxiexzf(this.f6223Ujhhgtgfeyxiexzf, false);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3190Ujhhgtgfeyxiexzf(boolean z) {
        if (m3188Ujhhgtgfeyxiexzf("final") && this.f6223Ujhhgtgfeyxiexzf == null && z == m3188Ujhhgtgfeyxiexzf("static")) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "Static f" : "F");
            sb.append("inal variable ");
            throw new RuntimeException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, this.f6220Ujhhgtgfeyxiexzf, " is not initialized."));
        }
    }

    public C1853Ujhhgtgfeyxiexzf(String str, Class cls, Object obj, Modifiers modifiers) {
        this.f6220Ujhhgtgfeyxiexzf = str;
        this.f6221Ujhhgtgfeyxiexzf = cls;
        this.f6224Ujhhgtgfeyxiexzf = modifiers;
        m3189Ujhhgtgfeyxiexzf(0, obj);
    }
}
