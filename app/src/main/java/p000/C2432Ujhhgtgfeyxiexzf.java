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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛴᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2432Ujhhgtgfeyxiexzf implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7871Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2432Ujhhgtgfeyxiexzf(int i) {
        this.f7871Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        C2887Ujhhgtgfeyxiexzf c2887Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        Object c0919feyxiexzfUjhhgtg6;
        boolean z = true;
        boolean z2 = false;
        switch (this.f7871Ujhhgtgfeyxiexzf) {
            case 0:
                List list = (List) obj;
                C2433Ujhhgtgfeyxiexzf c2433Ujhhgtgfeyxiexzf = C2433Ujhhgtgfeyxiexzf.f7872Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3663feyxiexzfUjhhgtg) it.next()).f11657Ujhhgtgfeyxiexzf);
                }
                c2433Ujhhgtgfeyxiexzf.m4628Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList));
                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "已屏蔽");
                return Boolean.FALSE;
            case 1:
                String str = (String) obj;
                InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf = (InterfaceC3737Ujhhgtgfeyxiexzf) obj2;
                if (str.length() == 0) {
                    return interfaceC3737Ujhhgtgfeyxiexzf.toString();
                }
                return str + ", " + interfaceC3737Ujhhgtgfeyxiexzf;
            case 2:
                return Boolean.FALSE;
            case 3:
                InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf2 = (InterfaceC3737Ujhhgtgfeyxiexzf) obj2;
                InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf = ((InterfaceC3739feyxiexzfUjhhgtg) obj).mo1762Ujhhgtgfeyxiexzf(interfaceC3737Ujhhgtgfeyxiexzf2.getKey());
                C3303feyxiexzfUjhhgtg c3303feyxiexzfUjhhgtg = C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf;
                if (interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf == c3303feyxiexzfUjhhgtg) {
                    return interfaceC3737Ujhhgtgfeyxiexzf2;
                }
                C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf;
                AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg = (AbstractC3740feyxiexzfUjhhgtg) interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(c3382feyxiexzfUjhhgtg);
                if (abstractC3740feyxiexzfUjhhgtg == null) {
                    c2887Ujhhgtgfeyxiexzf = new C2887Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf, interfaceC3737Ujhhgtgfeyxiexzf2);
                } else {
                    InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf2 = interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf.mo1762Ujhhgtgfeyxiexzf(c3382feyxiexzfUjhhgtg);
                    if (interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf2 == c3303feyxiexzfUjhhgtg) {
                        return new C2887Ujhhgtgfeyxiexzf(interfaceC3737Ujhhgtgfeyxiexzf2, abstractC3740feyxiexzfUjhhgtg);
                    }
                    c2887Ujhhgtgfeyxiexzf = new C2887Ujhhgtgfeyxiexzf(new C2887Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgMo1762Ujhhgtgfeyxiexzf2, interfaceC3737Ujhhgtgfeyxiexzf2), abstractC3740feyxiexzfUjhhgtg);
                }
                return c2887Ujhhgtgfeyxiexzf;
            case 4:
                return ((InterfaceC3739feyxiexzfUjhhgtg) obj).mo1764feyxiexzfUjhhgtg((InterfaceC3737Ujhhgtgfeyxiexzf) obj2);
            case 5:
                return ((InterfaceC3739feyxiexzfUjhhgtg) obj).mo1764feyxiexzfUjhhgtg((InterfaceC3737Ujhhgtgfeyxiexzf) obj2);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 7:
                MsgInfoBean msgInfoBean = (MsgInfoBean) obj2;
                C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                long msgId = msgInfoBean.getMsgId();
                String imgPath = msgInfoBean.getImgPath();
                C3287Ujhhgtgfeyxiexzf.f10316Ujhhgtgfeyxiexzf.getClass();
                Object objM4785feyxiexzfUjhhgtg = C3287Ujhhgtgfeyxiexzf.m4785feyxiexzfUjhhgtg(imgPath);
                C3298Ujhhgtgfeyxiexzf.f10334Ujhhgtgfeyxiexzf.getClass();
                int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C3297Ujhhgtgfeyxiexzf.f10333Ujhhgtgfeyxiexzf)).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1636Ujhhgtgfeyxiexzf(EnumC0283Ujhhgtgfeyxiexzf.STATIC);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C0393Ujhhgtgfeyxiexzf) AbstractC3317feyxiexzfUjhhgtg.m4794Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1649Ujhhgtgfeyxiexzf(new Object[0])).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                byte[] bArr = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{"com.tencent.mm.api.IEmojiInfo"}, 1, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(objM4785feyxiexzfUjhhgtg);
                try {
                    File file = new File(C3292Ujhhgtgfeyxiexzf.f10329Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                    file.mkdirs();
                    StringBuilder sb = new StringBuilder();
                    sb.append(msgId);
                    sb.append('-');
                    sb.append(imgPath);
                    sb.append('-');
                    sb.append(System.currentTimeMillis());
                    sb.append('.');
                    sb.append(AbstractC3593Ujhhgtgfeyxiexzf.m5162feyxiexzfUjhhgtg(bArr) ? "gif" : "png");
                    String string = sb.toString();
                    File file2 = new File(file, string);
                    if (AbstractC3593Ujhhgtgfeyxiexzf.m5162feyxiexzfUjhhgtg(bArr)) {
                        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.gif.MMWXGFJNI")).m2024Ujhhgtgfeyxiexzf();
                        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "nativeWxamToGif";
                        bArr = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(bArr);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "已保存到: " + file.getAbsolutePath() + '/' + string);
                        c0919feyxiexzfUjhhgtg = c1943Ujhhgtgfeyxiexzf;
                        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
                        if (thM2409Ujhhgtgfeyxiexzf != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("保存失败: ");
                            String message = thM2409Ujhhgtgfeyxiexzf.getMessage();
                            sb2.append(message != null ? AbstractC1152feyxiexzfUjhhgtg.m2643feyxiexzfUjhhgtg(50, message) : "未知错误");
                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb2.toString());
                        }
                        return c1943Ujhhgtgfeyxiexzf;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th3);
                }
                break;
            case 8:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Field) obj2).getGenericType();
                throw null;
            case 9:
                Boolean bool2 = (Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj).invoke(((Field) obj2).getGenericType());
                bool2.booleanValue();
                return bool2;
            case 10:
                Set set = (Set) obj;
                List listM3653feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getGenericExceptionTypes());
                if (set.size() == listM3653feyxiexzfUjhhgtg.size()) {
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(it2.next());
                        throw null;
                    }
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 11:
                Set set2 = (Set) obj;
                List listM3653feyxiexzfUjhhgtg2 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getGenericParameterTypes());
                if (set2.size() != listM3653feyxiexzfUjhhgtg2.size()) {
                    z = false;
                } else {
                    Iterator it3 = set2.iterator();
                    if (it3.hasNext()) {
                        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(it3.next());
                        throw null;
                    }
                }
                return Boolean.valueOf(z);
            case Opcodes.FCONST_1 /* 12 */:
                Set set3 = (Set) obj;
                List listM3653feyxiexzfUjhhgtg3 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getGenericParameterTypes());
                if (set3.size() == listM3653feyxiexzfUjhhgtg3.size()) {
                    Iterator it4 = set3.iterator();
                    if (it4.hasNext()) {
                        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(it4.next());
                        throw null;
                    }
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 13:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() == ((Boolean) obj).booleanValue());
            case Opcodes.DCONST_0 /* 14 */:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() != ((Boolean) obj).booleanValue());
            case 15:
                try {
                    Boolean bool3 = (Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj).invoke(((Method) obj2).getReturnType());
                    bool3.booleanValue();
                    c0919feyxiexzfUjhhgtg2 = bool3;
                    break;
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th4);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z3 = c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg;
                Object obj3 = c0919feyxiexzfUjhhgtg2;
                if (z3) {
                    obj3 = bool4;
                }
                return (Boolean) obj3;
            case 16:
                try {
                    Boolean bool5 = (Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj).invoke(AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getParameterTypes()));
                    bool5.booleanValue();
                    c0919feyxiexzfUjhhgtg3 = bool5;
                    break;
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th5);
                }
                Boolean bool6 = Boolean.FALSE;
                boolean z4 = c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg;
                Object obj4 = c0919feyxiexzfUjhhgtg3;
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
                    Boolean bool7 = (Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj).invoke(Integer.valueOf(((Executable) obj2).getParameterCount()));
                    bool7.booleanValue();
                    c0919feyxiexzfUjhhgtg4 = bool7;
                    break;
                } catch (Throwable th6) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th6);
                }
                Boolean bool8 = Boolean.FALSE;
                boolean z5 = c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg;
                Object obj5 = c0919feyxiexzfUjhhgtg4;
                if (z5) {
                    obj5 = bool8;
                }
                return (Boolean) obj5;
            case 20:
                Set set4 = (Set) obj;
                List listM3653feyxiexzfUjhhgtg4 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getTypeParameters());
                if (set4.size() != listM3653feyxiexzfUjhhgtg4.size()) {
                    z = false;
                } else {
                    Iterator it5 = set4.iterator();
                    if (it5.hasNext()) {
                        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(it5.next());
                        throw null;
                    }
                }
                return Boolean.valueOf(z);
            case Opcodes.ILOAD /* 21 */:
                Set set5 = (Set) obj;
                List listM3653feyxiexzfUjhhgtg5 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getTypeParameters());
                if (set5.size() == listM3653feyxiexzfUjhhgtg5.size()) {
                    Iterator it6 = set5.iterator();
                    if (it6.hasNext()) {
                        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(it6.next());
                        throw null;
                    }
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case Opcodes.LLOAD /* 22 */:
                Set set6 = (Set) obj;
                List listM3653feyxiexzfUjhhgtg6 = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(((Executable) obj2).getGenericExceptionTypes());
                if (set6.size() != listM3653feyxiexzfUjhhgtg6.size()) {
                    z = false;
                } else {
                    Iterator it7 = set6.iterator();
                    if (it7.hasNext()) {
                        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(it7.next());
                        throw null;
                    }
                }
                return Boolean.valueOf(z);
            case Opcodes.FLOAD /* 23 */:
                return Boolean.valueOf(C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((Member) obj2).getName(), (String) obj));
            case Opcodes.DLOAD /* 24 */:
                return Boolean.valueOf(((Method) obj2).isBridge() != ((Boolean) obj).booleanValue());
            case Opcodes.ALOAD /* 25 */:
                try {
                    Boolean bool9 = (Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj).invoke(((Member) obj2).getName());
                    bool9.booleanValue();
                    c0919feyxiexzfUjhhgtg5 = bool9;
                    break;
                } catch (Throwable th7) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th7);
                }
                Boolean bool10 = Boolean.FALSE;
                boolean z6 = c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg;
                Object obj6 = c0919feyxiexzfUjhhgtg5;
                if (z6) {
                    obj6 = bool10;
                }
                return (Boolean) obj6;
            case 26:
                Set set7 = (Set) obj;
                Member member = (Member) obj2;
                if (set7 == null || !set7.isEmpty()) {
                    Iterator it8 = set7.iterator();
                    while (it8.hasNext()) {
                        if ((((EnumC0283Ujhhgtgfeyxiexzf) it8.next()).f1716Ujhhgtgfeyxiexzf & member.getModifiers()) == 0) {
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
                        if ((((EnumC0283Ujhhgtgfeyxiexzf) it9.next()).f1716Ujhhgtgfeyxiexzf & member2.getModifiers()) != 0) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg = (InterfaceC3549feyxiexzfUjhhgtg) obj;
                try {
                    int modifiers = ((Member) obj2).getModifiers();
                    C3369feyxiexzfUjhhgtg c3369feyxiexzfUjhhgtg = EnumC0283Ujhhgtgfeyxiexzf.f1715Ujhhgtgfeyxiexzf;
                    ArrayList arrayList2 = new ArrayList();
                    C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = new C2930Ujhhgtgfeyxiexzf(0, c3369feyxiexzfUjhhgtg);
                    while (c2930Ujhhgtgfeyxiexzf.hasNext()) {
                        Object next = c2930Ujhhgtgfeyxiexzf.next();
                        if ((((EnumC0283Ujhhgtgfeyxiexzf) next).f1716Ujhhgtgfeyxiexzf & modifiers) != 0) {
                            arrayList2.add(next);
                        }
                    }
                    c0919feyxiexzfUjhhgtg6 = (Boolean) interfaceC3549feyxiexzfUjhhgtg.invoke(AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList2));
                    c0919feyxiexzfUjhhgtg6.getClass();
                    break;
                } catch (Throwable th8) {
                    c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th8);
                }
                Object obj7 = Boolean.FALSE;
                if (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg6 = obj7;
                }
                return (Boolean) c0919feyxiexzfUjhhgtg6;
            default:
                return Boolean.valueOf(((Member) obj2).isSynthetic() == ((Boolean) obj).booleanValue());
        }
    }
}
