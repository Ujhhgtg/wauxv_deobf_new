package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.C0007;
import bsh.Primitive;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1751 implements InterfaceC2335, Serializable {

    public final C0007 f5850;

    public final boolean f5851;

    public int f5852;

    public final String f5853;

    public final Object f5854;

    public final AbstractC1672 f5855;

    public Object f5856;

    public int f5857;

    public C3532 f5858;

    public C1751(C0007 c0007, String str, boolean z) {
        this.f5852 = 0;
        this.f5851 = z;
        this.f5853 = str;
        this.f5850 = c0007;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LHS: ");
        String str3 = "";
        AbstractC1672 abstractC1672 = this.f5855;
        if (abstractC1672 != null) {
            str = "field = " + abstractC1672.f5643;
        } else {
            str = "";
        }
        sb.append(str);
        String str4 = this.f5853;
        if (str4 != null) {
            str2 = " varName = " + str4;
        } else {
            str2 = "";
        }
        sb.append(str2);
        C0007 c0007 = this.f5850;
        if (c0007 != null) {
            str3 = " nameSpace = " + c0007.toString();
        }
        sb.append(str3);
        return sb.toString();
    }

    public final Object m3497(Object obj, boolean z) {
        Object obj2 = this.f5854;
        AbstractC1672 abstractC1672 = this.f5855;
        Object obj3 = this.f5856;
        int i = this.f5852;
        String str = this.f5853;
        C0007 c0007 = this.f5850;
        if (i == 0) {
            if (this.f5851) {
                c0007.m369(str, obj, z, false);
            } else {
                c0007.m369(str, obj, z, true);
            }
            return m3499();
        }
        if (i == 1) {
            try {
                Object[] objArr = AbstractC0009.f516;
                int modifiers = abstractC1672.getModifiers();
                String str2 = abstractC1672.f5644;
                if (Modifier.isStatic(modifiers)) {
                    RunnableC1668.f5631.m3669(obj, abstractC1672.f5646, str2);
                } else {
                    RunnableC1668.f5631.m3668(obj3, str2, obj);
                }
                abstractC1672.mo3012(obj3, obj);
                return m3499();
            } catch (ReflectiveOperationException e) {
                throw new C3523("LHS (" + abstractC1672.f5644 + ") can't access field: " + e, e);
            }
        }
        if (i == 2) {
            try {
                if (!(obj2 instanceof String)) {
                    return AbstractC0009.m407(obj3, obj2, obj);
                }
                String str3 = (String) obj2;
                Object[] objArr2 = AbstractC0009.f516;
                Map map = AbstractC0010.f522;
                return ((obj3 instanceof Map.Entry) && (str3.equals("val") || str3.equals("value"))) ? ((Map.Entry) obj3).setValue(obj) : AbstractC0009.m407(obj3, str3, obj);
            } catch (C2518 e2) {
                RunnableC1668.m3389("Assignment: " + e2.getMessage());
                throw new C3523("No such property: " + obj2, e2);
            }
        }
        if (i != 3) {
            if (i != 5) {
                if (i == 6) {
                    return obj3 instanceof Map.Entry ? ((Map.Entry) obj3).setValue(obj) : new C3468(obj3, obj);
                }
                throw new C1669("unknown lhs type");
            }
            C2000 c2000 = new C2000(3);
            c2000.m3860("public");
            if (c0007.f509) {
                c2000.f6669 = 25;
            }
            c0007.m367(str, AbstractC0010.m419(obj, false), obj, c2000);
            return obj;
        }
        try {
            if (obj3.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC0010.m414(1, AbstractC0010.m412(obj3.getClass()), obj);
                } catch (Exception unused) {
                }
            }
            AbstractC2201.m3986(obj3, this.f5857, obj);
            return obj;
        } catch (C3524 e3) {
            if (!IndexOutOfBoundsException.class.isAssignableFrom(e3.getCause().getClass())) {
                throw e3;
            }
            throw new C3523("Error array set index: " + e3.getMessage(), e3);
        } catch (Exception e4) {
            throw new C3523("Assignment: " + e4.getMessage(), e4);
        }
    }

    public final Object m3498() {
        if (this.f5852 == 1) {
            Object[] objArr = AbstractC0009.f516;
            AbstractC1672 abstractC1672 = this.f5855;
            if (Modifier.isStatic(abstractC1672.getModifiers())) {
                RunnableC1668.f5631.m3665(abstractC1672.f5646, abstractC1672.f5644);
            } else {
                RunnableC1668.f5631.m3664();
            }
        }
        return m3499();
    }

    public final Object m3499() throws C3523 {
        Object obj = this.f5854;
        AbstractC1672 abstractC1672 = this.f5855;
        Object obj2 = this.f5856;
        int i = this.f5852;
        String str = this.f5853;
        C0007 c0007 = this.f5850;
        if (i == 0) {
            Object objM356 = c0007.m356(str, true);
            return objM356 == Primitive.VOID ? c0007.m355(str, null) : objM356;
        }
        if (i == 1) {
            try {
                return abstractC1672.mo3012(obj2, new Object[0]);
            } catch (ReflectiveOperationException e) {
                throw new C3523("Can't read field: " + abstractC1672, e);
            }
        }
        if (i == 2) {
            try {
                return AbstractC0009.m392(obj2, obj);
            } catch (C2518 e2) {
                RunnableC1668.m3389(e2.getMessage());
                throw new C3523("No such property: " + obj, e2);
            }
        }
        if (i != 3) {
            if (i == 5) {
                return c0007.m356(str, true);
            }
            throw new C1669("LHS type");
        }
        try {
            return AbstractC2201.m3969(this.f5857, obj2);
        } catch (Exception e3) {
            throw new C3523("Array access: " + e3, e3);
        }
    }

    public final C3532 m3500() {
        boolean zM5125;
        Object obj = this.f5856;
        C3532 c3532 = this.f5858;
        if (c3532 != null) {
            return c3532;
        }
        C3532 c3532M357 = null;
        String str = this.f5853;
        AbstractC1672 abstractC1672 = this.f5855;
        C0007 c0007 = this.f5850;
        if (c0007 != null) {
            if (abstractC1672 != null) {
                str = abstractC1672.f5644;
            } else if (false) {
                str = c3532.f11060;
            }
            Object[] objArr = AbstractC0009.f516;
            try {
                c3532M357 = c0007.m357(str, false);
            } catch (Exception unused) {
            }
            this.f5858 = c3532M357;
        } else {
            if (abstractC1672 != null) {
                zM5125 = abstractC1672.mo2348();
            } else {
                zM5125 = true ? false : c3532.m5125("static");
            }
            if (zM5125) {
                if (AbstractC0009.m401(abstractC1672.f5646)) {
                    Class cls = abstractC1672.f5646;
                    if (true) {
                        str = abstractC1672.f5644;
                    } else {
                        C3532 c3533 = this.f5858;
                        if (c3533 != null) {
                            str = c3533.f11060;
                        }
                    }
                    C0007 c0007M394 = AbstractC0009.m394(cls);
                    if (c0007M394 != null) {
                        try {
                            c3532M357 = c0007M394.m357(str, false);
                        } catch (Exception unused2) {
                        }
                    }
                    this.f5858 = c3532M357;
                } else {
                    this.f5858 = new C3532(abstractC1672.f5644, abstractC1672.mo2346(), this);
                }
            } else if (AbstractC0009.m401(obj.getClass())) {
                if (abstractC1672 != null) {
                    str = abstractC1672.f5644;
                } else {
                    C3532 c3534 = this.f5858;
                    if (c3534 != null) {
                        str = c3534.f11060;
                    }
                }
                C0007 c0007M395 = AbstractC0009.m395(obj);
                if (c0007M395 != null) {
                    try {
                        c3532M357 = c0007M395.m357(str, false);
                    } catch (Exception unused3) {
                    }
                }
                this.f5858 = c3532M357;
            } else if (abstractC1672 != null) {
                this.f5858 = new C3532(abstractC1672.f5644, abstractC1672.mo2346(), this);
            }
        }
        return this.f5858;
    }

    public C1751(C0007 c0007, String str) {
        this.f5852 = 5;
        this.f5853 = str;
        this.f5850 = c0007;
    }

    public C1751(AbstractC1672 abstractC1672) {
        this.f5852 = 1;
        this.f5856 = abstractC1672.f5646;
        this.f5855 = abstractC1672;
        this.f5853 = abstractC1672.f5644;
    }

    public C1751(AbstractC1672 abstractC1672, Object obj) {
        if (obj != null) {
            this.f5852 = 1;
            this.f5856 = obj;
            this.f5855 = abstractC1672;
            if (abstractC1672 != null) {
                this.f5853 = abstractC1672.f5644;
                return;
            }
            return;
        }
        throw new NullPointerException("constructed empty LHS");
    }

    public C1751(Object obj, Object obj2) {
        if (obj != null) {
            this.f5852 = 2;
            this.f5856 = obj;
            this.f5854 = obj2;
            return;
        }
        throw new NullPointerException("constructed empty LHS");
    }

    public C1751(Object obj) {
        this.f5852 = 6;
        this.f5856 = obj;
    }
}
