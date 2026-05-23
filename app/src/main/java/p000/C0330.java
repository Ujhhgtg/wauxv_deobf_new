package p000;

import bsh.AbstractC0008;
import bsh.AbstractC0010;
import bsh.Primitive;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0330 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Integer f1584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static Object m1441(Object obj, int i, Object obj2) throws C3523 {
        if ((obj instanceof String) || obj.getClass().isArray()) {
            return AbstractC0008.m370(obj, i, obj2);
        }
        if (obj2 == Primitive.NULL) {
            throw new C3523("Illegal use of null object or 'null' literal");
        }
        if (((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof Primitive)) && ((obj2 instanceof Boolean) || (obj2 instanceof Character) || (obj2 instanceof Number) || (obj2 instanceof Primitive))) {
            return AbstractC0008.m373(obj, i, obj2);
        }
        throw new C3523("Non primitive value in operator: " + obj.getClass() + " " + InterfaceC2335.f7500[i] + " " + obj2.getClass());
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (this.f1584 == null) {
            str = "";
        } else {
            str = ": " + InterfaceC2335.f7500[this.f1584.intValue()];
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        Object objM3498;
        if (this.f1584 == null) {
            try {
                return this.f8721[0].mo306(c0550, runnableC1668);
            } catch (C2622 unused) {
                return Primitive.NULL;
            }
        }
        C0348 c0348 = (C0348) this.f8721[0];
        runnableC1668.getClass();
        c0348.getClass();
        C1751 c1751 = (C1751) c0348.m1459(c0550, runnableC1668, !c0348.f1651);
        Class clsM419 = null;
        if (this.f1584.intValue() != 87) {
            try {
                objM3498 = c1751.m3498();
            } catch (C3523 e) {
                throw e.mo4643(this, c0550);
            }
        } else {
            objM3498 = null;
        }
        if (this.f1584.intValue() == 148 && Primitive.NULL != objM3498) {
            return objM3498;
        }
        Object objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
        if (objMo306 == Primitive.VOID) {
            throw new C1230("illegal void assignment", this, c0550);
        }
        try {
            int iIntValue = this.f1584.intValue();
            if (iIntValue == 87) {
                if (!(c1751.m3500() == null ? false : c1751.f5858.m5125("final"))) {
                    return c1751.m3497(objMo306, false);
                }
                c1751.m3500().m5126(1, objMo306);
                return objMo306;
            }
            if (iIntValue == 148) {
                return c1751.m3497(objMo306, false);
            }
            switch (iIntValue) {
                case 126:
                    if (Primitive.NULL == objM3498) {
                        AbstractC1672 abstractC1672 = c1751.f5855;
                        if (abstractC1672 != null) {
                            clsM419 = abstractC1672.mo2346();
                        } else if (c1751.m3500() != null) {
                            clsM419 = c1751.f5858.f11061;
                        } else {
                            try {
                                clsM419 = AbstractC0010.m419(c1751.m3499(), false);
                                break;
                            } catch (C3523 unused2) {
                            }
                        }
                        if (clsM419 == String.class) {
                            objM3498 = "null";
                        }
                    }
                    return c1751.m3497(m1441(objM3498, 106, objMo306), false);
                case 127:
                    return c1751.m3497(m1441(objM3498, 107, objMo306), false);
                case 128:
                    return c1751.m3497(m1441(objM3498, Opcodes.IDIV, objMo306), false);
                case Opcodes.LOR /* 129 */:
                    return c1751.m3497(m1441(objM3498, Opcodes.LDIV, objMo306), false);
                case Opcodes.IXOR /* 130 */:
                case Opcodes.LXOR /* 131 */:
                    return c1751.m3497(m1441(objM3498, UMErrorCode.E_UM_BE_JSON_FAILED, objMo306), false);
                case Opcodes.IINC /* 132 */:
                case Opcodes.I2L /* 133 */:
                    return c1751.m3497(m1441(objM3498, 112, objMo306), false);
                case Opcodes.I2F /* 134 */:
                case Opcodes.I2D /* 135 */:
                    return c1751.m3497(m1441(objM3498, UMErrorCode.E_UM_BE_FILE_OVERSIZE, objMo306), false);
                case Opcodes.L2I /* 136 */:
                case 137:
                    return c1751.m3497(m1441(objM3498, Opcodes.INEG, objMo306), false);
                case 138:
                case Opcodes.F2I /* 139 */:
                    return c1751.m3497(m1441(objM3498, Opcodes.FNEG, objMo306), false);
                case Opcodes.F2L /* 140 */:
                case 141:
                    return c1751.m3497(m1441(objM3498, 120, objMo306), false);
                case Opcodes.D2I /* 142 */:
                case Opcodes.D2L /* 143 */:
                    return c1751.m3497(m1441(objM3498, 122, objMo306), false);
                case 144:
                case Opcodes.I2B /* 145 */:
                    return c1751.m3497(m1441(objM3498, Opcodes.IUSHR, objMo306), false);
                default:
                    throw new C1669("unimplemented operator in assignment BSH");
            }
        } catch (C3523 e2) {
            throw e2.mo4643(this, c0550);
        }
    }
}
