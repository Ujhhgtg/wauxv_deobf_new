package p000;

import bsh.AbstractC0008;
import bsh.AbstractC0010;
import bsh.C0007;
import bsh.Primitive;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0334 extends AbstractC2707 implements InterfaceC2335 {

    public final /* synthetic */ int f1595;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0334(int i, int i2) {
        super(i);
        this.f1595 = i2;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public int getLineNumber() {
        switch (this.f1595) {
            case 7:
                return -1;
            default:
                return super.getLineNumber();
        }
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public String getText() {
        switch (this.f1595) {
            case 7:
                return "<Compiled Java Code>";
            default:
                return super.getText();
        }
    }

    @Override // p000.AbstractC2707
    public String toString() {
        switch (this.f1595) {
            case 3:
                return AbstractC2784.m4752(new StringBuilder(), super.toString(), ": switch");
            case 4:
            case 5:
            default:
                return super.toString();
            case 6:
                return AbstractC2784.m4752(new StringBuilder(), super.toString(), ": when");
            case 7:
                return "JavaCode";
        }
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public String mo1450() {
        switch (this.f1595) {
            case 7:
                return "<Called from Java Code>";
            default:
                return super.mo1450();
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        int i;
        boolean zEquals;
        boolean zEquals2;
        switch (this.f1595) {
            case 0:
                try {
                    return AbstractC0010.m414(0, ((C0356) this.f8721[0]).m1467(c0550, runnableC1668), this.f8721[1].mo306(c0550, runnableC1668));
                } catch (C3523 e) {
                    throw e.mo4643(this, c0550);
                }
            case 1:
                C0326 c0326 = (C0326) this.f8721[0];
                C0007 c0007M1929 = c0550.m1929();
                String str = c0326.f1577;
                c0007M1929.f502 = str;
                c0007M1929.mo312(str);
                return Primitive.VOID;
            case 2:
                int length = m4710().length;
                for (int i2 = 0; i2 < length; i2++) {
                    this.f8721[i2].mo306(c0550, runnableC1668);
                }
                return Primitive.VOID;
            case 3:
                int length2 = m4710().length;
                InterfaceC2225 interfaceC2225 = this.f8721[0];
                Object objMo306 = interfaceC2225.mo306(c0550, runnableC1668);
                if (Primitive.unwrap(objMo306) != null && objMo306.getClass().isEnum()) {
                    c0550.m1929().m359(objMo306.getClass());
                }
                if (1 >= length2) {
                    throw new C1230("Empty switch statement.", this, c0550);
                }
                C0353 c0353 = (C0353) this.f8721[1];
                C2588 c2588 = null;
                int i3 = 2;
                while (i3 < length2 && c2588 == null) {
                    if (!c0353.f1663) {
                        Object objMo307 = c0353.mo306(c0550, runnableC1668);
                        if (objMo307 == Primitive.VOID) {
                            zEquals = false;
                        } else if ((objMo306 instanceof Primitive) || (objMo307 instanceof Primitive)) {
                            try {
                                zEquals = Primitive.unwrap(AbstractC0008.m373(objMo306, 94, objMo307)).equals(Boolean.TRUE);
                            } catch (C3523 e2) {
                                throw e2.mo4644("Switch value: " + interfaceC2225.getText() + ": ", this, c0550);
                            }
                        } else {
                            zEquals = objMo306.equals(objMo307);
                        }
                        if (!zEquals) {
                            while (true) {
                                i = i3 + 1;
                                InterfaceC2225 interfaceC2226 = this.f8721[i3];
                                if (interfaceC2226 instanceof C0353) {
                                    c0353 = (C0353) interfaceC2226;
                                    i3 = i;
                                }
                                i3 = i;
                                break;
                            }
                        }
                        break;
                    }
                    while (i3 < length2) {
                        i = i3 + 1;
                        InterfaceC2225 interfaceC2227 = this.f8721[i3];
                        if (!(interfaceC2227 instanceof C0353)) {
                            Object objMo308 = interfaceC2227.mo306(c0550, runnableC1668);
                            if (objMo308 instanceof C2588) {
                                c2588 = (C2588) objMo308;
                                i3 = i;
                            }
                            break;
                        }
                        i3 = i;
                    }
                }
                return (c2588 == null || c2588.f8194 != 49) ? Primitive.VOID : c2588;
            case 4:
                InterfaceC2225[] interfaceC2225Arr = this.f8721;
                return C0341.m1454(interfaceC2225Arr[0], c0550, runnableC1668) ? interfaceC2225Arr[1].mo306(c0550, runnableC1668) : interfaceC2225Arr[2].mo306(c0550, runnableC1668);
            case 5:
                Object objMo309 = this.f8721[0].mo306(c0550, runnableC1668);
                if (objMo309 instanceof Throwable) {
                    throw new C2895((Throwable) objMo309, this, c0550);
                }
                throw new C1230("Expression in 'throw' must be Throwable type", this, c0550);
            case 6:
                int length3 = m4710().length;
                if (length3 < 2) {
                    throw new C1230("Empty when expression.", this, c0550);
                }
                for (int i4 = 1; i4 < length3; i4++) {
                    if (((C0360) this.f8721[i4]).f1677 && i4 != length3 - 1) {
                        throw new C1230("Else branch must be the last one in when expression.", this, c0550);
                    }
                }
                InterfaceC2225 interfaceC2228 = this.f8721[0];
                Object objMo3010 = interfaceC2228.mo306(c0550, runnableC1668);
                for (int i5 = 1; i5 < length3; i5++) {
                    C0360 c0360 = (C0360) this.f8721[i5];
                    if (c0360.f1677) {
                        return c0360.m1472(c0550, runnableC1668);
                    }
                    for (int i6 = 0; i6 < c0360.f1678; i6++) {
                        Object objMo3011 = c0360.f8721[i6].mo306(c0550, runnableC1668);
                        Primitive primitive = Primitive.VOID;
                        if (objMo3010 != primitive && objMo3011 != primitive) {
                            Primitive primitive2 = Primitive.NULL;
                            Object obj = objMo3010 == primitive2 ? null : objMo3010;
                            if (objMo3011 == primitive2) {
                                objMo3011 = null;
                            }
                            if (obj != null && objMo3011 != null) {
                                if ((obj instanceof Primitive) || (objMo3011 instanceof Primitive)) {
                                    try {
                                        zEquals2 = Primitive.unwrap(AbstractC0008.m373(obj, 94, objMo3011)).equals(Boolean.TRUE);
                                    } catch (C3523 e3) {
                                        throw e3.mo4644("When value: " + interfaceC2228.getText() + ": ", this, c0550);
                                    }
                                } else {
                                    zEquals2 = obj.equals(objMo3011);
                                }
                                break;
                            } else if (obj == objMo3011) {
                                zEquals2 = true;
                            } else {
                                zEquals2 = false;
                            }
                        } else {
                            zEquals2 = false;
                        }
                        if (zEquals2) {
                            return c0360.m1472(c0550, runnableC1668);
                        }
                    }
                }
                throw new C1230("No matching when branch.", this, c0550);
            default:
                return super.mo306(c0550, runnableC1668);
        }
    }
}
