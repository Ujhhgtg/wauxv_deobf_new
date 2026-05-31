package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲈᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0192 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1309;

    public /* synthetic */ C0192(int i) {
        this.f1309 = i;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        C0750 c0750;
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        boolean z = true;
        boolean z2 = false;
        switch (this.f1309) {
            case 0:
                List list = (List) obj;
                C0193 c0193 = C0193.f1310;
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0800) it.next()).f3167);
                }
                c0193.m2671(AbstractC0739.m2308(arrayList));
                AbstractC2894.m4856(null, 3, "已屏蔽");
                return Boolean.FALSE;
            case 1:
                String str = (String) obj;
                InterfaceC0874 interfaceC0874 = (InterfaceC0874) obj2;
                if (str.length() == 0) {
                    return interfaceC0874.toString();
                }
                return str + ", " + interfaceC0874;
            case 2:
                return Boolean.FALSE;
            case 3:
                InterfaceC0874 interfaceC0875 = (InterfaceC0874) obj2;
                InterfaceC0876 interfaceC0876Mo1083 = ((InterfaceC0876) obj).mo1083(interfaceC0875.getKey());
                C1189 c1189 = C1189.f4324;
                if (interfaceC0876Mo1083 == c1189) {
                    return interfaceC0875;
                }
                C1139 c1139 = C1139.f4214;
                AbstractC0877 abstractC0877 = (AbstractC0877) interfaceC0876Mo1083.mo1086(c1139);
                if (abstractC0877 == null) {
                    c0750 = new C0750(interfaceC0876Mo1083, interfaceC0875);
                } else {
                    InterfaceC0876 interfaceC0876Mo1084 = interfaceC0876Mo1083.mo1083(c1139);
                    if (interfaceC0876Mo1084 == c1189) {
                        return new C0750(interfaceC0875, abstractC0877);
                    }
                    c0750 = new C0750(new C0750(interfaceC0876Mo1084, interfaceC0875), abstractC0877);
                }
                return c0750;
            case 4:
                return ((InterfaceC0876) obj).mo1085((InterfaceC0874) obj2);
            case 5:
                return ((InterfaceC0876) obj).mo1085((InterfaceC0874) obj2);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 7:
                MsgInfoBean msgInfoBean = (MsgInfoBean) obj2;
                C3554 c3554 = C3554.UNIT;
                long msgId = msgInfoBean.getMsgId();
                String imgPath = msgInfoBean.getImgPath();
                C1166.f4288.getClass();
                Object objM2905 = C1166.m2905(imgPath);
                C1157.f4270.getClass();
                int i = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2608(C1156.f4269)).m3560();
                c2004M3560.m3994(EnumC2030.STATIC);
                C2004 c2004M3561 = AbstractC2727.m4713(((C2013) AbstractC1095.m2793(c2004M3560)).m4025(new Object[0])).m3560();
                c2004M3561.f6648 = AbstractC2574.m4549(byte[].class);
                String[] strArr = AbstractC1471.f5234;
                byte[] bArr = (byte[]) ((C2013) AbstractC2844.m4777(new Object[]{"com.tencent.mm.api.IEmojiInfo"}, 1, c2004M3561)).m4026(objM2905);
                try {
                    File file = new File(C1176.f4303.m2666());
                    file.mkdirs();
                    StringBuilder sb = new StringBuilder();
                    sb.append(msgId);
                    sb.append('-');
                    sb.append(imgPath);
                    sb.append('-');
                    sb.append(System.currentTimeMillis());
                    sb.append('.');
                    sb.append(C1787.m3669(bArr) ? "gif" : "png");
                    String string = sb.toString();
                    File file2 = new File(file, string);
                    if (C1787.m3669(bArr)) {
                        C2004 c2004M3562 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.plugin.gif.MMWXGFJNI")).m3560();
                        c2004M3562.f6475 = "nativeWxamToGif";
                        bArr = (byte[]) ((C2013) AbstractC0739.m2290(c2004M3562.m3993())).m4026(bArr);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                        AbstractC2894.m4856(null, 3, "已保存到: " + file.getAbsolutePath() + '/' + string);
                        c2641 = c3554;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3528.m5090(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    c2641 = new C2641(th3);
                }
                Throwable thM4616 = C2642.m4616(c2641);
                if (thM4616 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("保存失败: ");
                    String message = thM4616.getMessage();
                    sb2.append(message != null ? AbstractC2901.m4881(50, message) : "未知错误");
                    AbstractC2894.m4856(null, 3, sb2.toString());
                }
                return c3554;
            case 8:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Field) obj2).getGenericType();
                throw null;
            case 9:
                Boolean bool2 = (Boolean) ((InterfaceC1433) obj).invoke(((Field) obj2).getGenericType());
                bool2.booleanValue();
                return bool2;
            case 10:
                Set set = (Set) obj;
                List listM1535 = AbstractC0280.m1535(((Executable) obj2).getGenericExceptionTypes());
                if (set.size() == listM1535.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        AbstractC1095.m2807(it2.next());
                        throw null;
                    }
                    if (arrayList2.size() == listM1535.size()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(!z2);
            case 11:
                Set set2 = (Set) obj;
                List listM1536 = AbstractC0280.m1535(((Executable) obj2).getGenericParameterTypes());
                if (set2.size() == listM1536.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = set2.iterator();
                    if (it3.hasNext()) {
                        AbstractC1095.m2807(it3.next());
                        throw null;
                    }
                    z = arrayList3.size() == listM1536.size();
                }
                return Boolean.valueOf(z);
            case Opcodes.FCONST_1 /* 12 */:
                Set set3 = (Set) obj;
                List listM1537 = AbstractC0280.m1535(((Executable) obj2).getGenericParameterTypes());
                if (set3.size() == listM1537.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = set3.iterator();
                    if (it4.hasNext()) {
                        AbstractC1095.m2807(it4.next());
                        throw null;
                    }
                    if (arrayList4.size() == listM1537.size()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(!z2);
            case 13:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() == ((Boolean) obj).booleanValue());
            case Opcodes.DCONST_0 /* 14 */:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() != ((Boolean) obj).booleanValue());
            case 15:
                try {
                    Boolean bool3 = (Boolean) ((InterfaceC1433) obj).invoke(((Method) obj2).getReturnType());
                    bool3.booleanValue();
                    c2642 = bool3;
                    break;
                } catch (Throwable th4) {
                    c2642 = new C2641(th4);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z3 = c2642 instanceof C2641;
                Object obj3 = c2642;
                if (z3) {
                    obj3 = bool4;
                }
                return (Boolean) obj3;
            case 16:
                try {
                    Boolean bool5 = (Boolean) ((InterfaceC1433) obj).invoke(AbstractC0280.m1535(((Executable) obj2).getParameterTypes()));
                    bool5.booleanValue();
                    c2643 = bool5;
                    break;
                } catch (Throwable th5) {
                    c2643 = new C2641(th5);
                }
                Boolean bool6 = Boolean.FALSE;
                boolean z4 = c2643 instanceof C2641;
                Object obj4 = c2643;
                if (z4) {
                    obj4 = bool6;
                }
                return (Boolean) obj4;
            case Opcodes.SIPUSH /* 17 */:
                return Boolean.valueOf(((Method) obj2).isBridge() == ((Boolean) obj).booleanValue());
            case Opcodes.LDC /* 18 */:
                return Boolean.valueOf(((Executable) obj2).getParameterCount() == ((Integer) obj).intValue());
            case 19:
                try {
                    Boolean bool7 = (Boolean) ((InterfaceC1433) obj).invoke(Integer.valueOf(((Executable) obj2).getParameterCount()));
                    bool7.booleanValue();
                    c2644 = bool7;
                    break;
                } catch (Throwable th6) {
                    c2644 = new C2641(th6);
                }
                Boolean bool8 = Boolean.FALSE;
                boolean z5 = c2644 instanceof C2641;
                Object obj5 = c2644;
                if (z5) {
                    obj5 = bool8;
                }
                return (Boolean) obj5;
            case 20:
                Set set4 = (Set) obj;
                List listM1538 = AbstractC0280.m1535(((Executable) obj2).getTypeParameters());
                if (set4.size() == listM1538.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = set4.iterator();
                    if (it5.hasNext()) {
                        AbstractC1095.m2807(it5.next());
                        throw null;
                    }
                    z = arrayList5.size() == listM1538.size();
                }
                return Boolean.valueOf(z);
            case Opcodes.ILOAD /* 21 */:
                Set set5 = (Set) obj;
                List listM1539 = AbstractC0280.m1535(((Executable) obj2).getTypeParameters());
                if (set5.size() == listM1539.size()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = set5.iterator();
                    if (it6.hasNext()) {
                        AbstractC1095.m2807(it6.next());
                        throw null;
                    }
                    if (arrayList6.size() == listM1539.size()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(!z2);
            case Opcodes.LLOAD /* 22 */:
                Set set6 = (Set) obj;
                List listM15310 = AbstractC0280.m1535(((Executable) obj2).getGenericExceptionTypes());
                if (set6.size() == listM15310.size()) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = set6.iterator();
                    if (it7.hasNext()) {
                        AbstractC1095.m2807(it7.next());
                        throw null;
                    }
                    z = arrayList7.size() == listM15310.size();
                }
                return Boolean.valueOf(z);
            case Opcodes.FLOAD /* 23 */:
                return Boolean.valueOf(AbstractC1469.m3322(((Member) obj2).getName(), (String) obj));
            case Opcodes.DLOAD /* 24 */:
                try {
                    Boolean bool9 = (Boolean) ((InterfaceC1433) obj).invoke(((Member) obj2).getName());
                    bool9.booleanValue();
                    c2645 = bool9;
                    break;
                } catch (Throwable th7) {
                    c2645 = new C2641(th7);
                }
                Boolean bool10 = Boolean.FALSE;
                boolean z6 = c2645 instanceof C2641;
                Object obj6 = c2645;
                if (z6) {
                    obj6 = bool10;
                }
                return (Boolean) obj6;
            case Opcodes.ALOAD /* 25 */:
                return Boolean.valueOf(((Method) obj2).isBridge() != ((Boolean) obj).booleanValue());
            case 26:
                Set set7 = (Set) obj;
                Member member = (Member) obj2;
                if (set7 == null || !set7.isEmpty()) {
                    Iterator it8 = set7.iterator();
                    while (it8.hasNext()) {
                        if ((((EnumC2030) it8.next()).f6769 & member.getModifiers()) == 0) {
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
                        if ((((EnumC2030) it9.next()).f6769 & member2.getModifiers()) != 0) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                InterfaceC1433 interfaceC1433 = (InterfaceC1433) obj;
                try {
                    int modifiers = ((Member) obj2).getModifiers();
                    C1227 c1227 = EnumC2030.f6768;
                    ArrayList arrayList8 = new ArrayList();
                    C0067 c0067 = new C0067(c1227, 0);
                    while (c0067.hasNext()) {
                        Object next = c0067.next();
                        if ((((EnumC2030) next).f6769 & modifiers) != 0) {
                            arrayList8.add(next);
                        }
                    }
                    c2646 = (Boolean) interfaceC1433.invoke(AbstractC0739.m2308(arrayList8));
                    c2646.getClass();
                    break;
                } catch (Throwable th8) {
                    c2646 = new C2641(th8);
                }
                Object obj7 = Boolean.FALSE;
                if (c2646 instanceof C2641) {
                    c2646 = obj7;
                }
                return (Boolean) c2646;
            default:
                return Boolean.valueOf(((Member) obj2).isSynthetic() == ((Boolean) obj).booleanValue());
        }
    }
}
