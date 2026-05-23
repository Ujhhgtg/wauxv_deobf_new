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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲀᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1931 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1927 f6378;

    public /* synthetic */ C1931(C1927 c1927, int i) {
        this.f6377 = i;
        this.f6378 = c1927;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        boolean zM4087;
        boolean zM3736;
        switch (this.f6377) {
            case 0:
                zM4087 = AbstractC2207.m4087(((Method) obj2).getReturnType(), AbstractC1937.m3751(obj, this.f6378, "Method: returnType"));
                return Boolean.valueOf(zM4087);
            case 1:
                zM4087 = AbstractC1937.m3736((List) obj, AbstractC0270.m1389(((Executable) obj2).getParameterTypes()), this.f6378);
                return Boolean.valueOf(zM4087);
            case 2:
                List list = (List) obj;
                Annotation[][] parameterAnnotations = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                boolean z = false;
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(AbstractC0743.m2180(annotation).mo2114());
                    }
                    arrayList.add(arrayList2);
                }
                if (list.size() == arrayList.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i = 0;
                    for (Object obj3 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        if (AbstractC1937.m3736((Collection) obj3, (List) arrayList.get(i), this.f6378)) {
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
                        arrayList5.add(AbstractC0743.m2180(annotation2).mo2114());
                    }
                    arrayList4.add(arrayList5);
                }
                if (list2.size() == arrayList4.size()) {
                    ArrayList arrayList6 = new ArrayList();
                    int i3 = 0;
                    for (Object obj4 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        if (AbstractC1937.m3736((Collection) obj4, (List) arrayList4.get(i3), this.f6378)) {
                            arrayList6.add(obj4);
                        }
                        i3 = i4;
                    }
                    if (arrayList6.size() == arrayList4.size()) {
                        z2 = true;
                    }
                }
                zM4087 = !z2;
                return Boolean.valueOf(zM4087);
            case 4:
                zM4087 = AbstractC1937.m3738(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 5:
                zM4087 = AbstractC1937.m3739(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 6:
                zM4087 = AbstractC1937.m3740(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 7:
                zM3736 = AbstractC1937.m3736((List) obj, AbstractC0270.m1389(((Executable) obj2).getParameterTypes()), this.f6378);
                break;
            case 8:
                zM4087 = AbstractC1937.m3741(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 9:
                zM4087 = AbstractC1937.m3742(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 10:
                zM4087 = AbstractC1937.m3743(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 11:
                zM4087 = AbstractC1937.m3744(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 12 /* 12 */:
                zM4087 = AbstractC1937.m3745(this.f6378, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM4087);
            case 13:
                zM4087 = AbstractC1937.m3736((Set) obj, AbstractC0270.m1389(((Executable) obj2).getExceptionTypes()), this.f6378);
                return Boolean.valueOf(zM4087);
            case 14 /* 14 */:
                zM3736 = AbstractC1937.m3736((Set) obj, AbstractC0270.m1389(((Executable) obj2).getExceptionTypes()), this.f6378);
                break;
            case 15:
                Set set = (Set) obj;
                Annotation[] annotationArrM3747 = AbstractC1937.m3747((Member) obj2);
                ArrayList arrayList7 = new ArrayList(annotationArrM3747.length);
                for (Annotation annotation3 : annotationArrM3747) {
                    arrayList7.add(AbstractC0743.m2180(annotation3).mo2114());
                }
                zM4087 = AbstractC1937.m3736(set, arrayList7, this.f6378);
                return Boolean.valueOf(zM4087);
            case 16:
                Set set2 = (Set) obj;
                Annotation[] annotationArrM3748 = AbstractC1937.m3747((Member) obj2);
                ArrayList arrayList8 = new ArrayList(annotationArrM3748.length);
                for (Annotation annotation4 : annotationArrM3748) {
                    arrayList8.add(AbstractC0743.m2180(annotation4).mo2114());
                }
                zM3736 = AbstractC1937.m3736(set2, arrayList8, this.f6378);
                break;
            default:
                zM4087 = AbstractC2207.m4087(((Field) obj2).getType(), AbstractC1937.m3751(obj, this.f6378, "Field: type"));
                return Boolean.valueOf(zM4087);
        }
        zM4087 = !zM3736;
        return Boolean.valueOf(zM4087);
    }
}
