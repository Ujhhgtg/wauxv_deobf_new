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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᛸᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2792 extends AbstractC2927 implements InterfaceC1613, InterfaceC1614 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2792 f8961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8962;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8964;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8961 = new C2792("SnsFakeLikeHook");
        f8962 = "朋友圈";
        f8963 = "朋友圈伪点赞";
        f8964 = "支持朋友圈自定义消息的好友点赞数量";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static Set m4762(long j) {
        Object next;
        StringBuilder sb;
        Iterator it = C2791.f8960.m2665().iterator();
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
            return C1194.f4329;
        }
        String[] strArr = AbstractC1471.f5234;
        return AbstractC0739.m2308(AbstractC2901.m4876(AbstractC2901.m4877(str, "|", str), new String[]{";"}));
    }

    @Override // p000.InterfaceC1613
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final List mo3504() {
        return !mo3445() ? C1191.f4326 : Collections.singletonList(new C2804(R.id.MenuItem_Sns_Like, "伪点赞[WA]", new C2789(0)));
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1382(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m4763(str, contentValues);
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1379(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m4763(str, contentValues);
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8964;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8963;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8962;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final void m4763(String str, ContentValues contentValues) throws IllegalAccessException {
        String[] strArr = AbstractC1471.f5234;
        if (mo3445() && str.equals("SnsInfo")) {
            Object obj = contentValues.get("snsId");
            "null cannot be cast to non-null type kotlin.Long";
            Set<String> setM4762 = m4762(((Long) obj).longValue());
            if (setM4762.isEmpty()) {
                return;
            }
            Class clsM2606 = AbstractC0972.m2606("com.tencent.mm.protocal.protobuf.SnsObject");
            Object obj2 = contentValues.get("attrBuf");
            "null cannot be cast to non-null type kotlin.ByteArray";
            Object objM2224 = AbstractC0705.m2224(clsM2606, new Object[0]);
            int i = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4713(objM2224).m3560();
            c2004M3560.f6475 = "parseFrom";
            c2004M3560.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(byte[].class)}, 1));
            c2004M3560.m3926();
            ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025((byte[]) obj2);
            C1681 c1681M4713 = AbstractC2727.m4713(objM2224);
            LinkedList linkedList = new LinkedList();
            for (String str2 : setM4762) {
                C2834.f9037.getClass();
                Object objM2225 = AbstractC0705.m2224(AbstractC0972.m2608(C2833.f9036), new Object[0]);
                int i2 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(objM2225).m3558();
                c1300M3558.f6475 = "d";
                ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3128(str2);
                linkedList.push(objM2225);
            }
            int size = linkedList.size();
            int i3 = !linkedList.isEmpty() ? 1 : 0;
            C1300 c1300M3559 = c1681M4713.m3558();
            c1300M3559.f6475 = "LikeUserList";
            ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3128(linkedList);
            C1300 c1300M35510 = c1681M4713.m3558();
            c1300M35510.f6475 = "LikeUserListCount";
            ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3128(Integer.valueOf(size));
            C1300 c1300M35511 = c1681M4713.m3558();
            c1300M35511.f6475 = "LikeCount";
            ((C1316) AbstractC0739.m2290(c1300M35511.m3117())).m3128(Integer.valueOf(size));
            C1300 c1300M35512 = c1681M4713.m3558();
            c1300M35512.f6475 = "LikeFlag";
            ((C1316) AbstractC0739.m2290(c1300M35512.m3117())).m3128(Integer.valueOf(i3));
            int i4 = AbstractC1768.f5906;
            C2004 c2004M3561 = AbstractC2727.m4713(objM2224).m3560();
            c2004M3561.f6648 = AbstractC2574.m4549(byte[].class);
            c2004M3561.f6475 = "toByteArray";
            contentValues.put("attrBuf", (byte[]) ((C2013) AbstractC2844.m4776(c2004M3561)).m4026(new Object[0]));
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
