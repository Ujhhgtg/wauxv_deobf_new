package p000;

import android.database.Cursor;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.LinkedList;
import java.util.List;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲇᲁᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2158 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7118;

    public /* synthetic */ C2158(int i) {
        this.f7118 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f7118) {
            case 0:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                Class<String> cls = String.class;
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (clsM2183 == null) {
                    clsM2183 = cls;
                }
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1981M4739.m3823(clsM2183, clsM2184 != null ? clsM2184 : String.class);
                c1333.f4794 = c1981M4739;
                return C3497.f10997;
            case 1:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C2158(2);
                c1020.f3733 = new C2158(3);
                return C3497.f10997;
            case 2:
                ((C1332) obj).m3050(new C2158(4));
                return C3497.f10997;
            case 3:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                Class cls2 = clsM2185 != null ? clsM2185 : String.class;
                Class<List> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(List.class));
                Class cls3 = clsM2186 != null ? clsM2186 : List.class;
                Class<Integer> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(Integer.class));
                c1981M47310.m3823(cls2, cls3, clsM2187 != null ? clsM2187 : Integer.class);
                c1334.f4794 = c1981M47310;
                return C3497.f10997;
            case 4:
                String[] strArr = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ChatroomMembersLogic", "/cgi-bin/micromsg-bin/delchatroommember");
                return C3497.f10997;
            case 5:
                C1020 c1021 = (C1020) obj;
                c1021.f3732 = new C2158(6);
                c1021.f3733 = new C2158(7);
                return C3497.f10997;
            case 6:
                C1332 c1332 = (C1332) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1332.m3051(MagicFactory.get(-121569049311924L, strArr2));
                C0705 c0705 = new C0705(4);
                c0705.m2127(MagicFactory.get(-121281286503092L, strArr2), MagicFactory.get(-121427315391156L, strArr2));
                c1332.f4791 = c0705;
                return C3497.f10997;
            case 7:
                ((C1333) obj).m3052(new C2158(8));
                return C3497.f10997;
            case 8:
                C1981 c1981 = (C1981) obj;
                Class<String> cls4 = String.class;
                Class<String> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(cls4));
                if (clsM2188 == null) {
                    clsM2188 = cls4;
                }
                Class<Integer> cls5 = Integer.class;
                Class<Integer> clsM2189 = AbstractC0743.m2183(AbstractC2519.m4527(cls5));
                if (clsM2189 == null) {
                    clsM2189 = cls5;
                }
                Class<Integer> clsM21810 = AbstractC0743.m2183(AbstractC2519.m4527(cls5));
                cls5 = clsM21810 != null ? clsM21810 : Integer.class;
                Class<String> clsM21811 = AbstractC0743.m2183(AbstractC2519.m4527(cls4));
                if (clsM21811 == null) {
                    clsM21811 = cls4;
                }
                Class<String> clsM21812 = AbstractC0743.m2183(AbstractC2519.m4527(cls4));
                c1981.m3823(clsM2188, clsM2189, cls5, clsM21811, clsM21812 != null ? clsM21812 : String.class);
                return C3497.f10997;
            case 9:
                return (String) ((C1903) ((C1904) obj).m3699()).get(1);
            case 10:
                String str = (String) ((C1903) ((C1904) obj).m3699()).get(1);
                String[] strArr3 = AbstractC1574.f5469;
                if (AbstractC2207.m4087(str, MagicFactory.get(-109723529509556L, strArr3))) {
                    return MagicFactory.get(-109770774149812L, strArr3);
                }
                Cursor cursorM2715 = C1133.m2715(MagicFactory.get(-79615808764596L, strArr3) + str + '\'');
                if (cursorM2715 != null) {
                    cursorM2715.moveToFirst();
                } else {
                    cursorM2715 = null;
                }
                FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                String nickname = friendInfoM2176 != null ? friendInfoM2176.getNickname() : null;
                StringBuilder sb = new StringBuilder("@");
                if (nickname != null) {
                    str = nickname;
                }
                sb.append(str);
                return sb.toString();
            case 11:
                return (String) ((C1903) ((C1904) obj).m3699()).get(1);
            case Opcodes.FCONST_1 /* 12 */:
                String str2 = (String) ((C1903) ((C1904) obj).m3699()).get(1);
                String[] strArr4 = AbstractC1574.f5469;
                if (AbstractC2207.m4087(str2, MagicFactory.get(-109792248986292L, strArr4))) {
                    return MagicFactory.get(-109839493626548L, strArr4);
                }
                Cursor cursorM2716 = C1133.m2715(MagicFactory.get(-79615808764596L, strArr4) + str2 + '\'');
                if (cursorM2716 != null) {
                    cursorM2716.moveToFirst();
                } else {
                    cursorM2716 = null;
                }
                FriendInfo friendInfoM2177 = cursorM2716 != null ? AbstractC0743.m2176(cursorM2716) : null;
                String nickname2 = friendInfoM2177 != null ? friendInfoM2177.getNickname() : null;
                StringBuilder sb2 = new StringBuilder("@");
                if (nickname2 != null) {
                    str2 = nickname2;
                }
                sb2.append(str2);
                return sb2.toString();
            case 13:
                C1020 c1022 = (C1020) obj;
                c1022.f3732 = new C2158(14);
                c1022.f3733 = new C2158(15);
                return C3497.f10997;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1332) obj).m3050(new C2158(16));
                return C3497.f10997;
            case 15:
                C1333 c1335 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1335);
                Class<String> clsM21813 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                Class cls6 = clsM21813 != null ? clsM21813 : String.class;
                Class<List> clsM21814 = AbstractC0743.m2183(AbstractC2519.m4527(List.class));
                Class cls7 = clsM21814 != null ? clsM21814 : List.class;
                Class<Integer> clsM21815 = AbstractC0743.m2183(AbstractC2519.m4527(Integer.class));
                Class cls8 = clsM21815 != null ? clsM21815 : Integer.class;
                Class<Object> clsM21816 = AbstractC0743.m2183(AbstractC2519.m4527(Object.class));
                c1981M47311.m3823(cls6, cls7, cls8, clsM21816 != null ? clsM21816 : Object.class);
                c1335.f4794 = c1981M47311;
                return C3497.f10997;
            case 16:
                String[] strArr5 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-121947006433972L, strArr5), MagicFactory.get(-122110215191220L, strArr5));
                return C3497.f10997;
            case Opcodes.SIPUSH /* 17 */:
                ((C1020) obj).f3733 = new C2158(18);
                return C3497.f10997;
            case Opcodes.LDC /* 18 */:
                ((C1333) obj).m3052(new C2158(19));
                return C3497.f10997;
            case 19:
                C1981 c1982 = (C1981) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1982.m3827(MagicFactory.get(-122458107542196L, strArr6), MagicFactory.get(-122599841462964L, strArr6));
                Class clsM21817 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                Class cls9 = clsM21817 == null ? String.class : clsM21817;
                Class clsM21818 = AbstractC0743.m2183(AbstractC2519.m4527(LinkedList.class));
                if (clsM21818 == null) {
                    clsM21818 = LinkedList.class;
                }
                Class clsM21819 = AbstractC0743.m2183(AbstractC2519.m4527(Integer.class));
                if (clsM21819 == null) {
                    clsM21819 = Integer.class;
                }
                Class clsM21820 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                if (clsM21820 == null) {
                    clsM21820 = String.class;
                }
                Class clsM21821 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                if (clsM21821 == null) {
                    clsM21821 = String.class;
                }
                Class clsM21822 = AbstractC0743.m2183(AbstractC2519.m4527(Integer.class));
                Class cls10 = clsM21822 == null ? Integer.class : clsM21822;
                Class clsM21823 = AbstractC0743.m2183(AbstractC2519.m4527(Integer.class));
                c1982.m3823(cls9, clsM21818, clsM21819, clsM21820, clsM21821, cls10, clsM21823 == null ? Integer.class : clsM21823, null);
                return C3497.f10997;
            case 20:
                ((C1020) obj).f3733 = new C2158(21);
                return C3497.f10997;
            case Opcodes.ILOAD /* 21 */:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47312 = AbstractC2784.m4739(c1336);
                c1981M47312.m3827("/cgi-bin/micromsg-bin/modifycontactlabellist");
                Class<LinkedList> clsM21824 = AbstractC0743.m2183(AbstractC2519.m4527(LinkedList.class));
                c1981M47312.m3823(clsM21824 != null ? clsM21824 : LinkedList.class);
                c1336.f4794 = c1981M47312;
                return C3497.f10997;
            case Opcodes.LLOAD /* 22 */:
                C1020 c1023 = (C1020) obj;
                c1023.f3732 = new C2158(23);
                c1023.f3733 = new C2158(24);
                return C3497.f10997;
            case Opcodes.FLOAD /* 23 */:
                ((C1332) obj).m3050(new C2158(25));
                return C3497.f10997;
            case Opcodes.DLOAD /* 24 */:
                ((C1333) obj).m3052(new C2158(26));
                return C3497.f10997;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr7 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-123415885249204L, strArr7), MagicFactory.get(-123523259431604L, strArr7), MagicFactory.get(-123664993352372L, strArr7));
                return C3497.f10997;
            case 26:
                C1981 c1983 = (C1981) obj;
                Class<String> cls11 = String.class;
                Class<String> clsM21825 = AbstractC0743.m2183(AbstractC2519.m4527(cls11));
                if (clsM21825 == null) {
                    clsM21825 = cls11;
                }
                Class<String> clsM21826 = AbstractC0743.m2183(AbstractC2519.m4527(cls11));
                cls11 = clsM21826 != null ? clsM21826 : String.class;
                Class<Integer> cls12 = Integer.class;
                Class<Integer> clsM21827 = AbstractC0743.m2183(AbstractC2519.m4527(cls12));
                if (clsM21827 == null) {
                    clsM21827 = cls12;
                }
                Class<Integer> clsM21828 = AbstractC0743.m2183(AbstractC2519.m4527(cls12));
                cls12 = clsM21828 != null ? clsM21828 : Integer.class;
                Class<Object> clsM21829 = AbstractC0743.m2183(AbstractC2519.m4527(Object.class));
                c1983.m3823(clsM21825, cls11, clsM21827, cls12, clsM21829 != null ? clsM21829 : Object.class);
                return C3497.f10997;
            case 27:
                C1020 c1024 = (C1020) obj;
                c1024.f3732 = new C2158(28);
                c1024.f3733 = new C2158(29);
                return C3497.f10997;
            case 28:
                C1332 c1337 = (C1332) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1337.m3051(MagicFactory.get(-124266288773812L, strArr8));
                C0705 c0706 = new C0705(4);
                c0706.m2127(MagicFactory.get(-124008590736052L, strArr8), MagicFactory.get(-124146029689524L, strArr8));
                c1337.f4791 = c0706;
                return C3497.f10997;
            default:
                ((C1333) obj).m3052(new C2174(0));
                return C3497.f10997;
        }
    }
}
