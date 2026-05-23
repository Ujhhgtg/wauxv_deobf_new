package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲇᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0184 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1241;

    public /* synthetic */ C0184(int i) {
        this.f1241 = i;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        C0753 c0753;
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        boolean z = true;
        boolean z2 = false;
        switch (this.f1241) {
            case 0:
                List list = (List) obj;
                C0185 c0185 = C0185.f1242;
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0801) it.next()).f3160);
                }
                c0185.m2547(AbstractC0744.m2209(arrayList));
                AbstractC2834.m4823(null, 3, "已屏蔽");
                return Boolean.FALSE;
            case 1:
                String str = (String) obj;
                InterfaceC0875 interfaceC0875 = (InterfaceC0875) obj2;
                if (str.length() == 0) {
                    return interfaceC0875.toString();
                }
                return str + ", " + interfaceC0875;
            case 2:
                return Boolean.FALSE;
            case 3:
                InterfaceC0875 interfaceC0876 = (InterfaceC0875) obj2;
                InterfaceC0877 interfaceC0877Mo939 = ((InterfaceC0877) obj).mo939(interfaceC0876.getKey());
                C1187 c1187 = C1187.f4327;
                if (interfaceC0877Mo939 == c1187) {
                    return interfaceC0876;
                }
                C1133 c1133 = C1133.f4202;
                AbstractC0878 abstractC0878 = (AbstractC0878) interfaceC0877Mo939.mo942(c1133);
                if (abstractC0878 == null) {
                    c0753 = new C0753(interfaceC0877Mo939, interfaceC0876);
                } else {
                    InterfaceC0877 interfaceC0877Mo9310 = interfaceC0877Mo939.mo939(c1133);
                    if (interfaceC0877Mo9310 == c1187) {
                        return new C0753(interfaceC0876, abstractC0878);
                    }
                    c0753 = new C0753(new C0753(interfaceC0877Mo9310, interfaceC0876), abstractC0878);
                }
                return c0753;
            case 4:
                return ((InterfaceC0877) obj).mo941((InterfaceC0875) obj2);
            case 5:
                return ((InterfaceC0877) obj).mo941((InterfaceC0875) obj2);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 7:
                MsgInfoBean msgInfoBean = (MsgInfoBean) obj2;
                Unit unit = Unit.INSTANCE;
                long msgId = msgInfoBean.getMsgId();
                String imgPath = msgInfoBean.getImgPath();
                
                Object objM2761 = C1164.m2761(imgPath);
                
                int i = 0;
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(C1151.f4258)).m3492();
                c1973M3492.m3800(EnumC1999.STATIC);
                MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0])).m3492();
                c1973M3493.returnType = AbstractC2519.classToKClass(byte[].class);
                String[] strArr = AbstractC1574.f5469;
                byte[] bArr = (byte[]) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{"com.tencent.mm.api.IEmojiInfo"}, 1, c1973M3493)).invoke(objM2761);
                try {
                    File file = new File(C1174.f4306.m2542());
                    file.mkdirs();
                    StringBuilder sb = new StringBuilder();
                    sb.append(msgId);
                    sb.append('-');
                    sb.append(imgPath);
                    sb.append('-');
                    sb.append(System.currentTimeMillis());
                    sb.append('.');
                    sb.append(AbstractC2203.m4034(bArr) ? "gif" : "png");
                    String string = sb.toString();
                    File file2 = new File(file, string);
                    if (AbstractC2203.m4034(bArr)) {
                        MethodResolver c1973M3494 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.gif.MMWXGFJNI")).m3492();
                        c1973M3494.name = "nativeWxamToGif";
                        bArr = (byte[]) ((C1982) AbstractC0744.firstInList(c1973M3494.resolve())).invoke(bArr);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                        AbstractC2834.m4823(null, 3, "已保存到: " + file.getAbsolutePath() + '/' + string);
                        c2585 = unit;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1458.m3154(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    c2585 = new C2585(th3);
                }
                Throwable thM4594 = C2586.m4594(c2585);
                if (thM4594 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("保存失败: ");
                    String message = thM4594.getMessage();
                    sb2.append(message != null ? AbstractC2841.m4847(50, message) : "未知错误");
                    AbstractC2834.m4823(null, 3, sb2.toString());
                }
                return unit;
            case 8:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Field) obj2).getGenericType();
                throw null;
            case 9:
                Boolean bool2 = (Boolean) ((InterfaceC1425) obj).invoke(((Field) obj2).getGenericType());
                bool2.booleanValue();
                return bool2;
            case 10:
                Set set = (Set) obj;
                List listM1389 = AbstractC0270.m1389(((Executable) obj2).getGenericExceptionTypes());
                if (set.size() == listM1389.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        AbstractC1194.m2791(it2.next());
                        throw null;
                    }
                    if (arrayList2.size() == listM1389.size()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(!z2);
            case 11:
                Set set2 = (Set) obj;
                List listM13810 = AbstractC0270.m1389(((Executable) obj2).getGenericParameterTypes());
                if (set2.size() == listM13810.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = set2.iterator();
                    if (it3.hasNext()) {
                        AbstractC1194.m2791(it3.next());
                        throw null;
                    }
                    z = arrayList3.size() == listM13810.size();
                }
                return Boolean.valueOf(z);
            case 12 /* 12 */:
                Set set3 = (Set) obj;
                List listM13811 = AbstractC0270.m1389(((Executable) obj2).getGenericParameterTypes());
                if (set3.size() == listM13811.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = set3.iterator();
                    if (it4.hasNext()) {
                        AbstractC1194.m2791(it4.next());
                        throw null;
                    }
                    if (arrayList4.size() == listM13811.size()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(!z2);
            case 13:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() == ((Boolean) obj).booleanValue());
            case 14 /* 14 */:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() != ((Boolean) obj).booleanValue());
            case 15:
                try {
                    Boolean bool3 = (Boolean) ((InterfaceC1425) obj).invoke(((Method) obj2).getReturnType());
                    bool3.booleanValue();
                    c2586 = bool3;
                    break;
                } catch (Throwable th4) {
                    c2586 = new C2585(th4);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z3 = true;
                Object obj3 = c2586;
                if (true) {
                    obj3 = bool4;
                }
                return (Boolean) obj3;
            case 16:
                try {
                    Boolean bool5 = (Boolean) ((InterfaceC1425) obj).invoke(AbstractC0270.m1389(((Executable) obj2).getParameterTypes()));
                    bool5.booleanValue();
                    c2587 = bool5;
                    break;
                } catch (Throwable th5) {
                    c2587 = new C2585(th5);
                }
                Boolean bool6 = Boolean.FALSE;
                boolean z4 = true;
                Object obj4 = c2587;
                if (true) {
                    obj4 = bool6;
                }
                return (Boolean) obj4;
            case 17 /* 17 */:
                return Boolean.valueOf(((Method) obj2).isBridge() == ((Boolean) obj).booleanValue());
            case 18 /* 18 */:
                return Boolean.valueOf(((Executable) obj2).getParameterCount() == ((Integer) obj).intValue());
            case 19:
                try {
                    Boolean bool7 = (Boolean) ((InterfaceC1425) obj).invoke(Integer.valueOf(((Executable) obj2).getParameterCount()));
                    bool7.booleanValue();
                    c2588 = bool7;
                    break;
                } catch (Throwable th6) {
                    c2588 = new C2585(th6);
                }
                Boolean bool8 = Boolean.FALSE;
                boolean z5 = true;
                Object obj5 = c2588;
                if (true) {
                    obj5 = bool8;
                }
                return (Boolean) obj5;
            case 20:
                Set set4 = (Set) obj;
                List listM13812 = AbstractC0270.m1389(((Executable) obj2).getTypeParameters());
                if (set4.size() == listM13812.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = set4.iterator();
                    if (it5.hasNext()) {
                        AbstractC1194.m2791(it5.next());
                        throw null;
                    }
                    z = arrayList5.size() == listM13812.size();
                }
                return Boolean.valueOf(z);
            case 21 /* 21 */:
                Set set5 = (Set) obj;
                List listM13813 = AbstractC0270.m1389(((Executable) obj2).getTypeParameters());
                if (set5.size() == listM13813.size()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = set5.iterator();
                    if (it6.hasNext()) {
                        AbstractC1194.m2791(it6.next());
                        throw null;
                    }
                    if (arrayList6.size() == listM13813.size()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(!z2);
            case 22 /* 22 */:
                Set set6 = (Set) obj;
                List listM13814 = AbstractC0270.m1389(((Executable) obj2).getGenericExceptionTypes());
                if (set6.size() == listM13814.size()) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = set6.iterator();
                    if (it7.hasNext()) {
                        AbstractC1194.m2791(it7.next());
                        throw null;
                    }
                    z = arrayList7.size() == listM13814.size();
                }
                return Boolean.valueOf(z);
            case 23 /* 23 */:
                return Boolean.valueOf(AbstractC2207.m4087(((Member) obj2).getName(), (String) obj));
            case 24 /* 24 */:
                try {
                    Boolean bool9 = (Boolean) ((InterfaceC1425) obj).invoke(((Member) obj2).getName());
                    bool9.booleanValue();
                    c2589 = bool9;
                    break;
                } catch (Throwable th7) {
                    c2589 = new C2585(th7);
                }
                Boolean bool10 = Boolean.FALSE;
                boolean z6 = true;
                Object obj6 = c2589;
                if (true) {
                    obj6 = bool10;
                }
                return (Boolean) obj6;
            case 25 /* 25 */:
                return Boolean.valueOf(((Method) obj2).isBridge() != ((Boolean) obj).booleanValue());
            case 26:
                Set set7 = (Set) obj;
                Member member = (Member) obj2;
                if (set7 == null || !set7.isEmpty()) {
                    Iterator it8 = set7.iterator();
                    while (it8.hasNext()) {
                        if ((((EnumC1999) it8.next()).f6664 & member.getModifiers()) == 0) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                Set set8 = (Set) obj;
                Member member2 = (Member) obj2;
                if (set8 == null || !set8.isEmpty()) {
                    Iterator it9 = set8.iterator();
                    while (it9.hasNext()) {
                        if ((((EnumC1999) it9.next()).f6664 & member2.getModifiers()) != 0) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                InterfaceC1425 interfaceC1425 = (InterfaceC1425) obj;
                try {
                    int modifiers = ((Member) obj2).getModifiers();
                    C1225 c1225 = EnumC1999.f6663;
                    ArrayList arrayList8 = new ArrayList();
                    C0060 c0060 = new C0060(0, c1225);
                    while (c0060.hasNext()) {
                        Object next = c0060.next();
                        if ((((EnumC1999) next).f6664 & modifiers) != 0) {
                            arrayList8.add(next);
                        }
                    }
                    c25810 = (Boolean) interfaceC1425.invoke(AbstractC0744.m2209(arrayList8));
                    
                    break;
                } catch (Throwable th8) {
                    c25810 = new C2585(th8);
                }
                Object obj7 = Boolean.FALSE;
                if (true) {
                    c25810 = obj7;
                }
                return (Boolean) c25810;
            default:
                return Boolean.valueOf(((Member) obj2).isSynthetic() == ((Boolean) obj).booleanValue());
        }
    }
}
