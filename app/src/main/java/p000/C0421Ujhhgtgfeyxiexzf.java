package p000;

import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸ᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0421Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2258Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f2259Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3407Ujhhgtgfeyxiexzf f2260Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0421Ujhhgtgfeyxiexzf(String str, C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf, int i) {
        this.f2258Ujhhgtgfeyxiexzf = i;
        this.f2259Ujhhgtgfeyxiexzf = str;
        this.f2260Ujhhgtgfeyxiexzf = c3407Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IOException {
        ArrayList arrayList;
        StringBuilder sb;
        char c;
        ArrayList arrayList2;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf;
        StringBuilder sb2;
        int i = this.f2258Ujhhgtgfeyxiexzf;
        char c2 = '(';
        char c3 = ')';
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf2 = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        final C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf = this.f2260Ujhhgtgfeyxiexzf;
        final String str = this.f2259Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0421Ujhhgtgfeyxiexzf c0421Ujhhgtgfeyxiexzf = new C0421Ujhhgtgfeyxiexzf(str, c3407Ujhhgtgfeyxiexzf, 1);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c0421Ujhhgtgfeyxiexzf, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                return c1943Ujhhgtgfeyxiexzf2;
            case 1:
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = MagicFactory.get(4928867506401052042L, strArr);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Cursor cursorM5194feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11711Ujhhgtgfeyxiexzf, EnumC3684feyxiexzfUjhhgtg.f11712Ujhhgtgfeyxiexzf});
                if (cursorM5194feyxiexzfUjhhgtg != null) {
                    while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
                        try {
                            if (cursorM5194feyxiexzfUjhhgtg.getString(cursorM5194feyxiexzfUjhhgtg.getColumnIndex(MagicFactory.get(4928867609480267146L, strArr))).endsWith(MagicFactory.get(4928867570825561482L, strArr))) {
                                GroupInfo groupInfoM1316Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1316Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String roomId = groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(groupInfoM1316Ujhhgtgfeyxiexzf.getName());
                                String remark = groupInfoM1316Ujhhgtgfeyxiexzf.getRemark();
                                if (remark.length() <= 0) {
                                    remark = null;
                                }
                                if (remark != null) {
                                    sb3.append(c2 + remark + ')');
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(c2);
                                sb4.append(groupInfoM1316Ujhhgtgfeyxiexzf.getGroupData().getMemberCount());
                                sb4.append(')');
                                sb3.append(sb4.toString());
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = new C3663feyxiexzfUjhhgtg(roomId, sb3.toString(), groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId(), false);
                                arrayList5.add(c3663feyxiexzfUjhhgtg);
                                arrayList4.add(c3663feyxiexzfUjhhgtg);
                                arrayList2 = arrayList5;
                                c = c2;
                            } else {
                                FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String wxid = friendInfoM1315Ujhhgtgfeyxiexzf.getWxid();
                                StringBuilder sb5 = new StringBuilder();
                                String nickname = friendInfoM1315Ujhhgtgfeyxiexzf.getNickname();
                                ArrayList arrayList6 = arrayList5;
                                if ((AbstractC1119feyxiexzfUjhhgtg.m2589feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928866565803214218L, strArr)), nickname)) > 3 ? nickname : null) != null) {
                                    sb5.append(MagicFactory.get(4928866535738443146L, strArr));
                                    arrayList3 = arrayList3;
                                } else {
                                    String str2 = nickname.length() > 8 ? nickname : null;
                                    if (str2 != null) {
                                        String strSubstring = str2.substring(0, 8);
                                        MagicFactory.get(4928866630227723658L, strArr);
                                        sb5.append(strSubstring);
                                        sb5.append(MagicFactory.get(4928866703242167690L, strArr));
                                        sb = sb5;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb5.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM1315Ujhhgtgfeyxiexzf.getRemark();
                                if (remark2.length() <= 0) {
                                    remark2 = null;
                                }
                                if (remark2 != null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    c = '(';
                                    sb6.append('(');
                                    sb6.append(remark2);
                                    sb6.append(')');
                                    sb5.append(sb6.toString());
                                } else {
                                    c = '(';
                                }
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg2 = new C3663feyxiexzfUjhhgtg(wxid, sb5.toString(), friendInfoM1315Ujhhgtgfeyxiexzf.getWxid(), false);
                                arrayList2 = arrayList6;
                                arrayList2.add(c3663feyxiexzfUjhhgtg2);
                                arrayList3 = arrayList3;
                                arrayList3.add(c3663feyxiexzfUjhhgtg2);
                            }
                            c2 = c;
                            arrayList5 = arrayList2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg, th);
                                throw th2;
                            }
                        }
                    }
                    arrayList = arrayList5;
                    cursorM5194feyxiexzfUjhhgtg.close();
                } else {
                    arrayList = arrayList5;
                }
                c3678feyxiexzfUjhhgtg.m5371Ujhhgtgfeyxiexzf(arrayList);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928866686062298506L, strArr), arrayList3);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928866673177396618L, strArr), arrayList4);
                c3678feyxiexzfUjhhgtg.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_send_24dp;
                String str3 = MagicFactory.get(4928866797731448202L, strArr);
                final int i2 = 0;
                InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg = new InterfaceC3553feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛲ
                    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
                    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
                    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj2, Object obj3) throws IllegalAccessException, IOException, InvocationTargetException {
                        List list = (List) obj2;
                        switch (i2) {
                            case 0:
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf.f10618Ujhhgtgfeyxiexzf, ((C3663feyxiexzfUjhhgtg) it.next()).f11657Ujhhgtgfeyxiexzf, str);
                                }
                                StringBuilder sb7 = new StringBuilder();
                                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                sb7.append(MagicFactory.get(4928867545055757706L, strArr2));
                                sb7.append(list.size());
                                sb7.append(MagicFactory.get(4928867523580921226L, strArr2));
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb7.toString());
                                break;
                            default:
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf.f10618Ujhhgtgfeyxiexzf, ((C3663feyxiexzfUjhhgtg) it2.next()).f11657Ujhhgtgfeyxiexzf, str);
                                }
                                StringBuilder sb8 = new StringBuilder();
                                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                sb8.append(MagicFactory.get(4928870607367439754L, strArr3));
                                sb8.append(list.size());
                                sb8.append(MagicFactory.get(4928870723331556746L, strArr3));
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb8.toString());
                                break;
                        }
                        return Boolean.FALSE;
                    }
                };
                c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str3;
                c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg;
                return c1943Ujhhgtgfeyxiexzf2;
            case 2:
                C0421Ujhhgtgfeyxiexzf c0421Ujhhgtgfeyxiexzf2 = new C0421Ujhhgtgfeyxiexzf(str, c3407Ujhhgtgfeyxiexzf, 3);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf2 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c0421Ujhhgtgfeyxiexzf2, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                return c1943Ujhhgtgfeyxiexzf2;
            default:
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg2 = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg2.f11695Ujhhgtgfeyxiexzf = MagicFactory.get(4928870706151687562L, strArr2);
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                Cursor cursorM5194feyxiexzfUjhhgtg2 = AbstractC3594Ujhhgtgfeyxiexzf.m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11711Ujhhgtgfeyxiexzf, EnumC3684feyxiexzfUjhhgtg.f11712Ujhhgtgfeyxiexzf});
                if (cursorM5194feyxiexzfUjhhgtg2 != null) {
                    while (cursorM5194feyxiexzfUjhhgtg2.moveToNext()) {
                        try {
                            C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf3 = c1943Ujhhgtgfeyxiexzf2;
                            if (cursorM5194feyxiexzfUjhhgtg2.getString(cursorM5194feyxiexzfUjhhgtg2.getColumnIndex(MagicFactory.get(4928870671791949194L, strArr2))).endsWith(MagicFactory.get(4928870770576197002L, strArr2))) {
                                GroupInfo groupInfoM1316Ujhhgtgfeyxiexzf2 = AbstractC0217Ujhhgtgfeyxiexzf.m1316Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg2);
                                String roomId2 = groupInfoM1316Ujhhgtgfeyxiexzf2.getRoomId();
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(groupInfoM1316Ujhhgtgfeyxiexzf2.getName());
                                String remark3 = groupInfoM1316Ujhhgtgfeyxiexzf2.getRemark();
                                if (remark3.length() <= 0) {
                                    remark3 = null;
                                }
                                if (remark3 != null) {
                                    sb7.append('(' + remark3 + c3);
                                }
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append('(');
                                sb8.append(groupInfoM1316Ujhhgtgfeyxiexzf2.getGroupData().getMemberCount());
                                sb8.append(c3);
                                sb7.append(sb8.toString());
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg3 = new C3663feyxiexzfUjhhgtg(roomId2, sb7.toString(), groupInfoM1316Ujhhgtgfeyxiexzf2.getRoomId(), false);
                                arrayList9.add(c3663feyxiexzfUjhhgtg3);
                                arrayList8.add(c3663feyxiexzfUjhhgtg3);
                            } else {
                                FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf2 = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg2);
                                String wxid2 = friendInfoM1315Ujhhgtgfeyxiexzf2.getWxid();
                                StringBuilder sb9 = new StringBuilder();
                                String nickname2 = friendInfoM1315Ujhhgtgfeyxiexzf2.getNickname();
                                if ((AbstractC1119feyxiexzfUjhhgtg.m2589feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928870727626524042L, strArr2)), nickname2)) > 3 ? nickname2 : null) != null) {
                                    sb9.append(MagicFactory.get(4928870835000706442L, strArr2));
                                    wxid2 = wxid2;
                                } else {
                                    String str4 = nickname2.length() > 8 ? nickname2 : null;
                                    if (str4 != null) {
                                        String strSubstring2 = str4.substring(0, 8);
                                        MagicFactory.get(4928870929489986954L, strArr2);
                                        sb9.append(strSubstring2);
                                        sb9.append(MagicFactory.get(4928870865065477514L, strArr2));
                                        sb2 = sb9;
                                    } else {
                                        sb2 = null;
                                    }
                                    if (sb2 == null) {
                                        sb9.append(nickname2);
                                    }
                                }
                                String remark4 = friendInfoM1315Ujhhgtgfeyxiexzf2.getRemark();
                                if (remark4.length() <= 0) {
                                    remark4 = null;
                                }
                                if (remark4 != null) {
                                    sb9.append('(' + remark4 + ')');
                                }
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg4 = new C3663feyxiexzfUjhhgtg(wxid2, sb9.toString(), friendInfoM1315Ujhhgtgfeyxiexzf2.getWxid(), false);
                                arrayList9.add(c3663feyxiexzfUjhhgtg4);
                                arrayList7.add(c3663feyxiexzfUjhhgtg4);
                            }
                            c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf3;
                            c3 = ')';
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg2, th3);
                                throw th4;
                            }
                        }
                    }
                    c1943Ujhhgtgfeyxiexzf = c1943Ujhhgtgfeyxiexzf2;
                    cursorM5194feyxiexzfUjhhgtg2.close();
                } else {
                    c1943Ujhhgtgfeyxiexzf = c1943Ujhhgtgfeyxiexzf2;
                }
                c3678feyxiexzfUjhhgtg2.m5371Ujhhgtgfeyxiexzf(arrayList9);
                c3678feyxiexzfUjhhgtg2.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928869885812934026L, strArr2), arrayList7);
                c3678feyxiexzfUjhhgtg2.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928869872928032138L, strArr2), arrayList8);
                c3678feyxiexzfUjhhgtg2.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_send_24dp;
                String str5 = MagicFactory.get(4928869860043130250L, strArr2);
                final int i3 = 1;
                InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg2 = new InterfaceC3553feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛲ
                    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
                    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
                    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj2, Object obj3) throws IllegalAccessException, IOException, InvocationTargetException {
                        List list = (List) obj2;
                        switch (i3) {
                            case 0:
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf.f10618Ujhhgtgfeyxiexzf, ((C3663feyxiexzfUjhhgtg) it.next()).f11657Ujhhgtgfeyxiexzf, str);
                                }
                                StringBuilder sb10 = new StringBuilder();
                                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                sb10.append(MagicFactory.get(4928867545055757706L, strArr3));
                                sb10.append(list.size());
                                sb10.append(MagicFactory.get(4928867523580921226L, strArr3));
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb10.toString());
                                break;
                            default:
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf.f10618Ujhhgtgfeyxiexzf, ((C3663feyxiexzfUjhhgtg) it2.next()).f11657Ujhhgtgfeyxiexzf, str);
                                }
                                StringBuilder sb11 = new StringBuilder();
                                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                sb11.append(MagicFactory.get(4928870607367439754L, strArr4));
                                sb11.append(list.size());
                                sb11.append(MagicFactory.get(4928870723331556746L, strArr4));
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb11.toString());
                                break;
                        }
                        return Boolean.FALSE;
                    }
                };
                c3678feyxiexzfUjhhgtg2.f11699Ujhhgtgfeyxiexzf = str5;
                c3678feyxiexzfUjhhgtg2.f11701Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg2;
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
