package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.yun.silk.SilkCodec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛳ要点脸ᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0221Ujhhgtgfeyxiexzf implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1503Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0221Ujhhgtgfeyxiexzf(int i) {
        this.f1503Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) throws JSONException, IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        String genericString;
        String strM2093feyxiexzfUjhhgtg;
        String content;
        Object c0919feyxiexzfUjhhgtg;
        int i = this.f1503Ujhhgtgfeyxiexzf;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Member) obj2).isSynthetic() != ((Boolean) obj).booleanValue());
            case 1:
                String str = (String) obj;
                Member member = (Member) obj2;
                if (member instanceof Method) {
                    genericString = ((Method) member).toGenericString();
                } else if (member instanceof Constructor) {
                    genericString = ((Constructor) member).toGenericString();
                } else {
                    if (!(member instanceof Field)) {
                        throw new IllegalStateException(("Unsupported member type: " + member).toString());
                    }
                    genericString = ((Field) member).toGenericString();
                }
                return Boolean.valueOf(C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(genericString, str));
            case 2:
                return Boolean.valueOf(((Method) obj2).isDefault() == ((Boolean) obj).booleanValue());
            case 3:
                return Boolean.valueOf(((Method) obj2).isDefault() != ((Boolean) obj).booleanValue());
            case 4:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() == ((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() != ((Boolean) obj).booleanValue());
            case 6:
                Boolean bool = (Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj).invoke(((Field) obj2).getType());
                bool.booleanValue();
                return bool;
            case 7:
                Context context = (Context) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList();
                for (MsgInfoBean msgInfoBean : (List) obj2) {
                    if (!msgInfoBean.isText()) {
                        msgInfoBean = null;
                    }
                    String content2 = msgInfoBean != null ? msgInfoBean.getContent() : null;
                    if (content2 != null) {
                        arrayList.add(content2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String strM4243feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(arrayList, MagicFactory.get(4928901178944652682L, strArr), null, null, null, 62);
                    Intent intent = new Intent();
                    intent.setClassName(context, MagicFactory.get(4928209513116337546L, strArr));
                    intent.putExtra(MagicFactory.get(4928213047874422154L, strArr), 9);
                    intent.putExtra(MagicFactory.get(4928213116593898890L, strArr), strM4243feyxiexzfUjhhgtg);
                    context.startActivity(intent);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                Context context2 = (Context) obj;
                List<MsgInfoBean> list = (List) obj2;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = new ArrayList();
                for (MsgInfoBean msgInfoBean2 : list) {
                    if (!msgInfoBean2.isText()) {
                        msgInfoBean2 = null;
                    }
                    String content3 = msgInfoBean2 != null ? msgInfoBean2.getContent() : null;
                    if (content3 != null) {
                        arrayList2.add(content3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (MsgInfoBean msgInfoBean3 : list) {
                    if (!msgInfoBean3.isImage()) {
                        msgInfoBean3 = null;
                    }
                    if (msgInfoBean3 != null) {
                        C0759Ujhhgtgfeyxiexzf c0759Ujhhgtgfeyxiexzf = C0759Ujhhgtgfeyxiexzf.f3028Ujhhgtgfeyxiexzf;
                        Object origin = msgInfoBean3.getOrigin();
                        c0759Ujhhgtgfeyxiexzf.getClass();
                        strM2093feyxiexzfUjhhgtg = C0759Ujhhgtgfeyxiexzf.m2093feyxiexzfUjhhgtg(origin);
                    } else {
                        strM2093feyxiexzfUjhhgtg = null;
                    }
                    if (strM2093feyxiexzfUjhhgtg != null) {
                        arrayList3.add(strM2093feyxiexzfUjhhgtg);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    String strM4243feyxiexzfUjhhgtg2 = AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(arrayList2, MagicFactory.get(4928901170354718090L, strArr2), null, null, null, 62);
                    ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
                    Intent intent2 = new Intent();
                    intent2.setClassName(context2, MagicFactory.get(4928213198198277514L, strArr2));
                    intent2.putStringArrayListExtra(MagicFactory.get(4928213296982525322L, strArr2), arrayList4);
                    intent2.putExtra(MagicFactory.get(4928212382154491274L, strArr2), strM4243feyxiexzfUjhhgtg2);
                    context2.startActivity(intent2);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                Context context3 = (Context) obj;
                List<MsgInfoBean> list2 = (List) obj2;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ArrayList arrayList5 = new ArrayList();
                for (MsgInfoBean msgInfoBean4 : list2) {
                    if (!msgInfoBean4.isText()) {
                        msgInfoBean4 = null;
                    }
                    String content4 = msgInfoBean4 != null ? msgInfoBean4.getContent() : null;
                    if (content4 != null) {
                        arrayList5.add(content4);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (MsgInfoBean msgInfoBean5 : list2) {
                    if (!msgInfoBean5.isVideo()) {
                        msgInfoBean5 = null;
                    }
                    String imgPath = msgInfoBean5 != null ? msgInfoBean5.getImgPath() : null;
                    if (imgPath != null) {
                        arrayList6.add(imgPath);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    String strM4243feyxiexzfUjhhgtg3 = AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(arrayList5, MagicFactory.get(4928901299203736970L, strArr3), null, null, null, 62);
                    C1873feyxiexzfUjhhgtg c1873feyxiexzfUjhhgtg = C1873feyxiexzfUjhhgtg.f6250Ujhhgtgfeyxiexzf;
                    String str2 = (String) AbstractC2856feyxiexzfUjhhgtg.m4244feyxiexzfUjhhgtg(arrayList6);
                    c1873feyxiexzfUjhhgtg.getClass();
                    String strM3203feyxiexzfUjhhgtg = C1873feyxiexzfUjhhgtg.m3203feyxiexzfUjhhgtg(str2);
                    String str3 = (String) AbstractC2856feyxiexzfUjhhgtg.m4244feyxiexzfUjhhgtg(arrayList6);
                    Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1876feyxiexzfUjhhgtg.f6259Ujhhgtgfeyxiexzf);
                    C1877feyxiexzfUjhhgtg.f6260Ujhhgtgfeyxiexzf.getClass();
                    Object objInvoke = methodM3154feyxiexzfUjhhgtg.invoke(C1877feyxiexzfUjhhgtg.m3205feyxiexzfUjhhgtg(), str3);
                    MagicFactory.get(4928539461093950858L, strArr3);
                    Intent intent3 = new Intent();
                    intent3.setClassName(context3, MagicFactory.get(4928212459463902602L, strArr3));
                    intent3.putExtra(MagicFactory.get(4928212558248150410L, strArr3), 14);
                    intent3.putExtra(MagicFactory.get(4928212626967627146L, strArr3), strM3203feyxiexzfUjhhgtg);
                    intent3.putExtra(MagicFactory.get(4928212717161940362L, strArr3), (String) objInvoke);
                    intent3.putExtra(MagicFactory.get(4928212785881417098L, strArr3), strM4243feyxiexzfUjhhgtg3);
                    context3.startActivity(intent3);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    MsgInfoBean msgInfoBean6 = (MsgInfoBean) obj3;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i6 = msgInfoBean6.isFile() ? 10800000 : 120000;
                    if (msgInfoBean6.isSend() && jCurrentTimeMillis - msgInfoBean6.getCreateTime() <= i6) {
                        arrayList7.add(obj3);
                    }
                }
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    long msgId = ((MsgInfoBean) it.next()).getMsgId();
                    C1352feyxiexzfUjhhgtg c1352feyxiexzfUjhhgtg = C1352feyxiexzfUjhhgtg.f4830Ujhhgtgfeyxiexzf;
                    String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    String str4 = MagicFactory.get(4928256143576270218L, strArr4);
                    c1352feyxiexzfUjhhgtg.getClass();
                    C0519Ujhhgtgfeyxiexzf.f2467Ujhhgtgfeyxiexzf.getClass();
                    C1345feyxiexzfUjhhgtg.m2866feyxiexzfUjhhgtg(C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C1351feyxiexzfUjhhgtg.f4829Ujhhgtgfeyxiexzf).newInstance(C0519Ujhhgtgfeyxiexzf.m1808feyxiexzfUjhhgtg(msgId), str4, MagicFactory.get(4928256147871237514L, strArr4)));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                List<MsgInfoBean> list3 = (List) obj2;
                ArrayList arrayList8 = new ArrayList();
                for (MsgInfoBean msgInfoBean7 : list3) {
                    if (!msgInfoBean7.isVoice()) {
                        msgInfoBean7 = null;
                    }
                    String strM3385feyxiexzfUjhhgtg = msgInfoBean7 != null ? C2218Ujhhgtgfeyxiexzf.m3385feyxiexzfUjhhgtg(C2218Ujhhgtgfeyxiexzf.f7203Ujhhgtgfeyxiexzf, msgInfoBean7.getImgPath()) : null;
                    if (strM3385feyxiexzfUjhhgtg != null) {
                        arrayList8.add(strM3385feyxiexzfUjhhgtg);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (MsgInfoBean msgInfoBean8 : list3) {
                    if (!msgInfoBean8.isVoice()) {
                        msgInfoBean8 = null;
                    }
                    Integer numValueOf = (msgInfoBean8 == null || (content = msgInfoBean8.getContent()) == null) ? null : Integer.valueOf(Integer.parseInt(content));
                    if (numValueOf != null) {
                        arrayList9.add(numValueOf);
                    }
                }
                if (!arrayList8.isEmpty() && !arrayList9.isEmpty()) {
                    AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C0345Ujhhgtgfeyxiexzf.f1981Ujhhgtgfeyxiexzf, new C0346Ujhhgtgfeyxiexzf(arrayList8, arrayList9, z ? 1 : 0));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Activity.class);
                Activity activity = (Activity) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                String content5 = ((MsgInfoBean) obj2).getContent();
                Intent intent4 = new Intent();
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                intent4.setClassName(activity, MagicFactory.get(4928209513116337546L, strArr5));
                intent4.putExtra(MagicFactory.get(4928213047874422154L, strArr5), 9);
                intent4.putExtra(MagicFactory.get(4928213116593898890L, strArr5), content5);
                activity.startActivity(intent4);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Activity.class);
                Activity activity2 = (Activity) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                C0759Ujhhgtgfeyxiexzf c0759Ujhhgtgfeyxiexzf2 = C0759Ujhhgtgfeyxiexzf.f3028Ujhhgtgfeyxiexzf;
                Object origin2 = ((MsgInfoBean) obj2).getOrigin();
                c0759Ujhhgtgfeyxiexzf2.getClass();
                ArrayList<String> arrayList10 = new ArrayList<>(new C2381Ujhhgtgfeyxiexzf(new String[]{C0759Ujhhgtgfeyxiexzf.m2093feyxiexzfUjhhgtg(origin2)}, true));
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String str5 = MagicFactory.get(4928212326319916426L, strArr6);
                Intent intent5 = new Intent();
                intent5.setClassName(activity2, MagicFactory.get(4928213198198277514L, strArr6));
                intent5.putStringArrayListExtra(MagicFactory.get(4928213296982525322L, strArr6), arrayList10);
                intent5.putExtra(MagicFactory.get(4928212382154491274L, strArr6), str5);
                activity2.startActivity(intent5);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Activity.class);
                Activity activity3 = (Activity) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                String imgPath2 = ((MsgInfoBean) obj2).getImgPath();
                C1873feyxiexzfUjhhgtg.f6250Ujhhgtgfeyxiexzf.getClass();
                String strM3203feyxiexzfUjhhgtg2 = C1873feyxiexzfUjhhgtg.m3203feyxiexzfUjhhgtg(imgPath2);
                Method methodM3154feyxiexzfUjhhgtg2 = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1876feyxiexzfUjhhgtg.f6259Ujhhgtgfeyxiexzf);
                C1877feyxiexzfUjhhgtg.f6260Ujhhgtgfeyxiexzf.getClass();
                Object objInvoke2 = methodM3154feyxiexzfUjhhgtg2.invoke(C1877feyxiexzfUjhhgtg.m3205feyxiexzfUjhhgtg(), imgPath2);
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                MagicFactory.get(4928539461093950858L, strArr7);
                String str6 = MagicFactory.get(4928212867485795722L, strArr7);
                Intent intent6 = new Intent();
                intent6.setClassName(activity3, MagicFactory.get(4928212459463902602L, strArr7));
                intent6.putExtra(MagicFactory.get(4928212558248150410L, strArr7), 14);
                intent6.putExtra(MagicFactory.get(4928212626967627146L, strArr7), strM3203feyxiexzfUjhhgtg2);
                intent6.putExtra(MagicFactory.get(4928212717161940362L, strArr7), (String) objInvoke2);
                intent6.putExtra(MagicFactory.get(4928212785881417098L, strArr7), str6);
                activity3.startActivity(intent6);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                MsgInfoBean msgInfoBean9 = (MsgInfoBean) obj2;
                String talker = msgInfoBean9.getTalker();
                String content6 = msgInfoBean9.getContent();
                C0964feyxiexzfUjhhgtg c0964feyxiexzfUjhhgtg = new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928271871746508170L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                List listM2590feyxiexzfUjhhgtg = AbstractC1119feyxiexzfUjhhgtg.m2590feyxiexzfUjhhgtg(new C3455feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(c0964feyxiexzfUjhhgtg, content6), new C0504Ujhhgtgfeyxiexzf(25), 1));
                String strM2465Ujhhgtgfeyxiexzf = c0964feyxiexzfUjhhgtg.m2465Ujhhgtgfeyxiexzf(content6, new C0504Ujhhgtgfeyxiexzf(26));
                C1340feyxiexzfUjhhgtg c1340feyxiexzfUjhhgtg = C1340feyxiexzfUjhhgtg.f4818Ujhhgtgfeyxiexzf;
                int i10 = EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
                boolean z2 = !listM2590feyxiexzfUjhhgtg.isEmpty();
                c1340feyxiexzfUjhhgtg.getClass();
                C1345feyxiexzfUjhhgtg.m2866feyxiexzfUjhhgtg(C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, C1340feyxiexzfUjhhgtg.m2864feyxiexzfUjhhgtg(talker, strM2465Ujhhgtgfeyxiexzf, i10, z2, listM2590feyxiexzfUjhhgtg));
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                MsgInfoBean msgInfoBean10 = (MsgInfoBean) obj2;
                C0759Ujhhgtgfeyxiexzf c0759Ujhhgtgfeyxiexzf3 = C0759Ujhhgtgfeyxiexzf.f3028Ujhhgtgfeyxiexzf;
                Object origin3 = msgInfoBean10.getOrigin();
                c0759Ujhhgtgfeyxiexzf3.getClass();
                C0452Ujhhgtgfeyxiexzf.m1780Ujhhgtgfeyxiexzf(msgInfoBean10.getTalker(), C0759Ujhhgtgfeyxiexzf.m2093feyxiexzfUjhhgtg(origin3), null);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                MsgInfoBean msgInfoBean11 = (MsgInfoBean) obj2;
                C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(Integer.parseInt(msgInfoBean11.getContent()), msgInfoBean11.getTalker(), C2218Ujhhgtgfeyxiexzf.m3385feyxiexzfUjhhgtg(C2218Ujhhgtgfeyxiexzf.f7203Ujhhgtgfeyxiexzf, msgInfoBean11.getImgPath()));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                MsgInfoBean msgInfoBean12 = (MsgInfoBean) obj2;
                C1873feyxiexzfUjhhgtg c1873feyxiexzfUjhhgtg2 = C1873feyxiexzfUjhhgtg.f6250Ujhhgtgfeyxiexzf;
                String imgPath3 = msgInfoBean12.getImgPath();
                c1873feyxiexzfUjhhgtg2.getClass();
                C0452Ujhhgtgfeyxiexzf.m1782Ujhhgtgfeyxiexzf(msgInfoBean12.getTalker(), C1873feyxiexzfUjhhgtg.m3203feyxiexzfUjhhgtg(imgPath3));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                MsgInfoBean msgInfoBean13 = (MsgInfoBean) obj2;
                C3287Ujhhgtgfeyxiexzf c3287Ujhhgtgfeyxiexzf = C3287Ujhhgtgfeyxiexzf.f10316Ujhhgtgfeyxiexzf;
                String imgPath4 = msgInfoBean13.getImgPath();
                c3287Ujhhgtgfeyxiexzf.getClass();
                C3293Ujhhgtgfeyxiexzf.m4787feyxiexzfUjhhgtg(C3293Ujhhgtgfeyxiexzf.f10330Ujhhgtgfeyxiexzf, msgInfoBean13.getTalker(), C3287Ujhhgtgfeyxiexzf.m4785feyxiexzfUjhhgtg(imgPath4));
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                MsgInfoBean msgInfoBean14 = (MsgInfoBean) obj2;
                String talker2 = msgInfoBean14.getTalker();
                String title = msgInfoBean14.getQuoteMsg().getTitle();
                C0964feyxiexzfUjhhgtg c0964feyxiexzfUjhhgtg2 = new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928271871746508170L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                List listM2590feyxiexzfUjhhgtg2 = AbstractC1119feyxiexzfUjhhgtg.m2590feyxiexzfUjhhgtg(new C3455feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(c0964feyxiexzfUjhhgtg2, title), new C0504Ujhhgtgfeyxiexzf(25), 1));
                String strM2465Ujhhgtgfeyxiexzf2 = c0964feyxiexzfUjhhgtg2.m2465Ujhhgtgfeyxiexzf(title, new C0504Ujhhgtgfeyxiexzf(26));
                C1340feyxiexzfUjhhgtg c1340feyxiexzfUjhhgtg2 = C1340feyxiexzfUjhhgtg.f4818Ujhhgtgfeyxiexzf;
                int i11 = EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
                boolean z3 = !listM2590feyxiexzfUjhhgtg2.isEmpty();
                c1340feyxiexzfUjhhgtg2.getClass();
                C1345feyxiexzfUjhhgtg.m2866feyxiexzfUjhhgtg(C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, C1340feyxiexzfUjhhgtg.m2864feyxiexzfUjhhgtg(talker2, strM2465Ujhhgtgfeyxiexzf2, i11, z3, listM2590feyxiexzfUjhhgtg2));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf = (InterfaceC3737Ujhhgtgfeyxiexzf) obj2;
                if (!(interfaceC3737Ujhhgtgfeyxiexzf instanceof InterfaceC2009feyxiexzfUjhhgtg)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC3737Ujhhgtgfeyxiexzf : Integer.valueOf(iIntValue + 1);
            case Opcodes.LLOAD /* 22 */:
                InterfaceC2009feyxiexzfUjhhgtg interfaceC2009feyxiexzfUjhhgtg = (InterfaceC2009feyxiexzfUjhhgtg) obj;
                InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf2 = (InterfaceC3737Ujhhgtgfeyxiexzf) obj2;
                if (interfaceC2009feyxiexzfUjhhgtg != null) {
                    return interfaceC2009feyxiexzfUjhhgtg;
                }
                if (interfaceC3737Ujhhgtgfeyxiexzf2 instanceof InterfaceC2009feyxiexzfUjhhgtg) {
                    return (InterfaceC2009feyxiexzfUjhhgtg) interfaceC3737Ujhhgtgfeyxiexzf2;
                }
                return null;
            case Opcodes.FLOAD /* 23 */:
                return (C1987feyxiexzfUjhhgtg) obj;
            case Opcodes.DLOAD /* 24 */:
                int iIntValue2 = ((Integer) obj).intValue();
                List list4 = (List) obj2;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (iIntValue2 == 2) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj4 : list4) {
                        int i12 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                            throw null;
                        }
                        JSONObject jSONObject = (JSONObject) obj4;
                        sb.append("第" + i12 + (char) 24352);
                        sb.append('\n');
                        sb.append(MagicFactory.get(4928820991905236362L, strArr8) + jSONObject.getString(MagicFactory.get(4928820914595825034L, strArr8)) + jSONObject.getString(MagicFactory.get(4928821034854909322L, strArr8)));
                        sb.append('\n');
                        i5 = i12;
                    }
                    AbstractC1150feyxiexzfUjhhgtg.m2617Ujhhgtgfeyxiexzf(sb.toString());
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928821107869353354L, strArr8));
                } else if (iIntValue2 == 4) {
                    JSONObject jSONObject2 = (JSONObject) list4.get(0);
                    int i13 = jSONObject2.getInt(MagicFactory.get(4928821077804582282L, strArr8));
                    Locale locale = Locale.CHINA;
                    String str7 = String.format(locale, MagicFactory.get(4928821155113993610L, strArr8), Arrays.copyOf(new Object[]{Integer.valueOf(i13 / 3600), Integer.valueOf((i13 % 3600) / 60), Integer.valueOf(i13 % 60)}, 3));
                    MagicFactory.get(4928821228128437642L, strArr8);
                    String str8 = String.format(locale, MagicFactory.get(4928821275373077898L, strArr8), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject2.getInt(MagicFactory.get(4928821314027783562L, strArr8))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(4928821378452293002L, strArr8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(MagicFactory.get(4928821326912685450L, strArr8) + str7);
                    sb2.append('\n');
                    sb2.append(MagicFactory.get(4928821442876802442L, strArr8) + str8);
                    sb2.append('\n');
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(MagicFactory.get(4928821421401965962L, strArr8));
                    if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(MagicFactory.get(4928820394904782218L, strArr8))) {
                        String string = jSONObject2.getString(MagicFactory.get(4928820433559487882L, strArr8));
                        String string2 = jSONObject2.getString(MagicFactory.get(4928820553818572170L, strArr8));
                        String string3 = jSONObject2.getString(MagicFactory.get(4928820510868899210L, strArr8));
                        sb2.append(MagicFactory.get(4928820605358179722L, strArr8) + string + string2);
                        sb2.append('\n');
                        sb2.append(MagicFactory.get(4928820583883343242L, strArr8) + string3);
                        sb2.append('\n');
                    } else {
                        sb2.append(MagicFactory.get(4928820356250076554L, strArr8) + jSONObjectOptJSONObject.getString(MagicFactory.get(4928820472214193546L, strArr8)));
                        sb2.append('\n');
                    }
                    AbstractC1150feyxiexzfUjhhgtg.m2617Ujhhgtgfeyxiexzf(sb2.toString());
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928820562408506762L, strArr8));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                int iIntValue3 = ((Integer) obj).intValue();
                List list5 = (List) obj2;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = null;
                if (iIntValue3 == 2) {
                    for (Object obj5 : list5) {
                        int i14 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                            throw null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj5;
                        String string4 = jSONObject3.getString(MagicFactory.get(4928820669782689162L, strArr9));
                        String string5 = jSONObject3.getString(MagicFactory.get(4928820639717918090L, strArr9));
                        String string6 = jSONObject3.getString(MagicFactory.get(4928820759977002378L, strArr9));
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2222Ujhhgtgfeyxiexzf("第" + i14 + (char) 24352, string4, string5, string6, null, 0));
                        i4 = i14;
                    }
                } else if (iIntValue3 == 4) {
                    JSONObject jSONObject4 = (JSONObject) list5.get(0);
                    String string7 = jSONObject4.getString(MagicFactory.get(4928820717027329418L, strArr9));
                    String str9 = String.format(Locale.CHINA, MagicFactory.get(4928820785746806154L, strArr9), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject4.getInt(MagicFactory.get(4928820824401511818L, strArr9))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(4928820893120988554L, strArr9);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject(MagicFactory.get(4928820841581381002L, strArr9));
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has(MagicFactory.get(4928824213130708362L, strArr9))) {
                        String string8 = jSONObject4.getString(MagicFactory.get(4928824311914956170L, strArr9));
                        String string9 = jSONObject4.getString(MagicFactory.get(4928824294735086986L, strArr9));
                        String string10 = jSONObject4.getString(MagicFactory.get(4928824389224367498L, strArr9));
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf2 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2224Ujhhgtgfeyxiexzf(str9, string7, string10, string8, string9, null, 0));
                    } else {
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf3 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2223Ujhhgtgfeyxiexzf(str9, string7, jSONObjectOptJSONObject2, interfaceC3704Ujhhgtgfeyxiexzf, 0));
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                int iIntValue4 = ((Integer) obj).intValue();
                List list6 = (List) obj2;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (iIntValue4 == 2) {
                    StringBuilder sb3 = new StringBuilder();
                    for (Object obj6 : list6) {
                        int i15 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                            throw null;
                        }
                        JSONObject jSONObject5 = (JSONObject) obj6;
                        sb3.append("第" + i15 + (char) 24352);
                        sb3.append('\n');
                        sb3.append(MagicFactory.get(4928825608995079562L, strArr10) + jSONObject5.getString(MagicFactory.get(4928825531685668234L, strArr10)) + jSONObject5.getString(MagicFactory.get(4928825514505799050L, strArr10)));
                        sb3.append('\n');
                        i3 = i15;
                    }
                    AbstractC1150feyxiexzfUjhhgtg.m2617Ujhhgtgfeyxiexzf(sb3.toString());
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928825587520243082L, strArr10));
                } else if (iIntValue4 == 4) {
                    JSONObject jSONObject6 = (JSONObject) list6.get(0);
                    int i16 = jSONObject6.getInt(MagicFactory.get(4928825694894425482L, strArr10));
                    Locale locale2 = Locale.CHINA;
                    String str10 = String.format(locale2, MagicFactory.get(4928825772203836810L, strArr10), Arrays.copyOf(new Object[]{Integer.valueOf(i16 / 3600), Integer.valueOf((i16 % 3600) / 60), Integer.valueOf(i16 % 60)}, 3));
                    MagicFactory.get(4928825845218280842L, strArr10);
                    String str11 = String.format(locale2, MagicFactory.get(4928824792951293322L, strArr10), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject6.getInt(MagicFactory.get(4928825793678673290L, strArr10))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(4928824758591554954L, strArr10);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(MagicFactory.get(4928824844490900874L, strArr10) + str10);
                    sb4.append('\n');
                    sb4.append(MagicFactory.get(4928824823016064394L, strArr10) + str11);
                    sb4.append('\n');
                    JSONObject jSONObjectOptJSONObject3 = jSONObject6.optJSONObject(MagicFactory.get(4928824938980181386L, strArr10));
                    if (jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject3.has(MagicFactory.get(4928825011994625418L, strArr10))) {
                        String string11 = jSONObject6.getString(MagicFactory.get(4928825050649331082L, strArr10));
                        String string12 = jSONObject6.getString(MagicFactory.get(4928825033469461898L, strArr10));
                        String string13 = jSONObject6.getString(MagicFactory.get(4928825127958742410L, strArr10));
                        sb4.append(MagicFactory.get(4928825222448022922L, strArr10) + string11 + string12);
                        sb4.append('\n');
                        sb4.append(MagicFactory.get(4928825200973186442L, strArr10) + string13);
                        sb4.append('\n');
                    } else {
                        sb4.append(MagicFactory.get(4928824973339919754L, strArr10) + jSONObjectOptJSONObject3.getString(MagicFactory.get(4928825089304036746L, strArr10)));
                        sb4.append('\n');
                    }
                    AbstractC1150feyxiexzfUjhhgtg.m2617Ujhhgtgfeyxiexzf(sb4.toString());
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928825179498349962L, strArr10));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                int iIntValue5 = ((Integer) obj).intValue();
                List list7 = (List) obj2;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf2 = null;
                if (iIntValue5 == 2) {
                    for (Object obj7 : list7) {
                        int i17 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                            throw null;
                        }
                        JSONObject jSONObject7 = (JSONObject) obj7;
                        String string14 = jSONObject7.getString(MagicFactory.get(4928825286872532362L, strArr11));
                        String string15 = jSONObject7.getString(MagicFactory.get(4928825256807761290L, strArr11));
                        String string16 = jSONObject7.getString(MagicFactory.get(4928825239627892106L, strArr11));
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf4 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2222Ujhhgtgfeyxiexzf("第" + i17 + (char) 24352, string14, string15, string16, null, 1));
                        i2 = i17;
                    }
                } else if (iIntValue5 == 4) {
                    JSONObject jSONObject8 = (JSONObject) list7.get(0);
                    String string17 = jSONObject8.getString(MagicFactory.get(4928828632652055946L, strArr11));
                    String str12 = String.format(Locale.CHINA, MagicFactory.get(4928828701371532682L, strArr11), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject8.getInt(MagicFactory.get(4928828602587284874L, strArr11))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(4928828671306761610L, strArr11);
                    JSONObject jSONObjectOptJSONObject4 = jSONObject8.optJSONObject(MagicFactory.get(4928828757206107530L, strArr11));
                    if (jSONObjectOptJSONObject4 == null || !jSONObjectOptJSONObject4.has(MagicFactory.get(4928828830220551562L, strArr11))) {
                        String string18 = jSONObject8.getString(MagicFactory.get(4928828929004799370L, strArr11));
                        String string19 = jSONObject8.getString(MagicFactory.get(4928828911824930186L, strArr11));
                        String string20 = jSONObject8.getString(MagicFactory.get(4928829006314210698L, strArr11));
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf5 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2224Ujhhgtgfeyxiexzf(str12, string17, string20, string18, string19, null, 1));
                    } else {
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf6 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2223Ujhhgtgfeyxiexzf(str12, string17, jSONObjectOptJSONObject4, interfaceC3704Ujhhgtgfeyxiexzf2, 1));
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                MsgInfoBean msgInfoBean15 = (MsgInfoBean) obj2;
                AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C2205Ujhhgtgfeyxiexzf.f7174Ujhhgtgfeyxiexzf, new C2203Ujhhgtgfeyxiexzf(C2218Ujhhgtgfeyxiexzf.m3385feyxiexzfUjhhgtg(C2218Ujhhgtgfeyxiexzf.f7203Ujhhgtgfeyxiexzf, msgInfoBean15.getImgPath()), Integer.parseInt(msgInfoBean15.getContent()), z ? 1 : 0));
                return c1943Ujhhgtgfeyxiexzf;
            default:
                MsgInfoBean msgInfoBean16 = (MsgInfoBean) obj2;
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                long msgId2 = msgInfoBean16.getMsgId();
                String imgPath5 = msgInfoBean16.getImgPath();
                String strM3385feyxiexzfUjhhgtg2 = C2218Ujhhgtgfeyxiexzf.m3385feyxiexzfUjhhgtg(C2218Ujhhgtgfeyxiexzf.f7203Ujhhgtgfeyxiexzf, imgPath5);
                try {
                    File file = new File(C2219Ujhhgtgfeyxiexzf.f7204Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                    file.mkdirs();
                    String str13 = msgId2 + '-' + imgPath5 + '-' + System.currentTimeMillis() + MagicFactory.get(4928840993567933834L, strArr12);
                    File file2 = new File(file, str13);
                    SilkCodec silkCodec = AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf;
                    AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf.silkToMp3(strM3385feyxiexzfUjhhgtg2, file2.getAbsolutePath(), 24000);
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928840972093097354L, strArr12) + file.getAbsolutePath() + '/' + str13);
                    c0919feyxiexzfUjhhgtg = c1943Ujhhgtgfeyxiexzf;
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
                if (thM2409Ujhhgtgfeyxiexzf != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(MagicFactory.get(4928841079467279754L, strArr12));
                    String message = thM2409Ujhhgtgfeyxiexzf.getMessage();
                    sb5.append(message != null ? AbstractC1152feyxiexzfUjhhgtg.m2643feyxiexzfUjhhgtg(50, message) : MagicFactory.get(4928841049402508682L, strArr12));
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb5.toString());
                }
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
