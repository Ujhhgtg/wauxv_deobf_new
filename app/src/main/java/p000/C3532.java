package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.Primitive;
import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3532 implements Serializable, InterfaceC0480, Cloneable {

    public final String f11060;

    public Class f11061;

    public String f11062;

    public Object f11063;

    public C2000 f11064;

    public final C1751 f11065;

    public C3532(String str, Class cls, C1751 c1751) {
        this.f11060 = str;
        this.f11065 = c1751;
        this.f11061 = cls;
    }

    public final String toString() {
        return "Variable: " + AbstractC2202.m4021(this) + ", value:" + this.f11063 + ", lhs = " + this.f11065;
    }

    public final C3532 clone() {
        try {
            C3532 c3532 = (C3532) super.clone();
            C2000 c2000 = c3532.f11064;
            c3532.f11064 = c2000 != null ? c2000.m3862() : null;
            return c3532;
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // p000.InterfaceC0480
    public final void mo343() {
        if (AbstractC0009.m401(this.f11061)) {
            try {
                this.f11061 = AbstractC0009.m394(this.f11061).m344(this.f11061.getName());
            } catch (C3523 unused) {
            }
        }
    }

    public final C2000 m5123() {
        if (this.f11064 == null) {
            this.f11064 = new C2000(3);
        }
        return this.f11064;
    }

    public final Object m5124() {
        C1751 c1751 = this.f11065;
        if (c1751 != null) {
            return this.f11061 == null ? c1751.m3498() : Primitive.wrap(c1751.m3498(), (Class<?>) this.f11061);
        }
        return this.f11063;
    }

    public final boolean m5125(String str) {
        return m5123().m3864(str);
    }

    public final void m5126(int i, Object obj) {
        if (m5125("final")) {
            if (this.f11063 != null) {
                throw new C3523(AbstractC2784.m4752(new StringBuilder("Cannot re-assign final variable "), this.f11060, "."));
            }
            if (obj == null) {
                return;
            }
        }
        Class cls = this.f11061;
        if (cls != null && cls != Object.class && obj != null) {
            obj = AbstractC0010.m414(i == 0 ? 0 : 1, cls, obj);
            this.f11063 = obj;
        }
        this.f11063 = obj;
        if (obj == null && i != 0) {
            this.f11063 = Primitive.getDefaultValue(this.f11061);
        }
        C1751 c1751 = this.f11065;
        if (c1751 != null) {
            this.f11063 = c1751.m3497(this.f11063, false);
        }
    }

    public final void m5127(boolean z) {
        if (m5125("final") && this.f11063 == null && z == m5125("static")) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "Static f" : "F");
            sb.append("inal variable ");
            throw new RuntimeException(AbstractC2784.m4752(sb, this.f11060, " is not initialized."));
        }
    }

    public C3532(String str, Class cls, Object obj, C2000 c2000) {
        this.f11060 = str;
        this.f11061 = cls;
        this.f11064 = c2000;
        m5126(0, obj);
    }
}
