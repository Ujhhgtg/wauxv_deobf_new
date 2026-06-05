package p000;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴ要点脸ᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1071feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0744Ujhhgtgfeyxiexzf, InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1071feyxiexzfUjhhgtg f4140Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4141Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4142Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4143Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4140Ujhhgtgfeyxiexzf = new C1071feyxiexzfUjhhgtg("SnsFakeLikeHook");
        f4141Ujhhgtgfeyxiexzf = "朋友圈";
        f4142Ujhhgtgfeyxiexzf = "朋友圈伪点赞";
        f4143Ujhhgtgfeyxiexzf = "支持朋友圈自定义消息的好友点赞数量";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static Set m2551feyxiexzfUjhhgtg(long j) {
        Object next;
        StringBuilder sb;
        Iterator it = C1068feyxiexzfUjhhgtg.f4134Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            sb = new StringBuilder();
            sb.append(j);
            sb.append('|');
        } while (!((String) next).startsWith(sb.toString()));
        String str = (String) next;
        if (str == null) {
            return C3310feyxiexzfUjhhgtg.f10347Ujhhgtgfeyxiexzf;
        }
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        return AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, "|", str), new String[]{";"}));
    }

    @Override // p000.InterfaceC0744Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final List mo2080Ujhhgtgfeyxiexzf() {
        return !mo1424feyxiexzfUjhhgtg() ? C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf : Collections.singletonList(new C1056feyxiexzfUjhhgtg(R.id.MenuItem_Sns_Like, "伪点赞[WA]", new C1073feyxiexzfUjhhgtg(0)));
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo2082Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m2552feyxiexzfUjhhgtg(str, contentValues);
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1830Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m2552feyxiexzfUjhhgtg(str, contentValues);
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4143Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4142Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4141Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2552feyxiexzfUjhhgtg(String str, ContentValues contentValues) throws IllegalAccessException {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg() && str.equals("SnsInfo")) {
            Object obj = contentValues.get("snsId");
            "null cannot be cast to non-null type kotlin.Long";
            Set<String> setM2551feyxiexzfUjhhgtg = m2551feyxiexzfUjhhgtg(((Long) obj).longValue());
            if (setM2551feyxiexzfUjhhgtg.isEmpty()) {
                return;
            }
            Class clsM2792Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.protocal.protobuf.SnsObject");
            Object obj2 = contentValues.get("attrBuf");
            "null cannot be cast to non-null type kotlin.ByteArray";
            Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(clsM2792Ujhhgtgfeyxiexzf, new Object[0]);
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "parseFrom";
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class)}, 1));
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
            ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf((byte[]) obj2);
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf);
            LinkedList linkedList = new LinkedList();
            for (String str2 : setM2551feyxiexzfUjhhgtg) {
                C1240feyxiexzfUjhhgtg.f4577Ujhhgtgfeyxiexzf.getClass();
                Object objM4168Ujhhgtgfeyxiexzf2 = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1239feyxiexzfUjhhgtg.f4576Ujhhgtgfeyxiexzf), new Object[0]);
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "d";
                ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(str2);
                linkedList.push(objM4168Ujhhgtgfeyxiexzf2);
            }
            int size = linkedList.size();
            int i3 = !linkedList.isEmpty() ? 1 : 0;
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "LikeUserList";
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(linkedList);
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "LikeUserListCount";
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(size));
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "LikeCount";
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(size));
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "LikeFlag";
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(i3));
            int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class);
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "toByteArray";
            contentValues.put("attrBuf", (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(new Object[0]));
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
