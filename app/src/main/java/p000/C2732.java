package p000;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᛸᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2732 extends AbstractC2867 implements InterfaceC1600, InterfaceC1601 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2732 f8799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8802;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8799 = new C2732("SnsFakeLikeHook");
        f8800 = "朋友圈";
        f8801 = "朋友圈伪点赞";
        f8802 = "支持朋友圈自定义消息的好友点赞数量";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static Set m4728(long j) {
        Object next;
        StringBuilder sb;
        Iterator it = C2731.f8798.m2541().iterator();
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
            return C1192.f4332;
        }
        String[] strArr = AbstractC1574.f5469;
        return AbstractC0744.m2209(AbstractC2841.m4843(AbstractC2841.m4844(str, "|", str), new String[]{";"}));
    }

    @Override // p000.InterfaceC1600
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final List mo3340() {
        return !mo3264() ? C1189.f4329 : Collections.singletonList(new C2744(R.id.MenuItem_Sns_Like, "伪点赞[WA]", new C2729(0)));
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1236(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m4729(str, contentValues);
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m4729(str, contentValues);
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8802;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8801;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8800;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m4729(String str, ContentValues contentValues) throws IllegalAccessException {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264() && str.equals("SnsInfo")) {
            Object obj = contentValues.get("snsId");
            Set<String> setM4728 = m4728(((Long) obj).longValue());
            if (setM4728.isEmpty()) {
                return;
            }
            Class clsM3988 = AbstractC2201.m3988("com.tencent.mm.protocal.protobuf.SnsObject");
            Object obj2 = contentValues.get("attrBuf");
            Object objM2131 = AbstractC0710.m2131(clsM3988, new Object[0]);
            int i = 0;
            MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(objM2131).m3492();
            c1973M3492.f6370 = "parseFrom";
            c1973M3492.m2888(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(byte[].class)}, 1));
            c1973M3492.m3732();
            ((C1982) AbstractC0744.firstInList(c1973M3492.m3799())).m3831((byte[]) obj2);
            C1744 c1744M2484 = AbstractC0968.startFieldResolution(objM2131);
            LinkedList linkedList = new LinkedList();
            for (String str2 : setM4728) {
                
                Object objM2132 = AbstractC0710.m2131(AbstractC1574.dexToClass(C2773.f8874), new Object[0]);
                int i2 = 0;
                C1299 c1299M3490 = AbstractC0968.startFieldResolution(objM2132).m3490();
                c1299M3490.f6370 = "d";
                ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).set(str2);
                linkedList.push(objM2132);
            }
            int size = linkedList.size();
            int i3 = !linkedList.isEmpty() ? 1 : 0;
            C1299 c1299M3491 = c1744M2484.m3490();
            c1299M3491.f6370 = "LikeUserList";
            ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).set(linkedList);
            C1299 c1299M3492 = c1744M2484.m3490();
            c1299M3492.f6370 = "LikeUserListCount";
            ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).set(Integer.valueOf(size));
            C1299 c1299M3493 = c1744M2484.m3490();
            c1299M3493.f6370 = "LikeCount";
            ((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).set(Integer.valueOf(size));
            C1299 c1299M3494 = c1744M2484.m3490();
            c1299M3494.f6370 = "LikeFlag";
            ((C1315) AbstractC0744.firstInList(c1299M3494.resolve())).set(Integer.valueOf(i3));
            int i4 = 0;
            MethodResolver c1973M3493 = AbstractC0968.startFieldResolution(objM2131).m3492();
            c1973M3493.returnType = AbstractC2519.classToKClass(byte[].class);
            c1973M3493.f6370 = "toByteArray";
            contentValues.put("attrBuf", (byte[]) ((C1982) AbstractC2784.m4742(c1973M3493)).invoke(new Object[0]));
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
