package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1962 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6482;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1958 f6483;

    public /* synthetic */ C1962(C1958 c1958, int i) {
        this.f6482 = i;
        this.f6483 = c1958;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        boolean zM3322;
        boolean zM3930;
        switch (this.f6482) {
            case 0:
                zM3322 = AbstractC1469.m3322(((Method) obj2).getReturnType(), AbstractC1968.m3945(obj, this.f6483, "Method: returnType"));
                return Boolean.valueOf(zM3322);
            case 1:
                zM3322 = AbstractC1968.m3930((List) obj, AbstractC0280.m1535(((Executable) obj2).getParameterTypes()), this.f6483);
                return Boolean.valueOf(zM3322);
            case 2:
                List list = (List) obj;
                Annotation[][] parameterAnnotations = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                boolean z = false;
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(AbstractC2236.m4230(annotation).mo2209());
                    }
                    arrayList.add(arrayList2);
                }
                if (list.size() == arrayList.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i = 0;
                    for (Object obj3 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        if (AbstractC1968.m3930((Collection) obj3, (List) arrayList.get(i), this.f6483)) {
                            arrayList3.add(obj3);
                        }
                        i = i2;
                    }
                    if (arrayList3.size() == arrayList.size()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                List list2 = (List) obj;
                Annotation[][] parameterAnnotations2 = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                boolean z2 = false;
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList5.add(AbstractC2236.m4230(annotation2).mo2209());
                    }
                    arrayList4.add(arrayList5);
                }
                if (list2.size() == arrayList4.size()) {
                    ArrayList arrayList6 = new ArrayList();
                    int i3 = 0;
                    for (Object obj4 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        if (AbstractC1968.m3930((Collection) obj4, (List) arrayList4.get(i3), this.f6483)) {
                            arrayList6.add(obj4);
                        }
                        i3 = i4;
                    }
                    if (arrayList6.size() == arrayList4.size()) {
                        z2 = true;
                    }
                }
                zM3322 = !z2;
                return Boolean.valueOf(zM3322);
            case 4:
                zM3322 = AbstractC1968.m3932(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 5:
                zM3322 = AbstractC1968.m3933(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 6:
                zM3322 = AbstractC1968.m3934(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 7:
                zM3930 = AbstractC1968.m3930((List) obj, AbstractC0280.m1535(((Executable) obj2).getParameterTypes()), this.f6483);
                break;
            case 8:
                zM3322 = AbstractC1968.m3935(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 9:
                zM3322 = AbstractC1968.m3936(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 10:
                zM3322 = AbstractC1968.m3937(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 11:
                zM3322 = AbstractC1968.m3938(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case Opcodes.FCONST_1 /* 12 */:
                zM3322 = AbstractC1968.m3939(this.f6483, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3322);
            case 13:
                zM3322 = AbstractC1968.m3930((Set) obj, AbstractC0280.m1535(((Executable) obj2).getExceptionTypes()), this.f6483);
                return Boolean.valueOf(zM3322);
            case Opcodes.DCONST_0 /* 14 */:
                zM3930 = AbstractC1968.m3930((Set) obj, AbstractC0280.m1535(((Executable) obj2).getExceptionTypes()), this.f6483);
                break;
            case 15:
                Set set = (Set) obj;
                Annotation[] annotationArrM3941 = AbstractC1968.m3941((Member) obj2);
                ArrayList arrayList7 = new ArrayList(annotationArrM3941.length);
                for (Annotation annotation3 : annotationArrM3941) {
                    arrayList7.add(AbstractC2236.m4230(annotation3).mo2209());
                }
                zM3322 = AbstractC1968.m3930(set, arrayList7, this.f6483);
                return Boolean.valueOf(zM3322);
            case 16:
                Set set2 = (Set) obj;
                Annotation[] annotationArrM3942 = AbstractC1968.m3941((Member) obj2);
                ArrayList arrayList8 = new ArrayList(annotationArrM3942.length);
                for (Annotation annotation4 : annotationArrM3942) {
                    arrayList8.add(AbstractC2236.m4230(annotation4).mo2209());
                }
                zM3930 = AbstractC1968.m3930(set2, arrayList8, this.f6483);
                break;
            default:
                zM3322 = AbstractC1469.m3322(((Field) obj2).getType(), AbstractC1968.m3945(obj, this.f6483, "Field: type"));
                return Boolean.valueOf(zM3322);
        }
        zM3322 = !zM3930;
        return Boolean.valueOf(zM3322);
    }
}
