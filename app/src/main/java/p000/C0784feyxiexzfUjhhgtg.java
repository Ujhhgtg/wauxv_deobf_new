package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ要点脸能不能ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0784feyxiexzfUjhhgtg implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3086Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f3087Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0784feyxiexzfUjhhgtg(int i, Object obj) {
        this.f3086Ujhhgtgfeyxiexzf = i;
        this.f3087Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[LOOP:0: B:26:0x006a->B:37:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[LOOP:2: B:43:0x00a5->B:54:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0030 A[SYNTHETIC] */
    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object next;
        String str;
        C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.f3086Ujhhgtgfeyxiexzf) {
            case 0:
                ConversationBean conversationBean = (ConversationBean) this.f3087Ujhhgtgfeyxiexzf;
                List list = (List) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str5 = ((C3663feyxiexzfUjhhgtg) it.next()).f11657Ujhhgtgfeyxiexzf;
                    List listSingletonList = Collections.singletonList(conversationBean.getUsername());
                    C0462Ujhhgtgfeyxiexzf.f2365Ujhhgtgfeyxiexzf.getClass();
                    C1345feyxiexzfUjhhgtg.m2866feyxiexzfUjhhgtg(C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C0459Ujhhgtgfeyxiexzf.f2362Ujhhgtgfeyxiexzf).newInstance(str5, listSingletonList, 0, null));
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                sb.append(MagicFactory.get(4928843093806941578L, strArr));
                sb.append(list.size());
                sb.append(MagicFactory.get(4928843072332105098L, strArr));
                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb.toString());
                return Boolean.FALSE;
            case 1:
                int iM2630feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2630feyxiexzfUjhhgtg((CharSequence) obj, (char[]) this.f3087Ujhhgtgfeyxiexzf, ((Integer) obj2).intValue(), false);
                if (iM2630feyxiexzfUjhhgtg < 0) {
                    return null;
                }
                return new C1381feyxiexzfUjhhgtg(Integer.valueOf(iM2630feyxiexzfUjhhgtg), 1);
            default:
                List list2 = (List) this.f3087Ujhhgtgfeyxiexzf;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (list2.size() == 1) {
                    int size = list2.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str6 = (String) list2.get(0);
                    int iM2629feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2629feyxiexzfUjhhgtg(charSequence, str6, iIntValue, false, 4);
                    if (iM2629feyxiexzfUjhhgtg < 0) {
                        c1381feyxiexzfUjhhgtg = null;
                    } else {
                        c1381feyxiexzfUjhhgtg = new C1381feyxiexzfUjhhgtg(Integer.valueOf(iM2629feyxiexzfUjhhgtg), str6);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf = new C0682Ujhhgtgfeyxiexzf(iIntValue, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i = c0682Ujhhgtgfeyxiexzf.f2807Ujhhgtgfeyxiexzf;
                    int i2 = c0682Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf;
                    if (z) {
                        if ((i <= 0 || iIntValue > i2) && (i >= 0 || i2 > iIntValue)) {
                            c1381feyxiexzfUjhhgtg = null;
                        } else {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c1381feyxiexzfUjhhgtg = new C1381feyxiexzfUjhhgtg(Integer.valueOf(iIntValue), str3);
                                    } else if (iIntValue != i2) {
                                        iIntValue += i;
                                    } else {
                                        c1381feyxiexzfUjhhgtg = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c1381feyxiexzfUjhhgtg = new C1381feyxiexzfUjhhgtg(Integer.valueOf(iIntValue), str3);
                                } else if (iIntValue != i2) {
                                    iIntValue += i;
                                } else {
                                    c1381feyxiexzfUjhhgtg = null;
                                }
                            }
                        }
                    } else if ((i <= 0 || iIntValue > i2) && (i >= 0 || i2 > iIntValue)) {
                        c1381feyxiexzfUjhhgtg = null;
                    } else {
                        int i3 = iIntValue;
                        while (true) {
                            Iterator it3 = list2.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c1381feyxiexzfUjhhgtg = new C1381feyxiexzfUjhhgtg(Integer.valueOf(i3), str);
                                } else if (i3 != i2) {
                                    i3 += i;
                                } else {
                                    c1381feyxiexzfUjhhgtg = null;
                                }
                            } while (!AbstractC1152feyxiexzfUjhhgtg.m2635feyxiexzfUjhhgtg(str2, 0, charSequence, i3, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                c1381feyxiexzfUjhhgtg = new C1381feyxiexzfUjhhgtg(Integer.valueOf(i3), str);
                            } else if (i3 != i2) {
                                i3 += i;
                            } else {
                                c1381feyxiexzfUjhhgtg = null;
                            }
                        }
                    }
                }
                if (c1381feyxiexzfUjhhgtg != null) {
                    return new C1381feyxiexzfUjhhgtg(c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf, Integer.valueOf(((String) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).length()));
                }
                return null;
        }
    }
}
