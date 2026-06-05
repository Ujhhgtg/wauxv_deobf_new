package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛳ能不能要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0220Ujhhgtgfeyxiexzf implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1501Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0216Ujhhgtgfeyxiexzf f1502Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0220Ujhhgtgfeyxiexzf(C0216Ujhhgtgfeyxiexzf c0216Ujhhgtgfeyxiexzf, int i) {
        this.f1501Ujhhgtgfeyxiexzf = i;
        this.f1502Ujhhgtgfeyxiexzf = c0216Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        boolean zM4512Ujhhgtgfeyxiexzf;
        boolean z;
        boolean z2;
        switch (this.f1501Ujhhgtgfeyxiexzf) {
            case 0:
                zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((Method) obj2).getReturnType(), C0374Ujhhgtgfeyxiexzf.m1620Ujhhgtgfeyxiexzf(obj, this.f1502Ujhhgtgfeyxiexzf, "Method: returnType"));
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 1:
                List list = (List) obj;
                List listM3653feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getParameterTypes());
                boolean z3 = false;
                if (list.size() == listM3653feyxiexzfUjhhgtg.size()) {
                    int i = 0;
                    for (Object obj3 : list) {
                        int i2 = i + 1;
                        Class cls = (Class) listM3653feyxiexzfUjhhgtg.get(i);
                        Class clsM1620Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1620Ujhhgtgfeyxiexzf(obj3, this.f1502Ujhhgtgfeyxiexzf, null);
                        Class<C1843Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(C1843Ujhhgtgfeyxiexzf.class));
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(clsM1620Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : C1843Ujhhgtgfeyxiexzf.class) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, clsM1620Ujhhgtgfeyxiexzf)) {
                            i = i2;
                        }
                    }
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 2:
                List list2 = (List) obj;
                Annotation[][] parameterAnnotations = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                boolean z4 = false;
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(AbstractC3593Ujhhgtgfeyxiexzf.m5155Ujhhgtgfeyxiexzf(annotation).mo2998Ujhhgtgfeyxiexzf());
                    }
                    arrayList.add(arrayList2);
                }
                if (list2.size() == arrayList.size()) {
                    Iterator it = list2.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        int i4 = i3 + 1;
                        if (C0374Ujhhgtgfeyxiexzf.m1606Ujhhgtgfeyxiexzf((Collection) it.next(), (List) arrayList.get(i3), this.f1502Ujhhgtgfeyxiexzf)) {
                            i3 = i4;
                        }
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                List list3 = (List) obj;
                Annotation[][] parameterAnnotations2 = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList3 = new ArrayList(parameterAnnotations2.length);
                boolean z5 = false;
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList4 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList4.add(AbstractC3593Ujhhgtgfeyxiexzf.m5155Ujhhgtgfeyxiexzf(annotation2).mo2998Ujhhgtgfeyxiexzf());
                    }
                    arrayList3.add(arrayList4);
                }
                if (list3.size() == arrayList3.size()) {
                    Iterator it2 = list3.iterator();
                    int i5 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i6 = i5 + 1;
                            if (C0374Ujhhgtgfeyxiexzf.m1606Ujhhgtgfeyxiexzf((Collection) it2.next(), (List) arrayList3.get(i5), this.f1502Ujhhgtgfeyxiexzf)) {
                                i5 = i6;
                            }
                        } else {
                            z5 = true;
                        }
                    }
                }
                zM4512Ujhhgtgfeyxiexzf = !z5;
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 4:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1608Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 5:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1609Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 6:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1610Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 7:
                List list4 = (List) obj;
                List listM3653feyxiexzfUjhhgtg2 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getParameterTypes());
                z = true;
                z2 = false;
                if (list4.size() == listM3653feyxiexzfUjhhgtg2.size()) {
                    Iterator it3 = list4.iterator();
                    int i7 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            int i8 = i7 + 1;
                            Class cls2 = (Class) listM3653feyxiexzfUjhhgtg2.get(i7);
                            Class clsM1620Ujhhgtgfeyxiexzf2 = C0374Ujhhgtgfeyxiexzf.m1620Ujhhgtgfeyxiexzf(next, this.f1502Ujhhgtgfeyxiexzf, null);
                            Class<C1843Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(C1843Ujhhgtgfeyxiexzf.class));
                            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(clsM1620Ujhhgtgfeyxiexzf2, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : C1843Ujhhgtgfeyxiexzf.class) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, clsM1620Ujhhgtgfeyxiexzf2)) {
                                i7 = i8;
                            }
                        } else {
                            z2 = z;
                        }
                    }
                }
                zM4512Ujhhgtgfeyxiexzf = !z2;
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 8:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1611Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 9:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1612Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 10:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1613Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 11:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1614Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case Opcodes.FCONST_1 /* 12 */:
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1615Ujhhgtgfeyxiexzf(this.f1502Ujhhgtgfeyxiexzf, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 13:
                Set set = (Set) obj;
                List listM3653feyxiexzfUjhhgtg3 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getExceptionTypes());
                boolean z6 = false;
                if (set.size() == listM3653feyxiexzfUjhhgtg3.size()) {
                    int i9 = 0;
                    for (Object obj4 : set) {
                        int i10 = i9 + 1;
                        Class cls3 = (Class) listM3653feyxiexzfUjhhgtg3.get(i9);
                        Class clsM1620Ujhhgtgfeyxiexzf3 = C0374Ujhhgtgfeyxiexzf.m1620Ujhhgtgfeyxiexzf(obj4, this.f1502Ujhhgtgfeyxiexzf, null);
                        Class<C1843Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(C1843Ujhhgtgfeyxiexzf.class));
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(clsM1620Ujhhgtgfeyxiexzf3, clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : C1843Ujhhgtgfeyxiexzf.class) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls3, clsM1620Ujhhgtgfeyxiexzf3)) {
                            i9 = i10;
                        }
                    }
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case Opcodes.DCONST_0 /* 14 */:
                Set set2 = (Set) obj;
                List listM3653feyxiexzfUjhhgtg4 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getExceptionTypes());
                z = true;
                z2 = false;
                if (set2.size() == listM3653feyxiexzfUjhhgtg4.size()) {
                    Iterator it4 = set2.iterator();
                    int i11 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i12 = i11 + 1;
                            Class cls4 = (Class) listM3653feyxiexzfUjhhgtg4.get(i11);
                            Class clsM1620Ujhhgtgfeyxiexzf4 = C0374Ujhhgtgfeyxiexzf.m1620Ujhhgtgfeyxiexzf(next2, this.f1502Ujhhgtgfeyxiexzf, null);
                            Class<C1843Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(C1843Ujhhgtgfeyxiexzf.class));
                            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(clsM1620Ujhhgtgfeyxiexzf4, clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : C1843Ujhhgtgfeyxiexzf.class) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls4, clsM1620Ujhhgtgfeyxiexzf4)) {
                                i11 = i12;
                            }
                        } else {
                            z2 = z;
                        }
                    }
                }
                zM4512Ujhhgtgfeyxiexzf = !z2;
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 15:
                Set set3 = (Set) obj;
                Annotation[] annotationArrM1617Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1617Ujhhgtgfeyxiexzf((Member) obj2);
                ArrayList arrayList5 = new ArrayList(annotationArrM1617Ujhhgtgfeyxiexzf.length);
                for (Annotation annotation3 : annotationArrM1617Ujhhgtgfeyxiexzf) {
                    arrayList5.add(AbstractC3593Ujhhgtgfeyxiexzf.m5155Ujhhgtgfeyxiexzf(annotation3).mo2998Ujhhgtgfeyxiexzf());
                }
                zM4512Ujhhgtgfeyxiexzf = C0374Ujhhgtgfeyxiexzf.m1606Ujhhgtgfeyxiexzf(set3, arrayList5, this.f1502Ujhhgtgfeyxiexzf);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            case 16:
                Set set4 = (Set) obj;
                Annotation[] annotationArrM1617Ujhhgtgfeyxiexzf2 = C0374Ujhhgtgfeyxiexzf.m1617Ujhhgtgfeyxiexzf((Member) obj2);
                ArrayList arrayList6 = new ArrayList(annotationArrM1617Ujhhgtgfeyxiexzf2.length);
                for (Annotation annotation4 : annotationArrM1617Ujhhgtgfeyxiexzf2) {
                    arrayList6.add(AbstractC3593Ujhhgtgfeyxiexzf.m5155Ujhhgtgfeyxiexzf(annotation4).mo2998Ujhhgtgfeyxiexzf());
                }
                zM4512Ujhhgtgfeyxiexzf = !C0374Ujhhgtgfeyxiexzf.m1606Ujhhgtgfeyxiexzf(set4, arrayList6, this.f1502Ujhhgtgfeyxiexzf);
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
            default:
                zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((Field) obj2).getType(), C0374Ujhhgtgfeyxiexzf.m1620Ujhhgtgfeyxiexzf(obj, this.f1502Ujhhgtgfeyxiexzf, "Field: type"));
                return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
        }
    }
}
